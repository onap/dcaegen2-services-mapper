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
 * intelligent platform management interface (ipmi) power supply metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "powerSupplyIdentifier",
    "powerSupplyInputPower",
    "powerSupplyCurrentOutputPercent",
    "powerSupplyTemperature"
})
public class IpmiPowerSupplyArray {

    /**
     * identifier for the power supply
     * (Required)
     * 
     */
    @JsonProperty("powerSupplyIdentifier")
    @JsonPropertyDescription("identifier for the power supply")
    private String powerSupplyIdentifier;
    /**
     * input power in watts
     * 
     */
    @JsonProperty("powerSupplyInputPower")
    @JsonPropertyDescription("input power in watts")
    private Double powerSupplyInputPower;
    /**
     * current output voltage as a percentage of the design specified level
     * 
     */
    @JsonProperty("powerSupplyCurrentOutputPercent")
    @JsonPropertyDescription("current output voltage as a percentage of the design specified level")
    private Double powerSupplyCurrentOutputPercent;
    /**
     * power supply temperature in celsius
     * 
     */
    @JsonProperty("powerSupplyTemperature")
    @JsonPropertyDescription("power supply temperature in celsius")
    private Double powerSupplyTemperature;

    /**
     * identifier for the power supply
     * (Required)
     * 
     */
    @JsonProperty("powerSupplyIdentifier")
    public String getPowerSupplyIdentifier() {
        return powerSupplyIdentifier;
    }

    /**
     * identifier for the power supply
     * (Required)
     * 
     */
    @JsonProperty("powerSupplyIdentifier")
    public void setPowerSupplyIdentifier(String powerSupplyIdentifier) {
        this.powerSupplyIdentifier = powerSupplyIdentifier;
    }

    /**
     * input power in watts
     * 
     */
    @JsonProperty("powerSupplyInputPower")
    public Double getPowerSupplyInputPower() {
        return powerSupplyInputPower;
    }

    /**
     * input power in watts
     * 
     */
    @JsonProperty("powerSupplyInputPower")
    public void setPowerSupplyInputPower(Double powerSupplyInputPower) {
        this.powerSupplyInputPower = powerSupplyInputPower;
    }

    /**
     * current output voltage as a percentage of the design specified level
     * 
     */
    @JsonProperty("powerSupplyCurrentOutputPercent")
    public Double getPowerSupplyCurrentOutputPercent() {
        return powerSupplyCurrentOutputPercent;
    }

    /**
     * current output voltage as a percentage of the design specified level
     * 
     */
    @JsonProperty("powerSupplyCurrentOutputPercent")
    public void setPowerSupplyCurrentOutputPercent(Double powerSupplyCurrentOutputPercent) {
        this.powerSupplyCurrentOutputPercent = powerSupplyCurrentOutputPercent;
    }

    /**
     * power supply temperature in celsius
     * 
     */
    @JsonProperty("powerSupplyTemperature")
    public Double getPowerSupplyTemperature() {
        return powerSupplyTemperature;
    }

    /**
     * power supply temperature in celsius
     * 
     */
    @JsonProperty("powerSupplyTemperature")
    public void setPowerSupplyTemperature(Double powerSupplyTemperature) {
        this.powerSupplyTemperature = powerSupplyTemperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(powerSupplyIdentifier).append(powerSupplyInputPower).append(powerSupplyCurrentOutputPercent).append(powerSupplyTemperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiPowerSupplyArray) == false) {
            return false;
        }
        IpmiPowerSupplyArray rhs = ((IpmiPowerSupplyArray) other);
        return new EqualsBuilder().append(powerSupplyIdentifier, rhs.powerSupplyIdentifier).append(powerSupplyInputPower, rhs.powerSupplyInputPower).append(powerSupplyCurrentOutputPercent, rhs.powerSupplyCurrentOutputPercent).append(powerSupplyTemperature, rhs.powerSupplyTemperature).isEquals();
    }

}
