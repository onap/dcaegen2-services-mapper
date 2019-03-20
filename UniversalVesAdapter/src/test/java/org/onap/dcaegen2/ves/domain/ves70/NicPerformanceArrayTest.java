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
import org.onap.dcaegen2.ves.domain.ves70.NicPerformanceArray;
import org.onap.dcaegen2.ves.domain.ves70.NicPerformanceArray.AdministrativeState;
import org.onap.dcaegen2.ves.domain.ves70.NicPerformanceArray.OperationalState;
import org.onap.dcaegen2.ves.domain.ves70.NicPerformanceArray.ValuesAreSuspect;


public class NicPerformanceArrayTest {
    
    private NicPerformanceArray createTestSubject() {
        return new NicPerformanceArray();
    }
    
    @Test
    public void testGetAdministrativeState() throws Exception {
        NicPerformanceArray testSubject;
        AdministrativeState result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdministrativeState();
    }
    
    @Test
    public void testSetAdministrativeState() throws Exception {
        NicPerformanceArray testSubject;
        AdministrativeState administrativeState = AdministrativeState.IN_SERVICE;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdministrativeState(administrativeState);
    }
    
    @Test
    public void testGetNicIdentifier() throws Exception {
        NicPerformanceArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNicIdentifier();
    }
    
    @Test
    public void testSetNicIdentifier() throws Exception {
        NicPerformanceArray testSubject;
        String nicIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNicIdentifier(nicIdentifier);
    }
    
    @Test
    public void testGetOperationalState() throws Exception {
        NicPerformanceArray testSubject;
        OperationalState result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getOperationalState();
    }
    
    @Test
    public void testSetOperationalState() throws Exception {
        NicPerformanceArray testSubject;
        OperationalState operationalState = OperationalState.IN_SERVICE;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setOperationalState(operationalState);
    }
    
    @Test
    public void testGetReceivedBroadcastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedBroadcastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedBroadcastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedBroadcastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedBroadcastPacketsAccumulated(receivedBroadcastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedBroadcastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedBroadcastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedBroadcastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedBroadcastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedBroadcastPacketsDelta(receivedBroadcastPacketsDelta);
    }
    
    @Test
    public void testGetReceivedDiscardedPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedDiscardedPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedDiscardedPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedDiscardedPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedDiscardedPacketsAccumulated(receivedDiscardedPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedDiscardedPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedDiscardedPacketsDelta();
    }
    
