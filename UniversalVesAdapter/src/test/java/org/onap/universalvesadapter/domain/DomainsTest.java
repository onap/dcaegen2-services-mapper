/*-
 * ============LICENSE_START=======================================================
 *  Copyright (C) 2019 Samsung. All rights reserved.
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
package org.onap.universalvesadapter.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DomainsTest {

    @Test
    public void testGetValue() {
        assertEquals("fault", Domains.DOMAIN_FAULT.getValue());
        assertEquals("heartbeat", Domains.DOMAIN_HEARTBEAT.getValue());
        assertEquals("measurementsForVfScaling", Domains.DOMAIN_MEASUREMENT_FOR_VFSCALLING.getValue());
        assertEquals("mobileFlow", Domains.DOMAIN_MOBILE_FLOW.getValue());
        assertEquals("other", Domains.DOMAIN_OTHER.getValue());
        assertEquals("sipSignaling", Domains.DOMAIN_SIPSIGNALING.getValue());
        assertEquals("stateChange", Domains.DOMAIN_STATE_CHANGE.getValue());
        assertEquals("syslog", Domains.DOMAIN_SYSLOG.getValue());
        assertEquals("thresholdCrossingAlert", Domains.DOMAIN_THRESHOLD_CROSSING_ALERT.getValue());
        assertEquals("voiceQuality", Domains.DOMAIN_VOICE_QUALITY.getValue());        
    }
}
