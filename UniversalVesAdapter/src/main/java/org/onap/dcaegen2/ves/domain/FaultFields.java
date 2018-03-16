
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alarmCondition",
    "eventSeverity",
    "eventSourceType",
    "faultFieldsVersion",
    "specificProblem",
    "vfStatus",
    "alarmAdditionalInformation",
    "alarmInterfaceA",
    "eventCategory"
})
public class FaultFields {

    @JsonProperty("alarmCondition")
    private String alarmCondition;
    @JsonProperty("eventSeverity")
    private String eventSeverity;
    @JsonProperty("eventSourceType")
    private String eventSourceType;
    @JsonProperty("faultFieldsVersion")
    private Double faultFieldsVersion;
    @JsonProperty("specificProblem")
    private String specificProblem;
    @JsonProperty("vfStatus")
    private String vfStatus;
    @JsonProperty("alarmAdditionalInformation")
    private List<AlarmAdditionalInformation> alarmAdditionalInformation = null;
    @JsonProperty("alarmInterfaceA")
    private String alarmInterfaceA;
    @JsonProperty("eventCategory")
    private String eventCategory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alarmCondition")
    public String getAlarmCondition() {
        return alarmCondition;
    }

    @JsonProperty("alarmCondition")
    public void setAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
    }

    @JsonProperty("eventSeverity")
    public String getEventSeverity() {
        return eventSeverity;
    }

    @JsonProperty("eventSeverity")
    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    @JsonProperty("eventSourceType")
    public String getEventSourceType() {
        return eventSourceType;
    }

    @JsonProperty("eventSourceType")
    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    @JsonProperty("faultFieldsVersion")
    public Double getFaultFieldsVersion() {
        return faultFieldsVersion;
    }

    @JsonProperty("faultFieldsVersion")
    public void setFaultFieldsVersion(Double faultFieldsVersion) {
        this.faultFieldsVersion = faultFieldsVersion;
    }

    @JsonProperty("specificProblem")
    public String getSpecificProblem() {
        return specificProblem;
    }

    @JsonProperty("specificProblem")
    public void setSpecificProblem(String specificProblem) {
        this.specificProblem = specificProblem;
    }

    @JsonProperty("vfStatus")
    public String getVfStatus() {
        return vfStatus;
    }

    @JsonProperty("vfStatus")
    public void setVfStatus(String vfStatus) {
        this.vfStatus = vfStatus;
    }

    @JsonProperty("alarmAdditionalInformation")
    public List<AlarmAdditionalInformation> getAlarmAdditionalInformation() {
        return alarmAdditionalInformation;
    }

    @JsonProperty("alarmAdditionalInformation")
    public void setAlarmAdditionalInformation(List<AlarmAdditionalInformation> alarmAdditionalInformation) {
        this.alarmAdditionalInformation = alarmAdditionalInformation;
    }

    @JsonProperty("alarmInterfaceA")
    public String getAlarmInterfaceA() {
        return alarmInterfaceA;
    }

    @JsonProperty("alarmInterfaceA")
    public void setAlarmInterfaceA(String alarmInterfaceA) {
        this.alarmInterfaceA = alarmInterfaceA;
    }

    @JsonProperty("eventCategory")
    public String getEventCategory() {
        return eventCategory;
    }

    @JsonProperty("eventCategory")
    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
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
    public String toString() {
        return new ToStringBuilder(this).append("alarmCondition", alarmCondition).append("eventSeverity", eventSeverity).append("eventSourceType", eventSourceType).append("faultFieldsVersion", faultFieldsVersion).append("specificProblem", specificProblem).append("vfStatus", vfStatus).append("alarmAdditionalInformation", alarmAdditionalInformation).append("alarmInterfaceA", alarmInterfaceA).append("eventCategory", eventCategory).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventSourceType).append(alarmAdditionalInformation).append(specificProblem).append(additionalProperties).append(alarmInterfaceA).append(alarmCondition).append(eventSeverity).append(faultFieldsVersion).append(eventCategory).append(vfStatus).toHashCode();
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
        return new EqualsBuilder().append(eventSourceType, rhs.eventSourceType).append(alarmAdditionalInformation, rhs.alarmAdditionalInformation).append(specificProblem, rhs.specificProblem).append(additionalProperties, rhs.additionalProperties).append(alarmInterfaceA, rhs.alarmInterfaceA).append(alarmCondition, rhs.alarmCondition).append(eventSeverity, rhs.eventSeverity).append(faultFieldsVersion, rhs.faultFieldsVersion).append(eventCategory, rhs.eventCategory).append(vfStatus, rhs.vfStatus).isEquals();
    }

}
