/*-
 * ============LICENSE_START=======================================================
 *  Copyright (C) 2019 Samsung. All rights reserved.
 *  Copyright (C) 2022 Huawei. All rights reserved.
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
 *
 * ============LICENSE_END=========================================================
 */

package org.onap.universalvesadapter.configs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.utils.DmaapConfig;

import java.io.IOException;


public class DmaapMrBaseConfigTest {
    DMaaPMRBaseConfig dmaapMrBaseConfig = null;
    public static final String JSON_APPLICATION_TYPE = "application/json";
    
    @Before
    public void setUp() throws Exception {
        dmaapMrBaseConfig = Mockito.mock(DMaaPMRBaseConfig.class, Mockito.CALLS_REAL_METHODS);
    }
    
    @Test
    public void testDmaapMrBaseConfigGetMethods() {
        assertNotNull(dmaapMrBaseConfig);
        assertNull(dmaapMrBaseConfig.getHostName());
        assertNull(dmaapMrBaseConfig.getPortNumber());
        assertNull(dmaapMrBaseConfig.getTopicName());
        assertNull(dmaapMrBaseConfig.getProtocol());
        assertNull(dmaapMrBaseConfig.getContentType());
        assertNull(dmaapMrBaseConfig.getUserName());
        assertNull(dmaapMrBaseConfig.getUserPassword());
    }
    
    @Test(expected = DMaapException.class)
    public void testNormalizeValidateProtocol() {
        DMaaPMRBaseConfig.normalizeValidateProtocol("");
    }
    
    @Test(expected = DMaapException.class)
    public void testNormalizeValidateProtocolWithDifferentProtocol() {
        DMaaPMRBaseConfig.normalizeValidateProtocol("FTP");
    }
    
    @Test
    public void testNormalizeValidateProtocolWithProperValue() {
        assertEquals("https", DMaaPMRBaseConfig.normalizeValidateProtocol("HTTPS"));
        assertEquals("http", DMaaPMRBaseConfig.normalizeValidateProtocol("HTTP"));
    }
    
    @Test(expected = DMaapException.class)
    public void testNormalizeValidateContentType() {
        DMaaPMRBaseConfig.normalizeValidateContentType("");
    }
    
    @Test
    public void testNormalizeValidateContentTypeWithProperValue() {
        assertEquals(JSON_APPLICATION_TYPE,
                DMaaPMRBaseConfig.normalizeValidateContentType("application/json"));
    }

    @Test
    public void testDMaaPMRSubscriberConfig() throws IOException {
        DMaaPMRSubscriberConfig dMaaPMRSubscriberConfig = new DMaaPMRSubscriberConfig(new DMaaPMRSubscriberConfig
                .Builder("test", new DmaapConfig()));
        assertNotNull(dMaaPMRSubscriberConfig);
        String timeout = dMaaPMRSubscriberConfig.getTimeoutMSParam();
        assertNull(timeout);
        dMaaPMRSubscriberConfig.setTimeoutMSParam("10");
        timeout = dMaaPMRSubscriberConfig.getTimeoutMSParam();
        assertNotNull(timeout);
        String limitParam = dMaaPMRSubscriberConfig.getMessageLimitParam();
        assertNull(limitParam);
        dMaaPMRSubscriberConfig.setMessageLimitParam("test");
        dMaaPMRSubscriberConfig.setUriPrefix("test");
        String uriPrefix = dMaaPMRSubscriberConfig.getUriPrefix();
        assertNotNull(uriPrefix);
        String consumerId = dMaaPMRSubscriberConfig.getConsumerId();
        assertNull(consumerId);
        String consumerGroup = dMaaPMRSubscriberConfig.getConsumerGroup();
        assertNull(consumerGroup);
        int timeoutMS = dMaaPMRSubscriberConfig.getTimeoutMS();
        assertEquals(0, timeoutMS);
        int messageLimit = dMaaPMRSubscriberConfig.getMessageLimit();
        assertEquals(0, messageLimit);
        boolean result = dMaaPMRSubscriberConfig.equals(new Object());
        assertFalse(result);
        result = dMaaPMRSubscriberConfig.equals(new DMaaPMRSubscriberConfig(new DMaaPMRSubscriberConfig
                .Builder("test", new DmaapConfig())));
        assertTrue(result);
        int res = dMaaPMRSubscriberConfig.hashCode();
        assertNotEquals(0, res);
    }

