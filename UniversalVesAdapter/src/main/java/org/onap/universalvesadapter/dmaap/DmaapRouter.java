/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
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

package org.onap.universalvesadapter.dmaap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.service.VESGenericMessageProcessor;
import org.onap.universalvesadapter.service.VESRouter;
import org.onap.universalvesadapter.utils.CollectorConfigPropertyRetrieval;
import org.onap.universalvesadapter.utils.DmaapConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DmaapRouter extends VESGenericMessageProcessor implements VESRouter {

	public DmaapRouter(GenericAdapter adapter) {
		super(adapter);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private DmaapConfig dmaapConfig;

	@Value("${defaultConfigFilelocation}")
	private String defaultConfigFilelocation;

	@Autowired
	private CollectorConfigPropertyRetrieval collectorConfigPropertyRetrival;

	@Autowired
	private Creator creator;

	private static List<String> list = new LinkedList<String>();

	private AtomicBoolean running = new AtomicBoolean(true);

	@Override
	public void process() {

		debugLogger.info("Creating Subcriber and Publisher with creator.............");
		String topicName = null;
		String publisherTopic = null;

		// Hashmap of subscriber and publisher details in correspondence to the
		// respective
		// collectors in kv file
		Map<String, String> dmaapTopics = collectorConfigPropertyRetrival.getDmaapTopics("stream_subscriber",
				"stream_publisher", defaultConfigFilelocation);

		ExecutorService executorService = Executors.newFixedThreadPool(dmaapTopics.size());

		for (Map.Entry<String, String> entry : dmaapTopics.entrySet()) {

			String threadName = entry.getKey();

			// subcriber and corresponding publisher topics in a Map
			Map<String, String> subpubTopics = collectorConfigPropertyRetrival.getTopics(entry.getKey(),
					entry.getValue(), defaultConfigFilelocation);

			for (Map.Entry<String, String> entry2 : subpubTopics.entrySet()) {
				topicName = entry2.getKey();
				publisherTopic = entry2.getValue();
			}

			// Publisher and subcriber as per each collector
			DMaaPMRSubscriber subcriber = creator.getDMaaPMRSubscriber(topicName);

			DMaaPMRPublisher publisher = creator.getDMaaPMRPublisher(publisherTopic);

			debugLogger.info("Created subscriber topic:" + topicName + "publisher topic:" + publisherTopic);

			executorService.submit(new Runnable() {

				@Override
				public void run() {

					Thread.currentThread().setName(threadName);

					metricsLogger
							.info("fetch and publish from and to Dmaap started:" + Thread.currentThread().getName());

					int pollingInternalInt = dmaapConfig.getPollingInterval();

					debugLogger.info("The Polling Interval in Milli Second is :{}" + pollingInternalInt);

					debugLogger.info("starting subscriber & publisher thread:{}", Thread.currentThread().getName());

					while (running.get()) {
						synchronized (this) {

							for (String incomingJsonString : subcriber.fetchMessages().getFetchedMessages()) {
								list.add(incomingJsonString);
							}

							if (list.isEmpty()) {
								try {
									Thread.sleep(pollingInternalInt);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}

							debugLogger.debug("number of messages to be converted :{}", list.size());

							String val = ((LinkedList<String>) list).removeFirst();

							List<String> messages = new ArrayList<>();

							String vesEvent = processReceivedJson(val);

							if (vesEvent != null && (!(vesEvent.isEmpty() || vesEvent.equals("")))) {

								messages.add(vesEvent);

								publisher.publish(messages);

								metricsLogger.info("Message successfully published to DMaaP Topic-\n" + vesEvent);
							}
						}
					}
				}
			});
		}

	}

	@Override
	public void terminate() {
		
		debugLogger.info("Stopping subscriber & publisher thread:{}", Thread.currentThread().getName());

		running.set(false);

	}

}
