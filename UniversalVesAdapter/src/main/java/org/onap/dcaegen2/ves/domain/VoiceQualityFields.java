
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "calleeSideCodec",
    "callerSideCodec",
    "correlator",
    "midCallRtcp",
    "vendorVnfNameFields",
    "voiceQualityFieldsVersion",
    "additionalInformation",
    "endOfCallVqmSummaries",
    "phoneNumber"
})
public class VoiceQualityFields {

    @JsonProperty("calleeSideCodec")
    private String calleeSideCodec;
    @JsonProperty("callerSideCodec")
    private String callerSideCodec;
    @JsonProperty("correlator")
    private String correlator;
    @JsonProperty("midCallRtcp")
    private String midCallRtcp;
    @JsonProperty("vendorVnfNameFields")
    private VendorVnfNameFields_ vendorVnfNameFields;
    @JsonProperty("voiceQualityFieldsVersion")
    private Double voiceQualityFieldsVersion;
    @JsonProperty("additionalInformation")
    private List<AdditionalInformation_> additionalInformation = null;
    @JsonProperty("endOfCallVqmSummaries")
    private EndOfCallVqmSummaries endOfCallVqmSummaries;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("calleeSideCodec")
    public String getCalleeSideCodec() {
        return calleeSideCodec;
    }

    @JsonProperty("calleeSideCodec")
    public void setCalleeSideCodec(String calleeSideCodec) {
        this.calleeSideCodec = calleeSideCodec;
    }

    @JsonProperty("callerSideCodec")
    public String getCallerSideCodec() {
        return callerSideCodec;
    }

    @JsonProperty("callerSideCodec")
    public void setCallerSideCodec(String callerSideCodec) {
        this.callerSideCodec = callerSideCodec;
    }

    @JsonProperty("correlator")
    public String getCorrelator() {
        return correlator;
    }

    @JsonProperty("correlator")
    public void setCorrelator(String correlator) {
        this.correlator = correlator;
    }

    @JsonProperty("midCallRtcp")
    public String getMidCallRtcp() {
        return midCallRtcp;
    }

    @JsonProperty("midCallRtcp")
    public void setMidCallRtcp(String midCallRtcp) {
        this.midCallRtcp = midCallRtcp;
    }

    @JsonProperty("vendorVnfNameFields")
    public VendorVnfNameFields_ getVendorVnfNameFields() {
        return vendorVnfNameFields;
    }

    @JsonProperty("vendorVnfNameFields")
    public void setVendorVnfNameFields(VendorVnfNameFields_ vendorVnfNameFields) {
        this.vendorVnfNameFields = vendorVnfNameFields;
    }

    @JsonProperty("voiceQualityFieldsVersion")
    public Double getVoiceQualityFieldsVersion() {
        return voiceQualityFieldsVersion;
    }

    @JsonProperty("voiceQualityFieldsVersion")
    public void setVoiceQualityFieldsVersion(Double voiceQualityFieldsVersion) {
        this.voiceQualityFieldsVersion = voiceQualityFieldsVersion;
    }

    @JsonProperty("additionalInformation")
    public List<AdditionalInformation_> getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(List<AdditionalInformation_> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @JsonProperty("endOfCallVqmSummaries")
    public EndOfCallVqmSummaries getEndOfCallVqmSummaries() {
        return endOfCallVqmSummaries;
    }

    @JsonProperty("endOfCallVqmSummaries")
    public void setEndOfCallVqmSummaries(EndOfCallVqmSummaries endOfCallVqmSummaries) {
        this.endOfCallVqmSummaries = endOfCallVqmSummaries;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    

}
