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

import org.onap.universalvesadapter.dmaap.Creator;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.exception.MapperConfigException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Service that starts the universal ves adapter module to listen for events
 * 
 * @author kmalbari
 *
 */
@Component
public class VesService {

	private final Logger LOGGER = LoggerFactory.getLogger(VesService.class);

	private boolean isRunning = true;

	@Autowired
	private DMaapService dmaapService;

	@Autowired
	private Creator creator;


	/**
	 * method triggers universal VES adapter module.
	 */
	public void start() throws MapperConfigException {
		LOGGER.debug("Creating Subcriber and Publisher with creator.............");
		DMaaPMRSubscriber subcriber = creator.getDMaaPMRSubscriber();

		DMaaPMRPublisher publisher = creator.getDMaaPMRPublisher();

		// Create subscriber & publisher thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					LOGGER.debug("starting subscriber & publisher thread:{}", Thread.currentThread().getName());
					dmaapService.fetchAndPublishInDMaaP(subcriber, publisher, creator);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start subscriber & publisher thread
		t1.setName("SNMP-COLLECTOR");
		t1.start();

	}

	/**
	 * method stops universal ves adapter module
	 */
	public void stop() {
		isRunning = false;
	}
}

