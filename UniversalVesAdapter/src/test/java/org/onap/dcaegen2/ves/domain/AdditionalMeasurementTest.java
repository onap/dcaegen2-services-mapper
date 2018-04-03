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

import java.util.List;
import java.util.Map;
import org.onap.dcaegen2.ves.domain.AdditionalMeasurement;
import org.junit.Test;

public class AdditionalMeasurementTest {

	private AdditionalMeasurement createTestSubject() {
		return new AdditionalMeasurement();
	}

	@Test
	public void testGetName() throws Exception {
		AdditionalMeasurement testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();
	}

	@Test
	public void testSetName() throws Exception {
		AdditionalMeasurement testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);
	}

	@Test
	public void testGetArrayOfFields() throws Exception {
		AdditionalMeasurement testSubject;
		List<ArrayOfField> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getArrayOfFields();
	}

	@Test
	public void testSetArrayOfFields() throws Exception {
		AdditionalMeasurement testSubject;
		List<ArrayOfField> arrayOfFields = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setArrayOfFields(arrayOfFields);
	}

	@Test
	public void testGetAdditionalProperties() throws Exception {
		AdditionalMeasurement testSubject;
		Map<String, Object> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAdditionalProperties();
	}

	@Test
	public void testSetAdditionalProperty() throws Exception {
		AdditionalMeasurement testSubject;
		String name = "";
		Object value = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setAdditionalProperty(name, value);
	}

	@Test
	public void testToString() throws Exception {
		AdditionalMeasurement testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toString();
	}

	@Test
	public void testHashCode() throws Exception {
		AdditionalMeasurement testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.hashCode();
	}

	@Test
	public void testEquals() throws Exception {
		AdditionalMeasurement testSubject;
		Object other = null;
		boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.equals(other);
	}
}