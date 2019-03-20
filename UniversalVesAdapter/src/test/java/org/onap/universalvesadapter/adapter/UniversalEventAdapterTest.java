/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2018-2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.universalvesadapter.adapter;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.VESAdapterInitializer;
import org.onap.universalvesadapter.utils.CollectorConfigPropertyRetrival;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(PowerMockRunner.class)
@SpringBootTest(classes = Application.class)
public class UniversalEventAdapterTest {
    
    private static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");
    
    @Mock
    private VESAdapterInitializer vesAdapterInitializer;
    
    @InjectMocks
    private UniversalEventAdapter universalVesAdapter;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @PrepareForTest({CollectorConfigPropertyRetrival.class})
    @Test
    public void testtransform() {
        
        StringBuffer incomingJsonString = new StringBuffer("{\n" + "    \"rule-id\": \"12121\",\n"
                + "    \"notification\": {\n"
                + "        \"event-time\": \"2018-03-15T08:15:32.000Z\",\n"
                + "        \"notification-id\":  \"2541256\",\n" + "        \"message\":  {\n"
                + "            \"topic\":\"resource\",\n"
                + "            \"object-type\":\"onu\",               \n"
                + "            \"version\": \"v1\",               \n"
                + "            \"operation\": \"create\",   \n"
                + "            \"target\": \"ont/ont=23hk1231231232\",   \n"
                + "            \"content\":  {\n" + "                \"onu\":  {\n"
                + "                    \"sn\":   \"48575443FA637D1A\",\n"
                + "                    \"refParentNE\":  \"550e8400-e29b-41d4-a716-446655440000\",\n"
                + "                    \"refParentNeNativeId\":  \"FDN\",\n"
                + "                    \"refParentLTP\": \"8c0db89e-218c-4e18-b0de-7a6788b3dda4\",\n"
                + "                    \"refParentLTPNativeId\": \"FDN\",\n"
                + "                    \"onuId\": \"213\",\n"
                + "                    \"accessID\": \"HG65875420001\"\n" + "                }\n"
                + "            }\n" + "        }\n" + "    }\n" + "}");
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("defaultMappingFile-" + Thread.currentThread().getName(),
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<smooks-resource-list xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\" xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.4.xsd\" xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\">\n"
                        + "   <json:reader rootName=\"vesevent\" keyWhitspaceReplacement=\"-\">\n"
                        + "      <json:keyMap>\n"
                        + "         <json:key from=\"date&amp;time\" to=\"date-and-time\" />\n"
                        + "      </json:keyMap>\n" + "   </json:reader>\n"
                        + "   <jb:bean class=\"org.onap.dcaegen2.ves.domain.ves70.VesEvent\""
                        + " beanId=\"vesEvent\" createOnElement=\"vesevent\">\n"
                        + "      <jb:wiring property=\"event\" beanIdRef=\"event\" />\n"
                        + "   </jb:bean>\n"
                        + "   <jb:bean class=\"org.onap.dcaegen2.ves.domain.ves70.Event\" "
                        + "beanId=\"event\" createOnElement=\"vesevent\">\n"
                        + "      <jb:wiring property=\"commonEventHeader\" beanIdRef=\"commonEventHeader\" />\n"
                        + "      <jb:wiring property=\"pnfRegistrationFields\" beanIdRef=\"pnfRegistrationFields\" />\n"
                        + "   </jb:bean>\n"
                        + "   <jb:bean class=\"org.onap.dcaegen2.ves.domain.ves70.CommonEventHeader\""
                        + " beanId=\"commonEventHeader\" createOnElement=\"vesevent\">\n"
                        + "<jb:expression property=\"version\">"
                        + "org.onap.dcaegen2.ves.domain.ves70.CommonEventHeader.Version._4_0_1</jb:expression> \n"
                        + "<jb:expression property=\"eventType\">\"pnfRegistration\"</jb:expression>\n"
                        + "<jb:expression property=\"vesEventListenerVersion\">"
                        + "org.onap.dcaegen2.ves.domain.ves70.CommonEventHeader.VesEventListenerVersion._7_0_1"
                        + "</jb:expression>\n"
                        + "       <jb:expression property=\"eventId\" execOnElement=\"vesevent\">"
                        + "\"registration_\"+commonEventHeader.ts1</jb:expression>\n"
                        + "<jb:expression property=\"reportingEntityName\">\"VESMapper\"</jb:expression>\n"
                        + "      <jb:expression property=\"domain\">"
                        + "org.onap.dcaegen2.ves.domain.ves70.CommonEventHeader.Domain.PNF_REGISTRATION"
                        + "</jb:expression>\n"
                        + "      <jb:expression property=\"eventName\" execOnElement=\"vesevent\">"
                        + "commonEventHeader.domain</jb:expression>\n"
                        + "<jb:value property=\"sequence\" data=\"0\" default=\"0\" decoder=\"Long\" />\n"
                        + "<jb:expression property=\"lastEpochMicrosec\" execOnElement=\"vesevent\">"
                        + "commonEventHeader.ts1</jb:expression>\n"
                        + "      <jb:expression property=\"startEpochMicrosec\" execOnElement=\"vesevent\">"
                        + "commonEventHeader.ts1</jb:expression>\n"
                        + "      <jb:expression property=\"priority\">"
                        + "org.onap.dcaegen2.ves.domain.ves70.CommonEventHeader.Priority.NORMAL</jb:expression>\n"
                        + "      <jb:value property=\"sourceName\" data=\"notification/message/target\" />\n"
                        + "   </jb:bean>\n"
                        + "   <jb:bean class=\"org.onap.dcaegen2.ves.domain.ves70.PnfRegistrationFields\""
                        + " beanId=\"pnfRegistrationFields\" createOnElement=\"vesevent\">\n"
                        + "     \n"
                        + "       <jb:expression property=\"pnfRegistrationFieldsVersion\">"
                        + "org.onap.dcaegen2.ves.domain.ves70.PnfRegistrationFields.PnfRegistrationFieldsVersion._2_0"
                        + "</jb:expression>\n"
                        + "      <jb:value property=\"serialNumber\" data=\"notification/message/content/onu/sn\" />\n"
                        + "      \n" + "   </jb:bean>\n" + "</smooks-resource-list>");
        
        try {
            vesAdapterInitializer.setMappingFiles(testMap);
            
            String [] identifiertest =
                    CollectorConfigPropertyRetrival.getProperyArray("identifier", "kvTest.json");
            PowerMockito.mockStatic(CollectorConfigPropertyRetrival.class);
            PowerMockito.when(CollectorConfigPropertyRetrival.getProperyArray("identifier", null))
                    .thenReturn(identifiertest);
            
            String actualResult = universalVesAdapter.transform(incomingJsonString.toString());
            assertNotNull(actualResult);
            assertNotEquals("", actualResult);
        } catch (VesException exception) {
            errorLogger.error("Error occurred : {}", exception);
        }
    }
    
}
