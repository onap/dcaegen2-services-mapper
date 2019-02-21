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

package org.onap.universalvesadapter.configs;

import java.io.IOException;

import javax.annotation.Nonnull;

import org.onap.universalvesadapter.utils.DmaapConfig;

import com.google.common.base.Objects;

/**
 * <p>
 *      Immutable DMaaP MR Configuration for Subscriber.
 * <p>
 *      Use {@link DMaaPMRSubscriberConfig.Builder} to construct Subscriber Configuration
 * <p>
 *
 * @author Rajiv Singla . Creation Date: 10/12/2016.
 */
public final class DMaaPMRSubscriberConfig extends DMaaPMRBaseConfig {

    private final String consumerId;
    private final String consumerGroup;
    private final int timeoutMS;
    private final int messageLimit;
    private  String timeoutMSParam;
	private String messageLimitParam;
	private String uriPrefix;
   
	private DMaaPMRSubscriberConfig(@Nonnull String hostName,
                                    @Nonnull Integer portNumber,
                                    @Nonnull String topicName,
                                    @Nonnull String protocol,
                                    String userName,
                                    String userPassword,
                                    @Nonnull String contentType,
                                    @Nonnull String consumerId,
                                    @Nonnull String consumerGroup,
                                    @Nonnull int timeoutMS,
                                    @Nonnull int messageLimit,
                                    String timeoutMSParam,
                                    String messageLimitParam,
                                    String uriPrefix) {
        this.hostName = hostName;
        this.portNumber = portNumber;
        this.topicName = topicName;
        this.protocol = protocol;
        this.userName = userName;
        this.userPassword = userPassword;
        this.contentType = contentType;
        this.consumerId = consumerId;
        this.consumerGroup = consumerGroup;
        this.timeoutMS = timeoutMS;
        this.messageLimit = messageLimit;
        this.timeoutMSParam=timeoutMSParam;
    	this.messageLimitParam=messageLimitParam;
    	this.uriPrefix=uriPrefix;
        
       
    }

    /**
     * Builder to initialize immutable {@link DMaaPMRSubscriberConfig} object
     */
    public static class Builder {

        private String hostName;
        private Integer portNumber;
        private String topicName;
        private String userName;
        private String userPassword;
        private String protocol;
        private String contentType;
        private String consumerId;
        private String consumerGroup;
        private int timeoutMS;
        private int messageLimit;
		private String timeoutMSParam;
		private String messageLimitParam;
		private String uriPreifix;
        


		public Builder(@Nonnull String hostName,
                       @Nonnull String topicName, DmaapConfig dmaapConfig) throws IOException {
        	
            // Required Values
            this.hostName = hostName;
            this.topicName = topicName;
            // Default values
            this.portNumber = dmaapConfig.getDEFAULT_PORT_NUMBER();
            this.userName = dmaapConfig.getDEFAULT_USER_NAME();
            this.userPassword = dmaapConfig.getDEFAULT_USER_PASSWORD();
            this.protocol = dmaapConfig.getDEFAULT_PROTOCOL();
            this.contentType =  dmaapConfig.getDEFAULT_CONTENT_TYPE();
            this.consumerId =  dmaapConfig.getDMAAP_DEFAULT_CONSUMER_ID();
            this.consumerGroup = dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_GROUP_PREFIX();
            this.timeoutMS =dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_TIMEOUT_MS();
            this.messageLimit = dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT();
            this.timeoutMSParam=dmaapConfig.getsubscriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME();
            this.messageLimitParam=dmaapConfig.getsubscriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME();
            this.uriPreifix=dmaapConfig.getDMAAP_URI_PATH_PREFIX();
            
        }


        /**
         * Setup for custom host port number - Defaults to 80.
         *
         * @param portNumber custom port number
         * @return Builder object itself for chaining
         */
        public Builder setPortNumber(@Nonnull Integer portNumber) {
            this.portNumber = portNumber;
            return this;
        }


        /**
         * Setup user name for authentication. If no username is provided authentication will be disabled
         *
         * @param userName user name for DMaaP Topic Authentication
         * @return Builder object itself for chaining
         */
        public Builder setUserName(@Nonnull String userName) {
            this.userName = userName;
            return this;
        }


