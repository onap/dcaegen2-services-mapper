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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * sysLog fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalFields", "eventSourceHost", "eventSourceType", "syslogFacility",
        "syslogFieldsVersion", "syslogMsg", "syslogPri", "syslogProc", "syslogProcId",
        "syslogSData", "syslogSdId", "syslogSev", "syslogTag", "syslogVer"})
public class SyslogFields {
    
    /**
     * additional syslog fields if needed provided as name=value delimited by a pipe ‘|’ symbol, for
     * example: 'name1=value1|name2=value2|…'
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("additional syslog fields if needed provided as name=value delimited by a pipe \u2018|\u2019 symbol, for example: 'name1=value1|name2=value2|\u2026'")
    private String additionalFields;
    /**
     * hostname of the device
     * 
     */
    @JsonProperty("eventSourceHost")
    @JsonPropertyDescription("hostname of the device")
    private String eventSourceHost;
    /**
     * type of event source; examples: other, router, switch, host, card, port, slotThreshold,
     * portThreshold, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    @JsonPropertyDescription("type of event source; examples: other, router, switch, host, card, port, slotThreshold, portThreshold, virtualMachine, virtualNetworkFunction")
    private String eventSourceType;
    /**
     * numeric code from 0 to 23 for facility--see table in documentation
     * 
     */
    @JsonProperty("syslogFacility")
    @JsonPropertyDescription("numeric code from 0 to 23 for facility--see table in documentation")
    private Integer syslogFacility;
    /**
     * version of the syslogFields block (Required)
     * 
     */
    @JsonProperty("syslogFieldsVersion")
    @JsonPropertyDescription("version of the syslogFields block")
    private Double syslogFieldsVersion;
    /**
     * syslog message (Required)
     * 
     */
    @JsonProperty("syslogMsg")
    @JsonPropertyDescription("syslog message")
    private String syslogMsg;
    /**
     * 0-192 combined severity and facility
     * 
     */
    @JsonProperty("syslogPri")
    @JsonPropertyDescription("0-192 combined severity and facility")
    private Integer syslogPri;
    /**
     * identifies the application that originated the message
     * 
     */
    @JsonProperty("syslogProc")
    @JsonPropertyDescription("identifies the application that originated the message")
    private String syslogProc;
    /**
     * a change in the value of this field indicates a discontinuity in syslog reporting
     * 
     */
    @JsonProperty("syslogProcId")
    @JsonPropertyDescription("a change in the value of this field indicates a discontinuity in syslog reporting")
    private Double syslogProcId;
    /**
     * syslog structured data consisting of a structured data Id followed by a set of key value
     * pairs
     * 
     */
    @JsonProperty("syslogSData")
    @JsonPropertyDescription("syslog structured data consisting of a structured data Id followed by a set of key value pairs")
    private String syslogSData;
    /**
     * 0-32 char in format name@number for example ourSDID@32473
     * 
     */
    @JsonProperty("syslogSdId")
    @JsonPropertyDescription("0-32 char in format name@number for example ourSDID@32473")
    private String syslogSdId;
    /**
     * numerical Code for severity derived from syslogPri as remaider of syslogPri / 8
     * 
     */
    @JsonProperty("syslogSev")
    @JsonPropertyDescription("numerical Code for  severity derived from syslogPri as remaider of syslogPri / 8")
    private SyslogFields.SyslogSev syslogSev;
    /**
     * msgId indicating the type of message such as TCPOUT or TCPIN; NILVALUE should be used when no
     * other value can be provided (Required)
     * 
     */
    @JsonProperty("syslogTag")
    @JsonPropertyDescription("msgId indicating the type of message such as TCPOUT or TCPIN; NILVALUE should be used when no other value can be provided")
    private String syslogTag;
    /**
     * IANA assigned version of the syslog protocol specification - typically 1
     * 
     */
    @JsonProperty("syslogVer")
    @JsonPropertyDescription("IANA assigned version of the syslog protocol specification - typically 1")
    private Double syslogVer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional syslog fields if needed provided as name=value delimited by a pipe ‘|’ symbol, for
     * example: 'name1=value1|name2=value2|…'
     * 
     */
    @JsonProperty("additionalFields")
    public String getAdditionalFields() {
        return additionalFields;
    }
    
    /**
     * additional syslog fields if needed provided as name=value delimited by a pipe ‘|’ symbol, for
     * example: 'name1=value1|name2=value2|…'
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(String additionalFields) {
        this.additionalFields = additionalFields;
    }
    
    /**
     * hostname of the device
     * 
     */
    @JsonProperty("eventSourceHost")
    public String getEventSourceHost() {
        return eventSourceHost;
    }
    
    /**
     * hostname of the device
     * 
     */
    @JsonProperty("eventSourceHost")
    public void setEventSourceHost(String eventSourceHost) {
        this.eventSourceHost = eventSourceHost;
    }
    
