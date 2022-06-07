/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright (C) 2022 Huawei. All rights reserved.
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

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DmaapConfigTest {

    @Test
    public void testSetDmaaphost() {
        DmaapConfig dmaapConfig = new DmaapConfig();
        dmaapConfig.setDmaaphost("dmaapHost");
        String dmaaphost = dmaapConfig.getDmaaphost();
        assertEquals("dmaapHost", dmaaphost);
        dmaapConfig.setDEFAULT_PORT_NUMBER(1234);
        int default_port_number = dmaapConfig.getDEFAULT_PORT_NUMBER();
        assertEquals(1234, default_port_number);
        dmaapConfig.setDMAAP_DEFAULT_CONSUMER_ID("1234");
        String dmaap_default_consumer_id = dmaapConfig.getDMAAP_DEFAULT_CONSUMER_ID();
        assertEquals("1234", dmaap_default_consumer_id);
        dmaapConfig.setDMAAP_GROUP_PREFIX("abc");
        String dmaap_group_prefix = dmaapConfig.getDMAAP_GROUP_PREFIX();
        assertEquals("abc", dmaap_group_prefix);
        dmaapConfig.setDMAAP_URI_PATH_PREFIX("prefix");
        String dmaap_uri_path_prefix = dmaapConfig.getDMAAP_URI_PATH_PREFIX();
        assertEquals("prefix", dmaap_uri_path_prefix);
        dmaapConfig.setDEFAULT_CONTENT_TYPE("abc");
        String default_content_type = dmaapConfig.getDEFAULT_CONTENT_TYPE();
        assertEquals("abc", default_content_type);
        dmaapConfig.setPollingInterval(2);
        int pollingInterval = dmaapConfig.getPollingInterval();
        assertEquals(2, pollingInterval);
        dmaapConfig.setsubscriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME("msg");
        String msg = dmaapConfig.getsubscriberSUBSCRIBER_MSG_LIMIT_QUERY_PARAM_NAME();
        assertEquals("msg", msg);
        dmaapConfig.setsubscriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME("timeout");
        String timeout = dmaapConfig.getsubscriberSUBSCRIBER_TIMEOUT_QUERY_PARAM_NAME();
        assertEquals("timeout", timeout);
        dmaapConfig.setsubscriberDEFAULT_SUBSCRIBER_GROUP_PREFIX("prefix");
        String prefix = dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_GROUP_PREFIX();
        assertEquals("prefix", prefix);
        dmaapConfig.setsubscriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT(2);
        int msgLimit = dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_MESSAGE_LIMIT();
        assertEquals(2, msgLimit);
        dmaapConfig.setsubscriberDEFAULT_SUBSCRIBER_TIMEOUT_MS(2);
        int timeout_ms = dmaapConfig.getsubscriberDEFAULT_SUBSCRIBER_TIMEOUT_MS();
        assertEquals(2, timeout_ms);
        dmaapConfig.setPublisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE(2);
        int retries_on_close = dmaapConfig.getPublisherPUBLISHER_DELAY_MS_ON_RETRIES_ON_CLOSE();
        assertEquals(2, retries_on_close);
        dmaapConfig.setPublisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE(2);
        int flush_retries_on_close = dmaapConfig.getPublisherPUBLISHER_MAX_FLUSH_RETRIES_ON_CLOSE();
        assertEquals(2, flush_retries_on_close);
        dmaapConfig.setPublisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE(2);
        int max_recovery_queue_size = dmaapConfig.getPublisherDEFAULT_PUBLISHER_MAX_RECOVERY_QUEUE_SIZE();
        assertEquals(2, max_recovery_queue_size);
        dmaapConfig.setPublisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE(2);
        int publisherDEFAULT_publisher_max_batch_size = dmaapConfig.getPublisherDEFAULT_PUBLISHER_MAX_BATCH_SIZE();
        assertEquals(2, publisherDEFAULT_publisher_max_batch_size);
        dmaapConfig.setDEFAULT_PROTOCOL("HTTPS");
        String default_protocol = dmaapConfig.getDEFAULT_PROTOCOL();
        assertEquals("HTTPS", default_protocol);
        dmaapConfig.setDEFAULT_USER_PASSWORD("abc");
        String default_user_password = dmaapConfig.getDEFAULT_USER_PASSWORD();
        assertEquals("abc", default_user_password);
        dmaapConfig.setDEFAULT_USER_NAME("root");
        String default_user_name = dmaapConfig.getDEFAULT_USER_NAME();
        assertEquals("root", default_user_name);
    }
}
