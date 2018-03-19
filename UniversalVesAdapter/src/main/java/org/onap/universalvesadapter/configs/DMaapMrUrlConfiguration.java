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
