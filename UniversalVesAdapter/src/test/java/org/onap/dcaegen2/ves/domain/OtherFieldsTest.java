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

public class OtherFieldsTest {

	@Autowired
	OtherFields otherFields = new OtherFields();
	Object value = new Object();// = new Object();
	@Mock
	List<JsonObject> jsonObjects;
	@Mock
	List<HashOfNameValuePairArray> hashOfNameValuePairArrays;

	@Mock
	List<NameValuePair> nameValuePairs;
	 private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@Test
	public void test() {
		
		otherFields.setAdditionalProperty("name", value);
		otherFields.setHashOfNameValuePairArrays(hashOfNameValuePairArrays);
		otherFields.setJsonObjects(jsonObjects);
		otherFields.setNameValuePairs(nameValuePairs);
		otherFields.setOtherFieldsVersion(2.2);
		additionalProperties.put("name", value);
		
		assertEquals(hashOfNameValuePairArrays, otherFields.getHashOfNameValuePairArrays());
		assertEquals(jsonObjects, otherFields.getJsonObjects());
		assertEquals(nameValuePairs, otherFields.getNameValuePairs());
		assertEquals(new Double(2.2), otherFields.getOtherFieldsVersion());
		assertEquals(additionalProperties,otherFields.getAdditionalProperties() );
		
		
		
	}

}
