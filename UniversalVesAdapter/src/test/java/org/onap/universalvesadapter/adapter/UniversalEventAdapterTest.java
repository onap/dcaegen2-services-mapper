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
package org.onap.universalvesadapter.adapter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.milyn.Smooks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.onap.dcaegen2.ves.domain.VesEvent;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.adapter.UniversalEventAdapter;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.onap.universalvesadapter.exception.ConfigFileSmooksConversionException;
import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.ConfigFileService;
import org.onap.universalvesadapter.utils.MapperConfigUtils;
import org.onap.universalvesadapter.utils.SmooksUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class UniversalEventAdapterTest  {
		
    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());
    
    @Mock
    private ConfigFileService configFileService;    
    
    @InjectMocks
    @Autowired
    private UniversalEventAdapter universalVesAdapter;
    
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    } 
        
    
	@Test
	public void testtransform()  {
        StringBuffer incomingJsonString = new StringBuffer("{ ")
                .append("\"protocol version\":\"v2c\", ")
                .append("\"notify OID\":\".1.3.6.1.4.1.74.2.46.12.1.1AAA\", ")
                .append("\"cambria.partition\":\"dcae-snmp.client.research.att.com\", ")
                .append("\"trap category\":\"UCSNMP-HEARTBEAT\", ")
                .append("\"epoch_serno\": 15161177410000, ")
                .append("\"community\":\"public\", ")
                .append("\"time received\": 1516117741, ")
                .append("\"agent name\":\"localhost\", ")
                .append("\"agent address\":\"127.0.0.1\", ")
                .append("\"community len\": 6, ")
                .append("\"notify OID len\": 12, ")
                .append("\"varbinds\": [{ ")
                .append("    \"varbind_type\":\"octet\", ")
                .append("    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.1\", ")
                .append("    \"varbind_value\":\"ucsnmp heartbeat - ignore\" ")
                .append(" }, { ")
                .append("    \"varbind_type\":\"octet\", ")
                .append("    \"varbind_oid\":\".1.3.6.1.4.1.74.2.46.12.1.1.2\", ")
                .append("    \"varbind_value\":\"Tue Jan 16 10:49:01 EST 2018\" ")
                .append(" }] ")
                .append("}");
        
        StringBuffer configFileData = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ")
                .append("<smooks-resource-list    xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\"   ")
                .append("xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\"    ")
                .append(" xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.2.xsd\">     ")
                .append(" <json:reader rootName=\"simple\"  keyWhitspaceReplacement=\"-\">    ")
                .append(" </json:reader>     ")
                .append(" <jb:bean class=\"org.onap.dcaegen2.ves.domain.VesEvent\" beanId=\"vesEvent\" ")
                .append(" createOnElement=\"simple\">")
                .append("        <jb:wiring property=\"event\" beanIdRef=\"event\"/>")
                .append(" </jb:bean>       ")
                .append(" <jb:bean class=\"org.onap.dcaegen2.ves.domain.Event\" beanId=\"event\" ")
                .append(" createOnElement=\"simple\">         ")
                .append("     <jb:wiring property=\"commonEventHeader\" beanIdRef=\"commonEventHeader\"/>")
                .append("     <jb:wiring property=\"faultFields\" beanIdRef=\"faultFields\"/>             ")
                .append(" </jb:bean>       ")
                .append(" <jb:bean class=\"org.onap.dcaegen2.ves.domain.CommonEventHeader\" ")
                .append(" beanId=\"commonEventHeader\" createOnElement=\"simple\">         ")
                .append("     <jb:value property=\"eventId\" data=\"#/community\" />      ")
                .append("     <jb:value property=\"eventName\" data=\"#/protocol-version\" />             ")
                .append("     <jb:value property=\"domain\" data=\"#/trap-category\" />       ")
                .append("     <jb:value property=\"sequence\" data=\"#/time-received\" decoder=\"Long\"/>        ")
                .append("     <jb:value property=\"lastEpochMicrosec\" data=\"#/community-len\"  decoder=\"Double\" />       ")
                .append("     <jb:value property=\"startEpochMicrosec\" data=\"#/notify-OID-len\"   />    ")
                .append(" </jb:bean>           ")
                .append(" <jb:bean class=\"org.onap.dcaegen2.ves.domain.FaultFields\" beanId=\"faultFields\"")
                .append(" createOnElement=\"simple\">        <jb:value property=\"alarmCondition\" data=\"#/cambria.partition\" />  ")
                .append("     <jb:value property=\"eventSeverity\" data=\"#/notify-OID\" />    ")
                .append("     <jb:value property=\"eventSourceType\" data=\"#/agent-name\" />       ")
                .append("     <jb:value property=\"specificProblem\" data=\"#/agent-address\" />       ")
                .append("     <jb:value property=\"faultFieldsVersion\" data=\"#/epoch_serno\" decoder=\"Double\" /> ")
                .append(" </jb:bean>                   ")
                .append("</smooks-resource-list>");           
        
        try {
            Mockito.when(configFileService.readConfigFile(Mockito.anyString())).thenReturn(configFileData.toString());
        } catch (Exception e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        
        
        try {
            String actualResult = universalVesAdapter.transform(incomingJsonString.toString(), "snmp");
            assertNotNull(actualResult);
            assertNotEquals("", actualResult);
        } catch (VesException exception) {
            eLOGGER.error("Error occurred : ", exception );
        }
	}




}
