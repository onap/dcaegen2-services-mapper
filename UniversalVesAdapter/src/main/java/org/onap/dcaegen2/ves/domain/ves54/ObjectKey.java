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

import java.util.HashMap;
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
 * tuple which provides the name of a key along with its value and relative order
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"keyName", "keyOrder", "keyValue"})
public class ObjectKey {
    
    /**
     * name of the key (Required)
     * 
     */
    @JsonProperty("keyName")
    @JsonPropertyDescription("name of the key")
    private String keyName;
    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    @JsonPropertyDescription("relative sequence or order of the key with respect to other keys")
    private Integer keyOrder;
    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    @JsonPropertyDescription("value of the key")
    private String keyValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * name of the key (Required)
     * 
     */
    @JsonProperty("keyName")
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * name of the key (Required)
     * 
     */
    @JsonProperty("keyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    public Integer getKeyOrder() {
        return keyOrder;
    }
    
    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    public void setKeyOrder(Integer keyOrder) {
        this.keyOrder = keyOrder;
    }
    
    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    public String getKeyValue() {
        return keyValue;
    }
    
    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
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
        return new HashCodeBuilder().append(keyName).append(keyOrder).append(keyValue)
                .append(additionalProperties).toHashCode();
    }
    
    
    
}
