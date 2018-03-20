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
package org.onap.universalvesadapter.adapter;

import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.VesException;

/**
 * This interface defines contract for adapter to convert an incoming json
 * to VES format
 * 
 * @author kmalbari
 *
 */
public interface GenericAdapter {

//	String transform(String incomingJsonString) throws ConfigFileReadException;

	/**
	 * It will take in an incoming json and identify the json type for different 
	 * events. Based on the event type it will retrieve the corresponding config
	 * file and convert the json to VES format using mappings in the config file. 
	 * 
	 * @param incomingJsonString json that is received on DMaap topic
	 * @param eventType type identified from incoming json
	 * @return VES format json
	 * @throws ConfigFileReadException if unable to read the configuration file
	 * @throws ConfigFileSmooksConversionException if unable to convert config file data to smooks object 
	 * @throws VesException if unable to convert into ves json
	 */
	String transform(String incomingJsonString, String eventType) throws ConfigFileReadException, ConfigFileSmooksConversionException, VesException;

}
