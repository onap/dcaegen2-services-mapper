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


public class HeartbeatFieldsTest {
    
    private HeartbeatFields createTestSubject() {
        return new HeartbeatFields();
    }
    
    @Test
    public void testGetAdditionalFields() throws Exception {
        HeartbeatFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalFields();
    }
    
    @Test
    public void testSetAdditionalFields() throws Exception {
        HeartbeatFields testSubject;
        List<AlarmAdditionalInformation> additionalFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalFields(additionalFields);
    }
    
    @Test
    public void testGetHeartbeatFieldsVersion() throws Exception {
        HeartbeatFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHeartbeatFieldsVersion();
    }
    
    @Test
    public void testSetHeartbeatFieldsVersion() throws Exception {
        HeartbeatFields testSubject;
        Double heartbeatFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHeartbeatFieldsVersion(heartbeatFieldsVersion);
    }
    
    @Test
    public void testGetHeartbeatInterval() throws Exception {
        HeartbeatFields testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHeartbeatInterval();
    }
    
    @Test
    public void testSetHeartbeatInterval() throws Exception {
        HeartbeatFields testSubject;
        Integer heartbeatInterval = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHeartbeatInterval(heartbeatInterval);
    }
    
    @Test
    public void testToString() throws Exception {
        HeartbeatFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        HeartbeatFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        HeartbeatFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        HeartbeatFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
