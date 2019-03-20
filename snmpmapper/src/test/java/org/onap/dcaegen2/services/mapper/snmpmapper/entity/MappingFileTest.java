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
package org.onap.dcaegen2.services.mapper.snmpmapper.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MappingFileTest {

	private MappingFile createTestSubject() {
		return new MappingFile();
	}
	
	

	@Test
	public void testGetEnterprise_ID() throws Exception {
		MappingFile testSubject;
		String result;
		String mappingname="mapping";
		byte[] mapping_File =mappingname.getBytes() ;
		// default test
		testSubject = new MappingFile("enterprise_ID","name", "mimetype", mapping_File) ;
		result = testSubject.getEnterprise_ID();
		assertEquals("enterprise_ID", result);
	}

	@Test
	public void testSetEnterprise_ID() throws Exception {
		MappingFile testSubject;
		String enterprise_ID = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setEnterprise_ID(enterprise_ID);
	}

	@Test
	public void testGetName() throws Exception {
		MappingFile testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();
	}

	@Test
	public void testSetName() throws Exception {
		MappingFile testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);
	}

	@Test
	public void testGetMimetype() throws Exception {
		MappingFile testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMimetype();
	}

	@Test
	public void testSetMimetype() throws Exception {
		MappingFile testSubject;
		String mimetype = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setMimetype(mimetype);
	}

	@Test
	public void testGetMapping_File() throws Exception {
		MappingFile testSubject;
		byte[] result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getMapping_File();
	}

	@Test
	public void testSetMapping_File() throws Exception {
		MappingFile testSubject;
		byte[] mapping_File = new byte[] { ' ' };

		// default test
		testSubject = createTestSubject();
		testSubject.setMapping_File(mapping_File);
	}
}