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

import java.util.List;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.AdditionalMeasurement;
import org.onap.dcaegen2.ves.domain.ves70.AlarmAdditionalInformation;
import org.onap.dcaegen2.ves.domain.ves70.NotificationFields;
import org.onap.dcaegen2.ves.domain.ves70.NotificationFields.NotificationFieldsVersion;


public class NotificationFieldsTest {
    
    private NotificationFields createTestSubject() {
        return new NotificationFields();
    }
    
    @Test
    public void testGetAdditionalFields() throws Exception {
        NotificationFields testSubject;
        AlarmAdditionalInformation result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalFields();
    }
    
    @Test
    public void testSetAdditionalFields() throws Exception {
        NotificationFields testSubject;
        AlarmAdditionalInformation additionalFields = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalFields(additionalFields);
    }
    
    @Test
    public void testGetArrayOfNamedHashMap() throws Exception {
        NotificationFields testSubject;
        List<AdditionalMeasurement> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getArrayOfNamedHashMap();
    }
    
    @Test
    public void testSetArrayOfNamedHashMap() throws Exception {
        NotificationFields testSubject;
        List<AdditionalMeasurement> arrayOfNamedHashMap = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setArrayOfNamedHashMap(arrayOfNamedHashMap);
    }
    
    @Test
    public void testGetChangeContact() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getChangeContact();
    }
    
    @Test
    public void testSetChangeContact() throws Exception {
        NotificationFields testSubject;
        String changeContact = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setChangeContact(changeContact);
    }
    
    @Test
    public void testGetChangeIdentifier() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getChangeIdentifier();
    }
    
    @Test
    public void testSetChangeIdentifier() throws Exception {
        NotificationFields testSubject;
        String changeIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setChangeIdentifier(changeIdentifier);
    }
    
    @Test
    public void testGetChangeType() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getChangeType();
    }
    
    @Test
    public void testSetChangeType() throws Exception {
        NotificationFields testSubject;
        String changeType = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setChangeType(changeType);
    }
    
    @Test
    public void testGetNewState() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNewState();
    }
    
    @Test
    public void testSetNewState() throws Exception {
        NotificationFields testSubject;
        String newState = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNewState(newState);
    }
    
    @Test
    public void testGetOldState() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOldState();
    }
    
    @Test
    public void testSetOldState() throws Exception {
        NotificationFields testSubject;
        String oldState = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOldState(oldState);
    }
    
    @Test
    public void testGetNotificationFieldsVersion() throws Exception {
        NotificationFields testSubject;
        NotificationFieldsVersion result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNotificationFieldsVersion();
    }
    
    @Test
    public void testSetNotificationFieldsVersion() throws Exception {
        NotificationFields testSubject;
        NotificationFieldsVersion notificationFieldsVersion = NotificationFieldsVersion._2_0;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNotificationFieldsVersion(notificationFieldsVersion);
    }
    
    @Test
    public void testGetStateInterface() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getStateInterface();
    }
    
    @Test
    public void testSetStateInterface() throws Exception {
        NotificationFields testSubject;
        String stateInterface = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setStateInterface(stateInterface);
    }
    
    @Test
    public void testToString() throws Exception {
        NotificationFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        NotificationFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        NotificationFields testSubject;
        NotificationFields testSubject2;
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
