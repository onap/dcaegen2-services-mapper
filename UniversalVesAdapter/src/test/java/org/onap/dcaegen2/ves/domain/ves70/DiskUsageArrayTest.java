/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2018 TechMahindra
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
import org.onap.dcaegen2.ves.domain.ves70.DiskUsageArray;


public class DiskUsageArrayTest {
    
    private DiskUsageArray createTestSubject() {
        return new DiskUsageArray();
    }
    
    @Test
    public void testGetDiskBusResets() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskBusResets();
    }
    
    @Test
    public void testSetDiskBusResets() throws Exception {
        DiskUsageArray testSubject;
        Double diskBusResets = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskBusResets(diskBusResets);
    }
    
    @Test
    public void testGetDiskCommandsAborted() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskCommandsAborted();
    }
    
    @Test
    public void testSetDiskCommandsAborted() throws Exception {
        DiskUsageArray testSubject;
        Double diskCommandsAborted = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskCommandsAborted(diskCommandsAborted);
    }
    
    @Test
    public void testGetDiskCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskCommandsAvg();
    }
    
    @Test
    public void testSetDiskCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskCommandsAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskCommandsAvg(diskCommandsAvg);
    }
    
    @Test
    public void testGetDiskFlushRequests() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskFlushRequests();
    }
    
    @Test
    public void testSetDiskFlushRequests() throws Exception {
        DiskUsageArray testSubject;
        Double diskFlushRequests = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskFlushRequests(diskFlushRequests);
    }
    
    @Test
    public void testGetDiskFlushTime() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskFlushTime();
    }
    
    @Test
    public void testSetDiskFlushTime() throws Exception {
        DiskUsageArray testSubject;
        Double diskFlushTime = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskFlushTime(diskFlushTime);
    }
    
    @Test
    public void testGetDiskIdentifier() throws Exception {
        DiskUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskIdentifier();
    }
    
    @Test
    public void testSetDiskIdentifier() throws Exception {
        DiskUsageArray testSubject;
        String diskIdentifier = "";
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskIdentifier(diskIdentifier);
    }
    
    @Test
    public void testGetDiskIoTimeAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskIoTimeAvg();
    }
    
    @Test
    public void testSetDiskIoTimeAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskIoTimeAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskIoTimeAvg(diskIoTimeAvg);
    }
    
    @Test
    public void testGetDiskIoTimeLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskIoTimeLast();
    }
    
    @Test
    public void testSetDiskIoTimeLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskIoTimeLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskIoTimeLast(diskIoTimeLast);
    }
    
    @Test
    public void testGetDiskIoTimeMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskIoTimeMax();
    }
    
    @Test
    public void testSetDiskIoTimeMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskIoTimeMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskIoTimeMax(diskIoTimeMax);
    }
    
    @Test
    public void testGetDiskIoTimeMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskIoTimeMin();
    }
    
    @Test
    public void testSetDiskIoTimeMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskIoTimeMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskIoTimeMin(diskIoTimeMin);
    }
    
    @Test
    public void testGetDiskMergedReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedReadAvg();
    }
    
    @Test
    public void testSetDiskMergedReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedReadAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedReadAvg(diskMergedReadAvg);
    }
    
    @Test
    public void testGetDiskMergedReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedReadLast();
    }
    
    @Test
    public void testSetDiskMergedReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedReadLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedReadLast(diskMergedReadLast);
    }
    
    @Test
    public void testGetDiskMergedReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedReadMax();
    }
    
    @Test
    public void testSetDiskMergedReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedReadMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedReadMax(diskMergedReadMax);
    }
    
    @Test
    public void testGetDiskMergedReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedReadMin();
    }
    
    @Test
    public void testSetDiskMergedReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedReadMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedReadMin(diskMergedReadMin);
    }
    
    @Test
    public void testGetDiskMergedWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedWriteAvg();
    }
    
    @Test
    public void testSetDiskMergedWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedWriteAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedWriteAvg(diskMergedWriteAvg);
    }
    
    @Test
    public void testGetDiskMergedWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedWriteLast();
    }
    
    @Test
    public void testSetDiskMergedWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedWriteLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedWriteLast(diskMergedWriteLast);
    }
    
    @Test
    public void testGetDiskMergedWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedWriteMax();
    }
    
    @Test
    public void testSetDiskMergedWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedWriteMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedWriteMax(diskMergedWriteMax);
    }
    
    @Test
    public void testGetDiskMergedWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskMergedWriteMin();
    }
    
    @Test
    public void testSetDiskMergedWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskMergedWriteMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskMergedWriteMin(diskMergedWriteMin);
    }
    
    @Test
    public void testGetDiskOctetsReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsReadAvg();
    }
    
    @Test
    public void testSetDiskOctetsReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsReadAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsReadAvg(diskOctetsReadAvg);
    }
    
    @Test
    public void testGetDiskOctetsReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsReadLast();
    }
    
    @Test
    public void testSetDiskOctetsReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsReadLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsReadLast(diskOctetsReadLast);
    }
    
    @Test
    public void testGetDiskOctetsReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsReadMax();
    }
    
    @Test
    public void testSetDiskOctetsReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsReadMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsReadMax(diskOctetsReadMax);
    }
    
    @Test
    public void testGetDiskOctetsReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsReadMin();
    }
    
    @Test
    public void testSetDiskOctetsReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsReadMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsReadMin(diskOctetsReadMin);
    }
    
    @Test
    public void testGetDiskOctetsWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsWriteAvg();
    }
    
    @Test
    public void testSetDiskOctetsWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsWriteAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsWriteAvg(diskOctetsWriteAvg);
    }
    
    @Test
    public void testGetDiskOctetsWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsWriteLast();
    }
    
    @Test
    public void testSetDiskOctetsWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsWriteLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsWriteLast(diskOctetsWriteLast);
    }
    
    @Test
    public void testGetDiskOctetsWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsWriteMax();
    }
    
    @Test
    public void testSetDiskOctetsWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsWriteMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsWriteMax(diskOctetsWriteMax);
    }
    
    @Test
    public void testGetDiskOctetsWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOctetsWriteMin();
    }
    
    @Test
    public void testSetDiskOctetsWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskOctetsWriteMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOctetsWriteMin(diskOctetsWriteMin);
    }
    
    @Test
    public void testGetDiskOpsReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsReadAvg();
    }
    
    @Test
    public void testSetDiskOpsReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsReadAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsReadAvg(diskOpsReadAvg);
    }
    
    @Test
    public void testGetDiskOpsReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsReadLast();
    }
    
    @Test
    public void testSetDiskOpsReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsReadLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsReadLast(diskOpsReadLast);
    }
    
    @Test
    public void testGetDiskOpsReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsReadMax();
    }
    
    @Test
    public void testSetDiskOpsReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsReadMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsReadMax(diskOpsReadMax);
    }
    
    @Test
    public void testGetDiskOpsReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsReadMin();
    }
    
    @Test
    public void testSetDiskOpsReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsReadMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsReadMin(diskOpsReadMin);
    }
    
    @Test
    public void testGetDiskOpsWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsWriteAvg();
    }
    
    @Test
    public void testSetDiskOpsWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsWriteAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsWriteAvg(diskOpsWriteAvg);
    }
    
    @Test
    public void testGetDiskOpsWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsWriteLast();
    }
    
    @Test
    public void testSetDiskOpsWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsWriteLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsWriteLast(diskOpsWriteLast);
    }
    
    @Test
    public void testGetDiskOpsWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsWriteMax();
    }
    
    @Test
    public void testSetDiskOpsWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsWriteMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsWriteMax(diskOpsWriteMax);
    }
    
    @Test
    public void testGetDiskOpsWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskOpsWriteMin();
    }
    
    @Test
    public void testSetDiskOpsWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskOpsWriteMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskOpsWriteMin(diskOpsWriteMin);
    }
    
    @Test
    public void testGetDiskPendingOperationsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskPendingOperationsAvg();
    }
    
    @Test
    public void testSetDiskPendingOperationsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskPendingOperationsAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskPendingOperationsAvg(diskPendingOperationsAvg);
    }
    
    @Test
    public void testGetDiskPendingOperationsLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskPendingOperationsLast();
    }
    
    @Test
    public void testSetDiskPendingOperationsLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskPendingOperationsLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskPendingOperationsLast(diskPendingOperationsLast);
    }
    
    @Test
    public void testGetDiskPendingOperationsMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskPendingOperationsMax();
    }
    
    @Test
    public void testSetDiskPendingOperationsMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskPendingOperationsMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskPendingOperationsMax(diskPendingOperationsMax);
    }
    
    @Test
    public void testGetDiskPendingOperationsMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskPendingOperationsMin();
    }
    
    @Test
    public void testSetDiskPendingOperationsMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskPendingOperationsMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskPendingOperationsMin(diskPendingOperationsMin);
    }
    
    @Test
    public void testGetDiskReadCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskReadCommandsAvg();
    }
    
    @Test
    public void testSetDiskReadCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskReadCommandsAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskReadCommandsAvg(diskReadCommandsAvg);
    }
    
    @Test
    public void testGetDiskTime() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTime();
    }
    
    @Test
    public void testSetDiskTime() throws Exception {
        DiskUsageArray testSubject;
        Double diskTime = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTime(diskTime);
    }
    
    @Test
    public void testGetDiskTimeReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeReadAvg();
    }
    
    @Test
    public void testSetDiskTimeReadAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeReadAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeReadAvg(diskTimeReadAvg);
    }
    
    @Test
    public void testGetDiskTimeReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeReadLast();
    }
    
    @Test
    public void testSetDiskTimeReadLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeReadLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeReadLast(diskTimeReadLast);
    }
    
    @Test
    public void testGetDiskTimeReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeReadMax();
    }
    
    @Test
    public void testSetDiskTimeReadMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeReadMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeReadMax(diskTimeReadMax);
    }
    
    @Test
    public void testGetDiskTimeReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeReadMin();
    }
    
    @Test
    public void testSetDiskTimeReadMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeReadMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeReadMin(diskTimeReadMin);
    }
    
    @Test
    public void testGetDiskTimeWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeWriteAvg();
    }
    
    @Test
    public void testSetDiskTimeWriteAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeWriteAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeWriteAvg(diskTimeWriteAvg);
    }
    
    @Test
    public void testGetDiskTimeWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeWriteLast();
    }
    
    @Test
    public void testSetDiskTimeWriteLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeWriteLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeWriteLast(diskTimeWriteLast);
    }
    
    @Test
    public void testGetDiskTimeWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeWriteMax();
    }
    
    @Test
    public void testSetDiskTimeWriteMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeWriteMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeWriteMax(diskTimeWriteMax);
    }
    
    @Test
    public void testGetDiskTimeWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTimeWriteMin();
    }
    
    @Test
    public void testSetDiskTimeWriteMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskTimeWriteMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTimeWriteMin(diskTimeWriteMin);
    }
    
    @Test
    public void testGetDiskTotalReadLatencyAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTotalReadLatencyAvg();
    }
    
    @Test
    public void testSetDiskTotalReadLatencyAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskTotalReadLatencyAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTotalReadLatencyAvg(diskTotalReadLatencyAvg);
    }
    
    @Test
    public void testGetDiskTotalWriteLatencyAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskTotalWriteLatencyAvg();
    }
    
    @Test
    public void testSetDiskTotalWriteLatencyAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskTotalWriteLatencyAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskTotalWriteLatencyAvg(diskTotalWriteLatencyAvg);
    }
    
    @Test
    public void testGetDiskWeightedIoTimeAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskWeightedIoTimeAvg();
    }
    
    @Test
    public void testSetDiskWeightedIoTimeAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskWeightedIoTimeAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskWeightedIoTimeAvg(diskWeightedIoTimeAvg);
    }
    
    @Test
    public void testGetDiskWeightedIoTimeLast() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskWeightedIoTimeLast();
    }
    
    @Test
    public void testSetDiskWeightedIoTimeLast() throws Exception {
        DiskUsageArray testSubject;
        Double diskWeightedIoTimeLast = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskWeightedIoTimeLast(diskWeightedIoTimeLast);
    }
    
    @Test
    public void testGetDiskWeightedIoTimeMax() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskWeightedIoTimeMax();
    }
    
    @Test
    public void testSetDiskWeightedIoTimeMax() throws Exception {
        DiskUsageArray testSubject;
        Double diskWeightedIoTimeMax = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskWeightedIoTimeMax(diskWeightedIoTimeMax);
    }
    
    @Test
    public void testGetDiskWeightedIoTimeMin() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskWeightedIoTimeMin();
    }
    
    @Test
    public void testSetDiskWeightedIoTimeMin() throws Exception {
        DiskUsageArray testSubject;
        Double diskWeightedIoTimeMin = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskWeightedIoTimeMin(diskWeightedIoTimeMin);
    }
    
    @Test
    public void testGetDiskWriteCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskWriteCommandsAvg();
    }
    
    @Test
    public void testSetDiskWriteCommandsAvg() throws Exception {
        DiskUsageArray testSubject;
        Double diskWriteCommandsAvg = null;
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskWriteCommandsAvg(diskWriteCommandsAvg);
    }
    
    @Test
    public void testToString() throws Exception {
        DiskUsageArray testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testHashCode() throws Exception {
        DiskUsageArray testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    @Test
    public void testEquals() throws Exception {
        DiskUsageArray testSubject;
        DiskUsageArray testSubject2;
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
