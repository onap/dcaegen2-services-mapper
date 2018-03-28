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
package org.onap.dcae.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.onap.dcae.mapper.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SnmpmapperApplication.class)
@AutoConfigureMockMvc

public class FileUploadControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Mock
    private StorageService storageService;
    
    @Autowired
    @InjectMocks
    private FileUploadController fuc;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    } 
    
    
    @Test
    public void test() throws Exception {
        
        Model map = new ExtendedModelMap();
        
        Path p1 = Paths.get(".");
        List<Path> list = new ArrayList<>();
        list.add(p1);
        
        
        try {
            Mockito.when(storageService.loadAll()).thenReturn(list.stream());
        } catch (Exception e) {
//            eLOGGER.error("Error occurred : " + e.getMessage());
        }
       
        try {
            String listUploadedFiles = fuc.listUploadedFiles(map);
            
            assertEquals("uploadForm", listUploadedFiles);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
       
 
        
    }

}
