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
package org.onap.universalvesadapter.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchDynamicConfig {

	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	// need to change below path
	public static String configFile = "/opt/app/VESAdapter/conf/mapper.properties";
	//public static String configFile = "src\\main\\resources\\kv.json";
	private static String url;
	public static String retString;
	public static String retCBSString;
	private static Map<String, String> env;

	public FetchDynamicConfig() {
	}

	public static void cbsCall() {

		env = System.getenv();
		Boolean areEqual;
		// Call consul api and identify the CBS Service address and port
		getconsul();
		// Construct and invoke CBS API to get application Configuration
		getCBS();
		// Verify if data has changed
		areEqual = verifyConfigChange();

		if (!areEqual) {
			FetchDynamicConfig fc = new FetchDynamicConfig();
			fc.writefile(retCBSString);
		} else {
			debugLogger.info("New config pull results identical -  " + configFile + " NOT refreshed");
		}
	}

	
	private static void getconsul() {
		url = env.get("CONSUL_HOST") + ":8500/v1/catalog/service/" + env.get("CONFIG_BINDING_SERVICE");

		// for testing :url="10.12.6.50:8500/v1/catalog/service/config_binding_service";
		//http://10.12.6.44:8500/v1/catlog/service/config_binding_service

		retString = executecurl(url);
		debugLogger.info("CBS details fetched from Consul");
	
	}

	public static boolean verifyConfigChange() {

		boolean areEqual = false;
		// Read current data
		try {
			File f = new File(configFile);
			if (f.exists() && !f.isDirectory()) {

				String jsonData = readFile(configFile);
				JSONObject jsonObject = new JSONObject(jsonData);

				ObjectMapper mapper = new ObjectMapper();

				JsonNode tree1 = mapper.readTree(jsonObject.toString());
				JsonNode tree2 = mapper.readTree(retCBSString);
				areEqual = tree1.equals(tree2);
				debugLogger.info("Comparison value:" + areEqual);
			} else {
				debugLogger.info("First time config file read: " + configFile);
			}

		} catch (IOException e) {
			errorLogger.error("Comparison with new fetched data failed" + e.getMessage());

		}

		return areEqual;

	}

	public static void getCBS() {

		// consul return as array
		JSONTokener temp = new JSONTokener(retString);
		JSONObject cbsjobj = (JSONObject) new JSONArray(temp).get(0);

		String urlPart1 = null;
		if (cbsjobj.has("ServiceAddress") && cbsjobj.has("ServicePort")) {

			urlPart1 = cbsjobj.getString("ServiceAddress") + ":" + cbsjobj.getInt("ServicePort");
			
		}
		debugLogger.info("CONFIG_BINDING_SERVICE DNS RESOLVED:" + urlPart1);
		
		if (env.containsKey("HOSTNAME")) {
			url = urlPart1 + "/service_component/" + env.get("HOSTNAME");
			retCBSString = executecurl(url);
		} else if (env.containsKey("SERVICE_NAME")) {
			url = urlPart1 + "/service_component/" + env.get("SERVICE_NAME");
			retCBSString = executecurl(url);
		} else {
			errorLogger.error("Service name environment variable - HOSTNAME/SERVICE_NAME not found within container ");
		}

	}

	public void writefile(String retCBSString) {
		debugLogger.info("URL to fetch configuration:" + url);

		String indentedretstring = (new JSONObject(retCBSString)).toString(4);

		try (FileWriter file = new FileWriter(FetchDynamicConfig.configFile)) {
			file.write(indentedretstring);

			debugLogger.info("Successfully Copied JSON Object to file " + configFile);
		} catch (IOException e) {
			errorLogger.error("Error in writing configuration into file " + configFile + retString + e.getMessage());
			e.printStackTrace();
		}

	}

	public static String readFile(String filename) {
		String result = "";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
		} catch (FileNotFoundException e) {
			errorLogger.error("colud not find file :",filename);
			
		} catch (Exception e) {
			errorLogger.error("unable to read the file , reason:",e.getCause());
		} 
		return result;
	}
	private static String executecurl(String url) {

		String[] command = { "curl", "-v", url };
		ProcessBuilder process = new ProcessBuilder(command);
		Process p;
		String result = null;
		try {
			p = process.start();
			InputStreamReader ipr = new InputStreamReader(p.getInputStream());
			BufferedReader reader = new BufferedReader(ipr);
			StringBuilder builder = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
			result = builder.toString();
			debugLogger.info(result);

			reader.close();
			ipr.close();
		} catch (IOException e) {
			errorLogger.error("error", e);
			e.printStackTrace();
		}
		return result;

	}

}
