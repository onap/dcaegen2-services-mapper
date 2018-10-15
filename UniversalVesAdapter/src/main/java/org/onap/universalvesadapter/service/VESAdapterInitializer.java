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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
import org.onap.universalvesadapter.dmaap.Creator;
import org.onap.universalvesadapter.utils.DmaapConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

//AdapterInitializer
@Component
public class VESAdapterInitializer implements CommandLineRunner, Ordered {
	private static final Logger LOGGER = LoggerFactory.getLogger(VESAdapterInitializer.class);
	
	@Autowired
	private Creator creator;
	@Autowired
	private DmaapConfig dmaapConfig;
	@Value("${spring.datasource.url}")
	String dBurl;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String pwd;
	@Value("${defaultMappingFilelocation}")
	String defaultMappingFileLocation;
	@Value("${MappingFileTableName}")
	String MappingFileTableName;
	@Value("${defaultEnterpriseId}")
	String defaultEnterpriseId;
	@Value("${server.port}")
	String serverPort;

	private static Map<String, String> mappingFiles = new HashMap<String, String>();
	private static Map<String, String> env;
	private static String url;
	public static String retString;
	public static String retCBSString;
	public static String configFile = "/opt/app/KV-Configuration.json";
    byte[] bytesArray = null;
    @Autowired private ApplicationContext applicationContext;
    
	@Override
	public void run(String... args) throws Exception {
		env = System.getenv();
		for (Map.Entry<String, String> entry : env.entrySet()) {
			LOGGER.info(entry.getKey() + ":" + entry.getValue());
		}

		if (env.containsKey("CONSUL_HOST") && env.containsKey("CONFIG_BINDING_SERVICE") && env.containsKey("HOSTNAME")) {
			//TODO - Add logic to talk to Consul and CBS to get the configuration. For now, we will refer to configuration coming from docker env parameters
			
			LOGGER.info(">>>Dynamic configuration to be used");
			
			if( (env.get("DMAAPHOST")==null || 
					(env.get("MR_DEFAULT_PORT_NUMBER")==null || 
					(env.get("URL_JDBC")==null || 
					(env.get("JDBC_USERNAME")==null || 
					(env.get("JDBC_PASSWORD")==null )))))) {
				
				
				LOGGER.error("Some docker environment parameter is missing. Sample Usage is -\n sudo docker run -d -p 8085:8085/tcp --env URL_JDBC=jdbc:postgresql://10.53.172.129:5432/dummy --env JDBC_USERNAME=ngpuser --env JDBC_PASSWORD=root --env MR_DMAAPHOST=10.10.10.10 --env MR_DEFAULT_PORT_NUMBER=3904 --env CONSUL_HOST=10.53.172.109 --env HOSTNAME=mvp-dcaegen2-collectors-ves --env CONFIG_BINDING_SERVICE=config_binding_service -e DMAAPHOST='10.53.172.156' onap/org.onap.dcaegen2.services.mapper.vesadapter.universalvesadaptor:latest");
				System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application stoped due to missing default mapping file");return-1;}));
				
			}else {
				
				
				
				dmaapConfig.setDmaaphost(env.get("DMAAPHOST"));
				dmaapConfig.setDEFAULT_PORT_NUMBER(Integer.parseInt(env.get("MR_DEFAULT_PORT_NUMBER")));
				creator.setDmaapConfig(dmaapConfig);
				
				dBurl=env.get("URL_JDBC");
				user=env.get("JDBC_USERNAME");
				pwd=env.get("JDBC_PASSWORD");
			}
			
			
	
		} else {
			LOGGER.info(">>>Static configuration to be used");
		}
		prepareDatabase();
		fetchMappingFile();
		
		LOGGER.info("Triggering controller's start url ");
		executecurl("http://localhost:"+serverPort+"/start");
	}

	private void getconsul() { 
		
		//TODO
	}
	
	public static boolean verifyConfigChange() {
		//TODO
		return false;
	}

	public static void getCBS() {
		//TODO
	}

	public static void writefile(String retCBSString) {
		//TODO
	}
	
