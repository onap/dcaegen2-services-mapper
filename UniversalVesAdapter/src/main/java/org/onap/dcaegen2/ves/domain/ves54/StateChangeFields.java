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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * stateChange fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalFields", "newState", "oldState", "stateChangeFieldsVersion",
        "stateInterface"})
public class StateChangeFields {
    
    /**
     * additional stateChange fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("additional stateChange fields if needed")
    private List<AlarmAdditionalInformation> additionalFields =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * new state of the entity (Required)
     * 
     */
    @JsonProperty("newState")
    @JsonPropertyDescription("new state of the entity")
    private StateChangeFields.NewState newState;
    /**
     * previous state of the entity (Required)
     * 
     */
    @JsonProperty("oldState")
    @JsonPropertyDescription("previous state of the entity")
    private StateChangeFields.OldState oldState;
    /**
     * version of the stateChangeFields block (Required)
     * 
     */
    @JsonProperty("stateChangeFieldsVersion")
    @JsonPropertyDescription("version of the stateChangeFields block")
    private Double stateChangeFieldsVersion;
    /**
     * card or port name of the entity that changed state (Required)
     * 
     */
    @JsonProperty("stateInterface")
    @JsonPropertyDescription("card or port name of the entity that changed state")
    private String stateInterface;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional stateChange fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public List<AlarmAdditionalInformation> getAdditionalFields() {
        return additionalFields;
    }
    
    /**
     * additional stateChange fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AlarmAdditionalInformation> additionalFields) {
        this.additionalFields = additionalFields;
    }
    
    /**
     * new state of the entity (Required)
     * 
     */
    @JsonProperty("newState")
    public StateChangeFields.NewState getNewState() {
        return newState;
    }
    
    /**
     * new state of the entity (Required)
     * 
     */
    @JsonProperty("newState")
    public void setNewState(StateChangeFields.NewState newState) {
        this.newState = newState;
    }
    
    /**
     * previous state of the entity (Required)
     * 
     */
    @JsonProperty("oldState")
    public StateChangeFields.OldState getOldState() {
        return oldState;
    }
    
    /**
     * previous state of the entity (Required)
     * 
     */
    @JsonProperty("oldState")
    public void setOldState(StateChangeFields.OldState oldState) {
        this.oldState = oldState;
    }
    
    /**
     * version of the stateChangeFields block (Required)
     * 
     */
    @JsonProperty("stateChangeFieldsVersion")
    public Double getStateChangeFieldsVersion() {
        return stateChangeFieldsVersion;
    }
    
    /**
     * version of the stateChangeFields block (Required)
     * 
     */
    @JsonProperty("stateChangeFieldsVersion")
    public void setStateChangeFieldsVersion(Double stateChangeFieldsVersion) {
        this.stateChangeFieldsVersion = stateChangeFieldsVersion;
    }
    
    /**
     * card or port name of the entity that changed state (Required)
     * 
     */
    @JsonProperty("stateInterface")
    public String getStateInterface() {
        return stateInterface;
    }
    
    /**
     * card or port name of the entity that changed state (Required)
     * 
     */
    @JsonProperty("stateInterface")
    public void setStateInterface(String stateInterface) {
        this.stateInterface = stateInterface;
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
        return new HashCodeBuilder().append(additionalFields).append(newState).append(oldState)
                .append(stateChangeFieldsVersion).append(stateInterface)
                .append(additionalProperties).toHashCode();
    }
    
    
    
    public enum NewState {
        
        IN_SERVICE("inService"), MAINTENANCE("maintenance"), OUT_OF_SERVICE("outOfService");
        private final String value;
        private final static Map<String, StateChangeFields.NewState> CONSTANTS =
                new HashMap<String, StateChangeFields.NewState>();
        
        static {
            for (StateChangeFields.NewState c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private NewState(String value) {
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
        public static StateChangeFields.NewState fromValue(String value) {
            StateChangeFields.NewState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
    public enum OldState {
        
        IN_SERVICE("inService"), MAINTENANCE("maintenance"), OUT_OF_SERVICE("outOfService");
        private final String value;
        private final static Map<String, StateChangeFields.OldState> CONSTANTS =
                new HashMap<String, StateChangeFields.OldState>();
        
        static {
            for (StateChangeFields.OldState c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private OldState(String value) {
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
        public static StateChangeFields.OldState fromValue(String value) {
            StateChangeFields.OldState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
