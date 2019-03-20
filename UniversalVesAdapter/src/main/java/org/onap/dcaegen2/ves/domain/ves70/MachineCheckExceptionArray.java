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
 * metrics on vm machine check exceptions
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "correctedMemoryErrors",
    "correctedMemoryErrorsIn1Hr",
    "uncorrectedMemoryErrors",
    "uncorrectedMemoryErrorsIn1Hr",
    "vmIdentifier"
})
public class MachineCheckExceptionArray {

    /**
     * total hardware errors that were corrected by the hardware (e.g. data corruption corrected via  ECC) over the measurementInterval
     * 
     */
    @JsonProperty("correctedMemoryErrors")
    @JsonPropertyDescription("total hardware errors that were corrected by the hardware (e.g. data corruption corrected via  ECC) over the measurementInterval")
    private Double correctedMemoryErrors;
    /**
     * total hardware errors that were corrected by the hardware over the last one hour
     * 
     */
    @JsonProperty("correctedMemoryErrorsIn1Hr")
    @JsonPropertyDescription("total hardware errors that were corrected by the hardware over the last one hour")
    private Double correctedMemoryErrorsIn1Hr;
    /**
     * total uncorrected hardware errors that were detected by the hardware (e.g., causing data corruption) over the measurementInterval
     * 
     */
    @JsonProperty("uncorrectedMemoryErrors")
    @JsonPropertyDescription("total uncorrected hardware errors that were detected by the hardware (e.g., causing data corruption) over the measurementInterval")
    private Double uncorrectedMemoryErrors;
    /**
     * total uncorrected hardware errors that were detected by the hardware over the last one hour
     * 
     */
    @JsonProperty("uncorrectedMemoryErrorsIn1Hr")
    @JsonPropertyDescription("total uncorrected hardware errors that were detected by the hardware over the last one hour")
    private Double uncorrectedMemoryErrorsIn1Hr;
    /**
     * virtual machine identifier associated with the machine check exception
     * (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    @JsonPropertyDescription("virtual machine identifier associated with the machine check exception")
    private String vmIdentifier;

    /**
     * total hardware errors that were corrected by the hardware (e.g. data corruption corrected via  ECC) over the measurementInterval
     * 
     */
    @JsonProperty("correctedMemoryErrors")
    public Double getCorrectedMemoryErrors() {
        return correctedMemoryErrors;
    }

    /**
     * total hardware errors that were corrected by the hardware (e.g. data corruption corrected via  ECC) over the measurementInterval
     * 
     */
    @JsonProperty("correctedMemoryErrors")
    public void setCorrectedMemoryErrors(Double correctedMemoryErrors) {
        this.correctedMemoryErrors = correctedMemoryErrors;
    }

    /**
     * total hardware errors that were corrected by the hardware over the last one hour
     * 
     */
    @JsonProperty("correctedMemoryErrorsIn1Hr")
    public Double getCorrectedMemoryErrorsIn1Hr() {
        return correctedMemoryErrorsIn1Hr;
    }

    /**
     * total hardware errors that were corrected by the hardware over the last one hour
     * 
     */
    @JsonProperty("correctedMemoryErrorsIn1Hr")
    public void setCorrectedMemoryErrorsIn1Hr(Double correctedMemoryErrorsIn1Hr) {
        this.correctedMemoryErrorsIn1Hr = correctedMemoryErrorsIn1Hr;
    }

    /**
     * total uncorrected hardware errors that were detected by the hardware (e.g., causing data corruption) over the measurementInterval
     * 
     */
    @JsonProperty("uncorrectedMemoryErrors")
    public Double getUncorrectedMemoryErrors() {
        return uncorrectedMemoryErrors;
    }

    /**
     * total uncorrected hardware errors that were detected by the hardware (e.g., causing data corruption) over the measurementInterval
     * 
     */
    @JsonProperty("uncorrectedMemoryErrors")
    public void setUncorrectedMemoryErrors(Double uncorrectedMemoryErrors) {
        this.uncorrectedMemoryErrors = uncorrectedMemoryErrors;
    }

    /**
     * total uncorrected hardware errors that were detected by the hardware over the last one hour
     * 
     */
    @JsonProperty("uncorrectedMemoryErrorsIn1Hr")
    public Double getUncorrectedMemoryErrorsIn1Hr() {
        return uncorrectedMemoryErrorsIn1Hr;
    }

    /**
     * total uncorrected hardware errors that were detected by the hardware over the last one hour
     * 
     */
    @JsonProperty("uncorrectedMemoryErrorsIn1Hr")
    public void setUncorrectedMemoryErrorsIn1Hr(Double uncorrectedMemoryErrorsIn1Hr) {
        this.uncorrectedMemoryErrorsIn1Hr = uncorrectedMemoryErrorsIn1Hr;
    }

    /**
     * virtual machine identifier associated with the machine check exception
     * (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    public String getVmIdentifier() {
        return vmIdentifier;
    }

    /**
     * virtual machine identifier associated with the machine check exception
     * (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    public void setVmIdentifier(String vmIdentifier) {
        this.vmIdentifier = vmIdentifier;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(correctedMemoryErrors).append(correctedMemoryErrorsIn1Hr).append(uncorrectedMemoryErrors).append(uncorrectedMemoryErrorsIn1Hr).append(vmIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MachineCheckExceptionArray) == false) {
            return false;
        }
        MachineCheckExceptionArray rhs = ((MachineCheckExceptionArray) other);
        return new EqualsBuilder().append(correctedMemoryErrors, rhs.correctedMemoryErrors).append(correctedMemoryErrorsIn1Hr, rhs.correctedMemoryErrorsIn1Hr).append(uncorrectedMemoryErrors, rhs.uncorrectedMemoryErrors).append(uncorrectedMemoryErrorsIn1Hr, rhs.uncorrectedMemoryErrorsIn1Hr).append(vmIdentifier, rhs.vmIdentifier).isEquals();
    }

}
