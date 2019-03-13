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


public class ObjectKeyTest {

  private ObjectKey createTestSubject() {
    return new ObjectKey();
  }

  @Test
  public void testGetKeyName() throws Exception {
    ObjectKey testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getKeyName();
  }

  @Test
  public void testSetKeyName() throws Exception {
    ObjectKey testSubject;
    String keyName = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setKeyName(keyName);
  }

  @Test
  public void testGetKeyOrder() throws Exception {
    ObjectKey testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getKeyOrder();
  }

  @Test
  public void testSetKeyOrder() throws Exception {
    ObjectKey testSubject;
    Integer keyOrder = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setKeyOrder(keyOrder);
  }

  @Test
  public void testGetKeyValue() throws Exception {
    ObjectKey testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getKeyValue();
  }

  @Test
  public void testSetKeyValue() throws Exception {
    ObjectKey testSubject;
    String keyValue = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setKeyValue(keyValue);
  }

  @Test
  public void testToString() throws Exception {
    ObjectKey testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    ObjectKey testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    ObjectKey testSubject;
    ObjectKey testSubject2;
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
