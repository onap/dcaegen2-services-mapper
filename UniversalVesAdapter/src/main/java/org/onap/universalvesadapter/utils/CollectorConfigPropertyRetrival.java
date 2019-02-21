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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CollectorConfigPropertyRetrival {


	 public static String configFile = "/opt/app/VESAdapter/conf/kv.json";
	 //public static String configFile = "src\\main\\resources\\kv.json";
	 private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	 private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	 private static  JSONArray array;

	public static  JSONArray collectorConfigArray(String configFile){
		try {
		JSONParser parser = new JSONParser();
		FileReader fileReader = new FileReader(configFile);
		JSONObject obj = (JSONObject) parser.parse(fileReader);
		JSONObject appobj = (JSONObject) obj.get("app_preferences");
		 array =(JSONArray) appobj.get("collectors");
		
		 debugLogger.info("Retrieved JsonArray from Collector Config File");
		} catch (ParseException e) {
			errorLogger.error("ParseException occured at position:",e.getPosition());
		} catch (FileNotFoundException e) {
			
			errorLogger.error("Collector Config File is not found..",e.getMessage());
		} catch (IOException e) {
			
			errorLogger.error("Error occured due to :",e.getMessage());
		}
		
		
		return array;
		
	}
	
	
	public static String [] getProperyArray(String properyName) {
		JSONArray jsonArray =collectorConfigArray(configFile);
		
		String [] propertyArray=new String[jsonArray.size()];
		
		 for (int k=0;k<jsonArray.size();k++) {
				
				 JSONObject collJson= (JSONObject) jsonArray.get(k);
				 
				 propertyArray[k]=(String) collJson.get(properyName);
			 }
		 debugLogger.info("returning "+properyName+" array from Collector Config");
		return propertyArray;
		
	}

}
