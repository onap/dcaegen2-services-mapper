
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "eventSourceType",
    "syslogFieldsVersion",
    "syslogMsg",
    "syslogTag",
    "additionalFields",
    "eventSourceHost",
    "syslogFacility",
    "syslogPri",
    "syslogProc",
    "syslogProcId",
    "syslogSData",
    "syslogSdId",
    "syslogSev",
    "syslogVer"
})
public class SyslogFields {

    @JsonProperty("eventSourceType")
    private String eventSourceType;
    @JsonProperty("syslogFieldsVersion")
    private Double syslogFieldsVersion;
    @JsonProperty("syslogMsg")
    private String syslogMsg;
    @JsonProperty("syslogTag")
    private String syslogTag;
    @JsonProperty("additionalFields")
    private String additionalFields;
    @JsonProperty("eventSourceHost")
    private String eventSourceHost;
    @JsonProperty("syslogFacility")
    private Long syslogFacility;
    @JsonProperty("syslogPri")
    private Long syslogPri;
    @JsonProperty("syslogProc")
    private String syslogProc;
    @JsonProperty("syslogProcId")
    private Double syslogProcId;
    @JsonProperty("syslogSData")
    private String syslogSData;
    @JsonProperty("syslogSdId")
    private String syslogSdId;
    @JsonProperty("syslogSev")
    private String syslogSev;
    @JsonProperty("syslogVer")
    private Double syslogVer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eventSourceType")
    public String getEventSourceType() {
        return eventSourceType;
    }

    @JsonProperty("eventSourceType")
    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    @JsonProperty("syslogFieldsVersion")
    public Double getSyslogFieldsVersion() {
        return syslogFieldsVersion;
    }

    @JsonProperty("syslogFieldsVersion")
    public void setSyslogFieldsVersion(Double syslogFieldsVersion) {
        this.syslogFieldsVersion = syslogFieldsVersion;
    }

    @JsonProperty("syslogMsg")
    public String getSyslogMsg() {
        return syslogMsg;
    }

    @JsonProperty("syslogMsg")
    public void setSyslogMsg(String syslogMsg) {
        this.syslogMsg = syslogMsg;
    }

    @JsonProperty("syslogTag")
    public String getSyslogTag() {
        return syslogTag;
    }

    @JsonProperty("syslogTag")
    public void setSyslogTag(String syslogTag) {
        this.syslogTag = syslogTag;
    }

    @JsonProperty("additionalFields")
    public String getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(String additionalFields) {
        this.additionalFields = additionalFields;
    }

    @JsonProperty("eventSourceHost")
    public String getEventSourceHost() {
        return eventSourceHost;
    }

    @JsonProperty("eventSourceHost")
    public void setEventSourceHost(String eventSourceHost) {
        this.eventSourceHost = eventSourceHost;
    }

    @JsonProperty("syslogFacility")
    public Long getSyslogFacility() {
        return syslogFacility;
    }

    @JsonProperty("syslogFacility")
    public void setSyslogFacility(Long syslogFacility) {
        this.syslogFacility = syslogFacility;
    }

    @JsonProperty("syslogPri")
    public Long getSyslogPri() {
        return syslogPri;
    }

    @JsonProperty("syslogPri")
    public void setSyslogPri(Long syslogPri) {
        this.syslogPri = syslogPri;
    }

    @JsonProperty("syslogProc")
    public String getSyslogProc() {
        return syslogProc;
    }

    @JsonProperty("syslogProc")
    public void setSyslogProc(String syslogProc) {
        this.syslogProc = syslogProc;
    }

    @JsonProperty("syslogProcId")
    public Double getSyslogProcId() {
        return syslogProcId;
    }

    @JsonProperty("syslogProcId")
    public void setSyslogProcId(Double syslogProcId) {
        this.syslogProcId = syslogProcId;
    }

    @JsonProperty("syslogSData")
    public String getSyslogSData() {
        return syslogSData;
    }

    @JsonProperty("syslogSData")
    public void setSyslogSData(String syslogSData) {
        this.syslogSData = syslogSData;
    }

    @JsonProperty("syslogSdId")
    public String getSyslogSdId() {
        return syslogSdId;
    }

    @JsonProperty("syslogSdId")
    public void setSyslogSdId(String syslogSdId) {
        this.syslogSdId = syslogSdId;
    }

    @JsonProperty("syslogSev")
    public String getSyslogSev() {
        return syslogSev;
    }

    @JsonProperty("syslogSev")
    public void setSyslogSev(String syslogSev) {
        this.syslogSev = syslogSev;
    }

    @JsonProperty("syslogVer")
    public Double getSyslogVer() {
        return syslogVer;
    }

    @JsonProperty("syslogVer")
    public void setSyslogVer(Double syslogVer) {
        this.syslogVer = syslogVer;
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
