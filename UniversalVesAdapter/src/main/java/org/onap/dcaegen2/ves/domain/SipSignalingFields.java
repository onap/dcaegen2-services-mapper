
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
    "correlator",
    "localIpAddress",
    "localPort",
    "remoteIpAddress",
    "remotePort",
    "sipSignalingFieldsVersion",
    "vendorVnfNameFields",
    "additionalInformation",
    "compressedSip",
    "summarySip"
})
public class SipSignalingFields {

    @JsonProperty("correlator")
    private String correlator;
    @JsonProperty("localIpAddress")
    private String localIpAddress;
    @JsonProperty("localPort")
    private String localPort;
    @JsonProperty("remoteIpAddress")
    private String remoteIpAddress;
    @JsonProperty("remotePort")
    private String remotePort;
    @JsonProperty("sipSignalingFieldsVersion")
    private Double sipSignalingFieldsVersion;
    @JsonProperty("vendorVnfNameFields")
    private VendorVnfNameFields vendorVnfNameFields;
    @JsonProperty("additionalInformation")
    private List<AdditionalInformation> additionalInformation = null;
    @JsonProperty("compressedSip")
    private String compressedSip;
    @JsonProperty("summarySip")
    private String summarySip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("correlator")
    public String getCorrelator() {
        return correlator;
    }

    @JsonProperty("correlator")
    public void setCorrelator(String correlator) {
        this.correlator = correlator;
    }

    @JsonProperty("localIpAddress")
    public String getLocalIpAddress() {
        return localIpAddress;
    }

    @JsonProperty("localIpAddress")
    public void setLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
    }

    @JsonProperty("localPort")
    public String getLocalPort() {
        return localPort;
    }

    @JsonProperty("localPort")
    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }

    @JsonProperty("remoteIpAddress")
    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }

    @JsonProperty("remoteIpAddress")
    public void setRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
    }

    @JsonProperty("remotePort")
    public String getRemotePort() {
        return remotePort;
    }

    @JsonProperty("remotePort")
    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }

    @JsonProperty("sipSignalingFieldsVersion")
    public Double getSipSignalingFieldsVersion() {
        return sipSignalingFieldsVersion;
    }

    @JsonProperty("sipSignalingFieldsVersion")
    public void setSipSignalingFieldsVersion(Double sipSignalingFieldsVersion) {
        this.sipSignalingFieldsVersion = sipSignalingFieldsVersion;
    }

    @JsonProperty("vendorVnfNameFields")
    public VendorVnfNameFields getVendorVnfNameFields() {
        return vendorVnfNameFields;
    }

    @JsonProperty("vendorVnfNameFields")
    public void setVendorVnfNameFields(VendorVnfNameFields vendorVnfNameFields) {
        this.vendorVnfNameFields = vendorVnfNameFields;
    }

    @JsonProperty("additionalInformation")
    public List<AdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(List<AdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @JsonProperty("compressedSip")
    public String getCompressedSip() {
        return compressedSip;
    }

    @JsonProperty("compressedSip")
    public void setCompressedSip(String compressedSip) {
        this.compressedSip = compressedSip;
    }

    @JsonProperty("summarySip")
    public String getSummarySip() {
        return summarySip;
    }

    @JsonProperty("summarySip")
    public void setSummarySip(String summarySip) {
        this.summarySip = summarySip;
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
        return new ToStringBuilder(this).append("correlator", correlator).append("localIpAddress", localIpAddress).append("localPort", localPort).append("remoteIpAddress", remoteIpAddress).append("remotePort", remotePort).append("sipSignalingFieldsVersion", sipSignalingFieldsVersion).append("vendorVnfNameFields", vendorVnfNameFields).append("additionalInformation", additionalInformation).append("compressedSip", compressedSip).append("summarySip", summarySip).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vendorVnfNameFields).append(correlator).append(additionalProperties).append(remoteIpAddress).append(sipSignalingFieldsVersion).append(localIpAddress).append(summarySip).append(remotePort).append(localPort).append(additionalInformation).append(compressedSip).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SipSignalingFields) == false) {
            return false;
        }
        SipSignalingFields rhs = ((SipSignalingFields) other);
        return new EqualsBuilder().append(vendorVnfNameFields, rhs.vendorVnfNameFields).append(correlator, rhs.correlator).append(additionalProperties, rhs.additionalProperties).append(remoteIpAddress, rhs.remoteIpAddress).append(sipSignalingFieldsVersion, rhs.sipSignalingFieldsVersion).append(localIpAddress, rhs.localIpAddress).append(summarySip, rhs.summarySip).append(remotePort, rhs.remotePort).append(localPort, rhs.localPort).append(additionalInformation, rhs.additionalInformation).append(compressedSip, rhs.compressedSip).isEquals();
    }

}
