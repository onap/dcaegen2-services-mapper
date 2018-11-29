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

package org.onap.universalvesadapter.dmaap.MRPublisher;

import static java.lang.String.format;


import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.onap.universalvesadapter.configs.DMaaPMRPublisherConfig;
import org.onap.universalvesadapter.dmaap.BaseDMaaPMRComponent;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.utils.HTTPUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.att.aft.dme2.internal.springframework.context.annotation.ComponentScan;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;



/**
 * Concrete Implementation of {@link DMaaPMRPublisher} which uses {@link HttpClient}
 *
 * @author Rajiv Singla . Creation Date: 10/13/2016.
 */
@ComponentScan
public class DMaaPMRPublisherImpl extends BaseDMaaPMRComponent implements DMaaPMRPublisher {
	
	@Value("${mr.publisher.PUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE}")
    private int publisherMaxFlushRetries;
  

	 private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	 private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	 static

    public int a =2;
    private final DMaaPMRPublisherConfig publisherConfig;
    private final CloseableHttpClient closeableHttpClient;
    private final DMaaPMRPublisherQueue publisherQueue;
    private final Date publisherCreationTime;
    private URI publisherUri;

    @Inject
    public DMaaPMRPublisherImpl(@Assisted DMaaPMRPublisherConfig publisherConfig,
                                DMaaPMRPublisherQueueFactory dMaaPMRPublisherQueueFactory,
                                CloseableHttpClient closeableHttpClient){

        this.publisherConfig = publisherConfig;
        final int maxBatchSize = publisherConfig.getMaxBatchSize() > 0 ? publisherConfig.getMaxBatchSize() : 1;
        this.publisherQueue = dMaaPMRPublisherQueueFactory.create(
                maxBatchSize, publisherConfig.getMaxRecoveryQueueSize());
        this.closeableHttpClient = closeableHttpClient;
        this.publisherUri = createPublisherURI(publisherConfig);
        this.publisherCreationTime = new Date();
    }


    @Override
    public DMaaPMRPublisherResponse publish(List<String> messages)  {

        final int batchQueueRemainingSize = publisherQueue.getBatchQueueRemainingSize();

        // if messages size is less than batch queue size - just queue them for batch publishing
        if (batchQueueRemainingSize > messages.size()) {
        	debugLogger.debug("Adding messages to batch Queue. No flushing required. Messages Size:{}. Batch Queue Size:{}",
                    messages.size(), batchQueueRemainingSize);
            final int batchQueueSize = publisherQueue.addBatchMessages(messages);
            return createPublisherAcceptedResponse(batchQueueSize);

        } else {

            // grab all already queued messages, append current messages and force publish them to DMaaP MR topic
            final List<String> queueMessages = publisherQueue.getMessageForPublishing();
            debugLogger.debug("Batch Queue capacity exceeds messages size. Flushing of all pending messages to DMaaP MR " +
                    "Publisher Topic.");
            return forcePublish(Lists.newLinkedList(Iterables.concat(queueMessages, messages)));
        }

    }

    @Override
    public DMaaPMRPublisherResponse forcePublish(List<String> messages) {

    	debugLogger.debug("Force publishing messages to DMaaP MR Topic. Messages Size: {}", messages.size());

        final String contentType = publisherConfig.getContentType();
        final String userName =(publisherConfig.getUserName().equals("null")) ? null : publisherConfig.getUserName();
        final String userPassword = (publisherConfig.getUserPassword().equals("null")) ? null : publisherConfig.getUserPassword();
        final HttpPost postRequest = new HttpPost(publisherUri);
       
        // add Authorization Header if username and password are present
        final Optional<String> authHeader = getAuthHeader(userName, userPassword);
        if (authHeader.isPresent()) {
            postRequest.addHeader(HttpHeaders.AUTHORIZATION, authHeader.get());
        } else {
        	debugLogger.debug("DMaaP MR Publisher Authentication is disabled as username or password is not present.");
        }

        // Create post string entity
        final String messagesJson = convertToJsonString(messages);
        final StringEntity requestEntity =
                new StringEntity(messagesJson, ContentType.create(contentType, "UTF-8"));
        postRequest.setEntity(requestEntity);

        try {
            final Pair<Integer, String> responsePair = closeableHttpClient.execute(postRequest, responseHandler());
            final Integer responseCode = responsePair.getLeft();
            final String responseBody = responsePair.getRight();
            // if messages were published successfully, return successful response
            if (HTTPUtils.isSuccessfulResponseCode(responseCode)) {
            	debugLogger.debug("DMaaP MR Messages published successfully. DMaaP Response Code: {}. DMaaP Response " +
                                "Body: {}, Number of Messages published: {}",
                        responseCode, responseBody, messages.size());

            } else {
            	debugLogger.warn("Unable to publish messages to DMaaP MR Topic. DMaaP Response Code: {}, DMaaP Response " +
                        "Body: {}. Messages will be queued in recovery queue", responseCode, responseBody);
                addMessagesToRecoveryQueue(publisherQueue, messages);
            }

            return createPublisherResponse(responseCode, responseBody,
                    getPendingMessages(publisherQueue, publisherConfig));

        } catch (IOException e) {
            // If IO Error then we need to also put messages in recovery queue
            addMessagesToRecoveryQueue(publisherQueue, messages);
            final String errorMessage = format("IO Exception while publishing messages to DMaaP Topic. " +
                    "Messages will be queued in recovery queue. Messages Size: %d", messages.size());

            throw new DMaapException(errorMessage, errorLogger, e);
        }

    }


    @Override
    public DMaaPMRPublisherResponse flush() {
        final List<String> queueMessages = publisherQueue.getMessageForPublishing();
        // If there are no message return 204 (No Content) response code
        if (queueMessages.isEmpty()) {
        	debugLogger.debug("No messages to publish to batch queue. Returning 204 status code");
            return createPublisherNoContentResponse();
        } else {
            // force publish messages in queue
            return forcePublish(queueMessages);
        }
    }

    @Override
    public Date getPublisherCreationTime() {
        return new Date(publisherCreationTime.getTime());
    }

    @Override
    public void close() throws Exception {

        // flush current message in the queue
        int retrialNumber = 0;
        int flushResponseCode;

        // automatic retries if messages cannot be flushed
        do {
            retrialNumber++;
            DMaaPMRPublisherResponse flushResponse = flush();
            flushResponseCode = flushResponse.getResponseCode();

            if (!HTTPUtils.isSuccessfulResponseCode(flushResponseCode)) {
            	debugLogger.warn("Unable to flush batch messages to publisher due to DMaaP MR invalid Response: {}. " +
                                "Retrial No: {} of Max {} Retries", flushResponseCode, retrialNumber,
                                publisherMaxFlushRetries);

                Thread.sleep(publisherMaxFlushRetries);
            }
        } while (retrialNumber <= publisherMaxFlushRetries &&
                !HTTPUtils.isSuccessfulResponseCode(flushResponseCode));

        if (!HTTPUtils.isSuccessfulResponseCode(flushResponseCode)) {
        	errorLogger.error("Unable to flush batch messages to publisher. Messages loss cannot be prevented");
        } else {
        	debugLogger.info("Successfully published all batched messages to publisher.");
        }

        // close http client
        closeableHttpClient.close();

    }
}
