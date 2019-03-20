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
import org.onap.dcaegen2.ves.domain.ves70.LatencyDistribution;


public class LatencyDistributionTest {
    
    private LatencyDistribution createTestSubject() {
        return new LatencyDistribution();
    }
    
    @Test
    public void testGetCountsInTheBucket() throws Exception {
        LatencyDistribution testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCountsInTheBucket();
    }
    
    @Test
    public void testSetCountsInTheBucket() throws Exception {
        LatencyDistribution testSubject;
        Double countsInTheBucket = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCountsInTheBucket(countsInTheBucket);
    }
    
    @Test
    public void testGetHighEndOfLatencyBucket() throws Exception {
        LatencyDistribution testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getHighEndOfLatencyBucket();
    }
    
    @Test
    public void testSetHighEndOfLatencyBucket() throws Exception {
        LatencyDistribution testSubject;
        Double highEndOfLatencyBucket = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setHighEndOfLatencyBucket(highEndOfLatencyBucket);
    }
    
    @Test
    public void testGetLowEndOfLatencyBucket() throws Exception {
        LatencyDistribution testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLowEndOfLatencyBucket();
    }
    
    @Test
    public void testSetLowEndOfLatencyBucket() throws Exception {
        LatencyDistribution testSubject;
        Double lowEndOfLatencyBucket = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLowEndOfLatencyBucket(lowEndOfLatencyBucket);
    }
    
    @Test
    public void testToString() throws Exception {
        LatencyDistribution testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        LatencyDistribution testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        LatencyDistribution testSubject;
        LatencyDistribution testSubject2;
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
