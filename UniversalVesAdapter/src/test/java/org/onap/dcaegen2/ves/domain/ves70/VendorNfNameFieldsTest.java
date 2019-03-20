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
import org.onap.dcaegen2.ves.domain.ves70.VendorNfNameFields;


public class VendorNfNameFieldsTest {
    
    private VendorNfNameFields createTestSubject() {
        return new VendorNfNameFields();
    }
    
    @Test
    public void testGetVendorName() throws Exception {
        VendorNfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVendorName();
    }
    
    @Test
    public void testSetVendorName() throws Exception {
        VendorNfNameFields testSubject;
        String vendorName = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVendorName(vendorName);
    }
    
    @Test
    public void testGetNfModuleName() throws Exception {
        VendorNfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNfModuleName();
    }
    
    @Test
    public void testSetNfModuleName() throws Exception {
        VendorNfNameFields testSubject;
        String nfModuleName = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfModuleName(nfModuleName);
    }
    
    @Test
    public void testGetNfName() throws Exception {
        VendorNfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNfName();
    }
    
    @Test
    public void testSetNfName() throws Exception {
        VendorNfNameFields testSubject;
        String nfName = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfName(nfName);
    }
    
    @Test
    public void testToString() throws Exception {
        VendorNfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        VendorNfNameFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        VendorNfNameFields testSubject;
        VendorNfNameFields testSubject2;
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
