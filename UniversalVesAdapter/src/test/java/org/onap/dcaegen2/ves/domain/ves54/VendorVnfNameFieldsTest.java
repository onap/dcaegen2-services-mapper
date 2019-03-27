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


public class VendorVnfNameFieldsTest {
    
    private VendorVnfNameFields createTestSubject() {
        return new VendorVnfNameFields();
    }
    
    @Test
    public void testGetVendorName() throws Exception {
        VendorVnfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVendorName();
    }
    
    @Test
    public void testSetVendorName() throws Exception {
        VendorVnfNameFields testSubject;
        String vendorName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVendorName(vendorName);
    }
    
    @Test
    public void testGetVfModuleName() throws Exception {
        VendorVnfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVfModuleName();
    }
    
    @Test
    public void testSetVfModuleName() throws Exception {
        VendorVnfNameFields testSubject;
        String vfModuleName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVfModuleName(vfModuleName);
    }
    
    @Test
    public void testGetVnfName() throws Exception {
        VendorVnfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVnfName();
    }
    
    @Test
    public void testSetVnfName() throws Exception {
        VendorVnfNameFields testSubject;
        String vnfName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVnfName(vnfName);
    }
    
    @Test
    public void testToString() throws Exception {
        VendorVnfNameFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        VendorVnfNameFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        VendorVnfNameFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        VendorVnfNameFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
