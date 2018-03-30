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

public class ObjectInstanceTest {
	
	ObjectInstance object = new ObjectInstance();
	ObjectInstance_ objectInstance = new ObjectInstance_();
	Double objectInstanceEpochMicrosec;
	List<ObjectKey> objectKeys;
	Object value;
    Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Test
	public void test() {
		object.setObjectInstance(objectInstance);
		object.setObjectInstanceEpochMicrosec(objectInstanceEpochMicrosec);
		object.setObjectKeys(objectKeys);
		object.setAdditionalProperty("name", value);
		additionalProperties.put("name", value);
		assertEquals(additionalProperties, object.getAdditionalProperties());
		assertEquals(object.getObjectInstance(), objectInstance);
		assertEquals(object.getObjectKeys(), objectKeys);
		assertEquals(object.getObjectInstanceEpochMicrosec(), objectInstanceEpochMicrosec);
		assert(object.toString()!=null);
		assert(object.hashCode()!=0);
		assertEquals(true, object.equals(object));
		
		
	}

}
