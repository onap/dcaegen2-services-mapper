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
 * describes the performance and errors of an identified virtual network interface card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"receivedBroadcastPacketsAccumulated", "receivedBroadcastPacketsDelta",
        "receivedDiscardedPacketsAccumulated", "receivedDiscardedPacketsDelta",
        "receivedErrorPacketsAccumulated", "receivedErrorPacketsDelta",
        "receivedMulticastPacketsAccumulated", "receivedMulticastPacketsDelta",
        "receivedOctetsAccumulated", "receivedOctetsDelta", "receivedTotalPacketsAccumulated",
        "receivedTotalPacketsDelta", "receivedUnicastPacketsAccumulated",
        "receivedUnicastPacketsDelta", "transmittedBroadcastPacketsAccumulated",
        "transmittedBroadcastPacketsDelta", "transmittedDiscardedPacketsAccumulated",
        "transmittedDiscardedPacketsDelta", "transmittedErrorPacketsAccumulated",
        "transmittedErrorPacketsDelta", "transmittedMulticastPacketsAccumulated",
        "transmittedMulticastPacketsDelta", "transmittedOctetsAccumulated",
        "transmittedOctetsDelta", "transmittedTotalPacketsAccumulated",
        "transmittedTotalPacketsDelta", "transmittedUnicastPacketsAccumulated",
        "transmittedUnicastPacketsDelta", "valuesAreSuspect", "vNicIdentifier"})
public class VNicPerformanceArray {
    
