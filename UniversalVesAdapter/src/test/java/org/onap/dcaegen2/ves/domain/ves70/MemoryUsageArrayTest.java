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
import org.onap.dcaegen2.ves.domain.ves70.MemoryUsageArray;


public class MemoryUsageArrayTest {
    
    private MemoryUsageArray createTestSubject() {
        return new MemoryUsageArray();
    }
    
    @Test
    public void testGetMemoryBuffered() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryBuffered();
    }
    
    @Test
    public void testSetMemoryBuffered() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryBuffered = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryBuffered(memoryBuffered);
    }
    
    @Test
    public void testGetMemoryCached() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryCached();
    }
    
    @Test
    public void testSetMemoryCached() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryCached = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryCached(memoryCached);
    }
    
    @Test
    public void testGetMemoryConfigured() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryConfigured();
    }
    
    @Test
    public void testSetMemoryConfigured() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryConfigured = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryConfigured(memoryConfigured);
    }
    
    @Test
    public void testGetMemoryDemand() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryDemand();
    }
    
    @Test
    public void testSetMemoryDemand() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryDemand = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryDemand(memoryDemand);
    }
    
    @Test
    public void testGetMemoryFree() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryFree();
    }
    
    @Test
    public void testSetMemoryFree() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryFree = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryFree(memoryFree);
    }
    
    @Test
    public void testGetMemoryLatencyAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryLatencyAvg();
    }
    
    @Test
    public void testSetMemoryLatencyAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryLatencyAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryLatencyAvg(memoryLatencyAvg);
    }
    
    @Test
    public void testGetMemorySharedAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySharedAvg();
    }
    
    @Test
    public void testSetMemorySharedAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySharedAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySharedAvg(memorySharedAvg);
    }
    
    @Test
    public void testGetMemorySlabRecl() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySlabRecl();
    }
    
    @Test
    public void testSetMemorySlabRecl() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySlabRecl = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySlabRecl(memorySlabRecl);
    }
    
    @Test
    public void testGetMemorySlabUnrecl() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySlabUnrecl();
    }
    
    @Test
    public void testSetMemorySlabUnrecl() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySlabUnrecl = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySlabUnrecl(memorySlabUnrecl);
    }
    
    @Test
    public void testGetMemorySwapInAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySwapInAvg();
    }
    
    @Test
    public void testSetMemorySwapInAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySwapInAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySwapInAvg(memorySwapInAvg);
    }
    
    @Test
    public void testGetMemorySwapInRateAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySwapInRateAvg();
    }
    
    @Test
    public void testSetMemorySwapInRateAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySwapInRateAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySwapInRateAvg(memorySwapInRateAvg);
    }
    
    @Test
    public void testGetMemorySwapOutAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySwapOutAvg();
    }
    
    @Test
    public void testSetMemorySwapOutAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySwapOutAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySwapOutAvg(memorySwapOutAvg);
    }
    
    @Test
    public void testGetMemorySwapOutRateAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySwapOutRateAvg();
    }
    
    @Test
    public void testSetMemorySwapOutRateAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySwapOutRateAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySwapOutRateAvg(memorySwapOutRateAvg);
    }
    
    @Test
    public void testGetMemorySwapUsedAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemorySwapUsedAvg();
    }
    
    @Test
    public void testSetMemorySwapUsedAvg() throws Exception {
        MemoryUsageArray testSubject;
        Double memorySwapUsedAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemorySwapUsedAvg(memorySwapUsedAvg);
    }
    
    @Test
    public void testGetMemoryUsed() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryUsed();
    }
    
    @Test
    public void testSetMemoryUsed() throws Exception {
        MemoryUsageArray testSubject;
        Double memoryUsed = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryUsed(memoryUsed);
    }
    
    @Test
    public void testGetPercentMemoryUsage() throws Exception {
        MemoryUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPercentMemoryUsage();
    }
    
    @Test
    public void testSetPercentMemoryUsage() throws Exception {
        MemoryUsageArray testSubject;
        Double percentMemoryUsage = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPercentMemoryUsage(percentMemoryUsage);
    }
    
    @Test
    public void testGetVmIdentifier() throws Exception {
        MemoryUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVmIdentifier();
    }
    
    @Test
    public void testSetVmIdentifier() throws Exception {
        MemoryUsageArray testSubject;
        String vmIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVmIdentifier(vmIdentifier);
    }
    
    @Test
    public void testToString() throws Exception {
        MemoryUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        MemoryUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        MemoryUsageArray testSubject;
        MemoryUsageArray testSubject2;
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