    @Test
    public void testDMaaPMRSubscriberConfigBuilder() throws IOException {
        DMaaPMRSubscriberConfig.Builder builder = new DMaaPMRSubscriberConfig
                .Builder("test", new DmaapConfig());
        DMaaPMRSubscriberConfig.Builder builder1 = builder.setPortNumber(1234);
        assertNotNull(builder1);
        builder1 = builder.setUserName("john");
        assertNotNull(builder1);
        builder1 = builder.setUserPassword("sample");
        assertNotNull(builder1);
        builder1 = builder.setProtocol("HTTPS");
        assertNotNull(builder1);
        builder1 = builder.setContentType("application/json");
        assertNotNull(builder1);
        builder1 = builder.setConsumerId("1234");
        assertNotNull(builder1);
        builder1 = builder.setConsumerGroup("consumergroup");
        assertNotNull(builder1);
        builder1 = builder.setTimeoutMS(10);
        assertNotNull(builder1);
        builder1 = builder.setMessageLimit(10);
        assertNotNull(builder1);
        DMaaPMRSubscriberConfig dMaaPMRSubscriberConfig = builder.build();
        assertNotNull(dMaaPMRSubscriberConfig);
    }

    @Test
    public void testDMaaPMRPublisherConfig() throws IOException {
        DMaaPMRPublisherConfig dMaaPMRPublisherConfig = new DMaaPMRPublisherConfig(new DMaaPMRPublisherConfig
                .Builder("test", new DmaapConfig()));
        assertNotNull(dMaaPMRPublisherConfig);
        String uriPathPrefix = dMaaPMRPublisherConfig.getDmaapUriPathPrefix();
        assertNull(uriPathPrefix);
        int maxBatchSize = dMaaPMRPublisherConfig.getMaxBatchSize();
        assertEquals(0, maxBatchSize);
        int maxRecoveryQueueSize = dMaaPMRPublisherConfig.getMaxRecoveryQueueSize();
        assertEquals(0, maxRecoveryQueueSize);
        boolean result = dMaaPMRPublisherConfig.equals(new Object());
        assertFalse(result);
        result = dMaaPMRPublisherConfig.equals(new DMaaPMRPublisherConfig(new DMaaPMRPublisherConfig
                .Builder("test", new DmaapConfig())));
        assertTrue(result);
        int res = dMaaPMRPublisherConfig.hashCode();
        assertNotEquals(0, res);
    }

    @Test
    public void testDMaaPMRPublisherConfigBuilder() throws IOException {
        DMaaPMRPublisherConfig.Builder builder = new DMaaPMRPublisherConfig
                .Builder("test", new DmaapConfig());
        DMaaPMRPublisherConfig.Builder builder1 = builder.setPortNumber(1234);
        assertNotNull(builder1);
        builder1 = builder.setUserName("john");
        assertNotNull(builder1);
        builder1 = builder.setUserPassword("sample");
        assertNotNull(builder1);
        builder1 = builder.setProtocol("HTTPS");
        assertNotNull(builder1);
        builder1 = builder.setContentType("application/json");
        assertNotNull(builder1);
        builder1 = builder.setMaxBatchSize(10);
        assertNotNull(builder1);
        builder1 = builder.setMaxRecoveryQueueSize(10);
        assertNotNull(builder1);
        DMaaPMRPublisherConfig dMaaPMRPublisherConfig = builder.build();
        assertNotNull(dMaaPMRPublisherConfig);
    }
}
