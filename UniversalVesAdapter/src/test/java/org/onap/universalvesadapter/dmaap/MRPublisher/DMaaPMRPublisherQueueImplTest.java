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

package org.onap.universalvesadapter.dmaap.MRPublisher;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DMaaPMRPublisherQueueImplTest {
    @Test
    public void testDMaaPMRPublisherQueueImpl() {
        DMaaPMRPublisherQueueImpl dMaaPMRPublisherQueue = new DMaaPMRPublisherQueueImpl(2, 2);
        List<String> messages = new ArrayList<>();
        messages.add("msg");
        int result = dMaaPMRPublisherQueue.addBatchMessages(messages);
        assertEquals(1, result);
        result = dMaaPMRPublisherQueue.addRecoverableMessages(messages);
        assertEquals(1, result);
        List<String> messageForPublishing = dMaaPMRPublisherQueue.getMessageForPublishing();
        assertNotNull(messageForPublishing);
        int batchQueueRemainingSize = dMaaPMRPublisherQueue.getBatchQueueRemainingSize();
        assertEquals(2, batchQueueRemainingSize);
        int recoveryQueueRemainingSize = dMaaPMRPublisherQueue.getRecoveryQueueRemainingSize();
        assertEquals(2, recoveryQueueRemainingSize);
    }
}
