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

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Mobility GTP Protocol per flow metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "avgBitErrorRate",
    "avgPacketDelayVariation",
    "avgPacketLatency",
    "avgReceiveThroughput",
    "avgTransmitThroughput",
    "durConnectionFailedStatus",
    "durTunnelFailedStatus",
    "flowActivatedBy",
    "flowActivationEpoch",
    "flowActivationMicrosec",
    "flowActivationTime",
    "flowDeactivatedBy",
    "flowDeactivationEpoch",
    "flowDeactivationMicrosec",
    "flowDeactivationTime",
    "flowStatus",
    "gtpConnectionStatus",
    "gtpTunnelStatus",
    "ipTosCountList",
    "ipTosList",
    "largePacketRtt",
    "largePacketThreshold",
    "maxPacketDelayVariation",
    "maxReceiveBitRate",
    "maxTransmitBitRate",
    "mobileQciCosCountList",
    "mobileQciCosList",
    "numActivationFailures",
    "numBitErrors",
    "numBytesReceived",
    "numBytesTransmitted",
    "numDroppedPackets",
    "numGtpEchoFailures",
    "numGtpTunnelErrors",
    "numHttpErrors",
    "numL7BytesReceived",
    "numL7BytesTransmitted",
    "numLostPackets",
    "numOutOfOrderPackets",
    "numPacketErrors",
    "numPacketsReceivedExclRetrans",
    "numPacketsReceivedInclRetrans",
    "numPacketsTransmittedInclRetrans",
    "numRetries",
    "numTimeouts",
    "numTunneledL7BytesReceived",
    "roundTripTime",
    "tcpFlagCountList",
    "tcpFlagList",
    "timeToFirstByte"
})
public class GtpPerFlowMetrics {

