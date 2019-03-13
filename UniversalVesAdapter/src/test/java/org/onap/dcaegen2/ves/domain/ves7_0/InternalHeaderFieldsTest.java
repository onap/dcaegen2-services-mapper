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
import java.util.Map;
import org.junit.Test;


public class InternalHeaderFieldsTest {

  private InternalHeaderFields createTestSubject() {
    return new InternalHeaderFields();
  }

  @Test
  public void testToString() throws Exception {
    InternalHeaderFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testGetAdditionalProperties() throws Exception {
    InternalHeaderFields testSubject;
    Map<String, Object> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalProperties();
  }

  @Test
  public void testSetAdditionalProperty() throws Exception {
    InternalHeaderFields testSubject;
    String name = "";
    Object value = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalProperty(name, value);
  }

  @Test
  public void testHashCode() throws Exception {
    InternalHeaderFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    InternalHeaderFields testSubject;
    InternalHeaderFields testSubject2;
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
