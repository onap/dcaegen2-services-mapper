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

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.AdditionalMeasurement;
import org.onap.dcaegen2.ves.domain.ves70.AlarmAdditionalInformation;


public class AdditionalMeasurementTest {
    
    private AdditionalMeasurement createTestSubject() {
        return new AdditionalMeasurement();
    }
    
    @Test
    public void testGetName() throws Exception {
        AdditionalMeasurement testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getName();
    }
    
    @Test
    public void testSetName() throws Exception {
        AdditionalMeasurement testSubject;
        String name = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setName(name);
    }
    
    @Test
    public void testGetHashMap() throws Exception {
        AdditionalMeasurement testSubject;
        
        // default test
        testSubject = createTestSubject();
        testSubject.getHashMap();
    }
    
    @Test
    public void testSetHashMap() throws Exception {
        AdditionalMeasurement testSubject;
        AlarmAdditionalInformation hashMap = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHashMap(hashMap);
    }
    
    @Test
    public void testToString() throws Exception {
        AdditionalMeasurement testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        AdditionalMeasurement testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        AdditionalMeasurement testSubject;
        AdditionalMeasurement testSubject2;
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
