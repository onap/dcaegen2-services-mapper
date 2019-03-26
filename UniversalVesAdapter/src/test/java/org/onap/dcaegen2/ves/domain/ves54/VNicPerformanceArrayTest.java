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


public class VNicPerformanceArrayTest {
    
    private VNicPerformanceArray createTestSubject() {
        return new VNicPerformanceArray();
    }
    
    @Test
    public void testGetReceivedBroadcastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedBroadcastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedBroadcastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedBroadcastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedBroadcastPacketsAccumulated(receivedBroadcastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedBroadcastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedBroadcastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedBroadcastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedBroadcastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedBroadcastPacketsDelta(receivedBroadcastPacketsDelta);
    }
    
    @Test
    public void testGetReceivedDiscardedPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedDiscardedPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedDiscardedPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedDiscardedPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedDiscardedPacketsAccumulated(receivedDiscardedPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedDiscardedPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedDiscardedPacketsDelta();
    }
    
    @Test
    public void testSetReceivedDiscardedPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedDiscardedPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedDiscardedPacketsDelta(receivedDiscardedPacketsDelta);
    }
    
    @Test
    public void testGetReceivedErrorPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedErrorPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedErrorPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedErrorPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedErrorPacketsAccumulated(receivedErrorPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedErrorPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedErrorPacketsDelta();
    }
    
    @Test
    public void testSetReceivedErrorPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedErrorPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedErrorPacketsDelta(receivedErrorPacketsDelta);
    }
    
    @Test
    public void testGetReceivedMulticastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedMulticastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedMulticastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedMulticastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedMulticastPacketsAccumulated(receivedMulticastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedMulticastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedMulticastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedMulticastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedMulticastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedMulticastPacketsDelta(receivedMulticastPacketsDelta);
    }
    
    @Test
    public void testGetReceivedOctetsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedOctetsAccumulated();
    }
    
    @Test
    public void testSetReceivedOctetsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedOctetsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedOctetsAccumulated(receivedOctetsAccumulated);
    }
    
    @Test
    public void testGetReceivedOctetsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedOctetsDelta();
    }
    
    @Test
    public void testSetReceivedOctetsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedOctetsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedOctetsDelta(receivedOctetsDelta);
    }
    
    @Test
    public void testGetReceivedTotalPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedTotalPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedTotalPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedTotalPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedTotalPacketsAccumulated(receivedTotalPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedTotalPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedTotalPacketsDelta();
    }
    
    @Test
    public void testSetReceivedTotalPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedTotalPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedTotalPacketsDelta(receivedTotalPacketsDelta);
    }
    
    @Test
    public void testGetReceivedUnicastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedUnicastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedUnicastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedUnicastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedUnicastPacketsAccumulated(receivedUnicastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedUnicastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedUnicastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedUnicastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double receivedUnicastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedUnicastPacketsDelta(receivedUnicastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedBroadcastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedBroadcastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedBroadcastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedBroadcastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedBroadcastPacketsAccumulated(transmittedBroadcastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedBroadcastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedBroadcastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedBroadcastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedBroadcastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedBroadcastPacketsDelta(transmittedBroadcastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedDiscardedPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedDiscardedPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedDiscardedPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedDiscardedPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedDiscardedPacketsAccumulated(transmittedDiscardedPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedDiscardedPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedDiscardedPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedDiscardedPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedDiscardedPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedDiscardedPacketsDelta(transmittedDiscardedPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedErrorPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedErrorPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedErrorPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedErrorPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedErrorPacketsAccumulated(transmittedErrorPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedErrorPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedErrorPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedErrorPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedErrorPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedErrorPacketsDelta(transmittedErrorPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedMulticastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedMulticastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedMulticastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedMulticastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedMulticastPacketsAccumulated(transmittedMulticastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedMulticastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedMulticastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedMulticastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedMulticastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedMulticastPacketsDelta(transmittedMulticastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedOctetsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedOctetsAccumulated();
    }
    
    @Test
    public void testSetTransmittedOctetsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedOctetsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedOctetsAccumulated(transmittedOctetsAccumulated);
    }
    
    @Test
    public void testGetTransmittedOctetsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedOctetsDelta();
    }
    
    @Test
    public void testSetTransmittedOctetsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedOctetsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedOctetsDelta(transmittedOctetsDelta);
    }
    
    @Test
    public void testGetTransmittedTotalPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedTotalPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedTotalPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedTotalPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedTotalPacketsAccumulated(transmittedTotalPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedTotalPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedTotalPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedTotalPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedTotalPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedTotalPacketsDelta(transmittedTotalPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedUnicastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedUnicastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedUnicastPacketsAccumulated() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedUnicastPacketsAccumulated = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedUnicastPacketsAccumulated(transmittedUnicastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedUnicastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedUnicastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedUnicastPacketsDelta() throws Exception {
        VNicPerformanceArray testSubject;
        Double transmittedUnicastPacketsDelta = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedUnicastPacketsDelta(transmittedUnicastPacketsDelta);
    }
    
    
    
    @Test
    public void testGetValuesAreSuspect() throws Exception {
        VNicPerformanceArray testSubject;
        VNicPerformanceArray.ValuesAreSuspect result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getValuesAreSuspect();
    }
    
    
    
    @Test
    public void testSetValuesAreSuspect() throws Exception {
        VNicPerformanceArray testSubject;
        VNicPerformanceArray.ValuesAreSuspect valuesAreSuspect = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setValuesAreSuspect(valuesAreSuspect);
    }
    
    @Test
    public void testGetVNicIdentifier() throws Exception {
        VNicPerformanceArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVNicIdentifier();
    }
    
    @Test
    public void testSetVNicIdentifier() throws Exception {
        VNicPerformanceArray testSubject;
        String identifier = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVNicIdentifier(identifier);
    }
    
    @Test
    public void testToString() throws Exception {
        VNicPerformanceArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        VNicPerformanceArray testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        VNicPerformanceArray testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        VNicPerformanceArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
