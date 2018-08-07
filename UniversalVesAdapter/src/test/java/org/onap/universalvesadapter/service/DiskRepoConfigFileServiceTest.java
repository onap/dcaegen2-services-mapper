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

package org.onap.universalvesadapter.service;

import static org.junit.Assert.assertEquals;
import java.net.URI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.service.DiskRepoConfigFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DiskRepoConfigFileServiceTest {

    @Mock
    RestTemplate restTemplate;
    
    @InjectMocks
    @Autowired
    DiskRepoConfigFileService diskRepoConfigFileService;
    
    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }   
    
    
    @Test
    public void testReadConfigFile() {
        
        String result = "test file";

        ResponseEntity<String> fileDataEntity = new ResponseEntity<String>(result, HttpStatus.OK);
        
        Mockito.when(restTemplate.getForEntity(Mockito.any(URI.class), Mockito.any(Class.class))).thenReturn(fileDataEntity);
        
        try {
            String readConfigFile = diskRepoConfigFileService.readConfigFile("testCase.xml");
            assertEquals(result, readConfigFile);
        } catch (ConfigFileReadException exception) {
            eLOGGER.error("Error occurred : ", exception);
        }
        
    }

}
*/