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

import org.onap.universalvesadapter.domain.ConfigFileData;
import org.springframework.stereotype.Component;

/**
 * Service to use mongo db as config file repository
 * 
 * @author kmalbari
 *
 */
@Component
public class MongoDbConfigFileService implements ConfigFileService {

	/* (non-Javadoc)
	 * @see org.onap.universalvesadapter.service.ConfigFileService#readConfigFile(java.lang.String)
	 */
	public String readConfigFile(String configFileName){
		//HERE CONFIG FILE DATA WOULD COME FROM MONGO DB
		ConfigFileData configFileData = new ConfigFileData();
		configFileData.setXmlFileName("");
		configFileData.setXmlContent("<?xml version=\"1.0\" encoding=\"UTF-8\"?> <smooks-resource-list 	 xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\" 	 xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\" 	 xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.2.xsd\">     <json:reader rootName=\"simple\"  keyWhitspaceReplacement=\"-\"> 	</json:reader>     <!-- <jb:bean class=\"com.example.demo.Simple\" beanId=\"simple\" createOnElement=\"simple\">     	<jb:value property=\"orderId\" data=\"#/orderId\" />     	<jb:value property=\"username\" data=\"#/username\" />     	<jb:wiring property=\"customer\" beanIdRef=\"customer\"/>     	<jb:wiring property=\"orderItems\" beanIdRef=\"orderItems\"/>    	     </jb:bean> -->         <jb:bean class=\"org.onap.dcaegen2.ves.domain.VesEvent\" beanId=\"vesEvent\" createOnElement=\"simple\">     	<jb:wiring property=\"event\" beanIdRef=\"event\"/>     </jb:bean>       <jb:bean class=\"org.onap.dcaegen2.ves.domain.Event\" beanId=\"event\" createOnElement=\"simple\">     	<jb:wiring property=\"commonEventHeader\" beanIdRef=\"commonEventHeader\"/>     	<jb:wiring property=\"faultFields\" beanIdRef=\"faultFields\"/>    	     	<jb:wiring property=\"measurementsForVfScalingFields\" beanIdRef=\"measurementsForVfScalingFields\"/>    	     </jb:bean>       <jb:bean class=\"org.onap.dcaegen2.ves.domain.MeasurementsForVfScalingFields\" beanId=\"measurementsForVfScalingFields\" createOnElement=\"simple\">     	<jb:wiring property=\"additionalMeasurements\" beanIdRef=\"additionalMeasurements\"/>     </jb:bean>         <jb:bean class=\"org.onap.dcaegen2.ves.domain.CommonEventHeader\" beanId=\"commonEventHeader\" createOnElement=\"simple\">     	<jb:value property=\"eventId\" data=\"#/community\" />     	<jb:value property=\"eventName\" data=\"#/protocol-version\" /> 	     	<jb:value property=\"domain\" data=\"#/trap-category\" />     	<jb:value property=\"sequence\" data=\"#/time-received\" decoder=\"Long\"/>     	<jb:value property=\"lastEpochMicrosec\" data=\"#/community-len\"  decoder=\"Double\" />     	<jb:value property=\"startEpochMicrosec\" data=\"#/notify-OID-len\"   />     </jb:bean>           <jb:bean class=\"org.onap.dcaegen2.ves.domain.FaultFields\" beanId=\"faultFields\" createOnElement=\"simple\">     	<jb:value property=\"alarmCondition\" data=\"#/cambria.partition\" />     	<jb:value property=\"eventSeverity\" data=\"#/notify-OID\" />     	<jb:value property=\"eventSourceType\" data=\"#/agent-name\" />     	<jb:value property=\"specificProblem\" data=\"#/agent-address\" /> 	     	<jb:value property=\"faultFieldsVersion\" data=\"#/epoch_serno\" decoder=\"Double\" />     </jb:bean>               	<jb:bean class=\"java.util.ArrayList\" beanId=\"additionalMeasurements\" createOnElement=\"simple\">     	<jb:wiring beanIdRef=\"additionalMeasurement\"/>     </jb:bean>            <jb:bean class=\"org.onap.dcaegen2.ves.domain.AdditionalMeasurement\" beanId=\"additionalMeasurement\" createOnElement=\"varbinds/element\">     	<jb:value property=\"name\" data=\"#/varbind_value\" />     </jb:bean>        </smooks-resource-list>");
		return configFileData.getXmlContent();
	}

	@Override
	public String fileName(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
