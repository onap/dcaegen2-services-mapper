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
 * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"hashOfNameValuePairArrays", "jsonObjects", "nameValuePairs",
        "otherFieldsVersion"})
public class OtherFields {
    
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("hashOfNameValuePairArrays")
    @JsonPropertyDescription("array of named name-value-pair arrays")
    private List<AdditionalMeasurement> hashOfNameValuePairArrays =
            new ArrayList<AdditionalMeasurement>();
    /**
     * array of JSON objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    @JsonPropertyDescription("array of JSON objects described by name, schema and other meta-information")
    private List<AdditionalObject> jsonObjects = new ArrayList<AdditionalObject>();
    /**
     * array of name-value pairs
     * 
     */
    @JsonProperty("nameValuePairs")
    @JsonPropertyDescription("array of name-value pairs")
    private List<AlarmAdditionalInformation> nameValuePairs =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * version of the otherFields block (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    @JsonPropertyDescription("version of the otherFields block")
    private Double otherFieldsVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("hashOfNameValuePairArrays")
    public List<AdditionalMeasurement> getHashOfNameValuePairArrays() {
        return hashOfNameValuePairArrays;
    }
    
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("hashOfNameValuePairArrays")
    public void setHashOfNameValuePairArrays(
            List<AdditionalMeasurement> hashOfNameValuePairArrays) {
        this.hashOfNameValuePairArrays = hashOfNameValuePairArrays;
    }
    
    /**
     * array of JSON objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    public List<AdditionalObject> getJsonObjects() {
        return jsonObjects;
    }
    
    /**
     * array of JSON objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    public void setJsonObjects(List<AdditionalObject> jsonObjects) {
        this.jsonObjects = jsonObjects;
    }
    
    /**
     * array of name-value pairs
     * 
     */
    @JsonProperty("nameValuePairs")
    public List<AlarmAdditionalInformation> getNameValuePairs() {
        return nameValuePairs;
    }
    
    /**
     * array of name-value pairs
     * 
     */
    @JsonProperty("nameValuePairs")
    public void setNameValuePairs(List<AlarmAdditionalInformation> nameValuePairs) {
        this.nameValuePairs = nameValuePairs;
    }
    
    /**
     * version of the otherFields block (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    public Double getOtherFieldsVersion() {
        return otherFieldsVersion;
    }
    
    /**
     * version of the otherFields block (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    public void setOtherFieldsVersion(Double otherFieldsVersion) {
        this.otherFieldsVersion = otherFieldsVersion;
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
        return new HashCodeBuilder().append(hashOfNameValuePairArrays).append(jsonObjects)
                .append(nameValuePairs).append(otherFieldsVersion).append(additionalProperties)
                .toHashCode();
    }
    
    
    
}
