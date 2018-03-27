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

import java.net.URI;
import java.net.URISyntaxException;

import org.onap.universalvesadapter.configs.DiskRepoConfiguration;
import org.onap.universalvesadapter.exception.ConfigFileReadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation of {@code ConfigFileService} using disk repository.
 * 
 * @author kmalbari
 *
 */
@Component
public class DiskRepoConfigFileService implements ConfigFileService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());    
    
    @Autowired
    private DiskRepoConfiguration diskRepoConfiguration;
    
    private RestTemplate restTemplate;
    
    private URI uri = null;

    /* (non-Javadoc)
     * @see org.onap.universalvesadapter.service.ConfigFileService#readConfigFile(java.lang.String)
     */
    @Override
    public String readConfigFile(String fileName) throws ConfigFileReadException {
        logger.debug("Reading config file for " + fileName);
        if (null == uri) {
            try {
                uri = new URI(diskRepoConfiguration.getFileRepositoryUrl() + fileName);
                logger.debug("Read URI for " + fileName);
            } catch (URISyntaxException exception) {
                throw new ConfigFileReadException("Unable to read config file for file "
            + fileName + "\n Reason : " + exception.getMessage(), exception);
            }
        }
        logger.debug("Calling file repo service for URI" + uri);
        ResponseEntity<String> fileDataEntity = getRestTemplate().getForEntity(uri, String.class);
        logger.debug("Call completed successfully");
        return fileDataEntity.getBody();
    }
    
    /**
     * Instantiates the instance if null and returns it.
     * 
     * @return {@code RestTemplate} instance
     */
    private RestTemplate getRestTemplate(){
        
        if (null == restTemplate) {
            restTemplate = new RestTemplate();
        }
        
        return restTemplate;
    }

}
