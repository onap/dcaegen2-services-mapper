
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
    "featureIdentifier",
    "featureUtilization"
})
public class FeatureUsageArray {

    @JsonProperty("featureIdentifier")
    private String featureIdentifier;
    @JsonProperty("featureUtilization")
    private Long featureUtilization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("featureIdentifier")
    public String getFeatureIdentifier() {
        return featureIdentifier;
    }

    @JsonProperty("featureIdentifier")
    public void setFeatureIdentifier(String featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
    }

    @JsonProperty("featureUtilization")
    public Long getFeatureUtilization() {
        return featureUtilization;
    }

    @JsonProperty("featureUtilization")
    public void setFeatureUtilization(Long featureUtilization) {
        this.featureUtilization = featureUtilization;
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
        return new ToStringBuilder(this).append("featureIdentifier", featureIdentifier).append("featureUtilization", featureUtilization).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(featureIdentifier).append(additionalProperties).append(featureUtilization).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureUsageArray) == false) {
            return false;
        }
        FeatureUsageArray rhs = ((FeatureUsageArray) other);
        return new EqualsBuilder().append(featureIdentifier, rhs.featureIdentifier).append(additionalProperties, rhs.additionalProperties).append(featureUtilization, rhs.featureUtilization).isEquals();
    }

}
