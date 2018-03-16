
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
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
    "commonEventHeader",
    "faultFields",
    "heartbeatFields",
    "measurementsForVfScalingFields",
    "mobileFlowFields",
    "otherFields",
    "sipSignalingFields",
    "stateChangeFields",
    "syslogFields",
    "thresholdCrossingAlertFields",
    "voiceQualityFields"
})
public class Event {

    @JsonProperty("commonEventHeader")
    private CommonEventHeader commonEventHeader;
    @JsonProperty("faultFields")
    private FaultFields faultFields;
    @JsonProperty("heartbeatFields")
    private HeartbeatFields heartbeatFields;
    @JsonProperty("measurementsForVfScalingFields")
    private MeasurementsForVfScalingFields measurementsForVfScalingFields;
    @JsonProperty("mobileFlowFields")
    private MobileFlowFields mobileFlowFields;
    @JsonProperty("otherFields")
    private OtherFields otherFields;
    @JsonProperty("sipSignalingFields")
    private SipSignalingFields sipSignalingFields;
    @JsonProperty("stateChangeFields")
    private StateChangeFields stateChangeFields;
    @JsonProperty("syslogFields")
    private SyslogFields syslogFields;
    @JsonProperty("thresholdCrossingAlertFields")
    private ThresholdCrossingAlertFields thresholdCrossingAlertFields;
    @JsonProperty("voiceQualityFields")
    private VoiceQualityFields voiceQualityFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commonEventHeader")
    public CommonEventHeader getCommonEventHeader() {
        return commonEventHeader;
    }

    @JsonProperty("commonEventHeader")
    public void setCommonEventHeader(CommonEventHeader commonEventHeader) {
        this.commonEventHeader = commonEventHeader;
    }

    @JsonProperty("faultFields")
    public FaultFields getFaultFields() {
        return faultFields;
    }

    @JsonProperty("faultFields")
    public void setFaultFields(FaultFields faultFields) {
        this.faultFields = faultFields;
    }

    @JsonProperty("heartbeatFields")
    public HeartbeatFields getHeartbeatFields() {
        return heartbeatFields;
    }

    @JsonProperty("heartbeatFields")
    public void setHeartbeatFields(HeartbeatFields heartbeatFields) {
        this.heartbeatFields = heartbeatFields;
    }

    @JsonProperty("measurementsForVfScalingFields")
    public MeasurementsForVfScalingFields getMeasurementsForVfScalingFields() {
        return measurementsForVfScalingFields;
    }

    @JsonProperty("measurementsForVfScalingFields")
    public void setMeasurementsForVfScalingFields(MeasurementsForVfScalingFields measurementsForVfScalingFields) {
        this.measurementsForVfScalingFields = measurementsForVfScalingFields;
    }

    @JsonProperty("mobileFlowFields")
    public MobileFlowFields getMobileFlowFields() {
        return mobileFlowFields;
    }

    @JsonProperty("mobileFlowFields")
    public void setMobileFlowFields(MobileFlowFields mobileFlowFields) {
        this.mobileFlowFields = mobileFlowFields;
    }

    @JsonProperty("otherFields")
    public OtherFields getOtherFields() {
        return otherFields;
    }

    @JsonProperty("otherFields")
    public void setOtherFields(OtherFields otherFields) {
        this.otherFields = otherFields;
    }

    @JsonProperty("sipSignalingFields")
    public SipSignalingFields getSipSignalingFields() {
        return sipSignalingFields;
    }

    @JsonProperty("sipSignalingFields")
    public void setSipSignalingFields(SipSignalingFields sipSignalingFields) {
        this.sipSignalingFields = sipSignalingFields;
    }

    @JsonProperty("stateChangeFields")
    public StateChangeFields getStateChangeFields() {
        return stateChangeFields;
    }

    @JsonProperty("stateChangeFields")
    public void setStateChangeFields(StateChangeFields stateChangeFields) {
        this.stateChangeFields = stateChangeFields;
    }

    @JsonProperty("syslogFields")
    public SyslogFields getSyslogFields() {
        return syslogFields;
    }

    @JsonProperty("syslogFields")
    public void setSyslogFields(SyslogFields syslogFields) {
        this.syslogFields = syslogFields;
    }

    @JsonProperty("thresholdCrossingAlertFields")
    public ThresholdCrossingAlertFields getThresholdCrossingAlertFields() {
        return thresholdCrossingAlertFields;
    }

    @JsonProperty("thresholdCrossingAlertFields")
    public void setThresholdCrossingAlertFields(ThresholdCrossingAlertFields thresholdCrossingAlertFields) {
        this.thresholdCrossingAlertFields = thresholdCrossingAlertFields;
    }

    @JsonProperty("voiceQualityFields")
    public VoiceQualityFields getVoiceQualityFields() {
        return voiceQualityFields;
    }

    @JsonProperty("voiceQualityFields")
    public void setVoiceQualityFields(VoiceQualityFields voiceQualityFields) {
        this.voiceQualityFields = voiceQualityFields;
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
        return new ToStringBuilder(this).append("commonEventHeader", commonEventHeader).append("faultFields", faultFields).append("heartbeatFields", heartbeatFields).append("measurementsForVfScalingFields", measurementsForVfScalingFields).append("mobileFlowFields", mobileFlowFields).append("otherFields", otherFields).append("sipSignalingFields", sipSignalingFields).append("stateChangeFields", stateChangeFields).append("syslogFields", syslogFields).append("thresholdCrossingAlertFields", thresholdCrossingAlertFields).append("voiceQualityFields", voiceQualityFields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mobileFlowFields).append(heartbeatFields).append(measurementsForVfScalingFields).append(otherFields).append(commonEventHeader).append(thresholdCrossingAlertFields).append(syslogFields).append(additionalProperties).append(stateChangeFields).append(voiceQualityFields).append(sipSignalingFields).append(faultFields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(mobileFlowFields, rhs.mobileFlowFields).append(heartbeatFields, rhs.heartbeatFields).append(measurementsForVfScalingFields, rhs.measurementsForVfScalingFields).append(otherFields, rhs.otherFields).append(commonEventHeader, rhs.commonEventHeader).append(thresholdCrossingAlertFields, rhs.thresholdCrossingAlertFields).append(syslogFields, rhs.syslogFields).append(additionalProperties, rhs.additionalProperties).append(stateChangeFields, rhs.stateChangeFields).append(voiceQualityFields, rhs.voiceQualityFields).append(sipSignalingFields, rhs.sipSignalingFields).append(faultFields, rhs.faultFields).isEquals();
    }

}