	private static String executecurl(String url) {

		LOGGER.info("Running curl command for url:"+url);
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
		
		try (Connection con = DriverManager.getConnection(dBurl, user, pwd)) {
			LOGGER.info("Retrieving data from DB");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM mapping_file");
			ResultSet rs = pstmt.executeQuery();
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
			LOGGER.info("DB Initialization Completed, Total # Mappingfiles are" + mappingFiles.size());
		} catch (Exception e) {
			LOGGER.error("Error occured due to :" + e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	 private void prepareDatabase() throws IOException {       
		 
     
         LOGGER.info("The Default Mapping file Location:"+defaultMappingFileLocation.trim());
		 
		 if(ClassLoader.getSystemResource(defaultMappingFileLocation.trim())==null){
			 LOGGER.error("Default mapping file " + defaultMappingFileLocation.trim() + " is missing");
	    	  System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application stoped due to missing default mapping file");return-1;}));
		 }
		 
		 File file = new File(ClassLoader.getSystemResource(defaultMappingFileLocation.trim()).getFile());
	      FileInputStream fileInputStream=null;
	      
		 try 
		 {
	         bytesArray = new byte[(int) file.length()];
	         fileInputStream = new FileInputStream(file);
             fileInputStream.read(bytesArray);
                     
          } catch (IOException e1) {
           LOGGER.error("Exception Occured while reading the default mapping file ,Cause: " + e1.getMessage(), e1);                    
            //exit on missing default mapping file 
            System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application stoped due to missing default mapping file");return-1;}));      
           }finally {
            	   try {
					fileInputStream.close();
				}catch (IOException e) {
					LOGGER.error("Exception while closing file inputstream" + e.getMessage(), e);
				}
            }
		 
               try (Connection con = DriverManager.getConnection(dBurl, user, pwd)) {
                     LOGGER.info("Postgresql Connection successful...");
                     LOGGER.debug("Connection object:"+con.toString());
              //creating table if not exist
             PreparedStatement pstmt11=con.prepareStatement("CREATE TABLE IF NOT EXISTS public."+MappingFileTableName+"\r\n" + 
                     "(\r\n" + 
                     "    enterpriseid character varying COLLATE pg_catalog.\"default\" NOT NULL,\r\n" + 
                     "    mappingfilecontents bytea,\r\n" + 
                     "    mimetype character varying COLLATE pg_catalog.\"default\",\r\n" + 
                     "    file_name character varying COLLATE pg_catalog.\"default\",\r\n" + 
                     "    CONSTRAINT mapping_file_pkey5 PRIMARY KEY (enterpriseid)\r\n" + 
                     ")\r\n" + 
                     "WITH (\r\n" + 
                     "    OIDS = FALSE\r\n" + 
                     ")\r\n" + 
                     "TABLESPACE pg_default;");
             pstmt11.executeUpdate();
             LOGGER.info("CREATE TABLE IF NOT EXISTS executed successfully....");
             
             if((bytesArray.length>0)&&(!bytesArray.toString().equals(""))) {
            	LOGGER.debug("2Connection object:"+con.toString());
            	 PreparedStatement pstmt=con.prepareStatement("INSERT INTO "+MappingFileTableName+"(enterpriseid, mappingfilecontents, mimetype,  File_Name) VALUES (?, ?, ?, ?) ON CONFLICT (enterpriseid) DO NOTHING;");
                 pstmt.setString(1,defaultEnterpriseId);
                 pstmt.setBytes(2,bytesArray );
                 pstmt.setString(3,"text/xml");
                 pstmt.setString(4, file.getName());
       
                 pstmt.executeUpdate();
                 LOGGER.info("Made sure that default mapping file is present in table");
             }
             else {
            	 LOGGER.error(file.getName()+" is empty");
            	  //exit on empty mapping file
            	  System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application stoped beacuase default mapping file is empty..");return-1;}));
             }
              
              
              
               } catch (SQLException e) {
                     LOGGER.error("Received exception : " + e.getMessage(), e);
                     //exit on SqlException
                     System.exit(SpringApplication.exit(applicationContext, () -> {LOGGER.error("Application Stoped due to ",e.getCause());return-1;}));
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

}
