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

package org.onap.universalvesadapter.dmaap;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisher;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisherFactory;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisherImpl;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisherQueue;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisherQueueFactory;
import org.onap.universalvesadapter.dmaap.MRPublisher.DMaaPMRPublisherQueueImpl;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriberFactory;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriberImpl;
import org.springframework.stereotype.Component;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;




/**
 * Guice Module to wire concrete implementations with interfaces
 * <p>
 * @author Rajiv Singla . Creation Date: 10/20/2016.
 */
@Component
public class AnalyticsDMaaPModule extends AbstractModule {


    @Override
    protected void configure() {

        // Bind Http Client
        bind(CloseableHttpClient.class).toInstance(HttpClients.createDefault());

        // Bind Publishing queue
        install(new FactoryModuleBuilder().implement(DMaaPMRPublisherQueue.class, DMaaPMRPublisherQueueImpl.class)
                .build(DMaaPMRPublisherQueueFactory.class));

        install(new FactoryModuleBuilder().implement(DMaaPMRPublisher.class, DMaaPMRPublisherImpl.class)
                .build(DMaaPMRPublisherFactory.class));

        install(new FactoryModuleBuilder().implement(DMaaPMRSubscriber.class, DMaaPMRSubscriberImpl.class)
                .build(DMaaPMRSubscriberFactory.class));

    }
}
