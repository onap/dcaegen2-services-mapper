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

package org.onap.universalvesadapter.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.api.CbsClientFactory;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.api.CbsRequests;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.model.CbsRequest;
import org.onap.dcaegen2.services.sdk.rest.services.cbs.client.model.EnvProperties;
import org.onap.dcaegen2.services.sdk.rest.services.model.logging.RequestDiagnosticContext;
import org.onap.universalvesadapter.utils.CollectorConfigPropertyRetrival;
import org.onap.universalvesadapter.utils.FetchDynamicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

// AdapterInitializer
@Component
public class VESAdapterInitializer implements CommandLineRunner, Ordered {
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	@Value("${defaultConfigFilelocation}")
	String defaultConfigFilelocation;
	@Value("${server.port}")
	String serverPort;

	private static Map<String, String> mappingFiles = new HashMap<String, String>();

	// Generate RequestID and InvocationID which will be used when logging and in
	// HTTP requests
	final RequestDiagnosticContext diagnosticContext = RequestDiagnosticContext.create();
	final CbsRequest request = CbsRequests.getConfiguration(diagnosticContext);

	// Read necessary properties from the environment
	final EnvProperties env = EnvProperties.fromEnvironment();

	// Polling properties :
	final Duration initialDelay = Duration.ofSeconds(5);
	final Duration period = Duration.ofMinutes(1);

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void run(String... args) throws Exception {
		debugLogger.info("The Default Config file Location:" + defaultConfigFilelocation.trim());

		if (ClassLoader.getSystemResource(defaultConfigFilelocation.trim()) == null) {
			errorLogger.error("Default Config file " + defaultConfigFilelocation.trim() + " is missing");
			System.exit(SpringApplication.exit(applicationContext, () -> {
				errorLogger.error("Application stoped due to missing default Config file");
				return -1;
			}));
		}

		// Create the client and use it to get the configuration
		CbsClientFactory.createCbsClient(env).flatMapMany(cbsClient -> cbsClient.updates(request, initialDelay, period))
				.subscribe(jsonObject -> {

					// If env details not fetched static configuration file will be used
					if (env.consulHost() != null && env.cbsName() != null && env.appName() != null) {
						debugLogger.info(">>>Dynamic configuration to be used");
						FetchDynamicConfig.cbsCall(defaultConfigFilelocation);
					}

					readJsonToMap(defaultConfigFilelocation);

					debugLogger.info("Triggering controller's start url ");
					fetchResultFromDestination("http://localhost:" + serverPort + "/start");

				}, throwable -> {
					debugLogger.warn("Cannot Connect", throwable);
				});

	}

	/**
	 * gets the configuration details from JSON an puts those in the mapping data
	 * structure for further processing.
	 * 
	 * @param configFile: String
	 */
	private void readJsonToMap(String configFile) {
		try {
			JSONArray collectorArray = CollectorConfigPropertyRetrival.collectorConfigArray(configFile);

			for (int i = 0; i < collectorArray.size(); i++) {
				JSONObject obj2 = (JSONObject) collectorArray.get(i);

				if (obj2.containsKey("mapping-files")) {

					JSONArray a1 = (JSONArray) obj2.get("mapping-files");

					for (int j = 0; j < a1.size(); j++) {
						JSONObject obj3 = (JSONObject) a1.get(j);
						Set<Entry<String, String>> set = obj3.entrySet();

						for (Entry<String, String> entry : set) {

							mappingFiles.put(entry.getKey(), entry.getValue());
						}
					}

				}
			}

		} catch (Exception e) {
			// e.printStackTrace();
			errorLogger.error(
					" Class VESAdapterInitializer: method readJsonToMap: Exception occured while reading Collector config file cause: ",
					e.getCause());
		}
	}

	public static Map<String, String> getMappingFiles() {
		return mappingFiles;
	}

	public static void setMappingFiles(Map<String, String> mappingFiles) {
		VESAdapterInitializer.mappingFiles = mappingFiles;
	}

	@Override
	public int getOrder() {
		return 0;
	}

	private static String fetchResultFromDestination(String url) {
		debugLogger.debug("VESAdapterInitializer:: fetchResultFromDestination :: START");
		String line = "";
		StringBuffer sb = new StringBuffer();
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			while ((line = rd.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}
		} catch (ClientProtocolException e) {
			debugLogger.debug("VESAdapterInitializer:: fetchResultFromDestination :: ClientProtocolException thrown "
					+ e.getMessage());
		} catch (UnsupportedOperationException e) {
			debugLogger
					.debug("VESAdapterInitializer:: fetchResultFromDestination :: UnsupportedOperationException thrown "
							+ e.getMessage());
		} catch (IOException e) {
			debugLogger.debug(
					"VESAdapterInitializer:: fetchResultFromDestination :: IOException thrown " + e.getMessage());
		}
		debugLogger.debug("VESAdapterInitializer:: fetchResultFromDestination :: END");
		return sb.toString();
	}

}
