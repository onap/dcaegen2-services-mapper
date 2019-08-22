/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.api.CbsRequests;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.model.CbsRequest;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.model.EnvProperties;
import org.onap.dcaegen2.services.sdk.rest.services.model.logging.RequestDiagnosticContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FetchDynamicConfig {

	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	private static String url;
	public static String retString;
	public static String retCBSString;

	// Generate RequestID and InvocationID which will be used when logging and in
	// HTTP requests
	final RequestDiagnosticContext diagnosticContext = RequestDiagnosticContext.create();
	final CbsRequest request = CbsRequests.getConfiguration(diagnosticContext);

	// Read necessary properties from the environment
	static final EnvProperties env = EnvProperties.fromEnvironment();

	public FetchDynamicConfig() {
	}

	public static void cbsCall(String configFile) {

		Boolean areEqual;
		// Call consul api and identify the CBS Service address and port
		getconsul();
		// Construct and invoke CBS API to get application Configuration
		getCBS();
		// Verify if data has changed
		areEqual = verifyConfigChange(configFile);

		if (!areEqual) {
			FetchDynamicConfig fc = new FetchDynamicConfig();
			fc.writefile(retCBSString, configFile);
		} else {
			debugLogger.info("New config pull results identical -  " + configFile + " NOT refreshed");
		}
	}

	private static void getconsul() {
		url = env.consulHost() + ":8500/v1/catalog/service/" + env.cbsName();
		retString = executecurl(url);
		debugLogger.info("CBS details fetched from Consul");
	}

	public static boolean verifyConfigChange(String configFile) {

		boolean areEqual = false;
		// Read current data
		try {

			File f = new File(ClassLoader.getSystemResource(configFile.trim()).getFile());

			if (f.exists() && !f.isDirectory()) {
				debugLogger.info("Comparing local configuration with the configuration fethed from CBS ");

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
		debugLogger.info("CONFIG_BINDING_SERVICE HOST:PORT is " + urlPart1);

		if (env.appName() != null) {
			url = urlPart1 + "/service_component/" + env.appName();
			retCBSString = executecurl(url);
			debugLogger.info("Configuration fetched from CBS successfully..");
		} /*
			 * else if (env.containsKey("SERVICE_NAME")) { url = urlPart1 +
			 * "/service_component/" + env.get("SERVICE_NAME"); retCBSString =
			 * executecurl(url);
			 * debugLogger.info("Configuration fetched from CBS successfully.."); }
			 */ else {
			errorLogger.error("Service name environment variable - APP_NAME/SERVICE_NAME not found within container ");
		}

	}

	public void writefile(String retCBSString, String configFile) {

		String indentedretstring = (new JSONObject(retCBSString)).toString(4);
		try {
			debugLogger.info(
					"Overwriting local configuration file " + configFile + " with configuartions received from CBS");

			File file2 = ResourceUtils.getFile("classpath:" + configFile);
			FileWriter fstream = new FileWriter(file2, false);
			PrintWriter printWriter = new PrintWriter(fstream);
			printWriter.print(indentedretstring);
			printWriter.close();
			fstream.close();

			debugLogger.info("New Config successfully written to local file to " + configFile);
		} catch (IOException e) {
			errorLogger.error(
					"Error in writing configuration into local KV file " + configFile + retString + e.getMessage());
			e.printStackTrace();
		}

	}

	public static String readFile(String configFileName) {
		String content = null;
		File file = null;

		try {
			file = ResourceUtils.getFile("classpath:" + configFileName);
			content = new String(Files.readAllBytes(file.toPath()));
		} catch (FileNotFoundException e) {
			errorLogger.error("colud not find file :", configFileName);

		} catch (IOException e) {
			errorLogger.error("unable to read the file , reason:", e.getCause());
		} catch (Exception e) {
			errorLogger.error("Exception occured , reason:", e.getMessage());
		}

		return content;

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
			reader.close();
			ipr.close();
		} catch (IOException e) {
			errorLogger.error("error", e);
			e.printStackTrace();
		}
		return result;

	}

}
