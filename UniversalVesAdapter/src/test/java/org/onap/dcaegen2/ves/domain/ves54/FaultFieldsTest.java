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


public class FaultFieldsTest {
    
    private FaultFields createTestSubject() {
        return new FaultFields();
    }
    
    
    @Test
    public void testGetAlarmAdditionalInformation() throws Exception {
        FaultFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAlarmAdditionalInformation();
    }
    
    
    @Test
    public void testSetAlarmAdditionalInformation() throws Exception {
        FaultFields testSubject;
        List<AlarmAdditionalInformation> alarmAdditionalInformation = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAlarmAdditionalInformation(alarmAdditionalInformation);
    }
    
    @Test
    public void testGetAlarmCondition() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAlarmCondition();
    }
    
    @Test
    public void testSetAlarmCondition() throws Exception {
        FaultFields testSubject;
        String alarmCondition = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAlarmCondition(alarmCondition);
    }
    
    @Test
    public void testGetAlarmInterfaceA() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAlarmInterfaceA();
    }
    
    @Test
    public void testSetAlarmInterfaceA() throws Exception {
        FaultFields testSubject;
        String alarmInterfaceA = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAlarmInterfaceA(alarmInterfaceA);
    }
    
    @Test
    public void testGetEventCategory() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventCategory();
    }
    
    @Test
    public void testSetEventCategory() throws Exception {
        FaultFields testSubject;
        String eventCategory = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventCategory(eventCategory);
    }
    
    @Test
    public void testGetEventSeverity() throws Exception {
        FaultFields testSubject;
        FaultFields.EventSeverity result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventSeverity();
    }
    
    @Test
    public void testSetEventSeverity() throws Exception {
        FaultFields testSubject;
        FaultFields.EventSeverity eventSeverity = FaultFields.EventSeverity.CRITICAL;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventSeverity(eventSeverity);
    }
    
    @Test
    public void testGetEventSourceType() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventSourceType();
    }
    
    @Test
    public void testSetEventSourceType() throws Exception {
        FaultFields testSubject;
        String eventSourceType = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventSourceType(eventSourceType);
    }
    
    @Test
    public void testGetFaultFieldsVersion() throws Exception {
        FaultFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFaultFieldsVersion();
    }
    
    @Test
    public void testSetFaultFieldsVersion() throws Exception {
        FaultFields testSubject;
        Double faultFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFaultFieldsVersion(faultFieldsVersion);
    }
    
    @Test
    public void testGetSpecificProblem() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSpecificProblem();
    }
    
    @Test
    public void testSetSpecificProblem() throws Exception {
        FaultFields testSubject;
        String specificProblem = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSpecificProblem(specificProblem);
    }
    
    @Test
    public void testGetVfStatus() throws Exception {
        FaultFields testSubject;
        FaultFields.VfStatus result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVfStatus();
    }
    
    @Test
    public void testSetVfStatus() throws Exception {
        FaultFields testSubject;
        FaultFields.VfStatus vfStatus = FaultFields.VfStatus.ACTIVE;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVfStatus(vfStatus);
    }
    
    @Test
    public void testToString() throws Exception {
        FaultFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        FaultFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        FaultFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        FaultFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
