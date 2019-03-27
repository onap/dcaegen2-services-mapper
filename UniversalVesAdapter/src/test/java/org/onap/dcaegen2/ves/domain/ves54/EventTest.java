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


import java.util.Map;

import org.junit.Test;


public class EventTest {
    
    private Event createTestSubject() {
        return new Event();
    }
    
    @Test
    public void testGetCommonEventHeader() throws Exception {
        Event testSubject;
        CommonEventHeader result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCommonEventHeader();
    }
    
    @Test
    public void testSetCommonEventHeader() throws Exception {
        Event testSubject;
        CommonEventHeader commonEventHeader = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCommonEventHeader(commonEventHeader);
    }
    
    @Test
    public void testGetFaultFields() throws Exception {
        Event testSubject;
        FaultFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFaultFields();
    }
    
    @Test
    public void testSetFaultFields() throws Exception {
        Event testSubject;
        FaultFields faultFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFaultFields(faultFields);
    }
    
    @Test
    public void testGetHeartbeatFields() throws Exception {
        Event testSubject;
        HeartbeatFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHeartbeatFields();
    }
    
    @Test
    public void testSetHeartbeatFields() throws Exception {
        Event testSubject;
        HeartbeatFields heartbeatFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHeartbeatFields(heartbeatFields);
    }
    
    
    @Test
    public void testGetMeasurementsForVfScalingFields() throws Exception {
        Event testSubject;
        MeasurementsForVfScalingFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMeasurementsForVfScalingFields();
    }
    
    
    @Test
    public void testSetMeasurementsForVfScalingFields() throws Exception {
        Event testSubject;
        MeasurementsForVfScalingFields measurementsForVfScalingFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMeasurementsForVfScalingFields(measurementsForVfScalingFields);
    }
    
    @Test
    public void testGetMobileFlowFields() throws Exception {
        Event testSubject;
        MobileFlowFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMobileFlowFields();
    }
    
    @Test
    public void testSetMobileFlowFields() throws Exception {
        Event testSubject;
        MobileFlowFields mobileFlowFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMobileFlowFields(mobileFlowFields);
    }
    
    @Test
    public void testGetOtherFields() throws Exception {
        Event testSubject;
        OtherFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOtherFields();
    }
    
    @Test
    public void testSetOtherFields() throws Exception {
        Event testSubject;
        OtherFields otherFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOtherFields(otherFields);
    }
    
    @Test
    public void testGetSipSignalingFields() throws Exception {
        Event testSubject;
        SipSignalingFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSipSignalingFields();
    }
    
    @Test
    public void testSetSipSignalingFields() throws Exception {
        Event testSubject;
        SipSignalingFields sipSignalingFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSipSignalingFields(sipSignalingFields);
    }
    
    @Test
    public void testGetStateChangeFields() throws Exception {
        Event testSubject;
        StateChangeFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getStateChangeFields();
    }
    
    @Test
    public void testSetStateChangeFields() throws Exception {
        Event testSubject;
        StateChangeFields stateChangeFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setStateChangeFields(stateChangeFields);
    }
    
    @Test
    public void testGetSyslogFields() throws Exception {
        Event testSubject;
        SyslogFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSyslogFields();
    }
    
    @Test
    public void testSetSyslogFields() throws Exception {
        Event testSubject;
        SyslogFields syslogFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSyslogFields(syslogFields);
    }
    
    
    @Test
    public void testGetThresholdCrossingAlertFields() throws Exception {
        Event testSubject;
        ThresholdCrossingAlertFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getThresholdCrossingAlertFields();
    }
    
    
    @Test
    public void testSetThresholdCrossingAlertFields() throws Exception {
        Event testSubject;
        ThresholdCrossingAlertFields thresholdCrossingAlertFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setThresholdCrossingAlertFields(thresholdCrossingAlertFields);
    }
    
    @Test
    public void testGetVoiceQualityFields() throws Exception {
        Event testSubject;
        VoiceQualityFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVoiceQualityFields();
    }
    
    @Test
    public void testSetVoiceQualityFields() throws Exception {
        Event testSubject;
        VoiceQualityFields voiceQualityFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVoiceQualityFields(voiceQualityFields);
    }
    
    @Test
    public void testToString() throws Exception {
        Event testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        Event testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        Event testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        Event testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
