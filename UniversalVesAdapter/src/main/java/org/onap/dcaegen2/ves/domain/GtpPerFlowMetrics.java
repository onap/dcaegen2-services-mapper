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
import java.util.List;
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
    "avgBitErrorRate",
    "avgPacketDelayVariation",
    "avgPacketLatency",
    "avgReceiveThroughput",
    "avgTransmitThroughput",
    "flowActivationEpoch",
    "flowActivationMicrosec",
    "flowDeactivationEpoch",
    "flowDeactivationMicrosec",
    "flowDeactivationTime",
    "flowStatus",
    "maxPacketDelayVariation",
    "numActivationFailures",
    "numBitErrors",
    "numBytesReceived",
    "numBytesTransmitted",
    "numDroppedPackets",
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
    "timeToFirstByte",
    "durConnectionFailedStatus",
    "durTunnelFailedStatus",
    "flowActivatedBy",
    "flowActivationTime",
    "flowDeactivatedBy",
    "gtpConnectionStatus",
    "gtpTunnelStatus",
    "ipTosCountList",
    "ipTosList",
    "largePacketRtt",
    "largePacketThreshold",
    "maxReceiveBitRate",
    "maxTransmitBitRate",
    "mobileQciCosCountList",
    "mobileQciCosList",
    "numGtpEchoFailures",
    "numGtpTunnelErrors",
    "numHttpErrors",
    "tcpFlagCountList",
    "tcpFlagList"
})
public class GtpPerFlowMetrics {

    @JsonProperty("avgBitErrorRate")
    private Double avgBitErrorRate;
    @JsonProperty("avgPacketDelayVariation")
    private Double avgPacketDelayVariation;
    @JsonProperty("avgPacketLatency")
    private Double avgPacketLatency;
    @JsonProperty("avgReceiveThroughput")
    private Double avgReceiveThroughput;
    @JsonProperty("avgTransmitThroughput")
    private Double avgTransmitThroughput;
    @JsonProperty("flowActivationEpoch")
    private Double flowActivationEpoch;
    @JsonProperty("flowActivationMicrosec")
    private Double flowActivationMicrosec;
    @JsonProperty("flowDeactivationEpoch")
    private Double flowDeactivationEpoch;
    @JsonProperty("flowDeactivationMicrosec")
    private Double flowDeactivationMicrosec;
    @JsonProperty("flowDeactivationTime")
    private String flowDeactivationTime;
    @JsonProperty("flowStatus")
    private String flowStatus;
    @JsonProperty("maxPacketDelayVariation")
    private Double maxPacketDelayVariation;
    @JsonProperty("numActivationFailures")
    private Double numActivationFailures;
    @JsonProperty("numBitErrors")
    private Double numBitErrors;
    @JsonProperty("numBytesReceived")
    private Double numBytesReceived;
    @JsonProperty("numBytesTransmitted")
    private Double numBytesTransmitted;
    @JsonProperty("numDroppedPackets")
    private Double numDroppedPackets;
    @JsonProperty("numL7BytesReceived")
    private Double numL7BytesReceived;
    @JsonProperty("numL7BytesTransmitted")
    private Double numL7BytesTransmitted;
    @JsonProperty("numLostPackets")
    private Double numLostPackets;
    @JsonProperty("numOutOfOrderPackets")
    private Double numOutOfOrderPackets;
    @JsonProperty("numPacketErrors")
    private Double numPacketErrors;
    @JsonProperty("numPacketsReceivedExclRetrans")
    private Double numPacketsReceivedExclRetrans;
    @JsonProperty("numPacketsReceivedInclRetrans")
    private Double numPacketsReceivedInclRetrans;
    @JsonProperty("numPacketsTransmittedInclRetrans")
    private Double numPacketsTransmittedInclRetrans;
    @JsonProperty("numRetries")
    private Double numRetries;
    @JsonProperty("numTimeouts")
    private Double numTimeouts;
    @JsonProperty("numTunneledL7BytesReceived")
    private Double numTunneledL7BytesReceived;
    @JsonProperty("roundTripTime")
    private Double roundTripTime;
    @JsonProperty("timeToFirstByte")
    private Double timeToFirstByte;
    @JsonProperty("durConnectionFailedStatus")
    private Double durConnectionFailedStatus;
    @JsonProperty("durTunnelFailedStatus")
    private Double durTunnelFailedStatus;
    @JsonProperty("flowActivatedBy")
    private String flowActivatedBy;
    @JsonProperty("flowActivationTime")
    private String flowActivationTime;
    @JsonProperty("flowDeactivatedBy")
    private String flowDeactivatedBy;
    @JsonProperty("gtpConnectionStatus")
    private String gtpConnectionStatus;
    @JsonProperty("gtpTunnelStatus")
    private String gtpTunnelStatus;
    @JsonProperty("ipTosCountList")
    private List<List<String>> ipTosCountList = null;
    @JsonProperty("ipTosList")
    private List<String> ipTosList = null;
    @JsonProperty("largePacketRtt")
    private Double largePacketRtt;
    @JsonProperty("largePacketThreshold")
    private Double largePacketThreshold;
    @JsonProperty("maxReceiveBitRate")
    private Double maxReceiveBitRate;
    @JsonProperty("maxTransmitBitRate")
    private Double maxTransmitBitRate;
    @JsonProperty("mobileQciCosCountList")
    private List<List<String>> mobileQciCosCountList = null;
    @JsonProperty("mobileQciCosList")
    private List<String> mobileQciCosList = null;
    @JsonProperty("numGtpEchoFailures")
    private Double numGtpEchoFailures;
    @JsonProperty("numGtpTunnelErrors")
    private Double numGtpTunnelErrors;
    @JsonProperty("numHttpErrors")
    private Double numHttpErrors;
    @JsonProperty("tcpFlagCountList")
    private List<List<String>> tcpFlagCountList = null;
    @JsonProperty("tcpFlagList")
    private List<String> tcpFlagList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avgBitErrorRate")
    public Double getAvgBitErrorRate() {
        return avgBitErrorRate;
    }

