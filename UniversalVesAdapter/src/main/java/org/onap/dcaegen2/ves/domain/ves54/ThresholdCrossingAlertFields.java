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
 * fields specific to threshold crossing alert events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalFields", "additionalParameters", "alertAction", "alertDescription",
        "alertType", "alertValue", "associatedAlertIdList", "collectionTimestamp", "dataCollector",
        "elementType", "eventSeverity", "eventStartTimestamp", "interfaceName", "networkService",
        "possibleRootCause", "thresholdCrossingFieldsVersion"})
public class ThresholdCrossingAlertFields {
    
    /**
     * additional threshold crossing alert fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("additional threshold crossing alert fields if needed")
    private List<AlarmAdditionalInformation> additionalFields =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * performance counters (Required)
     * 
     */
    @JsonProperty("additionalParameters")
    @JsonPropertyDescription("performance counters")
    private List<AdditionalParameter> additionalParameters = new ArrayList<AdditionalParameter>();
    /**
     * Event action (Required)
     * 
     */
    @JsonProperty("alertAction")
    @JsonPropertyDescription("Event action")
    private ThresholdCrossingAlertFields.AlertAction alertAction;
    /**
     * Unique short alert description such as IF-SHUB-ERRDROP (Required)
     * 
     */
    @JsonProperty("alertDescription")
    @JsonPropertyDescription("Unique short alert description such as IF-SHUB-ERRDROP")
    private String alertDescription;
    /**
     * Event type (Required)
     * 
     */
    @JsonProperty("alertType")
    @JsonPropertyDescription("Event type")
    private ThresholdCrossingAlertFields.AlertType alertType;
    /**
     * Calculated API value (if applicable)
     * 
     */
    @JsonProperty("alertValue")
    @JsonPropertyDescription("Calculated API value (if applicable)")
    private String alertValue;
    /**
     * List of eventIds associated with the event being reported
     * 
     */
    @JsonProperty("associatedAlertIdList")
    @JsonPropertyDescription("List of eventIds associated with the event being reported")
    private List<String> associatedAlertIdList = new ArrayList<String>();
    /**
     * Time when the performance collector picked up the data; with RFC 2822 compliant format: Sat,
     * 13 Mar 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("collectionTimestamp")
    @JsonPropertyDescription("Time when the performance collector picked up the data; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800")
    private String collectionTimestamp;
    /**
     * Specific performance collector instance used
     * 
     */
    @JsonProperty("dataCollector")
    @JsonPropertyDescription("Specific performance collector instance used")
    private String dataCollector;
    /**
     * type of network element - internal ATT field
     * 
     */
    @JsonProperty("elementType")
    @JsonPropertyDescription("type of network element - internal ATT field")
    private String elementType;
    /**
     * event severity or priority (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    @JsonPropertyDescription("event severity or priority")
    private ThresholdCrossingAlertFields.EventSeverity eventSeverity;
    /**
     * Time closest to when the measurement was made; with RFC 2822 compliant format: Sat, 13 Mar
     * 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("eventStartTimestamp")
    @JsonPropertyDescription("Time closest to when the measurement was made; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800")
    private String eventStartTimestamp;
    /**
     * Physical or logical port or card (if applicable)
     * 
     */
    @JsonProperty("interfaceName")
    @JsonPropertyDescription("Physical or logical port or card (if applicable)")
    private String interfaceName;
    /**
     * network name - internal ATT field
     * 
     */
    @JsonProperty("networkService")
    @JsonPropertyDescription("network name - internal ATT field")
    private String networkService;
    /**
     * Reserved for future use
     * 
     */
    @JsonProperty("possibleRootCause")
    @JsonPropertyDescription("Reserved for future use")
    private String possibleRootCause;
    /**
     * version of the thresholdCrossingAlertFields block (Required)
     * 
     */
    @JsonProperty("thresholdCrossingFieldsVersion")
    @JsonPropertyDescription("version of the thresholdCrossingAlertFields block")
    private Double thresholdCrossingFieldsVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional threshold crossing alert fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public List<AlarmAdditionalInformation> getAdditionalFields() {
        return additionalFields;
    }
    
