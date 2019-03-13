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


public class IpmiBaseboardTemperatureArrayTest {

  private IpmiBaseboardTemperatureArray createTestSubject() {
    return new IpmiBaseboardTemperatureArray();
  }

  @Test
  public void testGetBaseboardTemperatureIdentifier() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getBaseboardTemperatureIdentifier();
  }

  @Test
  public void testSetBaseboardTemperatureIdentifier() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    String baseboardTemperatureIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setBaseboardTemperatureIdentifier(baseboardTemperatureIdentifier);
  }

  @Test
  public void testGetBaseboardTemperature() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getBaseboardTemperature();
  }

  @Test
  public void testSetBaseboardTemperature() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    Double baseboardTemperature = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setBaseboardTemperature(baseboardTemperature);
  }

  @Test
  public void testToString() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    IpmiBaseboardTemperatureArray testSubject;
    IpmiBaseboardTemperatureArray testSubject2;
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