    /**
     * average bit error rate
     * (Required)
     * 
     */
    @JsonProperty("avgBitErrorRate")
    @JsonPropertyDescription("average bit error rate")
    private Double avgBitErrorRate;
    /**
     * Average packet delay variation or jitter in milliseconds for received packets: Average difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("avgPacketDelayVariation")
    @JsonPropertyDescription("Average packet delay variation or jitter in milliseconds for received packets: Average difference between the packet timestamp and time received for all pairs of consecutive packets")
    private Double avgPacketDelayVariation;
    /**
     * average delivery latency
     * (Required)
     * 
     */
    @JsonProperty("avgPacketLatency")
    @JsonPropertyDescription("average delivery latency")
    private Double avgPacketLatency;
    /**
     * average receive throughput
     * (Required)
     * 
     */
    @JsonProperty("avgReceiveThroughput")
    @JsonPropertyDescription("average receive throughput")
    private Double avgReceiveThroughput;
    /**
     * average transmit throughput
     * (Required)
     * 
     */
    @JsonProperty("avgTransmitThroughput")
    @JsonPropertyDescription("average transmit throughput")
    private Double avgTransmitThroughput;
    /**
     * duration of failed state in milliseconds, computed as the cumulative time between a failed echo request and the next following successful error request, over this reporting interval
     * 
     */
    @JsonProperty("durConnectionFailedStatus")
    @JsonPropertyDescription("duration of failed state in milliseconds, computed as the cumulative time between a failed echo request and the next following successful error request, over this reporting interval")
    private Double durConnectionFailedStatus;
    /**
     * Duration of errored state, computed as the cumulative time between a tunnel error indicator and the next following non-errored indicator, over this reporting interval
     * 
     */
    @JsonProperty("durTunnelFailedStatus")
    @JsonPropertyDescription("Duration of errored state, computed as the cumulative time between a tunnel error indicator and the next following non-errored indicator, over this reporting interval")
    private Double durTunnelFailedStatus;
    /**
     * Endpoint activating the flow
     * 
     */
    @JsonProperty("flowActivatedBy")
    @JsonPropertyDescription("Endpoint activating the flow")
    private String flowActivatedBy;
    /**
     * Time the connection is activated in the flow (connection) being reported on, or transmission time of the first packet if activation time is not available
     * (Required)
     * 
     */
    @JsonProperty("flowActivationEpoch")
    @JsonPropertyDescription("Time the connection is activated in the flow (connection) being reported on, or transmission time of the first packet if activation time is not available")
    private Double flowActivationEpoch;
    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowActivationMicrosec")
    @JsonPropertyDescription("Integer microseconds for the start of the flow connection")
    private Double flowActivationMicrosec;
    /**
     * time the connection is activated in the flow being reported on, or transmission time of the first packet if activation time is not available; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * 
     */
    @JsonProperty("flowActivationTime")
    @JsonPropertyDescription("time the connection is activated in the flow being reported on, or transmission time of the first packet if activation time is not available; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800")
    private String flowActivationTime;
    /**
     * Endpoint deactivating the flow
     * 
     */
    @JsonProperty("flowDeactivatedBy")
    @JsonPropertyDescription("Endpoint deactivating the flow")
    private String flowDeactivatedBy;
    /**
     * Time for the start of the flow connection, in integer UTC epoch time aka UNIX time
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationEpoch")
    @JsonPropertyDescription("Time for the start of the flow connection, in integer UTC epoch time aka UNIX time")
    private Double flowDeactivationEpoch;
    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationMicrosec")
    @JsonPropertyDescription("Integer microseconds for the start of the flow connection")
    private Double flowDeactivationMicrosec;
    /**
     * Transmission time of the first packet in the flow connection being reported on; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationTime")
    @JsonPropertyDescription("Transmission time of the first packet in the flow connection being reported on; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800")
    private String flowDeactivationTime;
    /**
     * connection status at reporting time as a working / inactive / failed indicator value
     * (Required)
     * 
     */
    @JsonProperty("flowStatus")
    @JsonPropertyDescription("connection status at reporting time as a working / inactive / failed indicator value")
    private String flowStatus;
    /**
     * Current connection state at reporting time
     * 
     */
    @JsonProperty("gtpConnectionStatus")
    @JsonPropertyDescription("Current connection state at reporting time")
    private String gtpConnectionStatus;
    /**
     * Current tunnel state  at reporting time
     * 
     */
    @JsonProperty("gtpTunnelStatus")
    @JsonPropertyDescription("Current tunnel state  at reporting time")
    private String gtpTunnelStatus;
    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("ipTosCountList")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation ipTosCountList;
    /**
     * Array of unique IP Type-of-Service values observed in the flow where values range from '0' to '255'
     * 
     */
    @JsonProperty("ipTosList")
    @JsonPropertyDescription("Array of unique IP Type-of-Service values observed in the flow where values range from '0' to '255'")
    private List<String> ipTosList = new ArrayList<String>();
    /**
     * large packet round trip time
     * 
     */
    @JsonProperty("largePacketRtt")
    @JsonPropertyDescription("large packet round trip time")
    private Double largePacketRtt;
    /**
     * large packet threshold being applied
     * 
     */
    @JsonProperty("largePacketThreshold")
    @JsonPropertyDescription("large packet threshold being applied")
    private Double largePacketThreshold;
    /**
     * Maximum packet delay variation or jitter in milliseconds for received packets: Maximum of the difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("maxPacketDelayVariation")
    @JsonPropertyDescription("Maximum packet delay variation or jitter in milliseconds for received packets: Maximum of the difference between the packet timestamp and time received for all pairs of consecutive packets")
    private Double maxPacketDelayVariation;
    /**
     * maximum receive bit rate
     * 
     */
    @JsonProperty("maxReceiveBitRate")
    @JsonPropertyDescription("maximum receive bit rate")
    private Double maxReceiveBitRate;
    /**
     * maximum transmit bit rate
     * 
     */
    @JsonProperty("maxTransmitBitRate")
    @JsonPropertyDescription("maximum transmit bit rate")
    private Double maxTransmitBitRate;
    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("mobileQciCosCountList")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation mobileQciCosCountList;
    /**
     * Array of unique LTE QCI or UMTS class-of-service values observed in the flow
     * 
     */
    @JsonProperty("mobileQciCosList")
    @JsonPropertyDescription("Array of unique LTE QCI or UMTS class-of-service values observed in the flow")
    private List<String> mobileQciCosList = new ArrayList<String>();
    /**
     * Number of failed activation requests, as observed by the reporting node
     * (Required)
     * 
     */
    @JsonProperty("numActivationFailures")
    @JsonPropertyDescription("Number of failed activation requests, as observed by the reporting node")
    private Double numActivationFailures;
    /**
     * number of errored bits
     * (Required)
     * 
     */
    @JsonProperty("numBitErrors")
    @JsonPropertyDescription("number of errored bits")
    private Double numBitErrors;
    /**
     * number of bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesReceived")
    @JsonPropertyDescription("number of bytes received, including retransmissions")
    private Double numBytesReceived;
    /**
     * number of bytes transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesTransmitted")
    @JsonPropertyDescription("number of bytes transmitted, including retransmissions")
    private Double numBytesTransmitted;
    /**
     * number of received packets dropped due to errors per virtual interface
     * (Required)
     * 
     */
    @JsonProperty("numDroppedPackets")
    @JsonPropertyDescription("number of received packets dropped due to errors per virtual interface")
    private Double numDroppedPackets;
    /**
     * Number of Echo request path failures where failed paths are defined in 3GPP TS 29.281 sec 7.2.1 and 3GPP TS 29.060 sec. 11.2
     * 
     */
    @JsonProperty("numGtpEchoFailures")
    @JsonPropertyDescription("Number of Echo request path failures where failed paths are defined in 3GPP TS 29.281 sec 7.2.1 and 3GPP TS 29.060 sec. 11.2")
    private Double numGtpEchoFailures;
    /**
     * Number of tunnel error indications where errors are defined in 3GPP TS 29.281 sec 7.3.1 and 3GPP TS 29.060 sec. 11.1
     * 
     */
    @JsonProperty("numGtpTunnelErrors")
    @JsonPropertyDescription("Number of tunnel error indications where errors are defined in 3GPP TS 29.281 sec 7.3.1 and 3GPP TS 29.060 sec. 11.1")
    private Double numGtpTunnelErrors;
    /**
     * Http error count
     * 
     */
    @JsonProperty("numHttpErrors")
    @JsonPropertyDescription("Http error count")
    private Double numHttpErrors;
    /**
     * number of tunneled layer 7 bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesReceived")
    @JsonPropertyDescription("number of tunneled layer 7 bytes received, including retransmissions")
    private Double numL7BytesReceived;
    /**
     * number of tunneled layer 7 bytes transmitted, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesTransmitted")
    @JsonPropertyDescription("number of tunneled layer 7 bytes transmitted, excluding retransmissions")
    private Double numL7BytesTransmitted;
    /**
     * number of lost packets
     * (Required)
     * 
     */
    @JsonProperty("numLostPackets")
    @JsonPropertyDescription("number of lost packets")
    private Double numLostPackets;
    /**
     * number of out-of-order packets
     * (Required)
     * 
     */
    @JsonProperty("numOutOfOrderPackets")
    @JsonPropertyDescription("number of out-of-order packets")
    private Double numOutOfOrderPackets;
    /**
     * number of errored packets
     * (Required)
     * 
     */
    @JsonProperty("numPacketErrors")
    @JsonPropertyDescription("number of errored packets")
    private Double numPacketErrors;
    /**
     * number of packets received, excluding retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedExclRetrans")
    @JsonPropertyDescription("number of packets received, excluding retransmission")
    private Double numPacketsReceivedExclRetrans;
    /**
     * number of packets received, including retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedInclRetrans")
    @JsonPropertyDescription("number of packets received, including retransmission")
    private Double numPacketsReceivedInclRetrans;
    /**
     * number of packets transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numPacketsTransmittedInclRetrans")
    @JsonPropertyDescription("number of packets transmitted, including retransmissions")
    private Double numPacketsTransmittedInclRetrans;
    /**
     * number of packet retries
     * (Required)
     * 
     */
    @JsonProperty("numRetries")
    @JsonPropertyDescription("number of packet retries")
    private Double numRetries;
    /**
     * number of packet timeouts
     * (Required)
     * 
     */
    @JsonProperty("numTimeouts")
    @JsonPropertyDescription("number of packet timeouts")
    private Double numTimeouts;
    /**
     * number of tunneled layer 7 bytes received, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numTunneledL7BytesReceived")
    @JsonPropertyDescription("number of tunneled layer 7 bytes received, excluding retransmissions")
    private Double numTunneledL7BytesReceived;
    /**
     * round trip time
     * (Required)
     * 
     */
    @JsonProperty("roundTripTime")
    @JsonPropertyDescription("round trip time")
    private Double roundTripTime;
    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("tcpFlagCountList")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation tcpFlagCountList;
    /**
     * Array of unique TCP Flags observed in the flow
     * 
     */
    @JsonProperty("tcpFlagList")
    @JsonPropertyDescription("Array of unique TCP Flags observed in the flow")
    private List<String> tcpFlagList = new ArrayList<String>();
    /**
     * Time in milliseconds between the connection activation and first byte received
     * (Required)
     * 
     */
    @JsonProperty("timeToFirstByte")
    @JsonPropertyDescription("Time in milliseconds between the connection activation and first byte received")
    private Double timeToFirstByte;

