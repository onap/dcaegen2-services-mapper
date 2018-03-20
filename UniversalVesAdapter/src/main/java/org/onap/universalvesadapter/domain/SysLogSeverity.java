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
package org.onap.universalvesadapter.domain;

public enum SysLogSeverity {

	SEVERITY_EMERGENCY("Emergency"),
	/** system is unusable */
	SEVERITY_ALERT("Alert"),
	/** action must be taken immediately */
	SEVERITY_CRITICAL("Critical"),
	/** critical conditions */
	SEVERITY_ERROR("Error"),
	/** error conditions */
	SEVERITY_WARNING("Warning"),
	/** warning conditions */
	SEVERITY_NOTICE("Notice"),
	/** normal but significant condition */
	SEVERITY_INFO("Info"),
	/** Informational: informational messages */
	SEVERITY_DEBUG("Debug");
	/** debug-level messages */
	
	private final String value;

	private SysLogSeverity(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
