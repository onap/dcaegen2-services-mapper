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
package org.onap.dcaegen2.services.mapper.snmpmapper.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.onap.dcaegen2.services.mapper.snmpmapper.exception.SnmpMapperException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

/**
 * This Class is use for connection to the database and upload the provided mapping file
 *
 */
@Repository
public class MappingFileDAOImpl implements MappingFileDAO {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("${spring.datasource.url}")
	String url;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String pwd;

	@Override
	public String uploadMappingFile(MultipartFile mappingFile, String enterpriseid) throws SQLException, IOException {
		try (Connection con = DriverManager.getConnection(url, user, pwd)) {
			LOGGER.debug("Connection established successfully");
			PreparedStatement pstmt = con.prepareStatement(
					"INSERT INTO mapping_file(enterpriseid, mappingfilecontents, mimetype,  File_Name) VALUES (?, ?, ?, ?)");

			pstmt.setString(1, enterpriseid);
			pstmt.setBytes(2, mappingFile.getBytes());
			pstmt.setString(3, mappingFile.getContentType());
			pstmt.setString(4, mappingFile.getOriginalFilename());

			pstmt.executeUpdate();

		}
		return "Uploaded successfully";

	}

}