    /**
     * average bit error rate
     * (Required)
     * 
     */
    @JsonProperty("avgBitErrorRate")
    public Double getAvgBitErrorRate() {
        return avgBitErrorRate;
    }

    /**
     * average bit error rate
     * (Required)
     * 
     */
    @JsonProperty("avgBitErrorRate")
    public void setAvgBitErrorRate(Double avgBitErrorRate) {
        this.avgBitErrorRate = avgBitErrorRate;
    }

    /**
     * Average packet delay variation or jitter in milliseconds for received packets: Average difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("avgPacketDelayVariation")
    public Double getAvgPacketDelayVariation() {
        return avgPacketDelayVariation;
    }

    /**
     * Average packet delay variation or jitter in milliseconds for received packets: Average difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("avgPacketDelayVariation")
    public void setAvgPacketDelayVariation(Double avgPacketDelayVariation) {
        this.avgPacketDelayVariation = avgPacketDelayVariation;
    }

    /**
     * average delivery latency
     * (Required)
     * 
     */
    @JsonProperty("avgPacketLatency")
    public Double getAvgPacketLatency() {
        return avgPacketLatency;
    }

    /**
     * average delivery latency
     * (Required)
     * 
     */
    @JsonProperty("avgPacketLatency")
    public void setAvgPacketLatency(Double avgPacketLatency) {
        this.avgPacketLatency = avgPacketLatency;
    }

    /**
     * average receive throughput
     * (Required)
     * 
     */
    @JsonProperty("avgReceiveThroughput")
    public Double getAvgReceiveThroughput() {
        return avgReceiveThroughput;
    }

    /**
     * average receive throughput
     * (Required)
     * 
     */
    @JsonProperty("avgReceiveThroughput")
    public void setAvgReceiveThroughput(Double avgReceiveThroughput) {
        this.avgReceiveThroughput = avgReceiveThroughput;
    }

    /**
     * average transmit throughput
     * (Required)
     * 
     */
    @JsonProperty("avgTransmitThroughput")
    public Double getAvgTransmitThroughput() {
        return avgTransmitThroughput;
    }

