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


public class FilesystemUsageArrayTest {
    
    private FilesystemUsageArray createTestSubject() {
        return new FilesystemUsageArray();
    }
    
    @Test
    public void testGetBlockConfigured() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBlockConfigured();
    }
    
    @Test
    public void testSetBlockConfigured() throws Exception {
        FilesystemUsageArray testSubject;
        Double blockConfigured = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBlockConfigured(blockConfigured);
    }
    
    @Test
    public void testGetBlockIops() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBlockIops();
    }
    
    @Test
    public void testSetBlockIops() throws Exception {
        FilesystemUsageArray testSubject;
        Double blockIops = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBlockIops(blockIops);
    }
    
    @Test
    public void testGetBlockUsed() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getBlockUsed();
    }
    
    @Test
    public void testSetBlockUsed() throws Exception {
        FilesystemUsageArray testSubject;
        Double blockUsed = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setBlockUsed(blockUsed);
    }
    
    @Test
    public void testGetEphemeralConfigured() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEphemeralConfigured();
    }
    
    @Test
    public void testSetEphemeralConfigured() throws Exception {
        FilesystemUsageArray testSubject;
        Double ephemeralConfigured = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEphemeralConfigured(ephemeralConfigured);
    }
    
    @Test
    public void testGetEphemeralIops() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEphemeralIops();
    }
    
    @Test
    public void testSetEphemeralIops() throws Exception {
        FilesystemUsageArray testSubject;
        Double ephemeralIops = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEphemeralIops(ephemeralIops);
    }
    
    @Test
    public void testGetEphemeralUsed() throws Exception {
        FilesystemUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEphemeralUsed();
    }
    
    @Test
    public void testSetEphemeralUsed() throws Exception {
        FilesystemUsageArray testSubject;
        Double ephemeralUsed = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEphemeralUsed(ephemeralUsed);
    }
    
    @Test
    public void testGetFilesystemName() throws Exception {
        FilesystemUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFilesystemName();
    }
    
    @Test
    public void testSetFilesystemName() throws Exception {
        FilesystemUsageArray testSubject;
        String filesystemName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFilesystemName(filesystemName);
    }
    
    @Test
    public void testToString() throws Exception {
        FilesystemUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        FilesystemUsageArray testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        FilesystemUsageArray testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        FilesystemUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
