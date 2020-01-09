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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Collector {
	private final String kafkaBrokers;
	private final String clientId;
	private final String groupIdConfig;
	private final String offsetResetLatest;
	private final String offsetResetEarlier;
	private final int maxPollRecords;
	private final String streamSubscriber;
	private final String identifier;
	private final String streamPublisher;
	private final String topicName;
	private final String enableAutoCommitConfig;
	private final int pollingInterval;

	@JsonCreator
	public Collector(@JsonProperty("kafkaBrokers") String kafkaBrokers, @JsonProperty("clientId") String clientId,
			@JsonProperty("groupIdConfig") String groupIdConfig,
			@JsonProperty("offsetResetLatest") String offsetResetLatest,
			@JsonProperty("offsetResetEarlier") String offsetResetEarlier,
			@JsonProperty("maxPollRecords") int maxPollRecords,
			@JsonProperty("pollingInterval") int pollingInterval,
			@JsonProperty("topic_name") String topicName,
			@JsonProperty("enable_auto_commit_config") String enableAutoCommitConfig,
			@JsonProperty("stream_subscriber") String streamSubscriber,
			@JsonProperty("identifier") String identifier, 
			@JsonProperty("stream_publisher") String streamPublisher) {
		super();
		this.kafkaBrokers = kafkaBrokers;
		this.clientId = clientId;
		this.groupIdConfig = groupIdConfig;
		this.offsetResetLatest = offsetResetLatest;
		this.offsetResetEarlier = offsetResetEarlier;
		this.maxPollRecords = maxPollRecords;
		this.streamSubscriber = streamSubscriber;
		this.identifier = identifier;
		this.streamPublisher = streamPublisher;
		this.enableAutoCommitConfig = enableAutoCommitConfig;
		this.pollingInterval = pollingInterval;
		this.topicName = topicName;
	}

	public String getKafkaBrokers() {
		return kafkaBrokers;
	}

	public String getClientId() {
		return clientId;
	}

	public String getGroupIdConfig() {
		return groupIdConfig;
	}

	public String getOffsetResetLatest() {
		return offsetResetLatest;
	}

	public String getOffsetResetEarlier() {
		return offsetResetEarlier;
	}

	public int getMaxPollRecords() {
		return maxPollRecords;
	}

	public int getPollingInterval() {
		return pollingInterval;
	}

	public String getStreamSubscriber() {
		return streamSubscriber;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getStreamPublisher() {
		return streamPublisher;
	}

	public String getTopicName() {
		return topicName;
	}

	public String getEnableAutoCommitConfig() {
		return enableAutoCommitConfig;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((groupIdConfig == null) ? 0 : groupIdConfig.hashCode());
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((kafkaBrokers == null) ? 0 : kafkaBrokers.hashCode());
		result = prime * result + maxPollRecords;
		result = prime * result + ((offsetResetEarlier == null) ? 0 : offsetResetEarlier.hashCode());
		result = prime * result + ((offsetResetLatest == null) ? 0 : offsetResetLatest.hashCode());
		result = prime * result + ((streamPublisher == null) ? 0 : streamPublisher.hashCode());
		result = prime * result + ((streamSubscriber == null) ? 0 : streamSubscriber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collector other = (Collector) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (groupIdConfig == null) {
			if (other.groupIdConfig != null)
				return false;
		} else if (!groupIdConfig.equals(other.groupIdConfig))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (kafkaBrokers == null) {
			if (other.kafkaBrokers != null)
				return false;
		} else if (!kafkaBrokers.equals(other.kafkaBrokers))
			return false;
		if (maxPollRecords != other.maxPollRecords)
			return false;
		if (offsetResetEarlier == null) {
			if (other.offsetResetEarlier != null)
				return false;
		} else if (!offsetResetEarlier.equals(other.offsetResetEarlier))
			return false;
		if (offsetResetLatest == null) {
			if (other.offsetResetLatest != null)
				return false;
		} else if (!offsetResetLatest.equals(other.offsetResetLatest))
			return false;
		if (streamPublisher == null) {
			if (other.streamPublisher != null)
				return false;
		} else if (!streamPublisher.equals(other.streamPublisher))
			return false;
		if (streamSubscriber == null) {
			if (other.streamSubscriber != null)
				return false;
		} else if (!streamSubscriber.equals(other.streamSubscriber))
			return false;
		return true;
	}

}
