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


public class StateChangeFieldsTest {
    
    private StateChangeFields createTestSubject() {
        return new StateChangeFields();
    }
    
    @Test
    public void testGetAdditionalFields() throws Exception {
        StateChangeFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalFields();
    }
    
    @Test
    public void testSetAdditionalFields() throws Exception {
        StateChangeFields testSubject;
        List<AlarmAdditionalInformation> additionalFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalFields(additionalFields);
    }
    
    @Test
    public void testGetNewState() throws Exception {
        StateChangeFields testSubject;
        StateChangeFields.NewState result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNewState();
    }
    
    @Test
    public void testSetNewState() throws Exception {
        StateChangeFields testSubject;
        StateChangeFields.NewState newState = StateChangeFields.NewState.IN_SERVICE;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNewState(newState);
    }
    
    @Test
    public void testGetOldState() throws Exception {
        StateChangeFields testSubject;
        StateChangeFields.OldState result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOldState();
    }
    
    @Test
    public void testSetOldState() throws Exception {
        StateChangeFields testSubject;
        StateChangeFields.OldState oldState = StateChangeFields.OldState.IN_SERVICE;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOldState(oldState);
    }
    
    @Test
    public void testGetStateChangeFieldsVersion() throws Exception {
        StateChangeFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getStateChangeFieldsVersion();
    }
    
    @Test
    public void testSetStateChangeFieldsVersion() throws Exception {
        StateChangeFields testSubject;
        Double stateChangeFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setStateChangeFieldsVersion(stateChangeFieldsVersion);
    }
    
    @Test
    public void testGetStateInterface() throws Exception {
        StateChangeFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getStateInterface();
    }
    
    @Test
    public void testSetStateInterface() throws Exception {
        StateChangeFields testSubject;
        String stateInterface = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setStateInterface(stateInterface);
    }
    
    @Test
    public void testToString() throws Exception {
        StateChangeFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        StateChangeFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        StateChangeFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        StateChangeFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
