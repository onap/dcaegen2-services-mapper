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

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * fields specific to fault events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alarmAdditionalInformation",
    "alarmCondition",
    "alarmInterfaceA",
    "eventCategory",
    "eventSeverity",
    "eventSourceType",
    "faultFieldsVersion",
    "specificProblem",
    "vfStatus"
})
public class FaultFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation alarmAdditionalInformation;
    /**
     * alarm condition reported by the device
     * (Required)
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
     * event severity
     * (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    @JsonPropertyDescription("event severity")
    private FaultFields.EventSeverity eventSeverity;
    /**
     * type of event source; examples: card, host, other, port, portThreshold, router, slotThreshold, switch, virtualMachine, virtualNetworkFunction
     * (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    @JsonPropertyDescription("type of event source; examples: card, host, other, port, portThreshold, router, slotThreshold, switch, virtualMachine, virtualNetworkFunction")
    private String eventSourceType;
    /**
     * version of the faultFields block
     * (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    @JsonPropertyDescription("version of the faultFields block")
    private FaultFields.FaultFieldsVersion faultFieldsVersion;
    /**
     * short description of the alarm or problem
     * (Required)
     * 
     */
    @JsonProperty("specificProblem")
    @JsonPropertyDescription("short description of the alarm or problem")
    private String specificProblem;
    /**
     * virtual function status enumeration
     * (Required)
     * 
     */
    @JsonProperty("vfStatus")
    @JsonPropertyDescription("virtual function status enumeration")
    private FaultFields.VfStatus vfStatus;

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    public AlarmAdditionalInformation getAlarmAdditionalInformation() {
        return alarmAdditionalInformation;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("alarmAdditionalInformation")
    public void setAlarmAdditionalInformation(AlarmAdditionalInformation alarmAdditionalInformation) {
        this.alarmAdditionalInformation = alarmAdditionalInformation;
    }

    /**
     * alarm condition reported by the device
     * (Required)
     * 
     */
    @JsonProperty("alarmCondition")
    public String getAlarmCondition() {
        return alarmCondition;
    }

    /**
     * alarm condition reported by the device
     * (Required)
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
     * event severity
     * (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public FaultFields.EventSeverity getEventSeverity() {
        return eventSeverity;
    }

    /**
     * event severity
     * (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public void setEventSeverity(FaultFields.EventSeverity eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    /**
     * type of event source; examples: card, host, other, port, portThreshold, router, slotThreshold, switch, virtualMachine, virtualNetworkFunction
     * (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public String getEventSourceType() {
        return eventSourceType;
    }

    /**
     * type of event source; examples: card, host, other, port, portThreshold, router, slotThreshold, switch, virtualMachine, virtualNetworkFunction
     * (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    /**
     * version of the faultFields block
     * (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    public FaultFields.FaultFieldsVersion getFaultFieldsVersion() {
        return faultFieldsVersion;
    }

    /**
     * version of the faultFields block
     * (Required)
     * 
     */
    @JsonProperty("faultFieldsVersion")
    public void setFaultFieldsVersion(FaultFields.FaultFieldsVersion faultFieldsVersion) {
        this.faultFieldsVersion = faultFieldsVersion;
    }

    /**
     * short description of the alarm or problem
     * (Required)
     * 
     */
    @JsonProperty("specificProblem")
    public String getSpecificProblem() {
        return specificProblem;
    }

    /**
     * short description of the alarm or problem
     * (Required)
     * 
     */
    @JsonProperty("specificProblem")
    public void setSpecificProblem(String specificProblem) {
        this.specificProblem = specificProblem;
    }

    /**
     * virtual function status enumeration
     * (Required)
     * 
     */
    @JsonProperty("vfStatus")
    public FaultFields.VfStatus getVfStatus() {
        return vfStatus;
    }

    /**
     * virtual function status enumeration
     * (Required)
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alarmAdditionalInformation).append(alarmCondition).append(alarmInterfaceA).append(eventCategory).append(eventSeverity).append(eventSourceType).append(faultFieldsVersion).append(specificProblem).append(vfStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FaultFields) == false) {
            return false;
        }
        FaultFields rhs = ((FaultFields) other);
        return new EqualsBuilder().append(alarmAdditionalInformation, rhs.alarmAdditionalInformation).append(alarmCondition, rhs.alarmCondition).append(alarmInterfaceA, rhs.alarmInterfaceA).append(eventCategory, rhs.eventCategory).append(eventSeverity, rhs.eventSeverity).append(eventSourceType, rhs.eventSourceType).append(faultFieldsVersion, rhs.faultFieldsVersion).append(specificProblem, rhs.specificProblem).append(vfStatus, rhs.vfStatus).isEquals();
    }

    public enum EventSeverity {

        CRITICAL("CRITICAL"),
        MAJOR("MAJOR"),
        MINOR("MINOR"),
        WARNING("WARNING"),
        NORMAL("NORMAL");
        private final String value;
        private final static Map<String, FaultFields.EventSeverity> CONSTANTS = new HashMap<String, FaultFields.EventSeverity>();

        static {
            for (FaultFields.EventSeverity c: values()) {
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

    public enum FaultFieldsVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, FaultFields.FaultFieldsVersion> CONSTANTS = new HashMap<String, FaultFields.FaultFieldsVersion>();

        static {
            for (FaultFields.FaultFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FaultFieldsVersion(String value) {
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
        public static FaultFields.FaultFieldsVersion fromValue(String value) {
            FaultFields.FaultFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum VfStatus {

        ACTIVE("Active"),
        IDLE("Idle"),
        PREPARING_TO_TERMINATE("Preparing to terminate"),
        READY_TO_TERMINATE("Ready to terminate"),
        REQUESTING_TERMINATION("Requesting termination");
        private final String value;
        private final static Map<String, FaultFields.VfStatus> CONSTANTS = new HashMap<String, FaultFields.VfStatus>();

        static {
            for (FaultFields.VfStatus c: values()) {
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
