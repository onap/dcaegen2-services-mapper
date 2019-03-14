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


public class CpuUsageArrayTest {

  private CpuUsageArray createTestSubject() {
    return new CpuUsageArray();
  }

  @Test
  public void testGetCpuCapacityContention() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuCapacityContention();
  }

  @Test
  public void testSetCpuCapacityContention() throws Exception {
    CpuUsageArray testSubject;
    Double cpuCapacityContention = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuCapacityContention(cpuCapacityContention);
  }

  @Test
  public void testGetCpuDemandAvg() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuDemandAvg();
  }

  @Test
  public void testSetCpuDemandAvg() throws Exception {
    CpuUsageArray testSubject;
    Double cpuDemandAvg = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuDemandAvg(cpuDemandAvg);
  }

  @Test
  public void testGetCpuDemandMhz() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuDemandMhz();
  }

  @Test
  public void testSetCpuDemandMhz() throws Exception {
    CpuUsageArray testSubject;
    Double cpuDemandMhz = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuDemandMhz(cpuDemandMhz);
  }

  @Test
  public void testGetCpuDemandPct() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuDemandPct();
  }

  @Test
  public void testSetCpuDemandPct() throws Exception {
    CpuUsageArray testSubject;
    Double cpuDemandPct = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuDemandPct(cpuDemandPct);
  }

  @Test
  public void testGetCpuIdentifier() throws Exception {
    CpuUsageArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuIdentifier();
  }

  @Test
  public void testSetCpuIdentifier() throws Exception {
    CpuUsageArray testSubject;
    String cpuIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuIdentifier(cpuIdentifier);
  }

  @Test
  public void testGetCpuIdle() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuIdle();
  }

  @Test
  public void testSetCpuIdle() throws Exception {
    CpuUsageArray testSubject;
    Double cpuIdle = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuIdle(cpuIdle);
  }

  @Test
  public void testGetCpuLatencyAvg() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuLatencyAvg();
  }

  @Test
  public void testSetCpuLatencyAvg() throws Exception {
    CpuUsageArray testSubject;
    Double cpuLatencyAvg = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuLatencyAvg(cpuLatencyAvg);
  }

  @Test
  public void testGetCpuOverheadAvg() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuOverheadAvg();
  }

  @Test
  public void testSetCpuOverheadAvg() throws Exception {
    CpuUsageArray testSubject;
    Double cpuOverheadAvg = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuOverheadAvg(cpuOverheadAvg);
  }

  @Test
  public void testGetCpuSwapWaitTime() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuSwapWaitTime();
  }

  @Test
  public void testSetCpuSwapWaitTime() throws Exception {
    CpuUsageArray testSubject;
    Double cpuSwapWaitTime = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuSwapWaitTime(cpuSwapWaitTime);
  }

  @Test
  public void testGetCpuUsageInterrupt() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageInterrupt();
  }

  @Test
  public void testSetCpuUsageInterrupt() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageInterrupt = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageInterrupt(cpuUsageInterrupt);
  }

  @Test
  public void testGetCpuUsageNice() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageNice();
  }

  @Test
  public void testSetCpuUsageNice() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageNice = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageNice(cpuUsageNice);
  }

  @Test
  public void testGetCpuUsageSoftIrq() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageSoftIrq();
  }

  @Test
  public void testSetCpuUsageSoftIrq() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageSoftIrq = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageSoftIrq(cpuUsageSoftIrq);
  }

  @Test
  public void testGetCpuUsageSteal() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageSteal();
  }

  @Test
  public void testSetCpuUsageSteal() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageSteal = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageSteal(cpuUsageSteal);
  }

  @Test
  public void testGetCpuUsageSystem() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageSystem();
  }

  @Test
  public void testSetCpuUsageSystem() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageSystem = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageSystem(cpuUsageSystem);
  }

  @Test
  public void testGetCpuUsageUser() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageUser();
  }

  @Test
  public void testSetCpuUsageUser() throws Exception {
    CpuUsageArray testSubject;
    Double cpuUsageUser = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageUser(cpuUsageUser);
  }

  @Test
  public void testGetCpuWait() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuWait();
  }

  @Test
  public void testSetCpuWait() throws Exception {
    CpuUsageArray testSubject;
    Double cpuWait = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuWait(cpuWait);
  }

  @Test
  public void testGetPercentUsage() throws Exception {
    CpuUsageArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPercentUsage();
  }

  @Test
  public void testSetPercentUsage() throws Exception {
    CpuUsageArray testSubject;
    Double percentUsage = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setPercentUsage(percentUsage);
  }

  @Test
  public void testToString() throws Exception {
    CpuUsageArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    CpuUsageArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    CpuUsageArray testSubject;
    CpuUsageArray testSubject2;
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
