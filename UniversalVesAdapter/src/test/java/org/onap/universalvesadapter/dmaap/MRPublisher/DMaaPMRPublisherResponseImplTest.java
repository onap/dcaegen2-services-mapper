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

import static org.junit.Assert.assertEquals;

public class DMaaPMRPublisherResponseImplTest {
    @Test
    public void testDMaaPMRPublisherResponseImpl() {
        DMaaPMRPublisherResponseImpl dMaaPMRPublisherResponse
                = new DMaaPMRPublisherResponseImpl(200, "msg", 2);
        int responseCode = dMaaPMRPublisherResponse.getResponseCode();
        assertEquals(200, responseCode);
        String responseMessage = dMaaPMRPublisherResponse.getResponseMessage();
        assertEquals("msg", responseMessage);
        int pendingMessagesCount = dMaaPMRPublisherResponse.getPendingMessagesCount();
        assertEquals(2, pendingMessagesCount);
    }
}
