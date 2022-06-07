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

package org.onap.universalvesadapter.dmaap;

import org.junit.Test;
import org.onap.universalvesadapter.dmaap.MRSubcriber.DMaaPMRSubscriber;
import org.onap.universalvesadapter.utils.DmaapConfig;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class CreatorTest {
    @Test
    public void testGetDmaapConfig() {
        Creator creator = new Creator();
        creator.setDmaapConfig(new DmaapConfig());
        DmaapConfig dmaapConfig = creator.getDmaapConfig();
        assertNotNull(dmaapConfig);
    }

    @Test
    public void testGetDMaaPMRPublisher() {
        Creator creator = new Creator();
        creator.setDmaapConfig(new DmaapConfig());
        try {
            creator.getDMaaPMRPublisher("test");
        } catch (IllegalArgumentException e) {
            // expected case
            return;
        }

        fail("Exception is not thrown");
    }

    @Test
    public void testGetDMaaPMRSubscriber() {
        Creator creator = new Creator();
        creator.setDmaapConfig(new DmaapConfig());
        DMaaPMRSubscriber dMaaPMRSubscriber = creator.getDMaaPMRSubscriber("test");
        assertNotNull(dMaaPMRSubscriber);
    }
}
