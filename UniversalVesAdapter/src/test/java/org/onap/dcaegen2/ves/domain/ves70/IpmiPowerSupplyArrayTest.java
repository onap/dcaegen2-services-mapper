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
import org.onap.dcaegen2.ves.domain.ves70.IpmiPowerSupplyArray;


public class IpmiPowerSupplyArrayTest {
    
    private IpmiPowerSupplyArray createTestSubject() {
        return new IpmiPowerSupplyArray();
    }
    
    @Test
    public void testGetPowerSupplyIdentifier() throws Exception {
        IpmiPowerSupplyArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPowerSupplyIdentifier();
    }
    
    @Test
    public void testSetPowerSupplyIdentifier() throws Exception {
        IpmiPowerSupplyArray testSubject;
        String powerSupplyIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPowerSupplyIdentifier(powerSupplyIdentifier);
    }
    
    @Test
    public void testGetPowerSupplyInputPower() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPowerSupplyInputPower();
    }
    
    @Test
    public void testSetPowerSupplyInputPower() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double powerSupplyInputPower = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPowerSupplyInputPower(powerSupplyInputPower);
    }
    
    @Test
    public void testGetPowerSupplyCurrentOutputPercent() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPowerSupplyCurrentOutputPercent();
    }
    
    @Test
    public void testSetPowerSupplyCurrentOutputPercent() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double powerSupplyCurrentOutputPercent = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPowerSupplyCurrentOutputPercent(powerSupplyCurrentOutputPercent);
    }
    
    @Test
    public void testGetPowerSupplyTemperature() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPowerSupplyTemperature();
    }
    
    @Test
    public void testSetPowerSupplyTemperature() throws Exception {
        IpmiPowerSupplyArray testSubject;
        Double powerSupplyTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPowerSupplyTemperature(powerSupplyTemperature);
    }
    
    @Test
    public void testToString() throws Exception {
        IpmiPowerSupplyArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        IpmiPowerSupplyArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        IpmiPowerSupplyArray testSubject;
        IpmiPowerSupplyArray testSubject2;
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
