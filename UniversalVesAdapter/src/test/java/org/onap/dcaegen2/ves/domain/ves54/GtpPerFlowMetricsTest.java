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


import java.util.List;
import java.util.Map;

import org.junit.Test;


public class GtpPerFlowMetricsTest {
    
    private GtpPerFlowMetrics createTestSubject() {
        return new GtpPerFlowMetrics();
    }
    
    @Test
    public void testGetAvgBitErrorRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAvgBitErrorRate();
    }
    
    @Test
    public void testSetAvgBitErrorRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double avgBitErrorRate = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAvgBitErrorRate(avgBitErrorRate);
    }
    
    @Test
    public void testGetAvgPacketDelayVariation() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAvgPacketDelayVariation();
    }
    
    @Test
    public void testSetAvgPacketDelayVariation() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double avgPacketDelayVariation = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAvgPacketDelayVariation(avgPacketDelayVariation);
    }
    
    @Test
    public void testGetAvgPacketLatency() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAvgPacketLatency();
    }
    
    @Test
    public void testSetAvgPacketLatency() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double avgPacketLatency = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAvgPacketLatency(avgPacketLatency);
    }
    
    @Test
    public void testGetAvgReceiveThroughput() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAvgReceiveThroughput();
    }
    
    @Test
    public void testSetAvgReceiveThroughput() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double avgReceiveThroughput = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAvgReceiveThroughput(avgReceiveThroughput);
    }
    
    @Test
    public void testGetAvgTransmitThroughput() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAvgTransmitThroughput();
    }
    
    @Test
    public void testSetAvgTransmitThroughput() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double avgTransmitThroughput = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAvgTransmitThroughput(avgTransmitThroughput);
    }
    
    @Test
    public void testGetDurConnectionFailedStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDurConnectionFailedStatus();
    }
    
    @Test
    public void testSetDurConnectionFailedStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double durConnectionFailedStatus = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDurConnectionFailedStatus(durConnectionFailedStatus);
    }
    
    @Test
    public void testGetDurTunnelFailedStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDurTunnelFailedStatus();
    }
    
    @Test
    public void testSetDurTunnelFailedStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double durTunnelFailedStatus = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDurTunnelFailedStatus(durTunnelFailedStatus);
    }
    
    @Test
    public void testGetFlowActivatedBy() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowActivatedBy();
    }
    
    @Test
    public void testSetFlowActivatedBy() throws Exception {
        GtpPerFlowMetrics testSubject;
        String flowActivatedBy = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowActivatedBy(flowActivatedBy);
    }
    
    @Test
    public void testGetFlowActivationEpoch() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowActivationEpoch();
    }
    
    @Test
    public void testSetFlowActivationEpoch() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double flowActivationEpoch = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowActivationEpoch(flowActivationEpoch);
    }
    
    @Test
    public void testGetFlowActivationMicrosec() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowActivationMicrosec();
    }
    
    @Test
    public void testSetFlowActivationMicrosec() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double flowActivationMicrosec = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowActivationMicrosec(flowActivationMicrosec);
    }
    
    @Test
    public void testGetFlowActivationTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowActivationTime();
    }
    
    @Test
    public void testSetFlowActivationTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        String flowActivationTime = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowActivationTime(flowActivationTime);
    }
    
    @Test
    public void testGetFlowDeactivatedBy() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowDeactivatedBy();
    }
    
    @Test
    public void testSetFlowDeactivatedBy() throws Exception {
        GtpPerFlowMetrics testSubject;
        String flowDeactivatedBy = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowDeactivatedBy(flowDeactivatedBy);
    }
    
    @Test
    public void testGetFlowDeactivationEpoch() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowDeactivationEpoch();
    }
    
    @Test
    public void testSetFlowDeactivationEpoch() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double flowDeactivationEpoch = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowDeactivationEpoch(flowDeactivationEpoch);
    }
    
    @Test
    public void testGetFlowDeactivationMicrosec() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowDeactivationMicrosec();
    }
    
    @Test
    public void testSetFlowDeactivationMicrosec() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double flowDeactivationMicrosec = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowDeactivationMicrosec(flowDeactivationMicrosec);
    }
    
    @Test
    public void testGetFlowDeactivationTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowDeactivationTime();
    }
    
    @Test
    public void testSetFlowDeactivationTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        String flowDeactivationTime = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowDeactivationTime(flowDeactivationTime);
    }
    
    @Test
    public void testGetFlowStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFlowStatus();
    }
    
    @Test
    public void testSetFlowStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String flowStatus = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFlowStatus(flowStatus);
    }
    
    @Test
    public void testGetGtpConnectionStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getGtpConnectionStatus();
    }
    
    @Test
    public void testSetGtpConnectionStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String gtpConnectionStatus = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setGtpConnectionStatus(gtpConnectionStatus);
    }
    
    @Test
    public void testGetGtpTunnelStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getGtpTunnelStatus();
    }
    
    @Test
    public void testSetGtpTunnelStatus() throws Exception {
        GtpPerFlowMetrics testSubject;
        String gtpTunnelStatus = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setGtpTunnelStatus(gtpTunnelStatus);
    }
    
    @Test
    public void testGetIpTosCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpTosCountList();
    }
    
    @Test
    public void testSetIpTosCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> ipTosCountList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpTosCountList(ipTosCountList);
    }
    
    @Test
    public void testGetIpTosList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getIpTosList();
    }
    
    @Test
    public void testSetIpTosList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> ipTosList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setIpTosList(ipTosList);
    }
    
    @Test
    public void testGetLargePacketRtt() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLargePacketRtt();
    }
    
    @Test
    public void testSetLargePacketRtt() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double largePacketRtt = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLargePacketRtt(largePacketRtt);
    }
    
    @Test
    public void testGetLargePacketThreshold() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLargePacketThreshold();
    }
    
    @Test
    public void testSetLargePacketThreshold() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double largePacketThreshold = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLargePacketThreshold(largePacketThreshold);
    }
    
    @Test
    public void testGetMaxPacketDelayVariation() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMaxPacketDelayVariation();
    }
    
    @Test
    public void testSetMaxPacketDelayVariation() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double maxPacketDelayVariation = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMaxPacketDelayVariation(maxPacketDelayVariation);
    }
    
    @Test
    public void testGetMaxReceiveBitRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMaxReceiveBitRate();
    }
    
    @Test
    public void testSetMaxReceiveBitRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double maxReceiveBitRate = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMaxReceiveBitRate(maxReceiveBitRate);
    }
    
    @Test
    public void testGetMaxTransmitBitRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMaxTransmitBitRate();
    }
    
    @Test
    public void testSetMaxTransmitBitRate() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double maxTransmitBitRate = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMaxTransmitBitRate(maxTransmitBitRate);
    }
    
    @Test
    public void testGetMobileQciCosCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMobileQciCosCountList();
    }
    
    @Test
    public void testSetMobileQciCosCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> mobileQciCosCountList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMobileQciCosCountList(mobileQciCosCountList);
    }
    
    @Test
    public void testGetMobileQciCosList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMobileQciCosList();
    }
    
    @Test
    public void testSetMobileQciCosList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> mobileQciCosList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMobileQciCosList(mobileQciCosList);
    }
    
    @Test
    public void testGetNumActivationFailures() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumActivationFailures();
    }
    
    @Test
    public void testSetNumActivationFailures() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numActivationFailures = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumActivationFailures(numActivationFailures);
    }
    
    @Test
    public void testGetNumBitErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumBitErrors();
    }
    
    @Test
    public void testSetNumBitErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numBitErrors = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumBitErrors(numBitErrors);
    }
    
    @Test
    public void testGetNumBytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumBytesReceived();
    }
    
    @Test
    public void testSetNumBytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numBytesReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumBytesReceived(numBytesReceived);
    }
    
    @Test
    public void testGetNumBytesTransmitted() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumBytesTransmitted();
    }
    
    @Test
    public void testSetNumBytesTransmitted() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numBytesTransmitted = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumBytesTransmitted(numBytesTransmitted);
    }
    
    @Test
    public void testGetNumDroppedPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumDroppedPackets();
    }
    
    @Test
    public void testSetNumDroppedPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numDroppedPackets = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumDroppedPackets(numDroppedPackets);
    }
    
    @Test
    public void testGetNumGtpEchoFailures() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumGtpEchoFailures();
    }
    
    @Test
    public void testSetNumGtpEchoFailures() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numGtpEchoFailures = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumGtpEchoFailures(numGtpEchoFailures);
    }
    
    @Test
    public void testGetNumGtpTunnelErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumGtpTunnelErrors();
    }
    
    @Test
    public void testSetNumGtpTunnelErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numGtpTunnelErrors = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumGtpTunnelErrors(numGtpTunnelErrors);
    }
    
    @Test
    public void testGetNumHttpErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumHttpErrors();
    }
    
    @Test
    public void testSetNumHttpErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numHttpErrors = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumHttpErrors(numHttpErrors);
    }
    
    @Test
    public void testGetNumL7BytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumL7BytesReceived();
    }
    
    @Test
    public void testSetNumL7BytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numL7BytesReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumL7BytesReceived(numL7BytesReceived);
    }
    
    @Test
    public void testGetNumL7BytesTransmitted() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumL7BytesTransmitted();
    }
    
    @Test
    public void testSetNumL7BytesTransmitted() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numL7BytesTransmitted = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumL7BytesTransmitted(numL7BytesTransmitted);
    }
    
    @Test
    public void testGetNumLostPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumLostPackets();
    }
    
    @Test
    public void testSetNumLostPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numLostPackets = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumLostPackets(numLostPackets);
    }
    
    @Test
    public void testGetNumOutOfOrderPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumOutOfOrderPackets();
    }
    
    @Test
    public void testSetNumOutOfOrderPackets() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numOutOfOrderPackets = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumOutOfOrderPackets(numOutOfOrderPackets);
    }
    
    @Test
    public void testGetNumPacketErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumPacketErrors();
    }
    
    @Test
    public void testSetNumPacketErrors() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numPacketErrors = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumPacketErrors(numPacketErrors);
    }
    
    @Test
    public void testGetNumPacketsReceivedExclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumPacketsReceivedExclRetrans();
    }
    
    @Test
    public void testSetNumPacketsReceivedExclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numPacketsReceivedExclRetrans = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumPacketsReceivedExclRetrans(numPacketsReceivedExclRetrans);
    }
    
    @Test
    public void testGetNumPacketsReceivedInclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumPacketsReceivedInclRetrans();
    }
    
    @Test
    public void testSetNumPacketsReceivedInclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numPacketsReceivedInclRetrans = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumPacketsReceivedInclRetrans(numPacketsReceivedInclRetrans);
    }
    
    @Test
    public void testGetNumPacketsTransmittedInclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumPacketsTransmittedInclRetrans();
    }
    
    @Test
    public void testSetNumPacketsTransmittedInclRetrans() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numPacketsTransmittedInclRetrans = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumPacketsTransmittedInclRetrans(numPacketsTransmittedInclRetrans);
    }
    
    @Test
    public void testGetNumRetries() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumRetries();
    }
    
    @Test
    public void testSetNumRetries() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numRetries = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumRetries(numRetries);
    }
    
    @Test
    public void testGetNumTimeouts() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumTimeouts();
    }
    
    @Test
    public void testSetNumTimeouts() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numTimeouts = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumTimeouts(numTimeouts);
    }
    
    @Test
    public void testGetNumTunneledL7BytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumTunneledL7BytesReceived();
    }
    
    @Test
    public void testSetNumTunneledL7BytesReceived() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double numTunneledL7BytesReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumTunneledL7BytesReceived(numTunneledL7BytesReceived);
    }
    
    @Test
    public void testGetRoundTripTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRoundTripTime();
    }
    
    @Test
    public void testSetRoundTripTime() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double roundTripTime = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRoundTripTime(roundTripTime);
    }
    
    @Test
    public void testGetTcpFlagCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTcpFlagCountList();
    }
    
    @Test
    public void testSetTcpFlagCountList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<List<Object>> tcpFlagCountList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTcpFlagCountList(tcpFlagCountList);
    }
    
    @Test
    public void testGetTcpFlagList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTcpFlagList();
    }
    
    @Test
    public void testSetTcpFlagList() throws Exception {
        GtpPerFlowMetrics testSubject;
        List<String> tcpFlagList = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTcpFlagList(tcpFlagList);
    }
    
    @Test
    public void testGetTimeToFirstByte() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTimeToFirstByte();
    }
    
    @Test
    public void testSetTimeToFirstByte() throws Exception {
        GtpPerFlowMetrics testSubject;
        Double timeToFirstByte = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTimeToFirstByte(timeToFirstByte);
    }
    
    @Test
    public void testToString() throws Exception {
        GtpPerFlowMetrics testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        GtpPerFlowMetrics testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        GtpPerFlowMetrics testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        GtpPerFlowMetrics testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
