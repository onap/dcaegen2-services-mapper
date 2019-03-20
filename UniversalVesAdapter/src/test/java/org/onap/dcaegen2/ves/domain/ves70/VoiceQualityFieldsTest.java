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

package org.onap.dcaegen2.ves.domain.ves70;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.AlarmAdditionalInformation;
import org.onap.dcaegen2.ves.domain.ves70.EndOfCallVqmSummaries;
import org.onap.dcaegen2.ves.domain.ves70.VendorNfNameFields;
import org.onap.dcaegen2.ves.domain.ves70.VoiceQualityFields;
import org.onap.dcaegen2.ves.domain.ves70.VoiceQualityFields.VoiceQualityFieldsVersion;


public class VoiceQualityFieldsTest {
    
    private VoiceQualityFields createTestSubject() {
        return new VoiceQualityFields();
    }
    
    @Test
    public void testGetAdditionalInformation() throws Exception {
        VoiceQualityFields testSubject;
        AlarmAdditionalInformation result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalInformation();
    }
    
    @Test
    public void testSetAdditionalInformation() throws Exception {
        VoiceQualityFields testSubject;
        AlarmAdditionalInformation additionalInformation = null;
        
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
    public void testGetVendorNfNameFields() throws Exception {
        VoiceQualityFields testSubject;
        VendorNfNameFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVendorNfNameFields();
    }
    
    @Test
    public void testSetVendorNfNameFields() throws Exception {
        VoiceQualityFields testSubject;
        VendorNfNameFields vendorNfNameFields = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVendorNfNameFields(vendorNfNameFields);
    }
    
    @Test
    public void testGetVoiceQualityFieldsVersion() throws Exception {
        VoiceQualityFields testSubject;
        VoiceQualityFieldsVersion result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVoiceQualityFieldsVersion();
    }
    
    @Test
    public void testSetVoiceQualityFieldsVersion() throws Exception {
        VoiceQualityFields testSubject;
        VoiceQualityFieldsVersion voiceQualityFieldsVersion = VoiceQualityFieldsVersion._4_0;
        
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
    public void testHashCode() throws Exception {
        VoiceQualityFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        VoiceQualityFields testSubject;
        VoiceQualityFields testSubject2;
        Object other = null;
        boolean result;
        
        // default test
        testSubject = createTestSubject();
        testSubject2 = createTestSubject();
        result = testSubject.equals(other);
        result = testSubject.equals(testSubject);
        result = testSubject.equals(testSubject2);
        assertNotNull(result);
    }
}
