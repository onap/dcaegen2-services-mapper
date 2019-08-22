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
					executecurl("http://localhost:" + serverPort + "/start");

				}, throwable -> {
					debugLogger.warn("Cannot Connect", throwable);
				});

		// check for consul details
		if (env.consulHost() != null && env.cbsName() != null && env.appName() != null) {
			debugLogger.info(">>>Dynamic configuration to be used");
			FetchDynamicConfig.cbsCall(defaultConfigFilelocation);

			readJsonToMap(defaultConfigFilelocation);

			debugLogger.info("Triggering controller's start url ");
			executecurl("http://localhost:" + serverPort + "/start");

		} else {
			debugLogger.info(">>>Static configuration to be used");
		}
	}

	private static String executecurl(String url) {

		debugLogger.info("Running curl command for url:{}", url);
		String[] command = { "curl", "-v", url };
		ProcessBuilder process = new ProcessBuilder(command);
		Process p;
		String result = null;
		try {
			p = process.start();
			try (InputStreamReader ipr = new InputStreamReader(p.getInputStream());
					BufferedReader reader = new BufferedReader(ipr)) {
				StringBuilder builder = new StringBuilder();
				String line;

				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
				result = builder.toString();
			}
		} catch (IOException e) {
			errorLogger.error("error", e);
		}
		return result;

	}
	
	/**
	 * gets the configuration details from JSON an puts those in the mapping data structure for further processing.
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
			//e.printStackTrace();
			errorLogger.error(" Class VESAdapterInitializer: method readJsonToMap: Exception occured while reading Collector config file cause: ", e.getCause());
		}
	}

	/*
	 * private void prepareDatabase() throws IOException {
	 * 
	 * 
	 * debugLogger.info("The Default Mapping file Location:" +
	 * defaultMappingFileLocation.trim());
	 * 
	 * if (ClassLoader.getSystemResource(defaultMappingFileLocation.trim()) == null)
	 * { errorLogger.error( "Default mapping file " +
	 * defaultMappingFileLocation.trim() + " is missing");
	 * System.exit(SpringApplication.exit(applicationContext, () -> {
	 * errorLogger.error("Application stoped due to missing default mapping file");
	 * return -1; })); }
	 * 
	 * File file = new File(
	 * ClassLoader.getSystemResource(defaultMappingFileLocation.trim()).getFile());
	 * 
	 * try (FileInputStream fileInputStream = new FileInputStream(file)) {
	 * bytesArray = new byte[(int) file.length()]; fileInputStream.read(bytesArray);
	 * 
	 * } catch (IOException e1) { errorLogger.
	 * error("Exception Occured while reading the default mapping file ,Cause: " +
	 * e1.getMessage(), e1); // exit on missing default mapping file
	 * System.exit(SpringApplication.exit(applicationContext, () -> {
	 * errorLogger.error("Application stoped due to missing default mapping file");
	 * return -1; })); }
	 * 
	 * try (Connection con = DriverManager.getConnection(dBurl, user, pwd); //
	 * creating table if not exist PreparedStatement pstmt11 =
	 * con.prepareStatement("CREATE TABLE IF NOT EXISTS public." +
	 * MappingFileTableName + "\r\n" + "(\r\n" +
	 * "    enterpriseid character varying COLLATE pg_catalog.\"default\" NOT NULL,\r\n"
	 * + "    mappingfilecontents bytea,\r\n" +
	 * "    mimetype character varying COLLATE pg_catalog.\"default\",\r\n" +
	 * "    file_name character varying COLLATE pg_catalog.\"default\",\r\n" +
	 * "    CONSTRAINT mapping_file_pkey5 PRIMARY KEY (enterpriseid)\r\n" + ")\r\n"
	 * + "WITH (\r\n" + "    OIDS = FALSE\r\n" + ")\r\n" +
	 * "TABLESPACE pg_default;")) {
	 * 
	 * metricsLogger.info("Postgresql Connection successful...");
	 * debugLogger.debug("Connection object:{}" , con.toString());
	 * 
	 * pstmt11.executeUpdate();
	 * debugLogger.info("CREATE TABLE IF NOT EXISTS executed successfully....");
	 * 
	 * if ((bytesArray.length > 0) && (!Arrays.toString(bytesArray).equals(""))) {
	 * 
	 * try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO " +
	 * MappingFileTableName +
	 * "(enterpriseid, mappingfilecontents, mimetype,  File_Name) VALUES (?, ?, ?, ?) ON CONFLICT (enterpriseid) DO NOTHING;"
	 * )) { pstmt.setString(1, defaultEnterpriseId); pstmt.setBytes(2, bytesArray);
	 * pstmt.setString(3, "text/xml"); pstmt.setString(4, file.getName());
	 * 
	 * pstmt.executeUpdate();
	 * debugLogger.info("Made sure that default mapping file is present in table");
	 * } } else { errorLogger.error(file.getName() + " is empty"); // exit on empty
	 * mapping file System.exit(SpringApplication.exit(applicationContext, () -> {
	 * errorLogger.
	 * error("Application stoped beacuase default mapping file is empty.."); return
	 * -1; })); }
	 * 
	 * } catch (SQLException e) { errorLogger.error("Received exception : " +
	 * e.getMessage(), e); // exit on SqlException
	 * System.exit(SpringApplication.exit(applicationContext, () -> {
	 * errorLogger.error("Application Stoped due to ", e.getCause()); return -1;
	 * })); }
	 * 
	 * }
	 */
	/*
	 * public void fetchMappingFile() {
	 * 
	 * try (Connection con = DriverManager.getConnection(dBurl, user, pwd)) {
	 * debugLogger.info("Retrieving data from DB"); PreparedStatement pstmt =
	 * con.prepareStatement("SELECT * FROM mapping_file"); ResultSet rs =
	 * pstmt.executeQuery(); // parsing the column each time is a linear search int
	 * column1Pos = rs.findColumn("enterpriseid"); int column2Pos =
	 * rs.findColumn("mappingfilecontents"); String hexString; while (rs.next()) {
	 * String column1 = rs.getString(column1Pos); String column2 =
	 * rs.getString(column2Pos); hexString = column2.substring(2); byte[] bytes =
	 * Hex.decodeHex(hexString.toCharArray()); String data = new String(bytes,
	 * "UTF-8"); mappingFiles.put(column1, data); }
	 * debugLogger.info("DB Initialization Completed, Total # Mappingfiles are" +
	 * mappingFiles.size()); } catch (Exception e) {
	 * errorLogger.error("Error occured due to :" + e.getMessage());
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

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

}
