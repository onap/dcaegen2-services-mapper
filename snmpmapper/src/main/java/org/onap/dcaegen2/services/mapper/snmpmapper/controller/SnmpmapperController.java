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
package org.onap.dcaegen2.services.mapper.snmpmapper.controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.onap.dcaegen2.services.mapper.snmpmapper.entity.MappingFile;
import org.onap.dcaegen2.services.mapper.snmpmapper.service.MappingFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SnmpmapperController {
    
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	@Autowired
	MappingFileService mappingFileService;
	
    @GetMapping("/")
    public String index() {
        return "uploadform.html";
    }

    
 
    /**
     * 
     * Method to upload Mapping file in the postgresql db
     * @param request
     * @param mapper
     * @return
     * 
     */
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public String saveUploadedFileInDatabase(HttpServletRequest request, final @RequestParam MultipartFile[] mapper){
    String	result=mappingFileService.saveUploadedFileInDatabase(request, mapper);
    debugLogger.debug("result of the mapping file upload:{}",result);
    if(result.equals("success")) {
    	 return  "success.html";
    }else
    {
    	return "fail.html";
    }
   
    }
    
}