    @JsonProperty("avgBitErrorRate")
    public void setAvgBitErrorRate(Double avgBitErrorRate) {
        this.avgBitErrorRate = avgBitErrorRate;
    }

    @JsonProperty("avgPacketDelayVariation")
    public Double getAvgPacketDelayVariation() {
        return avgPacketDelayVariation;
    }

    @JsonProperty("avgPacketDelayVariation")
    public void setAvgPacketDelayVariation(Double avgPacketDelayVariation) {
        this.avgPacketDelayVariation = avgPacketDelayVariation;
    }

    @JsonProperty("avgPacketLatency")
    public Double getAvgPacketLatency() {
        return avgPacketLatency;
    }

    @JsonProperty("avgPacketLatency")
    public void setAvgPacketLatency(Double avgPacketLatency) {
        this.avgPacketLatency = avgPacketLatency;
    }

    @JsonProperty("avgReceiveThroughput")
    public Double getAvgReceiveThroughput() {
        return avgReceiveThroughput;
    }

    @JsonProperty("avgReceiveThroughput")
    public void setAvgReceiveThroughput(Double avgReceiveThroughput) {
        this.avgReceiveThroughput = avgReceiveThroughput;
    }

    @JsonProperty("avgTransmitThroughput")
    public Double getAvgTransmitThroughput() {
        return avgTransmitThroughput;
    }

    @JsonProperty("avgTransmitThroughput")
    public void setAvgTransmitThroughput(Double avgTransmitThroughput) {
        this.avgTransmitThroughput = avgTransmitThroughput;
    }

    @JsonProperty("flowActivationEpoch")
    public Double getFlowActivationEpoch() {
        return flowActivationEpoch;
    }

    @JsonProperty("flowActivationEpoch")
    public void setFlowActivationEpoch(Double flowActivationEpoch) {
        this.flowActivationEpoch = flowActivationEpoch;
    }

    @JsonProperty("flowActivationMicrosec")
    public Double getFlowActivationMicrosec() {
        return flowActivationMicrosec;
    }

    @JsonProperty("flowActivationMicrosec")
    public void setFlowActivationMicrosec(Double flowActivationMicrosec) {
        this.flowActivationMicrosec = flowActivationMicrosec;
    }

    @JsonProperty("flowDeactivationEpoch")
    public Double getFlowDeactivationEpoch() {
        return flowDeactivationEpoch;
    }

    @JsonProperty("flowDeactivationEpoch")
    public void setFlowDeactivationEpoch(Double flowDeactivationEpoch) {
        this.flowDeactivationEpoch = flowDeactivationEpoch;
    }

