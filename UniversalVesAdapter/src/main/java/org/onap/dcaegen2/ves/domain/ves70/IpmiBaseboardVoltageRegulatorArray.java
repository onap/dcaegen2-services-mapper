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
 * intelligent platform management interface (ipmi) baseboard voltage regulator metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseboardVoltageRegulatorIdentifier",
    "voltageRegulatorTemperature"
})
public class IpmiBaseboardVoltageRegulatorArray {

    /**
     * identifier for the baseboard voltage regulator
     * (Required)
     * 
     */
    @JsonProperty("baseboardVoltageRegulatorIdentifier")
    @JsonPropertyDescription("identifier for the baseboard voltage regulator")
    private String baseboardVoltageRegulatorIdentifier;
    /**
     * voltage regulator temperature in celsius
     * 
     */
    @JsonProperty("voltageRegulatorTemperature")
    @JsonPropertyDescription("voltage regulator temperature in celsius")
    private Double voltageRegulatorTemperature;

    /**
     * identifier for the baseboard voltage regulator
     * (Required)
     * 
     */
    @JsonProperty("baseboardVoltageRegulatorIdentifier")
    public String getBaseboardVoltageRegulatorIdentifier() {
        return baseboardVoltageRegulatorIdentifier;
    }

    /**
     * identifier for the baseboard voltage regulator
     * (Required)
     * 
     */
    @JsonProperty("baseboardVoltageRegulatorIdentifier")
    public void setBaseboardVoltageRegulatorIdentifier(String baseboardVoltageRegulatorIdentifier) {
        this.baseboardVoltageRegulatorIdentifier = baseboardVoltageRegulatorIdentifier;
    }

    /**
     * voltage regulator temperature in celsius
     * 
     */
    @JsonProperty("voltageRegulatorTemperature")
    public Double getVoltageRegulatorTemperature() {
        return voltageRegulatorTemperature;
    }

    /**
     * voltage regulator temperature in celsius
     * 
     */
    @JsonProperty("voltageRegulatorTemperature")
    public void setVoltageRegulatorTemperature(Double voltageRegulatorTemperature) {
        this.voltageRegulatorTemperature = voltageRegulatorTemperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(baseboardVoltageRegulatorIdentifier).append(voltageRegulatorTemperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiBaseboardVoltageRegulatorArray) == false) {
            return false;
        }
        IpmiBaseboardVoltageRegulatorArray rhs = ((IpmiBaseboardVoltageRegulatorArray) other);
        return new EqualsBuilder().append(baseboardVoltageRegulatorIdentifier, rhs.baseboardVoltageRegulatorIdentifier).append(voltageRegulatorTemperature, rhs.voltageRegulatorTemperature).isEquals();
    }

}
