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
 * Exception generated when dealing with communication to DMaap MR API
 * 
 * @author kmalbari
 *
 */
public class DMaapException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7045766597511192878L;

	public DMaapException(String string) {
		super(string);
	}

	
	
}
