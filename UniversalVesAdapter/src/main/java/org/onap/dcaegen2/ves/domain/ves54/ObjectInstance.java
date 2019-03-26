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
 * meta-information about an instance of a jsonObject along with the actual object instance
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"objectInstance", "objectInstanceEpochMicrosec", "objectKeys"})
public class ObjectInstance {
    
    /**
     * an instance conforming to the jsonObject schema (Required)
     * 
     */
    @JsonProperty("objectInstance")
    @JsonPropertyDescription("an instance conforming to the jsonObject schema")
    private ObjectInstance objectInstance;
    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed
     * since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    @JsonPropertyDescription("the unix time aka epoch time associated with this objectInstance--as microseconds elapsed since 1 Jan 1970 not including leap seconds")
    private Double objectInstanceEpochMicrosec;
    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    @JsonPropertyDescription("an ordered set of keys that identifies this particular instance of jsonObject")
    private List<ObjectKey> objectKeys = new ArrayList<ObjectKey>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * an instance conforming to the jsonObject schema (Required)
     * 
     */
    @JsonProperty("objectInstance")
    public ObjectInstance getObjectInstance() {
        return objectInstance;
    }
    
    /**
     * an instance conforming to the jsonObject schema (Required)
     * 
     */
    @JsonProperty("objectInstance")
    public void setObjectInstance(ObjectInstance objectInstance) {
        this.objectInstance = objectInstance;
    }
    
    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed
     * since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    public Double getObjectInstanceEpochMicrosec() {
        return objectInstanceEpochMicrosec;
    }
    
    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed
     * since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    public void setObjectInstanceEpochMicrosec(Double objectInstanceEpochMicrosec) {
        this.objectInstanceEpochMicrosec = objectInstanceEpochMicrosec;
    }
    
    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    public List<ObjectKey> getObjectKeys() {
        return objectKeys;
    }
    
    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    public void setObjectKeys(List<ObjectKey> objectKeys) {
        this.objectKeys = objectKeys;
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
        return new HashCodeBuilder().append(objectInstance).append(objectInstanceEpochMicrosec)
                .append(objectKeys).append(additionalProperties).toHashCode();
    }
    
    
    
}
