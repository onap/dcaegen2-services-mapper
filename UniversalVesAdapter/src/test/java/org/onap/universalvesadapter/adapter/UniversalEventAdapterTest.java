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

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.exception.VesException;
import org.onap.universalvesadapter.service.ConfigFileService;
import org.onap.universalvesadapter.service.VESAdapterInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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
                .append("\"notify OID\":\".1.3.6.1.4.1.74.2.46.12.1.1\", ")
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
        
        Map<String,String> testMap=new HashMap<String,String>();
        testMap.put("defaultSnmpMappingFile", "<?xml version=\"1.0\"?>\r\n" + 
        		"<smooks-resource-list\r\n" + 
        		"	 xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\"\r\n" + 
        		"	 xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\"\r\n" + 
        		"	 xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.4.xsd\">\r\n" + 
        		"    <json:reader rootName=\"vesevent\"  keyWhitspaceReplacement=\"-\">\r\n" + 
        		"    <json:keyMap>\r\n" + 
        		"	    	<json:key from=\"date&amp;time\" to=\"date-and-time\" />\r\n" + 
        		"	    </json:keyMap>\r\n" + 
        		"	</json:reader>\r\n" + 
        		"   \r\n" + 
        		"     <jb:bean class=\"org.onap.dcaegen2.ves.domain.VesEvent\" beanId=\"vesEvent\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring property=\"event\" beanIdRef=\"event\"/>\r\n" + 
        		"    </jb:bean>\r\n" + 
        		" \r\n" + 
        		"     <jb:bean class=\"org.onap.dcaegen2.ves.domain.Event\" beanId=\"event\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring property=\"commonEventHeader\" beanIdRef=\"commonEventHeader\"/>\r\n" + 
        		"    	<jb:wiring property=\"faultFields\" beanIdRef=\"faultFields\"/>    	\r\n" + 
        		"    	<!--<jb:wiring property=\"measurementsForVfScalingFields\" beanIdRef=\"measurementsForVfScalingFields\"/> -->   	\r\n" + 
        		"    </jb:bean>   \r\n" + 
        		"    <!--<jb:bean class=\"org.onap.dcaegen2.ves.domain.MeasurementsForVfScalingFields\" beanId=\"measurementsForVfScalingFields\" createOnElement=\"simple\">\r\n" + 
        		"    	<jb:wiring property=\"additionalMeasurements\" beanIdRef=\"additionalMeasurements\"/>\r\n" + 
        		"    </jb:bean>-->\r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.CommonEventHeader\" beanId=\"commonEventHeader\" createOnElement=\"vesevent\">\r\n" + 
        		"		<jb:expression property=\"version\">\"3.0\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventId\">\"XXXX\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"reportingEntityName\">\"VesAdapter\"</jb:expression>\r\n" + 
        		"	 	<jb:expression property=\"domain\">\"fault\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventName\" execOnElement=\"vesevent\" >commonEventHeader.domain+\"_\"+commonEventHeader.reportingEntityName +\"_\"+ faultFields.alarmCondition;</jb:expression>\r\n" + 
        		"    	<jb:value property=\"sequence\" data=\"0\" default=\"0\" decoder=\"Long\"/>\r\n" + 
        		"    	<jb:value property=\"lastEpochMicrosec\" data=\"#/time-received\"  decoder=\"Double\" />\r\n" + 
        		"    	<jb:value property=\"startEpochMicrosec\" data=\"#/time-received\"  decoder=\"Double\"/>\r\n" + 
        		"		<jb:expression property=\"priority\">\"Medium\"</jb:expression>\r\n" + 
        		"    	<jb:expression property=\"sourceName\">\"VesAdapter\"</jb:expression>\r\n" + 
        		"    </jb:bean>   \r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.FaultFields\" beanId=\"faultFields\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:value property=\"alarmCondition\" data=\"#/trap-category\" />\r\n" + 
        		"		<jb:expression property=\"eventSeverity\">\"MINOR\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventSourceType\">\"SNMP Agent\"</jb:expression>\r\n" + 
        		"    	<jb:expression property=\"specificProblem\">\"SNMP Fault\"</jb:expression>\r\n" + 
        		"    	<jb:value property=\"faultFieldsVersion\" data=\"2.0\" default=\"2.0\" decoder=\"Double\" />\r\n" + 
        		"    	<jb:wiring property=\"alarmAdditionalInformation\" beanIdRef=\"alarmAdditionalInformationroot\"/>   \r\n" + 
        		"		<jb:expression property=\"vfStatus\">\"Active\"</jb:expression>\r\n" + 
        		"    	\r\n" + 
        		"    </jb:bean>  \r\n" + 
        		"     <jb:bean class=\"java.util.ArrayList\" beanId=\"alarmAdditionalInformationroot\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring beanIdRef=\"alarmAdditionalInformation\"/>\r\n" + 
        		"    </jb:bean>\r\n" + 
        		"    \r\n" + 
        		"      <jb:bean class=\"org.onap.dcaegen2.ves.domain.AlarmAdditionalInformation\" beanId=\"alarmAdditionalInformation\" createOnElement=\"varbinds/element\">\r\n" + 
        		"    	<jb:value property=\"name\" data=\"#/varbind_oid\"/>\r\n" + 
        		"        <jb:value property=\"value\" data=\"#/varbind_value\" />\r\n" + 
        		"    </jb:bean>\r\n" + 
        		"	<!--<jb:bean class=\"java.util.ArrayList\" beanId=\"additionalMeasurements\" createOnElement=\"simple\">\r\n" + 
        		"    	<jb:wiring beanIdRef=\"additionalMeasurement\"/>\r\n" + 
        		"    </jb:bean>    \r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.AdditionalMeasurement\" beanId=\"additionalMeasurement\" createOnElement=\"varbinds/element\">\r\n" + 
        		"    	<jb:value property=\"name\" data=\"#/varbind_value\" />\r\n" + 
        		"    </jb:bean>  -->  \r\n" + 
        		"    \r\n" + 
        		"</smooks-resource-list>");
        testMap.put(".1.3.6.1.4.1.1751", "<?xml version=\"1.0\"?>\r\n" + 
        		"<smooks-resource-list\r\n" + 
        		"	 xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\"\r\n" + 
        		"	 xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\"\r\n" + 
        		"	 xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.4.xsd\">\r\n" + 
        		"    <json:reader rootName=\"vesevent\"  keyWhitspaceReplacement=\"-\">\r\n" + 
        		"    <json:keyMap>\r\n" + 
        		"	    	<json:key from=\"date&amp;time\" to=\"date-and-time\" />\r\n" + 
        		"	    </json:keyMap>\r\n" + 
        		"	</json:reader>\r\n" + 
        		"   \r\n" + 
        		"     <jb:bean class=\"org.onap.dcaegen2.ves.domain.VesEvent\" beanId=\"vesEvent\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring property=\"event\" beanIdRef=\"event\"/>\r\n" + 
        		"    </jb:bean>\r\n" + 
        		" \r\n" + 
        		"     <jb:bean class=\"org.onap.dcaegen2.ves.domain.Event\" beanId=\"event\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring property=\"commonEventHeader\" beanIdRef=\"commonEventHeader\"/>\r\n" + 
        		"    	<jb:wiring property=\"faultFields\" beanIdRef=\"faultFields\"/>    	\r\n" + 
        		"    	<!--<jb:wiring property=\"measurementsForVfScalingFields\" beanIdRef=\"measurementsForVfScalingFields\"/> -->   	\r\n" + 
        		"    </jb:bean>   \r\n" + 
        		"    <!--<jb:bean class=\"org.onap.dcaegen2.ves.domain.MeasurementsForVfScalingFields\" beanId=\"measurementsForVfScalingFields\" createOnElement=\"simple\">\r\n" + 
        		"    	<jb:wiring property=\"additionalMeasurements\" beanIdRef=\"additionalMeasurements\"/>\r\n" + 
        		"    </jb:bean>-->\r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.CommonEventHeader\" beanId=\"commonEventHeader\" createOnElement=\"vesevent\">\r\n" + 
        		"		<jb:expression property=\"version\">\"3.0\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventId\">\"XXXX\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"reportingEntityName\">\"VesAdapter\"</jb:expression>\r\n" + 
        		"	 	<jb:expression property=\"domain\">\"fault\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventName\" execOnElement=\"vesevent\" >commonEventHeader.domain+\"_\"+commonEventHeader.reportingEntityName +\"_\"+ faultFields.alarmCondition;</jb:expression>\r\n" + 
        		"    	<jb:value property=\"sequence\" data=\"0\" default=\"0\" decoder=\"Long\"/>\r\n" + 
        		"    	<jb:value property=\"lastEpochMicrosec\" data=\"#/time-received\"  decoder=\"Double\" />\r\n" + 
        		"    	<jb:value property=\"startEpochMicrosec\" data=\"#/time-received\"  decoder=\"Double\"/>\r\n" + 
        		"		<jb:expression property=\"priority\">\"Medium\"</jb:expression>\r\n" + 
        		"    	<jb:expression property=\"sourceName\">\"VesAdapter\"</jb:expression>\r\n" + 
        		"    </jb:bean>   \r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.FaultFields\" beanId=\"faultFields\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:value property=\"alarmCondition\" data=\"#/trap-category\" />\r\n" + 
        		"		<jb:expression property=\"eventSeverity\">\"MINOR\"</jb:expression>\r\n" + 
        		"		<jb:expression property=\"eventSourceType\">\"SNMP Agent\"</jb:expression>\r\n" + 
        		"    	<jb:expression property=\"specificProblem\">\"SNMP Fault\"</jb:expression>\r\n" + 
        		"    	<jb:value property=\"faultFieldsVersion\" data=\"2.0\" default=\"2.0\" decoder=\"Double\" />\r\n" + 
        		"    	<jb:wiring property=\"alarmAdditionalInformation\" beanIdRef=\"alarmAdditionalInformationroot\"/>   \r\n" + 
        		"		<jb:expression property=\"vfStatus\">\"Active\"</jb:expression>\r\n" + 
        		"    	\r\n" + 
        		"    </jb:bean>  \r\n" + 
        		"     <jb:bean class=\"java.util.ArrayList\" beanId=\"alarmAdditionalInformationroot\" createOnElement=\"vesevent\">\r\n" + 
        		"    	<jb:wiring beanIdRef=\"alarmAdditionalInformation\"/>\r\n" + 
        		"    </jb:bean>\r\n" + 
        		"    \r\n" + 
        		"      <jb:bean class=\"org.onap.dcaegen2.ves.domain.AlarmAdditionalInformation\" beanId=\"alarmAdditionalInformation\" createOnElement=\"varbinds/element\">\r\n" + 
        		"    	<jb:value property=\"name\" data=\"#/varbind_oid\"/>\r\n" + 
        		"        <jb:value property=\"value\" data=\"#/varbind_value\" />\r\n" + 
        		"    </jb:bean>\r\n" + 
        		"	<!--<jb:bean class=\"java.util.ArrayList\" beanId=\"additionalMeasurements\" createOnElement=\"simple\">\r\n" + 
        		"    	<jb:wiring beanIdRef=\"additionalMeasurement\"/>\r\n" + 
        		"    </jb:bean>    \r\n" + 
        		"    \r\n" + 
        		"    <jb:bean class=\"org.onap.dcaegen2.ves.domain.AdditionalMeasurement\" beanId=\"additionalMeasurement\" createOnElement=\"varbinds/element\">\r\n" + 
        		"    	<jb:value property=\"name\" data=\"#/varbind_value\" />\r\n" + 
        		"    </jb:bean>  -->  \r\n" + 
        		"    \r\n" + 
        		"</smooks-resource-list>");
        
        try {
            VESAdapterInitializer.setMappingFiles(testMap);
        	String actualResult = universalVesAdapter.transform(incomingJsonString.toString(), "snmp");
            assertNotNull(actualResult);
            assertNotEquals("", actualResult);
        } catch (VesException exception) {
            eLOGGER.error("Error occurred : ", exception );
        }
	}




}
