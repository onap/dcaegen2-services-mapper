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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppPreferences {
	private final List<Collector> collectors;
	private final List<StreamsCollector> streamsCollectors;

	@JsonCreator
	public AppPreferences(@JsonProperty("collectors") List<Collector> collectors, @JsonProperty("streams") List<StreamsCollector> streamsCollectors) {
		super();
		this.collectors = collectors;
		this.streamsCollectors = streamsCollectors;
	}

	public List<Collector> getCollectors() {
		return collectors;
	}

	public List<StreamsCollector> getStreamsCollectors() {
		return streamsCollectors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectors == null) ? 0 : collectors.hashCode());
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
		AppPreferences other = (AppPreferences) obj;
		if (collectors == null) {
			if (other.collectors != null)
				return false;
		} else if (!collectors.equals(other.collectors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AppPreferences [collectors=" + collectors + "]";
	}
	

}
