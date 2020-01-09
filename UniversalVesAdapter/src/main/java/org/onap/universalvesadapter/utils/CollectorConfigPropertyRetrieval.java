/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2018-2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.universalvesadapter.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CollectorConfigPropertyRetrieval {

	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	private static JSONArray array;
	@Autowired
	private DmaapConfig dmaapConfig;

	public static JSONArray collectorConfigArray(String configFile) {
		try {
			JSONParser parser = new JSONParser();
			String content = readFile(configFile);
			JSONObject obj = (JSONObject) parser.parse(content);
			JSONObject appobj = (JSONObject) obj.get("app_preferences");
			array = (JSONArray) appobj.get("collectors");

			debugLogger.info("Retrieved JsonArray from Collector Config File");

		} catch (ParseException e) {
			errorLogger.error("ParseException occured at position:", e);
		}

		return array;

	}

	public static String[] getProperyArray(String propertyName, String defaultConfigFilelocation) {
		JSONArray jsonArray = collectorConfigArray(defaultConfigFilelocation);

		String[] propertyArray = new String[jsonArray.size()];

		for (int k = 0; k < jsonArray.size(); k++) {

			JSONObject collJson = (JSONObject) jsonArray.get(k);

			propertyArray[k] = (String) collJson.get(propertyName);
		}
		debugLogger.info("returning {} array from Collector Config", propertyName);
		return propertyArray;

	}

	public Map<String, String> getDmaapTopics(String subscriber, String publisher, String defaultConfigFilelocation) {
		JSONArray jsonArray = collectorConfigArray(defaultConfigFilelocation);

		Map<String, String> dmaapTopics = new HashMap<>();

		for (int k = 0; k < jsonArray.size(); k++) {

			JSONObject collJson = (JSONObject) jsonArray.get(k);

			dmaapTopics.put(collJson.get(subscriber).toString(), collJson.get(publisher).toString());

		}
		debugLogger.info("returning Dmaap topics from Collector Config");
		return dmaapTopics;

	}

	public Map<String, String> getTopics(String subscriber, String publisher, String defaultConfigFilelocation) {
		Map<String, String> dmaapTopics = new HashMap<>();

		try {

			ObjectMapper objectMapper = new ObjectMapper();
			String content = readFile(defaultConfigFilelocation);
			// read JSON like DOM Parser
			JsonNode rootNode = objectMapper.readTree(content);
			JsonNode subscriberUrl = rootNode.path("streams_subscribes").path(subscriber).path("dmaap_info")
					.path("topic_url");
			JsonNode publisherUrl = rootNode.path("streams_publishes").path(publisher).path("dmaap_info")
					.path("topic_url");

			dmaapTopics.put(getTopicName(subscriberUrl.asText()), getTopicName(publisherUrl.asText()));
			setDmaapConfig(subscriberUrl.asText());
		} catch (IOException ex) {
			errorLogger.error("IOException occured:", ex);
		} catch (URISyntaxException e) {
			errorLogger.error("Invalid URI :", e);
		}

		return dmaapTopics;
	}

	public String getTopicName(String url) throws URISyntaxException {
		URI uri = new URI(url);
		String path = uri.getPath();
		String idStr = path.substring(path.lastIndexOf('/') + 1);
		return idStr;
	}

	public void setDmaapConfig(String url) throws URISyntaxException {
		URI uri = new URI(url);
		dmaapConfig.setDmaaphost(uri.getHost());
		dmaapConfig.setDEFAULT_PORT_NUMBER(uri.getPort());
	}

	public static String readFile(String configFileName) {
		String content = null;

		try {
			content = FileUtils.readFile(configFileName);
		} catch (FileNotFoundException e) {
			errorLogger.error("could not find file :", configFileName);

		} catch (IOException e) {
			errorLogger.error("unable to read the file, reason:", e.getCause());
		}

		return content;

	}
}
