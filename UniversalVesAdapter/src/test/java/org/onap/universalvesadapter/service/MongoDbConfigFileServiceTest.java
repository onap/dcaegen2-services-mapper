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
/*package org.onap.universalvesadapter.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.service.MongoDbConfigFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class MongoDbConfigFileServiceTest {


    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());    
    
    
    @Autowired
    private MongoDbConfigFileService mongoDbConfigFileService;
    
    @Test
    public void testReadConfigFile() {
        String configContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> "
                + "<smooks-resource-list   xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\"   "
                + "xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\"    "
                + " xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.2.xsd\">     "
                + "     <json:reader rootName=\"simple\"  keyWhitspaceReplacement=\"-\">    "
                + "     </json:reader>     "
                + "</smooks-resource-list>";
        
        assertEquals(configContent, mongoDbConfigFileService.readConfigFile("sample.xml"));
    }

}
*/