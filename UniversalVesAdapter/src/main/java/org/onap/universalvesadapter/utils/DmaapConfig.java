/*
 * ===============================LICENSE_START======================================
 *  dcae-analytics
 * ================================================================================
 *    Copyright © 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ============================LICENSE_END===========================================
 */
package org.onap.universalvesadapter.utils;

import javax.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:application.properties","classpath:DMaapMR.properties"})
@ConfigurationProperties
public class DmaapConfig {
	
	@Value("${mr.dmaaphost}")
    @NotEmpty
	private String dmaaphost;
	
	 // default port number
	@Value("${mr.DEFAULT_PORT_NUMBER}")
    @NotEmpty
	private int DEFAULT_PORT_NUMBER;
	
	@Value("${mr.POLLING_INTERVAL}")
    @NotEmpty
	private int pollingInterval;
	
	// default to no username
	@Value("${mr.DEFAULT_USER_NAME}")
	private String DEFAULT_USER_NAME;
			
			
	//defaults to no userPassword
	@Value("${mr.DEFAULT_USER_PASSWORD}")
	private String DEFAULT_USER_PASSWORD;
	
	//defaults to using https protocol
	@Value("${mr.DEFAULT_PROTOCOL}")
    @NotEmpty
	private String DEFAULT_PROTOCOL;
	
	//defaults to json content type
	@Value("${mr.DEFAULT_CONTENT_TYPE}")
    @NotEmpty
	private String DEFAULT_CONTENT_TYPE;

	@Value("${mr.DMAAP_URI_PATH_PREFIX}")
    @NotEmpty
	private String DMAAP_URI_PATH_PREFIX;
	
	@Value("${mr.DMAAP_DEFAULT_CONSUMER_ID}")
    @NotEmpty
	private String DMAAP_DEFAULT_CONSUMER_ID;
			 
	@Value("${mr.DMAAP_GROUP_PREFIX}")
    @NotEmpty
	private String DMAAP_GROUP_PREFIX;
  
    // Publisher Constants
			 
    //Dmaap Publisher Topic
	@Value("${mr.publisher.topic}")
    @NotEmpty		
	private String publisherTopic;
			 
    //disable batching by default
	@Value("${mr.publisher.DEFAULT_PUBLISHER_MAX_BATCH_SIZE}")
    @NotEmpty
	private int publisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE;
	
  //default recovery messages size
	@Value("${mr.publisher.DEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE}")
    @NotEmpty
	private int publisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE;
			  
//number of retries when flushing messages
	@Value("${mr.publisher.PUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE}")
    @NotEmpty
	private int publisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE;

  //delay in retrying for flushing messages
	@Value("${mr.publisher.PUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE}")
    @NotEmpty	
	private int publisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE;

  // Subscriber Constants
	
  //Dmaap Subcriber Topic
	@Value("${mr.subscriber.topic}")
    @NotEmpty
	private String subscriberTopic;
	
	@Value("${mr.subcriber.DEFAULT_SUBSCRIBER_TIMEOUT_MS}")
    @NotEmpty
	private int subcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS;
	
	@Value("${mr.subcriber.DEFAULT_SUBSCRIBER_MESSAGE_LIMIT}")
    @NotEmpty
	private int subcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT;
	
	@Value("${mr.subcriber.DEFAULT_SUBSCRIBER_GROUP_PREFIX}")
    @NotEmpty
	private String subcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX;
	
	@Value("${mr.subcriber.SUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME}")
    @NotEmpty
	private String subcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME;
	
	@Value("${mr.subcriber.SUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME}")
    @NotEmpty
	private String subcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME;

	 public void setDmaaphost(String dmaaphost) {
		this.dmaaphost = dmaaphost;
	}
 
	 public String getDmaaphost() {
		return dmaaphost;
	}

	public int getDEFAULT_PORT_NUMBER() {
		return DEFAULT_PORT_NUMBER;
	}

	public void setDEFAULT_PORT_NUMBER(int dEFAULT_PORT_NUMBER) {
		DEFAULT_PORT_NUMBER = dEFAULT_PORT_NUMBER;
	}

	public String getDEFAULT_USER_NAME() {
		return DEFAULT_USER_NAME;
	}

