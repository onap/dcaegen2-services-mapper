/*
 * ============LICENSE_START======================================================= ONAP : DCAE
 * ================================================================================ Copyright 2018
 * TechMahindra =================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. ============LICENSE_END=========================================================
 */

package org.onap.dcaegen2.ves.domain.ves7_0;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves7_0.StateChangeFields.NewState;
import org.onap.dcaegen2.ves.domain.ves7_0.StateChangeFields.OldState;
import org.onap.dcaegen2.ves.domain.ves7_0.StateChangeFields.StateChangeFieldsVersion;


public class StateChangeFieldsTest {

  private StateChangeFields createTestSubject() {
    return new StateChangeFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    StateChangeFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    StateChangeFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetNewState() throws Exception {
    StateChangeFields testSubject;
    NewState result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getNewState();
  }

  @Test
  public void testSetNewState() throws Exception {
    StateChangeFields testSubject;
    NewState newState = NewState.IN_SERVICE;

    // default test
    testSubject = createTestSubject();
    testSubject.setNewState(newState);
  }

  @Test
  public void testGetOldState() throws Exception {
    StateChangeFields testSubject;
    OldState result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOldState();
  }

  @Test
  public void testSetOldState() throws Exception {
    StateChangeFields testSubject;
    OldState oldState = OldState.IN_SERVICE;

    // default test
    testSubject = createTestSubject();
    testSubject.setOldState(oldState);
  }

  @Test
  public void testGetStateChangeFieldsVersion() throws Exception {
    StateChangeFields testSubject;
    StateChangeFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getStateChangeFieldsVersion();
  }

  @Test
  public void testSetStateChangeFieldsVersion() throws Exception {
    StateChangeFields testSubject;
    StateChangeFieldsVersion stateChangeFieldsVersion = StateChangeFieldsVersion._4_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setStateChangeFieldsVersion(stateChangeFieldsVersion);
  }

  @Test
  public void testGetStateInterface() throws Exception {
    StateChangeFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getStateInterface();
  }

  @Test
  public void testSetStateInterface() throws Exception {
    StateChangeFields testSubject;
    String stateInterface = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setStateInterface(stateInterface);
  }

  @Test
  public void testToString() throws Exception {
    StateChangeFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    StateChangeFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    StateChangeFields testSubject;
    StateChangeFields testSubject2;
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
