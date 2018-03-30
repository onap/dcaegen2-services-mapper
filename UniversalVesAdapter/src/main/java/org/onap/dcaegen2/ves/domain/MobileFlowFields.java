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
    "flowDirection",
    "gtpPerFlowMetrics",
    "ipProtocolType",
    "ipVersion",
    "mobileFlowFieldsVersion",
    "otherEndpointIpAddress",
    "otherEndpointPort",
    "reportingEndpointIpAddr",
    "reportingEndpointPort",
    "additionalFields",
    "applicationType",
    "appProtocolType",
    "appProtocolVersion",
    "cid",
    "connectionType",
    "ecgi",
    "gtpProtocolType",
    "gtpVersion",
    "httpHeader",
    "imei",
    "imsi",
    "lac",
    "mcc",
    "mnc",
    "msisdn",
    "otherFunctionalRole",
    "rac",
    "radioAccessTechnology",
    "sac",
    "samplingAlgorithm",
    "tac",
    "tunnelId",
    "vlanId"
})
public class MobileFlowFields {

    @JsonProperty("flowDirection")
    private String flowDirection;
    @JsonProperty("gtpPerFlowMetrics")
    private GtpPerFlowMetrics gtpPerFlowMetrics;
    @JsonProperty("ipProtocolType")
    private String ipProtocolType;
    @JsonProperty("ipVersion")
    private String ipVersion;
    @JsonProperty("mobileFlowFieldsVersion")
    private Double mobileFlowFieldsVersion;
    @JsonProperty("otherEndpointIpAddress")
    private String otherEndpointIpAddress;
    @JsonProperty("otherEndpointPort")
    private Long otherEndpointPort;
    @JsonProperty("reportingEndpointIpAddr")
    private String reportingEndpointIpAddr;
    @JsonProperty("reportingEndpointPort")
    private Long reportingEndpointPort;
    @JsonProperty("additionalFields")
    private List<AdditionalField> additionalFields = null;
    @JsonProperty("applicationType")
    private String applicationType;
    @JsonProperty("appProtocolType")
    private String appProtocolType;
    @JsonProperty("appProtocolVersion")
    private String appProtocolVersion;
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("connectionType")
    private String connectionType;
    @JsonProperty("ecgi")
    private String ecgi;
    @JsonProperty("gtpProtocolType")
    private String gtpProtocolType;
    @JsonProperty("gtpVersion")
    private String gtpVersion;
    @JsonProperty("httpHeader")
    private String httpHeader;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("lac")
    private String lac;
    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("mnc")
    private String mnc;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("otherFunctionalRole")
    private String otherFunctionalRole;
    @JsonProperty("rac")
    private String rac;
    @JsonProperty("radioAccessTechnology")
    private String radioAccessTechnology;
    @JsonProperty("sac")
    private String sac;
    @JsonProperty("samplingAlgorithm")
    private Long samplingAlgorithm;
    @JsonProperty("tac")
    private String tac;
    @JsonProperty("tunnelId")
    private String tunnelId;
    @JsonProperty("vlanId")
    private String vlanId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flowDirection")
    public String getFlowDirection() {
        return flowDirection;
    }

