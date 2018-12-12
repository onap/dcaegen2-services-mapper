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
package org.onap.dcaegen2.services.mapper.snmpmapper.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.onap.dcaegen2.services.mapper.snmpmapper.DAO.MappingFileDAO;
import org.onap.dcaegen2.services.mapper.snmpmapper.entity.MappingFile;
import org.onap.dcaegen2.services.mapper.snmpmapper.exception.SnmpMapperException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MappingFileServiceImpl implements MappingFileService {
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	 private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
	static String enterpriseid;
    static MappingFile mapping;
    
    @Autowired
    MappingFileDAO mappingFileDAO;
	
	@Override
	public String saveUploadedFileInDatabase(HttpServletRequest request, MultipartFile[] mappingfile) {
		
		// Reading File Upload Form Input Parameters        
        enterpriseid = request.getParameter("eid");
        
        debugLogger.info("EnterPrise ID recieved:{}",enterpriseid);
         
        
        if ((mappingfile != null) && (mappingfile.length > 0)) {
            for (MultipartFile aFile : mappingfile) {
                if(aFile.isEmpty()) {
                    continue;
                } else {
                	debugLogger.debug("MappingFile Name = {} with enterprise id:{}", aFile.getOriginalFilename(),enterpriseid);
                    if (!aFile.getOriginalFilename().equals("")) {
                    	try {
                    	mapping = new MappingFile();
                        mapping.setEnterprise_ID(enterpriseid);
                        
							mapping.setMapping_File(aFile.getBytes());
						
                        mapping.setMimetype(aFile.getContentType());
                        mapping.setName(aFile.getOriginalFilename());
                        
                        
                       
                        mappingFileDAO.uploadMappingFile(aFile,enterpriseid);
                        } catch (SnmpMapperException snmpMapperException) {
                        	errorLogger.error(snmpMapperException.getMessage());
						} catch (IOException e) {
							errorLogger.error("IOException occured:{}",e.getCause());
        						return "failed";
						} catch (SQLException e) {
							errorLogger.error("SQLException occured:{}",e.getCause());
        						return "failed";
						}
               
                    }
                }
                debugLogger.info("File Is Successfully Uploaded & Saved In The Database\n");
            }
        } else {
        	return "failed";
        }
		return "success";
	}

	
	
}
