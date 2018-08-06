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

package org.onap.universalvesadapter.configs;

import static org.junit.Assert.*;

import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.configs.DiskRepoConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class DiskRepoConfigurationTest {
	
	@InjectMocks
	@Autowired
	DiskRepoConfiguration diskRepoConfiguration = new DiskRepoConfiguration();
	
	@Test
	public void test() {
		
		
		String actualdata = diskRepoConfiguration.getFileRepositoryUrl();
		
		assertEquals("http://localhost:8888/fileAsString/", actualdata);
	}

}
*/