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
 * memory usage of an identified virtual machine
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memoryBuffered",
    "memoryCached",
    "memoryConfigured",
    "memoryDemand",
    "memoryFree",
    "memoryLatencyAvg",
    "memorySharedAvg",
    "memorySlabRecl",
    "memorySlabUnrecl",
    "memorySwapInAvg",
    "memorySwapInRateAvg",
    "memorySwapOutAvg",
    "memorySwapOutRateAvg",
    "memorySwapUsedAvg",
    "memoryUsed",
    "percentMemoryUsage",
    "vmIdentifier"
})
public class MemoryUsageArray {

    /**
     * kibibytes of temporary storage for raw disk blocks
     * 
     */
    @JsonProperty("memoryBuffered")
    @JsonPropertyDescription("kibibytes of temporary storage for raw disk blocks")
    private Double memoryBuffered;
    /**
     * kibibytes of memory used for cache
     * 
     */
    @JsonProperty("memoryCached")
    @JsonPropertyDescription("kibibytes of memory used for cache")
    private Double memoryCached;
    /**
     * kibibytes of memory configured in the virtual machine on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("memoryConfigured")
    @JsonPropertyDescription("kibibytes of memory configured in the virtual machine on which the xNFC reporting the event is running")
    private Double memoryConfigured;
    /**
     * host demand in kibibytes
     * 
     */
    @JsonProperty("memoryDemand")
    @JsonPropertyDescription("host demand in kibibytes")
    private Double memoryDemand;
    /**
     * kibibytes of physical RAM left unused by the system
     * (Required)
     * 
     */
    @JsonProperty("memoryFree")
    @JsonPropertyDescription("kibibytes of physical RAM left unused by the system")
    private Double memoryFree;
    /**
     * Percentage of time the VM is waiting to access swapped or compressed memory
     * 
     */
    @JsonProperty("memoryLatencyAvg")
    @JsonPropertyDescription("Percentage of time the VM is waiting to access swapped or compressed memory")
    private Double memoryLatencyAvg;
    /**
     * shared memory in kilobytes
     * 
     */
    @JsonProperty("memorySharedAvg")
    @JsonPropertyDescription("shared memory in kilobytes")
    private Double memorySharedAvg;
    /**
     * the part of the slab that can be reclaimed such as caches measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabRecl")
    @JsonPropertyDescription("the part of the slab that can be reclaimed such as caches measured in kibibytes")
    private Double memorySlabRecl;
    /**
     * the part of the slab that cannot be reclaimed even when lacking memory measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabUnrecl")
    @JsonPropertyDescription("the part of the slab that cannot be reclaimed even when lacking memory measured in kibibytes")
    private Double memorySlabUnrecl;
    /**
     * Amount of memory swapped-in from host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapInAvg")
    @JsonPropertyDescription("Amount of memory swapped-in from host cache in kibibytes")
    private Double memorySwapInAvg;
    /**
     * rate at which memory is swapped from disk into active memory during the interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapInRateAvg")
    @JsonPropertyDescription("rate at which memory is swapped from disk into active memory during the interval in kilobytes per second")
    private Double memorySwapInRateAvg;
    /**
     * Amount of memory swapped-out to host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapOutAvg")
    @JsonPropertyDescription("Amount of memory swapped-out to host cache in kibibytes")
    private Double memorySwapOutAvg;
    /**
     * rate at which memory is being swapped from active memory to disk during the current interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapOutRateAvg")
    @JsonPropertyDescription("rate at which memory is being swapped from active memory to disk during the current interval in kilobytes per second")
    private Double memorySwapOutRateAvg;
    /**
     * space used for caching swapped pages in the host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapUsedAvg")
    @JsonPropertyDescription("space used for caching swapped pages in the host cache in kibibytes")
    private Double memorySwapUsedAvg;
    /**
     * total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes
     * (Required)
     * 
     */
    @JsonProperty("memoryUsed")
    @JsonPropertyDescription("total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes")
    private Double memoryUsed;
    /**
     * Percentage of memory usage; value = (memoryUsed / (memoryUsed + memoryFree) x 100 if denomintor is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("percentMemoryUsage")
    @JsonPropertyDescription("Percentage of memory usage; value = (memoryUsed / (memoryUsed + memoryFree) x 100 if denomintor is nonzero, or 0, if otherwise")
    private Double percentMemoryUsage;
    /**
     * virtual machine identifier associated with the memory metrics
     * (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    @JsonPropertyDescription("virtual machine identifier associated with the memory metrics")
    private String vmIdentifier;

    /**
     * kibibytes of temporary storage for raw disk blocks
     * 
     */
    @JsonProperty("memoryBuffered")
    public Double getMemoryBuffered() {
        return memoryBuffered;
    }

