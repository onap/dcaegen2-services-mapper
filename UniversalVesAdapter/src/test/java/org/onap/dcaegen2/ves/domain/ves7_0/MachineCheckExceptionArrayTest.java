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


public class MachineCheckExceptionArrayTest {

  private MachineCheckExceptionArray createTestSubject() {
    return new MachineCheckExceptionArray();
  }

  @Test
  public void testGetCorrectedMemoryErrors() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCorrectedMemoryErrors();
  }

  @Test
  public void testSetCorrectedMemoryErrors() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double correctedMemoryErrors = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCorrectedMemoryErrors(correctedMemoryErrors);
  }

  @Test
  public void testGetCorrectedMemoryErrorsIn1Hr() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCorrectedMemoryErrorsIn1Hr();
  }

  @Test
  public void testSetCorrectedMemoryErrorsIn1Hr() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double correctedMemoryErrorsIn1Hr = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCorrectedMemoryErrorsIn1Hr(correctedMemoryErrorsIn1Hr);
  }

  @Test
  public void testGetUncorrectedMemoryErrors() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getUncorrectedMemoryErrors();
  }

  @Test
  public void testSetUncorrectedMemoryErrors() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double uncorrectedMemoryErrors = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setUncorrectedMemoryErrors(uncorrectedMemoryErrors);
  }

  @Test
  public void testGetUncorrectedMemoryErrorsIn1Hr() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getUncorrectedMemoryErrorsIn1Hr();
  }

  @Test
  public void testSetUncorrectedMemoryErrorsIn1Hr() throws Exception {
    MachineCheckExceptionArray testSubject;
    Double uncorrectedMemoryErrorsIn1Hr = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setUncorrectedMemoryErrorsIn1Hr(uncorrectedMemoryErrorsIn1Hr);
  }

  @Test
  public void testGetVmIdentifier() throws Exception {
    MachineCheckExceptionArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getVmIdentifier();
  }

  @Test
  public void testSetVmIdentifier() throws Exception {
    MachineCheckExceptionArray testSubject;
    String vmIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setVmIdentifier(vmIdentifier);
  }

  @Test
  public void testToString() throws Exception {
    MachineCheckExceptionArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    MachineCheckExceptionArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    MachineCheckExceptionArray testSubject;
    MachineCheckExceptionArray testSubject2;
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
