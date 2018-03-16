package org.onap.universalvesadapter.service;

import org.onap.universalvesadapter.exception.ConfigFileReadException;

/**
 * A contract defined for services that will handle the operations of config file 
 * 
 * @author kmalbari
 *
 */
public interface ConfigFileService {
	
	/**
	 * Returns the config file data
	 * 
	 * @param fileName 
	 * @return config file content
	 * @throws ConfigFileReadException if unable to read config file
	 */
	String readConfigFile(String fileName) throws ConfigFileReadException;
	
}
