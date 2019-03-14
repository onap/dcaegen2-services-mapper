/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018 TechMahindra
*=================================================================================
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ============LICENSE_END=========================================================
*/

package org.onap.dcaegen2.ves.domain.ves7_0;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves7_0.PnfRegistrationFields.PnfRegistrationFieldsVersion;


public class PnfRegistrationFieldsTest {

  private PnfRegistrationFields createTestSubject() {
    return new PnfRegistrationFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    PnfRegistrationFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    PnfRegistrationFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetLastServiceDate() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getLastServiceDate();
  }

  @Test
  public void testSetLastServiceDate() throws Exception {
    PnfRegistrationFields testSubject;
    String lastServiceDate = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setLastServiceDate(lastServiceDate);
  }

  @Test
  public void testGetMacAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMacAddress();
  }

  @Test
  public void testSetMacAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String macAddress = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setMacAddress(macAddress);
  }

  @Test
  public void testGetManufactureDate() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getManufactureDate();
  }

  @Test
  public void testSetManufactureDate() throws Exception {
    PnfRegistrationFields testSubject;
    String manufactureDate = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setManufactureDate(manufactureDate);
  }

  @Test
  public void testGetModelNumber() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getModelNumber();
  }

  @Test
  public void testSetModelNumber() throws Exception {
    PnfRegistrationFields testSubject;
    String modelNumber = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setModelNumber(modelNumber);
  }

  @Test
  public void testGetOamV4IpAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOamV4IpAddress();
  }

  @Test
  public void testSetOamV4IpAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String oamV4IpAddress = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setOamV4IpAddress(oamV4IpAddress);
  }

  @Test
  public void testGetOamV6IpAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getOamV6IpAddress();
  }

  @Test
  public void testSetOamV6IpAddress() throws Exception {
    PnfRegistrationFields testSubject;
    String oamV6IpAddress = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setOamV6IpAddress(oamV6IpAddress);
  }

  @Test
  public void testGetPnfRegistrationFieldsVersion() throws Exception {
    PnfRegistrationFields testSubject;
    PnfRegistrationFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPnfRegistrationFieldsVersion();
  }

  @Test
  public void testSetPnfRegistrationFieldsVersion() throws Exception {
    PnfRegistrationFields testSubject;
    PnfRegistrationFieldsVersion pnfRegistrationFieldsVersion = PnfRegistrationFieldsVersion._2_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setPnfRegistrationFieldsVersion(pnfRegistrationFieldsVersion);
  }

  @Test
  public void testGetSerialNumber() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSerialNumber();
  }

  @Test
  public void testSetSerialNumber() throws Exception {
    PnfRegistrationFields testSubject;
    String serialNumber = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSerialNumber(serialNumber);
  }

  @Test
  public void testGetSoftwareVersion() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getSoftwareVersion();
  }

  @Test
  public void testSetSoftwareVersion() throws Exception {
    PnfRegistrationFields testSubject;
    String softwareVersion = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setSoftwareVersion(softwareVersion);
  }

  @Test
  public void testGetUnitFamily() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getUnitFamily();
  }

  @Test
  public void testSetUnitFamily() throws Exception {
    PnfRegistrationFields testSubject;
    String unitFamily = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setUnitFamily(unitFamily);
  }

  @Test
  public void testGetUnitType() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getUnitType();
  }

  @Test
  public void testSetUnitType() throws Exception {
    PnfRegistrationFields testSubject;
    String unitType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setUnitType(unitType);
  }

  @Test
  public void testGetVendorName() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getVendorName();
  }

  @Test
  public void testSetVendorName() throws Exception {
    PnfRegistrationFields testSubject;
    String vendorName = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setVendorName(vendorName);
  }

  @Test
  public void testToString() throws Exception {
    PnfRegistrationFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    PnfRegistrationFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    PnfRegistrationFields testSubject;
    PnfRegistrationFields testSubject2;
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
