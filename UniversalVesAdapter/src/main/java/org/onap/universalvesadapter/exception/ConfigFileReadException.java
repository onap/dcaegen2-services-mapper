package org.onap.universalvesadapter.exception;

/**
 * Exception when unable to connect to Config file Disk repository
 * 
 * @author kmalbari
 *
 */
public class ConfigFileReadException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 414953072485703000L;

	public ConfigFileReadException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
