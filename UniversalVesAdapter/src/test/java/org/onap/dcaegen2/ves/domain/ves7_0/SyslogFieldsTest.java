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
import org.onap.dcaegen2.ves.domain.ves7_0.SyslogFields.SyslogFieldsVersion;
import org.onap.dcaegen2.ves.domain.ves7_0.SyslogFields.SyslogSev;


public class SyslogFieldsTest {

  private SyslogFields createTestSubject() {
    return new SyslogFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    SyslogFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    SyslogFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetEventSourceHost() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEventSourceHost();
  }

  @Test
  public void testSetEventSourceHost() throws Exception {
    SyslogFields testSubject;
    String eventSourceHost = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSourceHost(eventSourceHost);
  }

  @Test
  public void testGetEventSourceType() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEventSourceType();
  }

  @Test
  public void testSetEventSourceType() throws Exception {
    SyslogFields testSubject;
    String eventSourceType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSourceType(eventSourceType);
  }

  @Test
  public void testGetSyslogFacility() throws Exception {
    SyslogFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogFacility();
  }

  @Test
  public void testSetSyslogFacility() throws Exception {
    SyslogFields testSubject;
    Integer syslogFacility = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogFacility(syslogFacility);
  }

  @Test
  public void testGetSyslogFieldsVersion() throws Exception {
    SyslogFields testSubject;
    SyslogFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogFieldsVersion();
  }

  @Test
  public void testSetSyslogFieldsVersion() throws Exception {
    SyslogFields testSubject;
    SyslogFieldsVersion syslogFieldsVersion = SyslogFieldsVersion._4_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogFieldsVersion(syslogFieldsVersion);
  }

  @Test
  public void testGetSyslogMsg() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogMsg();
  }

  @Test
  public void testSetSyslogMsg() throws Exception {
    SyslogFields testSubject;
    String syslogMsg = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogMsg(syslogMsg);
  }

  @Test
  public void testGetSyslogMsgHost() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogMsgHost();
  }

  @Test
  public void testSetSyslogMsgHost() throws Exception {
    SyslogFields testSubject;
    String syslogMsgHost = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogMsgHost(syslogMsgHost);
  }

  @Test
  public void testGetSyslogPri() throws Exception {
    SyslogFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogPri();
  }

  @Test
  public void testSetSyslogPri() throws Exception {
    SyslogFields testSubject;
    Integer syslogPri = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogPri(syslogPri);
  }

  @Test
  public void testGetSyslogProc() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogProc();
  }

  @Test
  public void testSetSyslogProc() throws Exception {
    SyslogFields testSubject;
    String syslogProc = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogProc(syslogProc);
  }

  @Test
  public void testGetSyslogProcId() throws Exception {
    SyslogFields testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogProcId();
  }

  @Test
  public void testSetSyslogProcId() throws Exception {
    SyslogFields testSubject;
    Double syslogProcId = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogProcId(syslogProcId);
  }

  @Test
  public void testGetSyslogSData() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogSData();
  }

  @Test
  public void testSetSyslogSData() throws Exception {
    SyslogFields testSubject;
    String syslogSData = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogSData(syslogSData);
  }

  @Test
  public void testGetSyslogSdId() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogSdId();
  }

  @Test
  public void testSetSyslogSdId() throws Exception {
    SyslogFields testSubject;
    String syslogSdId = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogSdId(syslogSdId);
  }

  @Test
  public void testGetSyslogSev() throws Exception {
    SyslogFields testSubject;
    SyslogSev result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogSev();
  }

  @Test
  public void testSetSyslogSev() throws Exception {
    SyslogFields testSubject;
    SyslogSev syslogSev = SyslogSev.ALERT;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogSev(syslogSev);
  }

  @Test
  public void testGetSyslogTag() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogTag();
  }

  @Test
  public void testSetSyslogTag() throws Exception {
    SyslogFields testSubject;
    String syslogTag = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogTag(syslogTag);
  }

  @Test
  public void testGetSyslogTs() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogTs();
  }

  @Test
  public void testSetSyslogTs() throws Exception {
    SyslogFields testSubject;
    String syslogTs = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogTs(syslogTs);
  }

  @Test
  public void testGetSyslogVer() throws Exception {
    SyslogFields testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSyslogVer();
  }

  @Test
  public void testSetSyslogVer() throws Exception {
    SyslogFields testSubject;
    Double syslogVer = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setSyslogVer(syslogVer);
  }

  @Test
  public void testToString() throws Exception {
    SyslogFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    SyslogFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    SyslogFields testSubject;
    SyslogFields testSubject2;
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
