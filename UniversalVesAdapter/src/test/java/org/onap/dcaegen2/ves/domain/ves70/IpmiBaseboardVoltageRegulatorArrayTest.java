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
import org.onap.dcaegen2.ves.domain.ves70.IpmiBaseboardVoltageRegulatorArray;


public class IpmiBaseboardVoltageRegulatorArrayTest {
    
    private IpmiBaseboardVoltageRegulatorArray createTestSubject() {
        return new IpmiBaseboardVoltageRegulatorArray();
    }
    
    @Test
    public void testGetBaseboardVoltageRegulatorIdentifier() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBaseboardVoltageRegulatorIdentifier();
    }
    
    @Test
    public void testSetBaseboardVoltageRegulatorIdentifier() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        String baseboardVoltageRegulatorIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBaseboardVoltageRegulatorIdentifier(baseboardVoltageRegulatorIdentifier);
    }
    
    @Test
    public void testGetVoltageRegulatorTemperature() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVoltageRegulatorTemperature();
    }
    
    @Test
    public void testSetVoltageRegulatorTemperature() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        Double voltageRegulatorTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVoltageRegulatorTemperature(voltageRegulatorTemperature);
    }
    
    @Test
    public void testToString() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        IpmiBaseboardVoltageRegulatorArray testSubject;
        IpmiBaseboardVoltageRegulatorArray testSubject2;
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
