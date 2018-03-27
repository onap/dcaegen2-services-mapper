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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.Resource;

import org.milyn.io.FileUtils;
import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.utils.MapperConfigUtils;
import org.onap.universalvesadapter.utils.ParallelTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

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
    private ConfigurableApplicationContext ctx;
    
    @Autowired
    private DMaapService dmaapService;
    
    @Autowired
    private AdapterService adapterService;
    
    @Resource(name = "universalEventAdapter")
    private GenericAdapter eventAdapter;

    @Value("${messagesInBatch}")
    private int messagesInBatch; 

    @Value("${messagesInTimeInterval}")
    private long messagesInTimeInverval; 
    
    @Value("${mapperConfig.file}")
    private String mapperConfigFile;
    
    /*public void start(){
        
        String incomingJsonString = dmaapService.consume();
        if(!"".equals(incomingJsonString)){
            GenericAdapter eventAdapter = adapterService.identifyIncomingJsonFormatAndReturnAdapter();
            String outgoingJsonString = eventAdapter.transform(incomingJsonString);
            System.out.println(outgoingJsonString);
        }
    }*/
    
    
    /**
     *  method triggers universal ves adapter module.
     */
    public void start() {
        
        try {
            String mappingConfigFileData = FileCopyUtils.copyToString(new FileReader(mapperConfigFile));
            MapperConfigUtils.readMapperConfigFile(mappingConfigFileData);
        
        
            ParallelTasks parallelTasks = new ParallelTasks();
            while (isRunning) {
                int processingNumberOfMessage = 0;
                long start = System.currentTimeMillis();
                for (String incomingJsonString : dmaapService.consumeFromDMaap()) {
                    parallelTasks.add(() -> processReceivedJson(incomingJsonString));
                    processingNumberOfMessage++;
                    if (processingNumberOfMessage == messagesInBatch 
                            || (System.currentTimeMillis() - start) > messagesInTimeInverval) {
                        processingNumberOfMessage = 0;
                        start = System.currentTimeMillis();
                        try {
                            parallelTasks.startParallelTasks();
                        } catch (InterruptedException exception) {
                            LOGGER.error("Processing was interrupted due to :" + exception.getMessage());
                        }        
                        parallelTasks = new ParallelTasks();
                    }
                }
                try {
                    parallelTasks.startParallelTasks();
                } catch (InterruptedException exception) {
                    LOGGER.error("Processing was interrupted due to :" + exception.getMessage());
                }        
                parallelTasks = new ParallelTasks();
            }
        
            /*String incomingJsonString = "";
            incomingJsonString = dmaapService.consume();
            processReceivedJson(incomingJsonString);*/
        } catch (Exception exception) {
            LOGGER.error("Reported exception : " + exception.getMessage(), exception);
        }            
    }

    /**
     * It finds mapping file for received json, transforms json to VES format 
     * and publishes it to outgoing DMaap MR Topic
     * 
     * @param incomingJsonString
     */
    private void processReceivedJson(String incomingJsonString){
        LOGGER.debug("Received incoming message : " + incomingJsonString);
        if (!"".equals(incomingJsonString)) {
            String eventType;
            try {
                eventType = adapterService.identifyEventTypeFromIncomingJson(incomingJsonString);
            
                LOGGER.debug("Event identified as " + eventType);
                String outgoingJsonString;
                    outgoingJsonString = eventAdapter.transform(incomingJsonString, eventType);
                LOGGER.debug("Output VES json to be sent " + outgoingJsonString);
                
//                dmaapService.addMessageInOutgoingQueue(outgoingJsonString);
//                LOGGER.debug("Added message in outgoing Queue ");
                
                dmaapService.publishToDMaap(outgoingJsonString);
                LOGGER.debug("Sent message in outgoing Queue ");
                
                
            } catch (VesException exception) {
                LOGGER.error("Received exception : " + exception.getMessage(), exception);
                
                //TODO KKM : Do we wish to continue the application with same exception in every thread??
                LOGGER.error("APPLICATION WILL BE SHUTDOWN UNTIL ABOVE ISSUE IS RESOLVED.");
                ctx.close();  
            }
        } 
    }
    
    /**
     * method stops universal ves adapter module
     */
    public void stop() {
        
        isRunning = false;
    }
}
