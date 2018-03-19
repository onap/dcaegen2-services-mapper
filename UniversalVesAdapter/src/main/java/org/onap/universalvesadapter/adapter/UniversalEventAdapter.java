package org.onap.universalvesadapter.adapter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.milyn.Smooks;
import org.onap.dcaegen2.ves.domain.VesEvent;
import org.onap.universalvesadapter.configs.UniversalEventConfiguration;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.ConfigFileService;
import org.onap.universalvesadapter.utils.SmooksUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Default implementation of the Generic Adapter
 * 
 * @author kmalbari
 *
 */
@Component
public class UniversalEventAdapter implements GenericAdapter{
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UniversalEventConfiguration configuration;
	
	@Resource(name="diskRepoConfigFileService")
	private ConfigFileService configFileService;
	
//	private Smooks smooks;
	
	private Map<String, Smooks> eventToSmooksMapping = new ConcurrentHashMap<>();

	/*public String transform(String incomingJsonString) throws ConfigFileReadException {
		String result = "";
		try {
		//reading config file.. for now, looking at it as just one time operation
			if(null == smooks){
				String configFileData = configFileService.readConfigFile(configuration.getConfigFile());
				smooks = new Smooks(new ByteArrayInputStream(configFileData.getBytes(StandardCharsets.UTF_8)));
			}
		
			VesEvent vesEvent = SmooksUtils.getTransformedObjectForInput(smooks, incomingJsonString);
			ObjectMapper objectMapper = new ObjectMapper();
			result = objectMapper.writeValueAsString(vesEvent); 
		} catch (IOException | SAXException e) {
			e.printStackTrace();
		}
		
		return result;
	}*/
	


	@Override
	public String transform(String incomingJsonString, String eventType) throws ConfigFileReadException, 
									ConfigFileSmooksConversionException, VesException {
		String result = "";
		try {
			if(null == eventToSmooksMapping.get(eventType)){
				LOGGER.debug("No smooks mapping for this event type " + eventType + ".. reading config file");
				String configFileData = configFileService.readConfigFile(configuration.getConfigForEvent(eventType));
				LOGGER.debug("Read config file " + configFileData);
				Smooks smooksTemp = new Smooks(new ByteArrayInputStream(configFileData.getBytes(StandardCharsets.UTF_8)));
				eventToSmooksMapping.put(eventType, smooksTemp);
				LOGGER.debug("Added smooks mapping for event type" + eventType);
			}
		
			
			LOGGER.debug("Read smooks mapping for event type" + eventType);
			LOGGER.debug("Transforming incoming json now");
			VesEvent vesEvent = SmooksUtils.getTransformedObjectForInput(eventToSmooksMapping.get(eventType), incomingJsonString);
			LOGGER.debug("Incoming json transformed to VES format successfully");
			ObjectMapper objectMapper = new ObjectMapper();
			result = objectMapper.writeValueAsString(vesEvent); 
			LOGGER.debug("Serialized VES json");
		} catch (JsonProcessingException exception) {
			throw new VesException("Unable to convert pojo to VES format" + "\n Reason :" + exception.getMessage());
		} catch (SAXException | IOException exception) {
			throw new ConfigFileSmooksConversionException("Unable to convert config file into smooks for event type " + eventType 
					+ "\n Reason :" + exception.getMessage());
		}
		return result;
	}
	
	
	/**
	 * Closes all open smooks' instances before bean is destroyed
	 */
	@PreDestroy
	public void destroy(){
//		if(null != smooks)
//			smooks.close();
		
		for(Smooks smooks : eventToSmooksMapping.values())
			smooks.close();
		
		LOGGER.debug("All Smooks objects closed");
	}	

}
