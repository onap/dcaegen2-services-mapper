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
package org.onap.dcaegen2.ves.domain;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ThresholdCrossingAlertFieldsTest {

	@Autowired
	ThresholdCrossingAlertFields thresholdCrossingAlertFields =new ThresholdCrossingAlertFields();
	List<String> associatedAlertIdList;
	List<AdditionalParameter> additionalParameters;
	List<AdditionalField> additionalFields;
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	Object value;
	@Test
	public void test() {
		thresholdCrossingAlertFields.setAdditionalFields(additionalFields);
		thresholdCrossingAlertFields.setAdditionalParameters(additionalParameters);
		thresholdCrossingAlertFields.setAdditionalProperty("name", value);
		thresholdCrossingAlertFields.setAlertAction("test");
		thresholdCrossingAlertFields.setAlertDescription("test");
		thresholdCrossingAlertFields.setAlertType("test");
		thresholdCrossingAlertFields.setAlertValue("test");
		thresholdCrossingAlertFields.setAssociatedAlertIdList(associatedAlertIdList);
		thresholdCrossingAlertFields.setCollectionTimestamp("test");
		thresholdCrossingAlertFields.setDataCollector("test");
		thresholdCrossingAlertFields.setElementType("test");
		thresholdCrossingAlertFields.setEventSeverity("test");
		thresholdCrossingAlertFields.setEventStartTimestamp("test");
		thresholdCrossingAlertFields.setInterfaceName("test");
		thresholdCrossingAlertFields.setNetworkService("test");
		thresholdCrossingAlertFields.setPossibleRootCause("test");
		thresholdCrossingAlertFields.setThresholdCrossingFieldsVersion(2.2);
		
		additionalProperties.put("name", value);
		assertEquals(additionalFields, thresholdCrossingAlertFields.getAdditionalFields());
		assertEquals("test", thresholdCrossingAlertFields.getAlertAction());
		assertEquals("test", thresholdCrossingAlertFields.getAlertDescription());
		assertEquals("test", thresholdCrossingAlertFields.getAlertType());
		assertEquals("test", thresholdCrossingAlertFields.getAlertValue());
		assertEquals("test", thresholdCrossingAlertFields.getCollectionTimestamp());
		assertEquals("test", thresholdCrossingAlertFields.getDataCollector());
		assertEquals("test", thresholdCrossingAlertFields.getElementType());
		assertEquals("test", thresholdCrossingAlertFields.getEventSeverity());
		assertEquals("test", thresholdCrossingAlertFields.getEventStartTimestamp());
		assertEquals("test", thresholdCrossingAlertFields.getInterfaceName());
		assertEquals("test", thresholdCrossingAlertFields.getNetworkService());
		assertEquals("test", thresholdCrossingAlertFields.getPossibleRootCause());
		assertEquals(new Double(2.2), thresholdCrossingAlertFields.getThresholdCrossingFieldsVersion());
		assertEquals(associatedAlertIdList, thresholdCrossingAlertFields.getAssociatedAlertIdList());
		assertEquals(additionalProperties, thresholdCrossingAlertFields.getAdditionalProperties());
		assertEquals(additionalParameters, thresholdCrossingAlertFields.getAdditionalParameters());
		
		
		
		
		
		
	}

}
