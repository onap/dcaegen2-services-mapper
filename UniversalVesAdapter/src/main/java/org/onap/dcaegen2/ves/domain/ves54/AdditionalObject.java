
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * json object schema, name and other meta-information along with one or more object instances
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"objectInstances", "objectName", "objectSchema", "objectSchemaUrl",
        "nfSubscribedObjectName", "nfSubscriptionId"})
public class AdditionalObject {
    
    /**
     * one or more instances of the jsonObject (Required)
     * 
     */
    @JsonProperty("objectInstances")
    @JsonPropertyDescription("one or more instances of the jsonObject")
    private List<ObjectInstance> objectInstances = new ArrayList<ObjectInstance>();
    /**
     * name of the JSON Object (Required)
     * 
     */
    @JsonProperty("objectName")
    @JsonPropertyDescription("name of the JSON Object")
    private String objectName;
    /**
     * json schema for the object
     * 
     */
    @JsonProperty("objectSchema")
    @JsonPropertyDescription("json schema for the object")
    private String objectSchema;
    /**
     * Url to the json schema for the object
     * 
     */
    @JsonProperty("objectSchemaUrl")
    @JsonPropertyDescription("Url to the json schema for the object")
    private String objectSchemaUrl;
    /**
     * name of the object associated with the nfSubscriptonId
     * 
     */
    @JsonProperty("nfSubscribedObjectName")
    @JsonPropertyDescription("name of the object associated with the nfSubscriptonId")
    private String nfSubscribedObjectName;
    /**
     * identifies an openConfig telemetry subscription on a network function, which configures the
     * network function to send complex object data associated with the jsonObject
     * 
     */
    @JsonProperty("nfSubscriptionId")
    @JsonPropertyDescription("identifies an openConfig telemetry subscription on a network function, which configures the network function to send complex object data associated with the jsonObject")
    private String nfSubscriptionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * one or more instances of the jsonObject (Required)
     * 
     */
    @JsonProperty("objectInstances")
    public List<ObjectInstance> getObjectInstances() {
        return objectInstances;
    }
    
    /**
     * one or more instances of the jsonObject (Required)
     * 
     */
    @JsonProperty("objectInstances")
    public void setObjectInstances(List<ObjectInstance> objectInstances) {
        this.objectInstances = objectInstances;
    }
    
    /**
     * name of the JSON Object (Required)
     * 
     */
    @JsonProperty("objectName")
    public String getObjectName() {
        return objectName;
    }
    
    /**
     * name of the JSON Object (Required)
     * 
     */
    @JsonProperty("objectName")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    
    /**
     * json schema for the object
     * 
     */
    @JsonProperty("objectSchema")
    public String getObjectSchema() {
        return objectSchema;
    }
    
    /**
     * json schema for the object
     * 
     */
    @JsonProperty("objectSchema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }
    
    /**
     * Url to the json schema for the object
     * 
     */
    @JsonProperty("objectSchemaUrl")
    public String getObjectSchemaUrl() {
        return objectSchemaUrl;
    }
    
    /**
     * Url to the json schema for the object
     * 
     */
    @JsonProperty("objectSchemaUrl")
    public void setObjectSchemaUrl(String objectSchemaUrl) {
        this.objectSchemaUrl = objectSchemaUrl;
    }
    
    /**
     * name of the object associated with the nfSubscriptonId
     * 
     */
    @JsonProperty("nfSubscribedObjectName")
    public String getNfSubscribedObjectName() {
        return nfSubscribedObjectName;
    }
    
    /**
     * name of the object associated with the nfSubscriptonId
     * 
     */
    @JsonProperty("nfSubscribedObjectName")
    public void setNfSubscribedObjectName(String nfSubscribedObjectName) {
        this.nfSubscribedObjectName = nfSubscribedObjectName;
    }
    
    /**
     * identifies an openConfig telemetry subscription on a network function, which configures the
     * network function to send complex object data associated with the jsonObject
     * 
     */
    @JsonProperty("nfSubscriptionId")
    public String getNfSubscriptionId() {
        return nfSubscriptionId;
    }
    
    /**
     * identifies an openConfig telemetry subscription on a network function, which configures the
     * network function to send complex object data associated with the jsonObject
     * 
     */
    @JsonProperty("nfSubscriptionId")
    public void setNfSubscriptionId(String nfSubscriptionId) {
        this.nfSubscriptionId = nfSubscriptionId;
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
        return new HashCodeBuilder().append(objectInstances).append(objectName).append(objectSchema)
                .append(objectSchemaUrl).append(nfSubscribedObjectName).append(nfSubscriptionId)
                .append(additionalProperties).toHashCode();
    }
    
    
}
