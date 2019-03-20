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
 * metrics on system hugepages
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bytesFree",
    "bytesUsed",
    "hugePagesIdentifier",
    "percentFree",
    "percentUsed",
    "vmPageNumberFree",
    "vmPageNumberUsed"
})
public class HugePagesArray {

    /**
     * number of free hugepages in bytes
     * 
     */
    @JsonProperty("bytesFree")
    @JsonPropertyDescription("number of free hugepages in bytes")
    private Double bytesFree;
    /**
     * number of used hugepages in bytes
     * 
     */
    @JsonProperty("bytesUsed")
    @JsonPropertyDescription("number of used hugepages in bytes")
    private Double bytesUsed;
    /**
     * hugePages identifier
     * (Required)
     * 
     */
    @JsonProperty("hugePagesIdentifier")
    @JsonPropertyDescription("hugePages identifier")
    private Double hugePagesIdentifier;
    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentFree")
    @JsonPropertyDescription("number of free hugepages in percent")
    private Double percentFree;
    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentUsed")
    @JsonPropertyDescription("number of free hugepages in percent")
    private Double percentUsed;
    /**
     * number of free vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberFree")
    @JsonPropertyDescription("number of free vmPages in numbers")
    private Double vmPageNumberFree;
    /**
     * number of used vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberUsed")
    @JsonPropertyDescription("number of used vmPages in numbers")
    private Double vmPageNumberUsed;

    /**
     * number of free hugepages in bytes
     * 
     */
    @JsonProperty("bytesFree")
    public Double getBytesFree() {
        return bytesFree;
    }

    /**
     * number of free hugepages in bytes
     * 
     */
    @JsonProperty("bytesFree")
    public void setBytesFree(Double bytesFree) {
        this.bytesFree = bytesFree;
    }

    /**
     * number of used hugepages in bytes
     * 
     */
    @JsonProperty("bytesUsed")
    public Double getBytesUsed() {
        return bytesUsed;
    }

    /**
     * number of used hugepages in bytes
     * 
     */
    @JsonProperty("bytesUsed")
    public void setBytesUsed(Double bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

    /**
     * hugePages identifier
     * (Required)
     * 
     */
    @JsonProperty("hugePagesIdentifier")
    public Double getHugePagesIdentifier() {
        return hugePagesIdentifier;
    }

    /**
     * hugePages identifier
     * (Required)
     * 
     */
    @JsonProperty("hugePagesIdentifier")
    public void setHugePagesIdentifier(Double hugePagesIdentifier) {
        this.hugePagesIdentifier = hugePagesIdentifier;
    }

    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentFree")
    public Double getPercentFree() {
        return percentFree;
    }

    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentFree")
    public void setPercentFree(Double percentFree) {
        this.percentFree = percentFree;
    }

    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentUsed")
    public Double getPercentUsed() {
        return percentUsed;
    }

    /**
     * number of free hugepages in percent
     * 
     */
    @JsonProperty("percentUsed")
    public void setPercentUsed(Double percentUsed) {
        this.percentUsed = percentUsed;
    }

    /**
     * number of free vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberFree")
    public Double getVmPageNumberFree() {
        return vmPageNumberFree;
    }

    /**
     * number of free vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberFree")
    public void setVmPageNumberFree(Double vmPageNumberFree) {
        this.vmPageNumberFree = vmPageNumberFree;
    }

    /**
     * number of used vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberUsed")
    public Double getVmPageNumberUsed() {
        return vmPageNumberUsed;
    }

    /**
     * number of used vmPages in numbers
     * 
     */
    @JsonProperty("vmPageNumberUsed")
    public void setVmPageNumberUsed(Double vmPageNumberUsed) {
        this.vmPageNumberUsed = vmPageNumberUsed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bytesFree).append(bytesUsed).append(hugePagesIdentifier).append(percentFree).append(percentUsed).append(vmPageNumberFree).append(vmPageNumberUsed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HugePagesArray) == false) {
            return false;
        }
        HugePagesArray rhs = ((HugePagesArray) other);
        return new EqualsBuilder().append(bytesFree, rhs.bytesFree).append(bytesUsed, rhs.bytesUsed).append(hugePagesIdentifier, rhs.hugePagesIdentifier).append(percentFree, rhs.percentFree).append(percentUsed, rhs.percentUsed).append(vmPageNumberFree, rhs.vmPageNumberFree).append(vmPageNumberUsed, rhs.vmPageNumberUsed).isEquals();
    }

}
