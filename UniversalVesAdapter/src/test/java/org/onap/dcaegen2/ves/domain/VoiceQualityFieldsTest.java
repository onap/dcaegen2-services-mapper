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
import org.onap.dcaegen2.ves.domain.VoiceQualityFields;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class VoiceQualityFieldsTest {

	@Autowired
	VoiceQualityFields voiceQualityFields =new VoiceQualityFields();
	@Mock
	VendorVnfNameFields vendorVnfNameFields;
	@Mock
	EndOfCallVqmSummaries endOfCallVqmSummaries;
	List<AdditionalInformation> additionalInformation;
	Object value;
	Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@Test
	public void test() {
		voiceQualityFields.setAdditionalInformation(additionalInformation);
		voiceQualityFields.setAdditionalProperty("name", value);
		voiceQualityFields.setCalleeSideCodec("test");
		voiceQualityFields.setCallerSideCodec("test");
		voiceQualityFields.setCorrelator("test");
		voiceQualityFields.setEndOfCallVqmSummaries(endOfCallVqmSummaries);
		voiceQualityFields.setMidCallRtcp("test");
		voiceQualityFields.setPhoneNumber("test");
		voiceQualityFields.setVendorVnfNameFields(vendorVnfNameFields);
		voiceQualityFields.setVoiceQualityFieldsVersion(2.2);
		additionalProperties.put("name", value);
		
		assertEquals("test", voiceQualityFields.getCalleeSideCodec());
		assertEquals("test", voiceQualityFields.getCallerSideCodec());
		assertEquals("test", voiceQualityFields.getCorrelator());
		assertEquals("test", voiceQualityFields.getMidCallRtcp());
		assertEquals("test", voiceQualityFields.getPhoneNumber());
		assertEquals(additionalProperties, voiceQualityFields.getAdditionalProperties());
		assertEquals(endOfCallVqmSummaries, voiceQualityFields.getEndOfCallVqmSummaries());
		assertEquals(vendorVnfNameFields, voiceQualityFields.getVendorVnfNameFields());
		assertEquals(additionalInformation, voiceQualityFields.getAdditionalInformation());
		
		
		
		
	}

}
