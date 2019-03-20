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

import java.util.Map;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.Event;
import org.onap.dcaegen2.ves.domain.ves70.VesEvent;


public class VesEventTest {
    
    private VesEvent createTestSubject() {
        return new VesEvent();
    }
    
    @Test
    public void testGetEvent() throws Exception {
        VesEvent testSubject;
        Event result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEvent();
    }
    
    @Test
    public void testSetEvent() throws Exception {
        VesEvent testSubject;
        Event event = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEvent(event);
    }
    
    @Test
    public void testToString() throws Exception {
        VesEvent testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        VesEvent testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        VesEvent testSubject;
        String name = "";
        Object value = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        VesEvent testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        VesEvent testSubject;
        VesEvent testSubject2;
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
