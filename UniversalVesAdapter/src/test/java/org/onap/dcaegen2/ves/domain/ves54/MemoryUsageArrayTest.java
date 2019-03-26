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
    public void testGetAdditionalProperties() throws Exception {
        MemoryUsageArray testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        MemoryUsageArray testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        MemoryUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
}
