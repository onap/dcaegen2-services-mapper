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

package org.onap.universalvesadapter.utils;

import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StreamsCollector {
	private Properties streamsConfiguration;
	private final String streamSubscriber;
	private final String streamPublisher;

	@JsonCreator
	public StreamsCollector(@JsonProperty("application_id_config") String applicationIdConfig,
			@JsonProperty("kafkaBrokers") String bootstrapServersConfig,
			@JsonProperty("clientId") String clientId,
			@JsonProperty("groupIdConfig") String groupIdConfig,
			@JsonProperty("commit_interval_ms_config") int commitIntervalMsConfig,
			@JsonProperty("cache_max_bytes_buffering_config") int cacheMaxBytesBufferingConfig,
			@JsonProperty("stream_subscriber") String streamSubscriber,
			@JsonProperty("stream_publisher") String streamPublisher) {
		this.streamsConfiguration = new Properties();
		this.streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, applicationIdConfig);
		this.streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, clientId);
		this.streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServersConfig);
		this.streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG,
				Serdes.String().getClass().getName());
		this.streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,
				Serdes.String().getClass().getName());
		
//		this.streamsConfiguration.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, commitIntervalMsConfig);
//		this.streamsConfiguration.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, cacheMaxBytesBufferingConfig);
//		this.streamsConfiguration.put(StreamsConfig.STATE_DIR_CONFIG, TestUtils.tempDirectory().getAbsolutePath());
		this.streamSubscriber = streamSubscriber;
		this.streamPublisher = streamPublisher;

	}

	public Properties getStreamsConfiguration() {
		return this.streamsConfiguration;
	}

	public String getStreamSubscriber() {
		return this.streamSubscriber;
	}

	public String getStreamPublisher() {
		return this.streamPublisher;
	}
}
