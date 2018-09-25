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
package org.onap.dcaegen2.services.mapper.snmpmapper.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

/**
 * This Class is use for connection to the database and upload the provided mapping file
 *
 */
@Repository
public class MappingFileDAOImpl implements MappingFileDAO {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("${spring.datasource.url}")
	String url;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String pwd;
	@Autowired private ApplicationContext applicationContext;

	private static Map<String, String> env;
	@Override
	public String uploadMappingFile(MultipartFile mappingFile, String enterpriseid) throws SQLException, IOException {
		
		env = System.getenv();
		for (Map.Entry<String, String> entry : env.entrySet()) {
			LOGGER.info(entry.getKey() + ":" + entry.getValue());
		}

			if (env.containsKey("CONSUL_HOST") && env.containsKey("CONFIG_BINDING_SERVICE") && env.containsKey("HOSTNAME")) {
				//TODO - Add logic to talk to Consul and CBS to get the configuration. For now, we will refer to configuration coming from docker env parameters
				
				LOGGER.info(">>>Dynamic configuration to be used");
				
				if( (env.get("MR_DMAAPHOST")==null || 
						(env.get("MR_DMAAPHOST")==null || 
						(env.get("MR_DEFAULT_PORT_NUMBER")==null || 
						(env.get("URL_JDBC")==null || 
						(env.get("JDBC_USERNAME")==null || 
						(env.get("JDBC_PASSWORD")==null ))))))) {
					
					
					LOGGER.error("Some docker environment parameter is missing. Sample Usage is -\n sudo docker run -d -p 8085:8085/tcp --env URL_JDBC=jdbc:postgresql://10.53.172.129:5432/dummy --env JDBC_USERNAME=ngpuser --env JDBC_PASSWORD=root --env MR_DMAAPHOST=10.10.10.10 --env MR_DEFAULT_PORT_NUMBER=3904 --env CONSUL_HOST=10.53.172.109 --env HOSTNAME=mvp-dcaegen2-collectors-ves --env CONFIG_BINDING_SERVICE=config_binding_service -e DMAAPHOST='10.53.172.156' onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor:latest");
					System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application is stoped please provide the above environment parameter during docker run");return-1;}));
					
				}else {
					
					url=env.get("URL_JDBC");
					user=env.get("JDBC_USERNAME");
					pwd=env.get("JDBC_PASSWORD");
				}
			
		} else {
			LOGGER.info(">>>Static configuration to be used");
		}
		
		
		
		try (Connection con = DriverManager.getConnection(url, user, pwd)) {
			LOGGER.debug("Connection established successfully");
			PreparedStatement pstmt = con.prepareStatement(
					"INSERT INTO mapping_file(enterpriseid, mappingfilecontents, mimetype,  File_Name) VALUES (?, ?, ?, ?)");

			pstmt.setString(1, enterpriseid);
			pstmt.setBytes(2, mappingFile.getBytes());
			pstmt.setString(3, mappingFile.getContentType());
			pstmt.setString(4, mappingFile.getOriginalFilename());

			pstmt.executeUpdate();

		}catch (Exception e) {
			LOGGER.error("Error occured due to :" + e.getMessage());
			e.printStackTrace();
		}
		return "Uploaded successfully";

	}

}
