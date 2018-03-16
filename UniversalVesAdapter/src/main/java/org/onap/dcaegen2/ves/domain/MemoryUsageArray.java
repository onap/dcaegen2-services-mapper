
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memoryFree",
    "memoryUsed",
    "vmIdentifier",
    "memoryBuffered",
    "memoryCached",
    "memoryConfigured",
    "memorySlabRecl",
    "memorySlabUnrecl"
})
public class MemoryUsageArray {

    @JsonProperty("memoryFree")
    private Double memoryFree;
    @JsonProperty("memoryUsed")
    private Double memoryUsed;
    @JsonProperty("vmIdentifier")
    private String vmIdentifier;
    @JsonProperty("memoryBuffered")
    private Double memoryBuffered;
    @JsonProperty("memoryCached")
    private Double memoryCached;
    @JsonProperty("memoryConfigured")
    private Double memoryConfigured;
    @JsonProperty("memorySlabRecl")
    private Double memorySlabRecl;
    @JsonProperty("memorySlabUnrecl")
    private Double memorySlabUnrecl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("memoryFree")
    public Double getMemoryFree() {
        return memoryFree;
    }

    @JsonProperty("memoryFree")
    public void setMemoryFree(Double memoryFree) {
        this.memoryFree = memoryFree;
    }

    @JsonProperty("memoryUsed")
    public Double getMemoryUsed() {
        return memoryUsed;
    }

    @JsonProperty("memoryUsed")
    public void setMemoryUsed(Double memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    @JsonProperty("vmIdentifier")
    public String getVmIdentifier() {
        return vmIdentifier;
    }

    @JsonProperty("vmIdentifier")
    public void setVmIdentifier(String vmIdentifier) {
        this.vmIdentifier = vmIdentifier;
    }

    @JsonProperty("memoryBuffered")
    public Double getMemoryBuffered() {
        return memoryBuffered;
    }

    @JsonProperty("memoryBuffered")
    public void setMemoryBuffered(Double memoryBuffered) {
        this.memoryBuffered = memoryBuffered;
    }

    @JsonProperty("memoryCached")
    public Double getMemoryCached() {
        return memoryCached;
    }

    @JsonProperty("memoryCached")
    public void setMemoryCached(Double memoryCached) {
        this.memoryCached = memoryCached;
    }

    @JsonProperty("memoryConfigured")
    public Double getMemoryConfigured() {
        return memoryConfigured;
    }

    @JsonProperty("memoryConfigured")
    public void setMemoryConfigured(Double memoryConfigured) {
        this.memoryConfigured = memoryConfigured;
    }

    @JsonProperty("memorySlabRecl")
    public Double getMemorySlabRecl() {
        return memorySlabRecl;
    }

    @JsonProperty("memorySlabRecl")
    public void setMemorySlabRecl(Double memorySlabRecl) {
        this.memorySlabRecl = memorySlabRecl;
    }

    @JsonProperty("memorySlabUnrecl")
    public Double getMemorySlabUnrecl() {
        return memorySlabUnrecl;
    }

    @JsonProperty("memorySlabUnrecl")
    public void setMemorySlabUnrecl(Double memorySlabUnrecl) {
        this.memorySlabUnrecl = memorySlabUnrecl;
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
    public String toString() {
        return new ToStringBuilder(this).append("memoryFree", memoryFree).append("memoryUsed", memoryUsed).append("vmIdentifier", vmIdentifier).append("memoryBuffered", memoryBuffered).append("memoryCached", memoryCached).append("memoryConfigured", memoryConfigured).append("memorySlabRecl", memorySlabRecl).append("memorySlabUnrecl", memorySlabUnrecl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(memorySlabUnrecl).append(memoryFree).append(memoryConfigured).append(additionalProperties).append(memorySlabRecl).append(memoryBuffered).append(vmIdentifier).append(memoryUsed).append(memoryCached).toHashCode();
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
        return new EqualsBuilder().append(memorySlabUnrecl, rhs.memorySlabUnrecl).append(memoryFree, rhs.memoryFree).append(memoryConfigured, rhs.memoryConfigured).append(additionalProperties, rhs.additionalProperties).append(memorySlabRecl, rhs.memorySlabRecl).append(memoryBuffered, rhs.memoryBuffered).append(vmIdentifier, rhs.vmIdentifier).append(memoryUsed, rhs.memoryUsed).append(memoryCached, rhs.memoryCached).isEquals();
    }

}
