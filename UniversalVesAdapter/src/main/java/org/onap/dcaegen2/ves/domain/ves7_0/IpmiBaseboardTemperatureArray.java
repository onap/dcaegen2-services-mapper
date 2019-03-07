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
package org.onap.dcaegen2.ves.domain.ves7_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * intelligent platform management interface (ipmi) baseboard temperature metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseboardTemperatureIdentifier",
    "baseboardTemperature"
})
public class IpmiBaseboardTemperatureArray {

    /**
     * identifier for the location where the temperature is taken
     * (Required)
     * 
     */
    @JsonProperty("baseboardTemperatureIdentifier")
    @JsonPropertyDescription("identifier for the location where the temperature is taken")
    private String baseboardTemperatureIdentifier;
    /**
     * baseboard temperature in celsius
     * 
     */
    @JsonProperty("baseboardTemperature")
    @JsonPropertyDescription("baseboard temperature in celsius")
    private Double baseboardTemperature;

    /**
     * identifier for the location where the temperature is taken
     * (Required)
     * 
     */
    @JsonProperty("baseboardTemperatureIdentifier")
    public String getBaseboardTemperatureIdentifier() {
        return baseboardTemperatureIdentifier;
    }

    /**
     * identifier for the location where the temperature is taken
     * (Required)
     * 
     */
    @JsonProperty("baseboardTemperatureIdentifier")
    public void setBaseboardTemperatureIdentifier(String baseboardTemperatureIdentifier) {
        this.baseboardTemperatureIdentifier = baseboardTemperatureIdentifier;
    }

    /**
     * baseboard temperature in celsius
     * 
     */
    @JsonProperty("baseboardTemperature")
    public Double getBaseboardTemperature() {
        return baseboardTemperature;
    }

    /**
     * baseboard temperature in celsius
     * 
     */
    @JsonProperty("baseboardTemperature")
    public void setBaseboardTemperature(Double baseboardTemperature) {
        this.baseboardTemperature = baseboardTemperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(baseboardTemperatureIdentifier).append(baseboardTemperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiBaseboardTemperatureArray) == false) {
            return false;
        }
        IpmiBaseboardTemperatureArray rhs = ((IpmiBaseboardTemperatureArray) other);
        return new EqualsBuilder().append(baseboardTemperatureIdentifier, rhs.baseboardTemperatureIdentifier).append(baseboardTemperature, rhs.baseboardTemperature).isEquals();
    }

}
