/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2018 TechMahindra
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

import java.util.List;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.AdditionalMeasurement;
import org.onap.dcaegen2.ves.domain.ves70.AdditionalObject;
import org.onap.dcaegen2.ves.domain.ves70.AlarmAdditionalInformation;
import org.onap.dcaegen2.ves.domain.ves70.OtherFields;
import org.onap.dcaegen2.ves.domain.ves70.OtherFields.OtherFieldsVersion;


public class OtherFieldsTest {
    
    private OtherFields createTestSubject() {
        return new OtherFields();
    }
    
    @Test
    public void testGetArrayOfNamedHashMap() throws Exception {
        OtherFields testSubject;
        List<AdditionalMeasurement> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getArrayOfNamedHashMap();
    }
    
    @Test
    public void testSetArrayOfNamedHashMap() throws Exception {
        OtherFields testSubject;
        List<AdditionalMeasurement> arrayOfNamedHashMap = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setArrayOfNamedHashMap(arrayOfNamedHashMap);
    }
    
    @Test
    public void testGetHashMap() throws Exception {
        OtherFields testSubject;
        AlarmAdditionalInformation result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHashMap();
    }
    
    @Test
    public void testSetHashMap() throws Exception {
        OtherFields testSubject;
        AlarmAdditionalInformation hashMap = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHashMap(hashMap);
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
    public void testGetOtherFieldsVersion() throws Exception {
        OtherFields testSubject;
        OtherFieldsVersion result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOtherFieldsVersion();
    }
    
    @Test
    public void testSetOtherFieldsVersion() throws Exception {
        OtherFields testSubject;
        OtherFieldsVersion otherFieldsVersion = OtherFieldsVersion._3_0;
        
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
    public void testHashCode() throws Exception {
        OtherFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        OtherFields testSubject;
        OtherFields testSubject2;
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