    /**
     * type of event source; examples: other, router, switch, host, card, port, slotThreshold,
     * portThreshold, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public String getEventSourceType() {
        return eventSourceType;
    }
    
    /**
     * type of event source; examples: other, router, switch, host, card, port, slotThreshold,
     * portThreshold, virtualMachine, virtualNetworkFunction (Required)
     * 
     */
    @JsonProperty("eventSourceType")
    public void setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
    }
    
    /**
     * numeric code from 0 to 23 for facility--see table in documentation
     * 
     */
    @JsonProperty("syslogFacility")
    public Integer getSyslogFacility() {
        return syslogFacility;
    }
    
    /**
     * numeric code from 0 to 23 for facility--see table in documentation
     * 
     */
    @JsonProperty("syslogFacility")
    public void setSyslogFacility(Integer syslogFacility) {
        this.syslogFacility = syslogFacility;
    }
    
    /**
     * version of the syslogFields block (Required)
     * 
     */
    @JsonProperty("syslogFieldsVersion")
    public Double getSyslogFieldsVersion() {
        return syslogFieldsVersion;
    }
    
    /**
     * version of the syslogFields block (Required)
     * 
     */
    @JsonProperty("syslogFieldsVersion")
    public void setSyslogFieldsVersion(Double syslogFieldsVersion) {
        this.syslogFieldsVersion = syslogFieldsVersion;
    }
    
    /**
     * syslog message (Required)
     * 
     */
    @JsonProperty("syslogMsg")
    public String getSyslogMsg() {
        return syslogMsg;
    }
    
    /**
     * syslog message (Required)
     * 
     */
    @JsonProperty("syslogMsg")
    public void setSyslogMsg(String syslogMsg) {
        this.syslogMsg = syslogMsg;
    }
    
    /**
     * 0-192 combined severity and facility
     * 
     */
    @JsonProperty("syslogPri")
    public Integer getSyslogPri() {
        return syslogPri;
    }
    
    /**
     * 0-192 combined severity and facility
     * 
     */
    @JsonProperty("syslogPri")
    public void setSyslogPri(Integer syslogPri) {
        this.syslogPri = syslogPri;
    }
    
    /**
     * identifies the application that originated the message
     * 
     */
    @JsonProperty("syslogProc")
    public String getSyslogProc() {
        return syslogProc;
    }
    
    /**
     * identifies the application that originated the message
     * 
     */
    @JsonProperty("syslogProc")
    public void setSyslogProc(String syslogProc) {
        this.syslogProc = syslogProc;
    }
    
    /**
     * a change in the value of this field indicates a discontinuity in syslog reporting
     * 
     */
    @JsonProperty("syslogProcId")
    public Double getSyslogProcId() {
        return syslogProcId;
    }
    
    /**
     * a change in the value of this field indicates a discontinuity in syslog reporting
     * 
     */
    @JsonProperty("syslogProcId")
    public void setSyslogProcId(Double syslogProcId) {
        this.syslogProcId = syslogProcId;
    }
    
    /**
     * syslog structured data consisting of a structured data Id followed by a set of key value
     * pairs
     * 
     */
    @JsonProperty("syslogSData")
    public String getSyslogSData() {
        return syslogSData;
    }
    
    /**
     * syslog structured data consisting of a structured data Id followed by a set of key value
     * pairs
     * 
     */
    @JsonProperty("syslogSData")
    public void setSyslogSData(String syslogSData) {
        this.syslogSData = syslogSData;
    }
    
    /**
     * 0-32 char in format name@number for example ourSDID@32473
     * 
     */
    @JsonProperty("syslogSdId")
    public String getSyslogSdId() {
        return syslogSdId;
    }
    
    /**
     * 0-32 char in format name@number for example ourSDID@32473
     * 
     */
    @JsonProperty("syslogSdId")
    public void setSyslogSdId(String syslogSdId) {
        this.syslogSdId = syslogSdId;
    }
    
    /**
     * numerical Code for severity derived from syslogPri as remaider of syslogPri / 8
     * 
     */
    @JsonProperty("syslogSev")
    public SyslogFields.SyslogSev getSyslogSev() {
        return syslogSev;
    }
    
    /**
     * numerical Code for severity derived from syslogPri as remaider of syslogPri / 8
     * 
     */
    @JsonProperty("syslogSev")
    public void setSyslogSev(SyslogFields.SyslogSev syslogSev) {
        this.syslogSev = syslogSev;
    }
    
    /**
     * msgId indicating the type of message such as TCPOUT or TCPIN; NILVALUE should be used when no
     * other value can be provided (Required)
     * 
     */
    @JsonProperty("syslogTag")
    public String getSyslogTag() {
        return syslogTag;
    }
    
    /**
     * msgId indicating the type of message such as TCPOUT or TCPIN; NILVALUE should be used when no
     * other value can be provided (Required)
     * 
     */
    @JsonProperty("syslogTag")
    public void setSyslogTag(String syslogTag) {
        this.syslogTag = syslogTag;
    }
    
    /**
     * IANA assigned version of the syslog protocol specification - typically 1
     * 
     */
    @JsonProperty("syslogVer")
    public Double getSyslogVer() {
        return syslogVer;
    }
    
    /**
     * IANA assigned version of the syslog protocol specification - typically 1
     * 
     */
    @JsonProperty("syslogVer")
    public void setSyslogVer(Double syslogVer) {
        this.syslogVer = syslogVer;
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
        return new HashCodeBuilder().append(additionalFields).append(eventSourceHost)
                .append(eventSourceType).append(syslogFacility).append(syslogFieldsVersion)
                .append(syslogMsg).append(syslogPri).append(syslogProc).append(syslogProcId)
                .append(syslogSData).append(syslogSdId).append(syslogSev).append(syslogTag)
                .append(syslogVer).append(additionalProperties).toHashCode();
    }
    
    
    
    public enum SyslogSev {
        
        ALERT("Alert"), CRITICAL("Critical"), DEBUG("Debug"), EMERGENCY("Emergency"), ERROR(
                "Error"), INFO("Info"), NOTICE("Notice"), WARNING("Warning");
        private final String value;
        private final static Map<String, SyslogFields.SyslogSev> CONSTANTS =
                new HashMap<String, SyslogFields.SyslogSev>();
        
        static {
            for (SyslogFields.SyslogSev c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private SyslogSev(String value) {
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
        public static SyslogFields.SyslogSev fromValue(String value) {
            SyslogFields.SyslogSev constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
