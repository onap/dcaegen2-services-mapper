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

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.mappingconfig.Entry;
import org.onap.universalvesadapter.mappingconfig.Evaluation;
import org.onap.universalvesadapter.mappingconfig.MapperConfig;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperConfigUtils {
	
	private static final Set<String> JOIN_OPERATOR = new TreeSet<>(); 
	private static final Set<String> EXPR_OPERATOR = new TreeSet<>(); 
	private static Set<Entry> entries = new TreeSet<>((o1, o2) -> o1.getPriority().compareTo(o2.getPriority()));
	
	public static void main(String[] args) {
		
		
		JOIN_OPERATOR.add("AND");
		JOIN_OPERATOR.add("OR");
		EXPR_OPERATOR.add("EQUALS");
		
		
		String mappingFile = "{ 	\"entries\" : [ 		{ 			\"priority\" : 4, 			\"evaluation\" : { 				\"operand\" : \"AND\", 				\"field\" : null, 				\"value\" : null, 				\"datatype\" : null, 				\"lhs\" : { 					\"operand\" : \"OR\", 					\"field\" : null, 					\"value\" : null, 					\"datatype\" : null, 					\"lhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-heartbeat\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null 					}, 					\"rhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-fault\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null						 					} 				}, 				\"rhs\" : { 					\"operand\" : \"EQUALS\", 					\"field\" : \"trap version\", 					\"value\" : \"1.2\", 					\"datatype\" : \"float\", 					\"lhs\" : null, 					\"rhs\" : null	 				} 			}, 			\"result\" : \"smooks.config\" 		}, 		{ 			\"priority\" : 1, 			\"evaluation\" : { 				\"operand\" : \"AND\", 				\"field\" : null, 				\"value\" : null, 				\"datatype\" : null, 				\"lhs\" : { 					\"operand\" : \"OR\", 					\"field\" : null, 					\"value\" : null, 					\"datatype\" : null, 					\"lhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-heartbeat\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null 					}, 					\"rhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-fault\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null						 					} 				}, 				\"rhs\" : { 					\"operand\" : \"EQUALS\", 					\"field\" : \"trap version\", 					\"value\" : \"1.2\", 					\"datatype\" : \"float\", 					\"lhs\" : null, 					\"rhs\" : null	 				} 			}, 			\"result\" : \"smooks.config\" 		}, 		{ 			\"priority\" : 3, 			\"evaluation\" : { 				\"operand\" : \"AND\", 				\"field\" : null, 				\"value\" : null, 				\"datatype\" : null, 				\"lhs\" : { 					\"operand\" : \"OR\", 					\"field\" : null, 					\"value\" : null, 					\"datatype\" : null, 					\"lhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-heartbeat\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null 					}, 					\"rhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-fault\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null						 					} 				}, 				\"rhs\" : { 					\"operand\" : \"EQUALS\", 					\"field\" : \"trap version\", 					\"value\" : \"1.2\", 					\"datatype\" : \"float\", 					\"lhs\" : null, 					\"rhs\" : null	 				} 			}, 			\"result\" : \"smooks.config\" 		}, 		{ 			\"priority\" : 2, 			\"evaluation\" : { 				\"operand\" : \"AND\", 				\"field\" : null, 				\"value\" : null, 				\"datatype\" : null, 				\"lhs\" : { 					\"operand\" : \"OR\", 					\"field\" : null, 					\"value\" : null, 					\"datatype\" : null, 					\"lhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-heartbeat\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null 					}, 					\"rhs\" : { 						\"operand\" : \"EQUALS\", 						\"field\" : \"domain\", 						\"value\" : \"snmp-fault\", 						\"datatype\" : \"string\", 						\"lhs\" : null, 						\"rhs\" : null						 					} 				}, 				\"rhs\" : { 					\"operand\" : \"EQUALS\", 					\"field\" : \"trap version\", 					\"value\" : \"1.2\", 					\"datatype\" : \"float\", 					\"lhs\" : null, 					\"rhs\" : null	 				} 			}, 			\"result\" : \"smooks.config\" 		}		 	] }";
		String incomingJsonString = "{\"domain\":\"snmp-heartbeat\",\"trap version\":1.2}";
		readMapperConfigFile(mappingFile);
		
		try {
			checkIncomingJsonForMatchingDomain(incomingJsonString);
		} catch (MapperConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @param incomingJsonString
	 * @throws MapperConfigException 
	 */
	private static String checkIncomingJsonForMatchingDomain(String incomingJsonString) throws MapperConfigException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj = null;
		try {
			actualObj = mapper.readTree(incomingJsonString);
		} catch (IOException exception) {
			throw new MapperConfigException("Unable to read incoming json in a tree " + exception.getMessage());
		}
		for (Entry entry : entries){
			
			boolean result = false;
			result = evaluateEntryMatch(entry.getEvaluation(), actualObj);
			if(result)
				return entry.getResult();
		}
		return "default";
	}

	/**
	 * @param mappingFile
	 */
	private static void readMapperConfigFile(String mappingFile) {
		ObjectMapper name = new ObjectMapper();
		MapperConfig config = null;
		try {
			config = name.readValue(mappingFile, MapperConfig.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Read config file content into :" +  config);
		if(null!= config)
			entries.addAll(config.getEntries());
	}

	private static boolean evaluateEntryMatch(Evaluation evaluation, JsonNode actualObj) throws MapperConfigException {
		
		if(null!= evaluation.getOperand() && JOIN_OPERATOR.contains(evaluation.getOperand())){
			switch(evaluation.getOperand()){
			case "AND":
				return evaluateEntryMatch(evaluation.getLhs(), actualObj) && evaluateEntryMatch(evaluation.getRhs(), actualObj);
			case "OR":
				return evaluateEntryMatch(evaluation.getLhs(), actualObj) || evaluateEntryMatch(evaluation.getRhs(), actualObj);
			}
		}
		else
			throw new MapperConfigException("Not an expected operand as per config for " + evaluation.getField());
			
		if(null!= evaluation.getOperand() && EXPR_OPERATOR.contains(evaluation.getOperand())){
			switch(evaluation.getOperand()){
			case "EQUALS":
				String field = evaluation.getField();
				if(null!= field && null != evaluation.getDatatype() && actualObj.has(field)){
					switch(evaluation.getDatatype()){
					case "string":
						if(null != actualObj.get(field))
							return actualObj.get(field).asText().equals(evaluation.getValue());
					case "float":
						if(null != actualObj.get(field))
							return actualObj.get(field).asDouble() == Double.valueOf(evaluation.getValue());
					}
					
				}
			}		
		}
		else
			throw new MapperConfigException("Not an expected operand as per config for " + evaluation.getField());
		return false;
	}
	
}
