/*
 * ===============================LICENSE_START======================================
 *  dcae-analytics
 * ================================================================================
 *    Copyright Â© 2017 AT&T Intellectual Property. All rights reserved.
 *    Copyright (C) 2022 Huawei. All rights reserved.
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


//TO-DO Lisence Issue ASK to Kedar???????????
package org.onap.universalvesadapter.configs;

import java.io.IOException;
import javax.annotation.Nonnull;
import org.onap.universalvesadapter.utils.DmaapConfig;
import com.att.aft.dme2.internal.springframework.context.annotation.ComponentScan;
import com.google.common.base.Objects;

/**
 * <p>
 * Immutable DMaaP MR Configuration for DMaaP MR Publisher.
 * <p>
 * Use {@link DMaaPMRPublisherConfig.Builder} to construct Subscriber
 * Configuration
 * </p>
 * <p>
 * 
 * @author Rajiv Singla . Creation Date: 10/12/2016.
 * 
 */
@ComponentScan
public class DMaaPMRPublisherConfig extends DMaaPMRBaseConfig {

    /**
     * Publisher batching queue size
     */
    private int maxBatchSize;

    /**
     * Publisher Recovery Queue Size
     */
    private int maxRecoveryQueueSize;

    /**
     * Default uri path prefix
     */
    private String dmaapUriPathPrefix ;

    public DMaaPMRPublisherConfig(Builder builder) {
        this.hostName = builder.hostName;
        this.portNumber = builder.portNumber;
        this.topicName = builder.topicName;
        this.protocol = builder.protocol;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
        this.contentType = builder.contentType;
        this.maxBatchSize = builder.maxBatchSize;
        this.maxRecoveryQueueSize = builder.maxRecoveryQueueSize;
        this.dmaapUriPathPrefix = builder.dmaapUriPathPrefix;
    }

    /**
     * Builder to initialize immutable {@link DMaaPMRPublisherConfig} object
     */
    public static class Builder {

        private String hostName;
        private Integer portNumber;
        private String topicName;
        private String userName;
        private String userPassword;
        private String protocol;
        private String contentType;
        private int maxBatchSize;
        private int maxRecoveryQueueSize;
        private String dmaapUriPathPrefix ;



        public Builder(@Nonnull String topicName, DmaapConfig dmaapConfig) throws IOException {
            this.topicName = topicName;
            this.hostName = dmaapConfig.getDmaaphost();
            this.portNumber = dmaapConfig.getDEFAULT_PORT_NUMBER();
            // Default values

            this.userName = dmaapConfig.getDEFAULT_USER_NAME();
            this.userPassword = dmaapConfig.getDEFAULT_USER_PASSWORD();
            this.protocol =dmaapConfig.getDEFAULT_PROTOCOL();
            this.contentType = dmaapConfig.getDEFAULT_CONTENT_TYPE();

            this.maxBatchSize =dmaapConfig.getPublisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE();
            this.maxRecoveryQueueSize = dmaapConfig.getPublisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE();
            this.dmaapUriPathPrefix=dmaapConfig.getDMAAP_URI_PATH_PREFIX();
        }

        /**
         * Setup for custom host port number - Defaults to 80.
         *
         * @param portNumber
         *            custom port number
         * @return Builder object itself for chaining
         */
        public Builder setPortNumber(@Nonnull Integer portNumber) {
            this.portNumber = portNumber;
            return this;
        }

        /**
         * Setup user name for authentication. If no username is provided authentication
         * will be disabled
         *
         * @param userName
         *            user name for DMaaP Topic Authentication
         * @return Builder object itself for chaining
         */
        public Builder setUserName(@Nonnull String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setup user password for authentication. If no password is provided
         * authentication will be disabled
         *
         * @param userPassword
         *            user password for DMaaP Topic Authentication
         * @return Builder object itself for chaining
         */
        public Builder setUserPassword(@Nonnull String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        /**
         * Setup custom Publisher protocol - Defaults to https. Note: Only http and
         * https are currently supported.
         *
         * @param protocol
         *            protocol e.g. https
         * @return Builder object itself for chaining
         */
        public Builder setProtocol(@Nonnull String protocol) {
            this.protocol = normalizeValidateProtocol(protocol);
            return this;
        }

        /**
         * Setup custom Publisher content-type - Defaults to application/json
         *
         * @param contentType
         *            content type e.g. application/json
         * @return Builder object itself for chaining
         */
        public Builder setContentType(@Nonnull String contentType) {
            final String normalizedContentType = normalizeValidateContentType(contentType);
            this.contentType = normalizedContentType;
            return this;
        }

        /**
         * Setup custom Publisher Max Batch Size - Defaults to 100
         *
         * @param maxBatchSize
         *            max Batch Size
         * @return Builder object itself for chaining
         */
        public Builder setMaxBatchSize(int maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        /**
         * Setup custom Maximum Recovery Queue Size. Recovery Queue is used to hold
         * messages temporarily in case DMaaP MR Publisher topic is not responding for
         * any reason. Defaults to 100,000
         *
         * @param maxRecoveryQueueSize
         *            max recovery queue size
         * @return Builder object itself for chaining
         */
        public Builder setMaxRecoveryQueueSize(int maxRecoveryQueueSize) {
            this.maxRecoveryQueueSize = maxRecoveryQueueSize;
            return this;
        }


        /**
         * Creates immutable instance of {@link DMaaPMRPublisherConfig}
         *
         * @return Builds and returns thread safe, immutable
         *         {@link DMaaPMRPublisherConfig} object
         */
        public DMaaPMRPublisherConfig build() {
            return new DMaaPMRPublisherConfig(this);
        }

    }
    public String getDmaapUriPathPrefix() {
        return dmaapUriPathPrefix;
    }

    /**
     * Returns max Publisher Batch Queue Size
     *
     * @return max Publisher Batch Queue size
     */
    public int getMaxBatchSize() {
        return maxBatchSize;
    }

    /**
     * Returns max Publisher Recovery Queue Size
     *
     * @return max Recovery Queue size
     */
    public int getMaxRecoveryQueueSize() {
        return maxRecoveryQueueSize;
    }

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
        DMaaPMRPublisherConfig that = (DMaaPMRPublisherConfig) o;
        return maxBatchSize == that.maxBatchSize && maxRecoveryQueueSize == that.maxRecoveryQueueSize;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), maxBatchSize, maxRecoveryQueueSize);
    }

}

