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


public class IpmiFanArrayTest {

  private IpmiFanArray createTestSubject() {
    return new IpmiFanArray();
  }

  @Test
  public void testGetFanIdentifier() throws Exception {
    IpmiFanArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFanIdentifier();
  }

  @Test
  public void testSetFanIdentifier() throws Exception {
    IpmiFanArray testSubject;
    String fanIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setFanIdentifier(fanIdentifier);
  }

  @Test
  public void testGetFanSpeed() throws Exception {
    IpmiFanArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFanSpeed();
  }

  @Test
  public void testSetFanSpeed() throws Exception {
    IpmiFanArray testSubject;
    Double fanSpeed = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setFanSpeed(fanSpeed);
  }

  @Test
  public void testToString() throws Exception {
    IpmiFanArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    IpmiFanArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    IpmiFanArray testSubject;
    IpmiFanArray testSubject2;
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
