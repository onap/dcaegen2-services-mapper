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
    "heartbeatFieldsVersion",
    "heartbeatInterval",
    "additionalFields"
})
public class HeartbeatFields {

    @JsonProperty("heartbeatFieldsVersion")
    private Double heartbeatFieldsVersion;
    @JsonProperty("heartbeatInterval")
    private Long heartbeatInterval;
    @JsonProperty("additionalFields")
    private List<AdditionalField> additionalFields = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("heartbeatFieldsVersion")
    public Double getHeartbeatFieldsVersion() {
        return heartbeatFieldsVersion;
    }

    @JsonProperty("heartbeatFieldsVersion")
    public void setHeartbeatFieldsVersion(Double heartbeatFieldsVersion) {
        this.heartbeatFieldsVersion = heartbeatFieldsVersion;
    }

    @JsonProperty("heartbeatInterval")
    public Long getHeartbeatInterval() {
        return heartbeatInterval;
    }

    @JsonProperty("heartbeatInterval")
    public void setHeartbeatInterval(Long heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
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
        return new ToStringBuilder(this).append("heartbeatFieldsVersion", heartbeatFieldsVersion).append("heartbeatInterval", heartbeatInterval).append("additionalFields", additionalFields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(heartbeatInterval).append(additionalProperties).append(heartbeatFieldsVersion).append(additionalFields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartbeatFields) == false) {
            return false;
        }
        HeartbeatFields rhs = ((HeartbeatFields) other);
        return new EqualsBuilder().append(heartbeatInterval, rhs.heartbeatInterval).append(additionalProperties, rhs.additionalProperties).append(heartbeatFieldsVersion, rhs.heartbeatFieldsVersion).append(additionalFields, rhs.additionalFields).isEquals();
    }

}
