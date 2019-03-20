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
package org.onap.dcaegen2.ves.domain.ves70;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * intelligent platform management interface (ipmi) hot swap backplane power metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hsbpIdentifier",
    "hsbpTemperature"
})
public class IpmiHsbpArray {

    /**
     * identifier for the hot swap backplane power unit
     * (Required)
     * 
     */
    @JsonProperty("hsbpIdentifier")
    @JsonPropertyDescription("identifier for the hot swap backplane power unit")
    private String hsbpIdentifier;
    /**
     * hot swap backplane power temperature in celsius
     * 
     */
    @JsonProperty("hsbpTemperature")
    @JsonPropertyDescription("hot swap backplane power temperature in celsius")
    private Double hsbpTemperature;

    /**
     * identifier for the hot swap backplane power unit
     * (Required)
     * 
     */
    @JsonProperty("hsbpIdentifier")
    public String getHsbpIdentifier() {
        return hsbpIdentifier;
    }

    /**
     * identifier for the hot swap backplane power unit
     * (Required)
     * 
     */
    @JsonProperty("hsbpIdentifier")
    public void setHsbpIdentifier(String hsbpIdentifier) {
        this.hsbpIdentifier = hsbpIdentifier;
    }

    /**
     * hot swap backplane power temperature in celsius
     * 
     */
    @JsonProperty("hsbpTemperature")
    public Double getHsbpTemperature() {
        return hsbpTemperature;
    }

    /**
     * hot swap backplane power temperature in celsius
     * 
     */
    @JsonProperty("hsbpTemperature")
    public void setHsbpTemperature(Double hsbpTemperature) {
        this.hsbpTemperature = hsbpTemperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hsbpIdentifier).append(hsbpTemperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiHsbpArray) == false) {
            return false;
        }
        IpmiHsbpArray rhs = ((IpmiHsbpArray) other);
        return new EqualsBuilder().append(hsbpIdentifier, rhs.hsbpIdentifier).append(hsbpTemperature, rhs.hsbpTemperature).isEquals();
    }

}
