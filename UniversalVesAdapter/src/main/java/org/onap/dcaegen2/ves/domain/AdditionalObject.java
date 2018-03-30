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
    "objectInstances",
    "objectName",
    "objectSchema",
    "objectSchemaUrl",
    "nfSubscribedObjectName",
    "nfSubscriptionId"
})
public class AdditionalObject {

    @JsonProperty("objectInstances")
    private List<ObjectInstance> objectInstances = null;
    @JsonProperty("objectName")
    private String objectName;
    @JsonProperty("objectSchema")
    private String objectSchema;
    @JsonProperty("objectSchemaUrl")
    private String objectSchemaUrl;
    @JsonProperty("nfSubscribedObjectName")
    private String nfSubscribedObjectName;
    @JsonProperty("nfSubscriptionId")
    private String nfSubscriptionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("objectInstances")
    public List<ObjectInstance> getObjectInstances() {
        return objectInstances;
    }

    @JsonProperty("objectInstances")
    public void setObjectInstances(List<ObjectInstance> objectInstances) {
        this.objectInstances = objectInstances;
    }

    @JsonProperty("objectName")
    public String getObjectName() {
        return objectName;
    }

    @JsonProperty("objectName")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("objectSchema")
    public String getObjectSchema() {
        return objectSchema;
    }

    @JsonProperty("objectSchema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @JsonProperty("objectSchemaUrl")
    public String getObjectSchemaUrl() {
        return objectSchemaUrl;
    }

    @JsonProperty("objectSchemaUrl")
    public void setObjectSchemaUrl(String objectSchemaUrl) {
        this.objectSchemaUrl = objectSchemaUrl;
    }

    @JsonProperty("nfSubscribedObjectName")
    public String getNfSubscribedObjectName() {
        return nfSubscribedObjectName;
    }

    @JsonProperty("nfSubscribedObjectName")
    public void setNfSubscribedObjectName(String nfSubscribedObjectName) {
        this.nfSubscribedObjectName = nfSubscribedObjectName;
    }

    @JsonProperty("nfSubscriptionId")
    public String getNfSubscriptionId() {
        return nfSubscriptionId;
    }

    @JsonProperty("nfSubscriptionId")
    public void setNfSubscriptionId(String nfSubscriptionId) {
        this.nfSubscriptionId = nfSubscriptionId;
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
        return new ToStringBuilder(this).append("objectInstances", objectInstances).append("objectName", objectName).append("objectSchema", objectSchema).append("objectSchemaUrl", objectSchemaUrl).append("nfSubscribedObjectName", nfSubscribedObjectName).append("nfSubscriptionId", nfSubscriptionId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nfSubscribedObjectName).append(nfSubscriptionId).append(objectName).append(additionalProperties).append(objectInstances).append(objectSchemaUrl).append(objectSchema).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalObject) == false) {
            return false;
        }
        AdditionalObject rhs = ((AdditionalObject) other);
        return new EqualsBuilder().append(nfSubscribedObjectName, rhs.nfSubscribedObjectName).append(nfSubscriptionId, rhs.nfSubscriptionId).append(objectName, rhs.objectName).append(additionalProperties, rhs.additionalProperties).append(objectInstances, rhs.objectInstances).append(objectSchemaUrl, rhs.objectSchemaUrl).append(objectSchema, rhs.objectSchema).isEquals();
    }

}
