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

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * intelligent platform management interface processor metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "processorIdentifier",
    "processorThermalControlPercent",
    "processorDtsThermalMargin",
    "processorDimmAggregateThermalMarginArray"
})
public class IpmiProcessorArray {

    /**
     * identifier for an ipmi processor
     * (Required)
     * 
     */
    @JsonProperty("processorIdentifier")
    @JsonPropertyDescription("identifier for an ipmi processor")
    private String processorIdentifier;
    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("processorThermalControlPercent")
    @JsonPropertyDescription("io module temperature in celsius")
    private Double processorThermalControlPercent;
    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("processorDtsThermalMargin")
    @JsonPropertyDescription("front panel temperature in celsius")
    private Double processorDtsThermalMargin;
    /**
     * array of processorDimmAggregateThermalMargin objects
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginArray")
    @JsonPropertyDescription("array of processorDimmAggregateThermalMargin objects")
    private List<ProcessorDimmAggregateThermalMarginArray> processorDimmAggregateThermalMarginArray = new ArrayList<ProcessorDimmAggregateThermalMarginArray>();

    /**
     * identifier for an ipmi processor
     * (Required)
     * 
     */
    @JsonProperty("processorIdentifier")
    public String getProcessorIdentifier() {
        return processorIdentifier;
    }

    /**
     * identifier for an ipmi processor
     * (Required)
     * 
     */
    @JsonProperty("processorIdentifier")
    public void setProcessorIdentifier(String processorIdentifier) {
        this.processorIdentifier = processorIdentifier;
    }

    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("processorThermalControlPercent")
    public Double getProcessorThermalControlPercent() {
        return processorThermalControlPercent;
    }

    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("processorThermalControlPercent")
    public void setProcessorThermalControlPercent(Double processorThermalControlPercent) {
        this.processorThermalControlPercent = processorThermalControlPercent;
    }

    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("processorDtsThermalMargin")
    public Double getProcessorDtsThermalMargin() {
        return processorDtsThermalMargin;
    }

    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("processorDtsThermalMargin")
    public void setProcessorDtsThermalMargin(Double processorDtsThermalMargin) {
        this.processorDtsThermalMargin = processorDtsThermalMargin;
    }

    /**
     * array of processorDimmAggregateThermalMargin objects
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginArray")
    public List<ProcessorDimmAggregateThermalMarginArray> getProcessorDimmAggregateThermalMarginArray() {
        return processorDimmAggregateThermalMarginArray;
    }

    /**
     * array of processorDimmAggregateThermalMargin objects
     * 
     */
    @JsonProperty("processorDimmAggregateThermalMarginArray")
    public void setProcessorDimmAggregateThermalMarginArray(List<ProcessorDimmAggregateThermalMarginArray> processorDimmAggregateThermalMarginArray) {
        this.processorDimmAggregateThermalMarginArray = processorDimmAggregateThermalMarginArray;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(processorIdentifier).append(processorThermalControlPercent).append(processorDtsThermalMargin).append(processorDimmAggregateThermalMarginArray).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpmiProcessorArray) == false) {
            return false;
        }
        IpmiProcessorArray rhs = ((IpmiProcessorArray) other);
        return new EqualsBuilder().append(processorIdentifier, rhs.processorIdentifier).append(processorThermalControlPercent, rhs.processorThermalControlPercent).append(processorDtsThermalMargin, rhs.processorDtsThermalMargin).append(processorDimmAggregateThermalMarginArray, rhs.processorDimmAggregateThermalMarginArray).isEquals();
    }

}
