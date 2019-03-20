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

package org.onap.dcaegen2.ves.domain.ves70;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves70.EndOfCallVqmSummaries;
import org.onap.dcaegen2.ves.domain.ves70.EndOfCallVqmSummaries.EndpointDescription;


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
    public void testGetEndpointAverageJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointAverageJitter();
    }
    
    @Test
    public void testSetEndpointAverageJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointAverageJitter = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointAverageJitter(endpointAverageJitter);
    }
    
    @Test
    public void testGetEndpointDescription() throws Exception {
        EndOfCallVqmSummaries testSubject;
        EndpointDescription result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointDescription();
    }
    
    @Test
    public void testSetEndpointDescription() throws Exception {
        EndOfCallVqmSummaries testSubject;
        EndpointDescription endpointDescription = EndpointDescription.CALLEE;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointDescription(endpointDescription);
    }
    
    @Test
    public void testGetEndpointMaxJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointMaxJitter();
    }
    
    @Test
    public void testSetEndpointMaxJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointMaxJitter = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointMaxJitter(endpointMaxJitter);
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
    public void testGetEndpointRtpOctetsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpOctetsLost();
    }
    
    @Test
    public void testSetEndpointRtpOctetsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpOctetsLost = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpOctetsLost(endpointRtpOctetsLost);
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
    public void testGetEndpointRtpPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEndpointRtpPacketsLost();
    }
    
    @Test
    public void testSetEndpointRtpPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double endpointRtpPacketsLost = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEndpointRtpPacketsLost(endpointRtpPacketsLost);
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
    public void testGetLocalAverageJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalAverageJitter();
    }
    
    @Test
    public void testSetLocalAverageJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localAverageJitter = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalAverageJitter(localAverageJitter);
    }
    
    @Test
    public void testGetLocalAverageJitterBufferDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalAverageJitterBufferDelay();
    }
    
    @Test
    public void testSetLocalAverageJitterBufferDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localAverageJitterBufferDelay = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalAverageJitterBufferDelay(localAverageJitterBufferDelay);
    }
    
    @Test
    public void testGetLocalMaxJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalMaxJitter();
    }
    
    @Test
    public void testSetLocalMaxJitter() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localMaxJitter = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalMaxJitter(localMaxJitter);
    }
    
    @Test
    public void testGetLocalMaxJitterBufferDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalMaxJitterBufferDelay();
    }
    
    @Test
    public void testSetLocalMaxJitterBufferDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localMaxJitterBufferDelay = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalMaxJitterBufferDelay(localMaxJitterBufferDelay);
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
    public void testGetLocalRtpOctetsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpOctetsLost();
    }
    
    @Test
    public void testSetLocalRtpOctetsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpOctetsLost = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpOctetsLost(localRtpOctetsLost);
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
    public void testGetLocalRtpPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLocalRtpPacketsLost();
    }
    
    @Test
    public void testSetLocalRtpPacketsLost() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double localRtpPacketsLost = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLocalRtpPacketsLost(localRtpPacketsLost);
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
    public void testGetOneWayDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOneWayDelay();
    }
    
    @Test
    public void testSetOneWayDelay() throws Exception {
        EndOfCallVqmSummaries testSubject;
        Double oneWayDelay = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOneWayDelay(oneWayDelay);
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
        Double value = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRFactor(value);
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
    public void testHashCode() throws Exception {
        EndOfCallVqmSummaries testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        EndOfCallVqmSummaries testSubject;
        EndOfCallVqmSummaries testSubject2;
        Object other = null;
        boolean result;
        
        // default test
        testSubject = createTestSubject();
        testSubject2 = createTestSubject();
        result = testSubject.equals(other);
        result = testSubject.equals(testSubject);
        result = testSubject.equals(testSubject2);
        assertNotNull(result);
    }
}
