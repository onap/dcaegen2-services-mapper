/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2019 TechMahindra
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
package org.onap.dcaegen2.ves.domain.ves70;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * a hashMap which is associated with and described by a name
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "hashMap"})
public class AdditionalMeasurement {
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * an associative array which is an array of key:value pairs (Required)
     * 
     */
    @JsonProperty("hashMap")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation hashMap;
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * an associative array which is an array of key:value pairs (Required)
     * 
     */
    @JsonProperty("hashMap")
    public AlarmAdditionalInformation getHashMap() {
        return hashMap;
    }
    
    /**
     * an associative array which is an array of key:value pairs (Required)
     * 
     */
    @JsonProperty("hashMap")
    public void setHashMap(AlarmAdditionalInformation hashMap) {
        this.hashMap = hashMap;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(hashMap).toHashCode();
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalMeasurement) == false) {
            return false;
        }
        AdditionalMeasurement rhs = ((AdditionalMeasurement) other);
        return new EqualsBuilder().append(name, rhs.name).append(hashMap, rhs.hashMap).isEquals();
    }
    
}
