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


public class IpmiBatteryArrayTest {

  private IpmiBatteryArray createTestSubject() {
    return new IpmiBatteryArray();
  }

  @Test
  public void testGetBatteryIdentifier() throws Exception {
    IpmiBatteryArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getBatteryIdentifier();
  }

  @Test
  public void testSetBatteryIdentifier() throws Exception {
    IpmiBatteryArray testSubject;
    String batteryIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setBatteryIdentifier(batteryIdentifier);
  }

  @Test
  public void testGetBatteryType() throws Exception {
    IpmiBatteryArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getBatteryType();
  }

  @Test
  public void testSetBatteryType() throws Exception {
    IpmiBatteryArray testSubject;
    String batteryType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setBatteryType(batteryType);
  }

  @Test
  public void testGetBatteryVoltageLevel() throws Exception {
    IpmiBatteryArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getBatteryVoltageLevel();
  }

  @Test
  public void testSetBatteryVoltageLevel() throws Exception {
    IpmiBatteryArray testSubject;
    Double batteryVoltageLevel = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setBatteryVoltageLevel(batteryVoltageLevel);
  }

  @Test
  public void testToString() throws Exception {
    IpmiBatteryArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    IpmiBatteryArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    IpmiBatteryArray testSubject;
    IpmiBatteryArray testSubject2;
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
