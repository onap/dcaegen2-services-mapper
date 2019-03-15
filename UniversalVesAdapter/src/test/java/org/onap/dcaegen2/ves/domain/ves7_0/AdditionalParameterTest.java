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

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves7_0.AdditionalParameter.Criticality;


public class AdditionalParameterTest {

  private AdditionalParameter createTestSubject() {
    return new AdditionalParameter();
  }

  @Test
  public void getCriticalityTest() throws Exception {
    AdditionalParameter testSubject;
    Criticality result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCriticality();
  }

  @Test
  public void setCriticalityTest() throws Exception {
    AdditionalParameter testSubject;
    Criticality criticality = Criticality.CRIT;

    // default test
    testSubject = createTestSubject();
    testSubject.setCriticality(criticality);
  }

  @Test
  public void getHashMapTest() throws Exception {
    AdditionalParameter testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getHashMap();
  }

  @Test
  public void setHashMapTest() throws Exception {
    AdditionalParameter testSubject;
    AlarmAdditionalInformation hashMap = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setHashMap(hashMap);
  }

  @Test
  public void getThresholdCrossedTest() throws Exception {
    AdditionalParameter testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getThresholdCrossed();
  }

  @Test
  public void setThresholdCrossedTest() throws Exception {
    AdditionalParameter testSubject;
    String thresholdCrossed = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setThresholdCrossed(thresholdCrossed);
  }

  @Test
  public void toStringTest() throws Exception {
    AdditionalParameter testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void hashCodeTest() throws Exception {
    AdditionalParameter testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void equalsTest() throws Exception {
    AdditionalParameter testSubject;
    AdditionalParameter testSubject2;
    Object other = null;
    boolean result;

    // default test
    testSubject = createTestSubject();
    testSubject2 = createTestSubject();
    result = testSubject.equals(other);
    result = testSubject.equals(testSubject);
    result = testSubject.equals(testSubject2);
  }
}
