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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * performance counter
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"criticality", "name", "thresholdCrossed", "value"})
public class AdditionalParameter {
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    private AdditionalParameter.Criticality criticality;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    private String thresholdCrossed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    public AdditionalParameter.Criticality getCriticality() {
        return criticality;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(AdditionalParameter.Criticality criticality) {
        this.criticality = criticality;
    }
    
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    public String getThresholdCrossed() {
        return thresholdCrossed;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    public void setThresholdCrossed(String thresholdCrossed) {
        this.thresholdCrossed = thresholdCrossed;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }
    
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
        return new HashCodeBuilder().append(criticality).append(name).append(thresholdCrossed)
                .append(value).append(additionalProperties).toHashCode();
    }
    
    
    
    public enum Criticality {
        
        CRIT("CRIT"), MAJ("MAJ");
        private final String value;
        private final static Map<String, AdditionalParameter.Criticality> CONSTANTS =
                new HashMap<String, AdditionalParameter.Criticality>();
        
        static {
            for (AdditionalParameter.Criticality c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private Criticality(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return this.value;
        }
        
        @JsonValue
        public String value() {
            return this.value;
        }
        
        @JsonCreator
        public static AdditionalParameter.Criticality fromValue(String value) {
            AdditionalParameter.Criticality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