    /**
     * average transmit throughput
     * (Required)
     * 
     */
    @JsonProperty("avgTransmitThroughput")
    public void setAvgTransmitThroughput(Double avgTransmitThroughput) {
        this.avgTransmitThroughput = avgTransmitThroughput;
    }

    /**
     * duration of failed state in milliseconds, computed as the cumulative time between a failed echo request and the next following successful error request, over this reporting interval
     * 
     */
    @JsonProperty("durConnectionFailedStatus")
    public Double getDurConnectionFailedStatus() {
        return durConnectionFailedStatus;
    }

    /**
     * duration of failed state in milliseconds, computed as the cumulative time between a failed echo request and the next following successful error request, over this reporting interval
     * 
     */
    @JsonProperty("durConnectionFailedStatus")
    public void setDurConnectionFailedStatus(Double durConnectionFailedStatus) {
        this.durConnectionFailedStatus = durConnectionFailedStatus;
    }

    /**
     * Duration of errored state, computed as the cumulative time between a tunnel error indicator and the next following non-errored indicator, over this reporting interval
     * 
     */
    @JsonProperty("durTunnelFailedStatus")
    public Double getDurTunnelFailedStatus() {
        return durTunnelFailedStatus;
    }

    /**
     * Duration of errored state, computed as the cumulative time between a tunnel error indicator and the next following non-errored indicator, over this reporting interval
     * 
     */
    @JsonProperty("durTunnelFailedStatus")
    public void setDurTunnelFailedStatus(Double durTunnelFailedStatus) {
        this.durTunnelFailedStatus = durTunnelFailedStatus;
    }

    /**
     * Endpoint activating the flow
     * 
     */
    @JsonProperty("flowActivatedBy")
    public String getFlowActivatedBy() {
        return flowActivatedBy;
    }

    /**
     * Endpoint activating the flow
     * 
     */
    @JsonProperty("flowActivatedBy")
    public void setFlowActivatedBy(String flowActivatedBy) {
        this.flowActivatedBy = flowActivatedBy;
    }

    /**
     * Time the connection is activated in the flow (connection) being reported on, or transmission time of the first packet if activation time is not available
     * (Required)
     * 
     */
    @JsonProperty("flowActivationEpoch")
    public Double getFlowActivationEpoch() {
        return flowActivationEpoch;
    }

    /**
     * Time the connection is activated in the flow (connection) being reported on, or transmission time of the first packet if activation time is not available
     * (Required)
     * 
     */
    @JsonProperty("flowActivationEpoch")
    public void setFlowActivationEpoch(Double flowActivationEpoch) {
        this.flowActivationEpoch = flowActivationEpoch;
    }

    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowActivationMicrosec")
    public Double getFlowActivationMicrosec() {
        return flowActivationMicrosec;
    }

    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowActivationMicrosec")
    public void setFlowActivationMicrosec(Double flowActivationMicrosec) {
        this.flowActivationMicrosec = flowActivationMicrosec;
    }

    /**
     * time the connection is activated in the flow being reported on, or transmission time of the first packet if activation time is not available; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * 
     */
    @JsonProperty("flowActivationTime")
    public String getFlowActivationTime() {
        return flowActivationTime;
    }

    /**
     * time the connection is activated in the flow being reported on, or transmission time of the first packet if activation time is not available; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * 
     */
    @JsonProperty("flowActivationTime")
    public void setFlowActivationTime(String flowActivationTime) {
        this.flowActivationTime = flowActivationTime;
    }

    /**
     * Endpoint deactivating the flow
     * 
     */
    @JsonProperty("flowDeactivatedBy")
    public String getFlowDeactivatedBy() {
        return flowDeactivatedBy;
    }

    /**
     * Endpoint deactivating the flow
     * 
     */
    @JsonProperty("flowDeactivatedBy")
    public void setFlowDeactivatedBy(String flowDeactivatedBy) {
        this.flowDeactivatedBy = flowDeactivatedBy;
    }

    /**
     * Time for the start of the flow connection, in integer UTC epoch time aka UNIX time
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationEpoch")
    public Double getFlowDeactivationEpoch() {
        return flowDeactivationEpoch;
    }

    /**
     * Time for the start of the flow connection, in integer UTC epoch time aka UNIX time
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationEpoch")
    public void setFlowDeactivationEpoch(Double flowDeactivationEpoch) {
        this.flowDeactivationEpoch = flowDeactivationEpoch;
    }

    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationMicrosec")
    public Double getFlowDeactivationMicrosec() {
        return flowDeactivationMicrosec;
    }

    /**
     * Integer microseconds for the start of the flow connection
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationMicrosec")
    public void setFlowDeactivationMicrosec(Double flowDeactivationMicrosec) {
        this.flowDeactivationMicrosec = flowDeactivationMicrosec;
    }

    /**
     * Transmission time of the first packet in the flow connection being reported on; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationTime")
    public String getFlowDeactivationTime() {
        return flowDeactivationTime;
    }

    /**
     * Transmission time of the first packet in the flow connection being reported on; with RFC 2822 compliant format: Sat, 13 Mar 2010 11:29:05 -0800
     * (Required)
     * 
     */
    @JsonProperty("flowDeactivationTime")
    public void setFlowDeactivationTime(String flowDeactivationTime) {
        this.flowDeactivationTime = flowDeactivationTime;
    }

