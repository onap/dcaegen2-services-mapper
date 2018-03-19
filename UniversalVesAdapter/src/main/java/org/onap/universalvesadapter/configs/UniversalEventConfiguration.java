package org.onap.universalvesadapter.configs;

import java.util.HashMap;
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
public class UniversalEventConfiguration extends Configuration {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Value("${snmpTrap.configFile}")
	private String configFile;

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
	
	
	//think about adding mapping files on runtime as well
	
}
