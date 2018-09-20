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
package org.onap.universalvesadapter.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

//AdapterInitializer
@Component
public class VESAdapterInitializer implements CommandLineRunner, Ordered {
	private static final Logger LOGGER = LoggerFactory.getLogger(VESAdapterInitializer.class);
	@Value("${spring.datasource.url}")
	String dBurl;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String pwd;

	private static Map<String, String> mappingFiles = new HashMap<String, String>();
	private static Map<String, String> env;
	private static String url;
	public static String retString;
	public static String retCBSString;

	@Override
	public void run(String... args) throws Exception {

		fetchMappingFile();
		getconsul();

	}

	private void getconsul() {

		env = System.getenv();
		for (Map.Entry<String, String> entry : env.entrySet()) {
			LOGGER.info(entry.getKey() + ":" + entry.getValue());
		}

		if (env.containsKey("CONSUL_HOST") && env.containsKey("CONFIG_BINDING_SERVICE")) {
			LOGGER.info(">>>Dynamic configuration to be fetched from ConfigBindingService");
			url = env.get("CONSUL_HOST") + ":8500/v1/catalog/service/" + env.get("CONFIG_BINDING_SERVICE");

			retString = executecurl(url);

		} else {
		
			LOGGER.info(">>>Static configuration to be used");
			final String url = "http://localhost:8085/start";
			final String USER_AGENT = "Mozilla/5.0";

			try {
				URL obj = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();

				// optional default is GET
				httpURLConnection.setRequestMethod("GET");

				// add request header
				httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);

				int responseCode = httpURLConnection.getResponseCode();
				LOGGER.info("Sending 'GET' request to URL : " + url);
				LOGGER.info("Response Code : " + responseCode);
				BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				LOGGER.info("The result is :" + response.toString());

			} catch (Exception e) {
				LOGGER.error("Error occured due to :" + e.getMessage());
				e.printStackTrace();
			}
			
		}

	}

	private String executecurl(String url) {

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
			LOGGER.info(result);

			reader.close();
			ipr.close();
		} catch (IOException e) {
			LOGGER.error("error", e);
			e.printStackTrace();
		}
		return result;

	}

	public void fetchMappingFile() {
		String query = "SELECT * FROM mapping_file";
		try (Connection con = DriverManager.getConnection(dBurl, user, pwd);PreparedStatement pstmt = con.prepareStatement(query);ResultSet rs = pstmt.executeQuery();) {
			LOGGER.info("Retrieving data from DB");
			// parsing the column each time is a linear search
			int column1Pos = rs.findColumn("enterpriseid");
			int column2Pos = rs.findColumn("mappingfilecontents");
			String hexString;
			while (rs.next()) {
				String column1 = rs.getString(column1Pos);
				String column2 = rs.getString(column2Pos);
				hexString = column2.substring(2);
				byte[] bytes = Hex.decodeHex(hexString.toCharArray());
				String data = new String(bytes, "UTF-8");
				mappingFiles.put(column1, data);
			}
			LOGGER.info("DB Initialization Completed..." + mappingFiles.size());
		} catch (Exception e) {
			LOGGER.error("Error occured due to :" + e.getMessage());
			e.printStackTrace();
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
		return 1;
	}
}
