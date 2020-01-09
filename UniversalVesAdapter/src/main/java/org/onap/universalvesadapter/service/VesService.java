/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2018-2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.universalvesadapter.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.onap.universalvesadapter.adapter.UniversalEventAdapter;
import org.onap.universalvesadapter.dmaap.Creator;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.utils.CollectorConfigPropertyRetrieval;
import org.onap.universalvesadapter.utils.DmaapConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Service that starts the universal ves adapter module to listen for events
 *
 * @author kmalbari,rrocher
 *
 */
/**
 * @author PM00501616
 *
 */

@Component
public class VesService {

	private static final Logger metricsLogger = LoggerFactory.getLogger("metricsLogger");
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	private boolean isRunning = true;

	@Value("${defaultConfigFilelocation}")
	private String defaultConfigFilelocation;

	@Value("${mode}")
	private FunctionMode mode;

	@Autowired
	private VESRouter pubSubRouter;

	@Autowired
	private VESRouter dmaapRouter;

	@Autowired
	private VESRouter streamsRouter;

	/**
	 * method triggers universal VES adapter module.
	 */
	public void start() throws MapperConfigException {

		switch (mode) {
		case KAFKA:
			pubSubRouter.process();
			break;
		case DMAAP:
			dmaapRouter.process();
			break;
		case STREAMS:
			streamsRouter.process();
			break;
		default:
			break;
		}
	}

	/**
	 * method stops universal ves adapter module
	 */
	public void stop() {
		isRunning = false;

		switch (mode) {
		case KAFKA:
			pubSubRouter.terminate();
			break;
		case DMAAP:
			dmaapRouter.terminate();
			break;
		case STREAMS:
			streamsRouter.terminate();
			break;
		default:
			break;
		}
	}

}
