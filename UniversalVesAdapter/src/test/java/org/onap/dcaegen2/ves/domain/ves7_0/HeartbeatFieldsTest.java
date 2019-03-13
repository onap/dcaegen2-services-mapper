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
import org.onap.dcaegen2.ves.domain.ves7_0.HeartbeatFields.HeartbeatFieldsVersion;


public class HeartbeatFieldsTest {

  private HeartbeatFields createTestSubject() {
    return new HeartbeatFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    HeartbeatFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    HeartbeatFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetHeartbeatFieldsVersion() throws Exception {
    HeartbeatFields testSubject;
    HeartbeatFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getHeartbeatFieldsVersion();
  }

  @Test
  public void testSetHeartbeatFieldsVersion() throws Exception {
    HeartbeatFields testSubject;
    HeartbeatFieldsVersion heartbeatFieldsVersion = HeartbeatFieldsVersion._3_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setHeartbeatFieldsVersion(heartbeatFieldsVersion);
  }

  @Test
  public void testGetHeartbeatInterval() throws Exception {
    HeartbeatFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getHeartbeatInterval();
  }

  @Test
  public void testSetHeartbeatInterval() throws Exception {
    HeartbeatFields testSubject;
    Integer heartbeatInterval = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setHeartbeatInterval(heartbeatInterval);
  }

  @Test
  public void testToString() throws Exception {
    HeartbeatFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    HeartbeatFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    HeartbeatFields testSubject;
    HeartbeatFields testSubject2;
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