    @JsonProperty("flowDeactivationMicrosec")
    public Double getFlowDeactivationMicrosec() {
        return flowDeactivationMicrosec;
    }

    @JsonProperty("flowDeactivationMicrosec")
    public void setFlowDeactivationMicrosec(Double flowDeactivationMicrosec) {
        this.flowDeactivationMicrosec = flowDeactivationMicrosec;
    }

    @JsonProperty("flowDeactivationTime")
    public String getFlowDeactivationTime() {
        return flowDeactivationTime;
    }

    @JsonProperty("flowDeactivationTime")
    public void setFlowDeactivationTime(String flowDeactivationTime) {
        this.flowDeactivationTime = flowDeactivationTime;
    }

    @JsonProperty("flowStatus")
    public String getFlowStatus() {
        return flowStatus;
    }

    @JsonProperty("flowStatus")
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    @JsonProperty("maxPacketDelayVariation")
    public Double getMaxPacketDelayVariation() {
        return maxPacketDelayVariation;
    }

    @JsonProperty("maxPacketDelayVariation")
    public void setMaxPacketDelayVariation(Double maxPacketDelayVariation) {
        this.maxPacketDelayVariation = maxPacketDelayVariation;
    }

    @JsonProperty("numActivationFailures")
    public Double getNumActivationFailures() {
        return numActivationFailures;
    }

    @JsonProperty("numActivationFailures")
    public void setNumActivationFailures(Double numActivationFailures) {
        this.numActivationFailures = numActivationFailures;
    }

    @JsonProperty("numBitErrors")
    public Double getNumBitErrors() {
        return numBitErrors;
    }

    @JsonProperty("numBitErrors")
    public void setNumBitErrors(Double numBitErrors) {
        this.numBitErrors = numBitErrors;
    }

    @JsonProperty("numBytesReceived")
    public Double getNumBytesReceived() {
        return numBytesReceived;
    }

    @JsonProperty("numBytesReceived")
    public void setNumBytesReceived(Double numBytesReceived) {
        this.numBytesReceived = numBytesReceived;
    }

    @JsonProperty("numBytesTransmitted")
    public Double getNumBytesTransmitted() {
        return numBytesTransmitted;
    }

    @JsonProperty("numBytesTransmitted")
    public void setNumBytesTransmitted(Double numBytesTransmitted) {
        this.numBytesTransmitted = numBytesTransmitted;
    }

    @JsonProperty("numDroppedPackets")
    public Double getNumDroppedPackets() {
        return numDroppedPackets;
    }

    @JsonProperty("numDroppedPackets")
    public void setNumDroppedPackets(Double numDroppedPackets) {
        this.numDroppedPackets = numDroppedPackets;
    }

    @JsonProperty("numL7BytesReceived")
    public Double getNumL7BytesReceived() {
        return numL7BytesReceived;
    }

    @JsonProperty("numL7BytesReceived")
    public void setNumL7BytesReceived(Double numL7BytesReceived) {
        this.numL7BytesReceived = numL7BytesReceived;
    }

    @JsonProperty("numL7BytesTransmitted")
    public Double getNumL7BytesTransmitted() {
        return numL7BytesTransmitted;
    }

    @JsonProperty("numL7BytesTransmitted")
    public void setNumL7BytesTransmitted(Double numL7BytesTransmitted) {
        this.numL7BytesTransmitted = numL7BytesTransmitted;
    }

    @JsonProperty("numLostPackets")
    public Double getNumLostPackets() {
        return numLostPackets;
    }

    @JsonProperty("numLostPackets")
    public void setNumLostPackets(Double numLostPackets) {
        this.numLostPackets = numLostPackets;
    }

    @JsonProperty("numOutOfOrderPackets")
    public Double getNumOutOfOrderPackets() {
        return numOutOfOrderPackets;
    }

    @JsonProperty("numOutOfOrderPackets")
    public void setNumOutOfOrderPackets(Double numOutOfOrderPackets) {
        this.numOutOfOrderPackets = numOutOfOrderPackets;
    }

    @JsonProperty("numPacketErrors")
    public Double getNumPacketErrors() {
        return numPacketErrors;
    }

