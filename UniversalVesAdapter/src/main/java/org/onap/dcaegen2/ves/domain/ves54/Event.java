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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * the root level of the common event format
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"commonEventHeader", "faultFields", "heartbeatFields",
        "measurementsForVfScalingFields", "mobileFlowFields", "otherFields", "sipSignalingFields",
        "stateChangeFields", "syslogFields", "thresholdCrossingAlertFields", "voiceQualityFields"})
public class Event {
    
    /**
     * fields common to all events (Required)
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
     * measurementsForVfScaling fields
     * 
     */
    @JsonProperty("measurementsForVfScalingFields")
    @JsonPropertyDescription("measurementsForVfScaling fields")
    private MeasurementsForVfScalingFields measurementsForVfScalingFields;
    /**
     * mobileFlow fields
     * 
     */
    @JsonProperty("mobileFlowFields")
    @JsonPropertyDescription("mobileFlow fields")
    private MobileFlowFields mobileFlowFields;
    /**
     * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
     * 
     */
    @JsonProperty("otherFields")
    @JsonPropertyDescription("fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration")
    private OtherFields otherFields;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * fields common to all events (Required)
     * 
     */
    @JsonProperty("commonEventHeader")
    public CommonEventHeader getCommonEventHeader() {
        return commonEventHeader;
    }
    
    /**
     * fields common to all events (Required)
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
     * measurementsForVfScaling fields
     * 
     */
    @JsonProperty("measurementsForVfScalingFields")
    public MeasurementsForVfScalingFields getMeasurementsForVfScalingFields() {
        return measurementsForVfScalingFields;
    }
    
    /**
     * measurementsForVfScaling fields
     * 
     */
    @JsonProperty("measurementsForVfScalingFields")
    public void setMeasurementsForVfScalingFields(
            MeasurementsForVfScalingFields measurementsForVfScalingFields) {
        this.measurementsForVfScalingFields = measurementsForVfScalingFields;
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
    public void setThresholdCrossingAlertFields(
            ThresholdCrossingAlertFields thresholdCrossingAlertFields) {
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
        return new HashCodeBuilder().append(commonEventHeader).append(faultFields)
                .append(heartbeatFields).append(measurementsForVfScalingFields)
                .append(mobileFlowFields).append(otherFields).append(sipSignalingFields)
                .append(stateChangeFields).append(syslogFields).append(thresholdCrossingAlertFields)
                .append(voiceQualityFields).append(additionalProperties).toHashCode();
    }
    
    
    
}
