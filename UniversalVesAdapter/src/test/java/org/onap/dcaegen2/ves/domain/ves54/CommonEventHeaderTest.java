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


public class CommonEventHeaderTest {
    
    private CommonEventHeader createTestSubject() {
        return new CommonEventHeader();
    }
    
    @Test
    public void testGetDomain() throws Exception {
        CommonEventHeader testSubject;
        CommonEventHeader.Domain result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDomain();
    }
    
    @Test
    public void testSetDomain() throws Exception {
        CommonEventHeader testSubject;
        CommonEventHeader.Domain domain = CommonEventHeader.Domain.FAULT;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDomain(domain);
    }
    
    @Test
    public void testGetEventId() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventId();
    }
    
    @Test
    public void testSetEventId() throws Exception {
        CommonEventHeader testSubject;
        String eventId = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventId(eventId);
    }
    
    @Test
    public void testGetEventName() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventName();
    }
    
    @Test
    public void testSetEventName() throws Exception {
        CommonEventHeader testSubject;
        String eventName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventName(eventName);
    }
    
    @Test
    public void testGetEventType() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getEventType();
    }
    
    @Test
    public void testSetEventType() throws Exception {
        CommonEventHeader testSubject;
        String eventType = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setEventType(eventType);
    }
    
    @Test
    public void testGetInternalHeaderFields() throws Exception {
        CommonEventHeader testSubject;
        InternalHeaderFields result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getInternalHeaderFields();
    }
    
    @Test
    public void testSetInternalHeaderFields() throws Exception {
        CommonEventHeader testSubject;
        InternalHeaderFields internalHeaderFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setInternalHeaderFields(internalHeaderFields);
    }
    
    @Test
    public void testGetLastEpochMicrosec() throws Exception {
        CommonEventHeader testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLastEpochMicrosec();
    }
    
    @Test
    public void testSetLastEpochMicrosec() throws Exception {
        CommonEventHeader testSubject;
        Double lastEpochMicrosec = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLastEpochMicrosec(lastEpochMicrosec);
    }
    
    @Test
    public void testGetNfcNamingCode() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNfcNamingCode();
    }
    
    @Test
    public void testSetNfcNamingCode() throws Exception {
        CommonEventHeader testSubject;
        String nfcNamingCode = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfcNamingCode(nfcNamingCode);
    }
    
    @Test
    public void testGetNfNamingCode() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNfNamingCode();
    }
    
    @Test
    public void testSetNfNamingCode() throws Exception {
        CommonEventHeader testSubject;
        String nfNamingCode = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNfNamingCode(nfNamingCode);
    }
    
    @Test
    public void testGetPriority() throws Exception {
        CommonEventHeader testSubject;
        CommonEventHeader.Priority result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getPriority();
    }
    
    @Test
    public void testSetPriority() throws Exception {
        CommonEventHeader testSubject;
        CommonEventHeader.Priority priority = CommonEventHeader.Priority.HIGH;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setPriority(priority);
    }
    
    @Test
    public void testGetReportingEntityId() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReportingEntityId();
    }
    
    @Test
    public void testSetReportingEntityId() throws Exception {
        CommonEventHeader testSubject;
        String reportingEntityId = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReportingEntityId(reportingEntityId);
    }
    
    @Test
    public void testGetReportingEntityName() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getReportingEntityName();
    }
    
    @Test
    public void testSetReportingEntityName() throws Exception {
        CommonEventHeader testSubject;
        String reportingEntityName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setReportingEntityName(reportingEntityName);
    }
    
    @Test
    public void testGetSequence() throws Exception {
        CommonEventHeader testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSequence();
    }
    
    @Test
    public void testSetSequence() throws Exception {
        CommonEventHeader testSubject;
        Integer sequence = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSequence(sequence);
    }
    
    @Test
    public void testGetSourceId() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSourceId();
    }
    
    @Test
    public void testSetSourceId() throws Exception {
        CommonEventHeader testSubject;
        String sourceId = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSourceId(sourceId);
    }
    
    @Test
    public void testGetSourceName() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getSourceName();
    }
    
    @Test
    public void testSetSourceName() throws Exception {
        CommonEventHeader testSubject;
        String sourceName = "";
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setSourceName(sourceName);
    }
    
    @Test
    public void testGetStartEpochMicrosec() throws Exception {
        CommonEventHeader testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getStartEpochMicrosec();
    }
    
    @Test
    public void testSetStartEpochMicrosec() throws Exception {
        CommonEventHeader testSubject;
        Double startEpochMicrosec = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setStartEpochMicrosec(startEpochMicrosec);
    }
    
    @Test
    public void testGetVersion() throws Exception {
        CommonEventHeader testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVersion();
    }
    
    @Test
    public void testSetVersion() throws Exception {
        CommonEventHeader testSubject;
        Double version = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVersion(version);
    }
    
    @Test
    public void testToString() throws Exception {
        CommonEventHeader testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        CommonEventHeader testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        CommonEventHeader testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        CommonEventHeader testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
