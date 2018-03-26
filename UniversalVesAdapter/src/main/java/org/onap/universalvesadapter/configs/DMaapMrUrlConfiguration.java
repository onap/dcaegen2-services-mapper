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
package org.onap.universalvesadapter.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Configuration for Dmaap MR Service
 * 
 * @author kmalbari
 *
 */
@Component
public class DMaapMrUrlConfiguration extends Configuration {
	
	@Value("${dmaap.url}")
	private String url;
	
	@Value("${dmaap.consumer_props}")
	private String consumerProperties;

	@Value("${dmaap.publisher_props}")
	private String publisherProperties;

	public String getPublisherProperties() {
		return publisherProperties;
	}

	public String getConsumerProperties() {
		return consumerProperties;
	}

	public String getUrl() {
		return url;
	}
	
	
}
