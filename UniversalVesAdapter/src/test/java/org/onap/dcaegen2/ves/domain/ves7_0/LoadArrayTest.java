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


public class LoadArrayTest {

  private LoadArray createTestSubject() {
    return new LoadArray();
  }

  @Test
  public void testGetLongTerm() throws Exception {
    LoadArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getLongTerm();
  }

  @Test
  public void testSetLongTerm() throws Exception {
    LoadArray testSubject;
    Double longTerm = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setLongTerm(longTerm);
  }

  @Test
  public void testGetMidTerm() throws Exception {
    LoadArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMidTerm();
  }

  @Test
  public void testSetMidTerm() throws Exception {
    LoadArray testSubject;
    Double midTerm = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setMidTerm(midTerm);
  }

  @Test
  public void testGetShortTerm() throws Exception {
    LoadArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getShortTerm();
  }

  @Test
  public void testSetShortTerm() throws Exception {
    LoadArray testSubject;
    Double shortTerm = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setShortTerm(shortTerm);
  }

  @Test
  public void testToString() throws Exception {
    LoadArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    LoadArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    LoadArray testSubject;
    LoadArray testSubject2;
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
