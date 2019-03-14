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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves7_0.ThresholdCrossingAlertFields.AlertAction;
import org.onap.dcaegen2.ves.domain.ves7_0.ThresholdCrossingAlertFields.AlertType;
import org.onap.dcaegen2.ves.domain.ves7_0.ThresholdCrossingAlertFields.ThresholdCrossingFieldsVersion;


public class ThresholdCrossingAlertFieldsTest {

  private ThresholdCrossingAlertFields createTestSubject() {
    return new ThresholdCrossingAlertFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetAdditionalParameters() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    List<AdditionalParameter> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalParameters();
  }

  @Test
  public void testSetAdditionalParameters() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    List<AdditionalParameter> additionalParameters = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalParameters(additionalParameters);
  }

  @Test
  public void testGetAlertAction() throws Exception {
    ThresholdCrossingAlertFields testSubject;

    AlertAction result;

    // default test
    testSubject = createTestSubject();
    AlertAction alertAction = AlertAction.CLEAR;
    testSubject.setAlertAction(alertAction);
    result = testSubject.getAlertAction();
    assertEquals(alertAction, result);
  }

  @Test
  public void testSetAlertAction() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    AlertAction alertAction = AlertAction.CLEAR;

    // default test
    testSubject = createTestSubject();
    testSubject.setAlertAction(alertAction);
  }

  @Test
  public void testGetAlertDescription() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlertDescription();
  }

  @Test
  public void testSetAlertDescription() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String alertDescription = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAlertDescription(alertDescription);
  }

  @Test
  public void testGetAlertType() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    AlertType result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlertType();
  }

  @Test
  public void testSetAlertType() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    AlertType alertType = AlertType.CARD_ANOMALY;

    // default test
    testSubject = createTestSubject();
    testSubject.setAlertType(alertType);
  }

  @Test
  public void testGetAlertValue() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAlertValue();
  }

  @Test
  public void testSetAlertValue() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String alertValue = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setAlertValue(alertValue);
  }

  @Test
  public void testGetAssociatedAlertIdList() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    List<String> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAssociatedAlertIdList();
  }

  @Test
  public void testSetAssociatedAlertIdList() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    List<String> associatedAlertIdList = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAssociatedAlertIdList(associatedAlertIdList);
  }

  @Test
  public void testGetCollectionTimestamp() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCollectionTimestamp();
  }

  @Test
  public void testSetCollectionTimestamp() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String collectionTimestamp = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setCollectionTimestamp(collectionTimestamp);
  }

  @Test
  public void testGetDataCollector() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getDataCollector();
  }

  @Test
  public void testSetDataCollector() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String dataCollector = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setDataCollector(dataCollector);
  }

  @Test
  public void testGetElementType() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getElementType();
  }

  @Test
  public void testSetElementType() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String elementType = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setElementType(elementType);
  }

  @Test
  public void testGetEventSeverity() throws Exception {
    ThresholdCrossingAlertFields testSubject;

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSeverity(ThresholdCrossingAlertFields.EventSeverity.MINOR);
    ThresholdCrossingAlertFields.EventSeverity result = testSubject.getEventSeverity();
    assertEquals(ThresholdCrossingAlertFields.EventSeverity.MINOR, result);
  }

  @Test
  public void testSetEventSeverity() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    ThresholdCrossingAlertFields.EventSeverity eventSeverity =
        ThresholdCrossingAlertFields.EventSeverity.MINOR;

    // default test
    testSubject = createTestSubject();
    testSubject.setEventSeverity(eventSeverity);
  }

  @Test
  public void testGetEventStartTimestamp() throws Exception {
    ThresholdCrossingAlertFields testSubject;


    // default test
    testSubject = createTestSubject();
    testSubject.getEventStartTimestamp();
  }

  @Test
  public void testSetEventStartTimestamp() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String eventStartTimestamp = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setEventStartTimestamp(eventStartTimestamp);
  }

  @Test
  public void testGetInterfaceName() throws Exception {
    ThresholdCrossingAlertFields testSubject;

    // default test
    testSubject = createTestSubject();
    testSubject.getInterfaceName();
  }

  @Test
  public void testSetInterfaceName() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String interfaceName = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setInterfaceName(interfaceName);
  }

  @Test
  public void testGetNetworkService() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getNetworkService();
  }

  @Test
  public void testSetNetworkService() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String networkService = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setNetworkService(networkService);
  }

  @Test
  public void testGetPossibleRootCause() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getPossibleRootCause();
  }

  @Test
  public void testSetPossibleRootCause() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String possibleRootCause = "";

    // default test
    testSubject = createTestSubject();
    testSubject.setPossibleRootCause(possibleRootCause);
  }

  @Test
  public void testGetThresholdCrossingFieldsVersion() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    ThresholdCrossingFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getThresholdCrossingFieldsVersion();
  }

  @Test
  public void testSetThresholdCrossingFieldsVersion() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    ThresholdCrossingFieldsVersion thresholdCrossingFieldsVersion = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setThresholdCrossingFieldsVersion(thresholdCrossingFieldsVersion);
  }

  @Test
  public void testToString() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    ThresholdCrossingAlertFields testSubject;
    ThresholdCrossingAlertFields testSubject2;
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
