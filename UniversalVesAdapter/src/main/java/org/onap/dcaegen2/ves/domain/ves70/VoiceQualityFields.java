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
 * provides statistics related to customer facing voice products
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalInformation",
    "calleeSideCodec",
    "callerSideCodec",
    "correlator",
    "endOfCallVqmSummaries",
    "phoneNumber",
    "midCallRtcp",
    "vendorNfNameFields",
    "voiceQualityFieldsVersion"
})
public class VoiceQualityFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalInformation;
    /**
     * callee codec for the call
     * (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    @JsonPropertyDescription("callee codec for the call")
    private String calleeSideCodec;
    /**
     * caller codec for the call
     * (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    @JsonPropertyDescription("caller codec for the call")
    private String callerSideCodec;
    /**
     * this is the same for all events on this call
     * (Required)
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
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers
     * (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    @JsonPropertyDescription("Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers")
    private String midCallRtcp;
    /**
     * provides vendor, nf and nfModule identifying information
     * (Required)
     * 
     */
    @JsonProperty("vendorNfNameFields")
    @JsonPropertyDescription("provides vendor, nf and nfModule identifying information")
    private VendorNfNameFields vendorNfNameFields;
    /**
     * version of the voiceQualityFields block
     * (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    @JsonPropertyDescription("version of the voiceQualityFields block")
    private VoiceQualityFields.VoiceQualityFieldsVersion voiceQualityFieldsVersion;

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalInformation")
    public AlarmAdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(AlarmAdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * callee codec for the call
     * (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    public String getCalleeSideCodec() {
        return calleeSideCodec;
    }

    /**
     * callee codec for the call
     * (Required)
     * 
     */
    @JsonProperty("calleeSideCodec")
    public void setCalleeSideCodec(String calleeSideCodec) {
        this.calleeSideCodec = calleeSideCodec;
    }

    /**
     * caller codec for the call
     * (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    public String getCallerSideCodec() {
        return callerSideCodec;
    }

    /**
     * caller codec for the call
     * (Required)
     * 
     */
    @JsonProperty("callerSideCodec")
    public void setCallerSideCodec(String callerSideCodec) {
        this.callerSideCodec = callerSideCodec;
    }

    /**
     * this is the same for all events on this call
     * (Required)
     * 
     */
    @JsonProperty("correlator")
    public String getCorrelator() {
        return correlator;
    }

    /**
     * this is the same for all events on this call
     * (Required)
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
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers
     * (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    public String getMidCallRtcp() {
        return midCallRtcp;
    }

    /**
     * Base64 encoding of the binary RTCP data excluding Eth/IP/UDP headers
     * (Required)
     * 
     */
    @JsonProperty("midCallRtcp")
    public void setMidCallRtcp(String midCallRtcp) {
        this.midCallRtcp = midCallRtcp;
    }

    /**
     * provides vendor, nf and nfModule identifying information
     * (Required)
     * 
     */
    @JsonProperty("vendorNfNameFields")
    public VendorNfNameFields getVendorNfNameFields() {
        return vendorNfNameFields;
    }

    /**
     * provides vendor, nf and nfModule identifying information
     * (Required)
     * 
     */
    @JsonProperty("vendorNfNameFields")
    public void setVendorNfNameFields(VendorNfNameFields vendorNfNameFields) {
        this.vendorNfNameFields = vendorNfNameFields;
    }

    /**
     * version of the voiceQualityFields block
     * (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    public VoiceQualityFields.VoiceQualityFieldsVersion getVoiceQualityFieldsVersion() {
        return voiceQualityFieldsVersion;
    }

    /**
     * version of the voiceQualityFields block
     * (Required)
     * 
     */
    @JsonProperty("voiceQualityFieldsVersion")
    public void setVoiceQualityFieldsVersion(VoiceQualityFields.VoiceQualityFieldsVersion voiceQualityFieldsVersion) {
        this.voiceQualityFieldsVersion = voiceQualityFieldsVersion;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalInformation).append(calleeSideCodec).append(callerSideCodec).append(correlator).append(endOfCallVqmSummaries).append(phoneNumber).append(midCallRtcp).append(vendorNfNameFields).append(voiceQualityFieldsVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VoiceQualityFields) == false) {
            return false;
        }
        VoiceQualityFields rhs = ((VoiceQualityFields) other);
        return new EqualsBuilder().append(additionalInformation, rhs.additionalInformation).append(calleeSideCodec, rhs.calleeSideCodec).append(callerSideCodec, rhs.callerSideCodec).append(correlator, rhs.correlator).append(endOfCallVqmSummaries, rhs.endOfCallVqmSummaries).append(phoneNumber, rhs.phoneNumber).append(midCallRtcp, rhs.midCallRtcp).append(vendorNfNameFields, rhs.vendorNfNameFields).append(voiceQualityFieldsVersion, rhs.voiceQualityFieldsVersion).isEquals();
    }

    public enum VoiceQualityFieldsVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, VoiceQualityFields.VoiceQualityFieldsVersion> CONSTANTS = new HashMap<String, VoiceQualityFields.VoiceQualityFieldsVersion>();

        static {
            for (VoiceQualityFields.VoiceQualityFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private VoiceQualityFieldsVersion(String value) {
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
        public static VoiceQualityFields.VoiceQualityFieldsVersion fromValue(String value) {
            VoiceQualityFields.VoiceQualityFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