    @Test
    public void testSetReceivedDiscardedPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedDiscardedPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedDiscardedPacketsDelta(receivedDiscardedPacketsDelta);
    }
    
    @Test
    public void testGetReceivedErrorPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedErrorPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedErrorPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedErrorPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedErrorPacketsAccumulated(receivedErrorPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedErrorPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedErrorPacketsDelta();
    }
    
    @Test
    public void testSetReceivedErrorPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedErrorPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedErrorPacketsDelta(receivedErrorPacketsDelta);
    }
    
    @Test
    public void testGetReceivedMulticastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedMulticastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedMulticastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedMulticastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedMulticastPacketsAccumulated(receivedMulticastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedMulticastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedMulticastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedMulticastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedMulticastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedMulticastPacketsDelta(receivedMulticastPacketsDelta);
    }
    
    @Test
    public void testGetReceivedOctetsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedOctetsAccumulated();
    }
    
    @Test
    public void testSetReceivedOctetsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedOctetsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedOctetsAccumulated(receivedOctetsAccumulated);
    }
    
    @Test
    public void testGetReceivedOctetsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedOctetsDelta();
    }
    
    @Test
    public void testSetReceivedOctetsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedOctetsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedOctetsDelta(receivedOctetsDelta);
    }
    
    @Test
    public void testGetReceivedTotalPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedTotalPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedTotalPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedTotalPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedTotalPacketsAccumulated(receivedTotalPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedPercentDiscard() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedPercentDiscard();
    }
    
    @Test
    public void testSetReceivedPercentDiscard() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedPercentDiscard = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedPercentDiscard(receivedPercentDiscard);
    }
    
    @Test
    public void testGetReceivedPercentError() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedPercentError();
    }
    
    @Test
    public void testSetReceivedPercentError() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedPercentError = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedPercentError(receivedPercentError);
    }
    
    @Test
    public void testGetReceivedTotalPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedTotalPacketsDelta();
    }
    
    @Test
    public void testSetReceivedTotalPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedTotalPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedTotalPacketsDelta(receivedTotalPacketsDelta);
    }
    
    @Test
    public void testGetReceivedUnicastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedUnicastPacketsAccumulated();
    }
    
    @Test
    public void testSetReceivedUnicastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedUnicastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedUnicastPacketsAccumulated(receivedUnicastPacketsAccumulated);
    }
    
    @Test
    public void testGetReceivedUnicastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedUnicastPacketsDelta();
    }
    
    @Test
    public void testSetReceivedUnicastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedUnicastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedUnicastPacketsDelta(receivedUnicastPacketsDelta);
    }
    
    @Test
    public void testGetReceivedUtilization() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReceivedUtilization();
    }
    
    @Test
    public void testSetReceivedUtilization() throws Exception {
        NicPerformanceArray testSubject;
        Double receivedUtilization = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReceivedUtilization(receivedUtilization);
    }
    
    @Test
    public void testGetSpeed() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSpeed();
    }
    
    @Test
    public void testSetSpeed() throws Exception {
        NicPerformanceArray testSubject;
        Double speed = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSpeed(speed);
    }
    
    @Test
    public void testGetTransmittedBroadcastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedBroadcastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedBroadcastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedBroadcastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedBroadcastPacketsAccumulated(transmittedBroadcastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedBroadcastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedBroadcastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedBroadcastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedBroadcastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedBroadcastPacketsDelta(transmittedBroadcastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedDiscardedPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedDiscardedPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedDiscardedPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedDiscardedPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedDiscardedPacketsAccumulated(transmittedDiscardedPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedDiscardedPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedDiscardedPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedDiscardedPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedDiscardedPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedDiscardedPacketsDelta(transmittedDiscardedPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedErrorPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedErrorPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedErrorPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedErrorPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedErrorPacketsAccumulated(transmittedErrorPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedErrorPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedErrorPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedErrorPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedErrorPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedErrorPacketsDelta(transmittedErrorPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedMulticastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedMulticastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedMulticastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedMulticastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject
                .setTransmittedMulticastPacketsAccumulated(transmittedMulticastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedMulticastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedMulticastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedMulticastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedMulticastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedMulticastPacketsDelta(transmittedMulticastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedOctetsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedOctetsAccumulated();
    }
    
    @Test
    public void testSetTransmittedOctetsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedOctetsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedOctetsAccumulated(transmittedOctetsAccumulated);
    }
    
    @Test
    public void testGetTransmittedOctetsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedOctetsDelta();
    }
    
    @Test
    public void testSetTransmittedOctetsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedOctetsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedOctetsDelta(transmittedOctetsDelta);
    }
    
    @Test
    public void testGetTransmittedTotalPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedTotalPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedTotalPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedTotalPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedTotalPacketsAccumulated(transmittedTotalPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedTotalPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedTotalPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedTotalPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedTotalPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedTotalPacketsDelta(transmittedTotalPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedUnicastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedUnicastPacketsAccumulated();
    }
    
    @Test
    public void testSetTransmittedUnicastPacketsAccumulated() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedUnicastPacketsAccumulated = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedUnicastPacketsAccumulated(transmittedUnicastPacketsAccumulated);
    }
    
    @Test
    public void testGetTransmittedUnicastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedUnicastPacketsDelta();
    }
    
    @Test
    public void testSetTransmittedUnicastPacketsDelta() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedUnicastPacketsDelta = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedUnicastPacketsDelta(transmittedUnicastPacketsDelta);
    }
    
    @Test
    public void testGetTransmittedPercentDiscard() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedPercentDiscard();
    }
    
    @Test
    public void testSetTransmittedPercentDiscard() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedPercentDiscard = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedPercentDiscard(transmittedPercentDiscard);
    }
    
    @Test
    public void testGetTransmittedPercentError() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedPercentError();
    }
    
    @Test
    public void testSetTransmittedPercentError() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedPercentError = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedPercentError(transmittedPercentError);
    }
    
    @Test
    public void testGetTransmittedUtilization() throws Exception {
        NicPerformanceArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getTransmittedUtilization();
    }
    
    @Test
    public void testSetTransmittedUtilization() throws Exception {
        NicPerformanceArray testSubject;
        Double transmittedUtilization = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setTransmittedUtilization(transmittedUtilization);
    }
    
    @Test
    public void testGetValuesAreSuspect() throws Exception {
        NicPerformanceArray testSubject;
        ValuesAreSuspect result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getValuesAreSuspect();
    }
    
    @Test
    public void testSetValuesAreSuspect() throws Exception {
        NicPerformanceArray testSubject;
        ValuesAreSuspect valuesAreSuspect = ValuesAreSuspect.FALSE;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setValuesAreSuspect(valuesAreSuspect);
    }
    
    @Test
    public void testToString() throws Exception {
        NicPerformanceArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        NicPerformanceArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        NicPerformanceArray testSubject;
        NicPerformanceArray testSubject2;
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
