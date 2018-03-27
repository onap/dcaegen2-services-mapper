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
import org.springframework.beans.factory.annotation.Autowired;

public class AlarmAdditionalInformationTest {

   @Autowired
   AlarmAdditionalInformation alarmAdditionalInformation = new AlarmAdditionalInformation();
   Object value1 = new Object();
   Map<String, Object> map = new HashMap<String, Object>();
   
       
    
    @Test
    public void test() {
        alarmAdditionalInformation.setAdditionalProperty("name", value1);
        alarmAdditionalInformation.setName("name2");
        alarmAdditionalInformation.setValue("value2");
        
        map.put("name", value1);
        assertEquals(alarmAdditionalInformation.getName(),"name2");
        assertEquals(alarmAdditionalInformation.getValue(),"value2");
        assertEquals(alarmAdditionalInformation.getAdditionalProperties(),map);
        assert (alarmAdditionalInformation.toString() != null);
        assert (alarmAdditionalInformation.hashCode() != 0);
        
        
     }

}
