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
package org.onap.universalvesadapter.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.onap.dcaegen2.ves.domain.AdditionalField;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.service.AdapterService;
import org.onap.universalvesadapter.utils.MapperConfigUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class AdapterServiceTest {

//    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());
    
	@Before
    public void setup() {
           MockitoAnnotations.initMocks(this);
    }

	@Autowired
    @InjectMocks
    private AdapterService adapterService;
	
	
	//AdapterService adapterService = new AdapterService();
    
    @Value("${mapperConfig.file}")
    private String mapperConfigFile;    
    
    @Test
    public void identifyEventTypeFromIncomingJson() throws MapperConfigException, FileNotFoundException, IOException {
        
        String inputJsonString = "{ "
                + "\"protocol version\":\"v2c\", "
                + "\"notify OID\":\".1.3.6.1.4.1.74.2.46.12.1.1AAA\", "
                + "\"cambria.partition\":\"dcae-snmp.client.research.att.com\", "
                + "\"trap category\":\"UCSNMP-HEARTBEAT\", "
                + "\"epoch_serno\": 15161177410000, "
                + "\"community\":\"public\", "
                + "\"time received\": 1516117741, "
                + "\"agent name\":\"localhost\", "
                + "\"agent address\":\"127.0.0.1\", "
                + "\"community len\": 6, "
                + "\"notify OID len\": 12, "
                + "\"varbinds\": [{ "
                + "    \"varbind_type\":\"octet\", "
                + "    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.1\", "
                + "    \"varbind_value\":\"ucsnmp heartbeat - ignore\" "
                + " }, { "
                + "    \"varbind_type\":\"octet\", "
                + "    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.2\", "
                + "    \"varbind_value\":\"Tue Jan 16 10:49:01 EST 2018\" "
                + " }] "
                + "}";
        
        String domain = "";
       
        String mappingFileContent = "{" + "  \"entries\" : [" 
                + "      {" 
                + "          \"priority\" : 1,"
                + "          \"evaluation\" : {" 
                + "                  \"operand\" : \"STARTSWITH\","
                + "                  \"field\" : \"notify OID\"," 
                + "                  \"value\" : \".1.3.6.1.4.1.74\","
                + "                  \"datatype\" : \"STRING\"," 
                + "                  \"lhs\" : null,"
                + "                  \"rhs\" : null  " 
                + "              }," 
                + "          \"result\" : \"snmp\""
                + "      }       " 
                + "  ]" 
                + "}"; 
            MapperConfigUtils.readMapperConfigFile(mappingFileContent);
            domain = adapterService.identifyEventTypeFromIncomingJson(inputJsonString);
        adapterService.identifyEventTypeFromIncomingJson(inputJsonString);
        
        
        assertEquals("snmp", domain);
    }
	 /*@Test
	 public void testidentifyEventTypeFromIncomingJson() throws MapperConfigException{
		 String inputJsonString = "{ "
               + "\"protocol version\":\"v2c\", "
               + "\"notify OID\":\".1.3.6.1.4.1.74.2.46.12.1.1AAA\", "
               + "\"cambria.partition\":\"dcae-snmp.client.research.att.com\", "
               + "\"trap category\":\"UCSNMP-HEARTBEAT\", "
               + "\"epoch_serno\": 15161177410000, "
               + "\"community\":\"public\", "
               + "\"time received\": 1516117741, "
               + "\"agent name\":\"localhost\", "
               + "\"agent address\":\"127.0.0.1\", "
               + "\"community len\": 6, "
               + "\"notify OID len\": 12, "
               + "\"varbinds\": [{ "
               + "    \"varbind_type\":\"octet\", "
               + "    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.1\", "
               + "    \"varbind_value\":\"ucsnmp heartbeat - ignore\" "
               + " }, { "
               + "    \"varbind_type\":\"octet\", "
               + "    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.2\", "
               + "    \"varbind_value\":\"Tue Jan 16 10:49:01 EST 2018\" "
               + " }] "
               + "}";
//		 when(MapperConfigUtils.checkIncomingJsonForMatchingDomain(inputJsonString)).thenReturn("snmp");
		 String actualDomain=adapterService.identifyEventTypeFromIncomingJson(inputJsonString);
		 assertEquals("default", actualDomain);
	 }*/
    
}
