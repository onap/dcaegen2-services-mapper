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
package org.onap.universalvesadapter.dmaap;

import java.io.IOException;
import java.io.InputStream;

import org.onap.universalvesadapter.configs.DMaaPMRPublisherConfig;
import org.onap.universalvesadapter.configs.DMaaPMRSubscriberConfig;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.utils.DmaapConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Creator {

	private final Logger LOGGER = LoggerFactory.getLogger(Creator.class);

	private InputStream input = null;
	private DMaaPMRFactory dMaaPMRFactoryInstance;
	private String hostname;
	private String publisherTopic;
	private String subcriberTopic;
    private DmaapConfig dmaapConfig;

    @Autowired
	public void setDmaapConfig(DmaapConfig dmaapConfig) {
		this.dmaapConfig = dmaapConfig;
	}

	public Creator() {

	}

	// prop initializer

	public void propertyFileInitializer() {
	
			this.hostname = dmaapConfig.getHostname();
			this.publisherTopic = dmaapConfig.getPublisherTopic();
			this.subcriberTopic = dmaapConfig.getSubscriberTopic();
			this.dMaaPMRFactoryInstance = DMaaPMRFactory.create();
			LOGGER.info("The Hostname of DMaap is :" + hostname);
		

	}

	// publisher 
	public DMaaPMRPublisher getDMaaPMRPublisher(){
		propertyFileInitializer();
		DMaaPMRPublisherConfig dMaaPMRPublisherConfig = null;
		try {
			dMaaPMRPublisherConfig = new DMaaPMRPublisherConfig.Builder(hostname, publisherTopic,dmaapConfig).build();
		} catch (IOException e) {
			LOGGER.error("failed or interrupted I/O operations while creating publisher config:{}",e.getCause());
		}
		return dMaaPMRFactoryInstance.createPublisher(dMaaPMRPublisherConfig);
	}

	// subscriber
	public DMaaPMRSubscriber getDMaaPMRSubscriber(){
		propertyFileInitializer();
		DMaaPMRSubscriberConfig dMaaPMRSubscriberConfig = null;
		try {
			dMaaPMRSubscriberConfig = new DMaaPMRSubscriberConfig.Builder(hostname, subcriberTopic,	dmaapConfig).build();
		} catch (IOException e) {
			
			LOGGER.error("failed or interrupted I/O operations while creating subcriber config:{}",e.getCause());
		}
		
		return dMaaPMRFactoryInstance.createSubscriber(dMaaPMRSubscriberConfig);

	}

}
