/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.dcaegen2.ves.domain.ves54;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * memory usage of an identified virtual machine
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"memoryBuffered", "memoryCached", "memoryConfigured", "memoryFree",
        "memorySlabRecl", "memorySlabUnrecl", "memoryUsed", "vmIdentifier"})
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
     * kibibytes of memory configured in the virtual machine on which the VNFC reporting the event
     * is running
     * 
     */
    @JsonProperty("memoryConfigured")
    @JsonPropertyDescription("kibibytes of memory configured in the virtual machine on which the VNFC reporting the event is running")
    private Double memoryConfigured;
    /**
     * kibibytes of physical RAM left unused by the system (Required)
     * 
     */
    @JsonProperty("memoryFree")
    @JsonPropertyDescription("kibibytes of physical RAM left unused by the system")
    private Double memoryFree;
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
     * total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes
     * (Required)
     * 
     */
    @JsonProperty("memoryUsed")
    @JsonPropertyDescription("total memory minus the sum of free, buffered, cached and slab memory measured in kibibytes")
    private Double memoryUsed;
    /**
     * virtual machine identifier associated with the memory metrics (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    @JsonPropertyDescription("virtual machine identifier associated with the memory metrics")
    private String vmIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
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
     * kibibytes of memory configured in the virtual machine on which the VNFC reporting the event
     * is running
     * 
     */
    @JsonProperty("memoryConfigured")
    public Double getMemoryConfigured() {
        return memoryConfigured;
    }
    
    /**
     * kibibytes of memory configured in the virtual machine on which the VNFC reporting the event
     * is running
     * 
     */
    @JsonProperty("memoryConfigured")
    public void setMemoryConfigured(Double memoryConfigured) {
        this.memoryConfigured = memoryConfigured;
    }
    
    /**
     * kibibytes of physical RAM left unused by the system (Required)
     * 
     */
    @JsonProperty("memoryFree")
    public Double getMemoryFree() {
        return memoryFree;
    }
    
    /**
     * kibibytes of physical RAM left unused by the system (Required)
     * 
     */
    @JsonProperty("memoryFree")
    public void setMemoryFree(Double memoryFree) {
        this.memoryFree = memoryFree;
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
     * virtual machine identifier associated with the memory metrics (Required)
     * 
     */
    @JsonProperty("vmIdentifier")
    public String getVmIdentifier() {
        return vmIdentifier;
    }
    
    /**
     * virtual machine identifier associated with the memory metrics (Required)
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
    
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(memoryBuffered).append(memoryCached)
                .append(memoryConfigured).append(memoryFree).append(memorySlabRecl)
                .append(memorySlabUnrecl).append(memoryUsed).append(vmIdentifier)
                .append(additionalProperties).toHashCode();
    }
    
    
    
}
