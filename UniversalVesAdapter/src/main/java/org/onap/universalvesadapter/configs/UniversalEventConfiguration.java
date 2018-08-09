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
package org.onap.universalvesadapter.configs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Configuration for universal adapter service 
 * 
 * @author kmalbari
 *
 */
@Component
public class UniversalEventConfiguration{

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("${universal.configFiles}")
	private String configFiles;

	private Map<String, String> eventToConfigFileMap = new ConcurrentHashMap<>();
	
	
	/**
	 * Returns config file for a particular event from the mapping. 
	 * If mapping is empty, populates its
	 * 
	 * @param eventType 
	 * 
	 * @return config file name
	 */
	public String getConfigForEvent(String eventType){
		LOGGER.debug("Getting config file name for event:" + eventType);
		if(null != configFiles && eventToConfigFileMap.isEmpty()){
			for(String entry : configFiles.split(",")){
				eventToConfigFileMap.put(entry.split(":")[0], entry.split(":")[1]);
			}
			LOGGER.debug("Populated mappings for event type to config files");
		}
		
		return (null == eventToConfigFileMap.get(eventType)) ? "default" : eventToConfigFileMap.get(eventType) ;
		
	}
	
	
}
