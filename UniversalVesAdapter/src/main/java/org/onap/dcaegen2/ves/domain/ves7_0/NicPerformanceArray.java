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
 * describes the performance and errors of an identified network interface card
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "administrativeState",
    "nicIdentifier",
    "operationalState",
    "receivedBroadcastPacketsAccumulated",
    "receivedBroadcastPacketsDelta",
    "receivedDiscardedPacketsAccumulated",
    "receivedDiscardedPacketsDelta",
    "receivedErrorPacketsAccumulated",
    "receivedErrorPacketsDelta",
    "receivedMulticastPacketsAccumulated",
    "receivedMulticastPacketsDelta",
    "receivedOctetsAccumulated",
    "receivedOctetsDelta",
    "receivedTotalPacketsAccumulated",
    "receivedPercentDiscard",
    "receivedPercentError",
    "receivedTotalPacketsDelta",
    "receivedUnicastPacketsAccumulated",
    "receivedUnicastPacketsDelta",
    "receivedUtilization",
    "speed",
    "transmittedBroadcastPacketsAccumulated",
    "transmittedBroadcastPacketsDelta",
    "transmittedDiscardedPacketsAccumulated",
    "transmittedDiscardedPacketsDelta",
    "transmittedErrorPacketsAccumulated",
    "transmittedErrorPacketsDelta",
    "transmittedMulticastPacketsAccumulated",
    "transmittedMulticastPacketsDelta",
    "transmittedOctetsAccumulated",
    "transmittedOctetsDelta",
    "transmittedTotalPacketsAccumulated",
    "transmittedTotalPacketsDelta",
    "transmittedUnicastPacketsAccumulated",
    "transmittedUnicastPacketsDelta",
    "transmittedPercentDiscard",
    "transmittedPercentError",
    "transmittedUtilization",
    "valuesAreSuspect"
})
public class NicPerformanceArray {

