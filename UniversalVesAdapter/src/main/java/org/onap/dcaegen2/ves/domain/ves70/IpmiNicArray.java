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
 * intelligent platform management interface (ipmi) network interface control card (nic) metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nicIdentifier",
    "nicTemperature"
})
public class IpmiNicArray {

    /**
     * identifier for the network interface control card
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    @JsonPropertyDescription("identifier for the network interface control card")
    private String nicIdentifier;
    /**
     * nic temperature in celsius
     * 
     */
    @JsonProperty("nicTemperature")
    @JsonPropertyDescription("nic temperature in celsius")
    private Double nicTemperature;

    /**
     * identifier for the network interface control card
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    public String getNicIdentifier() {
        return nicIdentifier;
    }

    /**
     * identifier for the network interface control card
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    public void setNicIdentifier(String nicIdentifier) {
        this.nicIdentifier = nicIdentifier;
    }

    /**
     * nic temperature in celsius
     * 
     */
    @JsonProperty("nicTemperature")
    public Double getNicTemperature() {
        return nicTemperature;
    }

    /**
     * nic temperature in celsius
     * 
     */
    @JsonProperty("nicTemperature")
    public void setNicTemperature(Double nicTemperature) {
        this.nicTemperature = nicTemperature;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nicIdentifier).append(nicTemperature).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiNicArray) == false) {
            return false;
        }
        IpmiNicArray rhs = ((IpmiNicArray) other);
        return new EqualsBuilder().append(nicIdentifier, rhs.nicIdentifier).append(nicTemperature, rhs.nicTemperature).isEquals();
    }

}