    @JsonProperty("numPacketErrors")
    public void setNumPacketErrors(Double numPacketErrors) {
        this.numPacketErrors = numPacketErrors;
    }

    @JsonProperty("numPacketsReceivedExclRetrans")
    public Double getNumPacketsReceivedExclRetrans() {
        return numPacketsReceivedExclRetrans;
    }

    @JsonProperty("numPacketsReceivedExclRetrans")
    public void setNumPacketsReceivedExclRetrans(Double numPacketsReceivedExclRetrans) {
        this.numPacketsReceivedExclRetrans = numPacketsReceivedExclRetrans;
    }

    @JsonProperty("numPacketsReceivedInclRetrans")
    public Double getNumPacketsReceivedInclRetrans() {
        return numPacketsReceivedInclRetrans;
    }

    @JsonProperty("numPacketsReceivedInclRetrans")
    public void setNumPacketsReceivedInclRetrans(Double numPacketsReceivedInclRetrans) {
        this.numPacketsReceivedInclRetrans = numPacketsReceivedInclRetrans;
    }

    @JsonProperty("numPacketsTransmittedInclRetrans")
    public Double getNumPacketsTransmittedInclRetrans() {
        return numPacketsTransmittedInclRetrans;
    }

    @JsonProperty("numPacketsTransmittedInclRetrans")
    public void setNumPacketsTransmittedInclRetrans(Double numPacketsTransmittedInclRetrans) {
        this.numPacketsTransmittedInclRetrans = numPacketsTransmittedInclRetrans;
    }

    @JsonProperty("numRetries")
    public Double getNumRetries() {
        return numRetries;
    }

    @JsonProperty("numRetries")
    public void setNumRetries(Double numRetries) {
        this.numRetries = numRetries;
    }

    @JsonProperty("numTimeouts")
    public Double getNumTimeouts() {
        return numTimeouts;
    }

    @JsonProperty("numTimeouts")
    public void setNumTimeouts(Double numTimeouts) {
        this.numTimeouts = numTimeouts;
    }

    @JsonProperty("numTunneledL7BytesReceived")
    public Double getNumTunneledL7BytesReceived() {
        return numTunneledL7BytesReceived;
    }

    @JsonProperty("numTunneledL7BytesReceived")
    public void setNumTunneledL7BytesReceived(Double numTunneledL7BytesReceived) {
        this.numTunneledL7BytesReceived = numTunneledL7BytesReceived;
    }

    @JsonProperty("roundTripTime")
    public Double getRoundTripTime() {
        return roundTripTime;
    }

    @JsonProperty("roundTripTime")
    public void setRoundTripTime(Double roundTripTime) {
        this.roundTripTime = roundTripTime;
    }

    @JsonProperty("timeToFirstByte")
    public Double getTimeToFirstByte() {
        return timeToFirstByte;
    }

    @JsonProperty("timeToFirstByte")
    public void setTimeToFirstByte(Double timeToFirstByte) {
        this.timeToFirstByte = timeToFirstByte;
    }

    @JsonProperty("durConnectionFailedStatus")
    public Double getDurConnectionFailedStatus() {
        return durConnectionFailedStatus;
    }

    @JsonProperty("durConnectionFailedStatus")
    public void setDurConnectionFailedStatus(Double durConnectionFailedStatus) {
        this.durConnectionFailedStatus = durConnectionFailedStatus;
    }

    @JsonProperty("durTunnelFailedStatus")
    public Double getDurTunnelFailedStatus() {
        return durTunnelFailedStatus;
    }

    @JsonProperty("durTunnelFailedStatus")
    public void setDurTunnelFailedStatus(Double durTunnelFailedStatus) {
        this.durTunnelFailedStatus = durTunnelFailedStatus;
    }

    @JsonProperty("flowActivatedBy")
    public String getFlowActivatedBy() {
        return flowActivatedBy;
    }

    @JsonProperty("flowActivatedBy")
    public void setFlowActivatedBy(String flowActivatedBy) {
        this.flowActivatedBy = flowActivatedBy;
    }

    @JsonProperty("flowActivationTime")
    public String getFlowActivationTime() {
        return flowActivationTime;
    }

    @JsonProperty("flowActivationTime")
    public void setFlowActivationTime(String flowActivationTime) {
        this.flowActivationTime = flowActivationTime;
    }