    /**
     * administrative state
     * 
     */
    @JsonProperty("administrativeState")
    @JsonPropertyDescription("administrative state")
    private NicPerformanceArray.AdministrativeState administrativeState;
    /**
     * nic identification
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    @JsonPropertyDescription("nic identification")
    private String nicIdentifier;
    /**
     * operational state
     * 
     */
    @JsonProperty("operationalState")
    @JsonPropertyDescription("operational state")
    private NicPerformanceArray.OperationalState operationalState;
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
     * Percentage of discarded packets received; value = (receivedDiscardedPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedPercentDiscard")
    @JsonPropertyDescription("Percentage of discarded packets received; value = (receivedDiscardedPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise")
    private Double receivedPercentDiscard;
    /**
     * Percentage of error packets received; value = (receivedErrorPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("receivedPercentError")
    @JsonPropertyDescription("Percentage of error packets received; value = (receivedErrorPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise.")
    private Double receivedPercentError;
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
     * Percentage of utilization received; value = (receivedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedUtilization")
    @JsonPropertyDescription("Percentage of utilization received; value = (receivedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise")
    private Double receivedUtilization;
    /**
     * Speed configured in mbps
     * 
     */
    @JsonProperty("speed")
    @JsonPropertyDescription("Speed configured in mbps")
    private Double speed;
    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement interval
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
     * Cumulative count of discarded packets transmitted as read at the end of the measurement interval
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
     * Cumulative count of multicast packets transmitted as read at the end of the measurement interval
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
     * Cumulative count of unicast packets transmitted as read at the end of the measurement interval
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
     * Percentage of discarded packets transmitted; value = (transmittedDiscardedPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentDiscard")
    @JsonPropertyDescription("Percentage of discarded packets transmitted; value = (transmittedDiscardedPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise")
    private Double transmittedPercentDiscard;
    /**
     * Percentage of error packets received; value = (transmittedErrorPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentError")
    @JsonPropertyDescription("Percentage of error packets received; value = (transmittedErrorPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise")
    private Double transmittedPercentError;
    /**
     * Percentage of utilization transmitted; value = (transmittedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("transmittedUtilization")
    @JsonPropertyDescription("Percentage of utilization transmitted; value = (transmittedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise.")
    private Double transmittedUtilization;
    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or other condtions
     * (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    @JsonPropertyDescription("Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or other condtions")
    private NicPerformanceArray.ValuesAreSuspect valuesAreSuspect;

    /**
     * administrative state
     * 
     */
    @JsonProperty("administrativeState")
    public NicPerformanceArray.AdministrativeState getAdministrativeState() {
        return administrativeState;
    }

    /**
     * administrative state
     * 
     */
    @JsonProperty("administrativeState")
    public void setAdministrativeState(NicPerformanceArray.AdministrativeState administrativeState) {
        this.administrativeState = administrativeState;
    }

    /**
     * nic identification
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    public String getNicIdentifier() {
        return nicIdentifier;
    }

    /**
     * nic identification
     * (Required)
     * 
     */
    @JsonProperty("nicIdentifier")
    public void setNicIdentifier(String nicIdentifier) {
        this.nicIdentifier = nicIdentifier;
    }

    /**
     * operational state
     * 
     */
    @JsonProperty("operationalState")
    public NicPerformanceArray.OperationalState getOperationalState() {
        return operationalState;
    }

    /**
     * operational state
     * 
     */
    @JsonProperty("operationalState")
    public void setOperationalState(NicPerformanceArray.OperationalState operationalState) {
        this.operationalState = operationalState;
    }

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
     * Percentage of discarded packets received; value = (receivedDiscardedPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedPercentDiscard")
    public Double getReceivedPercentDiscard() {
        return receivedPercentDiscard;
    }

    /**
     * Percentage of discarded packets received; value = (receivedDiscardedPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedPercentDiscard")
    public void setReceivedPercentDiscard(Double receivedPercentDiscard) {
        this.receivedPercentDiscard = receivedPercentDiscard;
    }

    /**
     * Percentage of error packets received; value = (receivedErrorPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("receivedPercentError")
    public Double getReceivedPercentError() {
        return receivedPercentError;
    }

    /**
     * Percentage of error packets received; value = (receivedErrorPacketsDelta / receivedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("receivedPercentError")
    public void setReceivedPercentError(Double receivedPercentError) {
        this.receivedPercentError = receivedPercentError;
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
     * Percentage of utilization received; value = (receivedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedUtilization")
    public Double getReceivedUtilization() {
        return receivedUtilization;
    }

    /**
     * Percentage of utilization received; value = (receivedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("receivedUtilization")
    public void setReceivedUtilization(Double receivedUtilization) {
        this.receivedUtilization = receivedUtilization;
    }

    /**
     * Speed configured in mbps
     * 
     */
    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    /**
     * Speed configured in mbps
     * 
     */
    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public Double getTransmittedBroadcastPacketsAccumulated() {
        return transmittedBroadcastPacketsAccumulated;
    }

    /**
     * Cumulative count of broadcast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public void setTransmittedBroadcastPacketsAccumulated(Double transmittedBroadcastPacketsAccumulated) {
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
     * Cumulative count of discarded packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public Double getTransmittedDiscardedPacketsAccumulated() {
        return transmittedDiscardedPacketsAccumulated;
    }

    /**
     * Cumulative count of discarded packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public void setTransmittedDiscardedPacketsAccumulated(Double transmittedDiscardedPacketsAccumulated) {
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
     * Cumulative count of multicast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public Double getTransmittedMulticastPacketsAccumulated() {
        return transmittedMulticastPacketsAccumulated;
    }

    /**
     * Cumulative count of multicast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public void setTransmittedMulticastPacketsAccumulated(Double transmittedMulticastPacketsAccumulated) {
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
     * Cumulative count of unicast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public Double getTransmittedUnicastPacketsAccumulated() {
        return transmittedUnicastPacketsAccumulated;
    }

    /**
     * Cumulative count of unicast packets transmitted as read at the end of the measurement interval
     * 
     */
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public void setTransmittedUnicastPacketsAccumulated(Double transmittedUnicastPacketsAccumulated) {
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
     * Percentage of discarded packets transmitted; value = (transmittedDiscardedPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentDiscard")
    public Double getTransmittedPercentDiscard() {
        return transmittedPercentDiscard;
    }

    /**
     * Percentage of discarded packets transmitted; value = (transmittedDiscardedPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentDiscard")
    public void setTransmittedPercentDiscard(Double transmittedPercentDiscard) {
        this.transmittedPercentDiscard = transmittedPercentDiscard;
    }

    /**
     * Percentage of error packets received; value = (transmittedErrorPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentError")
    public Double getTransmittedPercentError() {
        return transmittedPercentError;
    }

    /**
     * Percentage of error packets received; value = (transmittedErrorPacketsDelta / transmittedTotalPacketsDelta) x 100, if denominator is nonzero, or 0, if otherwise
     * 
     */
    @JsonProperty("transmittedPercentError")
    public void setTransmittedPercentError(Double transmittedPercentError) {
        this.transmittedPercentError = transmittedPercentError;
    }

    /**
     * Percentage of utilization transmitted; value = (transmittedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("transmittedUtilization")
    public Double getTransmittedUtilization() {
        return transmittedUtilization;
    }

    /**
     * Percentage of utilization transmitted; value = (transmittedOctetsDelta / (speed x (lastEpochMicrosec - startEpochMicrosec))) x 100, if denominator is nonzero, or 0, if otherwise.
     * 
     */
    @JsonProperty("transmittedUtilization")
    public void setTransmittedUtilization(Double transmittedUtilization) {
        this.transmittedUtilization = transmittedUtilization;
    }

    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or other condtions
     * (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    public NicPerformanceArray.ValuesAreSuspect getValuesAreSuspect() {
        return valuesAreSuspect;
    }

    /**
     * Indicates whether vNicPerformance values are likely inaccurate due to counter overflow or other condtions
     * (Required)
     * 
     */
    @JsonProperty("valuesAreSuspect")
    public void setValuesAreSuspect(NicPerformanceArray.ValuesAreSuspect valuesAreSuspect) {
        this.valuesAreSuspect = valuesAreSuspect;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(administrativeState).append(nicIdentifier).append(operationalState).append(receivedBroadcastPacketsAccumulated).append(receivedBroadcastPacketsDelta).append(receivedDiscardedPacketsAccumulated).append(receivedDiscardedPacketsDelta).append(receivedErrorPacketsAccumulated).append(receivedErrorPacketsDelta).append(receivedMulticastPacketsAccumulated).append(receivedMulticastPacketsDelta).append(receivedOctetsAccumulated).append(receivedOctetsDelta).append(receivedTotalPacketsAccumulated).append(receivedPercentDiscard).append(receivedPercentError).append(receivedTotalPacketsDelta).append(receivedUnicastPacketsAccumulated).append(receivedUnicastPacketsDelta).append(receivedUtilization).append(speed).append(transmittedBroadcastPacketsAccumulated).append(transmittedBroadcastPacketsDelta).append(transmittedDiscardedPacketsAccumulated).append(transmittedDiscardedPacketsDelta).append(transmittedErrorPacketsAccumulated).append(transmittedErrorPacketsDelta).append(transmittedMulticastPacketsAccumulated).append(transmittedMulticastPacketsDelta).append(transmittedOctetsAccumulated).append(transmittedOctetsDelta).append(transmittedTotalPacketsAccumulated).append(transmittedTotalPacketsDelta).append(transmittedUnicastPacketsAccumulated).append(transmittedUnicastPacketsDelta).append(transmittedPercentDiscard).append(transmittedPercentError).append(transmittedUtilization).append(valuesAreSuspect).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NicPerformanceArray) == false) {
            return false;
        }
        NicPerformanceArray rhs = ((NicPerformanceArray) other);
        return new EqualsBuilder().append(administrativeState, rhs.administrativeState).append(nicIdentifier, rhs.nicIdentifier).append(operationalState, rhs.operationalState).append(receivedBroadcastPacketsAccumulated, rhs.receivedBroadcastPacketsAccumulated).append(receivedBroadcastPacketsDelta, rhs.receivedBroadcastPacketsDelta).append(receivedDiscardedPacketsAccumulated, rhs.receivedDiscardedPacketsAccumulated).append(receivedDiscardedPacketsDelta, rhs.receivedDiscardedPacketsDelta).append(receivedErrorPacketsAccumulated, rhs.receivedErrorPacketsAccumulated).append(receivedErrorPacketsDelta, rhs.receivedErrorPacketsDelta).append(receivedMulticastPacketsAccumulated, rhs.receivedMulticastPacketsAccumulated).append(receivedMulticastPacketsDelta, rhs.receivedMulticastPacketsDelta).append(receivedOctetsAccumulated, rhs.receivedOctetsAccumulated).append(receivedOctetsDelta, rhs.receivedOctetsDelta).append(receivedTotalPacketsAccumulated, rhs.receivedTotalPacketsAccumulated).append(receivedPercentDiscard, rhs.receivedPercentDiscard).append(receivedPercentError, rhs.receivedPercentError).append(receivedTotalPacketsDelta, rhs.receivedTotalPacketsDelta).append(receivedUnicastPacketsAccumulated, rhs.receivedUnicastPacketsAccumulated).append(receivedUnicastPacketsDelta, rhs.receivedUnicastPacketsDelta).append(receivedUtilization, rhs.receivedUtilization).append(speed, rhs.speed).append(transmittedBroadcastPacketsAccumulated, rhs.transmittedBroadcastPacketsAccumulated).append(transmittedBroadcastPacketsDelta, rhs.transmittedBroadcastPacketsDelta).append(transmittedDiscardedPacketsAccumulated, rhs.transmittedDiscardedPacketsAccumulated).append(transmittedDiscardedPacketsDelta, rhs.transmittedDiscardedPacketsDelta).append(transmittedErrorPacketsAccumulated, rhs.transmittedErrorPacketsAccumulated).append(transmittedErrorPacketsDelta, rhs.transmittedErrorPacketsDelta).append(transmittedMulticastPacketsAccumulated, rhs.transmittedMulticastPacketsAccumulated).append(transmittedMulticastPacketsDelta, rhs.transmittedMulticastPacketsDelta).append(transmittedOctetsAccumulated, rhs.transmittedOctetsAccumulated).append(transmittedOctetsDelta, rhs.transmittedOctetsDelta).append(transmittedTotalPacketsAccumulated, rhs.transmittedTotalPacketsAccumulated).append(transmittedTotalPacketsDelta, rhs.transmittedTotalPacketsDelta).append(transmittedUnicastPacketsAccumulated, rhs.transmittedUnicastPacketsAccumulated).append(transmittedUnicastPacketsDelta, rhs.transmittedUnicastPacketsDelta).append(transmittedPercentDiscard, rhs.transmittedPercentDiscard).append(transmittedPercentError, rhs.transmittedPercentError).append(transmittedUtilization, rhs.transmittedUtilization).append(valuesAreSuspect, rhs.valuesAreSuspect).isEquals();
    }

    public enum AdministrativeState {

        IN_SERVICE("inService"),
        OUT_OF_SERVICE("outOfService");
        private final String value;
        private final static Map<String, NicPerformanceArray.AdministrativeState> CONSTANTS = new HashMap<String, NicPerformanceArray.AdministrativeState>();

        static {
            for (NicPerformanceArray.AdministrativeState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AdministrativeState(String value) {
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
        public static NicPerformanceArray.AdministrativeState fromValue(String value) {
            NicPerformanceArray.AdministrativeState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OperationalState {

        IN_SERVICE("inService"),
        OUT_OF_SERVICE("outOfService");
        private final String value;
        private final static Map<String, NicPerformanceArray.OperationalState> CONSTANTS = new HashMap<String, NicPerformanceArray.OperationalState>();

        static {
            for (NicPerformanceArray.OperationalState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OperationalState(String value) {
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
        public static NicPerformanceArray.OperationalState fromValue(String value) {
            NicPerformanceArray.OperationalState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ValuesAreSuspect {

        TRUE("true"),
        FALSE("false");
        private final String value;
        private final static Map<String, NicPerformanceArray.ValuesAreSuspect> CONSTANTS = new HashMap<String, NicPerformanceArray.ValuesAreSuspect>();

        static {
            for (NicPerformanceArray.ValuesAreSuspect c: values()) {
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
        public static NicPerformanceArray.ValuesAreSuspect fromValue(String value) {
            NicPerformanceArray.ValuesAreSuspect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
