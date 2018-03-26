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

import javax.annotation.Resource;
import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.VesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Service that starts the universal ves adapter module to listen for events
 * 
 * @author kmalbari
 *
 */
@Component
public class VesService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	private boolean isRunning = true;
    
    @Autowired
    private DMaapService dmaapService;
    
    @Autowired
    private AdapterService adapterService;
    
    @Resource(name="universalEventAdapter")
    private GenericAdapter eventAdapter;

    @Value("${messagesInBatch}")
	private int messagesInBatch; 
	
	/*public void start(){
		
		String incomingJsonString = dmaapService.consume();
		if(!"".equals(incomingJsonString)){
			GenericAdapter eventAdapter = adapterService.identifyIncomingJsonFormatAndReturnAdapter();
			String outgoingJsonString = eventAdapter.transform(incomingJsonString);
			System.out.println(outgoingJsonString);
		}
	}*/
    
    
	/**
	 *  method triggers universal ves adapter module
	 */
	public void start() {
		/*ParallelTasks parallelTasks = new ParallelTasks();
		int processingNumberOfMessage = 0;
		while (isRunning) {
			try {
				for(String incomingJsonString : dmaapService.consumeFromDMaap()){
					parallelTasks.add(() -> processReceivedJson(incomingJsonString));
					processingNumberOfMessage++;
					if(processingNumberOfMessage == messagesInBatch){
						parallelTasks.startParallelTasks();
						processingNumberOfMessage=0;
						parallelTasks = new ParallelTasks();
						try
			            {
			                Thread.sleep(1000);
			            }
			            catch (InterruptedException e)
			            {
			            }		
					}
				}
			} catch (DMaapException e) {
			}
		}*/
		String incomingJsonString = dmaapService.consume();
		processReceivedJson(incomingJsonString);
	}

	/**
	 * It finds mapping file for received json, transforms json to VES format 
	 * and publishes it to outgoing DMaap MR Topic
	 * 
	 * @param incomingJsonString
	 */
	private void processReceivedJson(String incomingJsonString) {
		try {
			LOGGER.debug("Received incoming message" + incomingJsonString);
			if (!"".equals(incomingJsonString)) {
				String eventType = adapterService.identifyEventTypeFromIncomingJson(incomingJsonString);
				LOGGER.debug("Event identified as " + eventType);
				String outgoingJsonString;
					outgoingJsonString = eventAdapter.transform(incomingJsonString, eventType);
				LOGGER.debug("Output VES json to be sent " + outgoingJsonString);
			} 
		} catch (ConfigFileReadException | ConfigFileSmooksConversionException | VesException exception) {
			LOGGER.error(exception.getMessage());
		}
	}
	
	/**
	 * method stops universal ves adapter module
	 */
	public void stop() {
		
		isRunning = false;
	}
}