    /**
     * kibibytes of temporary storage for raw disk blocks
     * 
     */
    @JsonProperty("memoryBuffered")
    public void setMemoryBuffered(Double memoryBuffered) {
        this.memoryBuffered = memoryBuffered;
    }

    /**
     * kibibytes of memory used for cache
     * 
     */
    @JsonProperty("memoryCached")
    public Double getMemoryCached() {
        return memoryCached;
    }

    /**
     * kibibytes of memory used for cache
     * 
     */
    @JsonProperty("memoryCached")
    public void setMemoryCached(Double memoryCached) {
        this.memoryCached = memoryCached;
    }

    /**
     * kibibytes of memory configured in the virtual machine on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("memoryConfigured")
    public Double getMemoryConfigured() {
        return memoryConfigured;
    }

    /**
     * kibibytes of memory configured in the virtual machine on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("memoryConfigured")
    public void setMemoryConfigured(Double memoryConfigured) {
        this.memoryConfigured = memoryConfigured;
    }

    /**
     * host demand in kibibytes
     * 
     */
    @JsonProperty("memoryDemand")
    public Double getMemoryDemand() {
        return memoryDemand;
    }

    /**
     * host demand in kibibytes
     * 
     */
    @JsonProperty("memoryDemand")
    public void setMemoryDemand(Double memoryDemand) {
        this.memoryDemand = memoryDemand;
    }

    /**
     * kibibytes of physical RAM left unused by the system
     * (Required)
     * 
     */
    @JsonProperty("memoryFree")
    public Double getMemoryFree() {
        return memoryFree;
    }

    /**
     * kibibytes of physical RAM left unused by the system
     * (Required)
     * 
     */
    @JsonProperty("memoryFree")
    public void setMemoryFree(Double memoryFree) {
        this.memoryFree = memoryFree;
    }

    /**
     * Percentage of time the VM is waiting to access swapped or compressed memory
     * 
     */
    @JsonProperty("memoryLatencyAvg")
    public Double getMemoryLatencyAvg() {
        return memoryLatencyAvg;
    }

    /**
     * Percentage of time the VM is waiting to access swapped or compressed memory
     * 
     */
    @JsonProperty("memoryLatencyAvg")
    public void setMemoryLatencyAvg(Double memoryLatencyAvg) {
        this.memoryLatencyAvg = memoryLatencyAvg;
    }

    /**
     * shared memory in kilobytes
     * 
     */
    @JsonProperty("memorySharedAvg")
    public Double getMemorySharedAvg() {
        return memorySharedAvg;
    }

    /**
     * shared memory in kilobytes
     * 
     */
    @JsonProperty("memorySharedAvg")
    public void setMemorySharedAvg(Double memorySharedAvg) {
        this.memorySharedAvg = memorySharedAvg;
    }

    /**
     * the part of the slab that can be reclaimed such as caches measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabRecl")
    public Double getMemorySlabRecl() {
        return memorySlabRecl;
    }

    /**
     * the part of the slab that can be reclaimed such as caches measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabRecl")
    public void setMemorySlabRecl(Double memorySlabRecl) {
        this.memorySlabRecl = memorySlabRecl;
    }

    /**
     * the part of the slab that cannot be reclaimed even when lacking memory measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabUnrecl")
    public Double getMemorySlabUnrecl() {
        return memorySlabUnrecl;
    }

    /**
     * the part of the slab that cannot be reclaimed even when lacking memory measured in kibibytes
     * 
     */
    @JsonProperty("memorySlabUnrecl")
    public void setMemorySlabUnrecl(Double memorySlabUnrecl) {
        this.memorySlabUnrecl = memorySlabUnrecl;
    }

