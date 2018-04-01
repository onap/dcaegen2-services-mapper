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
import org.onap.dcaegen2.ves.domain.HashOfNameValuePairArray;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class HashOfNameValuePairArrayTest {

	@Autowired
	HashOfNameValuePairArray hashOfNameValuePairArray = new HashOfNameValuePairArray();
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	Object value;
	@Mock
	List<ArrayOfField_> arrayOfFields;
	@Test
	public void test() {
		hashOfNameValuePairArray.setAdditionalProperty("name", value);
		hashOfNameValuePairArray.setArrayOfFields(arrayOfFields);
		hashOfNameValuePairArray.setName("name");
		additionalProperties.put("name", value);
		
		assertEquals(additionalProperties, hashOfNameValuePairArray.getAdditionalProperties());
		assertEquals(arrayOfFields, hashOfNameValuePairArray.getArrayOfFields());
		assertEquals("name", hashOfNameValuePairArray.getName());
		assert (hashOfNameValuePairArray.toString() != null);
		assert (hashOfNameValuePairArray.hashCode() != 0);
		assertEquals(true, hashOfNameValuePairArray.equals(hashOfNameValuePairArray));
		
		
	}

}
