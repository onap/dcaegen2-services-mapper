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
package org.onap.universalvesadapter.exception;

/**
 * 
 * Exception thrown when config file data is unable to be parsed correctly in Smooks configuration
 * 
 * @author kmalbari
 *
 */
public class ConfigFileSmooksConversionException extends VesException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7128340575013771888L;	
	
	public ConfigFileSmooksConversionException(String string) {
		super(string);
	}
	
	public ConfigFileSmooksConversionException(String string, Exception exception) {
		super(string, exception);
	}

}
