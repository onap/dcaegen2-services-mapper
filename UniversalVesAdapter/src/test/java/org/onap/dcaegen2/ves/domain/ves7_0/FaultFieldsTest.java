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
import org.onap.dcaegen2.ves.domain.ves7_0.FaultFields.FaultFieldsVersion;
import org.onap.dcaegen2.ves.domain.ves7_0.FaultFields.VfStatus;


public class FaultFieldsTest {

  private FaultFields createTestSubject() {
    return new FaultFields();
  }

  @Test
  public void testGetAlarmAdditionalInformation() throws Exception {
    FaultFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlarmAdditionalInformation();
  }

  @Test
  public void testSetAlarmAdditionalInformation() throws Exception {
    FaultFields testSubject;
    AlarmAdditionalInformation alarmAdditionalInformation = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAlarmAdditionalInformation(alarmAdditionalInformation);
  }

  @Test
  public void testGetAlarmCondition() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlarmCondition();
  }

  @Test
  public void testSetAlarmCondition() throws Exception {
    FaultFields testSubject;
    String alarmCondition = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAlarmCondition(alarmCondition);
  }

  @Test
  public void testGetAlarmInterfaceA() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlarmInterfaceA();
  }

  @Test
  public void testSetAlarmInterfaceA() throws Exception {
    FaultFields testSubject;
    String alarmInterfaceA = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAlarmInterfaceA(alarmInterfaceA);
  }

  @Test
  public void testGetEventCategory() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEventCategory();
  }

  @Test
  public void testSetEventCategory() throws Exception {
    FaultFields testSubject;
    String eventCategory = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEventCategory(eventCategory);
  }

  @Test
  public void testGetEventSeverity() throws Exception {
    FaultFields testSubject;
    FaultFields.EventSeverity result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEventSeverity();
  }

  @Test
  public void testSetEventSeverity() throws Exception {
    FaultFields testSubject;
    FaultFields.EventSeverity eventSeverity = FaultFields.EventSeverity.CRITICAL;

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSeverity(eventSeverity);
  }

  @Test
  public void testGetEventSourceType() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEventSourceType();
  }

  @Test
  public void testSetEventSourceType() throws Exception {
    FaultFields testSubject;
    String eventSourceType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSourceType(eventSourceType);
  }

  @Test
  public void testGetFaultFieldsVersion() throws Exception {
    FaultFields testSubject;
    FaultFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFaultFieldsVersion();
  }

  @Test
  public void testSetFaultFieldsVersion() throws Exception {
    FaultFields testSubject;
    FaultFieldsVersion faultFieldsVersion = FaultFieldsVersion._4_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setFaultFieldsVersion(faultFieldsVersion);
  }

  @Test
  public void testGetSpecificProblem() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSpecificProblem();
  }

  @Test
  public void testSetSpecificProblem() throws Exception {
    FaultFields testSubject;
    String specificProblem = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSpecificProblem(specificProblem);
  }

  @Test
  public void testGetVfStatus() throws Exception {
    FaultFields testSubject;
    VfStatus result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getVfStatus();
  }

  @Test
  public void testSetVfStatus() throws Exception {
    FaultFields testSubject;
    VfStatus vfStatus = VfStatus.ACTIVE;

    // default test
    testSubject = createTestSubject();
    testSubject.setVfStatus(vfStatus);
  }

  @Test
  public void testToString() throws Exception {
    FaultFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    FaultFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    FaultFields testSubject;
    FaultFields testSubject2;
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
