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
import java.util.List;
import org.junit.Test;


public class ObjectInstanceTest {

  private ObjectInstance createTestSubject() {
    return new ObjectInstance();
  }

  @Test
  public void testGetJsonObject() throws Exception {
    ObjectInstance testSubject;
    AdditionalObject result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getJsonObject();
  }

  @Test
  public void testSetJsonObject() throws Exception {
    ObjectInstance testSubject;
    AdditionalObject jsonObject = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setJsonObject(jsonObject);
  }

  @Test
  public void testGetObjectInstance() throws Exception {
    ObjectInstance testSubject;
    ObjectInstance result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getObjectInstance();
  }

  @Test
  public void testSetObjectInstance() throws Exception {
    ObjectInstance testSubject;
    ObjectInstance objectInstance = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setObjectInstance(objectInstance);
  }

  @Test
  public void testGetObjectInstanceEpochMicrosec() throws Exception {
    ObjectInstance testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getObjectInstanceEpochMicrosec();
  }

  @Test
  public void testSetObjectInstanceEpochMicrosec() throws Exception {
    ObjectInstance testSubject;
    Double objectInstanceEpochMicrosec = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setObjectInstanceEpochMicrosec(objectInstanceEpochMicrosec);
  }

  @Test
  public void testGetObjectKeys() throws Exception {
    ObjectInstance testSubject;
    List<ObjectKey> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getObjectKeys();
  }

  @Test
  public void testSetObjectKeys() throws Exception {
    ObjectInstance testSubject;
    List<ObjectKey> objectKeys = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setObjectKeys(objectKeys);
  }

  @Test
  public void testToString() throws Exception {
    ObjectInstance testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    ObjectInstance testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    ObjectInstance testSubject;
    ObjectInstance testSubject2;
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
