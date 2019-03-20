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
import org.onap.dcaegen2.ves.domain.ves70.Ipmi;
import org.onap.dcaegen2.ves.domain.ves70.IpmiBaseboardTemperatureArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiBaseboardVoltageRegulatorArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiBatteryArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiFanArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiGlobalAggregateTemperatureMarginArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiHsbpArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiNicArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiPowerSupplyArray;
import org.onap.dcaegen2.ves.domain.ves70.IpmiProcessorArray;


public class IpmiTest {
    
    private Ipmi createTestSubject() {
        return new Ipmi();
    }
    
    @Test
    public void testGetExitAirTemperature() throws Exception {
        Ipmi testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getExitAirTemperature();
    }
    
    @Test
    public void testSetExitAirTemperature() throws Exception {
        Ipmi testSubject;
        Double exitAirTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setExitAirTemperature(exitAirTemperature);
    }
    
    @Test
    public void testGetFrontPanelTemperature() throws Exception {
        Ipmi testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFrontPanelTemperature();
    }
    
    @Test
    public void testSetFrontPanelTemperature() throws Exception {
        Ipmi testSubject;
        Double frontPanelTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFrontPanelTemperature(frontPanelTemperature);
    }
    
    @Test
    public void testGetIoModuleTemperature() throws Exception {
        Ipmi testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIoModuleTemperature();
    }
    
    @Test
    public void testSetIoModuleTemperature() throws Exception {
        Ipmi testSubject;
        Double ioModuleTemperature = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIoModuleTemperature(ioModuleTemperature);
    }
    
    @Test
    public void testGetIpmiBaseboardTemperatureArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBaseboardTemperatureArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiBaseboardTemperatureArray();
    }
    
    @Test
    public void testSetIpmiBaseboardTemperatureArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBaseboardTemperatureArray> ipmiBaseboardTemperatureArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiBaseboardTemperatureArray(ipmiBaseboardTemperatureArray);
    }
    
    @Test
    public void testGetIpmiBaseboardVoltageRegulatorArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBaseboardVoltageRegulatorArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiBaseboardVoltageRegulatorArray();
    }
    
    @Test
    public void testSetIpmiBaseboardVoltageRegulatorArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBaseboardVoltageRegulatorArray> ipmiBaseboardVoltageRegulatorArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiBaseboardVoltageRegulatorArray(ipmiBaseboardVoltageRegulatorArray);
    }
    
    @Test
    public void testGetIpmiBatteryArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBatteryArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiBatteryArray();
    }
    
    @Test
    public void testSetIpmiBatteryArray() throws Exception {
        Ipmi testSubject;
        List<IpmiBatteryArray> ipmiBatteryArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiBatteryArray(ipmiBatteryArray);
    }
    
    @Test
    public void testGetIpmiFanArray() throws Exception {
        Ipmi testSubject;
        List<IpmiFanArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiFanArray();
    }
    
    @Test
    public void testSetIpmiFanArray() throws Exception {
        Ipmi testSubject;
        List<IpmiFanArray> ipmiFanArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiFanArray(ipmiFanArray);
    }
    
    @Test
    public void testGetIpmiHsbpArray() throws Exception {
        Ipmi testSubject;
        List<IpmiHsbpArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiHsbpArray();
    }
    
    @Test
    public void testSetIpmiHsbpArray() throws Exception {
        Ipmi testSubject;
        List<IpmiHsbpArray> ipmiHsbpArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiHsbpArray(ipmiHsbpArray);
    }
    
    @Test
    public void testGetIpmiGlobalAggregateTemperatureMarginArray() throws Exception {
        Ipmi testSubject;
        List<IpmiGlobalAggregateTemperatureMarginArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiGlobalAggregateTemperatureMarginArray();
    }
    
    @Test
    public void testSetIpmiGlobalAggregateTemperatureMarginArray() throws Exception {
        Ipmi testSubject;
        List<IpmiGlobalAggregateTemperatureMarginArray> ipmiGlobalAggregateTemperatureMarginArray =
                null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiGlobalAggregateTemperatureMarginArray(
                ipmiGlobalAggregateTemperatureMarginArray);
    }
    
    @Test
    public void testGetIpmiNicArray() throws Exception {
        Ipmi testSubject;
        List<IpmiNicArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiNicArray();
    }
    
    @Test
    public void testSetIpmiNicArray() throws Exception {
        Ipmi testSubject;
        List<IpmiNicArray> ipmiNicArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiNicArray(ipmiNicArray);
    }
    
    @Test
    public void testGetIpmiPowerSupplyArray() throws Exception {
        Ipmi testSubject;
        List<IpmiPowerSupplyArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiPowerSupplyArray();
    }
    
    @Test
    public void testSetIpmiPowerSupplyArray() throws Exception {
        Ipmi testSubject;
        List<IpmiPowerSupplyArray> ipmiPowerSupplyArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiPowerSupplyArray(ipmiPowerSupplyArray);
    }
    
    @Test
    public void testGetIpmiProcessorArray() throws Exception {
        Ipmi testSubject;
        List<IpmiProcessorArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpmiProcessorArray();
    }
    
    @Test
    public void testSetIpmiProcessorArray() throws Exception {
        Ipmi testSubject;
        List<IpmiProcessorArray> ipmiProcessorArray = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpmiProcessorArray(ipmiProcessorArray);
    }
    
    @Test
    public void testGetSystemAirflow() throws Exception {
        Ipmi testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSystemAirflow();
    }
    
    @Test
    public void testSetSystemAirflow() throws Exception {
        Ipmi testSubject;
        Double systemAirflow = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSystemAirflow(systemAirflow);
    }
    
    @Test
    public void testToString() throws Exception {
        Ipmi testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        Ipmi testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        Ipmi testSubject;
        Ipmi testSubject2;
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
