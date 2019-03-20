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
 * sip signaling fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalInformation",
    "compressedSip",
    "correlator",
    "localIpAddress",
    "localPort",
    "remoteIpAddress",
    "remotePort",
    "sipSignalingFieldsVersion",
    "summarySip",
    "vendorNfNameFields"
})
public class SipSignalingFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalInformation;
    /**
     * the full SIP request/response including headers and bodies
     * 
     */
    @JsonProperty("compressedSip")
    @JsonPropertyDescription("the full SIP request/response including headers and bodies")
    private String compressedSip;
    /**
     * this is the same for all events on this call
     * (Required)
     * 
     */
    @JsonProperty("correlator")
    @JsonPropertyDescription("this is the same for all events on this call")
    private String correlator;
    /**
     * IP address on xNF
     * (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    @JsonPropertyDescription("IP address on xNF")
    private String localIpAddress;
    /**
     * port on xNF
     * (Required)
     * 
     */
    @JsonProperty("localPort")
    @JsonPropertyDescription("port on xNF")
    private String localPort;
    /**
     * IP address of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    @JsonPropertyDescription("IP address of peer endpoint")
    private String remoteIpAddress;
    /**
     * port of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remotePort")
    @JsonPropertyDescription("port of peer endpoint")
    private String remotePort;
    /**
     * version of the sipSignalingFields block
     * (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    @JsonPropertyDescription("version of the sipSignalingFields block")
    private SipSignalingFields.SipSignalingFieldsVersion sipSignalingFieldsVersion;
    /**
     * the SIP Method or Response ('INVITE', '200 OK', 'BYE', etc)
     * 
     */
    @JsonProperty("summarySip")
    @JsonPropertyDescription("the SIP Method or Response ('INVITE', '200 OK', 'BYE', etc)")
    private String summarySip;
    /**
     * provides vendor, nf and nfModule identifying information
     * (Required)
     * 
     */
    @JsonProperty("vendorNfNameFields")
    @JsonPropertyDescription("provides vendor, nf and nfModule identifying information")
    private VendorNfNameFields vendorNfNameFields;

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
     * the full SIP request/response including headers and bodies
     * 
     */
    @JsonProperty("compressedSip")
    public String getCompressedSip() {
        return compressedSip;
    }

    /**
     * the full SIP request/response including headers and bodies
     * 
     */
    @JsonProperty("compressedSip")
    public void setCompressedSip(String compressedSip) {
        this.compressedSip = compressedSip;
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
     * IP address on xNF
     * (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    public String getLocalIpAddress() {
        return localIpAddress;
    }

    /**
     * IP address on xNF
     * (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    public void setLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
    }

    /**
     * port on xNF
     * (Required)
     * 
     */
    @JsonProperty("localPort")
    public String getLocalPort() {
        return localPort;
    }

    /**
     * port on xNF
     * (Required)
     * 
     */
    @JsonProperty("localPort")
    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }

    /**
     * IP address of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }

    /**
     * IP address of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    public void setRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
    }

    /**
     * port of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remotePort")
    public String getRemotePort() {
        return remotePort;
    }

    /**
     * port of peer endpoint
     * (Required)
     * 
     */
    @JsonProperty("remotePort")
    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }

    /**
     * version of the sipSignalingFields block
     * (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    public SipSignalingFields.SipSignalingFieldsVersion getSipSignalingFieldsVersion() {
        return sipSignalingFieldsVersion;
    }

    /**
     * version of the sipSignalingFields block
     * (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    public void setSipSignalingFieldsVersion(SipSignalingFields.SipSignalingFieldsVersion sipSignalingFieldsVersion) {
        this.sipSignalingFieldsVersion = sipSignalingFieldsVersion;
    }

    /**
     * the SIP Method or Response ('INVITE', '200 OK', 'BYE', etc)
     * 
     */
    @JsonProperty("summarySip")
    public String getSummarySip() {
        return summarySip;
    }

    /**
     * the SIP Method or Response ('INVITE', '200 OK', 'BYE', etc)
     * 
     */
    @JsonProperty("summarySip")
    public void setSummarySip(String summarySip) {
        this.summarySip = summarySip;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalInformation).append(compressedSip).append(correlator).append(localIpAddress).append(localPort).append(remoteIpAddress).append(remotePort).append(sipSignalingFieldsVersion).append(summarySip).append(vendorNfNameFields).toHashCode();
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
        return new EqualsBuilder().append(additionalInformation, rhs.additionalInformation).append(compressedSip, rhs.compressedSip).append(correlator, rhs.correlator).append(localIpAddress, rhs.localIpAddress).append(localPort, rhs.localPort).append(remoteIpAddress, rhs.remoteIpAddress).append(remotePort, rhs.remotePort).append(sipSignalingFieldsVersion, rhs.sipSignalingFieldsVersion).append(summarySip, rhs.summarySip).append(vendorNfNameFields, rhs.vendorNfNameFields).isEquals();
    }

    public enum SipSignalingFieldsVersion {

        _3_0("3.0");
        private final String value;
        private final static Map<String, SipSignalingFields.SipSignalingFieldsVersion> CONSTANTS = new HashMap<String, SipSignalingFields.SipSignalingFieldsVersion>();

        static {
            for (SipSignalingFields.SipSignalingFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SipSignalingFieldsVersion(String value) {
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
        public static SipSignalingFields.SipSignalingFieldsVersion fromValue(String value) {
            SipSignalingFields.SipSignalingFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
