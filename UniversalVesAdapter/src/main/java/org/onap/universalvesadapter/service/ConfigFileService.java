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

import org.onap.universalvesadapter.exception.ConfigFileReadException;

/**
 * A contract defined for services that will handle the operations of config file. 
 * 
 * @author kmalbari
 *
 */
public interface ConfigFileService {
    
    /**
     * Returns the config file data.
     * 
     * @param fileName file name
     * @return config file content
     * @throws ConfigFileReadException if unable to read config file
     */
    String readConfigFile(String fileName) throws ConfigFileReadException;
    String fileName(String fileName);
    
}
