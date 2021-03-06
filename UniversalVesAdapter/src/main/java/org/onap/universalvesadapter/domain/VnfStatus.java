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

public enum VnfStatus {
	
	  VFSTATUS_ACTIVE("Active"),
	  VFSTATUS_IDLE("Idle"),
	  VFSTATUS_PREP_TERMINATE("Preparing to terminate"),
	  VFSTATUS_READY_TERMINATE("Ready to terminate"),
	  VFSTATUS_REQ_TERMINATE("Requesting Termination");
	
	  private final String value;

	    private VnfStatus(final String value) {
	        this.value = value;
	    }

	    public String getValue() { return value; }
}
