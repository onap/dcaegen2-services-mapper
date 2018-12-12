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
package org.onap.universalvesadapter.controller;

import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.service.VESAdapterInitializer;
import org.onap.universalvesadapter.service.VesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This controller will be starting point for this micro service. On triggering, it will listen to Dmaap topic for events.
 * 
 * @author kmalbari
 */

@RestController
public class VesController {

	private static final Logger metricsLogger = LoggerFactory.getLogger("metricsLogger");
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	
    @Autowired
    private VesService vesService;
    
    @Autowired
    private VESAdapterInitializer vESAdapterInitializer;
    
    /**
     * @return message that application is started
     */
    @RequestMapping("/start")
    public String start() {
    	
    	metricsLogger.info("UniversalVesAdapter Application starting...");
    	
    	try {
			vesService.start();
		} catch (MapperConfigException e) {
			
			errorLogger.error("Config error:{}",e.getMessage(),e.getCause());
		}
        return "Application started";
    }
    
    @RequestMapping("/reload")
    public void reloadMappingFileFromDB() {
    	debugLogger.debug("Reload of Mapping File is started");
    	vESAdapterInitializer.fetchMappingFile();
    	debugLogger.debug("Reload of Mapping File is completed");
    }
    
    @RequestMapping("/healthcheck")
    public String healthcheck() {
    	
    	metricsLogger.info("UniversalVesAdapter Application is up & running...");
    	return "UniversalVesAdapter Application is up & running...";
    }   
    
    /**
     * @return message that application stop process is triggered
     */
    @RequestMapping("/stop")
    public String stop() {
    	
    	vesService.stop();
    	metricsLogger.info("UniversalVesAdapter Application is stopping...");
    	return "Application will be stopped soon";
    }    
}
