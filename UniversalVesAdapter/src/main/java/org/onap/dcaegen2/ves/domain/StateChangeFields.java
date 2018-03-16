
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.List;
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
    "newState",
    "oldState",
    "stateChangeFieldsVersion",
    "stateInterface",
    "additionalFields"
})
public class StateChangeFields {

    @JsonProperty("newState")
    private String newState;
    @JsonProperty("oldState")
    private String oldState;
    @JsonProperty("stateChangeFieldsVersion")
    private Double stateChangeFieldsVersion;
    @JsonProperty("stateInterface")
    private String stateInterface;
    @JsonProperty("additionalFields")
    private List<AdditionalField___> additionalFields = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("newState")
    public String getNewState() {
        return newState;
    }

    @JsonProperty("newState")
    public void setNewState(String newState) {
        this.newState = newState;
    }

    @JsonProperty("oldState")
    public String getOldState() {
        return oldState;
    }

    @JsonProperty("oldState")
    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    @JsonProperty("stateChangeFieldsVersion")
    public Double getStateChangeFieldsVersion() {
        return stateChangeFieldsVersion;
    }

    @JsonProperty("stateChangeFieldsVersion")
    public void setStateChangeFieldsVersion(Double stateChangeFieldsVersion) {
        this.stateChangeFieldsVersion = stateChangeFieldsVersion;
    }

    @JsonProperty("stateInterface")
    public String getStateInterface() {
        return stateInterface;
    }

    @JsonProperty("stateInterface")
    public void setStateInterface(String stateInterface) {
        this.stateInterface = stateInterface;
    }

    @JsonProperty("additionalFields")
    public List<AdditionalField___> getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AdditionalField___> additionalFields) {
        this.additionalFields = additionalFields;
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
        return new ToStringBuilder(this).append("newState", newState).append("oldState", oldState).append("stateChangeFieldsVersion", stateChangeFieldsVersion).append("stateInterface", stateInterface).append("additionalFields", additionalFields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(oldState).append(stateInterface).append(additionalProperties).append(additionalFields).append(stateChangeFieldsVersion).append(newState).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateChangeFields) == false) {
            return false;
        }
        StateChangeFields rhs = ((StateChangeFields) other);
        return new EqualsBuilder().append(oldState, rhs.oldState).append(stateInterface, rhs.stateInterface).append(additionalProperties, rhs.additionalProperties).append(additionalFields, rhs.additionalFields).append(stateChangeFieldsVersion, rhs.stateChangeFieldsVersion).append(newState, rhs.newState).isEquals();
    }

}
