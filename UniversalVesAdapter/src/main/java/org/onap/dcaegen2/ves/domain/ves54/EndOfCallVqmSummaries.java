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
 * provides end of call voice quality metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"adjacencyName", "endpointDescription", "endpointJitter",
        "endpointRtpOctetsDiscarded", "endpointRtpOctetsReceived", "endpointRtpOctetsSent",
        "endpointRtpPacketsDiscarded", "endpointRtpPacketsReceived", "endpointRtpPacketsSent",
        "localJitter", "localRtpOctetsDiscarded", "localRtpOctetsReceived", "localRtpOctetsSent",
        "localRtpPacketsDiscarded", "localRtpPacketsReceived", "localRtpPacketsSent", "mosCqe",
        "packetsLost", "packetLossPercent", "rFactor", "roundTripDelay"})
public class EndOfCallVqmSummaries {
    
    /**
     * adjacency name (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    @JsonPropertyDescription(" adjacency name")
    private String adjacencyName;
    /**
     * Either Caller or Callee (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    @JsonPropertyDescription("Either Caller or Callee")
    private EndOfCallVqmSummaries.EndpointDescription endpointDescription;
    /**
     * 
     * 
     */
    @JsonProperty("endpointJitter")
    @JsonPropertyDescription("")
    private Double endpointJitter;
    /**
     * 
     * 
     */
    @JsonProperty("endpointRtpOctetsDiscarded")
    @JsonPropertyDescription("")
    private Double endpointRtpOctetsDiscarded;
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
     * 
     * 
     */
    @JsonProperty("localJitter")
    @JsonPropertyDescription("")
    private Double localJitter;
    /**
     * 
     * 
     */
    @JsonProperty("localRtpOctetsDiscarded")
    @JsonPropertyDescription("")
    private Double localRtpOctetsDiscarded;
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
     * 1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    @JsonPropertyDescription("1-5 1dp")
    private Double mosCqe;
    /**
     * 
     * 
     */
    @JsonProperty("packetsLost")
    @JsonPropertyDescription("")
    private Double packetsLost;
    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP)
     * and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee).
     * Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    @JsonPropertyDescription("Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP) and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee). Decimal (2 dp)")
    private Double packetLossPercent;
    /**
     * 0-100
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * adjacency name (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    public String getAdjacencyName() {
        return adjacencyName;
    }
    
    /**
     * adjacency name (Required)
     * 
     */
    @JsonProperty("adjacencyName")
    public void setAdjacencyName(String adjacencyName) {
        this.adjacencyName = adjacencyName;
    }
    
    /**
     * Either Caller or Callee (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    public EndOfCallVqmSummaries.EndpointDescription getEndpointDescription() {
        return endpointDescription;
    }
    
    /**
     * Either Caller or Callee (Required)
     * 
     */
    @JsonProperty("endpointDescription")
    public void setEndpointDescription(
            EndOfCallVqmSummaries.EndpointDescription endpointDescription) {
        this.endpointDescription = endpointDescription;
    }
    
    /**
     * 
     * 
     */
    @JsonProperty("endpointJitter")
    public Double getEndpointJitter() {
        return endpointJitter;
    }
    
    /**
     * 
     * 
     */
    @JsonProperty("endpointJitter")
    public void setEndpointJitter(Double endpointJitter) {
        this.endpointJitter = endpointJitter;
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
     * 
     * 
     */
    @JsonProperty("localJitter")
    public Double getLocalJitter() {
        return localJitter;
    }
    
    /**
     * 
     * 
     */
    @JsonProperty("localJitter")
    public void setLocalJitter(Double localJitter) {
        this.localJitter = localJitter;
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
     * 1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    public Double getMosCqe() {
        return mosCqe;
    }
    
    /**
     * 1-5 1dp
     * 
     */
    @JsonProperty("mosCqe")
    public void setMosCqe(Double mosCqe) {
        this.mosCqe = mosCqe;
    }
    
    /**
     * 
     * 
     */
    @JsonProperty("packetsLost")
    public Double getPacketsLost() {
        return packetsLost;
    }
    
    /**
     * 
     * 
     */
    @JsonProperty("packetsLost")
    public void setPacketsLost(Double packetsLost) {
        this.packetsLost = packetsLost;
    }
    
    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP)
     * and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee).
     * Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    public Double getPacketLossPercent() {
        return packetLossPercent;
    }
    
    /**
     * Calculated percentage packet loss based on Endpoint RTP packets lost (as reported in RTCP)
     * and Local RTP packets sent. Direction is based on Endpoint description (Caller, Callee).
     * Decimal (2 dp)
     * 
     */
    @JsonProperty("packetLossPercent")
    public void setPacketLossPercent(Double packetLossPercent) {
        this.packetLossPercent = packetLossPercent;
    }
    
    /**
     * 0-100
     * 
     */
    @JsonProperty("rFactor")
    public Double getRFactor() {
        return rFactor;
    }
    
    /**
     * 0-100
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
        return new HashCodeBuilder().append(adjacencyName).append(endpointDescription)
                .append(endpointJitter).append(endpointRtpOctetsDiscarded)
                .append(endpointRtpOctetsReceived).append(endpointRtpOctetsSent)
                .append(endpointRtpPacketsDiscarded).append(endpointRtpPacketsReceived)
                .append(endpointRtpPacketsSent).append(localJitter).append(localRtpOctetsDiscarded)
                .append(localRtpOctetsReceived).append(localRtpOctetsSent)
                .append(localRtpPacketsDiscarded).append(localRtpPacketsReceived)
                .append(localRtpPacketsSent).append(mosCqe).append(packetsLost)
                .append(packetLossPercent).append(rFactor).append(roundTripDelay)
                .append(additionalProperties).toHashCode();
    }
    
    
    
    public enum EndpointDescription {
        
        CALLER("Caller"), CALLEE("Callee");
        private final String value;
        private final static Map<String, EndOfCallVqmSummaries.EndpointDescription> CONSTANTS =
                new HashMap<String, EndOfCallVqmSummaries.EndpointDescription>();
        
        static {
            for (EndOfCallVqmSummaries.EndpointDescription c : values()) {
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