    /**
     * additional threshold crossing alert fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AlarmAdditionalInformation> additionalFields) {
        this.additionalFields = additionalFields;
    }
    
    /**
     * performance counters (Required)
     * 
     */
    @JsonProperty("additionalParameters")
    public List<AdditionalParameter> getAdditionalParameters() {
        return additionalParameters;
    }
    
    /**
     * performance counters (Required)
     * 
     */
    @JsonProperty("additionalParameters")
    public void setAdditionalParameters(List<AdditionalParameter> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }
    
    /**
     * Event action (Required)
     * 
     */
    @JsonProperty("alertAction")
    public ThresholdCrossingAlertFields.AlertAction getAlertAction() {
        return alertAction;
    }
    
    /**
     * Event action (Required)
     * 
     */
    @JsonProperty("alertAction")
    public void setAlertAction(ThresholdCrossingAlertFields.AlertAction alertAction) {
        this.alertAction = alertAction;
    }
    
    /**
     * Unique short alert description such as IF-SHUB-ERRDROP (Required)
     * 
     */
    @JsonProperty("alertDescription")
    public String getAlertDescription() {
        return alertDescription;
    }
    
    /**
     * Unique short alert description such as IF-SHUB-ERRDROP (Required)
     * 
     */
    @JsonProperty("alertDescription")
    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }
    
    /**
     * Event type (Required)
     * 
     */
    @JsonProperty("alertType")
    public ThresholdCrossingAlertFields.AlertType getAlertType() {
        return alertType;
    }
    
    /**
     * Event type (Required)
     * 
     */
    @JsonProperty("alertType")
    public void setAlertType(ThresholdCrossingAlertFields.AlertType alertType) {
        this.alertType = alertType;
    }
    
    /**
     * Calculated API value (if applicable)
     * 
     */
    @JsonProperty("alertValue")
    public String getAlertValue() {
        return alertValue;
    }
    
    /**
     * Calculated API value (if applicable)
     * 
     */
    @JsonProperty("alertValue")
    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }
    
    /**
     * List of eventIds associated with the event being reported
     * 
     */
    @JsonProperty("associatedAlertIdList")
    public List<String> getAssociatedAlertIdList() {
        return associatedAlertIdList;
    }
    
    /**
     * List of eventIds associated with the event being reported
     * 
     */
    @JsonProperty("associatedAlertIdList")
    public void setAssociatedAlertIdList(List<String> associatedAlertIdList) {
        this.associatedAlertIdList = associatedAlertIdList;
    }
    
    /**
     * Time when the performance collector picked up the data; with RFC 2822 compliant format: Sat,
     * 13 Mar 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("collectionTimestamp")
    public String getCollectionTimestamp() {
        return collectionTimestamp;
    }
    
    /**
     * Time when the performance collector picked up the data; with RFC 2822 compliant format: Sat,
     * 13 Mar 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("collectionTimestamp")
    public void setCollectionTimestamp(String collectionTimestamp) {
        this.collectionTimestamp = collectionTimestamp;
    }
    
    /**
     * Specific performance collector instance used
     * 
     */
    @JsonProperty("dataCollector")
    public String getDataCollector() {
        return dataCollector;
    }
    
    /**
     * Specific performance collector instance used
     * 
     */
    @JsonProperty("dataCollector")
    public void setDataCollector(String dataCollector) {
        this.dataCollector = dataCollector;
    }
    
    /**
     * type of network element - internal ATT field
     * 
     */
    @JsonProperty("elementType")
    public String getElementType() {
        return elementType;
    }
    
    /**
     * type of network element - internal ATT field
     * 
     */
    @JsonProperty("elementType")
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    
    /**
     * event severity or priority (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public ThresholdCrossingAlertFields.EventSeverity getEventSeverity() {
        return eventSeverity;
    }
    
    /**
     * event severity or priority (Required)
     * 
     */
    @JsonProperty("eventSeverity")
    public void setEventSeverity(ThresholdCrossingAlertFields.EventSeverity eventSeverity) {
        this.eventSeverity = eventSeverity;
    }
    
    /**
     * Time closest to when the measurement was made; with RFC 2822 compliant format: Sat, 13 Mar
     * 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("eventStartTimestamp")
    public String getEventStartTimestamp() {
        return eventStartTimestamp;
    }
    
    /**
     * Time closest to when the measurement was made; with RFC 2822 compliant format: Sat, 13 Mar
     * 2010 11:29:05 -0800 (Required)
     * 
     */
    @JsonProperty("eventStartTimestamp")
    public void setEventStartTimestamp(String eventStartTimestamp) {
        this.eventStartTimestamp = eventStartTimestamp;
    }
    
    /**
     * Physical or logical port or card (if applicable)
     * 
     */
    @JsonProperty("interfaceName")
    public String getInterfaceName() {
        return interfaceName;
    }
    
    /**
     * Physical or logical port or card (if applicable)
     * 
     */
    @JsonProperty("interfaceName")
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
    
    /**
     * network name - internal ATT field
     * 
     */
    @JsonProperty("networkService")
    public String getNetworkService() {
        return networkService;
    }
    
    /**
     * network name - internal ATT field
     * 
     */
    @JsonProperty("networkService")
    public void setNetworkService(String networkService) {
        this.networkService = networkService;
    }
    
    /**
     * Reserved for future use
     * 
     */
    @JsonProperty("possibleRootCause")
    public String getPossibleRootCause() {
        return possibleRootCause;
    }
    
    /**
     * Reserved for future use
     * 
     */
    @JsonProperty("possibleRootCause")
    public void setPossibleRootCause(String possibleRootCause) {
        this.possibleRootCause = possibleRootCause;
    }
    
    /**
     * version of the thresholdCrossingAlertFields block (Required)
     * 
     */
    @JsonProperty("thresholdCrossingFieldsVersion")
    public Double getThresholdCrossingFieldsVersion() {
        return thresholdCrossingFieldsVersion;
    }
    
    /**
     * version of the thresholdCrossingAlertFields block (Required)
     * 
     */
    @JsonProperty("thresholdCrossingFieldsVersion")
    public void setThresholdCrossingFieldsVersion(Double thresholdCrossingFieldsVersion) {
        this.thresholdCrossingFieldsVersion = thresholdCrossingFieldsVersion;
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
        return new HashCodeBuilder().append(additionalFields).append(additionalParameters)
                .append(alertAction).append(alertDescription).append(alertType).append(alertValue)
                .append(associatedAlertIdList).append(collectionTimestamp).append(dataCollector)
                .append(elementType).append(eventSeverity).append(eventStartTimestamp)
                .append(interfaceName).append(networkService).append(possibleRootCause)
                .append(thresholdCrossingFieldsVersion).append(additionalProperties).toHashCode();
    }
    
    
    
    public enum AlertAction {
        
        CLEAR("CLEAR"), CONT("CONT"), SET("SET");
        private final String value;
        private final static Map<String, ThresholdCrossingAlertFields.AlertAction> CONSTANTS =
                new HashMap<String, ThresholdCrossingAlertFields.AlertAction>();
        
        static {
            for (ThresholdCrossingAlertFields.AlertAction c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private AlertAction(String value) {
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
        public static ThresholdCrossingAlertFields.AlertAction fromValue(String value) {
            ThresholdCrossingAlertFields.AlertAction constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
    public enum AlertType {
        
        CARD_ANOMALY("CARD-ANOMALY"), ELEMENT_ANOMALY("ELEMENT-ANOMALY"), INTERFACE_ANOMALY(
                "INTERFACE-ANOMALY"), SERVICE_ANOMALY("SERVICE-ANOMALY");
        private final String value;
        private final static Map<String, ThresholdCrossingAlertFields.AlertType> CONSTANTS =
                new HashMap<String, ThresholdCrossingAlertFields.AlertType>();
        
        static {
            for (ThresholdCrossingAlertFields.AlertType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private AlertType(String value) {
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
        public static ThresholdCrossingAlertFields.AlertType fromValue(String value) {
            ThresholdCrossingAlertFields.AlertType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
    public enum EventSeverity {
        
        CRITICAL("CRITICAL"), MAJOR("MAJOR"), MINOR("MINOR"), WARNING("WARNING"), NORMAL("NORMAL");
        private final String value;
        private final static Map<String, ThresholdCrossingAlertFields.EventSeverity> CONSTANTS =
                new HashMap<String, ThresholdCrossingAlertFields.EventSeverity>();
        
        static {
            for (ThresholdCrossingAlertFields.EventSeverity c : values()) {
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
        public static ThresholdCrossingAlertFields.EventSeverity fromValue(String value) {
            ThresholdCrossingAlertFields.EventSeverity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
