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
import org.onap.dcaegen2.ves.domain.ves70.CodecUsageArray;


public class CodecUsageArrayTest {
    
    private CodecUsageArray createTestSubject() {
        return new CodecUsageArray();
    }
    
    @Test
    public void testGetCodecIdentifier() throws Exception {
        CodecUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCodecIdentifier();
    }
    
    @Test
    public void testSetCodecIdentifier() throws Exception {
        CodecUsageArray testSubject;
        String codecIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCodecIdentifier(codecIdentifier);
    }
    
    @Test
    public void testGetNumberInUse() throws Exception {
        CodecUsageArray testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumberInUse();
    }
    
    @Test
    public void testSetNumberInUse() throws Exception {
        CodecUsageArray testSubject;
        Integer numberInUse = 0;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumberInUse(numberInUse);
    }
    
    @Test
    public void testToString() throws Exception {
        CodecUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        CodecUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        CodecUsageArray testSubject;
        CodecUsageArray testSubject2;
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
