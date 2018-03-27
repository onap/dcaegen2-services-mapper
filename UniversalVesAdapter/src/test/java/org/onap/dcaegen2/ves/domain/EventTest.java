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

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class EventTest {

    @Autowired
    Event event = new Event();
    @Mock
    CommonEventHeader commonEventHeader = new CommonEventHeader();
    @Mock
    FaultFields faultFields = new FaultFields();
    @Mock
    HeartbeatFields heartbeatFields = new HeartbeatFields();
    
    @Test
    public void test() {
       event.setCommonEventHeader(commonEventHeader);
       event.setFaultFields(faultFields);
       event.setHeartbeatFields(heartbeatFields);
       
       assertEquals (event.getCommonEventHeader(),commonEventHeader);
       assertEquals (event.getFaultFields(),faultFields);
       assertEquals (event.getHeartbeatFields(),heartbeatFields);
       
       assert (event.toString() != null);
       assert (event.hashCode() != 0);
       
       
       
    }

}
