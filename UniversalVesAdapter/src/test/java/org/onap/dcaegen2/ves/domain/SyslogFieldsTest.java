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

public class SyslogFieldsTest {

	@Autowired
	SyslogFields syslogFields = new SyslogFields();
	Object value;
	 Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@Test
	public void test() {
		syslogFields.setAdditionalFields("additionalFields");
		syslogFields.setAdditionalProperty("name", value);
		syslogFields.setEventSourceHost("eventSourceHost");
		syslogFields.setEventSourceType("eventSourceType");
		syslogFields.setSyslogFacility(1L);
		syslogFields.setSyslogFieldsVersion(2.2);
		syslogFields.setSyslogMsg("syslogMsg");
		syslogFields.setSyslogPri(1L);
		syslogFields.setSyslogProc("syslogProc");
		syslogFields.setSyslogProcId(2.2);
		syslogFields.setSyslogSData("syslogSData");
		syslogFields.setSyslogSdId("syslogSdId");
		syslogFields.setSyslogSdId("syslogSdId");
		syslogFields.setSyslogSev("syslogSev");
		syslogFields.setSyslogTag("syslogTag");
		syslogFields.setSyslogVer(2.2);
		additionalProperties.put("name", value);
		assertEquals("additionalFields", syslogFields.getAdditionalFields());
		assertEquals(additionalProperties, syslogFields.getAdditionalProperties());
		assertEquals("eventSourceHost", syslogFields.getEventSourceHost());
		assertEquals("eventSourceType", syslogFields.getEventSourceType());
		assertEquals(new Long(1L), syslogFields.getSyslogFacility());
		assertEquals(new Double(2.2), syslogFields.getSyslogProcId());
		assertEquals(new Long(1L), syslogFields.getSyslogPri());
		assertEquals("syslogMsg", syslogFields.getSyslogMsg());
		assertEquals(new Long(1L), syslogFields.getSyslogPri());
		assertEquals("syslogProc", syslogFields.getSyslogProc());
		assertEquals("syslogSData", syslogFields.getSyslogSData());
		assertEquals("syslogSdId", syslogFields.getSyslogSdId());
		assertEquals("syslogTag", syslogFields.getSyslogTag());
		assertEquals("syslogSev", syslogFields.getSyslogSev());
		assertEquals(new Double(2.2), syslogFields.getSyslogVer());
		 assert (syslogFields.toString() != null);
	       assert (syslogFields.hashCode() != 0);
	       assertEquals(true,syslogFields.equals(syslogFields));
	
	}

}
