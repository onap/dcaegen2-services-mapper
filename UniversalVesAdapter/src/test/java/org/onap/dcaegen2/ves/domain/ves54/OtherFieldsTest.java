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


public class OtherFieldsTest {
    
    private OtherFields createTestSubject() {
        return new OtherFields();
    }
    
    
    @Test
    public void testGetHashOfNameValuePairArrays() throws Exception {
        OtherFields testSubject;
        List<AdditionalMeasurement> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHashOfNameValuePairArrays();
    }
    
    
    @Test
    public void testSetHashOfNameValuePairArrays() throws Exception {
        OtherFields testSubject;
        List<AdditionalMeasurement> hashOfNameValuePairArrays = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHashOfNameValuePairArrays(hashOfNameValuePairArrays);
    }
    
    @Test
    public void testGetJsonObjects() throws Exception {
        OtherFields testSubject;
        List<AdditionalObject> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getJsonObjects();
    }
    
    @Test
    public void testSetJsonObjects() throws Exception {
        OtherFields testSubject;
        List<AdditionalObject> jsonObjects = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setJsonObjects(jsonObjects);
    }
    
    @Test
    public void testGetNameValuePairs() throws Exception {
        OtherFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNameValuePairs();
    }
    
    @Test
    public void testSetNameValuePairs() throws Exception {
        OtherFields testSubject;
        List<AlarmAdditionalInformation> nameValuePairs = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNameValuePairs(nameValuePairs);
    }
    
    @Test
    public void testGetOtherFieldsVersion() throws Exception {
        OtherFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOtherFieldsVersion();
    }
    
    @Test
    public void testSetOtherFieldsVersion() throws Exception {
        OtherFields testSubject;
        Double otherFieldsVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOtherFieldsVersion(otherFieldsVersion);
    }
    
    @Test
    public void testToString() throws Exception {
        OtherFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        OtherFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        OtherFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        OtherFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
