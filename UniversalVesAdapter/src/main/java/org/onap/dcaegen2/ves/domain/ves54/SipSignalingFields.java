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
 * sip signaling fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalInformation", "compressedSip", "correlator", "localIpAddress",
        "localPort", "remoteIpAddress", "remotePort", "sipSignalingFieldsVersion", "summarySip",
        "vendorVnfNameFields"})
public class SipSignalingFields {
    
    /**
     * additional sip signaling fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    @JsonPropertyDescription("additional sip signaling fields if needed")
    private List<AlarmAdditionalInformation> additionalInformation =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * the full SIP request/response including headers and bodies
     * 
     */
    @JsonProperty("compressedSip")
    @JsonPropertyDescription("the full SIP request/response including headers and bodies")
    private String compressedSip;
    /**
     * this is the same for all events on this call (Required)
     * 
     */
    @JsonProperty("correlator")
    @JsonPropertyDescription("this is the same for all events on this call")
    private String correlator;
    /**
     * IP address on VNF (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    @JsonPropertyDescription("IP address on VNF")
    private String localIpAddress;
    /**
     * port on VNF (Required)
     * 
     */
    @JsonProperty("localPort")
    @JsonPropertyDescription("port on VNF")
    private String localPort;
    /**
     * IP address of peer endpoint (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    @JsonPropertyDescription("IP address of peer endpoint")
    private String remoteIpAddress;
    /**
     * port of peer endpoint (Required)
     * 
     */
    @JsonProperty("remotePort")
    @JsonPropertyDescription("port of peer endpoint")
    private String remotePort;
    /**
     * version of the sipSignalingFields block (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    @JsonPropertyDescription("version of the sipSignalingFields block")
    private Double sipSignalingFieldsVersion;
    /**
     * the SIP Method or Response (‘INVITE’, ‘200 OK’, ‘BYE’, etc)
     * 
     */
    @JsonProperty("summarySip")
    @JsonPropertyDescription("the SIP Method or Response (\u2018INVITE\u2019, \u2018200 OK\u2019, \u2018BYE\u2019, etc)")
    private String summarySip;
    /**
     * provides vendor, vnf and vfModule identifying information (Required)
     * 
     */
    @JsonProperty("vendorVnfNameFields")
    @JsonPropertyDescription("provides vendor, vnf and vfModule identifying information")
    private VendorVnfNameFields vendorVnfNameFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional sip signaling fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    public List<AlarmAdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }
    
    /**
     * additional sip signaling fields if needed
     * 
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(List<AlarmAdditionalInformation> additionalInformation) {
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
     * IP address on VNF (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    public String getLocalIpAddress() {
        return localIpAddress;
    }
    
    /**
     * IP address on VNF (Required)
     * 
     */
    @JsonProperty("localIpAddress")
    public void setLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
    }
    
    /**
     * port on VNF (Required)
     * 
     */
    @JsonProperty("localPort")
    public String getLocalPort() {
        return localPort;
    }
    
    /**
     * port on VNF (Required)
     * 
     */
    @JsonProperty("localPort")
    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }
    
    /**
     * IP address of peer endpoint (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }
    
    /**
     * IP address of peer endpoint (Required)
     * 
     */
    @JsonProperty("remoteIpAddress")
    public void setRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
    }
    
    /**
     * port of peer endpoint (Required)
     * 
     */
    @JsonProperty("remotePort")
    public String getRemotePort() {
        return remotePort;
    }
    
    /**
     * port of peer endpoint (Required)
     * 
     */
    @JsonProperty("remotePort")
    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }
    
    /**
     * version of the sipSignalingFields block (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    public Double getSipSignalingFieldsVersion() {
        return sipSignalingFieldsVersion;
    }
    
    /**
     * version of the sipSignalingFields block (Required)
     * 
     */
    @JsonProperty("sipSignalingFieldsVersion")
    public void setSipSignalingFieldsVersion(Double sipSignalingFieldsVersion) {
        this.sipSignalingFieldsVersion = sipSignalingFieldsVersion;
    }
    
    /**
     * the SIP Method or Response (‘INVITE’, ‘200 OK’, ‘BYE’, etc)
     * 
     */
    @JsonProperty("summarySip")
    public String getSummarySip() {
        return summarySip;
    }
    
    /**
     * the SIP Method or Response (‘INVITE’, ‘200 OK’, ‘BYE’, etc)
     * 
     */
    @JsonProperty("summarySip")
    public void setSummarySip(String summarySip) {
        this.summarySip = summarySip;
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
        return new HashCodeBuilder().append(additionalInformation).append(compressedSip)
                .append(correlator).append(localIpAddress).append(localPort).append(remoteIpAddress)
                .append(remotePort).append(sipSignalingFieldsVersion).append(summarySip)
                .append(vendorVnfNameFields).append(additionalProperties).toHashCode();
    }
    
    
    
}
