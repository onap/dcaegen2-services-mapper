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
 * fields specific to fault events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"alarmAdditionalInformation", "alarmCondition", "alarmInterfaceA",
        "eventCategory", "eventSeverity", "eventSourceType", "faultFieldsVersion",
        "specificProblem", "vfStatus"})
public class FaultFields {
    
    /**
     * additional alarm information
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    @JsonPropertyDescription("additional alarm information")
    private List<AlarmAdditionalInformation> alarmAdditionalInformation =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * alarm condition reported by the device (Required)
     * 
     */
    @JsonProperty("alarmCondition")
    @JsonPropertyDescription("alarm condition reported by the device")
    private String alarmCondition;
    /**
     * card, port, channel or interface name of the device generating the alarm
     * 
     */
    @JsonProperty("alarmInterfaceA")
    @JsonPropertyDescription("card, port, channel or interface name of the device generating the alarm")
    private String alarmInterfaceA;
    /**
     * Event category, for example: license, link, routing, security, signaling
     * 
     */
    @JsonProperty("eventCategory")
    @JsonPropertyDescription("Event category, for example: license, link, routing, security, signaling")
    private String eventCategory;
    /**
     * event severity (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    @JsonPropertyDescription("event severity")
    private FaultFields.EventSeverity eventSeverity;
    /**
     * type of event source; examples: card, host, other, port, portThreshold, router,
     * slotThreshold, switch, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    @JsonPropertyDescription("type of event source; examples: card, host, other, port, portThreshold, router, slotThreshold, switch, virtualMachine, virtualNetworkFunction")
    private String eventSourceType;
    /**
     * version of the faultFields block (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    @JsonPropertyDescription("version of the faultFields block")
    private Double faultFieldsVersion;
    /**
     * short description of the alarm or problem (Required)
     * 
     */
    @JsonProperty("specificProblem")
    @JsonPropertyDescription("short description of the alarm or problem")
    private String specificProblem;
    /**
     * virtual function status enumeration (Required)
     * 
     */
    @JsonProperty("vfStatus")
    @JsonPropertyDescription("virtual function status enumeration")
    private FaultFields.VfStatus vfStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional alarm information
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    public List<AlarmAdditionalInformation> getAlarmAdditionalInformation() {
        return alarmAdditionalInformation;
    }
    
    /**
     * additional alarm information
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    public void setAlarmAdditionalInformation(
            List<AlarmAdditionalInformation> alarmAdditionalInformation) {
        this.alarmAdditionalInformation = alarmAdditionalInformation;
    }
    
    /**
     * alarm condition reported by the device (Required)
     * 
     */
    @JsonProperty("alarmCondition")
    public String getAlarmCondition() {
        return alarmCondition;
    }
    
    /**
     * alarm condition reported by the device (Required)
     * 
     */
    @JsonProperty("alarmCondition")
    public void setAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
    }
    
    /**
     * card, port, channel or interface name of the device generating the alarm
     * 
     */
    @JsonProperty("alarmInterfaceA")
    public String getAlarmInterfaceA() {
        return alarmInterfaceA;
    }
    
    /**
     * card, port, channel or interface name of the device generating the alarm
     * 
     */
    @JsonProperty("alarmInterfaceA")
    public void setAlarmInterfaceA(String alarmInterfaceA) {
        this.alarmInterfaceA = alarmInterfaceA;
    }
    
    /**
     * Event category, for example: license, link, routing, security, signaling
     * 
     */
    @JsonProperty("eventCategory")
    public String getEventCategory() {
        return eventCategory;
    }
    
    /**
     * Event category, for example: license, link, routing, security, signaling
     * 
     */
    @JsonProperty("eventCategory")
    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }
    
    /**
     * event severity (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public FaultFields.EventSeverity getEventSeverity() {
        return eventSeverity;
    }
    
    /**
     * event severity (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public void setEventSeverity(FaultFields.EventSeverity eventSeverity) {
        this.eventSeverity = eventSeverity;
    }
    
    /**
     * type of event source; examples: card, host, other, port, portThreshold, router,
     * slotThreshold, switch, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public String getEventSourceType() {
        return eventSourceType;
    }
    
    /**
     * type of event source; examples: card, host, other, port, portThreshold, router,
     * slotThreshold, switch, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }
    
    /**
     * version of the faultFields block (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    public Double getFaultFieldsVersion() {
        return faultFieldsVersion;
    }
    
    /**
     * version of the faultFields block (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    public void setFaultFieldsVersion(Double faultFieldsVersion) {
        this.faultFieldsVersion = faultFieldsVersion;
    }
    
    /**
     * short description of the alarm or problem (Required)
     * 
     */
    @JsonProperty("specificProblem")
    public String getSpecificProblem() {
        return specificProblem;
    }
    
    /**
     * short description of the alarm or problem (Required)
     * 
     */
    @JsonProperty("specificProblem")
    public void setSpecificProblem(String specificProblem) {
        this.specificProblem = specificProblem;
    }
    
    /**
     * virtual function status enumeration (Required)
     * 
     */
    @JsonProperty("vfStatus")
    public FaultFields.VfStatus getVfStatus() {
        return vfStatus;
    }
    
    /**
     * virtual function status enumeration (Required)
     * 
     */
    @JsonProperty("vfStatus")
    public void setVfStatus(FaultFields.VfStatus vfStatus) {
        this.vfStatus = vfStatus;
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
        return new HashCodeBuilder().append(alarmAdditionalInformation).append(alarmCondition)
                .append(alarmInterfaceA).append(eventCategory).append(eventSeverity)
                .append(eventSourceType).append(faultFieldsVersion).append(specificProblem)
                .append(vfStatus).append(additionalProperties).toHashCode();
    }
    
    
    
    public enum EventSeverity {
        
        CRITICAL("CRITICAL"), MAJOR("MAJOR"), MINOR("MINOR"), WARNING("WARNING"), NORMAL("NORMAL");
        private final String value;
        private final static Map<String, FaultFields.EventSeverity> CONSTANTS =
                new HashMap<String, FaultFields.EventSeverity>();
        
        static {
            for (FaultFields.EventSeverity c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private EventSeverity(String value) {
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
        public static FaultFields.EventSeverity fromValue(String value) {
            FaultFields.EventSeverity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
    public enum VfStatus {
        
        ACTIVE("Active"), IDLE("Idle"), PREPARING_TO_TERMINATE(
                "Preparing to terminate"), READY_TO_TERMINATE(
                        "Ready to terminate"), REQUESTING_TERMINATION("Requesting termination");
        private final String value;
        private final static Map<String, FaultFields.VfStatus> CONSTANTS =
                new HashMap<String, FaultFields.VfStatus>();
        
        static {
            for (FaultFields.VfStatus c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private VfStatus(String value) {
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
        public static FaultFields.VfStatus fromValue(String value) {
            FaultFields.VfStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
