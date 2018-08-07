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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.onap.universalvesadapter.adapter.UniversalEventAdapter;
import org.onap.universalvesadapter.dmaap.Creator;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.exception.VesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DMaapService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ConfigurableApplicationContext ctx;

	private static List<String> list = new LinkedList<String>();
	@Autowired
	private UniversalEventAdapter eventAdapter;

	/**
	 * It fetches events from DMaap in JSON, transforms JSON to VES format and
	 * publishes it to outgoing DMaap MR Topic
	 * 
	 * @param DMaaPMRSubscriber,DMaaPMRPublisher
	 * @return
	 */
	public void fetchAndPublishInDMaaP(DMaaPMRSubscriber dMaaPMRSubscriber, DMaaPMRPublisher publisher, Creator creater)
			throws InterruptedException {
		LOGGER.info("fetch and publish from and to Dmaap started");

		while (true) {
			synchronized (this) {
				for (String incomingJsonString : dMaaPMRSubscriber.fetchMessages().getFetchedMessages()) {
					list.add(incomingJsonString);

				}

				if (list.size() == 0) {
					Thread.sleep(2000); 
				}
				LOGGER.debug("number of messages to be converted :{}", list.size());

				if (list.size() != 0) {
					String val = ((LinkedList<String>) list).removeFirst();
					List<String> messages = new ArrayList<>();
					String vesEvent = processReceivedJson(val);
					if (!(vesEvent.isEmpty() || vesEvent.equals(null) || vesEvent.equals(""))) {
						messages.add(vesEvent);
						publisher.publish(messages);
						LOGGER.info("Message successfully published to DMaaP Topic");
					}

				}

			}
		}
	}

	/**
	 * It finds mapping file for received json, transforms json to VES format
	 * 
	 * @param incomingJsonString
	 * @return
	 */
	private String processReceivedJson(String incomingJsonString) {
		String outgoingJsonString = null;
		if (!"".equals(incomingJsonString)) {
			// String eventType;
			try {
				/*
				 * For Future events eventType =
				 * adapterService.identifyEventTypeFromIncomingJson(incomingJsonString);
				 * 
				 * LOGGER.debug("Event identified as " + eventType);
				 */

				outgoingJsonString = eventAdapter.transform(incomingJsonString, "snmp");

			} catch (VesException exception) {
				LOGGER.error("Received exception : " + exception.getMessage(), exception);
				LOGGER.error("APPLICATION WILL BE SHUTDOWN UNTIL ABOVE ISSUE IS RESOLVED.");
				// ctx.close();
			} catch (DMaapException e) {
				LOGGER.error("Received exception : ", e.getMessage());
			}
		}
		return outgoingJsonString;
	}

}
