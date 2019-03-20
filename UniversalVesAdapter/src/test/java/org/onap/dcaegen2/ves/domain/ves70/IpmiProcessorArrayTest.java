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

import java.util.List;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.IpmiProcessorArray;
import org.onap.dcaegen2.ves.domain.ves70.ProcessorDimmAggregateThermalMarginArray;


public class IpmiProcessorArrayTest {
    
    private IpmiProcessorArray createTestSubject() {
        return new IpmiProcessorArray();
    }
    
    @Test
    public void testGetProcessorIdentifier() throws Exception {
        IpmiProcessorArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getProcessorIdentifier();
    }
    
    @Test
    public void testSetProcessorIdentifier() throws Exception {
        IpmiProcessorArray testSubject;
        String processorIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setProcessorIdentifier(processorIdentifier);
    }
    
    @Test
    public void testGetProcessorThermalControlPercent() throws Exception {
        IpmiProcessorArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getProcessorThermalControlPercent();
    }
    
    @Test
    public void testSetProcessorThermalControlPercent() throws Exception {
        IpmiProcessorArray testSubject;
        Double processorThermalControlPercent = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setProcessorThermalControlPercent(processorThermalControlPercent);
    }
    
    @Test
    public void testGetProcessorDtsThermalMargin() throws Exception {
        IpmiProcessorArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getProcessorDtsThermalMargin();
    }
    
    @Test
    public void testSetProcessorDtsThermalMargin() throws Exception {
        IpmiProcessorArray testSubject;
        Double processorDtsThermalMargin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setProcessorDtsThermalMargin(processorDtsThermalMargin);
    }
    
    @Test
    public void testGetProcessorDimmAggregateThermalMarginArray() throws Exception {
        IpmiProcessorArray testSubject;
        List<ProcessorDimmAggregateThermalMarginArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getProcessorDimmAggregateThermalMarginArray();
    }
    
    @Test
    public void testSetProcessorDimmAggregateThermalMarginArray() throws Exception {
        IpmiProcessorArray testSubject;
        List<ProcessorDimmAggregateThermalMarginArray> processorDimmAggregateThermalMarginArray =
                null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setProcessorDimmAggregateThermalMarginArray(
                processorDimmAggregateThermalMarginArray);
    }
    
    @Test
    public void testToString() throws Exception {
        IpmiProcessorArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        IpmiProcessorArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        IpmiProcessorArray testSubject;
        IpmiProcessorArray testSubject2;
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
