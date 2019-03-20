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
 * provides end of call voice quality metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "adjacencyName",
    "endpointAverageJitter",
    "endpointDescription",
    "endpointMaxJitter",
    "endpointRtpOctetsDiscarded",
    "endpointRtpOctetsLost",
    "endpointRtpOctetsReceived",
    "endpointRtpOctetsSent",
    "endpointRtpPacketsDiscarded",
    "endpointRtpPacketsLost",
    "endpointRtpPacketsReceived",
    "endpointRtpPacketsSent",
    "localAverageJitter",
    "localAverageJitterBufferDelay",
    "localMaxJitter",
    "localMaxJitterBufferDelay",
    "localRtpOctetsDiscarded",
    "localRtpOctetsLost",
    "localRtpOctetsReceived",
    "localRtpOctetsSent",
    "localRtpPacketsDiscarded",
    "localRtpPacketsLost",
    "localRtpPacketsReceived",
    "localRtpPacketsSent",
    "mosCqe",
    "oneWayDelay",
    "packetLossPercent",
    "rFactor",
    "roundTripDelay"
})
public class EndOfCallVqmSummaries {

    /**
     *  adjacency name
     * (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    @JsonPropertyDescription(" adjacency name")
    private String adjacencyName;
    /**
     * endpoint average jitter
     * 
     */
    @JsonProperty("endpointAverageJitter")
    @JsonPropertyDescription("endpoint average jitter")
    private Double endpointAverageJitter;
    /**
     * either Caller or Callee
     * (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    @JsonPropertyDescription("either Caller or Callee")
    private EndOfCallVqmSummaries.EndpointDescription endpointDescription;
    /**
     * endpoint maximum jitter
     * 
     */
    @JsonProperty("endpointMaxJitter")
    @JsonPropertyDescription("endpoint maximum jitter")
    private Double endpointMaxJitter;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsDiscarded")
    @JsonPropertyDescription("")
    private Double endpointRtpOctetsDiscarded;
    /**
     * endpoint RTP octets lost
     * 
     */
    @JsonProperty("endpointRtpOctetsLost")
    @JsonPropertyDescription("endpoint RTP octets lost")
    private Double endpointRtpOctetsLost;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsReceived")
    @JsonPropertyDescription("")
    private Double endpointRtpOctetsReceived;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsSent")
    @JsonPropertyDescription("")
    private Double endpointRtpOctetsSent;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsDiscarded")
    @JsonPropertyDescription("")
    private Double endpointRtpPacketsDiscarded;
    /**
     * endpoint RTP packets lost
     * 
     */
    @JsonProperty("endpointRtpPacketsLost")
    @JsonPropertyDescription("endpoint RTP packets lost")
    private Double endpointRtpPacketsLost;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsReceived")
    @JsonPropertyDescription("")
    private Double endpointRtpPacketsReceived;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsSent")
    @JsonPropertyDescription("")
    private Double endpointRtpPacketsSent;
    /**
     * Local average jitter
     * 
     */
    @JsonProperty("localAverageJitter")
    @JsonPropertyDescription("Local average jitter")
    private Double localAverageJitter;
    /**
     * Local average jitter delay
     * 
     */
    @JsonProperty("localAverageJitterBufferDelay")
    @JsonPropertyDescription("Local average jitter delay")
    private Double localAverageJitterBufferDelay;
    /**
     * Local maximum jitter
     * 
     */
    @JsonProperty("localMaxJitter")
    @JsonPropertyDescription("Local maximum jitter")
    private Double localMaxJitter;
    /**
     * Local maximum jitter delay
     * 
     */
    @JsonProperty("localMaxJitterBufferDelay")
    @JsonPropertyDescription("Local maximum jitter delay")
    private Double localMaxJitterBufferDelay;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsDiscarded")
    @JsonPropertyDescription("")
    private Double localRtpOctetsDiscarded;
    /**
     * Local RTP octets lost
     * 
     */
    @JsonProperty("localRtpOctetsLost")
    @JsonPropertyDescription("Local RTP octets lost")
    private Double localRtpOctetsLost;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsReceived")
    @JsonPropertyDescription("")
    private Double localRtpOctetsReceived;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsSent")
    @JsonPropertyDescription("")
    private Double localRtpOctetsSent;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsDiscarded")
    @JsonPropertyDescription("")
    private Double localRtpPacketsDiscarded;
    /**
     * Local RTP packets lost
     * 
     */
    @JsonProperty("localRtpPacketsLost")
    @JsonPropertyDescription("Local RTP packets lost")
    private Double localRtpPacketsLost;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsReceived")
    @JsonPropertyDescription("")
    private Double localRtpPacketsReceived;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsSent")
    @JsonPropertyDescription("")
    private Double localRtpPacketsSent;
    /**
     *  1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    @JsonPropertyDescription("1-5 1dp")
    private Double mosCqe;
    /**
     * one-way path delay in milliseconds
     * 
     */
    @JsonProperty("oneWayDelay")
    @JsonPropertyDescription("one-way path delay in milliseconds")
    private Double oneWayDelay;
    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP) and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee). Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    @JsonPropertyDescription("Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP) and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee). Decimal (2 dp)")
    private Double packetLossPercent;
    /**
     *  0-100
     * 
     */
    @JsonProperty("rFactor")
    @JsonPropertyDescription("0-100")
    private Double rFactor;
    /**
     * millisecs
     * 
     */
    @JsonProperty("roundTripDelay")
    @JsonPropertyDescription("millisecs")
    private Double roundTripDelay;

    /**
     *  adjacency name
     * (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    public String getAdjacencyName() {
        return adjacencyName;
    }

    /**
     *  adjacency name
     * (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    public void setAdjacencyName(String adjacencyName) {
        this.adjacencyName = adjacencyName;
    }

    /**
     * endpoint average jitter
     * 
     */
    @JsonProperty("endpointAverageJitter")
    public Double getEndpointAverageJitter() {
        return endpointAverageJitter;
    }

    /**
     * endpoint average jitter
     * 
     */
    @JsonProperty("endpointAverageJitter")
    public void setEndpointAverageJitter(Double endpointAverageJitter) {
        this.endpointAverageJitter = endpointAverageJitter;
    }

    /**
     * either Caller or Callee
     * (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    public EndOfCallVqmSummaries.EndpointDescription getEndpointDescription() {
        return endpointDescription;
    }

    /**
     * either Caller or Callee
     * (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    public void setEndpointDescription(EndOfCallVqmSummaries.EndpointDescription endpointDescription) {
        this.endpointDescription = endpointDescription;
    }

    /**
     * endpoint maximum jitter
     * 
     */
    @JsonProperty("endpointMaxJitter")
    public Double getEndpointMaxJitter() {
        return endpointMaxJitter;
    }

    /**
     * endpoint maximum jitter
     * 
     */
    @JsonProperty("endpointMaxJitter")
    public void setEndpointMaxJitter(Double endpointMaxJitter) {
        this.endpointMaxJitter = endpointMaxJitter;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsDiscarded")
    public Double getEndpointRtpOctetsDiscarded() {
        return endpointRtpOctetsDiscarded;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsDiscarded")
    public void setEndpointRtpOctetsDiscarded(Double endpointRtpOctetsDiscarded) {
        this.endpointRtpOctetsDiscarded = endpointRtpOctetsDiscarded;
    }

    /**
     * endpoint RTP octets lost
     * 
     */
    @JsonProperty("endpointRtpOctetsLost")
    public Double getEndpointRtpOctetsLost() {
        return endpointRtpOctetsLost;
    }

    /**
     * endpoint RTP octets lost
     * 
     */
    @JsonProperty("endpointRtpOctetsLost")
    public void setEndpointRtpOctetsLost(Double endpointRtpOctetsLost) {
        this.endpointRtpOctetsLost = endpointRtpOctetsLost;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsReceived")
    public Double getEndpointRtpOctetsReceived() {
        return endpointRtpOctetsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsReceived")
    public void setEndpointRtpOctetsReceived(Double endpointRtpOctetsReceived) {
        this.endpointRtpOctetsReceived = endpointRtpOctetsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsSent")
    public Double getEndpointRtpOctetsSent() {
        return endpointRtpOctetsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsSent")
    public void setEndpointRtpOctetsSent(Double endpointRtpOctetsSent) {
        this.endpointRtpOctetsSent = endpointRtpOctetsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsDiscarded")
    public Double getEndpointRtpPacketsDiscarded() {
        return endpointRtpPacketsDiscarded;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsDiscarded")
    public void setEndpointRtpPacketsDiscarded(Double endpointRtpPacketsDiscarded) {
        this.endpointRtpPacketsDiscarded = endpointRtpPacketsDiscarded;
    }

    /**
     * endpoint RTP packets lost
     * 
     */
    @JsonProperty("endpointRtpPacketsLost")
    public Double getEndpointRtpPacketsLost() {
        return endpointRtpPacketsLost;
    }

    /**
     * endpoint RTP packets lost
     * 
     */
    @JsonProperty("endpointRtpPacketsLost")
    public void setEndpointRtpPacketsLost(Double endpointRtpPacketsLost) {
        this.endpointRtpPacketsLost = endpointRtpPacketsLost;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsReceived")
    public Double getEndpointRtpPacketsReceived() {
        return endpointRtpPacketsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsReceived")
    public void setEndpointRtpPacketsReceived(Double endpointRtpPacketsReceived) {
        this.endpointRtpPacketsReceived = endpointRtpPacketsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsSent")
    public Double getEndpointRtpPacketsSent() {
        return endpointRtpPacketsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpPacketsSent")
    public void setEndpointRtpPacketsSent(Double endpointRtpPacketsSent) {
        this.endpointRtpPacketsSent = endpointRtpPacketsSent;
    }

    /**
     * Local average jitter
     * 
     */
    @JsonProperty("localAverageJitter")
    public Double getLocalAverageJitter() {
        return localAverageJitter;
    }

    /**
     * Local average jitter
     * 
     */
    @JsonProperty("localAverageJitter")
    public void setLocalAverageJitter(Double localAverageJitter) {
        this.localAverageJitter = localAverageJitter;
    }

    /**
     * Local average jitter delay
     * 
     */
    @JsonProperty("localAverageJitterBufferDelay")
    public Double getLocalAverageJitterBufferDelay() {
        return localAverageJitterBufferDelay;
    }

    /**
     * Local average jitter delay
     * 
     */
    @JsonProperty("localAverageJitterBufferDelay")
    public void setLocalAverageJitterBufferDelay(Double localAverageJitterBufferDelay) {
        this.localAverageJitterBufferDelay = localAverageJitterBufferDelay;
    }

    /**
     * Local maximum jitter
     * 
     */
    @JsonProperty("localMaxJitter")
    public Double getLocalMaxJitter() {
        return localMaxJitter;
    }

    /**
     * Local maximum jitter
     * 
     */
    @JsonProperty("localMaxJitter")
    public void setLocalMaxJitter(Double localMaxJitter) {
        this.localMaxJitter = localMaxJitter;
    }

    /**
     * Local maximum jitter delay
     * 
     */
    @JsonProperty("localMaxJitterBufferDelay")
    public Double getLocalMaxJitterBufferDelay() {
        return localMaxJitterBufferDelay;
    }

    /**
     * Local maximum jitter delay
     * 
     */
    @JsonProperty("localMaxJitterBufferDelay")
    public void setLocalMaxJitterBufferDelay(Double localMaxJitterBufferDelay) {
        this.localMaxJitterBufferDelay = localMaxJitterBufferDelay;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsDiscarded")
    public Double getLocalRtpOctetsDiscarded() {
        return localRtpOctetsDiscarded;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsDiscarded")
    public void setLocalRtpOctetsDiscarded(Double localRtpOctetsDiscarded) {
        this.localRtpOctetsDiscarded = localRtpOctetsDiscarded;
    }

    /**
     * Local RTP octets lost
     * 
     */
    @JsonProperty("localRtpOctetsLost")
    public Double getLocalRtpOctetsLost() {
        return localRtpOctetsLost;
    }

    /**
     * Local RTP octets lost
     * 
     */
    @JsonProperty("localRtpOctetsLost")
    public void setLocalRtpOctetsLost(Double localRtpOctetsLost) {
        this.localRtpOctetsLost = localRtpOctetsLost;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsReceived")
    public Double getLocalRtpOctetsReceived() {
        return localRtpOctetsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsReceived")
    public void setLocalRtpOctetsReceived(Double localRtpOctetsReceived) {
        this.localRtpOctetsReceived = localRtpOctetsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsSent")
    public Double getLocalRtpOctetsSent() {
        return localRtpOctetsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsSent")
    public void setLocalRtpOctetsSent(Double localRtpOctetsSent) {
        this.localRtpOctetsSent = localRtpOctetsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsDiscarded")
    public Double getLocalRtpPacketsDiscarded() {
        return localRtpPacketsDiscarded;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsDiscarded")
    public void setLocalRtpPacketsDiscarded(Double localRtpPacketsDiscarded) {
        this.localRtpPacketsDiscarded = localRtpPacketsDiscarded;
    }

    /**
     * Local RTP packets lost
     * 
     */
    @JsonProperty("localRtpPacketsLost")
    public Double getLocalRtpPacketsLost() {
        return localRtpPacketsLost;
    }

    /**
     * Local RTP packets lost
     * 
     */
    @JsonProperty("localRtpPacketsLost")
    public void setLocalRtpPacketsLost(Double localRtpPacketsLost) {
        this.localRtpPacketsLost = localRtpPacketsLost;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsReceived")
    public Double getLocalRtpPacketsReceived() {
        return localRtpPacketsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsReceived")
    public void setLocalRtpPacketsReceived(Double localRtpPacketsReceived) {
        this.localRtpPacketsReceived = localRtpPacketsReceived;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsSent")
    public Double getLocalRtpPacketsSent() {
        return localRtpPacketsSent;
    }

    /**
     * 
     * 
     */
    @JsonProperty("localRtpPacketsSent")
    public void setLocalRtpPacketsSent(Double localRtpPacketsSent) {
        this.localRtpPacketsSent = localRtpPacketsSent;
    }

    /**
     *  1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    public Double getMosCqe() {
        return mosCqe;
    }

    /**
     *  1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    public void setMosCqe(Double mosCqe) {
        this.mosCqe = mosCqe;
    }

    /**
     * one-way path delay in milliseconds
     * 
     */
    @JsonProperty("oneWayDelay")
    public Double getOneWayDelay() {
        return oneWayDelay;
    }

    /**
     * one-way path delay in milliseconds
     * 
     */
    @JsonProperty("oneWayDelay")
    public void setOneWayDelay(Double oneWayDelay) {
        this.oneWayDelay = oneWayDelay;
    }

    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP) and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee). Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    public Double getPacketLossPercent() {
        return packetLossPercent;
    }

    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP) and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee). Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    public void setPacketLossPercent(Double packetLossPercent) {
        this.packetLossPercent = packetLossPercent;
    }

    /**
     *  0-100
     * 
     */
    @JsonProperty("rFactor")
    public Double getRFactor() {
        return rFactor;
    }

    /**
     *  0-100
     * 
     */
    @JsonProperty("rFactor")
    public void setRFactor(Double rFactor) {
        this.rFactor = rFactor;
    }

    /**
     * millisecs
     * 
     */
    @JsonProperty("roundTripDelay")
    public Double getRoundTripDelay() {
        return roundTripDelay;
    }

    /**
     * millisecs
     * 
     */
    @JsonProperty("roundTripDelay")
    public void setRoundTripDelay(Double roundTripDelay) {
        this.roundTripDelay = roundTripDelay;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(adjacencyName).append(endpointAverageJitter).append(endpointDescription).append(endpointMaxJitter).append(endpointRtpOctetsDiscarded).append(endpointRtpOctetsLost).append(endpointRtpOctetsReceived).append(endpointRtpOctetsSent).append(endpointRtpPacketsDiscarded).append(endpointRtpPacketsLost).append(endpointRtpPacketsReceived).append(endpointRtpPacketsSent).append(localAverageJitter).append(localAverageJitterBufferDelay).append(localMaxJitter).append(localMaxJitterBufferDelay).append(localRtpOctetsDiscarded).append(localRtpOctetsLost).append(localRtpOctetsReceived).append(localRtpOctetsSent).append(localRtpPacketsDiscarded).append(localRtpPacketsLost).append(localRtpPacketsReceived).append(localRtpPacketsSent).append(mosCqe).append(oneWayDelay).append(packetLossPercent).append(rFactor).append(roundTripDelay).toHashCode();
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
        return new EqualsBuilder().append(adjacencyName, rhs.adjacencyName).append(endpointAverageJitter, rhs.endpointAverageJitter).append(endpointDescription, rhs.endpointDescription).append(endpointMaxJitter, rhs.endpointMaxJitter).append(endpointRtpOctetsDiscarded, rhs.endpointRtpOctetsDiscarded).append(endpointRtpOctetsLost, rhs.endpointRtpOctetsLost).append(endpointRtpOctetsReceived, rhs.endpointRtpOctetsReceived).append(endpointRtpOctetsSent, rhs.endpointRtpOctetsSent).append(endpointRtpPacketsDiscarded, rhs.endpointRtpPacketsDiscarded).append(endpointRtpPacketsLost, rhs.endpointRtpPacketsLost).append(endpointRtpPacketsReceived, rhs.endpointRtpPacketsReceived).append(endpointRtpPacketsSent, rhs.endpointRtpPacketsSent).append(localAverageJitter, rhs.localAverageJitter).append(localAverageJitterBufferDelay, rhs.localAverageJitterBufferDelay).append(localMaxJitter, rhs.localMaxJitter).append(localMaxJitterBufferDelay, rhs.localMaxJitterBufferDelay).append(localRtpOctetsDiscarded, rhs.localRtpOctetsDiscarded).append(localRtpOctetsLost, rhs.localRtpOctetsLost).append(localRtpOctetsReceived, rhs.localRtpOctetsReceived).append(localRtpOctetsSent, rhs.localRtpOctetsSent).append(localRtpPacketsDiscarded, rhs.localRtpPacketsDiscarded).append(localRtpPacketsLost, rhs.localRtpPacketsLost).append(localRtpPacketsReceived, rhs.localRtpPacketsReceived).append(localRtpPacketsSent, rhs.localRtpPacketsSent).append(mosCqe, rhs.mosCqe).append(oneWayDelay, rhs.oneWayDelay).append(packetLossPercent, rhs.packetLossPercent).append(rFactor, rhs.rFactor).append(roundTripDelay, rhs.roundTripDelay).isEquals();
    }

    public enum EndpointDescription {

        CALLER("Caller"),
        CALLEE("Callee");
        private final String value;
        private final static Map<String, EndOfCallVqmSummaries.EndpointDescription> CONSTANTS = new HashMap<String, EndOfCallVqmSummaries.EndpointDescription>();

        static {
            for (EndOfCallVqmSummaries.EndpointDescription c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EndpointDescription(String value) {
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
        public static EndOfCallVqmSummaries.EndpointDescription fromValue(String value) {
            EndOfCallVqmSummaries.EndpointDescription constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
