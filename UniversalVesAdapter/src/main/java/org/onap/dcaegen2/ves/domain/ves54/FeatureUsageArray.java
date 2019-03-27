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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * number of times an identified feature was used over the measurementInterval
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"featureIdentifier", "featureUtilization"})
public class FeatureUsageArray {
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureIdentifier")
    private String featureIdentifier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureUtilization")
    private Integer featureUtilization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureIdentifier")
    public String getFeatureIdentifier() {
        return featureIdentifier;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureIdentifier")
    public void setFeatureIdentifier(String featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureUtilization")
    public Integer getFeatureUtilization() {
        return featureUtilization;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("featureUtilization")
    public void setFeatureUtilization(Integer featureUtilization) {
        this.featureUtilization = featureUtilization;
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
        return new HashCodeBuilder().append(featureIdentifier).append(featureUtilization)
                .append(additionalProperties).toHashCode();
    }
    
    
    
}
