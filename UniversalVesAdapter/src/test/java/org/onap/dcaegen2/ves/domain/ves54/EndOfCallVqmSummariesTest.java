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


import java.util.Map;

import org.junit.Test;


public class EndOfCallVqmSummariesTest {
    
    private EndOfCallVqmSummaries createTestSubject() {
        return new EndOfCallVqmSummaries();
    }
    
    @Test
    public void testGetAdjacencyName() throws Exception {
        EndOfCallVqmSummaries testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdjacencyName();
    }
    
    @Test
    public void testSetAdjacencyName() throws Exception {
        EndOfCallVqmSummaries testSubject;
        String adjacencyName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdjacencyName(adjacencyName);
    }
    
    
    
    @Test
    public void testGetEndpointDescription() throws Exception {
        EndOfCallVqmSummaries testSubject;
        EndOfCallVqmSummaries.EndpointDescription result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointDescription();
    }
    
    
    
    @Test
    public void testSetEndpointDescription() throws Exception {
        EndOfCallVqmSummaries testSubject;
        EndOfCallVqmSummaries.EndpointDescription endpointDescription =
                EndOfCallVqmSummaries.EndpointDescription.CALLEE;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointDescription(endpointDescription);
    }
    
    @Test
    public void testGetEndpointJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointJitter();
    }
    
    @Test
    public void testSetEndpointJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointJitter = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointJitter(endpointJitter);
    }
    
    @Test
    public void testGetEndpointRtpOctetsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpOctetsDiscarded();
    }
    
    @Test
    public void testSetEndpointRtpOctetsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpOctetsDiscarded = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpOctetsDiscarded(endpointRtpOctetsDiscarded);
    }
    
    @Test
    public void testGetEndpointRtpOctetsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpOctetsReceived();
    }
    
    @Test
    public void testSetEndpointRtpOctetsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpOctetsReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpOctetsReceived(endpointRtpOctetsReceived);
    }
    
    @Test
    public void testGetEndpointRtpOctetsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpOctetsSent();
    }
    
    @Test
    public void testSetEndpointRtpOctetsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpOctetsSent = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpOctetsSent(endpointRtpOctetsSent);
    }
    
    @Test
    public void testGetEndpointRtpPacketsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpPacketsDiscarded();
    }
    
    @Test
    public void testSetEndpointRtpPacketsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpPacketsDiscarded = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpPacketsDiscarded(endpointRtpPacketsDiscarded);
    }
    
    @Test
    public void testGetEndpointRtpPacketsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpPacketsReceived();
    }
    
    @Test
    public void testSetEndpointRtpPacketsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpPacketsReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpPacketsReceived(endpointRtpPacketsReceived);
    }
    
    @Test
    public void testGetEndpointRtpPacketsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpPacketsSent();
    }
    
    @Test
    public void testSetEndpointRtpPacketsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpPacketsSent = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpPacketsSent(endpointRtpPacketsSent);
    }
    
    @Test
    public void testGetLocalJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalJitter();
    }
    
    @Test
    public void testSetLocalJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localJitter = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalJitter(localJitter);
    }
    
    @Test
    public void testGetLocalRtpOctetsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpOctetsDiscarded();
    }
    
    @Test
    public void testSetLocalRtpOctetsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpOctetsDiscarded = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpOctetsDiscarded(localRtpOctetsDiscarded);
    }
    
    @Test
    public void testGetLocalRtpOctetsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpOctetsReceived();
    }
    
    @Test
    public void testSetLocalRtpOctetsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpOctetsReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpOctetsReceived(localRtpOctetsReceived);
    }
    
    @Test
    public void testGetLocalRtpOctetsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpOctetsSent();
    }
    
    @Test
    public void testSetLocalRtpOctetsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpOctetsSent = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpOctetsSent(localRtpOctetsSent);
    }
    
    @Test
    public void testGetLocalRtpPacketsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpPacketsDiscarded();
    }
    
    @Test
    public void testSetLocalRtpPacketsDiscarded() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpPacketsDiscarded = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpPacketsDiscarded(localRtpPacketsDiscarded);
    }
    
    @Test
    public void testGetLocalRtpPacketsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpPacketsReceived();
    }
    
    @Test
    public void testSetLocalRtpPacketsReceived() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpPacketsReceived = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpPacketsReceived(localRtpPacketsReceived);
    }
    
    @Test
    public void testGetLocalRtpPacketsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpPacketsSent();
    }
    
    @Test
    public void testSetLocalRtpPacketsSent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpPacketsSent = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpPacketsSent(localRtpPacketsSent);
    }
    
    @Test
    public void testGetMosCqe() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMosCqe();
    }
    
    @Test
    public void testSetMosCqe() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double mosCqe = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMosCqe(mosCqe);
    }
    
    @Test
    public void testGetPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPacketsLost();
    }
    
    @Test
    public void testSetPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double packetsLost = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPacketsLost(packetsLost);
    }
    
    @Test
    public void testGetPacketLossPercent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPacketLossPercent();
    }
    
    @Test
    public void testSetPacketLossPercent() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double packetLossPercent = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPacketLossPercent(packetLossPercent);
    }
    
    @Test
    public void testGetRFactor() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRFactor();
    }
    
    @Test
    public void testSetRFactor() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double data = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRFactor(data);
    }
    
    @Test
    public void testGetRoundTripDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRoundTripDelay();
    }
    
    @Test
    public void testSetRoundTripDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double roundTripDelay = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRoundTripDelay(roundTripDelay);
    }
    
    @Test
    public void testToString() throws Exception {
        EndOfCallVqmSummaries testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        EndOfCallVqmSummaries testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        EndOfCallVqmSummaries testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
