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
import org.onap.dcaegen2.ves.domain.AdditionalField;

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
    private List<AdditionalField> additionalFields = null;
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
    public List<AdditionalField> getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AdditionalField> additionalFields) {
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
