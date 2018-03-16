
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
    "criticality",
    "name",
    "thresholdCrossed",
    "value"
})
public class AdditionalParameter {

    @JsonProperty("criticality")
    private String criticality;
    @JsonProperty("name")
    private String name;
    @JsonProperty("thresholdCrossed")
    private String thresholdCrossed;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criticality")
    public String getCriticality() {
        return criticality;
    }

    @JsonProperty("criticality")
    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("thresholdCrossed")
    public String getThresholdCrossed() {
        return thresholdCrossed;
    }

    @JsonProperty("thresholdCrossed")
    public void setThresholdCrossed(String thresholdCrossed) {
        this.thresholdCrossed = thresholdCrossed;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
        return new ToStringBuilder(this).append("criticality", criticality).append("name", name).append("thresholdCrossed", thresholdCrossed).append("value", value).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(criticality).append(additionalProperties).append(name).append(value).append(thresholdCrossed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalParameter) == false) {
            return false;
        }
        AdditionalParameter rhs = ((AdditionalParameter) other);
        return new EqualsBuilder().append(criticality, rhs.criticality).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(value, rhs.value).append(thresholdCrossed, rhs.thresholdCrossed).isEquals();
    }

}
