/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018 TechMahindra
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
 * mobileFlow fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalFields",
    "applicationType",
    "appProtocolType",
    "appProtocolVersion",
    "cid",
    "connectionType",
    "ecgi",
    "flowDirection",
    "gtpPerFlowMetrics",
    "gtpProtocolType",
    "gtpVersion",
    "httpHeader",
    "imei",
    "imsi",
    "ipProtocolType",
    "ipVersion",
    "lac",
    "mcc",
    "mnc",
    "mobileFlowFieldsVersion",
    "msisdn",
    "otherEndpointIpAddress",
    "otherEndpointPort",
    "otherFunctionalRole",
    "rac",
    "radioAccessTechnology",
    "reportingEndpointIpAddr",
    "reportingEndpointPort",
    "sac",
    "samplingAlgorithm",
    "tac",
    "tunnelId",
    "vlanId"
})
public class MobileFlowFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalFields;
    /**
     * Application type inferred
     * 
     */
    @JsonProperty("applicationType")
    @JsonPropertyDescription("Application type inferred")
    private String applicationType;
    /**
     * application protocol
     * 
     */
    @JsonProperty("appProtocolType")
    @JsonPropertyDescription("application protocol")
    private String appProtocolType;
    /**
     * application protocol version
     * 
     */
    @JsonProperty("appProtocolVersion")
    @JsonPropertyDescription("application protocol version")
    private String appProtocolVersion;
    /**
     * cell id
     * 
     */
    @JsonProperty("cid")
    @JsonPropertyDescription("cell id")
    private String cid;
    /**
     * Abbreviation referencing a 3GPP reference point e.g., S1-U, S11, etc
     * 
     */
    @JsonProperty("connectionType")
    @JsonPropertyDescription("Abbreviation referencing a 3GPP reference point e.g., S1-U, S11, etc")
    private String connectionType;
    /**
     * Evolved Cell Global Id
     * 
     */
    @JsonProperty("ecgi")
    @JsonPropertyDescription("Evolved Cell Global Id")
    private String ecgi;
    /**
     * Flow direction, indicating if the reporting node is the source of the flow or destination for the flow
     * (Required)
     * 
     */
    @JsonProperty("flowDirection")
    @JsonPropertyDescription("Flow direction, indicating if the reporting node is the source of the flow or destination for the flow")
    private String flowDirection;
    /**
     * Mobility GTP Protocol per flow metrics
     * (Required)
     * 
     */
    @JsonProperty("gtpPerFlowMetrics")
    @JsonPropertyDescription("Mobility GTP Protocol per flow metrics")
    private GtpPerFlowMetrics gtpPerFlowMetrics;
    /**
     * GTP protocol
     * 
     */
    @JsonProperty("gtpProtocolType")
    @JsonPropertyDescription("GTP protocol")
    private String gtpProtocolType;
    /**
     * GTP protocol version
     * 
     */
    @JsonProperty("gtpVersion")
    @JsonPropertyDescription("GTP protocol version")
    private String gtpVersion;
    /**
     * HTTP request header, if the flow connects to a node referenced by HTTP
     * 
     */
    @JsonProperty("httpHeader")
    @JsonPropertyDescription("HTTP request header, if the flow connects to a node referenced by HTTP")
    private String httpHeader;
    /**
     * IMEI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imei")
    @JsonPropertyDescription("IMEI for the subscriber UE used in this flow, if the flow connects to a mobile device")
    private String imei;
    /**
     * IMSI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imsi")
    @JsonPropertyDescription("IMSI for the subscriber UE used in this flow, if the flow connects to a mobile device")
    private String imsi;
    /**
     * IP protocol type e.g., TCP, UDP, RTP...
     * (Required)
     * 
     */
    @JsonProperty("ipProtocolType")
    @JsonPropertyDescription("IP protocol type e.g., TCP, UDP, RTP...")
    private String ipProtocolType;
    /**
     * IP protocol version e.g., IPv4, IPv6
     * (Required)
     * 
     */
    @JsonProperty("ipVersion")
    @JsonPropertyDescription("IP protocol version e.g., IPv4, IPv6")
    private String ipVersion;
    /**
     * location area code
     * 
     */
    @JsonProperty("lac")
    @JsonPropertyDescription("location area code")
    private String lac;
    /**
     * mobile country code
     * 
     */
    @JsonProperty("mcc")
    @JsonPropertyDescription("mobile country code")
    private String mcc;
    /**
     * mobile network code
     * 
     */
    @JsonProperty("mnc")
    @JsonPropertyDescription("mobile network code")
    private String mnc;
    /**
     * version of the mobileFlowFields block
     * (Required)
     * 
     */
    @JsonProperty("mobileFlowFieldsVersion")
    @JsonPropertyDescription("version of the mobileFlowFields block")
    private MobileFlowFields.MobileFlowFieldsVersion mobileFlowFieldsVersion;
    /**
     * MSISDN for the subscriber UE used in this flow, as an integer, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("msisdn")
    @JsonPropertyDescription("MSISDN for the subscriber UE used in this flow, as an integer, if the flow connects to a mobile device")
    private String msisdn;
    /**
     * IP address for the other endpoint, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointIpAddress")
    @JsonPropertyDescription("IP address for the other endpoint, as used for the flow being reported on")
    private String otherEndpointIpAddress;
    /**
     * IP Port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointPort")
    @JsonPropertyDescription("IP Port for the reporting entity, as used for the flow being reported on")
    private Integer otherEndpointPort;
    /**
     * Functional role of the other endpoint for the flow being reported on e.g., MME, S-GW, P-GW, PCRF...
     * 
     */
    @JsonProperty("otherFunctionalRole")
    @JsonPropertyDescription("Functional role of the other endpoint for the flow being reported on e.g., MME, S-GW, P-GW, PCRF...")
    private String otherFunctionalRole;
    /**
     * routing area code
     * 
     */
    @JsonProperty("rac")
    @JsonPropertyDescription("routing area code")
    private String rac;
    /**
     * Radio Access Technology e.g., 2G, 3G, LTE
     * 
     */
    @JsonProperty("radioAccessTechnology")
    @JsonPropertyDescription("Radio Access Technology e.g., 2G, 3G, LTE")
    private String radioAccessTechnology;
    /**
     * IP address for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointIpAddr")
    @JsonPropertyDescription("IP address for the reporting entity, as used for the flow being reported on")
    private String reportingEndpointIpAddr;
    /**
     * IP port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointPort")
    @JsonPropertyDescription("IP port for the reporting entity, as used for the flow being reported on")
    private Integer reportingEndpointPort;
    /**
     * service area code
     * 
     */
    @JsonProperty("sac")
    @JsonPropertyDescription("service area code")
    private String sac;
    /**
     * Integer identifier for the sampling algorithm or rule being applied in calculating the flow metrics if metrics are calculated based on a sample of packets, or 0 if no sampling is applied
     * 
     */
    @JsonProperty("samplingAlgorithm")
    @JsonPropertyDescription("Integer identifier for the sampling algorithm or rule being applied in calculating the flow metrics if metrics are calculated based on a sample of packets, or 0 if no sampling is applied")
    private Integer samplingAlgorithm;
    /**
     * transport area code
     * 
     */
    @JsonProperty("tac")
    @JsonPropertyDescription("transport area code")
    private String tac;
    /**
     * tunnel identifier
     * 
     */
    @JsonProperty("tunnelId")
    @JsonPropertyDescription("tunnel identifier")
    private String tunnelId;
    /**
     * VLAN identifier used by this flow
     * 
     */
    @JsonProperty("vlanId")
    @JsonPropertyDescription("VLAN identifier used by this flow")
    private String vlanId;

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public AlarmAdditionalInformation getAdditionalFields() {
        return additionalFields;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(AlarmAdditionalInformation additionalFields) {
        this.additionalFields = additionalFields;
    }

    /**
     * Application type inferred
     * 
     */
    @JsonProperty("applicationType")
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Application type inferred
     * 
     */
    @JsonProperty("applicationType")
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * application protocol
     * 
     */
    @JsonProperty("appProtocolType")
    public String getAppProtocolType() {
        return appProtocolType;
    }

    /**
     * application protocol
     * 
     */
    @JsonProperty("appProtocolType")
    public void setAppProtocolType(String appProtocolType) {
        this.appProtocolType = appProtocolType;
    }

    /**
     * application protocol version
     * 
     */
    @JsonProperty("appProtocolVersion")
    public String getAppProtocolVersion() {
        return appProtocolVersion;
    }

    /**
     * application protocol version
     * 
     */
    @JsonProperty("appProtocolVersion")
    public void setAppProtocolVersion(String appProtocolVersion) {
        this.appProtocolVersion = appProtocolVersion;
    }

    /**
     * cell id
     * 
     */
    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    /**
     * cell id
     * 
     */
    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * Abbreviation referencing a 3GPP reference point e.g., S1-U, S11, etc
     * 
     */
    @JsonProperty("connectionType")
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Abbreviation referencing a 3GPP reference point e.g., S1-U, S11, etc
     * 
     */
    @JsonProperty("connectionType")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * Evolved Cell Global Id
     * 
     */
    @JsonProperty("ecgi")
    public String getEcgi() {
        return ecgi;
    }

    /**
     * Evolved Cell Global Id
     * 
     */
    @JsonProperty("ecgi")
    public void setEcgi(String ecgi) {
        this.ecgi = ecgi;
    }

    /**
     * Flow direction, indicating if the reporting node is the source of the flow or destination for the flow
     * (Required)
     * 
     */
    @JsonProperty("flowDirection")
    public String getFlowDirection() {
        return flowDirection;
    }

    /**
     * Flow direction, indicating if the reporting node is the source of the flow or destination for the flow
     * (Required)
     * 
     */
    @JsonProperty("flowDirection")
    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }

    /**
     * Mobility GTP Protocol per flow metrics
     * (Required)
     * 
     */
    @JsonProperty("gtpPerFlowMetrics")
    public GtpPerFlowMetrics getGtpPerFlowMetrics() {
        return gtpPerFlowMetrics;
    }

    /**
     * Mobility GTP Protocol per flow metrics
     * (Required)
     * 
     */
    @JsonProperty("gtpPerFlowMetrics")
    public void setGtpPerFlowMetrics(GtpPerFlowMetrics gtpPerFlowMetrics) {
        this.gtpPerFlowMetrics = gtpPerFlowMetrics;
    }

    /**
     * GTP protocol
     * 
     */
    @JsonProperty("gtpProtocolType")
    public String getGtpProtocolType() {
        return gtpProtocolType;
    }

    /**
     * GTP protocol
     * 
     */
    @JsonProperty("gtpProtocolType")
    public void setGtpProtocolType(String gtpProtocolType) {
        this.gtpProtocolType = gtpProtocolType;
    }

    /**
     * GTP protocol version
     * 
     */
    @JsonProperty("gtpVersion")
    public String getGtpVersion() {
        return gtpVersion;
    }

    /**
     * GTP protocol version
     * 
     */
    @JsonProperty("gtpVersion")
    public void setGtpVersion(String gtpVersion) {
        this.gtpVersion = gtpVersion;
    }

    /**
     * HTTP request header, if the flow connects to a node referenced by HTTP
     * 
     */
    @JsonProperty("httpHeader")
    public String getHttpHeader() {
        return httpHeader;
    }

    /**
     * HTTP request header, if the flow connects to a node referenced by HTTP
     * 
     */
    @JsonProperty("httpHeader")
    public void setHttpHeader(String httpHeader) {
        this.httpHeader = httpHeader;
    }

    /**
     * IMEI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    /**
     * IMEI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * IMSI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    /**
     * IMSI for the subscriber UE used in this flow, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    /**
     * IP protocol type e.g., TCP, UDP, RTP...
     * (Required)
     * 
     */
    @JsonProperty("ipProtocolType")
    public String getIpProtocolType() {
        return ipProtocolType;
    }

    /**
     * IP protocol type e.g., TCP, UDP, RTP...
     * (Required)
     * 
     */
    @JsonProperty("ipProtocolType")
    public void setIpProtocolType(String ipProtocolType) {
        this.ipProtocolType = ipProtocolType;
    }

    /**
     * IP protocol version e.g., IPv4, IPv6
     * (Required)
     * 
     */
    @JsonProperty("ipVersion")
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * IP protocol version e.g., IPv4, IPv6
     * (Required)
     * 
     */
    @JsonProperty("ipVersion")
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * location area code
     * 
     */
    @JsonProperty("lac")
    public String getLac() {
        return lac;
    }

    /**
     * location area code
     * 
     */
    @JsonProperty("lac")
    public void setLac(String lac) {
        this.lac = lac;
    }

    /**
     * mobile country code
     * 
     */
    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    /**
     * mobile country code
     * 
     */
    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    /**
     * mobile network code
     * 
     */
    @JsonProperty("mnc")
    public String getMnc() {
        return mnc;
    }

    /**
     * mobile network code
     * 
     */
    @JsonProperty("mnc")
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    /**
     * version of the mobileFlowFields block
     * (Required)
     * 
     */
    @JsonProperty("mobileFlowFieldsVersion")
    public MobileFlowFields.MobileFlowFieldsVersion getMobileFlowFieldsVersion() {
        return mobileFlowFieldsVersion;
    }

    /**
     * version of the mobileFlowFields block
     * (Required)
     * 
     */
    @JsonProperty("mobileFlowFieldsVersion")
    public void setMobileFlowFieldsVersion(MobileFlowFields.MobileFlowFieldsVersion mobileFlowFieldsVersion) {
        this.mobileFlowFieldsVersion = mobileFlowFieldsVersion;
    }

    /**
     * MSISDN for the subscriber UE used in this flow, as an integer, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * MSISDN for the subscriber UE used in this flow, as an integer, if the flow connects to a mobile device
     * 
     */
    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     * IP address for the other endpoint, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointIpAddress")
    public String getOtherEndpointIpAddress() {
        return otherEndpointIpAddress;
    }

    /**
     * IP address for the other endpoint, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointIpAddress")
    public void setOtherEndpointIpAddress(String otherEndpointIpAddress) {
        this.otherEndpointIpAddress = otherEndpointIpAddress;
    }

    /**
     * IP Port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointPort")
    public Integer getOtherEndpointPort() {
        return otherEndpointPort;
    }

    /**
     * IP Port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("otherEndpointPort")
    public void setOtherEndpointPort(Integer otherEndpointPort) {
        this.otherEndpointPort = otherEndpointPort;
    }

    /**
     * Functional role of the other endpoint for the flow being reported on e.g., MME, S-GW, P-GW, PCRF...
     * 
     */
    @JsonProperty("otherFunctionalRole")
    public String getOtherFunctionalRole() {
        return otherFunctionalRole;
    }

    /**
     * Functional role of the other endpoint for the flow being reported on e.g., MME, S-GW, P-GW, PCRF...
     * 
     */
    @JsonProperty("otherFunctionalRole")
    public void setOtherFunctionalRole(String otherFunctionalRole) {
        this.otherFunctionalRole = otherFunctionalRole;
    }

    /**
     * routing area code
     * 
     */
    @JsonProperty("rac")
    public String getRac() {
        return rac;
    }

    /**
     * routing area code
     * 
     */
    @JsonProperty("rac")
    public void setRac(String rac) {
        this.rac = rac;
    }

    /**
     * Radio Access Technology e.g., 2G, 3G, LTE
     * 
     */
    @JsonProperty("radioAccessTechnology")
    public String getRadioAccessTechnology() {
        return radioAccessTechnology;
    }

    /**
     * Radio Access Technology e.g., 2G, 3G, LTE
     * 
     */
    @JsonProperty("radioAccessTechnology")
    public void setRadioAccessTechnology(String radioAccessTechnology) {
        this.radioAccessTechnology = radioAccessTechnology;
    }

    /**
     * IP address for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointIpAddr")
    public String getReportingEndpointIpAddr() {
        return reportingEndpointIpAddr;
    }

    /**
     * IP address for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointIpAddr")
    public void setReportingEndpointIpAddr(String reportingEndpointIpAddr) {
        this.reportingEndpointIpAddr = reportingEndpointIpAddr;
    }

    /**
     * IP port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointPort")
    public Integer getReportingEndpointPort() {
        return reportingEndpointPort;
    }

    /**
     * IP port for the reporting entity, as used for the flow being reported on
     * (Required)
     * 
     */
    @JsonProperty("reportingEndpointPort")
    public void setReportingEndpointPort(Integer reportingEndpointPort) {
        this.reportingEndpointPort = reportingEndpointPort;
    }

    /**
     * service area code
     * 
     */
    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    /**
     * service area code
     * 
     */
    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    /**
     * Integer identifier for the sampling algorithm or rule being applied in calculating the flow metrics if metrics are calculated based on a sample of packets, or 0 if no sampling is applied
     * 
     */
    @JsonProperty("samplingAlgorithm")
    public Integer getSamplingAlgorithm() {
        return samplingAlgorithm;
    }

    /**
     * Integer identifier for the sampling algorithm or rule being applied in calculating the flow metrics if metrics are calculated based on a sample of packets, or 0 if no sampling is applied
     * 
     */
    @JsonProperty("samplingAlgorithm")
    public void setSamplingAlgorithm(Integer samplingAlgorithm) {
        this.samplingAlgorithm = samplingAlgorithm;
    }

    /**
     * transport area code
     * 
     */
    @JsonProperty("tac")
    public String getTac() {
        return tac;
    }

    /**
     * transport area code
     * 
     */
    @JsonProperty("tac")
    public void setTac(String tac) {
        this.tac = tac;
    }

    /**
     * tunnel identifier
     * 
     */
    @JsonProperty("tunnelId")
    public String getTunnelId() {
        return tunnelId;
    }

    /**
     * tunnel identifier
     * 
     */
    @JsonProperty("tunnelId")
    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * VLAN identifier used by this flow
     * 
     */
    @JsonProperty("vlanId")
    public String getVlanId() {
        return vlanId;
    }

    /**
     * VLAN identifier used by this flow
     * 
     */
    @JsonProperty("vlanId")
    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(applicationType).append(appProtocolType).append(appProtocolVersion).append(cid).append(connectionType).append(ecgi).append(flowDirection).append(gtpPerFlowMetrics).append(gtpProtocolType).append(gtpVersion).append(httpHeader).append(imei).append(imsi).append(ipProtocolType).append(ipVersion).append(lac).append(mcc).append(mnc).append(mobileFlowFieldsVersion).append(msisdn).append(otherEndpointIpAddress).append(otherEndpointPort).append(otherFunctionalRole).append(rac).append(radioAccessTechnology).append(reportingEndpointIpAddr).append(reportingEndpointPort).append(sac).append(samplingAlgorithm).append(tac).append(tunnelId).append(vlanId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobileFlowFields) == false) {
            return false;
        }
        MobileFlowFields rhs = ((MobileFlowFields) other);
        return new EqualsBuilder().append(additionalFields, rhs.additionalFields).append(applicationType, rhs.applicationType).append(appProtocolType, rhs.appProtocolType).append(appProtocolVersion, rhs.appProtocolVersion).append(cid, rhs.cid).append(connectionType, rhs.connectionType).append(ecgi, rhs.ecgi).append(flowDirection, rhs.flowDirection).append(gtpPerFlowMetrics, rhs.gtpPerFlowMetrics).append(gtpProtocolType, rhs.gtpProtocolType).append(gtpVersion, rhs.gtpVersion).append(httpHeader, rhs.httpHeader).append(imei, rhs.imei).append(imsi, rhs.imsi).append(ipProtocolType, rhs.ipProtocolType).append(ipVersion, rhs.ipVersion).append(lac, rhs.lac).append(mcc, rhs.mcc).append(mnc, rhs.mnc).append(mobileFlowFieldsVersion, rhs.mobileFlowFieldsVersion).append(msisdn, rhs.msisdn).append(otherEndpointIpAddress, rhs.otherEndpointIpAddress).append(otherEndpointPort, rhs.otherEndpointPort).append(otherFunctionalRole, rhs.otherFunctionalRole).append(rac, rhs.rac).append(radioAccessTechnology, rhs.radioAccessTechnology).append(reportingEndpointIpAddr, rhs.reportingEndpointIpAddr).append(reportingEndpointPort, rhs.reportingEndpointPort).append(sac, rhs.sac).append(samplingAlgorithm, rhs.samplingAlgorithm).append(tac, rhs.tac).append(tunnelId, rhs.tunnelId).append(vlanId, rhs.vlanId).isEquals();
    }

    public enum MobileFlowFieldsVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, MobileFlowFields.MobileFlowFieldsVersion> CONSTANTS = new HashMap<String, MobileFlowFields.MobileFlowFieldsVersion>();

        static {
            for (MobileFlowFields.MobileFlowFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MobileFlowFieldsVersion(String value) {
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
        public static MobileFlowFields.MobileFlowFieldsVersion fromValue(String value) {
            MobileFlowFields.MobileFlowFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
