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

public class SipSignalingFieldsTest {

	@Autowired
	SipSignalingFields sipSignalingFields = new SipSignalingFields();
	List<AdditionalInformation> additionalInformation;
	Object value;
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@Mock
	VendorVnfNameFields vendorVnfNameFields;
	
	@Test
	public void test() {
		sipSignalingFields.setAdditionalInformation(additionalInformation);
		sipSignalingFields.setAdditionalProperty("name", value);
		sipSignalingFields.setCompressedSip("compressedSip");
		sipSignalingFields.setCorrelator("correlator");
		sipSignalingFields.setLocalIpAddress("localIpAddress");
		sipSignalingFields.setLocalPort("localPort");
		sipSignalingFields.setRemoteIpAddress("remoteIpAddress");
		sipSignalingFields.setRemotePort("remotePort");
		sipSignalingFields.setSipSignalingFieldsVersion(2.2);
		sipSignalingFields.setSummarySip("summarySip");
		sipSignalingFields.setVendorVnfNameFields(vendorVnfNameFields);
		additionalProperties.put("name", value);
		
		assertEquals(additionalInformation, sipSignalingFields.getAdditionalInformation());
		assertEquals(additionalInformation, sipSignalingFields.getAdditionalInformation());
		assertEquals("compressedSip", sipSignalingFields.getCompressedSip());
		assertEquals("correlator", sipSignalingFields.getCorrelator());
		assertEquals("localIpAddress", sipSignalingFields.getLocalIpAddress());
		assertEquals("localPort", sipSignalingFields.getLocalPort());
		assertEquals("remoteIpAddress", sipSignalingFields.getRemoteIpAddress());
		assertEquals("remotePort", sipSignalingFields.getRemotePort());
		assertEquals(new Double(2.2), sipSignalingFields.getSipSignalingFieldsVersion());
		assertEquals("summarySip", sipSignalingFields.getSummarySip());
		assertEquals(vendorVnfNameFields, sipSignalingFields.getVendorVnfNameFields());
		 assert (sipSignalingFields.toString() != null);
       assert (sipSignalingFields.hashCode() != 0);
       assertEquals(true,sipSignalingFields.equals(sipSignalingFields));
		
		
	}

}
