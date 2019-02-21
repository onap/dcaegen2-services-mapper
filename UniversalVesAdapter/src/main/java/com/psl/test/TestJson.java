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
package com.psl.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestJson {
	
	private static Map<String, String> mappingFiles = new HashMap<String, String>();

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		readJsonToMap("src\\main\\resources\\testcbsdata.json");
/*		String yourJSONresponse=" [  \r\n" + 
				"      {  \r\n" + 
				"         \"type\":\"snmp\",\r\n" + 
				"         \"identifier\":\"oid\",\r\n" + 
				"         \"subsTopic\":\"ONAP-COLLECTOR-SNMPTRAP\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"type\":\"restconf\",\r\n" + 
				"         \"identifier\":\"notification-id\",\r\n" + 
				"         \"subsTopic\":\"ONAP-COLLECTOR-RESTCONFTRAP\"\r\n" + 
				"      }\r\n" + 
				"   ]";*/
		
		
/*JSONArray arr = new JSONArray(yourJSONresponse);
		
		System.out.println("The JSON array in Java is :"+arr);
		System.out.println();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < arr.length(); i++){
		    list.add(arr.getJSONObject(i).getString("type"));
		}
		
		System.out.println(list);*/
		
/*		String yourJSONresponse=" {  \r\n" + 
				"   \"collectors\":[  \r\n" + 
				"      {  \r\n" + 
				"         \"type\":\"snmp\",\r\n" + 
				"         \"identifier\":\"oid\",\r\n" + 
				"         \"subsTopic\":\"ONAP-COLLECTOR-SNMPTRAP\"\r\n" + 
				"      },\r\n" + 
				"      {  \r\n" + 
				"         \"type\":\"restconf\",\r\n" + 
				"         \"identifier\":\"notification-id\",\r\n" + 
				"         \"subsTopic\":\"ONAP-COLLECTOR-RESTCONFTRAP\"\r\n" + 
				"      }\r\n" + 
				"   ]\r\n" + 
				"}";*/
		 
		String yourJSONresponse="{  \r\n" + 
				"  \"defaultMappingFilelocation\":\"defaultSnmpMappingFile.xml\",\r\n" + 
				"  \"defaultEnterpriseId\":\"default\",\r\n" + 
				"  \"database\":{  \r\n" + 
				"    \"url\":\"jdbc:postgresql://10.53.172.138:5432/postgres\",\r\n" + 
				"    \"username\":\"postgres\",\r\n" + 
				"    \"password\":\"root\",\r\n" + 
				"    \"MappingFileTableName\":\"mapping_file\"\r\n" + 
				"  },\r\n" + 
				"  \"dmaap\":{  \r\n" + 
				"    \"default\":{  \r\n" + 
				"      \"dmaaphost\":\"10.53.172.156\",\r\n" + 
				"      \"DEFAULT_PORT_NUMBER\":3904,\r\n" + 
				"      \"DEFAULT_USER_NAME\":\"null\",\r\n" + 
				"      \"DEFAULT_USER_PASSWORD\":\"null\",\r\n" + 
				"      \"DEFAULT_PROTOCOL\":\"http\",\r\n" + 
				"      \"DEFAULT_CONTENT_TYPE\":\"application/json\",\r\n" + 
				"      \"DMAAP_URI_PATH_PREFIX\":\"/events/\",\r\n" + 
				"      \"DMAAP_DEFAULT_CONSUMER_ID\":\"con2\",\r\n" + 
				"      \"DMAAP_GROUP_PREFIX\":\"grp2\",\r\n" + 
				"      \"POLLING_INTERVAL\":10000\r\n" + 
				"    },\r\n" + 
				"    \"publisher\":{  \r\n" + 
				"      \"topic\":\"unauthenticated.SEC_FAULT_OUTPUT\",\r\n" + 
				"      \"DEFAULT_PUBLISHER_MAX_BATCH_SIZE\":1,\r\n" + 
				"      \"DEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE\":100000,\r\n" + 
				"      \"PUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE\":5,\r\n" + 
				"      \"PUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE\":5000\r\n" + 
				"    },\r\n" + 
				"    \"subscriber\":{  \r\n" + 
				"      \"DEFAULT_SUBSCRIBER_TIMEOUT_MS\":-1,\r\n" + 
				"      \"DEFAULT_SUBSCRIBER_MESSAGE_LIMIT\":-1,\r\n" + 
				"      \"DEFAULT_SUBSCRIBER_GROUP_PREFIX\":\"grp2\",\r\n" + 
				"      \"SUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME\":\"timeout\",\r\n" + 
				"      \"SUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME\":\"limit\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"collectors\":[  \r\n" + 
				"    {  \r\n" + 
				"      \"type\":\"snmp\",\r\n" + 
				"      \"identifier\":\"oid\",\r\n" + 
				"      \"subsTopic\":\"ONAP-COLLECTOR-SNMPTRAP\"\r\n" + 
				"    },\r\n" + 
				"    {  \r\n" + 
				"      \"type\":\"restconf\",\r\n" + 
				"      \"identifier\":\"notification-id\",\r\n" + 
				"      \"subsTopic\":\"ONAP-COLLECTOR-RESTCONFTRAP\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		/* JSONObject json = new JSONObject(yourJSONresponse);
		
		 JSONArray arr =(JSONArray) json.get("collectors");
		
		// arr.get
		 System.out.println("The Number Threads to be created are:"+arr.length());
		 
		 JSONObject subscriberTopicObj= arr.getJSONObject(2);
		 String subscriberToppic=(String) subscriberTopicObj.get("subsTopic");
		 System.out.println("The topic name is:"+subscriberToppic);
		 
		 String topicArray[]= {"ONAP-COLLECTOR-SNMPTRAP","ONAP-COLLECTOR-RESTCONFTRAP"};
		 ExecutorService executorService=Executors.newFixedThreadPool(arr.length());
		 
		 executorService.submit(new MyCallble());
		 
		 executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
		 
		System.out.println("The JSON array in Java is :"+arr);
		System.out.println();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < arr.length(); i++){
		    list.add(arr.getJSONObject(i).getString("type"));
		}
		
		System.out.println(list);*/

	}
	
	
	private static void readJsonToMap(String collectorsConfigFile) {
		System.out.println("Hello");
		JSONParser parser = new JSONParser();

		try {
			FileReader fileReader = new FileReader(collectorsConfigFile);
			JSONObject obj = (JSONObject) parser.parse(fileReader);
			JSONObject appobj = (JSONObject) obj.get("app_preferences");
			JSONArray array =(JSONArray) appobj.get("collectors");

			for (int i = 0; i < array.size(); i++) {
				JSONObject obj2 = (JSONObject) array.get(i);

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
			
			for(Map.Entry<String, String> entry:mappingFiles.entrySet()) {
				System.out.println(entry.getKey()+" :"+entry.getValue());
			}

		} catch (ParseException pe) {

			System.out.println();
			
		} catch (FileNotFoundException e) {

		} catch (Exception e) {
		}

	}

}




class MyCallble implements Callable{

	@Override
	public Object call() throws Exception {
		 
		return null;
	}
	
}