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
    "adjacencyName",
    "endpointDescription",
    "endpointJitter",
    "endpointRtpOctetsDiscarded",
    "endpointRtpOctetsReceived",
    "endpointRtpOctetsSent",
    "endpointRtpPacketsDiscarded",
    "endpointRtpPacketsReceived",
    "endpointRtpPacketsSent",
    "localJitter",
    "localRtpOctetsDiscarded",
    "localRtpOctetsReceived",
    "localRtpOctetsSent",
    "localRtpPacketsDiscarded",
    "localRtpPacketsReceived",
    "localRtpPacketsSent",
    "mosCqe",
    "packetsLost",
    "packetLossPercent",
    "rFactor",
    "roundTripDelay"
})
public class EndOfCallVqmSummaries {

    @JsonProperty("adjacencyName")
    private String adjacencyName;
    @JsonProperty("endpointDescription")
    private String endpointDescription;
    @JsonProperty("endpointJitter")
    private Double endpointJitter;
    @JsonProperty("endpointRtpOctetsDiscarded")
    private Double endpointRtpOctetsDiscarded;
    @JsonProperty("endpointRtpOctetsReceived")
    private Double endpointRtpOctetsReceived;
    @JsonProperty("endpointRtpOctetsSent")
    private Double endpointRtpOctetsSent;
    @JsonProperty("endpointRtpPacketsDiscarded")
    private Double endpointRtpPacketsDiscarded;
    @JsonProperty("endpointRtpPacketsReceived")
    private Double endpointRtpPacketsReceived;
    @JsonProperty("endpointRtpPacketsSent")
    private Double endpointRtpPacketsSent;
    @JsonProperty("localJitter")
    private Double localJitter;
    @JsonProperty("localRtpOctetsDiscarded")
    private Double localRtpOctetsDiscarded;
    @JsonProperty("localRtpOctetsReceived")
    private Double localRtpOctetsReceived;
    @JsonProperty("localRtpOctetsSent")
    private Double localRtpOctetsSent;
    @JsonProperty("localRtpPacketsDiscarded")
    private Double localRtpPacketsDiscarded;
    @JsonProperty("localRtpPacketsReceived")
    private Double localRtpPacketsReceived;
    @JsonProperty("localRtpPacketsSent")
    private Double localRtpPacketsSent;
    @JsonProperty("mosCqe")
    private Double mosCqe;
    @JsonProperty("packetsLost")
    private Double packetsLost;
    @JsonProperty("packetLossPercent")
    private Double packetLossPercent;
    @JsonProperty("rFactor")
    private Double rFactor;
    @JsonProperty("roundTripDelay")
    private Double roundTripDelay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adjacencyName")
    public String getAdjacencyName() {
        return adjacencyName;
    }

    @JsonProperty("adjacencyName")
    public void setAdjacencyName(String adjacencyName) {
        this.adjacencyName = adjacencyName;
    }

    @JsonProperty("endpointDescription")
    public String getEndpointDescription() {
        return endpointDescription;
    }

