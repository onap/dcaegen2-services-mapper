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
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CpuUsageArrayTest {
	
	@Autowired
	CpuUsageArray cpuUsageArray = new CpuUsageArray();
	Object value;
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@Test
	public void test() {
		
		cpuUsageArray.setAdditionalProperty("name", value);
		cpuUsageArray.setCpuIdentifier("test");
		cpuUsageArray.setCpuIdle(2.2);
		cpuUsageArray.setCpuUsageInterrupt(2.2);
		cpuUsageArray.setCpuUsageNice(2.2);
		cpuUsageArray.setCpuUsageSoftIrq(2.2);
		cpuUsageArray.setCpuUsageSteal(2.2);
		cpuUsageArray.setCpuUsageSystem(2.2);
		cpuUsageArray.setCpuUsageUser(2.2);
		cpuUsageArray.setCpuWait(2.2);
		cpuUsageArray.setPercentUsage(2.2);
		additionalProperties.put("name", value);
		
		assertEquals(additionalProperties, cpuUsageArray.getAdditionalProperties());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuIdle());
		assertEquals("test", cpuUsageArray.getCpuIdentifier());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageInterrupt());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageNice());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageSoftIrq());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageSteal());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageSystem());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuUsageUser());
		assertEquals(new Double(2.2), cpuUsageArray.getCpuWait());
		assertEquals(new Double(2.2), cpuUsageArray.getPercentUsage());
		assert (cpuUsageArray.toString() != null);
        assert (cpuUsageArray.hashCode() != 0);
        assertEquals(true, cpuUsageArray.equals(cpuUsageArray));
		
	}

}
