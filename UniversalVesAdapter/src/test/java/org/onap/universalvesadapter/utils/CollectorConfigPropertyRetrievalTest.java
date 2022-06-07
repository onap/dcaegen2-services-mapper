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

import java.net.URISyntaxException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CollectorConfigPropertyRetrievalTest {
    @Test
    public void testGetDmaapTopics() {
        CollectorConfigPropertyRetrieval collectorConfigPropertyRetrieval = new CollectorConfigPropertyRetrieval();
        try {
            collectorConfigPropertyRetrieval.getDmaapTopics("subsrciber", "publisher", "null");
        } catch (NullPointerException e) {
            // expected case
            return;
        }
        fail("Exception is not thrown");
    }

    @Test
    public void testGetTopics() {
        CollectorConfigPropertyRetrieval collectorConfigPropertyRetrieval = new CollectorConfigPropertyRetrieval();
        try {
            collectorConfigPropertyRetrieval.getTopics("subsrciber", "publisher", "null");
        } catch (IllegalArgumentException e)  {
            // expected case
            return;
        }
        fail("Exception is not thrown");
    }

    @Test
    public void testGetTopicName() {
        CollectorConfigPropertyRetrieval collectorConfigPropertyRetrieval = new CollectorConfigPropertyRetrieval();
        try {
            String topicName = collectorConfigPropertyRetrieval.getTopicName("http://127.0.0.1");
            assertNotNull(topicName);
            collectorConfigPropertyRetrieval.setDmaapConfig("http://127.0.0.1");
        } catch (URISyntaxException | NullPointerException e) {
            // expected case
            return;
        }
        fail("Exception is not thrown");
    }

}
