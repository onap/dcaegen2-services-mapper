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
