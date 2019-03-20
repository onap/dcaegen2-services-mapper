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
import org.onap.dcaegen2.ves.domain.ves70.HugePagesArray;


public class HugePagesArrayTest {
    
    private HugePagesArray createTestSubject() {
        return new HugePagesArray();
    }
    
    @Test
    public void testGetBytesFree() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBytesFree();
    }
    
    @Test
    public void testSetBytesFree() throws Exception {
        HugePagesArray testSubject;
        Double bytesFree = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBytesFree(bytesFree);
    }
    
    @Test
    public void testGetBytesUsed() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBytesUsed();
    }
    
    @Test
    public void testSetBytesUsed() throws Exception {
        HugePagesArray testSubject;
        Double bytesUsed = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBytesUsed(bytesUsed);
    }
    
    @Test
    public void testGetHugePagesIdentifier() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHugePagesIdentifier();
    }
    
    @Test
    public void testSetHugePagesIdentifier() throws Exception {
        HugePagesArray testSubject;
        Double hugePagesIdentifier = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHugePagesIdentifier(hugePagesIdentifier);
    }
    
    @Test
    public void testGetPercentFree() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPercentFree();
    }
    
    @Test
    public void testSetPercentFree() throws Exception {
        HugePagesArray testSubject;
        Double percentFree = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPercentFree(percentFree);
    }
    
    @Test
    public void testGetPercentUsed() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPercentUsed();
    }
    
    @Test
    public void testSetPercentUsed() throws Exception {
        HugePagesArray testSubject;
        Double percentUsed = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPercentUsed(percentUsed);
    }
    
    @Test
    public void testGetVmPageNumberFree() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVmPageNumberFree();
    }
    
    @Test
    public void testSetVmPageNumberFree() throws Exception {
        HugePagesArray testSubject;
        Double vmPageNumberFree = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVmPageNumberFree(vmPageNumberFree);
    }
    
    @Test
    public void testGetVmPageNumberUsed() throws Exception {
        HugePagesArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVmPageNumberUsed();
    }
    
    @Test
    public void testSetVmPageNumberUsed() throws Exception {
        HugePagesArray testSubject;
        Double vmPageNumberUsed = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVmPageNumberUsed(vmPageNumberUsed);
    }
    
    @Test
    public void testToString() throws Exception {
        HugePagesArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        HugePagesArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        
        HugePagesArray testSubject;
        HugePagesArray testSubject2;
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
