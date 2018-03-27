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

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonEventHeaderTest {

    @Autowired
    CommonEventHeader commonEventHeader = new CommonEventHeader();
    Object value =new Object();
    private Map<String, Object> map = new HashMap<String, Object>();
    @Mock
    InternalHeaderFields internalHeaderFields = new InternalHeaderFields();
    
    @Test
    public void test() {
        
        commonEventHeader.setDomain("Domain");
        commonEventHeader.setEventId("EventID");
        commonEventHeader.setEventName("EventName");
        commonEventHeader.setEventType("EventType");
        commonEventHeader.setLastEpochMicrosec(11.25);
        commonEventHeader.setAdditionalProperty("name", value);
        commonEventHeader.setInternalHeaderFields(internalHeaderFields);
        commonEventHeader.setNfcNamingCode("nfcNamingCode");
        commonEventHeader.setNfNamingCode("nfNamingCode");
        commonEventHeader.setPriority("priority");
        commonEventHeader.setReportingEntityId("reportingEntityId");
        commonEventHeader.setReportingEntityName("reportingEntityName");
        commonEventHeader.setSequence(1L);
        commonEventHeader.setSourceId("sourceId");
        commonEventHeader.setSourceName("sourceName");
        commonEventHeader.setStartEpochMicrosec(11.1);
        commonEventHeader.setVersion(1.2);
        map.put("name", value);
        
        assertEquals (commonEventHeader.getDomain(),"Domain");
        assertEquals (commonEventHeader.getEventId(),"EventID");
        assertEquals (commonEventHeader.getEventName(),"EventName");
        assertEquals (commonEventHeader.getEventType(),"EventType");
        assertEquals(commonEventHeader.getLastEpochMicrosec(), new Double(11.25));
       
        assertEquals (commonEventHeader.getAdditionalProperties(),map);
        assertEquals (commonEventHeader.getInternalHeaderFields(),internalHeaderFields);
        assertEquals (commonEventHeader.getNfcNamingCode(),"nfcNamingCode");
        assertEquals (commonEventHeader.getNfNamingCode(),"nfNamingCode");
        assertEquals (commonEventHeader.getPriority(),"priority");
        assertEquals (commonEventHeader.getReportingEntityId(),"reportingEntityId");
        assertEquals (commonEventHeader.getReportingEntityName(),"reportingEntityName");
        assertEquals (commonEventHeader.getSequence(),new Long(1L));
        assertEquals (commonEventHeader.getSourceId(),"sourceId");
        assertEquals (commonEventHeader.getSourceName(),"sourceName");
        assertEquals (commonEventHeader.getStartEpochMicrosec(),new Double(11.1));
        assertEquals (commonEventHeader.getVersion(),new Double(1.2));
        
        assert (commonEventHeader.toString() != null);
        assert (commonEventHeader.hashCode() != 0);
        
        
        
        
    }

}
