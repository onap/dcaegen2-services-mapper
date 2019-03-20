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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * the root level of the common event format
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commonEventHeader",
    "faultFields",
    "heartbeatFields",
    "measurementFields",
    "mobileFlowFields",
    "notificationFields",
    "otherFields",
    "pnfRegistrationFields",
    "sipSignalingFields",
    "stateChangeFields",
    "syslogFields",
    "thresholdCrossingAlertFields",
    "voiceQualityFields"
})
public class Event {

    /**
     * fields common to all events
     * (Required)
     * 
     */
    @JsonProperty("commonEventHeader")
    @JsonPropertyDescription("fields common to all events")
    private CommonEventHeader commonEventHeader;
    /**
     * fields specific to fault events
     * 
     */
    @JsonProperty("faultFields")
    @JsonPropertyDescription("fields specific to fault events")
    private FaultFields faultFields;
    /**
     * optional field block for fields specific to heartbeat events
     * 
     */
    @JsonProperty("heartbeatFields")
    @JsonPropertyDescription("optional field block for fields specific to heartbeat events")
    private HeartbeatFields heartbeatFields;
    /**
     * measurement fields
     * 
     */
    @JsonProperty("measurementFields")
    @JsonPropertyDescription("measurement fields")
    private MeasurementFields measurementFields;
    /**
     * mobileFlow fields
     * 
     */
    @JsonProperty("mobileFlowFields")
    @JsonPropertyDescription("mobileFlow fields")
    private MobileFlowFields mobileFlowFields;
    /**
     * notification fields
     * 
     */
    @JsonProperty("notificationFields")
    @JsonPropertyDescription("notification fields")
    private NotificationFields notificationFields;
    /**
     * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
     * 
     */
    @JsonProperty("otherFields")
    @JsonPropertyDescription("fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration")
    private OtherFields otherFields;
    /**
     * hardware device registration fields
     * 
     */
    @JsonProperty("pnfRegistrationFields")
    @JsonPropertyDescription("hardware device registration fields")
    private PnfRegistrationFields pnfRegistrationFields;
    /**
     * sip signaling fields
     * 
     */
    @JsonProperty("sipSignalingFields")
    @JsonPropertyDescription("sip signaling fields")
    private SipSignalingFields sipSignalingFields;
    /**
     * stateChange fields
     * 
     */
    @JsonProperty("stateChangeFields")
    @JsonPropertyDescription("stateChange fields")
    private StateChangeFields stateChangeFields;
    /**
     * sysLog fields
     * 
     */
    @JsonProperty("syslogFields")
    @JsonPropertyDescription("sysLog fields")
    private SyslogFields syslogFields;
    /**
     * fields specific to threshold crossing alert events
     * 
     */
    @JsonProperty("thresholdCrossingAlertFields")
    @JsonPropertyDescription("fields specific to threshold crossing alert events")
    private ThresholdCrossingAlertFields thresholdCrossingAlertFields;
    /**
     * provides statistics related to customer facing voice products
     * 
     */
    @JsonProperty("voiceQualityFields")
    @JsonPropertyDescription("provides statistics related to customer facing voice products")
    private VoiceQualityFields voiceQualityFields;

    /**
     * fields common to all events
     * (Required)
     * 
     */
    @JsonProperty("commonEventHeader")
    public CommonEventHeader getCommonEventHeader() {
        return commonEventHeader;
    }

    /**
     * fields common to all events
     * (Required)
     * 
     */
    @JsonProperty("commonEventHeader")
    public void setCommonEventHeader(CommonEventHeader commonEventHeader) {
        this.commonEventHeader = commonEventHeader;
    }

    /**
     * fields specific to fault events
     * 
     */
    @JsonProperty("faultFields")
    public FaultFields getFaultFields() {
        return faultFields;
    }

    /**
     * fields specific to fault events
     * 
     */
    @JsonProperty("faultFields")
    public void setFaultFields(FaultFields faultFields) {
        this.faultFields = faultFields;
    }

    /**
     * optional field block for fields specific to heartbeat events
     * 
     */
    @JsonProperty("heartbeatFields")
    public HeartbeatFields getHeartbeatFields() {
        return heartbeatFields;
    }

    /**
     * optional field block for fields specific to heartbeat events
     * 
     */
    @JsonProperty("heartbeatFields")
    public void setHeartbeatFields(HeartbeatFields heartbeatFields) {
        this.heartbeatFields = heartbeatFields;
    }

    /**
     * measurement fields
     * 
     */
    @JsonProperty("measurementFields")
    public MeasurementFields getMeasurementFields() {
        return measurementFields;
    }

    /**
     * measurement fields
     * 
     */
    @JsonProperty("measurementFields")
    public void setMeasurementFields(MeasurementFields measurementFields) {
        this.measurementFields = measurementFields;
    }

    /**
     * mobileFlow fields
     * 
     */
    @JsonProperty("mobileFlowFields")
    public MobileFlowFields getMobileFlowFields() {
        return mobileFlowFields;
    }

