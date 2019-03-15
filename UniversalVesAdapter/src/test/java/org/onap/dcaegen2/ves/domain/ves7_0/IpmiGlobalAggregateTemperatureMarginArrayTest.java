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


public class IpmiGlobalAggregateTemperatureMarginArrayTest {

  private IpmiGlobalAggregateTemperatureMarginArray createTestSubject() {
    return new IpmiGlobalAggregateTemperatureMarginArray();
  }

  @Test
  public void testGetIpmiGlobalAggregateTemperatureMarginIdentifier() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getIpmiGlobalAggregateTemperatureMarginIdentifier();
  }

  @Test
  public void testSetIpmiGlobalAggregateTemperatureMarginIdentifier() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    String ipmiGlobalAggregateTemperatureMarginIdentifier = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setIpmiGlobalAggregateTemperatureMarginIdentifier(
        ipmiGlobalAggregateTemperatureMarginIdentifier);
  }

  @Test
  public void testGetGlobalAggregateTemperatureMargin() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getGlobalAggregateTemperatureMargin();
  }

  @Test
  public void testSetGlobalAggregateTemperatureMargin() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    Double globalAggregateTemperatureMargin = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setGlobalAggregateTemperatureMargin(globalAggregateTemperatureMargin);
  }

  @Test
  public void testToString() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    IpmiGlobalAggregateTemperatureMarginArray testSubject;
    IpmiGlobalAggregateTemperatureMarginArray testSubject2;
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
