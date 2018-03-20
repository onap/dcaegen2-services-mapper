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
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commonEventHeader",
    "faultFields",
    "heartbeatFields"
})
public class Event {

    @JsonProperty("commonEventHeader")
    private CommonEventHeader commonEventHeader;
    @JsonProperty("faultFields")
    private FaultFields faultFields;
    @JsonProperty("heartbeatFields")
    private HeartbeatFields heartbeatFields;
  
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commonEventHeader")
    public CommonEventHeader getCommonEventHeader() {
        return commonEventHeader;
    }

    @JsonProperty("commonEventHeader")
    public void setCommonEventHeader(CommonEventHeader commonEventHeader) {
        this.commonEventHeader = commonEventHeader;
    }

    @JsonProperty("faultFields")
    public FaultFields getFaultFields() {
        return faultFields;
    }

    @JsonProperty("faultFields")
    public void setFaultFields(FaultFields faultFields) {
        this.faultFields = faultFields;
    }

    @JsonProperty("heartbeatFields")
    public HeartbeatFields getHeartbeatFields() {
        return heartbeatFields;
    }

    @JsonProperty("heartbeatFields")
    public void setHeartbeatFields(HeartbeatFields heartbeatFields) {
        this.heartbeatFields = heartbeatFields;
    }

  
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("commonEventHeader", commonEventHeader).append("faultFields", faultFields).append("heartbeatFields", heartbeatFields).toString();
    }

    @Override
    public int hashCode() {
    	 return new HashCodeBuilder().append(heartbeatFields).append(commonEventHeader).append(additionalProperties).append(faultFields).toHashCode();    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(heartbeatFields, rhs.heartbeatFields).append(commonEventHeader, rhs.commonEventHeader).append(additionalProperties, rhs.additionalProperties).append(faultFields, rhs.faultFields).isEquals();
    }

}
