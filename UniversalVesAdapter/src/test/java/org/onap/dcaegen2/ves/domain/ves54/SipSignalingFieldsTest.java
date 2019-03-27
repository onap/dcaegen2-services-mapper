/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
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

package org.onap.dcaegen2.ves.domain.ves54;


import java.util.List;
import java.util.Map;

import org.junit.Test;


public class SipSignalingFieldsTest {
    
    private SipSignalingFields createTestSubject() {
        return new SipSignalingFields();
    }
    
    
    @Test
    public void testGetAdditionalInformation() throws Exception {
        SipSignalingFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalInformation();
    }
    
    
    @Test
    public void testSetAdditionalInformation() throws Exception {
        SipSignalingFields testSubject;
        List<AlarmAdditionalInformation> additionalInformation = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalInformation(additionalInformation);
    }
    
    @Test
    public void testGetCompressedSip() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCompressedSip();
    }
    
    @Test
    public void testSetCompressedSip() throws Exception {
        SipSignalingFields testSubject;
        String compressedSip = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCompressedSip(compressedSip);
    }
    
    @Test
    public void testGetCorrelator() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCorrelator();
    }
    
    @Test
    public void testSetCorrelator() throws Exception {
        SipSignalingFields testSubject;
        String correlator = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCorrelator(correlator);
    }
    
    @Test
    public void testGetLocalIpAddress() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalIpAddress();
    }
    
    @Test
    public void testSetLocalIpAddress() throws Exception {
        SipSignalingFields testSubject;
        String localIpAddress = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalIpAddress(localIpAddress);
    }
    
    @Test
    public void testGetLocalPort() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalPort();
    }
    
    @Test
    public void testSetLocalPort() throws Exception {
        SipSignalingFields testSubject;
        String localPort = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalPort(localPort);
    }
    
    @Test
    public void testGetRemoteIpAddress() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRemoteIpAddress();
    }
    
    @Test
    public void testSetRemoteIpAddress() throws Exception {
        SipSignalingFields testSubject;
        String remoteIpAddress = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRemoteIpAddress(remoteIpAddress);
    }
    
    @Test
    public void testGetRemotePort() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRemotePort();
    }
    
    @Test
    public void testSetRemotePort() throws Exception {
        SipSignalingFields testSubject;
        String remotePort = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRemotePort(remotePort);
    }
    
    @Test
    public void testGetSipSignalingFieldsVersion() throws Exception {
        SipSignalingFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSipSignalingFieldsVersion();
    }
    
    @Test
    public void testSetSipSignalingFieldsVersion() throws Exception {
        SipSignalingFields testSubject;
        Double sipSignalingFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSipSignalingFieldsVersion(sipSignalingFieldsVersion);
    }
    
    @Test
    public void testGetSummarySip() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSummarySip();
    }
    
    @Test
    public void testSetSummarySip() throws Exception {
        SipSignalingFields testSubject;
        String summarySip = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSummarySip(summarySip);
    }
    
    @Test
    public void testGetVendorVnfNameFields() throws Exception {
        SipSignalingFields testSubject;
        VendorVnfNameFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVendorVnfNameFields();
    }
    
    @Test
    public void testSetVendorVnfNameFields() throws Exception {
        SipSignalingFields testSubject;
        VendorVnfNameFields vendorVnfNameFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVendorVnfNameFields(vendorVnfNameFields);
    }
    
    @Test
    public void testToString() throws Exception {
        SipSignalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        SipSignalingFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        SipSignalingFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        SipSignalingFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
