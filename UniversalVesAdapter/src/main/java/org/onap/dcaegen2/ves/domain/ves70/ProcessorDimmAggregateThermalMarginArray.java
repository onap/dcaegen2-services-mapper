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
 * intelligent platform management interface (ipmi) processor dual inline memory module aggregate thermal margin metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "processorDimmAggregateThermalMarginIdentifier",
    "thermalMargin"
})
public class ProcessorDimmAggregateThermalMarginArray {

    /**
     * identifier for the aggregate thermal margin metrics from the processor dual inline memory module
     * (Required)
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginIdentifier")
    @JsonPropertyDescription("identifier for the aggregate thermal margin metrics from the processor dual inline memory module")
    private String processorDimmAggregateThermalMarginIdentifier;
    /**
     * the difference between the DIMM's current temperature, in celsius, and the DIMM's throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("thermalMargin")
    @JsonPropertyDescription("the difference between the DIMM's current temperature, in celsius, and the DIMM's throttling thermal trip point")
    private Double thermalMargin;

    /**
     * identifier for the aggregate thermal margin metrics from the processor dual inline memory module
     * (Required)
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginIdentifier")
    public String getProcessorDimmAggregateThermalMarginIdentifier() {
        return processorDimmAggregateThermalMarginIdentifier;
    }

    /**
     * identifier for the aggregate thermal margin metrics from the processor dual inline memory module
     * (Required)
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginIdentifier")
    public void setProcessorDimmAggregateThermalMarginIdentifier(String processorDimmAggregateThermalMarginIdentifier) {
        this.processorDimmAggregateThermalMarginIdentifier = processorDimmAggregateThermalMarginIdentifier;
    }

    /**
     * the difference between the DIMM's current temperature, in celsius, and the DIMM's throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("thermalMargin")
    public Double getThermalMargin() {
        return thermalMargin;
    }

    /**
     * the difference between the DIMM's current temperature, in celsius, and the DIMM's throttling thermal trip point
     * (Required)
     * 
     */
    @JsonProperty("thermalMargin")
    public void setThermalMargin(Double thermalMargin) {
        this.thermalMargin = thermalMargin;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(processorDimmAggregateThermalMarginIdentifier).append(thermalMargin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessorDimmAggregateThermalMarginArray) == false) {
            return false;
        }
        ProcessorDimmAggregateThermalMarginArray rhs = ((ProcessorDimmAggregateThermalMarginArray) other);
        return new EqualsBuilder().append(processorDimmAggregateThermalMarginIdentifier, rhs.processorDimmAggregateThermalMarginIdentifier).append(thermalMargin, rhs.thermalMargin).isEquals();
    }

}
