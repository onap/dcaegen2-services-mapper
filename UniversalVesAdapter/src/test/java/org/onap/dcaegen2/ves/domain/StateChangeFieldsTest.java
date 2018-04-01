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
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class StateChangeFieldsTest {
	@Autowired
	StateChangeFields stateChangeFields = new StateChangeFields();
	@Mock
	List<AdditionalField> additionalFields;
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	Object value;

	@Test
	public void test() {
		stateChangeFields.setAdditionalFields(additionalFields);
		stateChangeFields.setAdditionalProperty("name", value);
		stateChangeFields.setNewState("newState");
		stateChangeFields.setOldState("oldState");
		stateChangeFields.setStateChangeFieldsVersion(2.2);
		stateChangeFields.setStateInterface("stateInterface");
		additionalProperties.put("name", value);
		assertEquals(additionalFields, stateChangeFields.getAdditionalFields());
		assertEquals(additionalProperties, stateChangeFields.getAdditionalProperties());
		assertEquals("newState", stateChangeFields.getNewState());
		assertEquals("oldState", stateChangeFields.getOldState());
		assertEquals(new Double(2.2), stateChangeFields.getStateChangeFieldsVersion());
		assertEquals("stateInterface", stateChangeFields.getStateInterface());
		assert (stateChangeFields.toString() != null);
		assert (stateChangeFields.hashCode() != 0);
		assertEquals(true, stateChangeFields.equals(stateChangeFields));

	}

}
