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


public class AlarmAdditionalInformationTest {
    
    private AlarmAdditionalInformation createTestSubject() {
        return new AlarmAdditionalInformation();
    }
    
    @Test
    public void testGetName() throws Exception {
        AlarmAdditionalInformation testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getName();
    }
    
    @Test
    public void testSetName() throws Exception {
        AlarmAdditionalInformation testSubject;
        String name = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setName(name);
    }
    
    @Test
    public void testGetValue() throws Exception {
        AlarmAdditionalInformation testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getValue();
    }
    
    @Test
    public void testSetValue() throws Exception {
        AlarmAdditionalInformation testSubject;
        String value = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setValue(value);
    }
    
    @Test
    public void testToString() throws Exception {
        AlarmAdditionalInformation testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        AlarmAdditionalInformation testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        AlarmAdditionalInformation testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        AlarmAdditionalInformation testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
