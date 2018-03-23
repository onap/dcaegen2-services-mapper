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

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
    private VesService vesService;
    
    /**
     * @return message that application is started
     */
    @RequestMapping("/start")
    public String start() {
    	
    	LOGGER.debug("UniversalVesAdapter Application starting...");
    	vesService.start();
        return "Application started";
    }
    
    /**
     * @return message that application stop process is triggered
     */
    @RequestMapping("/stop")
    public String stop() {
    	
    	vesService.stop();
    	LOGGER.debug("UniversalVesAdapter Application is stopping...");
    	return "Application will be stopped soon";
    }    
}
