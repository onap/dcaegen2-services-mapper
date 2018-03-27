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
		configFileData.setXmlFileName(configFileName);
		configFileData.setXmlContent("<?xml version=\"1.0\" encoding=\"UTF-8\"?> "
                + "<smooks-resource-list   xmlns=\"http://www.milyn.org/xsd/smooks-1.1.xsd\"   "
                + "xmlns:json=\"http://www.milyn.org/xsd/smooks/json-1.1.xsd\"    "
                + " xmlns:jb=\"http://www.milyn.org/xsd/smooks/javabean-1.2.xsd\">     "
                + "     <json:reader rootName=\"simple\"  keyWhitspaceReplacement=\"-\">    "
                + "     </json:reader>     "
                + "</smooks-resource-list>");
		return configFileData.getXmlContent();
	}
	
	
}