    /**
     * mobileFlow fields
     * 
     */
    @JsonProperty("mobileFlowFields")
    public void setMobileFlowFields(MobileFlowFields mobileFlowFields) {
        this.mobileFlowFields = mobileFlowFields;
    }

    /**
     * notification fields
     * 
     */
    @JsonProperty("notificationFields")
    public NotificationFields getNotificationFields() {
        return notificationFields;
    }

    /**
     * notification fields
     * 
     */
    @JsonProperty("notificationFields")
    public void setNotificationFields(NotificationFields notificationFields) {
        this.notificationFields = notificationFields;
    }

    /**
     * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
     * 
     */
    @JsonProperty("otherFields")
    public OtherFields getOtherFields() {
        return otherFields;
    }

    /**
     * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
     * 
     */
    @JsonProperty("otherFields")
    public void setOtherFields(OtherFields otherFields) {
        this.otherFields = otherFields;
    }

    /**
     * hardware device registration fields
     * 
     */
    @JsonProperty("pnfRegistrationFields")
    public PnfRegistrationFields getPnfRegistrationFields() {
        return pnfRegistrationFields;
    }

    /**
     * hardware device registration fields
     * 
     */
    @JsonProperty("pnfRegistrationFields")
    public void setPnfRegistrationFields(PnfRegistrationFields pnfRegistrationFields) {
        this.pnfRegistrationFields = pnfRegistrationFields;
    }

    /**
     * sip signaling fields
     * 
     */
    @JsonProperty("sipSignalingFields")
    public SipSignalingFields getSipSignalingFields() {
        return sipSignalingFields;
    }

    /**
     * sip signaling fields
     * 
     */
    @JsonProperty("sipSignalingFields")
    public void setSipSignalingFields(SipSignalingFields sipSignalingFields) {
        this.sipSignalingFields = sipSignalingFields;
    }

    /**
     * stateChange fields
     * 
     */
    @JsonProperty("stateChangeFields")
    public StateChangeFields getStateChangeFields() {
        return stateChangeFields;
    }

    /**
     * stateChange fields
     * 
     */
    @JsonProperty("stateChangeFields")
    public void setStateChangeFields(StateChangeFields stateChangeFields) {
        this.stateChangeFields = stateChangeFields;
    }

    /**
     * sysLog fields
     * 
     */
    @JsonProperty("syslogFields")
    public SyslogFields getSyslogFields() {
        return syslogFields;
    }

    /**
     * sysLog fields
     * 
     */
    @JsonProperty("syslogFields")
    public void setSyslogFields(SyslogFields syslogFields) {
        this.syslogFields = syslogFields;
    }

    /**
     * fields specific to threshold crossing alert events
     * 
     */
    @JsonProperty("thresholdCrossingAlertFields")
    public ThresholdCrossingAlertFields getThresholdCrossingAlertFields() {
        return thresholdCrossingAlertFields;
    }

    /**
     * fields specific to threshold crossing alert events
     * 
     */
    @JsonProperty("thresholdCrossingAlertFields")
    public void setThresholdCrossingAlertFields(ThresholdCrossingAlertFields thresholdCrossingAlertFields) {
        this.thresholdCrossingAlertFields = thresholdCrossingAlertFields;
    }

    /**
     * provides statistics related to customer facing voice products
     * 
     */
    @JsonProperty("voiceQualityFields")
    public VoiceQualityFields getVoiceQualityFields() {
        return voiceQualityFields;
    }

    /**
     * provides statistics related to customer facing voice products
     * 
     */
    @JsonProperty("voiceQualityFields")
    public void setVoiceQualityFields(VoiceQualityFields voiceQualityFields) {
        this.voiceQualityFields = voiceQualityFields;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(commonEventHeader).append(faultFields).append(heartbeatFields).append(measurementFields).append(mobileFlowFields).append(notificationFields).append(otherFields).append(pnfRegistrationFields).append(sipSignalingFields).append(stateChangeFields).append(syslogFields).append(thresholdCrossingAlertFields).append(voiceQualityFields).toHashCode();
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
        return new EqualsBuilder().append(commonEventHeader, rhs.commonEventHeader).append(faultFields, rhs.faultFields).append(heartbeatFields, rhs.heartbeatFields).append(measurementFields, rhs.measurementFields).append(mobileFlowFields, rhs.mobileFlowFields).append(notificationFields, rhs.notificationFields).append(otherFields, rhs.otherFields).append(pnfRegistrationFields, rhs.pnfRegistrationFields).append(sipSignalingFields, rhs.sipSignalingFields).append(stateChangeFields, rhs.stateChangeFields).append(syslogFields, rhs.syslogFields).append(thresholdCrossingAlertFields, rhs.thresholdCrossingAlertFields).append(voiceQualityFields, rhs.voiceQualityFields).isEquals();
    }

}
