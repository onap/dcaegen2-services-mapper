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


public class VoiceQualityFieldsTest {
    
    private VoiceQualityFields createTestSubject() {
        return new VoiceQualityFields();
    }
    
    
    @Test
    public void testGetAdditionalInformation() throws Exception {
        VoiceQualityFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalInformation();
    }
    
    
    @Test
    public void testSetAdditionalInformation() throws Exception {
        VoiceQualityFields testSubject;
        List<AlarmAdditionalInformation> additionalInformation = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalInformation(additionalInformation);
    }
    
    @Test
    public void testGetCalleeSideCodec() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCalleeSideCodec();
    }
    
    @Test
    public void testSetCalleeSideCodec() throws Exception {
        VoiceQualityFields testSubject;
        String calleeSideCodec = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCalleeSideCodec(calleeSideCodec);
    }
    
    @Test
    public void testGetCallerSideCodec() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCallerSideCodec();
    }
    
    @Test
    public void testSetCallerSideCodec() throws Exception {
        VoiceQualityFields testSubject;
        String callerSideCodec = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCallerSideCodec(callerSideCodec);
    }
    
    @Test
    public void testGetCorrelator() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCorrelator();
    }
    
    @Test
    public void testSetCorrelator() throws Exception {
        VoiceQualityFields testSubject;
        String correlator = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCorrelator(correlator);
    }
    
    @Test
    public void testGetEndOfCallVqmSummaries() throws Exception {
        VoiceQualityFields testSubject;
        EndOfCallVqmSummaries result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndOfCallVqmSummaries();
    }
    
    @Test
    public void testSetEndOfCallVqmSummaries() throws Exception {
        VoiceQualityFields testSubject;
        EndOfCallVqmSummaries endOfCallVqmSummaries = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndOfCallVqmSummaries(endOfCallVqmSummaries);
    }
    
    @Test
    public void testGetPhoneNumber() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPhoneNumber();
    }
    
    @Test
    public void testSetPhoneNumber() throws Exception {
        VoiceQualityFields testSubject;
        String phoneNumber = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPhoneNumber(phoneNumber);
    }
    
    @Test
    public void testGetMidCallRtcp() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMidCallRtcp();
    }
    
    @Test
    public void testSetMidCallRtcp() throws Exception {
        VoiceQualityFields testSubject;
        String midCallRtcp = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMidCallRtcp(midCallRtcp);
    }
    
    @Test
    public void testGetVendorVnfNameFields() throws Exception {
        VoiceQualityFields testSubject;
        VendorVnfNameFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVendorVnfNameFields();
    }
    
    @Test
    public void testSetVendorVnfNameFields() throws Exception {
        VoiceQualityFields testSubject;
        VendorVnfNameFields vendorVnfNameFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVendorVnfNameFields(vendorVnfNameFields);
    }
    
    @Test
    public void testGetVoiceQualityFieldsVersion() throws Exception {
        VoiceQualityFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVoiceQualityFieldsVersion();
    }
    
    @Test
    public void testSetVoiceQualityFieldsVersion() throws Exception {
        VoiceQualityFields testSubject;
        Double voiceQualityFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVoiceQualityFieldsVersion(voiceQualityFieldsVersion);
    }
    
    @Test
    public void testToString() throws Exception {
        VoiceQualityFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        VoiceQualityFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        VoiceQualityFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        VoiceQualityFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
