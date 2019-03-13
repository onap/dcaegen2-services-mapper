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


public class ProcessStatsArrayTest {

  private ProcessStatsArray createTestSubject() {
    return new ProcessStatsArray();
  }

  @Test
  public void testGetForkRate() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getForkRate();
  }

  @Test
  public void testSetForkRate() throws Exception {
    ProcessStatsArray testSubject;
    Double forkRate = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setForkRate(forkRate);
  }

  @Test
  public void testGetProcessIdentifier() throws Exception {
    ProcessStatsArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getProcessIdentifier();
  }

  @Test
  public void testSetProcessIdentifier() throws Exception {
    ProcessStatsArray testSubject;
    String processIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setProcessIdentifier(processIdentifier);
  }

  @Test
  public void testGetPsStateBlocked() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStateBlocked();
  }

  @Test
  public void testSetPsStateBlocked() throws Exception {
    ProcessStatsArray testSubject;
    Double psStateBlocked = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStateBlocked(psStateBlocked);
  }

  @Test
  public void testGetPsStatePaging() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStatePaging();
  }

  @Test
  public void testSetPsStatePaging() throws Exception {
    ProcessStatsArray testSubject;
    Double psStatePaging = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStatePaging(psStatePaging);
  }

  @Test
  public void testGetPsStateRunning() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStateRunning();
  }

  @Test
  public void testSetPsStateRunning() throws Exception {
    ProcessStatsArray testSubject;
    Double psStateRunning = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStateRunning(psStateRunning);
  }

  @Test
  public void testGetPsStateSleeping() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStateSleeping();
  }

  @Test
  public void testSetPsStateSleeping() throws Exception {
    ProcessStatsArray testSubject;
    Double psStateSleeping = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStateSleeping(psStateSleeping);
  }

  @Test
  public void testGetPsStateStopped() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStateStopped();
  }

  @Test
  public void testSetPsStateStopped() throws Exception {
    ProcessStatsArray testSubject;
    Double psStateStopped = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStateStopped(psStateStopped);
  }

  @Test
  public void testGetPsStateZombie() throws Exception {
    ProcessStatsArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPsStateZombie();
  }

  @Test
  public void testSetPsStateZombie() throws Exception {
    ProcessStatsArray testSubject;
    Double psStateZombie = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPsStateZombie(psStateZombie);
  }

  @Test
  public void testToString() throws Exception {
    ProcessStatsArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    ProcessStatsArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    ProcessStatsArray testSubject;
    ProcessStatsArray testSubject2;
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
