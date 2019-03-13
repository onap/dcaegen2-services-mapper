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
import org.onap.dcaegen2.ves.domain.ves7_0.MobileFlowFields.MobileFlowFieldsVersion;


public class MobileFlowFieldsTest {

  private MobileFlowFields createTestSubject() {
    return new MobileFlowFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    MobileFlowFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    MobileFlowFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetApplicationType() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getApplicationType();
  }

  @Test
  public void testSetApplicationType() throws Exception {
    MobileFlowFields testSubject;
    String applicationType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setApplicationType(applicationType);
  }

  @Test
  public void testGetAppProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAppProtocolType();
  }

  @Test
  public void testSetAppProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String appProtocolType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAppProtocolType(appProtocolType);
  }

  @Test
  public void testGetAppProtocolVersion() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAppProtocolVersion();
  }

  @Test
  public void testSetAppProtocolVersion() throws Exception {
    MobileFlowFields testSubject;
    String appProtocolVersion = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAppProtocolVersion(appProtocolVersion);
  }

  @Test
  public void testGetCid() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCid();
  }

  @Test
  public void testSetCid() throws Exception {
    MobileFlowFields testSubject;
    String cid = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setCid(cid);
  }

  @Test
  public void testGetConnectionType() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getConnectionType();
  }

  @Test
  public void testSetConnectionType() throws Exception {
    MobileFlowFields testSubject;
    String connectionType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setConnectionType(connectionType);
  }

  @Test
  public void testGetEcgi() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getEcgi();
  }

  @Test
  public void testSetEcgi() throws Exception {
    MobileFlowFields testSubject;
    String ecgi = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEcgi(ecgi);
  }

  @Test
  public void testGetFlowDirection() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFlowDirection();
  }

  @Test
  public void testSetFlowDirection() throws Exception {
    MobileFlowFields testSubject;
    String flowDirection = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setFlowDirection(flowDirection);
  }

  @Test
  public void testGetGtpPerFlowMetrics() throws Exception {
    MobileFlowFields testSubject;
    GtpPerFlowMetrics result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getGtpPerFlowMetrics();
  }

  @Test
  public void testSetGtpPerFlowMetrics() throws Exception {
    MobileFlowFields testSubject;
    GtpPerFlowMetrics gtpPerFlowMetrics = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setGtpPerFlowMetrics(gtpPerFlowMetrics);
  }

  @Test
  public void testGetGtpProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getGtpProtocolType();
  }

  @Test
  public void testSetGtpProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String gtpProtocolType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setGtpProtocolType(gtpProtocolType);
  }

  @Test
  public void testGetGtpVersion() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getGtpVersion();
  }

  @Test
  public void testSetGtpVersion() throws Exception {
    MobileFlowFields testSubject;
    String gtpVersion = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setGtpVersion(gtpVersion);
  }

  @Test
  public void testGetHttpHeader() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getHttpHeader();
  }

  @Test
  public void testSetHttpHeader() throws Exception {
    MobileFlowFields testSubject;
    String httpHeader = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setHttpHeader(httpHeader);
  }

  @Test
  public void testGetImei() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getImei();
  }

  @Test
  public void testSetImei() throws Exception {
    MobileFlowFields testSubject;
    String imei = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setImei(imei);
  }

  @Test
  public void testGetImsi() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getImsi();
  }

  @Test
  public void testSetImsi() throws Exception {
    MobileFlowFields testSubject;
    String imsi = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setImsi(imsi);
  }

  @Test
  public void testGetIpProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getIpProtocolType();
  }

  @Test
  public void testSetIpProtocolType() throws Exception {
    MobileFlowFields testSubject;
    String ipProtocolType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setIpProtocolType(ipProtocolType);
  }

  @Test
  public void testGetIpVersion() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getIpVersion();
  }

  @Test
  public void testSetIpVersion() throws Exception {
    MobileFlowFields testSubject;
    String ipVersion = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setIpVersion(ipVersion);
  }

  @Test
  public void testGetLac() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getLac();
  }

  @Test
  public void testSetLac() throws Exception {
    MobileFlowFields testSubject;
    String lac = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setLac(lac);
  }

  @Test
  public void testGetMcc() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMcc();
  }

  @Test
  public void testSetMcc() throws Exception {
    MobileFlowFields testSubject;
    String mcc = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setMcc(mcc);
  }

  @Test
  public void testGetMnc() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMnc();
  }

  @Test
  public void testSetMnc() throws Exception {
    MobileFlowFields testSubject;
    String mnc = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setMnc(mnc);
  }

  @Test
  public void testGetMobileFlowFieldsVersion() throws Exception {
    MobileFlowFields testSubject;
    MobileFlowFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMobileFlowFieldsVersion();
  }

  @Test
  public void testSetMobileFlowFieldsVersion() throws Exception {
    MobileFlowFields testSubject;
    MobileFlowFieldsVersion mobileFlowFieldsVersion = MobileFlowFieldsVersion._4_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setMobileFlowFieldsVersion(mobileFlowFieldsVersion);
  }

  @Test
  public void testGetMsisdn() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMsisdn();
  }

  @Test
  public void testSetMsisdn() throws Exception {
    MobileFlowFields testSubject;
    String msisdn = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setMsisdn(msisdn);
  }

  @Test
  public void testGetOtherEndpointIpAddress() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOtherEndpointIpAddress();
  }

  @Test
  public void testSetOtherEndpointIpAddress() throws Exception {
    MobileFlowFields testSubject;
    String otherEndpointIpAddress = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setOtherEndpointIpAddress(otherEndpointIpAddress);
  }

  @Test
  public void testGetOtherEndpointPort() throws Exception {
    MobileFlowFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOtherEndpointPort();
  }

  @Test
  public void testSetOtherEndpointPort() throws Exception {
    MobileFlowFields testSubject;
    Integer otherEndpointPort = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setOtherEndpointPort(otherEndpointPort);
  }

  @Test
  public void testGetOtherFunctionalRole() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOtherFunctionalRole();
  }

  @Test
  public void testSetOtherFunctionalRole() throws Exception {
    MobileFlowFields testSubject;
    String otherFunctionalRole = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setOtherFunctionalRole(otherFunctionalRole);
  }

  @Test
  public void testGetRac() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getRac();
  }

  @Test
  public void testSetRac() throws Exception {
    MobileFlowFields testSubject;
    String rac = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setRac(rac);
  }

  @Test
  public void testGetRadioAccessTechnology() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getRadioAccessTechnology();
  }

  @Test
  public void testSetRadioAccessTechnology() throws Exception {
    MobileFlowFields testSubject;
    String radioAccessTechnology = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setRadioAccessTechnology(radioAccessTechnology);
  }

  @Test
  public void testGetReportingEndpointIpAddr() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getReportingEndpointIpAddr();
  }

  @Test
  public void testSetReportingEndpointIpAddr() throws Exception {
    MobileFlowFields testSubject;
    String reportingEndpointIpAddr = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setReportingEndpointIpAddr(reportingEndpointIpAddr);
  }

  @Test
  public void testGetReportingEndpointPort() throws Exception {
    MobileFlowFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getReportingEndpointPort();
  }

  @Test
  public void testSetReportingEndpointPort() throws Exception {
    MobileFlowFields testSubject;
    Integer reportingEndpointPort = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setReportingEndpointPort(reportingEndpointPort);
  }

  @Test
  public void testGetSac() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSac();
  }

  @Test
  public void testSetSac() throws Exception {
    MobileFlowFields testSubject;
    String sac = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSac(sac);
  }

  @Test
  public void testGetSamplingAlgorithm() throws Exception {
    MobileFlowFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSamplingAlgorithm();
  }

  @Test
  public void testSetSamplingAlgorithm() throws Exception {
    MobileFlowFields testSubject;
    Integer samplingAlgorithm = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setSamplingAlgorithm(samplingAlgorithm);
  }

  @Test
  public void testGetTac() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getTac();
  }

  @Test
  public void testSetTac() throws Exception {
    MobileFlowFields testSubject;
    String tac = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setTac(tac);
  }

  @Test
  public void testGetTunnelId() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getTunnelId();
  }

  @Test
  public void testSetTunnelId() throws Exception {
    MobileFlowFields testSubject;
    String tunnelId = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setTunnelId(tunnelId);
  }

  @Test
  public void testGetVlanId() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getVlanId();
  }

  @Test
  public void testSetVlanId() throws Exception {
    MobileFlowFields testSubject;
    String vlanId = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setVlanId(vlanId);
  }

  @Test
  public void testToString() throws Exception {
    MobileFlowFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    MobileFlowFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    MobileFlowFields testSubject;
    MobileFlowFields testSubject2;
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