    @JsonProperty("flowDeactivatedBy")
    public String getFlowDeactivatedBy() {
        return flowDeactivatedBy;
    }

    @JsonProperty("flowDeactivatedBy")
    public void setFlowDeactivatedBy(String flowDeactivatedBy) {
        this.flowDeactivatedBy = flowDeactivatedBy;
    }

    @JsonProperty("gtpConnectionStatus")
    public String getGtpConnectionStatus() {
        return gtpConnectionStatus;
    }

    @JsonProperty("gtpConnectionStatus")
    public void setGtpConnectionStatus(String gtpConnectionStatus) {
        this.gtpConnectionStatus = gtpConnectionStatus;
    }

    @JsonProperty("gtpTunnelStatus")
    public String getGtpTunnelStatus() {
        return gtpTunnelStatus;
    }

    @JsonProperty("gtpTunnelStatus")
    public void setGtpTunnelStatus(String gtpTunnelStatus) {
        this.gtpTunnelStatus = gtpTunnelStatus;
    }

    @JsonProperty("ipTosCountList")
    public List<List<String>> getIpTosCountList() {
        return ipTosCountList;
    }

    @JsonProperty("ipTosCountList")
    public void setIpTosCountList(List<List<String>> ipTosCountList) {
        this.ipTosCountList = ipTosCountList;
    }

    @JsonProperty("ipTosList")
    public List<String> getIpTosList() {
        return ipTosList;
    }

    @JsonProperty("ipTosList")
    public void setIpTosList(List<String> ipTosList) {
        this.ipTosList = ipTosList;
    }

    @JsonProperty("largePacketRtt")
    public Double getLargePacketRtt() {
        return largePacketRtt;
    }

    @JsonProperty("largePacketRtt")
    public void setLargePacketRtt(Double largePacketRtt) {
        this.largePacketRtt = largePacketRtt;
    }

    @JsonProperty("largePacketThreshold")
    public Double getLargePacketThreshold() {
        return largePacketThreshold;
    }

    @JsonProperty("largePacketThreshold")
    public void setLargePacketThreshold(Double largePacketThreshold) {
        this.largePacketThreshold = largePacketThreshold;
    }

    @JsonProperty("maxReceiveBitRate")
    public Double getMaxReceiveBitRate() {
        return maxReceiveBitRate;
    }

    @JsonProperty("maxReceiveBitRate")
    public void setMaxReceiveBitRate(Double maxReceiveBitRate) {
        this.maxReceiveBitRate = maxReceiveBitRate;
    }

    @JsonProperty("maxTransmitBitRate")
    public Double getMaxTransmitBitRate() {
        return maxTransmitBitRate;
    }

    @JsonProperty("maxTransmitBitRate")
    public void setMaxTransmitBitRate(Double maxTransmitBitRate) {
        this.maxTransmitBitRate = maxTransmitBitRate;
    }

    @JsonProperty("mobileQciCosCountList")
    public List<List<String>> getMobileQciCosCountList() {
        return mobileQciCosCountList;
    }

    @JsonProperty("mobileQciCosCountList")
    public void setMobileQciCosCountList(List<List<String>> mobileQciCosCountList) {
        this.mobileQciCosCountList = mobileQciCosCountList;
    }

    @JsonProperty("mobileQciCosList")
    public List<String> getMobileQciCosList() {
        return mobileQciCosList;
    }

    @JsonProperty("mobileQciCosList")
    public void setMobileQciCosList(List<String> mobileQciCosList) {
        this.mobileQciCosList = mobileQciCosList;
    }

    @JsonProperty("numGtpEchoFailures")
    public Double getNumGtpEchoFailures() {
        return numGtpEchoFailures;
    }

    @JsonProperty("numGtpEchoFailures")
    public void setNumGtpEchoFailures(Double numGtpEchoFailures) {
        this.numGtpEchoFailures = numGtpEchoFailures;
    }

    @JsonProperty("numGtpTunnelErrors")
    public Double getNumGtpTunnelErrors() {
        return numGtpTunnelErrors;
    }

    @JsonProperty("numGtpTunnelErrors")
    public void setNumGtpTunnelErrors(Double numGtpTunnelErrors) {
        this.numGtpTunnelErrors = numGtpTunnelErrors;
    }

    @JsonProperty("numHttpErrors")
    public Double getNumHttpErrors() {
        return numHttpErrors;
    }

