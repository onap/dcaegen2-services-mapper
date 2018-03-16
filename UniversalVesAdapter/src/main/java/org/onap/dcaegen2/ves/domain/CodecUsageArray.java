
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
    "codecIdentifier",
    "numberInUse"
})
public class CodecUsageArray {

    @JsonProperty("codecIdentifier")
    private String codecIdentifier;
    @JsonProperty("numberInUse")
    private Long numberInUse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("codecIdentifier")
    public String getCodecIdentifier() {
        return codecIdentifier;
    }

    @JsonProperty("codecIdentifier")
    public void setCodecIdentifier(String codecIdentifier) {
        this.codecIdentifier = codecIdentifier;
    }

    @JsonProperty("numberInUse")
    public Long getNumberInUse() {
        return numberInUse;
    }

    @JsonProperty("numberInUse")
    public void setNumberInUse(Long numberInUse) {
        this.numberInUse = numberInUse;
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
        return new ToStringBuilder(this).append("codecIdentifier", codecIdentifier).append("numberInUse", numberInUse).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numberInUse).append(additionalProperties).append(codecIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodecUsageArray) == false) {
            return false;
        }
        CodecUsageArray rhs = ((CodecUsageArray) other);
        return new EqualsBuilder().append(numberInUse, rhs.numberInUse).append(additionalProperties, rhs.additionalProperties).append(codecIdentifier, rhs.codecIdentifier).isEquals();
    }

}