    /**
     * Cumulative count of broadcast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of broadcast packets received as read at the end of the measurement interval")
    private Double receivedBroadcastPacketsAccumulated;
    /**
     * Count of broadcast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsDelta")
    @JsonPropertyDescription("Count of broadcast packets received within the measurement interval")
    private Double receivedBroadcastPacketsDelta;
    /**
     * Cumulative count of discarded packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of discarded packets received as read at the end of the measurement interval")
    private Double receivedDiscardedPacketsAccumulated;
    /**
     * Count of discarded packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsDelta")
    @JsonPropertyDescription("Count of discarded packets received within the measurement interval")
    private Double receivedDiscardedPacketsDelta;
    /**
     * Cumulative count of error packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of error packets received as read at the end of the measurement interval")
    private Double receivedErrorPacketsAccumulated;
    /**
     * Count of error packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsDelta")
    @JsonPropertyDescription("Count of error packets received within the measurement interval")
    private Double receivedErrorPacketsDelta;
    /**
     * Cumulative count of multicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of multicast packets received as read at the end of the measurement interval")
    private Double receivedMulticastPacketsAccumulated;
    /**
     * Count of multicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsDelta")
    @JsonPropertyDescription("Count of multicast packets received within the measurement interval")
    private Double receivedMulticastPacketsDelta;
    /**
     * Cumulative count of octets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsAccumulated")
    @JsonPropertyDescription("Cumulative count of octets received as read at the end of the measurement interval")
    private Double receivedOctetsAccumulated;
    /**
     * Count of octets received within the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsDelta")
    @JsonPropertyDescription("Count of octets received within the measurement interval")
    private Double receivedOctetsDelta;
    /**
     * Cumulative count of all packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of all packets received as read at the end of the measurement interval")
    private Double receivedTotalPacketsAccumulated;
    /**
     * Count of all packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsDelta")
    @JsonPropertyDescription("Count of all packets received within the measurement interval")
    private Double receivedTotalPacketsDelta;
    /**
     * Cumulative count of unicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of unicast packets received as read at the end of the measurement interval")
    private Double receivedUnicastPacketsAccumulated;
    /**
     * Count of unicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsDelta")
    @JsonPropertyDescription("Count of unicast packets received within the measurement interval")
    private Double receivedUnicastPacketsDelta;
    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of broadcast packets transmitted as read at the end of the measurement interval")
    private Double transmittedBroadcastPacketsAccumulated;
    /**
     * Count of broadcast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsDelta")
    @JsonPropertyDescription("Count of broadcast packets transmitted within the measurement interval")
    private Double transmittedBroadcastPacketsDelta;
    /**
     * Cumulative count of discarded packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of discarded packets transmitted as read at the end of the measurement interval")
    private Double transmittedDiscardedPacketsAccumulated;
    /**
     * Count of discarded packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsDelta")
    @JsonPropertyDescription("Count of discarded packets transmitted within the measurement interval")
    private Double transmittedDiscardedPacketsDelta;
    /**
     * Cumulative count of error packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of error packets transmitted as read at the end of the measurement interval")
    private Double transmittedErrorPacketsAccumulated;
    /**
     * Count of error packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsDelta")
    @JsonPropertyDescription("Count of error packets transmitted within the measurement interval")
    private Double transmittedErrorPacketsDelta;
    /**
     * Cumulative count of multicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of multicast packets transmitted as read at the end of the measurement interval")
    private Double transmittedMulticastPacketsAccumulated;
    /**
     * Count of multicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsDelta")
    @JsonPropertyDescription("Count of multicast packets transmitted within the measurement interval")
    private Double transmittedMulticastPacketsDelta;
    /**
     * Cumulative count of octets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsAccumulated")
    @JsonPropertyDescription("Cumulative count of octets transmitted as read at the end of the measurement interval")
    private Double transmittedOctetsAccumulated;
    /**
     * Count of octets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsDelta")
    @JsonPropertyDescription("Count of octets transmitted within the measurement interval")
    private Double transmittedOctetsDelta;
    /**
     * Cumulative count of all packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of all packets transmitted as read at the end of the measurement interval")
    private Double transmittedTotalPacketsAccumulated;
    /**
     * Count of all packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsDelta")
    @JsonPropertyDescription("Count of all packets transmitted within the measurement interval")
    private Double transmittedTotalPacketsDelta;
    /**
     * Cumulative count of unicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    @JsonPropertyDescription("Cumulative count of unicast packets transmitted as read at the end of the measurement interval")
    private Double transmittedUnicastPacketsAccumulated;
    /**
     * Count of unicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsDelta")
    @JsonPropertyDescription("Count of unicast packets transmitted within the measurement interval")
    private Double transmittedUnicastPacketsDelta;
    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or
     * other condtions (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    @JsonPropertyDescription("Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or other condtions")
    private VNicPerformanceArray.ValuesAreSuspect valuesAreSuspect;
    /**
     * vNic identification (Required)
     * 
     */
    @JsonProperty("vNicIdentifier")
    @JsonPropertyDescription("vNic identification")
    private String vNicIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * Cumulative count of broadcast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsAccumulated")
    public Double getReceivedBroadcastPacketsAccumulated() {
        return receivedBroadcastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of broadcast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsAccumulated")
    public void setReceivedBroadcastPacketsAccumulated(Double receivedBroadcastPacketsAccumulated) {
        this.receivedBroadcastPacketsAccumulated = receivedBroadcastPacketsAccumulated;
    }
    
    /**
     * Count of broadcast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsDelta")
    public Double getReceivedBroadcastPacketsDelta() {
        return receivedBroadcastPacketsDelta;
    }
    
    /**
     * Count of broadcast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedBroadcastPacketsDelta")
    public void setReceivedBroadcastPacketsDelta(Double receivedBroadcastPacketsDelta) {
        this.receivedBroadcastPacketsDelta = receivedBroadcastPacketsDelta;
    }
    
    /**
     * Cumulative count of discarded packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsAccumulated")
    public Double getReceivedDiscardedPacketsAccumulated() {
        return receivedDiscardedPacketsAccumulated;
    }
    
    /**
     * Cumulative count of discarded packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsAccumulated")
    public void setReceivedDiscardedPacketsAccumulated(Double receivedDiscardedPacketsAccumulated) {
        this.receivedDiscardedPacketsAccumulated = receivedDiscardedPacketsAccumulated;
    }
    
    /**
     * Count of discarded packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsDelta")
    public Double getReceivedDiscardedPacketsDelta() {
        return receivedDiscardedPacketsDelta;
    }
    
    /**
     * Count of discarded packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedDiscardedPacketsDelta")
    public void setReceivedDiscardedPacketsDelta(Double receivedDiscardedPacketsDelta) {
        this.receivedDiscardedPacketsDelta = receivedDiscardedPacketsDelta;
    }
    
    /**
     * Cumulative count of error packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsAccumulated")
    public Double getReceivedErrorPacketsAccumulated() {
        return receivedErrorPacketsAccumulated;
    }
    
    /**
     * Cumulative count of error packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsAccumulated")
    public void setReceivedErrorPacketsAccumulated(Double receivedErrorPacketsAccumulated) {
        this.receivedErrorPacketsAccumulated = receivedErrorPacketsAccumulated;
    }
    
    /**
     * Count of error packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsDelta")
    public Double getReceivedErrorPacketsDelta() {
        return receivedErrorPacketsDelta;
    }
    
    /**
     * Count of error packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedErrorPacketsDelta")
    public void setReceivedErrorPacketsDelta(Double receivedErrorPacketsDelta) {
        this.receivedErrorPacketsDelta = receivedErrorPacketsDelta;
    }
    
    /**
     * Cumulative count of multicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsAccumulated")
    public Double getReceivedMulticastPacketsAccumulated() {
        return receivedMulticastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of multicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsAccumulated")
    public void setReceivedMulticastPacketsAccumulated(Double receivedMulticastPacketsAccumulated) {
        this.receivedMulticastPacketsAccumulated = receivedMulticastPacketsAccumulated;
    }
    
    /**
     * Count of multicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsDelta")
    public Double getReceivedMulticastPacketsDelta() {
        return receivedMulticastPacketsDelta;
    }
    
    /**
     * Count of multicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedMulticastPacketsDelta")
    public void setReceivedMulticastPacketsDelta(Double receivedMulticastPacketsDelta) {
        this.receivedMulticastPacketsDelta = receivedMulticastPacketsDelta;
    }
    
    /**
     * Cumulative count of octets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsAccumulated")
    public Double getReceivedOctetsAccumulated() {
        return receivedOctetsAccumulated;
    }
    
    /**
     * Cumulative count of octets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsAccumulated")
    public void setReceivedOctetsAccumulated(Double receivedOctetsAccumulated) {
        this.receivedOctetsAccumulated = receivedOctetsAccumulated;
    }
    
    /**
     * Count of octets received within the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsDelta")
    public Double getReceivedOctetsDelta() {
        return receivedOctetsDelta;
    }
    
    /**
     * Count of octets received within the measurement interval
     * 
     */
    @JsonProperty("receivedOctetsDelta")
    public void setReceivedOctetsDelta(Double receivedOctetsDelta) {
        this.receivedOctetsDelta = receivedOctetsDelta;
    }
    
    /**
     * Cumulative count of all packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsAccumulated")
    public Double getReceivedTotalPacketsAccumulated() {
        return receivedTotalPacketsAccumulated;
    }
    
    /**
     * Cumulative count of all packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsAccumulated")
    public void setReceivedTotalPacketsAccumulated(Double receivedTotalPacketsAccumulated) {
        this.receivedTotalPacketsAccumulated = receivedTotalPacketsAccumulated;
    }
    
    /**
     * Count of all packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsDelta")
    public Double getReceivedTotalPacketsDelta() {
        return receivedTotalPacketsDelta;
    }
    
    /**
     * Count of all packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedTotalPacketsDelta")
    public void setReceivedTotalPacketsDelta(Double receivedTotalPacketsDelta) {
        this.receivedTotalPacketsDelta = receivedTotalPacketsDelta;
    }
    
    /**
     * Cumulative count of unicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsAccumulated")
    public Double getReceivedUnicastPacketsAccumulated() {
        return receivedUnicastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of unicast packets received as read at the end of the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsAccumulated")
    public void setReceivedUnicastPacketsAccumulated(Double receivedUnicastPacketsAccumulated) {
        this.receivedUnicastPacketsAccumulated = receivedUnicastPacketsAccumulated;
    }
    
    /**
     * Count of unicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsDelta")
    public Double getReceivedUnicastPacketsDelta() {
        return receivedUnicastPacketsDelta;
    }
    
    /**
     * Count of unicast packets received within the measurement interval
     * 
     */
    @JsonProperty("receivedUnicastPacketsDelta")
    public void setReceivedUnicastPacketsDelta(Double receivedUnicastPacketsDelta) {
        this.receivedUnicastPacketsDelta = receivedUnicastPacketsDelta;
    }
    
    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public Double getTransmittedBroadcastPacketsAccumulated() {
        return transmittedBroadcastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public void setTransmittedBroadcastPacketsAccumulated(
            Double transmittedBroadcastPacketsAccumulated) {
        this.transmittedBroadcastPacketsAccumulated = transmittedBroadcastPacketsAccumulated;
    }
    
    /**
     * Count of broadcast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsDelta")
    public Double getTransmittedBroadcastPacketsDelta() {
        return transmittedBroadcastPacketsDelta;
    }
    
    /**
     * Count of broadcast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsDelta")
    public void setTransmittedBroadcastPacketsDelta(Double transmittedBroadcastPacketsDelta) {
        this.transmittedBroadcastPacketsDelta = transmittedBroadcastPacketsDelta;
    }
    
    /**
     * Cumulative count of discarded packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public Double getTransmittedDiscardedPacketsAccumulated() {
        return transmittedDiscardedPacketsAccumulated;
    }
    
    /**
     * Cumulative count of discarded packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public void setTransmittedDiscardedPacketsAccumulated(
            Double transmittedDiscardedPacketsAccumulated) {
        this.transmittedDiscardedPacketsAccumulated = transmittedDiscardedPacketsAccumulated;
    }
    
    /**
     * Count of discarded packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsDelta")
    public Double getTransmittedDiscardedPacketsDelta() {
        return transmittedDiscardedPacketsDelta;
    }
    
    /**
     * Count of discarded packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsDelta")
    public void setTransmittedDiscardedPacketsDelta(Double transmittedDiscardedPacketsDelta) {
        this.transmittedDiscardedPacketsDelta = transmittedDiscardedPacketsDelta;
    }
    
    /**
     * Cumulative count of error packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsAccumulated")
    public Double getTransmittedErrorPacketsAccumulated() {
        return transmittedErrorPacketsAccumulated;
    }
    
    /**
     * Cumulative count of error packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsAccumulated")
    public void setTransmittedErrorPacketsAccumulated(Double transmittedErrorPacketsAccumulated) {
        this.transmittedErrorPacketsAccumulated = transmittedErrorPacketsAccumulated;
    }
    
    /**
     * Count of error packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsDelta")
    public Double getTransmittedErrorPacketsDelta() {
        return transmittedErrorPacketsDelta;
    }
    
    /**
     * Count of error packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedErrorPacketsDelta")
    public void setTransmittedErrorPacketsDelta(Double transmittedErrorPacketsDelta) {
        this.transmittedErrorPacketsDelta = transmittedErrorPacketsDelta;
    }
    
    /**
     * Cumulative count of multicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public Double getTransmittedMulticastPacketsAccumulated() {
        return transmittedMulticastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of multicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public void setTransmittedMulticastPacketsAccumulated(
            Double transmittedMulticastPacketsAccumulated) {
        this.transmittedMulticastPacketsAccumulated = transmittedMulticastPacketsAccumulated;
    }
    
    /**
     * Count of multicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsDelta")
    public Double getTransmittedMulticastPacketsDelta() {
        return transmittedMulticastPacketsDelta;
    }
    
    /**
     * Count of multicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsDelta")
    public void setTransmittedMulticastPacketsDelta(Double transmittedMulticastPacketsDelta) {
        this.transmittedMulticastPacketsDelta = transmittedMulticastPacketsDelta;
    }
    
    /**
     * Cumulative count of octets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsAccumulated")
    public Double getTransmittedOctetsAccumulated() {
        return transmittedOctetsAccumulated;
    }
    
    /**
     * Cumulative count of octets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsAccumulated")
    public void setTransmittedOctetsAccumulated(Double transmittedOctetsAccumulated) {
        this.transmittedOctetsAccumulated = transmittedOctetsAccumulated;
    }
    
    /**
     * Count of octets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsDelta")
    public Double getTransmittedOctetsDelta() {
        return transmittedOctetsDelta;
    }
    
    /**
     * Count of octets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedOctetsDelta")
    public void setTransmittedOctetsDelta(Double transmittedOctetsDelta) {
        this.transmittedOctetsDelta = transmittedOctetsDelta;
    }
    
    /**
     * Cumulative count of all packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsAccumulated")
    public Double getTransmittedTotalPacketsAccumulated() {
        return transmittedTotalPacketsAccumulated;
    }
    
    /**
     * Cumulative count of all packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsAccumulated")
    public void setTransmittedTotalPacketsAccumulated(Double transmittedTotalPacketsAccumulated) {
        this.transmittedTotalPacketsAccumulated = transmittedTotalPacketsAccumulated;
    }
    
    /**
     * Count of all packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsDelta")
    public Double getTransmittedTotalPacketsDelta() {
        return transmittedTotalPacketsDelta;
    }
    
    /**
     * Count of all packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedTotalPacketsDelta")
    public void setTransmittedTotalPacketsDelta(Double transmittedTotalPacketsDelta) {
        this.transmittedTotalPacketsDelta = transmittedTotalPacketsDelta;
    }
    
    /**
     * Cumulative count of unicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public Double getTransmittedUnicastPacketsAccumulated() {
        return transmittedUnicastPacketsAccumulated;
    }
    
    /**
     * Cumulative count of unicast packets transmitted as read at the end of the measurement
     * interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public void setTransmittedUnicastPacketsAccumulated(
            Double transmittedUnicastPacketsAccumulated) {
        this.transmittedUnicastPacketsAccumulated = transmittedUnicastPacketsAccumulated;
    }
    
    /**
     * Count of unicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsDelta")
    public Double getTransmittedUnicastPacketsDelta() {
        return transmittedUnicastPacketsDelta;
    }
    
    /**
     * Count of unicast packets transmitted within the measurement interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsDelta")
    public void setTransmittedUnicastPacketsDelta(Double transmittedUnicastPacketsDelta) {
        this.transmittedUnicastPacketsDelta = transmittedUnicastPacketsDelta;
    }
    
    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or
     * other condtions (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    public VNicPerformanceArray.ValuesAreSuspect getValuesAreSuspect() {
        return valuesAreSuspect;
    }
    
    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or
     * other condtions (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    public void setValuesAreSuspect(VNicPerformanceArray.ValuesAreSuspect valuesAreSuspect) {
        this.valuesAreSuspect = valuesAreSuspect;
    }
    
    /**
     * vNic identification (Required)
     * 
     */
    @JsonProperty("vNicIdentifier")
    public String getVNicIdentifier() {
        return vNicIdentifier;
    }
    
    /**
     * vNic identification (Required)
     * 
     */
    @JsonProperty("vNicIdentifier")
    public void setVNicIdentifier(String vNicIdentifier) {
        this.vNicIdentifier = vNicIdentifier;
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
        return new HashCodeBuilder().append(receivedBroadcastPacketsAccumulated)
                .append(receivedBroadcastPacketsDelta).append(receivedDiscardedPacketsAccumulated)
                .append(receivedDiscardedPacketsDelta).append(receivedErrorPacketsAccumulated)
                .append(receivedErrorPacketsDelta).append(receivedMulticastPacketsAccumulated)
                .append(receivedMulticastPacketsDelta).append(receivedOctetsAccumulated)
                .append(receivedOctetsDelta).append(receivedTotalPacketsAccumulated)
                .append(receivedTotalPacketsDelta).append(receivedUnicastPacketsAccumulated)
                .append(receivedUnicastPacketsDelta).append(transmittedBroadcastPacketsAccumulated)
                .append(transmittedBroadcastPacketsDelta)
                .append(transmittedDiscardedPacketsAccumulated)
                .append(transmittedDiscardedPacketsDelta).append(transmittedErrorPacketsAccumulated)
                .append(transmittedErrorPacketsDelta).append(transmittedMulticastPacketsAccumulated)
                .append(transmittedMulticastPacketsDelta).append(transmittedOctetsAccumulated)
                .append(transmittedOctetsDelta).append(transmittedTotalPacketsAccumulated)
                .append(transmittedTotalPacketsDelta).append(transmittedUnicastPacketsAccumulated)
                .append(transmittedUnicastPacketsDelta).append(valuesAreSuspect)
                .append(vNicIdentifier).append(additionalProperties).toHashCode();
    }
    
    
    
    public enum ValuesAreSuspect {
        
        TRUE("true"), FALSE("false");
        private final String value;
        private final static Map<String, VNicPerformanceArray.ValuesAreSuspect> CONSTANTS =
                new HashMap<String, VNicPerformanceArray.ValuesAreSuspect>();
        
        static {
            for (VNicPerformanceArray.ValuesAreSuspect c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }
        
        private ValuesAreSuspect(String value) {
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
        public static VNicPerformanceArray.ValuesAreSuspect fromValue(String value) {
            VNicPerformanceArray.ValuesAreSuspect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }
        
    }
    
}