    @JsonProperty("numHttpErrors")
    public void setNumHttpErrors(Double numHttpErrors) {
        this.numHttpErrors = numHttpErrors;
    }

    @JsonProperty("tcpFlagCountList")
    public List<List<String>> getTcpFlagCountList() {
        return tcpFlagCountList;
    }

    @JsonProperty("tcpFlagCountList")
    public void setTcpFlagCountList(List<List<String>> tcpFlagCountList) {
        this.tcpFlagCountList = tcpFlagCountList;
    }

    @JsonProperty("tcpFlagList")
    public List<String> getTcpFlagList() {
        return tcpFlagList;
    }

    @JsonProperty("tcpFlagList")
    public void setTcpFlagList(List<String> tcpFlagList) {
        this.tcpFlagList = tcpFlagList;
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
        return new ToStringBuilder(this).append("avgBitErrorRate", avgBitErrorRate).append("avgPacketDelayVariation", avgPacketDelayVariation).append("avgPacketLatency", avgPacketLatency).append("avgReceiveThroughput", avgReceiveThroughput).append("avgTransmitThroughput", avgTransmitThroughput).append("flowActivationEpoch", flowActivationEpoch).append("flowActivationMicrosec", flowActivationMicrosec).append("flowDeactivationEpoch", flowDeactivationEpoch).append("flowDeactivationMicrosec", flowDeactivationMicrosec).append("flowDeactivationTime", flowDeactivationTime).append("flowStatus", flowStatus).append("maxPacketDelayVariation", maxPacketDelayVariation).append("numActivationFailures", numActivationFailures).append("numBitErrors", numBitErrors).append("numBytesReceived", numBytesReceived).append("numBytesTransmitted", numBytesTransmitted).append("numDroppedPackets", numDroppedPackets).append("numL7BytesReceived", numL7BytesReceived).append("numL7BytesTransmitted", numL7BytesTransmitted).append("numLostPackets", numLostPackets).append("numOutOfOrderPackets", numOutOfOrderPackets).append("numPacketErrors", numPacketErrors).append("numPacketsReceivedExclRetrans", numPacketsReceivedExclRetrans).append("numPacketsReceivedInclRetrans", numPacketsReceivedInclRetrans).append("numPacketsTransmittedInclRetrans", numPacketsTransmittedInclRetrans).append("numRetries", numRetries).append("numTimeouts", numTimeouts).append("numTunneledL7BytesReceived", numTunneledL7BytesReceived).append("roundTripTime", roundTripTime).append("timeToFirstByte", timeToFirstByte).append("durConnectionFailedStatus", durConnectionFailedStatus).append("durTunnelFailedStatus", durTunnelFailedStatus).append("flowActivatedBy", flowActivatedBy).append("flowActivationTime", flowActivationTime).append("flowDeactivatedBy", flowDeactivatedBy).append("gtpConnectionStatus", gtpConnectionStatus).append("gtpTunnelStatus", gtpTunnelStatus).append("ipTosCountList", ipTosCountList).append("ipTosList", ipTosList).append("largePacketRtt", largePacketRtt).append("largePacketThreshold", largePacketThreshold).append("maxReceiveBitRate", maxReceiveBitRate).append("maxTransmitBitRate", maxTransmitBitRate).append("mobileQciCosCountList", mobileQciCosCountList).append("mobileQciCosList", mobileQciCosList).append("numGtpEchoFailures", numGtpEchoFailures).append("numGtpTunnelErrors", numGtpTunnelErrors).append("numHttpErrors", numHttpErrors).append("tcpFlagCountList", tcpFlagCountList).append("tcpFlagList", tcpFlagList).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(avgPacketDelayVariation).append(flowActivationTime).append(numPacketsReceivedInclRetrans).append(flowActivationEpoch).append(maxPacketDelayVariation).append(ipTosList).append(flowStatus).append(flowDeactivationEpoch).append(numL7BytesReceived).append(avgReceiveThroughput).append(numGtpTunnelErrors).append(numPacketsTransmittedInclRetrans).append(maxTransmitBitRate).append(ipTosCountList).append(gtpTunnelStatus).append(numBitErrors).append(timeToFirstByte).append(mobileQciCosList).append(numTunneledL7BytesReceived).append(additionalProperties).append(gtpConnectionStatus).append(numPacketErrors).append(tcpFlagCountList).append(flowDeactivatedBy).append(avgTransmitThroughput).append(roundTripTime).append(numBytesTransmitted).append(flowActivatedBy).append(numHttpErrors).append(numDroppedPackets).append(numL7BytesTransmitted).append(largePacketRtt).append(largePacketThreshold).append(durTunnelFailedStatus).append(numLostPackets).append(numGtpEchoFailures).append(flowDeactivationTime).append(flowActivationMicrosec).append(mobileQciCosCountList).append(avgBitErrorRate).append(numBytesReceived).append(avgPacketLatency).append(numTimeouts).append(maxReceiveBitRate).append(numPacketsReceivedExclRetrans).append(flowDeactivationMicrosec).append(numRetries).append(numOutOfOrderPackets).append(tcpFlagList).append(durConnectionFailedStatus).append(numActivationFailures).toHashCode();
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
        return new EqualsBuilder().append(avgPacketDelayVariation, rhs.avgPacketDelayVariation).append(flowActivationTime, rhs.flowActivationTime).append(numPacketsReceivedInclRetrans, rhs.numPacketsReceivedInclRetrans).append(flowActivationEpoch, rhs.flowActivationEpoch).append(maxPacketDelayVariation, rhs.maxPacketDelayVariation).append(ipTosList, rhs.ipTosList).append(flowStatus, rhs.flowStatus).append(flowDeactivationEpoch, rhs.flowDeactivationEpoch).append(numL7BytesReceived, rhs.numL7BytesReceived).append(avgReceiveThroughput, rhs.avgReceiveThroughput).append(numGtpTunnelErrors, rhs.numGtpTunnelErrors).append(numPacketsTransmittedInclRetrans, rhs.numPacketsTransmittedInclRetrans).append(maxTransmitBitRate, rhs.maxTransmitBitRate).append(ipTosCountList, rhs.ipTosCountList).append(gtpTunnelStatus, rhs.gtpTunnelStatus).append(numBitErrors, rhs.numBitErrors).append(timeToFirstByte, rhs.timeToFirstByte).append(mobileQciCosList, rhs.mobileQciCosList).append(numTunneledL7BytesReceived, rhs.numTunneledL7BytesReceived).append(additionalProperties, rhs.additionalProperties).append(gtpConnectionStatus, rhs.gtpConnectionStatus).append(numPacketErrors, rhs.numPacketErrors).append(tcpFlagCountList, rhs.tcpFlagCountList).append(flowDeactivatedBy, rhs.flowDeactivatedBy).append(avgTransmitThroughput, rhs.avgTransmitThroughput).append(roundTripTime, rhs.roundTripTime).append(numBytesTransmitted, rhs.numBytesTransmitted).append(flowActivatedBy, rhs.flowActivatedBy).append(numHttpErrors, rhs.numHttpErrors).append(numDroppedPackets, rhs.numDroppedPackets).append(numL7BytesTransmitted, rhs.numL7BytesTransmitted).append(largePacketRtt, rhs.largePacketRtt).append(largePacketThreshold, rhs.largePacketThreshold).append(durTunnelFailedStatus, rhs.durTunnelFailedStatus).append(numLostPackets, rhs.numLostPackets).append(numGtpEchoFailures, rhs.numGtpEchoFailures).append(flowDeactivationTime, rhs.flowDeactivationTime).append(flowActivationMicrosec, rhs.flowActivationMicrosec).append(mobileQciCosCountList, rhs.mobileQciCosCountList).append(avgBitErrorRate, rhs.avgBitErrorRate).append(numBytesReceived, rhs.numBytesReceived).append(avgPacketLatency, rhs.avgPacketLatency).append(numTimeouts, rhs.numTimeouts).append(maxReceiveBitRate, rhs.maxReceiveBitRate).append(numPacketsReceivedExclRetrans, rhs.numPacketsReceivedExclRetrans).append(flowDeactivationMicrosec, rhs.flowDeactivationMicrosec).append(numRetries, rhs.numRetries).append(numOutOfOrderPackets, rhs.numOutOfOrderPackets).append(tcpFlagList, rhs.tcpFlagList).append(durConnectionFailedStatus, rhs.durConnectionFailedStatus).append(numActivationFailures, rhs.numActivationFailures).isEquals();
    }

}
