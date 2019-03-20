/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2019 TechMahindra
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
package org.onap.dcaegen2.ves.domain.ves70;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * intelligent platform management interface (ipmi) fan metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fanIdentifier",
    "fanSpeed"
})
public class IpmiFanArray {

    /**
     * identifier for the fan
     * (Required)
     * 
     */
    @JsonProperty("fanIdentifier")
    @JsonPropertyDescription("identifier for the fan")
    private String fanIdentifier;
    /**
     * fan speed in revolutions per minute (rpm)
     * 
     */
    @JsonProperty("fanSpeed")
    @JsonPropertyDescription("fan speed in revolutions per minute (rpm)")
    private Double fanSpeed;

    /**
     * identifier for the fan
     * (Required)
     * 
     */
    @JsonProperty("fanIdentifier")
    public String getFanIdentifier() {
        return fanIdentifier;
    }

    /**
     * identifier for the fan
     * (Required)
     * 
     */
    @JsonProperty("fanIdentifier")
    public void setFanIdentifier(String fanIdentifier) {
        this.fanIdentifier = fanIdentifier;
    }

    /**
     * fan speed in revolutions per minute (rpm)
     * 
     */
    @JsonProperty("fanSpeed")
    public Double getFanSpeed() {
        return fanSpeed;
    }

    /**
     * fan speed in revolutions per minute (rpm)
     * 
     */
    @JsonProperty("fanSpeed")
    public void setFanSpeed(Double fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fanIdentifier).append(fanSpeed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiFanArray) == false) {
            return false;
        }
        IpmiFanArray rhs = ((IpmiFanArray) other);
        return new EqualsBuilder().append(fanIdentifier, rhs.fanIdentifier).append(fanSpeed, rhs.fanSpeed).isEquals();
    }

}