        /**
         * Setup user password for authentication. If no password is provided authentication will be disabled
         *
         * @param userPassword user password for DMaaP Topic Authentication
         * @return Builder object itself for chaining
         */
        public Builder setUserPassword(@Nonnull String userPassword) {
            this.userPassword = userPassword;
            return this;
        }


        /**
         * Setup custom Subscriber protocol - Defaults to https.
         * Note: Only http and https are currently supported.
         *
         * @param protocol protocol e.g. https or http
         * @return Builder object itself for chaining
         */
        public Builder setProtocol(@Nonnull String protocol) {

            this.protocol = normalizeValidateProtocol(protocol);
            return this;
        }

        /**
         * Setup custom Subscriber content-type - Defaults to application/json
         *
         * @param contentType content type e.g. application/json
         * @return Builder object itself for chaining
         */
        public Builder setContentType(@Nonnull String contentType) {
            final String normalizedContentType = normalizeValidateContentType(contentType);
            this.contentType = normalizedContentType;
            return this;
        }


        /**
         * Setup custom Consumer Id - Defaults to random Id
         *
         * @param consumerId - custom consumer ID
         * @return Builder object itself for chaining
         */
        public Builder setConsumerId(@Nonnull String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * Setup custom Consumer Group - Default to OpenDCAE-DMaaPSub-ConsumerID
         *
         * @param consumerGroup - custom Consumer Group
         * @return Builder object itself for chaining
         */
        public Builder setConsumerGroup(@Nonnull String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * Setup Custom Subscriber timeout in ms - Default to no timeout limit
         *
         * @param timeoutMS timeout in milliseconds
         * @return Builder object itself for chaining
         */
        public Builder setTimeoutMS(@Nonnull int timeoutMS) {
            this.timeoutMS = timeoutMS;
            return this;
        }

        /**
         * Setup custom Subscriber Message Limit - Default to no limit
         *
         * @param messageLimit message Limit
         * @return Builder object itself for chaining
         */
        public Builder setMessageLimit(@Nonnull int messageLimit) {
            this.messageLimit = messageLimit;
            return this;
        }

        /**
         * Builds Immutable instance of {@link DMaaPMRSubscriberConfig}
         *
         * @return immutable DMaaP Subscriber Config Object
         * @throws IOException 
         */
        public DMaaPMRSubscriberConfig build() throws IOException {
            return new DMaaPMRSubscriberConfig(hostName, portNumber, topicName, protocol, userName, userPassword,
                    contentType, consumerId, consumerGroup, timeoutMS, messageLimit, timeoutMSParam, messageLimitParam,
                    uriPreifix);
        }

    }


    public String getTimeoutMSParam() {
		return timeoutMSParam;
	}

	public void setTimeoutMSParam(String timeoutMSParam) {
		this.timeoutMSParam = timeoutMSParam;
	}

	public String getMessageLimitParam() {
		return messageLimitParam;
	}

	public void setMessageLimitParam(String messageLimitParam) {
		this.messageLimitParam = messageLimitParam;
	}

	public String getUriPrefix() {
		return uriPrefix;
	}

	public void setUriPrefix(String uriPreifix) {
		this.uriPrefix = uriPreifix;
	}

	/**
     * DMaaP MR Subscriber Consumer Id
     *
     * @return consumer Id
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * DMaaP MR Subscriber Consumer Group
     *
     * @return consumer group
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * DMaaP MR Subscriber Timeout in ms
     *
     * @return subscriber timeout ms
     */
    public int getTimeoutMS() {
        return timeoutMS;
    }

    /**
     * DMaaP MR Subscriber message limit
     *
     * @return subscriber message limit
     */
    public int getMessageLimit() {
        return messageLimit;
    }

    /**
     * DMaaP property file
     *
     * @return Properties
     */
  
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        DMaaPMRSubscriberConfig that = (DMaaPMRSubscriberConfig) o;
        return Objects.equal(consumerId, that.consumerId) &&
                Objects.equal(consumerGroup, that.consumerGroup) &&
                Objects.equal(timeoutMS, that.timeoutMS) &&
                Objects.equal(messageLimit, that.messageLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), consumerId, consumerGroup, timeoutMS, messageLimit);
    }

}