	public void setDEFAULT_USER_NAME(String dEFAULT_USER_NAME) {
		DEFAULT_USER_NAME = dEFAULT_USER_NAME;
	}

	public String getDEFAULT_USER_PASSWORD() {
		return DEFAULT_USER_PASSWORD;
	}

	public void setDEFAULT_USER_PASSWORD(String dEFAULT_USER_PASSWORD) {
		DEFAULT_USER_PASSWORD = dEFAULT_USER_PASSWORD;
	}

	public String getDEFAULT_PROTOCOL() {
		return DEFAULT_PROTOCOL;
	}

	public void setDEFAULT_PROTOCOL(String dEFAULT_PROTOCOL) {
		DEFAULT_PROTOCOL = dEFAULT_PROTOCOL;
	}

	public String getDEFAULT_CONTENT_TYPE() {
		return DEFAULT_CONTENT_TYPE;
	}

	public void setDEFAULT_CONTENT_TYPE(String dEFAULT_CONTENT_TYPE) {
		DEFAULT_CONTENT_TYPE = dEFAULT_CONTENT_TYPE;
	}

	public String getDMAAP_URI_PATH_PREFIX() {
		return DMAAP_URI_PATH_PREFIX;
	}

	public void setDMAAP_URI_PATH_PREFIX(String dMAAP_URI_PATH_PREFIX) {
		DMAAP_URI_PATH_PREFIX = dMAAP_URI_PATH_PREFIX;
	}

	public String getDMAAP_DEFAULT_CONSUMER_ID() {
		return DMAAP_DEFAULT_CONSUMER_ID;
	}

	public void setDMAAP_DEFAULT_CONSUMER_ID(String dMAAP_DEFAULT_CONSUMER_ID) {
		DMAAP_DEFAULT_CONSUMER_ID = dMAAP_DEFAULT_CONSUMER_ID;
	}

	public String getDMAAP_GROUP_PREFIX() {
		return DMAAP_GROUP_PREFIX;
	}

	public void setDMAAP_GROUP_PREFIX(String dMAAP_GROUP_PREFIX) {
		DMAAP_GROUP_PREFIX = dMAAP_GROUP_PREFIX;
	}

	public String getPublisherTopic() {
		return publisherTopic;
	}

	public void setPublisherTopic(String publisherTopic) {
		this.publisherTopic = publisherTopic;
	}

	public int getPublisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE() {
		return publisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE;
	}

	public void setPublisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE(int publisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE) {
		this.publisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE = publisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE;
	}

	public int getPublisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE() {
		return publisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE;
	}

	public void setPublisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE(
			int publisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE) {
		this.publisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE = publisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE;
	}

	public int getPublisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE() {
		return publisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE;
	}

	public void setPublisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE(int publisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE) {
		this.publisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE = publisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE;
	}

	public int getPublisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE() {
		return publisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE;
	}

	public void setPublisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE(int publisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE) {
		this.publisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE = publisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE;
	}

	public String getSubscriberTopic() {
		return subscriberTopic;
	}

	public void setSubscriberTopic(String subscriberTopic) {
		this.subscriberTopic = subscriberTopic;
	}

	public int getSubcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS() {
		return subcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS;
	}

	public void setSubcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS(int subcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS) {
		this.subcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS = subcriberDEFAULT_SUBSCRIBER_TIMEOUT_MS;
	}

	public int getSubcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT() {
		return subcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT;
	}

	public void setSubcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT(int subcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT) {
		this.subcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT = subcriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT;
	}

	public String getSubcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX() {
		return subcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX;
	}

	public void setSubcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX(String subcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX) {
		this.subcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX = subcriberDEFAULT_SUBSCRIBER_GROUP_PREFIX;
	}

	public String getSubcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME() {
		return subcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME;
	}

	public void setSubcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME(String subcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME) {
		this.subcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME = subcriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME;
	}

	public String getSubcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME() {
		return subcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME;
	}

	public void setSubcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME(String subcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME) {
		this.subcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME = subcriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME;
	}

	public int getPollingInterval() {
		return pollingInterval;
	}

	public void setPollingInterval(int pollingInterval) {
		this.pollingInterval = pollingInterval;
	}
	

}
