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
 * Implementation of {@code ConfigFileService} using disk repository
 * 
 * @author kmalbari
 *
 */
@Component
public class DiskRepoConfigFileService implements ConfigFileService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	private DiskRepoConfiguration diskRepoConfiguration;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private URI uri = null;

	/* (non-Javadoc)
	 * @see org.onap.universalvesadapter.service.ConfigFileService#readConfigFile(java.lang.String)
	 */
	@Override
	public String readConfigFile(String fileName) throws ConfigFileReadException {
		LOGGER.debug("Reading config file for " + fileName);
		if(null == uri){
			try {
				uri = new URI(diskRepoConfiguration.getFileRepositoryUrl()+fileName);
				LOGGER.debug("Read URI for " + fileName);
			} catch (URISyntaxException exception) {
				throw new ConfigFileReadException("Unable to read config file for file "
			+ fileName + "\n Reason : " + exception.getMessage());
			}
		}
		LOGGER.debug("Calling file repo service for URI" + uri);
		ResponseEntity<String> fileDataEntity = restTemplate.getForEntity(uri, String.class);
		LOGGER.debug("Call completed successfully");
		return fileDataEntity.getBody();
	}

}
