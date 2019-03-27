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


public class CpuUsageArrayTest {
    
    private CpuUsageArray createTestSubject() {
        return new CpuUsageArray();
    }
    
    @Test
    public void testGetCpuIdentifier() throws Exception {
        CpuUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuIdentifier();
    }
    
    @Test
    public void testSetCpuIdentifier() throws Exception {
        CpuUsageArray testSubject;
        String cpuIdentifier = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuIdentifier(cpuIdentifier);
    }
    
    @Test
    public void testGetCpuIdle() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuIdle();
    }
    
    @Test
    public void testSetCpuIdle() throws Exception {
        CpuUsageArray testSubject;
        Double cpuIdle = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuIdle(cpuIdle);
    }
    
    @Test
    public void testGetCpuUsageInterrupt() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageInterrupt();
    }
    
    @Test
    public void testSetCpuUsageInterrupt() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageInterrupt = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageInterrupt(cpuUsageInterrupt);
    }
    
    @Test
    public void testGetCpuUsageNice() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageNice();
    }
    
    @Test
    public void testSetCpuUsageNice() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageNice = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageNice(cpuUsageNice);
    }
    
    @Test
    public void testGetCpuUsageSoftIrq() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageSoftIrq();
    }
    
    @Test
    public void testSetCpuUsageSoftIrq() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageSoftIrq = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageSoftIrq(cpuUsageSoftIrq);
    }
    
    @Test
    public void testGetCpuUsageSteal() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageSteal();
    }
    
    @Test
    public void testSetCpuUsageSteal() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageSteal = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageSteal(cpuUsageSteal);
    }
    
    @Test
    public void testGetCpuUsageSystem() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageSystem();
    }
    
    @Test
    public void testSetCpuUsageSystem() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageSystem = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageSystem(cpuUsageSystem);
    }
    
    @Test
    public void testGetCpuUsageUser() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageUser();
    }
    
    @Test
    public void testSetCpuUsageUser() throws Exception {
        CpuUsageArray testSubject;
        Double cpuUsageUser = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageUser(cpuUsageUser);
    }
    
    @Test
    public void testGetCpuWait() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuWait();
    }
    
    @Test
    public void testSetCpuWait() throws Exception {
        CpuUsageArray testSubject;
        Double cpuWait = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuWait(cpuWait);
    }
    
    @Test
    public void testGetPercentUsage() throws Exception {
        CpuUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPercentUsage();
    }
    
    @Test
    public void testSetPercentUsage() throws Exception {
        CpuUsageArray testSubject;
        Double percentUsage = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPercentUsage(percentUsage);
    }
    
    @Test
    public void testToString() throws Exception {
        CpuUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        CpuUsageArray testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        CpuUsageArray testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        CpuUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
