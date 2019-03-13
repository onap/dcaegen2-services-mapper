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
package org.onap.universalvesadapter.configs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.universalvesadapter.exception.DMaapException;

public class DMaaPMRBaseConfigTest {
    DMaaPMRBaseConfig dmaapMRBaseConfig = null;
    public static final String JSON_APPLICATION_TYPE = "application/json";
    
    @Before
    public void setUp() throws Exception {
        dmaapMRBaseConfig = Mockito.mock(DMaaPMRBaseConfig.class, Mockito.CALLS_REAL_METHODS);
    }
 
    @Test
    public void testDMaaPMRBaseConfigGetMethods() {
        assertNotNull(dmaapMRBaseConfig);
        assertNull(dmaapMRBaseConfig.getHostName());
        assertNull(dmaapMRBaseConfig.getPortNumber());
        assertNull(dmaapMRBaseConfig.getTopicName());
        assertNull(dmaapMRBaseConfig.getProtocol());
        assertNull(dmaapMRBaseConfig.getContentType());
        assertNull(dmaapMRBaseConfig.getUserName());
        assertNull(dmaapMRBaseConfig.getUserPassword());
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
        assertEquals(JSON_APPLICATION_TYPE, DMaaPMRBaseConfig.normalizeValidateContentType("application/json"));
    }
}
