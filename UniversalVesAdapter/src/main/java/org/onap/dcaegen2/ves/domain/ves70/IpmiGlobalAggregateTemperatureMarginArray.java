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
 * intelligent platform management interface (ipmi) global aggregate temperature margin
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ipmiGlobalAggregateTemperatureMarginIdentifier",
    "globalAggregateTemperatureMargin"
})
public class IpmiGlobalAggregateTemperatureMarginArray {

    /**
     * identifier for the ipmi global aggregate temperature margin metrics
     * (Required)
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginIdentifier")
    @JsonPropertyDescription("identifier for the ipmi global aggregate temperature margin metrics")
    private String ipmiGlobalAggregateTemperatureMarginIdentifier;
    /**
     * the difference between the current global aggregate temperature, in celsius, and the global aggregate throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("globalAggregateTemperatureMargin")
    @JsonPropertyDescription("the difference between the current global aggregate temperature, in celsius, and the global aggregate throttling thermal trip point")
    private Double globalAggregateTemperatureMargin;

    /**
     * identifier for the ipmi global aggregate temperature margin metrics
     * (Required)
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginIdentifier")
    public String getIpmiGlobalAggregateTemperatureMarginIdentifier() {
        return ipmiGlobalAggregateTemperatureMarginIdentifier;
    }

    /**
     * identifier for the ipmi global aggregate temperature margin metrics
     * (Required)
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginIdentifier")
    public void setIpmiGlobalAggregateTemperatureMarginIdentifier(String ipmiGlobalAggregateTemperatureMarginIdentifier) {
        this.ipmiGlobalAggregateTemperatureMarginIdentifier = ipmiGlobalAggregateTemperatureMarginIdentifier;
    }

    /**
     * the difference between the current global aggregate temperature, in celsius, and the global aggregate throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("globalAggregateTemperatureMargin")
    public Double getGlobalAggregateTemperatureMargin() {
        return globalAggregateTemperatureMargin;
    }

    /**
     * the difference between the current global aggregate temperature, in celsius, and the global aggregate throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("globalAggregateTemperatureMargin")
    public void setGlobalAggregateTemperatureMargin(Double globalAggregateTemperatureMargin) {
        this.globalAggregateTemperatureMargin = globalAggregateTemperatureMargin;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipmiGlobalAggregateTemperatureMarginIdentifier).append(globalAggregateTemperatureMargin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiGlobalAggregateTemperatureMarginArray) == false) {
            return false;
        }
        IpmiGlobalAggregateTemperatureMarginArray rhs = ((IpmiGlobalAggregateTemperatureMarginArray) other);
        return new EqualsBuilder().append(ipmiGlobalAggregateTemperatureMarginIdentifier, rhs.ipmiGlobalAggregateTemperatureMarginIdentifier).append(globalAggregateTemperatureMargin, rhs.globalAggregateTemperatureMargin).isEquals();
    }

}
