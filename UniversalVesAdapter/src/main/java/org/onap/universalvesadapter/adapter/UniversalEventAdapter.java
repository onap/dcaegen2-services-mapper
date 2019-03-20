/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018-2019 TechMahindra
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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PreDestroy;

import org.milyn.Smooks;
import org.onap.dcaegen2.ves.domain.ves70.VesEvent;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.VESAdapterInitializer;
import org.onap.universalvesadapter.utils.CollectorConfigPropertyRetrival;
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
	 private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	 private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	 
	@Value("${defaultConfigFilelocation}")
	private String defaultConfigFilelocation;
	private String collectorIdentifierValue;
	private String collectorIdentifierKey;
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
	public String transform(String incomingJsonString)
			throws  ConfigFileSmooksConversionException, VesException {
		String result = "";
		String configFileData;
		
		String identifier[]= CollectorConfigPropertyRetrival.getProperyArray("identifier",defaultConfigFilelocation );
		String defaultMappingFile="defaultMappingFile-"+Thread.currentThread().getName();
		try {

				Gson gson = new Gson();
				JsonObject body = gson.fromJson(incomingJsonString, JsonObject.class);
				
				JsonElement results;
				for(int i=0;i<identifier.length;i++)
				{
				JsonObject obj;
				if((obj=keyObject(body,identifier[i])).has(identifier[i]))
				{
					collectorIdentifierKey=identifier[i];
					 results=obj.get(identifier[i]);
					 collectorIdentifierValue=results.getAsString();
					
				}
				
				}
				//collectorIdentifierValue = collectorIdentifierValue.substring(0, collectorIdentifierValue.length() - 4);
				if(collectorIdentifierKey.equals("notify OID"))
				{
					collectorIdentifierValue = collectorIdentifierValue.substring(0, collectorIdentifierValue.length() - 4);
				}
				

				if (VESAdapterInitializer.getMappingFiles().containsKey(collectorIdentifierValue)) {
					configFileData = VESAdapterInitializer.getMappingFiles().get(collectorIdentifierValue);
					debugLogger.debug("Using Mapping file as Mapping file is available for collector identifier:{}",collectorIdentifierValue);
				
				} else {

					configFileData = VESAdapterInitializer.getMappingFiles().get(defaultMappingFile);
					
					debugLogger.debug("Using Default Mapping file as Mapping file is not available for Enterprise Id:{}",collectorIdentifierValue);
				}

				Smooks smooksTemp = new Smooks(new ByteArrayInputStream(configFileData.getBytes(StandardCharsets.UTF_8)));
				eventToSmooksMapping.put(collectorIdentifierKey, smooksTemp);

			VesEvent vesEvent = SmooksUtils.getTransformedObjectForInput(smooksTemp,incomingJsonString);
			debugLogger.info("Incoming json transformed to VES format successfully:"+Thread.currentThread().getName());
			ObjectMapper objectMapper = new ObjectMapper();
			result = objectMapper.writeValueAsString(vesEvent);
			debugLogger.info("Serialized VES json");
		} catch (JsonProcessingException exception) {
			throw new VesException("Unable to convert pojo to VES format, Reason :{}", exception);
		} catch (SAXException | IOException exception) {
			//Invalid Mapping file
			exception.printStackTrace();
			errorLogger.error("Dropping this Trap :{},Reason:{}", incomingJsonString, exception.getMessage()); 

		} catch (JsonSyntaxException exception) {
			// Invalid Trap
			errorLogger.error("Dropping this Invalid json Trap :{},  Reason:{}", incomingJsonString, exception);
		}catch (JsonParseException exception) {
			// Invalid Trap
			errorLogger.error("Dropping this Invalid json Trap :{},  Reason:{}", incomingJsonString, exception);
		} 
		catch (RuntimeException exception) {

			exception.printStackTrace();
			errorLogger.error("Dropping this Trap :{},Reason:{}", incomingJsonString, exception.getMessage());

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
	
	public JsonObject keyObject(JsonObject  object, String searchedKey) {
	    boolean exists = object.has(searchedKey);
	    JsonObject jsonObject = object;
	   
	    if(!exists) {      
	        Iterator<?> keys = object.keySet().iterator();
	        while( keys.hasNext() ) {
	            String key = (String)keys.next();
	            if ( object.get(key) instanceof JsonObject ) {
	            	 
	            	jsonObject=(JsonObject) object.get(key);
	            	JsonObject   obj = keyObject(jsonObject, searchedKey);
	            	exists = obj.has(searchedKey);
	            }
	        }
	    }
	    
	    return jsonObject;
	}

}
