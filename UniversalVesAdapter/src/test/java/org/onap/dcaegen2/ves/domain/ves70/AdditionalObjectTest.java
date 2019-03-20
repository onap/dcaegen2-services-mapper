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
import org.onap.dcaegen2.ves.domain.ves70.AdditionalObject;
import org.onap.dcaegen2.ves.domain.ves70.ObjectInstance;


public class AdditionalObjectTest {
    
    private AdditionalObject createTestSubject() {
        return new AdditionalObject();
    }
    
    @Test
    public void testGetObjectInstances() throws Exception {
        AdditionalObject testSubject;
        
        // default test
        testSubject = createTestSubject();
        testSubject.getObjectInstances();
    }
    
    @Test
    public void testSetObjectInstances() throws Exception {
        AdditionalObject testSubject;
        List<ObjectInstance> objectInstances = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setObjectInstances(objectInstances);
    }
    
    @Test
    public void testGetObjectName() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getObjectName();
    }
    
    @Test
    public void testSetObjectName() throws Exception {
        AdditionalObject testSubject;
        String objectName = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setObjectName(objectName);
    }
    
    @Test
    public void testGetObjectSchema() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getObjectSchema();
    }
    
    @Test
    public void testSetObjectSchema() throws Exception {
        AdditionalObject testSubject;
        String objectSchema = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setObjectSchema(objectSchema);
    }
    
    @Test
    public void testGetObjectSchemaUrl() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getObjectSchemaUrl();
    }
    
    @Test
    public void testSetObjectSchemaUrl() throws Exception {
        AdditionalObject testSubject;
        String objectSchemaUrl = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setObjectSchemaUrl(objectSchemaUrl);
    }
    
    @Test
    public void testGetNfSubscribedObjectName() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getNfSubscribedObjectName();
    }
    
    @Test
    public void testSetNfSubscribedObjectName() throws Exception {
        AdditionalObject testSubject;
        String nfSubscribedObjectName = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfSubscribedObjectName(nfSubscribedObjectName);
    }
    
    @Test
    public void testGetNfSubscriptionId() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.getNfSubscriptionId();
    }
    
    @Test
    public void testSetNfSubscriptionId() throws Exception {
        AdditionalObject testSubject;
        String nfSubscriptionId = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfSubscriptionId(nfSubscriptionId);
    }
    
    @Test
    public void testToString() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        AdditionalObject testSubject;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        AdditionalObject testSubject;
        AdditionalObject testSubject2;
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
