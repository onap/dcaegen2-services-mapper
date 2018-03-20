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
    "domain",
    "eventId",
    "eventName",
    "lastEpochMicrosec",
    "priority",
    "reportingEntityName",
    "sequence",
    "sourceName",
    "startEpochMicrosec",
    "version",
    "eventType",
    "internalHeaderFields",
    "nfcNamingCode",
    "nfNamingCode",
    "reportingEntityId",
    "sourceId"
})
public class CommonEventHeader {

    @JsonProperty("domain")
    private String domain;
    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("eventName")
    private String eventName;
    @JsonProperty("lastEpochMicrosec")
    private Double lastEpochMicrosec;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("reportingEntityName")
    private String reportingEntityName;
    @JsonProperty("sequence")
    private Long sequence;
    @JsonProperty("sourceName")
    private String sourceName;
    @JsonProperty("startEpochMicrosec")
    private Double startEpochMicrosec;
    @JsonProperty("version")
    private Double version;
    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("internalHeaderFields")
    private InternalHeaderFields internalHeaderFields;
    @JsonProperty("nfcNamingCode")
    private String nfcNamingCode;
    @JsonProperty("nfNamingCode")
    private String nfNamingCode;
    @JsonProperty("reportingEntityId")
    private String reportingEntityId;
    @JsonProperty("sourceId")
    private String sourceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @JsonProperty("lastEpochMicrosec")
    public Double getLastEpochMicrosec() {
        return lastEpochMicrosec;
    }

    @JsonProperty("lastEpochMicrosec")
    public void setLastEpochMicrosec(Double lastEpochMicrosec) {
        this.lastEpochMicrosec = lastEpochMicrosec;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("reportingEntityName")
    public String getReportingEntityName() {
        return reportingEntityName;
    }

    @JsonProperty("reportingEntityName")
    public void setReportingEntityName(String reportingEntityName) {
        this.reportingEntityName = reportingEntityName;
    }

    @JsonProperty("sequence")
    public Long getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("sourceName")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("sourceName")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @JsonProperty("startEpochMicrosec")
    public Double getStartEpochMicrosec() {
        return startEpochMicrosec;
    }

    @JsonProperty("startEpochMicrosec")
    public void setStartEpochMicrosec(Double startEpochMicrosec) {
        this.startEpochMicrosec = startEpochMicrosec;
    }

    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("internalHeaderFields")
    public InternalHeaderFields getInternalHeaderFields() {
        return internalHeaderFields;
    }

    @JsonProperty("internalHeaderFields")
    public void setInternalHeaderFields(InternalHeaderFields internalHeaderFields) {
        this.internalHeaderFields = internalHeaderFields;
    }

    @JsonProperty("nfcNamingCode")
    public String getNfcNamingCode() {
        return nfcNamingCode;
    }

    @JsonProperty("nfcNamingCode")
    public void setNfcNamingCode(String nfcNamingCode) {
        this.nfcNamingCode = nfcNamingCode;
    }

    @JsonProperty("nfNamingCode")
    public String getNfNamingCode() {
        return nfNamingCode;
    }

    @JsonProperty("nfNamingCode")
    public void setNfNamingCode(String nfNamingCode) {
        this.nfNamingCode = nfNamingCode;
    }

    @JsonProperty("reportingEntityId")
    public String getReportingEntityId() {
        return reportingEntityId;
    }

    @JsonProperty("reportingEntityId")
    public void setReportingEntityId(String reportingEntityId) {
        this.reportingEntityId = reportingEntityId;
    }

    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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
        return new ToStringBuilder(this).append("domain", domain).append("eventId", eventId).append("eventName", eventName).append("lastEpochMicrosec", lastEpochMicrosec).append("priority", priority).append("reportingEntityName", reportingEntityName).append("sequence", sequence).append("sourceName", sourceName).append("startEpochMicrosec", startEpochMicrosec).append("version", version).append("eventType", eventType).append("internalHeaderFields", internalHeaderFields).append("nfcNamingCode", nfcNamingCode).append("nfNamingCode", nfNamingCode).append("reportingEntityId", reportingEntityId).append("sourceId", sourceId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nfNamingCode).append(eventType).append(sourceId).append(version).append(reportingEntityName).append(startEpochMicrosec).append(lastEpochMicrosec).append(eventId).append(nfcNamingCode).append(additionalProperties).append(sourceName).append(sequence).append(priority).append(domain).append(internalHeaderFields).append(eventName).append(reportingEntityId).toHashCode();
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
        return new EqualsBuilder().append(nfNamingCode, rhs.nfNamingCode).append(eventType, rhs.eventType).append(sourceId, rhs.sourceId).append(version, rhs.version).append(reportingEntityName, rhs.reportingEntityName).append(startEpochMicrosec, rhs.startEpochMicrosec).append(lastEpochMicrosec, rhs.lastEpochMicrosec).append(eventId, rhs.eventId).append(nfcNamingCode, rhs.nfcNamingCode).append(additionalProperties, rhs.additionalProperties).append(sourceName, rhs.sourceName).append(sequence, rhs.sequence).append(priority, rhs.priority).append(domain, rhs.domain).append(internalHeaderFields, rhs.internalHeaderFields).append(eventName, rhs.eventName).append(reportingEntityId, rhs.reportingEntityId).isEquals();
    }

}
