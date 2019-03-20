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
import org.onap.dcaegen2.ves.domain.ves70.IpmiHsbpArray;


public class IpmiHsbpArrayTest {
    
    private IpmiHsbpArray createTestSubject() {
        return new IpmiHsbpArray();
    }
    
    @Test
    public void testGetHsbpIdentifier() throws Exception {
        IpmiHsbpArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHsbpIdentifier();
    }
    
    @Test
    public void testSetHsbpIdentifier() throws Exception {
        IpmiHsbpArray testSubject;
        String hsbpIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHsbpIdentifier(hsbpIdentifier);
    }
    
    @Test
    public void testGetHsbpTemperature() throws Exception {
        IpmiHsbpArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHsbpTemperature();
    }
    
    @Test
    public void testSetHsbpTemperature() throws Exception {
        IpmiHsbpArray testSubject;
        Double hsbpTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHsbpTemperature(hsbpTemperature);
    }
    
    @Test
    public void testToString() throws Exception {
        IpmiHsbpArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        IpmiHsbpArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        IpmiHsbpArray testSubject;
        IpmiHsbpArray testSubject2;
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
