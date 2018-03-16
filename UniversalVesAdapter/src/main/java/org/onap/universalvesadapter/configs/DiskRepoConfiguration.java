package org.onap.universalvesadapter.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * Configuration for disk repository service
 * 
 * @author kmalbari
 *
 */
@Component
public class DiskRepoConfiguration extends Configuration {

	@Value("${fileService.url}")
	private String fileRepositoryUrl;

	public String getFileRepositoryUrl() {
		return fileRepositoryUrl;
	}	
	
}
