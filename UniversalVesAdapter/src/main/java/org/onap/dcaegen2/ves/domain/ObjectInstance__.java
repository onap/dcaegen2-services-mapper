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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "objectInstance",
    "objectInstanceEpochMicrosec",
    "objectKeys"
})
public class ObjectInstance__ {

    @JsonProperty("objectInstance")
    private ObjectInstance___ objectInstance;
    @JsonProperty("objectInstanceEpochMicrosec")
    private Double objectInstanceEpochMicrosec;
    @JsonProperty("objectKeys")
    private List<ObjectKey_> objectKeys = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("objectInstance")
    public ObjectInstance___ getObjectInstance() {
        return objectInstance;
    }

    @JsonProperty("objectInstance")
    public void setObjectInstance(ObjectInstance___ objectInstance) {
        this.objectInstance = objectInstance;
    }

    @JsonProperty("objectInstanceEpochMicrosec")
    public Double getObjectInstanceEpochMicrosec() {
        return objectInstanceEpochMicrosec;
    }

    @JsonProperty("objectInstanceEpochMicrosec")
    public void setObjectInstanceEpochMicrosec(Double objectInstanceEpochMicrosec) {
        this.objectInstanceEpochMicrosec = objectInstanceEpochMicrosec;
    }

    @JsonProperty("objectKeys")
    public List<ObjectKey_> getObjectKeys() {
        return objectKeys;
    }

    @JsonProperty("objectKeys")
    public void setObjectKeys(List<ObjectKey_> objectKeys) {
        this.objectKeys = objectKeys;
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
        return new ToStringBuilder(this).append("objectInstance", objectInstance).append("objectInstanceEpochMicrosec", objectInstanceEpochMicrosec).append("objectKeys", objectKeys).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(objectInstanceEpochMicrosec).append(additionalProperties).append(objectInstance).append(objectKeys).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectInstance__) == false) {
            return false;
        }
        ObjectInstance__ rhs = ((ObjectInstance__) other);
        return new EqualsBuilder().append(objectInstanceEpochMicrosec, rhs.objectInstanceEpochMicrosec).append(additionalProperties, rhs.additionalProperties).append(objectInstance, rhs.objectInstance).append(objectKeys, rhs.objectKeys).isEquals();
    }

}
