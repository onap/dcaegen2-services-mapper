/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018 TechMahindra
*=================================================================================
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ============LICENSE_END=========================================================
*/
package org.onap.universalvesadapter.adapter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PreDestroy;
import org.milyn.Smooks;
import org.onap.dcaegen2.ves.domain.VesEvent;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.VESAdapterInitializer;
import org.onap.universalvesadapter.utils.SmooksUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;

/**
 * Default implementation of the Generic Adapter
 * 
 * @author kmalbari
 *
 */

@Component
public class UniversalEventAdapter implements GenericAdapter {

	private static final Logger metricsLogger = LoggerFactory.getLogger("metricsLogger");
	 private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	 private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	private String enterpriseId;
	@Value("${defaultEnterpriseId}")
	private String defaultEnterpriseId;
	private Map<String, Smooks> eventToSmooksMapping = new ConcurrentHashMap<>();

	public UniversalEventAdapter() {

	}

	/**
	 * transforms JSON to VES format and and returns the ves Event
	 * 
	 * @param IncomingJason,eventType
	 * @return ves Event
	 */
	@Override
	public String transform(String incomingJsonString, String eventType)
			throws  ConfigFileSmooksConversionException, VesException {
		String result = "";
		String configFileData;
		try {

				Gson gson = new Gson();
				JsonObject body = gson.fromJson(incomingJsonString, JsonObject.class);
				JsonElement results = body.get("notify OID");
				String notifyOid = results.getAsString();

				// extracting enterprise id from notify OID of SNMP trap.
				enterpriseId = notifyOid.substring(0, notifyOid.length() - 4);

				if (VESAdapterInitializer.getMappingFiles().containsKey(enterpriseId)) {
					configFileData = VESAdapterInitializer.getMappingFiles().get(enterpriseId);
					debugLogger.debug("Using Mapping file as Mapping file is available for Enterprise Id:{}",enterpriseId);
				} else {

					configFileData = VESAdapterInitializer.getMappingFiles().get(defaultEnterpriseId);
					debugLogger.debug("Using Default Mapping file as Mapping file is not available for Enterprise Id:{}",enterpriseId);
				}

				Smooks smooksTemp = new Smooks(new ByteArrayInputStream(configFileData.getBytes(StandardCharsets.UTF_8)));
				eventToSmooksMapping.put(eventType, smooksTemp);

			VesEvent vesEvent = SmooksUtils.getTransformedObjectForInput(smooksTemp,incomingJsonString);
			debugLogger.info("Incoming json transformed to VES format successfully");
			ObjectMapper objectMapper = new ObjectMapper();
			result = objectMapper.writeValueAsString(vesEvent);
			debugLogger.info("Serialized VES json");
		} catch (JsonProcessingException exception) {
			throw new VesException("Unable to convert pojo to VES format, Reason :{}", exception);
		} catch (SAXException | IOException exception) {
			//Invalid Mapping file
			errorLogger.error("Dropping this Trap :{},Reason:{}", incomingJsonString, exception); 

		} catch (JsonSyntaxException exception) {
			// Invalid Trap
			errorLogger.error("Dropping this Invalid json Trap :{},  Reason:{}", incomingJsonString, exception);
		}catch (JsonParseException exception) {
			// Invalid Trap
			errorLogger.error("Dropping this Invalid json Trap :{},  Reason:{}", incomingJsonString, exception);
		} 
		catch (RuntimeException exception) {

			errorLogger.error("Dropping this Trap :{},Reason:{}", incomingJsonString, exception);

		}
		return result;
	}

	/**
	 * Closes all open smooks' instances before bean is destroyed
	 */
	@PreDestroy
	public void destroy() {
		for (Smooks smooks : eventToSmooksMapping.values())
			smooks.close();
		debugLogger.warn("All Smooks objects closed");
	}

}
