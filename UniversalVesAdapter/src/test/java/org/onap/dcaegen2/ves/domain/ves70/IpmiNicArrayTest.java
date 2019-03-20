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
import org.onap.dcaegen2.ves.domain.ves70.IpmiNicArray;


public class IpmiNicArrayTest {
    
    private IpmiNicArray createTestSubject() {
        return new IpmiNicArray();
    }
    
    @Test
    public void testGetNicIdentifier() throws Exception {
        IpmiNicArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNicIdentifier();
    }
    
    @Test
    public void testSetNicIdentifier() throws Exception {
        IpmiNicArray testSubject;
        String nicIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNicIdentifier(nicIdentifier);
    }
    
    @Test
    public void testGetNicTemperature() throws Exception {
        IpmiNicArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNicTemperature();
    }
    
    @Test
    public void testSetNicTemperature() throws Exception {
        IpmiNicArray testSubject;
        Double nicTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNicTemperature(nicTemperature);
    }
    
    @Test
    public void testToString() throws Exception {
        IpmiNicArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        IpmiNicArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        IpmiNicArray testSubject;
        IpmiNicArray testSubject2;
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
