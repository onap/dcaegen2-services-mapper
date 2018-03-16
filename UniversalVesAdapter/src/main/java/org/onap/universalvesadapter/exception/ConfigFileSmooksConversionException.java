package org.onap.universalvesadapter.exception;

/**
 * 
 * Exception thrown when config file data is unable to be parsed correctly in Smooks configuration
 * 
 * @author kmalbari
 *
 */
public class ConfigFileSmooksConversionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7128340575013771888L;	
	
	public ConfigFileSmooksConversionException(String string) {
		super(string);
	}

}
