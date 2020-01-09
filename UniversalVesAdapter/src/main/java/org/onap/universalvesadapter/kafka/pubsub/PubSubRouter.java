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

package org.onap.universalvesadapter.kafka.pubsub;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.json.simple.parser.ParseException;
import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.kafka.configs.KafkaConfiguration;
import org.onap.universalvesadapter.kafka.pubsub.pub.ProducerCreator;
import org.onap.universalvesadapter.kafka.pubsub.sub.ConsumerCreator;
import org.onap.universalvesadapter.service.VESGenericMessageProcessor;
import org.onap.universalvesadapter.service.VESRouter;
import org.onap.universalvesadapter.utils.Collector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PubSubRouter extends VESGenericMessageProcessor implements VESRouter {

	@Value("${defaultConfigFilelocation}")
	private String defaultConfigFilelocation;

	private AtomicBoolean running = new AtomicBoolean(true);

	@Autowired
	public PubSubRouter(GenericAdapter adapter) {
		super(adapter);
	}

	@Override
	public void process() {

		ExecutorService executorService = null;
		try {
			executorService = Executors
					.newFixedThreadPool(KafkaConfiguration.get(defaultConfigFilelocation).getCollectors().size());
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			for (Collector collector : KafkaConfiguration.get(defaultConfigFilelocation).getCollectors()) {

				String threadName = collector.getStreamPublisher() + collector.getStreamSubscriber();

				Consumer<String, String> consumer = ConsumerCreator.createConsumer(collector);
				Producer<String, String> producer = ProducerCreator.createProducer(collector);

				executorService.submit(new Runnable() {

					@Override
					public void run() {

						Thread.currentThread().setName(threadName);

						metricsLogger.info(
								"fetch and publish from and to kafka started:" + Thread.currentThread().getName());

						debugLogger
								.info("The Polling Interval in Milli Second is :{}" + collector.getPollingInterval());

						debugLogger.info("Starting pub sub router, for subscriber & publisher thread:{}", Thread.currentThread().getName());

						while (running.get()) {
							synchronized (this) {
								debugLogger.info("{}:Consumer polling:{}", Thread.currentThread().getName(),
										collector.getPollingInterval());

								ConsumerRecords<String, String> consumerRecords = consumer
										.poll(collector.getPollingInterval());

								debugLogger.info("{}:Consumer got:{} messages", Thread.currentThread().getName(),
										consumerRecords.count());

								if (consumerRecords.count() == 0) {

									continue;

								}
								consumerRecords.forEach(record -> {
									debugLogger.info("{}:Processing message", Thread.currentThread().getName());

									String vesEvent = processReceivedJson(record.value());

									if (vesEvent != null && (!(vesEvent.isEmpty() || vesEvent.equals("")))) {
										debugLogger.info("{}:Sending message", Thread.currentThread().getName());
										ProducerRecord<String, String> vesRecord = new ProducerRecord<String, String>(
												collector.getStreamPublisher(), vesEvent);

										sendData(producer, vesRecord);

									}
								});

								// commits the offset of record to broker.
								consumer.commitAsync();
							}
						}
					}
				});
			}
		} catch (IOException | ParseException e) {
			debugLogger.info("Fatal exception: {}, shutting down the mapper", e);
			terminate();
			return;
		}

	}

	private RecordMetadata sendData(Producer<String, String> producer, ProducerRecord<String, String> vesRecord) {
		RecordMetadata metadata = null;
		try {

			metadata = producer.send(vesRecord).get();
			debugLogger.info("Successfully sent to :" + metadata.topic());

		}

		catch (ExecutionException e) {

			debugLogger.info("Error in sending record: {}", e);

		}

		catch (InterruptedException e) {

			debugLogger.info("Error in sending record: {}", e);

		}
		return metadata;
	}

	@Override
	public void terminate() {
		
		debugLogger.info("Stopping pub sub router:{}", Thread.currentThread().getName());
		running.set(true);
	}

}