    /**
     * connection status at reporting time as a working / inactive / failed indicator value
     * (Required)
     * 
     */
    @JsonProperty("flowStatus")
    public String getFlowStatus() {
        return flowStatus;
    }

    /**
     * connection status at reporting time as a working / inactive / failed indicator value
     * (Required)
     * 
     */
    @JsonProperty("flowStatus")
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    /**
     * Current connection state at reporting time
     * 
     */
    @JsonProperty("gtpConnectionStatus")
    public String getGtpConnectionStatus() {
        return gtpConnectionStatus;
    }

    /**
     * Current connection state at reporting time
     * 
     */
    @JsonProperty("gtpConnectionStatus")
    public void setGtpConnectionStatus(String gtpConnectionStatus) {
        this.gtpConnectionStatus = gtpConnectionStatus;
    }

    /**
     * Current tunnel state  at reporting time
     * 
     */
    @JsonProperty("gtpTunnelStatus")
    public String getGtpTunnelStatus() {
        return gtpTunnelStatus;
    }

    /**
     * Current tunnel state  at reporting time
     * 
     */
    @JsonProperty("gtpTunnelStatus")
    public void setGtpTunnelStatus(String gtpTunnelStatus) {
        this.gtpTunnelStatus = gtpTunnelStatus;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("ipTosCountList")
    public AlarmAdditionalInformation getIpTosCountList() {
        return ipTosCountList;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("ipTosCountList")
    public void setIpTosCountList(AlarmAdditionalInformation ipTosCountList) {
        this.ipTosCountList = ipTosCountList;
    }

    /**
     * Array of unique IP Type-of-Service values observed in the flow where values range from '0' to '255'
     * 
     */
    @JsonProperty("ipTosList")
    public List<String> getIpTosList() {
        return ipTosList;
    }

    /**
     * Array of unique IP Type-of-Service values observed in the flow where values range from '0' to '255'
     * 
     */
    @JsonProperty("ipTosList")
    public void setIpTosList(List<String> ipTosList) {
        this.ipTosList = ipTosList;
    }

    /**
     * large packet round trip time
     * 
     */
    @JsonProperty("largePacketRtt")
    public Double getLargePacketRtt() {
        return largePacketRtt;
    }

    /**
     * large packet round trip time
     * 
     */
    @JsonProperty("largePacketRtt")
    public void setLargePacketRtt(Double largePacketRtt) {
        this.largePacketRtt = largePacketRtt;
    }

    /**
     * large packet threshold being applied
     * 
     */
    @JsonProperty("largePacketThreshold")
    public Double getLargePacketThreshold() {
        return largePacketThreshold;
    }

    /**
     * large packet threshold being applied
     * 
     */
    @JsonProperty("largePacketThreshold")
    public void setLargePacketThreshold(Double largePacketThreshold) {
        this.largePacketThreshold = largePacketThreshold;
    }

    /**
     * Maximum packet delay variation or jitter in milliseconds for received packets: Maximum of the difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("maxPacketDelayVariation")
    public Double getMaxPacketDelayVariation() {
        return maxPacketDelayVariation;
    }

    /**
     * Maximum packet delay variation or jitter in milliseconds for received packets: Maximum of the difference between the packet timestamp and time received for all pairs of consecutive packets
     * (Required)
     * 
     */
    @JsonProperty("maxPacketDelayVariation")
    public void setMaxPacketDelayVariation(Double maxPacketDelayVariation) {
        this.maxPacketDelayVariation = maxPacketDelayVariation;
    }

    /**
     * maximum receive bit rate
     * 
     */
    @JsonProperty("maxReceiveBitRate")
    public Double getMaxReceiveBitRate() {
        return maxReceiveBitRate;
    }

    /**
     * maximum receive bit rate
     * 
     */
    @JsonProperty("maxReceiveBitRate")
    public void setMaxReceiveBitRate(Double maxReceiveBitRate) {
        this.maxReceiveBitRate = maxReceiveBitRate;
    }

    /**
     * maximum transmit bit rate
     * 
     */
    @JsonProperty("maxTransmitBitRate")
    public Double getMaxTransmitBitRate() {
        return maxTransmitBitRate;
    }

    /**
     * maximum transmit bit rate
     * 
     */
    @JsonProperty("maxTransmitBitRate")
    public void setMaxTransmitBitRate(Double maxTransmitBitRate) {
        this.maxTransmitBitRate = maxTransmitBitRate;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("mobileQciCosCountList")
    public AlarmAdditionalInformation getMobileQciCosCountList() {
        return mobileQciCosCountList;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("mobileQciCosCountList")
    public void setMobileQciCosCountList(AlarmAdditionalInformation mobileQciCosCountList) {
        this.mobileQciCosCountList = mobileQciCosCountList;
    }

    /**
     * Array of unique LTE QCI or UMTS class-of-service values observed in the flow
     * 
     */
    @JsonProperty("mobileQciCosList")
    public List<String> getMobileQciCosList() {
        return mobileQciCosList;
    }

    /**
     * Array of unique LTE QCI or UMTS class-of-service values observed in the flow
     * 
     */
    @JsonProperty("mobileQciCosList")
    public void setMobileQciCosList(List<String> mobileQciCosList) {
        this.mobileQciCosList = mobileQciCosList;
    }

    /**
     * Number of failed activation requests, as observed by the reporting node
     * (Required)
     * 
     */
    @JsonProperty("numActivationFailures")
    public Double getNumActivationFailures() {
        return numActivationFailures;
    }

    /**
     * Number of failed activation requests, as observed by the reporting node
     * (Required)
     * 
     */
    @JsonProperty("numActivationFailures")
    public void setNumActivationFailures(Double numActivationFailures) {
        this.numActivationFailures = numActivationFailures;
    }

    /**
     * number of errored bits
     * (Required)
     * 
     */
    @JsonProperty("numBitErrors")
    public Double getNumBitErrors() {
        return numBitErrors;
    }

    /**
     * number of errored bits
     * (Required)
     * 
     */
    @JsonProperty("numBitErrors")
    public void setNumBitErrors(Double numBitErrors) {
        this.numBitErrors = numBitErrors;
    }

    /**
     * number of bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesReceived")
    public Double getNumBytesReceived() {
        return numBytesReceived;
    }

    /**
     * number of bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesReceived")
    public void setNumBytesReceived(Double numBytesReceived) {
        this.numBytesReceived = numBytesReceived;
    }

    /**
     * number of bytes transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesTransmitted")
    public Double getNumBytesTransmitted() {
        return numBytesTransmitted;
    }

    /**
     * number of bytes transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numBytesTransmitted")
    public void setNumBytesTransmitted(Double numBytesTransmitted) {
        this.numBytesTransmitted = numBytesTransmitted;
    }

    /**
     * number of received packets dropped due to errors per virtual interface
     * (Required)
     * 
     */
    @JsonProperty("numDroppedPackets")
    public Double getNumDroppedPackets() {
        return numDroppedPackets;
    }

    /**
     * number of received packets dropped due to errors per virtual interface
     * (Required)
     * 
     */
    @JsonProperty("numDroppedPackets")
    public void setNumDroppedPackets(Double numDroppedPackets) {
        this.numDroppedPackets = numDroppedPackets;
    }

    /**
     * Number of Echo request path failures where failed paths are defined in 3GPP TS 29.281 sec 7.2.1 and 3GPP TS 29.060 sec. 11.2
     * 
     */
    @JsonProperty("numGtpEchoFailures")
    public Double getNumGtpEchoFailures() {
        return numGtpEchoFailures;
    }

    /**
     * Number of Echo request path failures where failed paths are defined in 3GPP TS 29.281 sec 7.2.1 and 3GPP TS 29.060 sec. 11.2
     * 
     */
    @JsonProperty("numGtpEchoFailures")
    public void setNumGtpEchoFailures(Double numGtpEchoFailures) {
        this.numGtpEchoFailures = numGtpEchoFailures;
    }

    /**
     * Number of tunnel error indications where errors are defined in 3GPP TS 29.281 sec 7.3.1 and 3GPP TS 29.060 sec. 11.1
     * 
     */
    @JsonProperty("numGtpTunnelErrors")
    public Double getNumGtpTunnelErrors() {
        return numGtpTunnelErrors;
    }

    /**
     * Number of tunnel error indications where errors are defined in 3GPP TS 29.281 sec 7.3.1 and 3GPP TS 29.060 sec. 11.1
     * 
     */
    @JsonProperty("numGtpTunnelErrors")
    public void setNumGtpTunnelErrors(Double numGtpTunnelErrors) {
        this.numGtpTunnelErrors = numGtpTunnelErrors;
    }

    /**
     * Http error count
     * 
     */
    @JsonProperty("numHttpErrors")
    public Double getNumHttpErrors() {
        return numHttpErrors;
    }

    /**
     * Http error count
     * 
     */
    @JsonProperty("numHttpErrors")
    public void setNumHttpErrors(Double numHttpErrors) {
        this.numHttpErrors = numHttpErrors;
    }

    /**
     * number of tunneled layer 7 bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesReceived")
    public Double getNumL7BytesReceived() {
        return numL7BytesReceived;
    }

    /**
     * number of tunneled layer 7 bytes received, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesReceived")
    public void setNumL7BytesReceived(Double numL7BytesReceived) {
        this.numL7BytesReceived = numL7BytesReceived;
    }

    /**
     * number of tunneled layer 7 bytes transmitted, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesTransmitted")
    public Double getNumL7BytesTransmitted() {
        return numL7BytesTransmitted;
    }

    /**
     * number of tunneled layer 7 bytes transmitted, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numL7BytesTransmitted")
    public void setNumL7BytesTransmitted(Double numL7BytesTransmitted) {
        this.numL7BytesTransmitted = numL7BytesTransmitted;
    }

    /**
     * number of lost packets
     * (Required)
     * 
     */
    @JsonProperty("numLostPackets")
    public Double getNumLostPackets() {
        return numLostPackets;
    }

    /**
     * number of lost packets
     * (Required)
     * 
     */
    @JsonProperty("numLostPackets")
    public void setNumLostPackets(Double numLostPackets) {
        this.numLostPackets = numLostPackets;
    }

    /**
     * number of out-of-order packets
     * (Required)
     * 
     */
    @JsonProperty("numOutOfOrderPackets")
    public Double getNumOutOfOrderPackets() {
        return numOutOfOrderPackets;
    }

    /**
     * number of out-of-order packets
     * (Required)
     * 
     */
    @JsonProperty("numOutOfOrderPackets")
    public void setNumOutOfOrderPackets(Double numOutOfOrderPackets) {
        this.numOutOfOrderPackets = numOutOfOrderPackets;
    }

    /**
     * number of errored packets
     * (Required)
     * 
     */
    @JsonProperty("numPacketErrors")
    public Double getNumPacketErrors() {
        return numPacketErrors;
    }

    /**
     * number of errored packets
     * (Required)
     * 
     */
    @JsonProperty("numPacketErrors")
    public void setNumPacketErrors(Double numPacketErrors) {
        this.numPacketErrors = numPacketErrors;
    }

    /**
     * number of packets received, excluding retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedExclRetrans")
    public Double getNumPacketsReceivedExclRetrans() {
        return numPacketsReceivedExclRetrans;
    }

    /**
     * number of packets received, excluding retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedExclRetrans")
    public void setNumPacketsReceivedExclRetrans(Double numPacketsReceivedExclRetrans) {
        this.numPacketsReceivedExclRetrans = numPacketsReceivedExclRetrans;
    }

    /**
     * number of packets received, including retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedInclRetrans")
    public Double getNumPacketsReceivedInclRetrans() {
        return numPacketsReceivedInclRetrans;
    }

    /**
     * number of packets received, including retransmission
     * (Required)
     * 
     */
    @JsonProperty("numPacketsReceivedInclRetrans")
    public void setNumPacketsReceivedInclRetrans(Double numPacketsReceivedInclRetrans) {
        this.numPacketsReceivedInclRetrans = numPacketsReceivedInclRetrans;
    }

    /**
     * number of packets transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numPacketsTransmittedInclRetrans")
    public Double getNumPacketsTransmittedInclRetrans() {
        return numPacketsTransmittedInclRetrans;
    }

    /**
     * number of packets transmitted, including retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numPacketsTransmittedInclRetrans")
    public void setNumPacketsTransmittedInclRetrans(Double numPacketsTransmittedInclRetrans) {
        this.numPacketsTransmittedInclRetrans = numPacketsTransmittedInclRetrans;
    }

    /**
     * number of packet retries
     * (Required)
     * 
     */
    @JsonProperty("numRetries")
    public Double getNumRetries() {
        return numRetries;
    }

    /**
     * number of packet retries
     * (Required)
     * 
     */
    @JsonProperty("numRetries")
    public void setNumRetries(Double numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * number of packet timeouts
     * (Required)
     * 
     */
    @JsonProperty("numTimeouts")
    public Double getNumTimeouts() {
        return numTimeouts;
    }

    /**
     * number of packet timeouts
     * (Required)
     * 
     */
    @JsonProperty("numTimeouts")
    public void setNumTimeouts(Double numTimeouts) {
        this.numTimeouts = numTimeouts;
    }

    /**
     * number of tunneled layer 7 bytes received, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numTunneledL7BytesReceived")
    public Double getNumTunneledL7BytesReceived() {
        return numTunneledL7BytesReceived;
    }

    /**
     * number of tunneled layer 7 bytes received, excluding retransmissions
     * (Required)
     * 
     */
    @JsonProperty("numTunneledL7BytesReceived")
    public void setNumTunneledL7BytesReceived(Double numTunneledL7BytesReceived) {
        this.numTunneledL7BytesReceived = numTunneledL7BytesReceived;
    }

    /**
     * round trip time
     * (Required)
     * 
     */
    @JsonProperty("roundTripTime")
    public Double getRoundTripTime() {
        return roundTripTime;
    }

    /**
     * round trip time
     * (Required)
     * 
     */
    @JsonProperty("roundTripTime")
    public void setRoundTripTime(Double roundTripTime) {
        this.roundTripTime = roundTripTime;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("tcpFlagCountList")
    public AlarmAdditionalInformation getTcpFlagCountList() {
        return tcpFlagCountList;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("tcpFlagCountList")
    public void setTcpFlagCountList(AlarmAdditionalInformation tcpFlagCountList) {
        this.tcpFlagCountList = tcpFlagCountList;
    }

    /**
     * Array of unique TCP Flags observed in the flow
     * 
     */
    @JsonProperty("tcpFlagList")
    public List<String> getTcpFlagList() {
        return tcpFlagList;
    }

    /**
     * Array of unique TCP Flags observed in the flow
     * 
     */
    @JsonProperty("tcpFlagList")
    public void setTcpFlagList(List<String> tcpFlagList) {
        this.tcpFlagList = tcpFlagList;
    }

    /**
     * Time in milliseconds between the connection activation and first byte received
     * (Required)
     * 
     */
    @JsonProperty("timeToFirstByte")
    public Double getTimeToFirstByte() {
        return timeToFirstByte;
    }

    /**
     * Time in milliseconds between the connection activation and first byte received
     * (Required)
     * 
     */
    @JsonProperty("timeToFirstByte")
    public void setTimeToFirstByte(Double timeToFirstByte) {
        this.timeToFirstByte = timeToFirstByte;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(avgBitErrorRate).append(avgPacketDelayVariation).append(avgPacketLatency).append(avgReceiveThroughput).append(avgTransmitThroughput).append(durConnectionFailedStatus).append(durTunnelFailedStatus).append(flowActivatedBy).append(flowActivationEpoch).append(flowActivationMicrosec).append(flowActivationTime).append(flowDeactivatedBy).append(flowDeactivationEpoch).append(flowDeactivationMicrosec).append(flowDeactivationTime).append(flowStatus).append(gtpConnectionStatus).append(gtpTunnelStatus).append(ipTosCountList).append(ipTosList).append(largePacketRtt).append(largePacketThreshold).append(maxPacketDelayVariation).append(maxReceiveBitRate).append(maxTransmitBitRate).append(mobileQciCosCountList).append(mobileQciCosList).append(numActivationFailures).append(numBitErrors).append(numBytesReceived).append(numBytesTransmitted).append(numDroppedPackets).append(numGtpEchoFailures).append(numGtpTunnelErrors).append(numHttpErrors).append(numL7BytesReceived).append(numL7BytesTransmitted).append(numLostPackets).append(numOutOfOrderPackets).append(numPacketErrors).append(numPacketsReceivedExclRetrans).append(numPacketsReceivedInclRetrans).append(numPacketsTransmittedInclRetrans).append(numRetries).append(numTimeouts).append(numTunneledL7BytesReceived).append(roundTripTime).append(tcpFlagCountList).append(tcpFlagList).append(timeToFirstByte).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GtpPerFlowMetrics) == false) {
            return false;
        }
        GtpPerFlowMetrics rhs = ((GtpPerFlowMetrics) other);
        return new EqualsBuilder().append(avgBitErrorRate, rhs.avgBitErrorRate).append(avgPacketDelayVariation, rhs.avgPacketDelayVariation).append(avgPacketLatency, rhs.avgPacketLatency).append(avgReceiveThroughput, rhs.avgReceiveThroughput).append(avgTransmitThroughput, rhs.avgTransmitThroughput).append(durConnectionFailedStatus, rhs.durConnectionFailedStatus).append(durTunnelFailedStatus, rhs.durTunnelFailedStatus).append(flowActivatedBy, rhs.flowActivatedBy).append(flowActivationEpoch, rhs.flowActivationEpoch).append(flowActivationMicrosec, rhs.flowActivationMicrosec).append(flowActivationTime, rhs.flowActivationTime).append(flowDeactivatedBy, rhs.flowDeactivatedBy).append(flowDeactivationEpoch, rhs.flowDeactivationEpoch).append(flowDeactivationMicrosec, rhs.flowDeactivationMicrosec).append(flowDeactivationTime, rhs.flowDeactivationTime).append(flowStatus, rhs.flowStatus).append(gtpConnectionStatus, rhs.gtpConnectionStatus).append(gtpTunnelStatus, rhs.gtpTunnelStatus).append(ipTosCountList, rhs.ipTosCountList).append(ipTosList, rhs.ipTosList).append(largePacketRtt, rhs.largePacketRtt).append(largePacketThreshold, rhs.largePacketThreshold).append(maxPacketDelayVariation, rhs.maxPacketDelayVariation).append(maxReceiveBitRate, rhs.maxReceiveBitRate).append(maxTransmitBitRate, rhs.maxTransmitBitRate).append(mobileQciCosCountList, rhs.mobileQciCosCountList).append(mobileQciCosList, rhs.mobileQciCosList).append(numActivationFailures, rhs.numActivationFailures).append(numBitErrors, rhs.numBitErrors).append(numBytesReceived, rhs.numBytesReceived).append(numBytesTransmitted, rhs.numBytesTransmitted).append(numDroppedPackets, rhs.numDroppedPackets).append(numGtpEchoFailures, rhs.numGtpEchoFailures).append(numGtpTunnelErrors, rhs.numGtpTunnelErrors).append(numHttpErrors, rhs.numHttpErrors).append(numL7BytesReceived, rhs.numL7BytesReceived).append(numL7BytesTransmitted, rhs.numL7BytesTransmitted).append(numLostPackets, rhs.numLostPackets).append(numOutOfOrderPackets, rhs.numOutOfOrderPackets).append(numPacketErrors, rhs.numPacketErrors).append(numPacketsReceivedExclRetrans, rhs.numPacketsReceivedExclRetrans).append(numPacketsReceivedInclRetrans, rhs.numPacketsReceivedInclRetrans).append(numPacketsTransmittedInclRetrans, rhs.numPacketsTransmittedInclRetrans).append(numRetries, rhs.numRetries).append(numTimeouts, rhs.numTimeouts).append(numTunneledL7BytesReceived, rhs.numTunneledL7BytesReceived).append(roundTripTime, rhs.roundTripTime).append(tcpFlagCountList, rhs.tcpFlagCountList).append(tcpFlagList, rhs.tcpFlagList).append(timeToFirstByte, rhs.timeToFirstByte).isEquals();
    }

}
