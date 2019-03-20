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
 * intelligent platform management interface (ipmi) battery metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "batteryIdentifier",
    "batteryType",
    "batteryVoltageLevel"
})
public class IpmiBatteryArray {

    /**
     * identifier for the battery
     * (Required)
     * 
     */
    @JsonProperty("batteryIdentifier")
    @JsonPropertyDescription("identifier for the battery")
    private String batteryIdentifier;
    /**
     * type of battery
     * 
     */
    @JsonProperty("batteryType")
    @JsonPropertyDescription("type of battery")
    private String batteryType;
    /**
     * battery voltage level
     * 
     */
    @JsonProperty("batteryVoltageLevel")
    @JsonPropertyDescription("battery voltage level")
    private Double batteryVoltageLevel;

    /**
     * identifier for the battery
     * (Required)
     * 
     */
    @JsonProperty("batteryIdentifier")
    public String getBatteryIdentifier() {
        return batteryIdentifier;
    }

    /**
     * identifier for the battery
     * (Required)
     * 
     */
    @JsonProperty("batteryIdentifier")
    public void setBatteryIdentifier(String batteryIdentifier) {
        this.batteryIdentifier = batteryIdentifier;
    }

    /**
     * type of battery
     * 
     */
    @JsonProperty("batteryType")
    public String getBatteryType() {
        return batteryType;
    }

    /**
     * type of battery
     * 
     */
    @JsonProperty("batteryType")
    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    /**
     * battery voltage level
     * 
     */
    @JsonProperty("batteryVoltageLevel")
    public Double getBatteryVoltageLevel() {
        return batteryVoltageLevel;
    }

    /**
     * battery voltage level
     * 
     */
    @JsonProperty("batteryVoltageLevel")
    public void setBatteryVoltageLevel(Double batteryVoltageLevel) {
        this.batteryVoltageLevel = batteryVoltageLevel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(batteryIdentifier).append(batteryType).append(batteryVoltageLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiBatteryArray) == false) {
            return false;
        }
        IpmiBatteryArray rhs = ((IpmiBatteryArray) other);
        return new EqualsBuilder().append(batteryIdentifier, rhs.batteryIdentifier).append(batteryType, rhs.batteryType).append(batteryVoltageLevel, rhs.batteryVoltageLevel).isEquals();
    }

}
