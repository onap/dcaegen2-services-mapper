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

package org.onap.universalvesadapter.kafka.streams;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.json.simple.parser.ParseException;
import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.kafka.configs.KafkaConfiguration;
import org.onap.universalvesadapter.service.VESGenericMessageProcessor;
import org.onap.universalvesadapter.service.VESRouter;
import org.onap.universalvesadapter.utils.StreamsCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.att.aft.dme2.internal.google.common.collect.Lists;

@Component
public class StreamsRouter extends VESGenericMessageProcessor implements VESRouter {

	@Value("${defaultConfigFilelocation}")
	private String defaultConfigFilelocation;

	private List<KafkaStreams> streams;

	@Autowired
	public StreamsRouter(GenericAdapter adapter) {
		super(adapter);
	}

	private void createStream(final StreamsBuilder builder, String inputTopic, String outputTopic) {
		final KStream<String, String> events = builder.stream(inputTopic);

		events.mapValues(v -> processReceivedJson(v)).to(outputTopic);
	}

	@Override
	public void process() {

		ExecutorService executorService = null;
		try {
			executorService = Executors
					.newFixedThreadPool(KafkaConfiguration.get(defaultConfigFilelocation).getCollectors().size());
			streams = Lists.newArrayList();

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			for (StreamsCollector collector : KafkaConfiguration.get(defaultConfigFilelocation)
					.getStreamsCollectors()) {

				executorService.submit(new Runnable() {

					@Override
					public void run() {
						final StreamsBuilder builder = new StreamsBuilder();

						createStream(builder, collector.getStreamSubscriber(), collector.getStreamPublisher());

						KafkaStreams stream = new KafkaStreams(builder.build(), collector.getStreamsConfiguration());

						stream.cleanUp();

						debugLogger.debug("Started stream for {}",collector.getStreamSubscriber());
						stream.start();

						Runtime.getRuntime().addShutdownHook(new Thread(stream::close));

						streams.add(stream);
					}
				});
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void terminate() {

		for (KafkaStreams stream : streams) {
			stream.close();
		}
		debugLogger.debug("Closed streams");

	}

}
