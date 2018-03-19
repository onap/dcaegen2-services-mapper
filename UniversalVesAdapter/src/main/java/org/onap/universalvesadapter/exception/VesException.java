package org.onap.universalvesadapter.exception;

/**
 * 
 * Exception thrown when VES Event was not generated correctly 
 * 
 * @author kmalbari
 *
 */
public class VesException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = -8549819066568432382L;

	public VesException(String string) {
		super(string);
	}
}
