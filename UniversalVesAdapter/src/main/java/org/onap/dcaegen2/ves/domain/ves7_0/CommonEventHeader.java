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
package org.onap.dcaegen2.ves.domain.ves7_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;



/**
 * fields common to all events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domain",
    "eventId",
    "eventName",
    "eventType",
    "internalHeaderFields",
    "lastEpochMicrosec",
    "nfcNamingCode",
    "nfNamingCode",
    "nfVendorName",
    "priority",
    "reportingEntityId",
    "reportingEntityName",
    "sequence",
    "sourceId",
    "sourceName",
    "startEpochMicrosec",
    "timeZoneOffset",
    "version",
    "vesEventListenerVersion"
})
public class CommonEventHeader {

	
	
    /**
     * the eventing domain associated with the event
     * (Required)
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("the eventing domain associated with the event")
    private CommonEventHeader.Domain domain;
    /**
     * event key that is unique to the event source
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    @JsonPropertyDescription("event key that is unique to the event source")
    private String eventId;
    /**
     * unique event name
     * (Required)
     * 
     */
    @JsonProperty("eventName")
    @JsonPropertyDescription("unique event name")
    private String eventName;
    /**
     * for example - applicationNf, guestOS, hostOS, platform
     * 
     */
    @JsonProperty("eventType")
    @JsonPropertyDescription("for example - applicationNf, guestOS, hostOS, platform")
    private String eventType;
    /**
     * enrichment fields for internal VES Event Listener service use only, not supplied by event sources
     * 
     */
    @JsonProperty("internalHeaderFields")
    @JsonPropertyDescription("enrichment fields for internal VES Event Listener service use only, not supplied by event sources")
    private InternalHeaderFields internalHeaderFields;
    /**
     * the latest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("lastEpochMicrosec")
    @JsonPropertyDescription("the latest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds")
    private Double lastEpochMicrosec;
    /**
     *  3 character network function component type, aligned with vfc naming standards
     * 
     */
    @JsonProperty("nfcNamingCode")
    @JsonPropertyDescription("3 character network function component type, aligned with vfc naming standards")
    private String nfcNamingCode;
    /**
     *  4 character network function type, aligned with nf naming standards
     * 
     */
    @JsonProperty("nfNamingCode")
    @JsonPropertyDescription("4 character network function type, aligned with nf naming standards")
    private String nfNamingCode;
    /**
     * network function vendor name
     * 
     */
    @JsonProperty("nfVendorName")
    @JsonPropertyDescription("network function vendor name")
    private String nfVendorName;
    /**
     * processing priority
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("processing priority")
    private CommonEventHeader.Priority priority;
    /**
     * UUID identifying the entity reporting the event, for example an OAM VM; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("reportingEntityId")
    @JsonPropertyDescription("UUID identifying the entity reporting the event, for example an OAM VM; must be populated by the ATT enrichment process")
    private String reportingEntityId;
    /**
     * name of the entity reporting the event, for example, an EMS name; may be the same as sourceName
     * (Required)
     * 
     */
    @JsonProperty("reportingEntityName")
    @JsonPropertyDescription("name of the entity reporting the event, for example, an EMS name; may be the same as sourceName")
    private String reportingEntityName;
    /**
     * ordering of events communicated by an event source instance or 0 if not needed
     * (Required)
     * 
     */
    @JsonProperty("sequence")
    @JsonPropertyDescription("ordering of events communicated by an event source instance or 0 if not needed")
    private Integer sequence;
    /**
     * UUID identifying the entity experiencing the event issue; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("sourceId")
    @JsonPropertyDescription("UUID identifying the entity experiencing the event issue; must be populated by the ATT enrichment process")
    private String sourceId;
    /**
     * name of the entity experiencing the event issue
     * (Required)
     * 
     */
    @JsonProperty("sourceName")
    @JsonPropertyDescription("name of the entity experiencing the event issue")
    private String sourceName;
    /**
     * the earliest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("startEpochMicrosec")
    @JsonPropertyDescription("the earliest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds")
    private Double startEpochMicrosec;
    /**
     * UTC offset for the local time zone of the device as UTC+/-hh.mm
     * 
     */
    @JsonProperty("timeZoneOffset")
    @JsonPropertyDescription("UTC offset for the local time zone of the device as UTC+/-hh.mm")
    private String timeZoneOffset;
    /**
     * version of the event header
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("version of the event header")
    private CommonEventHeader.Version version;
    /**
     * version of the VES Event Listener API
     * (Required)
     * 
     */
    @JsonProperty("vesEventListenerVersion")
    @JsonPropertyDescription("version of the VES Event Listener API")
    private CommonEventHeader.VesEventListenerVersion vesEventListenerVersion;
    
    @JsonIgnore
    private long ts1 =  new Date().getTime();
    @JsonIgnore
    public long getTs1() {
		return ts1;
	}

    @JsonIgnore
	public void setTs1(long ts1) {
		this.ts1 = ts1;
    }

    /**
     * the eventing domain associated with the event
     * (Required)
     * 
     */
    @JsonProperty("domain")
    public CommonEventHeader.Domain getDomain() {
        return domain;
    }

    /**
     * the eventing domain associated with the event
     * (Required)
     * 
     */
    @JsonProperty("domain")
    public void setDomain(CommonEventHeader.Domain domain) {
        this.domain = domain;
    }

    /**
     * event key that is unique to the event source
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    /**
     * event key that is unique to the event source
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * unique event name
     * (Required)
     * 
     */
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    /**
     * unique event name
     * (Required)
     * 
     */
    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * for example - applicationNf, guestOS, hostOS, platform
     * 
     */
    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    /**
     * for example - applicationNf, guestOS, hostOS, platform
     * 
     */
    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * enrichment fields for internal VES Event Listener service use only, not supplied by event sources
     * 
     */
    @JsonProperty("internalHeaderFields")
    public InternalHeaderFields getInternalHeaderFields() {
        return internalHeaderFields;
    }

    /**
     * enrichment fields for internal VES Event Listener service use only, not supplied by event sources
     * 
     */
    @JsonProperty("internalHeaderFields")
    public void setInternalHeaderFields(InternalHeaderFields internalHeaderFields) {
        this.internalHeaderFields = internalHeaderFields;
    }

    /**
     * the latest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("lastEpochMicrosec")
    public Double getLastEpochMicrosec() {
        return lastEpochMicrosec;
    }

    /**
     * the latest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("lastEpochMicrosec")
    public void setLastEpochMicrosec(Double lastEpochMicrosec) {
        this.lastEpochMicrosec = lastEpochMicrosec;
    }

    /**
     *  3 character network function component type, aligned with vfc naming standards
     * 
     */
    @JsonProperty("nfcNamingCode")
    public String getNfcNamingCode() {
        return nfcNamingCode;
    }

    /**
     *  3 character network function component type, aligned with vfc naming standards
     * 
     */
    @JsonProperty("nfcNamingCode")
    public void setNfcNamingCode(String nfcNamingCode) {
        this.nfcNamingCode = nfcNamingCode;
    }

    /**
     *  4 character network function type, aligned with nf naming standards
     * 
     */
    @JsonProperty("nfNamingCode")
    public String getNfNamingCode() {
        return nfNamingCode;
    }

    /**
     *  4 character network function type, aligned with nf naming standards
     * 
     */
    @JsonProperty("nfNamingCode")
    public void setNfNamingCode(String nfNamingCode) {
        this.nfNamingCode = nfNamingCode;
    }

    /**
     * network function vendor name
     * 
     */
    @JsonProperty("nfVendorName")
    public String getNfVendorName() {
        return nfVendorName;
    }

    /**
     * network function vendor name
     * 
     */
    @JsonProperty("nfVendorName")
    public void setNfVendorName(String nfVendorName) {
        this.nfVendorName = nfVendorName;
    }

    /**
     * processing priority
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public CommonEventHeader.Priority getPriority() {
        return priority;
    }

    /**
     * processing priority
     * (Required)
     * 
     */
    @JsonProperty("priority")
    public void setPriority(CommonEventHeader.Priority priority) {
        this.priority = priority;
    }

    /**
     * UUID identifying the entity reporting the event, for example an OAM VM; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("reportingEntityId")
    public String getReportingEntityId() {
        return reportingEntityId;
    }

    /**
     * UUID identifying the entity reporting the event, for example an OAM VM; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("reportingEntityId")
    public void setReportingEntityId(String reportingEntityId) {
        this.reportingEntityId = reportingEntityId;
    }

    /**
     * name of the entity reporting the event, for example, an EMS name; may be the same as sourceName
     * (Required)
     * 
     */
    @JsonProperty("reportingEntityName")
    public String getReportingEntityName() {
        return reportingEntityName;
    }

    /**
     * name of the entity reporting the event, for example, an EMS name; may be the same as sourceName
     * (Required)
     * 
     */
    @JsonProperty("reportingEntityName")
    public void setReportingEntityName(String reportingEntityName) {
        this.reportingEntityName = reportingEntityName;
    }

    /**
     * ordering of events communicated by an event source instance or 0 if not needed
     * (Required)
     * 
     */
    @JsonProperty("sequence")
    public Integer getSequence() {
        return sequence;
    }

    /**
     * ordering of events communicated by an event source instance or 0 if not needed
     * (Required)
     * 
     */
    @JsonProperty("sequence")
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * UUID identifying the entity experiencing the event issue; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * UUID identifying the entity experiencing the event issue; must be populated by the ATT enrichment process
     * 
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * name of the entity experiencing the event issue
     * (Required)
     * 
     */
    @JsonProperty("sourceName")
    public String getSourceName() {
        return sourceName;
    }

    /**
     * name of the entity experiencing the event issue
     * (Required)
     * 
     */
    @JsonProperty("sourceName")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * the earliest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("startEpochMicrosec")
    public Double getStartEpochMicrosec() {
        return startEpochMicrosec;
    }

    /**
     * the earliest unix time aka epoch time associated with the event from any component--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * (Required)
     * 
     */
    @JsonProperty("startEpochMicrosec")
    public void setStartEpochMicrosec(Double startEpochMicrosec) {
        this.startEpochMicrosec = startEpochMicrosec;
    }

    /**
     * UTC offset for the local time zone of the device as UTC+/-hh.mm
     * 
     */
    @JsonProperty("timeZoneOffset")
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * UTC offset for the local time zone of the device as UTC+/-hh.mm
     * 
     */
    @JsonProperty("timeZoneOffset")
    public void setTimeZoneOffset(String timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    /**
     * version of the event header
     * (Required)
     * 
     */
    @JsonProperty("version")
    public CommonEventHeader.Version getVersion() {
        return version;
    }

    /**
     * version of the event header
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(CommonEventHeader.Version version) {
        this.version = version;
    }

    /**
     * version of the VES Event Listener API
     * (Required)
     * 
     */
    @JsonProperty("vesEventListenerVersion")
    public CommonEventHeader.VesEventListenerVersion getVesEventListenerVersion() {
        return vesEventListenerVersion;
    }

    /**
     * version of the VES Event Listener API
     * (Required)
     * 
     */
    @JsonProperty("vesEventListenerVersion")
    public void setVesEventListenerVersion(CommonEventHeader.VesEventListenerVersion vesEventListenerVersion) {
        this.vesEventListenerVersion = vesEventListenerVersion;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domain).append(eventId).append(eventName).append(eventType).append(internalHeaderFields).append(lastEpochMicrosec).append(nfcNamingCode).append(nfNamingCode).append(nfVendorName).append(priority).append(reportingEntityId).append(reportingEntityName).append(sequence).append(sourceId).append(sourceName).append(startEpochMicrosec).append(timeZoneOffset).append(version).append(vesEventListenerVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonEventHeader) == false) {
            return false;
        }
        CommonEventHeader rhs = ((CommonEventHeader) other);
        return new EqualsBuilder().append(domain, rhs.domain).append(eventId, rhs.eventId).append(eventName, rhs.eventName).append(eventType, rhs.eventType).append(internalHeaderFields, rhs.internalHeaderFields).append(lastEpochMicrosec, rhs.lastEpochMicrosec).append(nfcNamingCode, rhs.nfcNamingCode).append(nfNamingCode, rhs.nfNamingCode).append(nfVendorName, rhs.nfVendorName).append(priority, rhs.priority).append(reportingEntityId, rhs.reportingEntityId).append(reportingEntityName, rhs.reportingEntityName).append(sequence, rhs.sequence).append(sourceId, rhs.sourceId).append(sourceName, rhs.sourceName).append(startEpochMicrosec, rhs.startEpochMicrosec).append(timeZoneOffset, rhs.timeZoneOffset).append(version, rhs.version).append(vesEventListenerVersion, rhs.vesEventListenerVersion).isEquals();
    }

    public enum Domain {

        FAULT("fault"),
        HEARTBEAT("heartbeat"),
        MEASUREMENT("measurement"),
        MOBILE_FLOW("mobileFlow"),
        NOTIFICATION("notification"),
        OTHER("other"),
        PNF_REGISTRATION("pnfRegistration"),
        SIP_SIGNALING("sipSignaling"),
        STATE_CHANGE("stateChange"),
        SYSLOG("syslog"),
        THRESHOLD_CROSSING_ALERT("thresholdCrossingAlert"),
        VOICE_QUALITY("voiceQuality");
        private final String value;
        private final static Map<String, CommonEventHeader.Domain> CONSTANTS = new HashMap<String, CommonEventHeader.Domain>();

        static {
            for (CommonEventHeader.Domain c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Domain(String value) {
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
        public static CommonEventHeader.Domain fromValue(String value) {
            CommonEventHeader.Domain constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Priority {

        HIGH("High"),
        MEDIUM("Medium"),
        NORMAL("Normal"),
        LOW("Low");
        private final String value;
        private final static Map<String, CommonEventHeader.Priority> CONSTANTS = new HashMap<String, CommonEventHeader.Priority>();

        static {
            for (CommonEventHeader.Priority c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Priority(String value) {
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
        public static CommonEventHeader.Priority fromValue(String value) {
            CommonEventHeader.Priority constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Version {

        _4_0_1("4.0.1");
        private final String value;
        private final static Map<String, CommonEventHeader.Version> CONSTANTS = new HashMap<String, CommonEventHeader.Version>();

        static {
            for (CommonEventHeader.Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Version(String value) {
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
        public static CommonEventHeader.Version fromValue(String value) {
            CommonEventHeader.Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum VesEventListenerVersion {

        _7_0_1("7.0.1");
        private final String value;
        private final static Map<String, CommonEventHeader.VesEventListenerVersion> CONSTANTS = new HashMap<String, CommonEventHeader.VesEventListenerVersion>();

        static {
            for (CommonEventHeader.VesEventListenerVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private VesEventListenerVersion(String value) {
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
        public static CommonEventHeader.VesEventListenerVersion fromValue(String value) {
            CommonEventHeader.VesEventListenerVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