    /**
     * Amount of memory swapped-in from host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapInAvg")
    public Double getMemorySwapInAvg() {
        return memorySwapInAvg;
    }

    /**
     * Amount of memory swapped-in from host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapInAvg")
    public void setMemorySwapInAvg(Double memorySwapInAvg) {
        this.memorySwapInAvg = memorySwapInAvg;
    }

    /**
     * rate at which memory is swapped from disk into active memory during the interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapInRateAvg")
    public Double getMemorySwapInRateAvg() {
        return memorySwapInRateAvg;
    }

    /**
     * rate at which memory is swapped from disk into active memory during the interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapInRateAvg")
    public void setMemorySwapInRateAvg(Double memorySwapInRateAvg) {
        this.memorySwapInRateAvg = memorySwapInRateAvg;
    }

    /**
     * Amount of memory swapped-out to host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapOutAvg")
    public Double getMemorySwapOutAvg() {
        return memorySwapOutAvg;
    }

    /**
     * Amount of memory swapped-out to host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapOutAvg")
    public void setMemorySwapOutAvg(Double memorySwapOutAvg) {
        this.memorySwapOutAvg = memorySwapOutAvg;
    }

    /**
     * rate at which memory is being swapped from active memory to disk during the current interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapOutRateAvg")
    public Double getMemorySwapOutRateAvg() {
        return memorySwapOutRateAvg;
    }

    /**
     * rate at which memory is being swapped from active memory to disk during the current interval in kilobytes per second
     * 
     */
    @JsonProperty("memorySwapOutRateAvg")
    public void setMemorySwapOutRateAvg(Double memorySwapOutRateAvg) {
        this.memorySwapOutRateAvg = memorySwapOutRateAvg;
    }

    /**
     * space used for caching swapped pages in the host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapUsedAvg")
    public Double getMemorySwapUsedAvg() {
        return memorySwapUsedAvg;
    }

    /**
     * space used for caching swapped pages in the host cache in kibibytes
     * 
     */
    @JsonProperty("memorySwapUsedAvg")
    public void setMemorySwapUsedAvg(Double memorySwapUsedAvg) {
        this.memorySwapUsedAvg = memorySwapUsedAvg;
    }

    /**
     * total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes
     * (Required)
     * 
     */
    @JsonProperty("memoryUsed")
    public Double getMemoryUsed() {
        return memoryUsed;
    }

    /**
     * total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes
     * (Required)
     * 
     */
    @JsonProperty("memoryUsed")
    public void setMemoryUsed(Double memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    /**
     * Percentage of memory usage; value = (memoryUsed / (memoryUsed + memoryFree) x 100 if denomintor is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("percentMemoryUsage")
    public Double getPercentMemoryUsage() {
        return percentMemoryUsage;
    }

    /**
     * Percentage of memory usage; value = (memoryUsed / (memoryUsed + memoryFree) x 100 if denomintor is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("percentMemoryUsage")
    public void setPercentMemoryUsage(Double percentMemoryUsage) {
        this.percentMemoryUsage = percentMemoryUsage;
    }

    /**
     * virtual machine identifier associated with the memory metrics
     * (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    public String getVmIdentifier() {
        return vmIdentifier;
    }

    /**
     * virtual machine identifier associated with the memory metrics
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
        return new HashCodeBuilder().append(memoryBuffered).append(memoryCached).append(memoryConfigured).append(memoryDemand).append(memoryFree).append(memoryLatencyAvg).append(memorySharedAvg).append(memorySlabRecl).append(memorySlabUnrecl).append(memorySwapInAvg).append(memorySwapInRateAvg).append(memorySwapOutAvg).append(memorySwapOutRateAvg).append(memorySwapUsedAvg).append(memoryUsed).append(percentMemoryUsage).append(vmIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemoryUsageArray) == false) {
            return false;
        }
        MemoryUsageArray rhs = ((MemoryUsageArray) other);
        return new EqualsBuilder().append(memoryBuffered, rhs.memoryBuffered).append(memoryCached, rhs.memoryCached).append(memoryConfigured, rhs.memoryConfigured).append(memoryDemand, rhs.memoryDemand).append(memoryFree, rhs.memoryFree).append(memoryLatencyAvg, rhs.memoryLatencyAvg).append(memorySharedAvg, rhs.memorySharedAvg).append(memorySlabRecl, rhs.memorySlabRecl).append(memorySlabUnrecl, rhs.memorySlabUnrecl).append(memorySwapInAvg, rhs.memorySwapInAvg).append(memorySwapInRateAvg, rhs.memorySwapInRateAvg).append(memorySwapOutAvg, rhs.memorySwapOutAvg).append(memorySwapOutRateAvg, rhs.memorySwapOutRateAvg).append(memorySwapUsedAvg, rhs.memorySwapUsedAvg).append(memoryUsed, rhs.memoryUsed).append(percentMemoryUsage, rhs.percentMemoryUsage).append(vmIdentifier, rhs.vmIdentifier).isEquals();
    }

}
