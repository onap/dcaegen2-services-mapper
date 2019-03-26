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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * provides statistics related to customer facing voice products
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalInformation", "calleeSideCodec", "callerSideCodec", "correlator",
        "endOfCallVqmSummaries", "phoneNumber", "midCallRtcp", "vendorVnfNameFields",
        "voiceQualityFieldsVersion"})
public class VoiceQualityFields {
    
    /**
     * additional voice quality fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("additional voice quality fields if needed")
    private List<AlarmAdditionalInformation> additionalInformation =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * callee codec for the call (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    @JsonPropertyDescription("callee codec for the call")
    private String calleeSideCodec;
    /**
     * caller codec for the call (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    @JsonPropertyDescription("caller codec for the call")
    private String callerSideCodec;
    /**
     * this is the same for all events on this call (Required)
     * 
     */
    @JsonProperty("correlator")
    @JsonPropertyDescription("this is the same for all events on this call")
    private String correlator;
    /**
     * provides end of call voice quality metrics
     * 
     */
    @JsonProperty("endOfCallVqmSummaries")
    @JsonPropertyDescription("provides end of call voice quality metrics")
    private EndOfCallVqmSummaries endOfCallVqmSummaries;
    /**
     * phone number associated with the correlator
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("phone number associated with the correlator")
    private String phoneNumber;
    /**
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    @JsonPropertyDescription("Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers")
    private String midCallRtcp;
    /**
     * provides vendor, vnf and vfModule identifying information (Required)
     * 
     */
    @JsonProperty("vendorVnfNameFields")
    @JsonPropertyDescription("provides vendor, vnf and vfModule identifying information")
    private VendorVnfNameFields vendorVnfNameFields;
    /**
     * version of the voiceQualityFields block (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    @JsonPropertyDescription("version of the voiceQualityFields block")
    private Double voiceQualityFieldsVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional voice quality fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    public List<AlarmAdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }
    
    /**
     * additional voice quality fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(List<AlarmAdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
    
    /**
     * callee codec for the call (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    public String getCalleeSideCodec() {
        return calleeSideCodec;
    }
    
    /**
     * callee codec for the call (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    public void setCalleeSideCodec(String calleeSideCodec) {
        this.calleeSideCodec = calleeSideCodec;
    }
    
    /**
     * caller codec for the call (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    public String getCallerSideCodec() {
        return callerSideCodec;
    }
    
    /**
     * caller codec for the call (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    public void setCallerSideCodec(String callerSideCodec) {
        this.callerSideCodec = callerSideCodec;
    }
    
    /**
     * this is the same for all events on this call (Required)
     * 
     */
    @JsonProperty("correlator")
    public String getCorrelator() {
        return correlator;
    }
    
    /**
     * this is the same for all events on this call (Required)
     * 
     */
    @JsonProperty("correlator")
    public void setCorrelator(String correlator) {
        this.correlator = correlator;
    }
    
    /**
     * provides end of call voice quality metrics
     * 
     */
    @JsonProperty("endOfCallVqmSummaries")
    public EndOfCallVqmSummaries getEndOfCallVqmSummaries() {
        return endOfCallVqmSummaries;
    }
    
    /**
     * provides end of call voice quality metrics
     * 
     */
    @JsonProperty("endOfCallVqmSummaries")
    public void setEndOfCallVqmSummaries(EndOfCallVqmSummaries endOfCallVqmSummaries) {
        this.endOfCallVqmSummaries = endOfCallVqmSummaries;
    }
    
    /**
     * phone number associated with the correlator
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * phone number associated with the correlator
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    public String getMidCallRtcp() {
        return midCallRtcp;
    }
    
    /**
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    public void setMidCallRtcp(String midCallRtcp) {
        this.midCallRtcp = midCallRtcp;
    }
    
    /**
     * provides vendor, vnf and vfModule identifying information (Required)
     * 
     */
    @JsonProperty("vendorVnfNameFields")
    public VendorVnfNameFields getVendorVnfNameFields() {
        return vendorVnfNameFields;
    }
    
    /**
     * provides vendor, vnf and vfModule identifying information (Required)
     * 
     */
    @JsonProperty("vendorVnfNameFields")
    public void setVendorVnfNameFields(VendorVnfNameFields vendorVnfNameFields) {
        this.vendorVnfNameFields = vendorVnfNameFields;
    }
    
    /**
     * version of the voiceQualityFields block (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    public Double getVoiceQualityFieldsVersion() {
        return voiceQualityFieldsVersion;
    }
    
    /**
     * version of the voiceQualityFields block (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    public void setVoiceQualityFieldsVersion(Double voiceQualityFieldsVersion) {
        this.voiceQualityFieldsVersion = voiceQualityFieldsVersion;
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
        return new HashCodeBuilder().append(additionalInformation).append(calleeSideCodec)
                .append(callerSideCodec).append(correlator).append(endOfCallVqmSummaries)
                .append(phoneNumber).append(midCallRtcp).append(vendorVnfNameFields)
                .append(voiceQualityFieldsVersion).append(additionalProperties).toHashCode();
    }
    
    
}