    @JsonProperty("flowDirection")
    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }

    @JsonProperty("gtpPerFlowMetrics")
    public GtpPerFlowMetrics getGtpPerFlowMetrics() {
        return gtpPerFlowMetrics;
    }

    @JsonProperty("gtpPerFlowMetrics")
    public void setGtpPerFlowMetrics(GtpPerFlowMetrics gtpPerFlowMetrics) {
        this.gtpPerFlowMetrics = gtpPerFlowMetrics;
    }

    @JsonProperty("ipProtocolType")
    public String getIpProtocolType() {
        return ipProtocolType;
    }

    @JsonProperty("ipProtocolType")
    public void setIpProtocolType(String ipProtocolType) {
        this.ipProtocolType = ipProtocolType;
    }

    @JsonProperty("ipVersion")
    public String getIpVersion() {
        return ipVersion;
    }

    @JsonProperty("ipVersion")
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    @JsonProperty("mobileFlowFieldsVersion")
    public Double getMobileFlowFieldsVersion() {
        return mobileFlowFieldsVersion;
    }

    @JsonProperty("mobileFlowFieldsVersion")
    public void setMobileFlowFieldsVersion(Double mobileFlowFieldsVersion) {
        this.mobileFlowFieldsVersion = mobileFlowFieldsVersion;
    }

    @JsonProperty("otherEndpointIpAddress")
    public String getOtherEndpointIpAddress() {
        return otherEndpointIpAddress;
    }

    @JsonProperty("otherEndpointIpAddress")
    public void setOtherEndpointIpAddress(String otherEndpointIpAddress) {
        this.otherEndpointIpAddress = otherEndpointIpAddress;
    }

    @JsonProperty("otherEndpointPort")
    public Long getOtherEndpointPort() {
        return otherEndpointPort;
    }

    @JsonProperty("otherEndpointPort")
    public void setOtherEndpointPort(Long otherEndpointPort) {
        this.otherEndpointPort = otherEndpointPort;
    }

    @JsonProperty("reportingEndpointIpAddr")
    public String getReportingEndpointIpAddr() {
        return reportingEndpointIpAddr;
    }

    @JsonProperty("reportingEndpointIpAddr")
    public void setReportingEndpointIpAddr(String reportingEndpointIpAddr) {
        this.reportingEndpointIpAddr = reportingEndpointIpAddr;
    }

    @JsonProperty("reportingEndpointPort")
    public Long getReportingEndpointPort() {
        return reportingEndpointPort;
    }

    @JsonProperty("reportingEndpointPort")
    public void setReportingEndpointPort(Long reportingEndpointPort) {
        this.reportingEndpointPort = reportingEndpointPort;
    }

    @JsonProperty("additionalFields")
    public List<AdditionalField> getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AdditionalField> additionalFields) {
        this.additionalFields = additionalFields;
    }

    @JsonProperty("applicationType")
    public String getApplicationType() {
        return applicationType;
    }

    @JsonProperty("applicationType")
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    @JsonProperty("appProtocolType")
    public String getAppProtocolType() {
        return appProtocolType;
    }

    @JsonProperty("appProtocolType")
    public void setAppProtocolType(String appProtocolType) {
        this.appProtocolType = appProtocolType;
    }

    @JsonProperty("appProtocolVersion")
    public String getAppProtocolVersion() {
        return appProtocolVersion;
    }

    @JsonProperty("appProtocolVersion")
    public void setAppProtocolVersion(String appProtocolVersion) {
        this.appProtocolVersion = appProtocolVersion;
    }

    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
    }

    @JsonProperty("connectionType")
    public String getConnectionType() {
        return connectionType;
    }

    @JsonProperty("connectionType")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @JsonProperty("ecgi")
    public String getEcgi() {
        return ecgi;
    }

    @JsonProperty("ecgi")
    public void setEcgi(String ecgi) {
        this.ecgi = ecgi;
    }

    @JsonProperty("gtpProtocolType")
    public String getGtpProtocolType() {
        return gtpProtocolType;
    }

    @JsonProperty("gtpProtocolType")
    public void setGtpProtocolType(String gtpProtocolType) {
        this.gtpProtocolType = gtpProtocolType;
    }

    @JsonProperty("gtpVersion")
    public String getGtpVersion() {
        return gtpVersion;
    }

    @JsonProperty("gtpVersion")
    public void setGtpVersion(String gtpVersion) {
        this.gtpVersion = gtpVersion;
    }

    @JsonProperty("httpHeader")
    public String getHttpHeader() {
        return httpHeader;
    }

    @JsonProperty("httpHeader")
    public void setHttpHeader(String httpHeader) {
        this.httpHeader = httpHeader;
    }

    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("lac")
    public String getLac() {
        return lac;
    }

    @JsonProperty("lac")
    public void setLac(String lac) {
        this.lac = lac;
    }

    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    @JsonProperty("mnc")
    public String getMnc() {
        return mnc;
    }

    @JsonProperty("mnc")
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("otherFunctionalRole")
    public String getOtherFunctionalRole() {
        return otherFunctionalRole;
    }

    @JsonProperty("otherFunctionalRole")
    public void setOtherFunctionalRole(String otherFunctionalRole) {
        this.otherFunctionalRole = otherFunctionalRole;
    }

    @JsonProperty("rac")
    public String getRac() {
        return rac;
    }

    @JsonProperty("rac")
    public void setRac(String rac) {
        this.rac = rac;
    }

    @JsonProperty("radioAccessTechnology")
    public String getRadioAccessTechnology() {
        return radioAccessTechnology;
    }

    @JsonProperty("radioAccessTechnology")
    public void setRadioAccessTechnology(String radioAccessTechnology) {
        this.radioAccessTechnology = radioAccessTechnology;
    }

    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    @JsonProperty("samplingAlgorithm")
    public Long getSamplingAlgorithm() {
        return samplingAlgorithm;
    }

    @JsonProperty("samplingAlgorithm")
    public void setSamplingAlgorithm(Long samplingAlgorithm) {
        this.samplingAlgorithm = samplingAlgorithm;
    }

    @JsonProperty("tac")
    public String getTac() {
        return tac;
    }

    @JsonProperty("tac")
    public void setTac(String tac) {
        this.tac = tac;
    }

    @JsonProperty("tunnelId")
    public String getTunnelId() {
        return tunnelId;
    }

    @JsonProperty("tunnelId")
    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    @JsonProperty("vlanId")
    public String getVlanId() {
        return vlanId;
    }

    @JsonProperty("vlanId")
    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
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
        return new ToStringBuilder(this).append("flowDirection", flowDirection).append("gtpPerFlowMetrics", gtpPerFlowMetrics).append("ipProtocolType", ipProtocolType).append("ipVersion", ipVersion).append("mobileFlowFieldsVersion", mobileFlowFieldsVersion).append("otherEndpointIpAddress", otherEndpointIpAddress).append("otherEndpointPort", otherEndpointPort).append("reportingEndpointIpAddr", reportingEndpointIpAddr).append("reportingEndpointPort", reportingEndpointPort).append("additionalFields", additionalFields).append("applicationType", applicationType).append("appProtocolType", appProtocolType).append("appProtocolVersion", appProtocolVersion).append("cid", cid).append("connectionType", connectionType).append("ecgi", ecgi).append("gtpProtocolType", gtpProtocolType).append("gtpVersion", gtpVersion).append("httpHeader", httpHeader).append("imei", imei).append("imsi", imsi).append("lac", lac).append("mcc", mcc).append("mnc", mnc).append("msisdn", msisdn).append("otherFunctionalRole", otherFunctionalRole).append("rac", rac).append("radioAccessTechnology", radioAccessTechnology).append("sac", sac).append("samplingAlgorithm", samplingAlgorithm).append("tac", tac).append("tunnelId", tunnelId).append("vlanId", vlanId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sac).append(mcc).append(samplingAlgorithm).append(tac).append(applicationType).append(gtpPerFlowMetrics).append(vlanId).append(radioAccessTechnology).append(lac).append(flowDirection).append(httpHeader).append(mnc).append(additionalFields).append(reportingEndpointIpAddr).append(appProtocolVersion).append(msisdn).append(tunnelId).append(imei).append(ipVersion).append(gtpProtocolType).append(reportingEndpointPort).append(otherEndpointPort).append(connectionType).append(ecgi).append(gtpVersion).append(cid).append(ipProtocolType).append(mobileFlowFieldsVersion).append(additionalProperties).append(imsi).append(otherFunctionalRole).append(otherEndpointIpAddress).append(appProtocolType).append(rac).toHashCode();
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
        return new EqualsBuilder().append(sac, rhs.sac).append(mcc, rhs.mcc).append(samplingAlgorithm, rhs.samplingAlgorithm).append(tac, rhs.tac).append(applicationType, rhs.applicationType).append(gtpPerFlowMetrics, rhs.gtpPerFlowMetrics).append(vlanId, rhs.vlanId).append(radioAccessTechnology, rhs.radioAccessTechnology).append(lac, rhs.lac).append(flowDirection, rhs.flowDirection).append(httpHeader, rhs.httpHeader).append(mnc, rhs.mnc).append(additionalFields, rhs.additionalFields).append(reportingEndpointIpAddr, rhs.reportingEndpointIpAddr).append(appProtocolVersion, rhs.appProtocolVersion).append(msisdn, rhs.msisdn).append(tunnelId, rhs.tunnelId).append(imei, rhs.imei).append(ipVersion, rhs.ipVersion).append(gtpProtocolType, rhs.gtpProtocolType).append(reportingEndpointPort, rhs.reportingEndpointPort).append(otherEndpointPort, rhs.otherEndpointPort).append(connectionType, rhs.connectionType).append(ecgi, rhs.ecgi).append(gtpVersion, rhs.gtpVersion).append(cid, rhs.cid).append(ipProtocolType, rhs.ipProtocolType).append(mobileFlowFieldsVersion, rhs.mobileFlowFieldsVersion).append(additionalProperties, rhs.additionalProperties).append(imsi, rhs.imsi).append(otherFunctionalRole, rhs.otherFunctionalRole).append(otherEndpointIpAddress, rhs.otherEndpointIpAddress).append(appProtocolType, rhs.appProtocolType).append(rac, rhs.rac).isEquals();
    }

}
