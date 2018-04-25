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
package org.onap.universalvesadapter.configs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.onap.universalvesadapter.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class DMaapMrUrlConfigurationTest {
	
	@Autowired
	@InjectMocks
	DMaapMrUrlConfiguration dMaapMrUrlConfiguration = new DMaapMrUrlConfiguration();

	@Test
	public void test() {
		String actualdata1 = dMaapMrUrlConfiguration.getConsumerProperties();
		String actualdata2 = dMaapMrUrlConfiguration.getPublisherProperties();
		String actualdata3 = dMaapMrUrlConfiguration.getUrl();
		
		assertEquals("../UniversalVesAdapter/src/main/resources/dme2/consumer.properties", actualdata1);
		assertEquals("../UniversalVesAdapter/src/main/resources/dme2/publisher.properties", actualdata2);
		assertEquals("http://localhost:8080/greeting12", actualdata3);
		
		
	}

}