    @JsonProperty("endpointDescription")
    public void setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
    }

    @JsonProperty("endpointJitter")
    public Double getEndpointJitter() {
        return endpointJitter;
    }

    @JsonProperty("endpointJitter")
    public void setEndpointJitter(Double endpointJitter) {
        this.endpointJitter = endpointJitter;
    }

    @JsonProperty("endpointRtpOctetsDiscarded")
    public Double getEndpointRtpOctetsDiscarded() {
        return endpointRtpOctetsDiscarded;
    }

    @JsonProperty("endpointRtpOctetsDiscarded")
    public void setEndpointRtpOctetsDiscarded(Double endpointRtpOctetsDiscarded) {
        this.endpointRtpOctetsDiscarded = endpointRtpOctetsDiscarded;
    }

    @JsonProperty("endpointRtpOctetsReceived")
    public Double getEndpointRtpOctetsReceived() {
        return endpointRtpOctetsReceived;
    }

    @JsonProperty("endpointRtpOctetsReceived")
    public void setEndpointRtpOctetsReceived(Double endpointRtpOctetsReceived) {
        this.endpointRtpOctetsReceived = endpointRtpOctetsReceived;
    }

    @JsonProperty("endpointRtpOctetsSent")
    public Double getEndpointRtpOctetsSent() {
        return endpointRtpOctetsSent;
    }

    @JsonProperty("endpointRtpOctetsSent")
    public void setEndpointRtpOctetsSent(Double endpointRtpOctetsSent) {
        this.endpointRtpOctetsSent = endpointRtpOctetsSent;
    }

    @JsonProperty("endpointRtpPacketsDiscarded")
    public Double getEndpointRtpPacketsDiscarded() {
        return endpointRtpPacketsDiscarded;
    }

    @JsonProperty("endpointRtpPacketsDiscarded")
    public void setEndpointRtpPacketsDiscarded(Double endpointRtpPacketsDiscarded) {
        this.endpointRtpPacketsDiscarded = endpointRtpPacketsDiscarded;
    }

    @JsonProperty("endpointRtpPacketsReceived")
    public Double getEndpointRtpPacketsReceived() {
        return endpointRtpPacketsReceived;
    }

    @JsonProperty("endpointRtpPacketsReceived")
    public void setEndpointRtpPacketsReceived(Double endpointRtpPacketsReceived) {
        this.endpointRtpPacketsReceived = endpointRtpPacketsReceived;
    }

    @JsonProperty("endpointRtpPacketsSent")
    public Double getEndpointRtpPacketsSent() {
        return endpointRtpPacketsSent;
    }

    @JsonProperty("endpointRtpPacketsSent")
    public void setEndpointRtpPacketsSent(Double endpointRtpPacketsSent) {
        this.endpointRtpPacketsSent = endpointRtpPacketsSent;
    }

    @JsonProperty("localJitter")
    public Double getLocalJitter() {
        return localJitter;
    }

    @JsonProperty("localJitter")
    public void setLocalJitter(Double localJitter) {
        this.localJitter = localJitter;
    }

    @JsonProperty("localRtpOctetsDiscarded")
    public Double getLocalRtpOctetsDiscarded() {
        return localRtpOctetsDiscarded;
    }

    @JsonProperty("localRtpOctetsDiscarded")
    public void setLocalRtpOctetsDiscarded(Double localRtpOctetsDiscarded) {
        this.localRtpOctetsDiscarded = localRtpOctetsDiscarded;
    }

    @JsonProperty("localRtpOctetsReceived")
    public Double getLocalRtpOctetsReceived() {
        return localRtpOctetsReceived;
    }

    @JsonProperty("localRtpOctetsReceived")
    public void setLocalRtpOctetsReceived(Double localRtpOctetsReceived) {
        this.localRtpOctetsReceived = localRtpOctetsReceived;
    }

    @JsonProperty("localRtpOctetsSent")
    public Double getLocalRtpOctetsSent() {
        return localRtpOctetsSent;
    }

    @JsonProperty("localRtpOctetsSent")
    public void setLocalRtpOctetsSent(Double localRtpOctetsSent) {
        this.localRtpOctetsSent = localRtpOctetsSent;
    }

    @JsonProperty("localRtpPacketsDiscarded")
    public Double getLocalRtpPacketsDiscarded() {
        return localRtpPacketsDiscarded;
    }

    @JsonProperty("localRtpPacketsDiscarded")
    public void setLocalRtpPacketsDiscarded(Double localRtpPacketsDiscarded) {
        this.localRtpPacketsDiscarded = localRtpPacketsDiscarded;
    }

    @JsonProperty("localRtpPacketsReceived")
    public Double getLocalRtpPacketsReceived() {
        return localRtpPacketsReceived;
    }

    @JsonProperty("localRtpPacketsReceived")
    public void setLocalRtpPacketsReceived(Double localRtpPacketsReceived) {
        this.localRtpPacketsReceived = localRtpPacketsReceived;
    }

    @JsonProperty("localRtpPacketsSent")
    public Double getLocalRtpPacketsSent() {
        return localRtpPacketsSent;
    }

    @JsonProperty("localRtpPacketsSent")
    public void setLocalRtpPacketsSent(Double localRtpPacketsSent) {
        this.localRtpPacketsSent = localRtpPacketsSent;
    }

    @JsonProperty("mosCqe")
    public Double getMosCqe() {
        return mosCqe;
    }

    @JsonProperty("mosCqe")
    public void setMosCqe(Double mosCqe) {
        this.mosCqe = mosCqe;
    }

    @JsonProperty("packetsLost")
    public Double getPacketsLost() {
        return packetsLost;
    }

    @JsonProperty("packetsLost")
    public void setPacketsLost(Double packetsLost) {
        this.packetsLost = packetsLost;
    }

    @JsonProperty("packetLossPercent")
    public Double getPacketLossPercent() {
        return packetLossPercent;
    }

    @JsonProperty("packetLossPercent")
    public void setPacketLossPercent(Double packetLossPercent) {
        this.packetLossPercent = packetLossPercent;
    }

    @JsonProperty("rFactor")
    public Double getRFactor() {
        return rFactor;
    }

    @JsonProperty("rFactor")
    public void setRFactor(Double rFactor) {
        this.rFactor = rFactor;
    }

    @JsonProperty("roundTripDelay")
    public Double getRoundTripDelay() {
        return roundTripDelay;
    }

    @JsonProperty("roundTripDelay")
    public void setRoundTripDelay(Double roundTripDelay) {
        this.roundTripDelay = roundTripDelay;
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
        return new ToStringBuilder(this).append("adjacencyName", adjacencyName).append("endpointDescription", endpointDescription).append("endpointJitter", endpointJitter).append("endpointRtpOctetsDiscarded", endpointRtpOctetsDiscarded).append("endpointRtpOctetsReceived", endpointRtpOctetsReceived).append("endpointRtpOctetsSent", endpointRtpOctetsSent).append("endpointRtpPacketsDiscarded", endpointRtpPacketsDiscarded).append("endpointRtpPacketsReceived", endpointRtpPacketsReceived).append("endpointRtpPacketsSent", endpointRtpPacketsSent).append("localJitter", localJitter).append("localRtpOctetsDiscarded", localRtpOctetsDiscarded).append("localRtpOctetsReceived", localRtpOctetsReceived).append("localRtpOctetsSent", localRtpOctetsSent).append("localRtpPacketsDiscarded", localRtpPacketsDiscarded).append("localRtpPacketsReceived", localRtpPacketsReceived).append("localRtpPacketsSent", localRtpPacketsSent).append("mosCqe", mosCqe).append("packetsLost", packetsLost).append("packetLossPercent", packetLossPercent).append("rFactor", rFactor).append("roundTripDelay", roundTripDelay).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(localJitter).append(adjacencyName).append(localRtpPacketsDiscarded).append(localRtpOctetsSent).append(roundTripDelay).append(localRtpPacketsReceived).append(endpointRtpPacketsReceived).append(packetLossPercent).append(endpointRtpPacketsSent).append(endpointJitter).append(mosCqe).append(endpointRtpOctetsDiscarded).append(endpointDescription).append(rFactor).append(endpointRtpPacketsDiscarded).append(localRtpOctetsReceived).append(additionalProperties).append(endpointRtpOctetsSent).append(localRtpOctetsDiscarded).append(localRtpPacketsSent).append(endpointRtpOctetsReceived).append(packetsLost).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndOfCallVqmSummaries) == false) {
            return false;
        }
        EndOfCallVqmSummaries rhs = ((EndOfCallVqmSummaries) other);
        return new EqualsBuilder().append(localJitter, rhs.localJitter).append(adjacencyName, rhs.adjacencyName).append(localRtpPacketsDiscarded, rhs.localRtpPacketsDiscarded).append(localRtpOctetsSent, rhs.localRtpOctetsSent).append(roundTripDelay, rhs.roundTripDelay).append(localRtpPacketsReceived, rhs.localRtpPacketsReceived).append(endpointRtpPacketsReceived, rhs.endpointRtpPacketsReceived).append(packetLossPercent, rhs.packetLossPercent).append(endpointRtpPacketsSent, rhs.endpointRtpPacketsSent).append(endpointJitter, rhs.endpointJitter).append(mosCqe, rhs.mosCqe).append(endpointRtpOctetsDiscarded, rhs.endpointRtpOctetsDiscarded).append(endpointDescription, rhs.endpointDescription).append(rFactor, rhs.rFactor).append(endpointRtpPacketsDiscarded, rhs.endpointRtpPacketsDiscarded).append(localRtpOctetsReceived, rhs.localRtpOctetsReceived).append(additionalProperties, rhs.additionalProperties).append(endpointRtpOctetsSent, rhs.endpointRtpOctetsSent).append(localRtpOctetsDiscarded, rhs.localRtpOctetsDiscarded).append(localRtpPacketsSent, rhs.localRtpPacketsSent).append(endpointRtpOctetsReceived, rhs.endpointRtpOctetsReceived).append(packetsLost, rhs.packetsLost).isEquals();
    }

}
