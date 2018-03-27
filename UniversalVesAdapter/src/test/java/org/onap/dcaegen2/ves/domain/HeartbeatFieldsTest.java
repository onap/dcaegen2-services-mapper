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
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class HeartbeatFieldsTest {

    @Autowired
    HeartbeatFields heartbeatFields = new HeartbeatFields();
    Object value = new Object();
    
    List<AdditionalField> additionalFields = null;
    @Mock
    AdditionalField field = new AdditionalField();
    
    Map<String, Object> a = new HashMap<String, Object>();
    @Test
    public void test() {
        //additionalFields.add(field);
        heartbeatFields.setAdditionalFields(additionalFields);
        heartbeatFields.setAdditionalProperty("name", value);
        heartbeatFields.setHeartbeatFieldsVersion(11.1);
        heartbeatFields.setHeartbeatInterval(1L);
        a.put("name", value);
        assertEquals (heartbeatFields.getAdditionalFields(),additionalFields);
        assertEquals (heartbeatFields.getAdditionalProperties(),a);
        assertEquals (heartbeatFields.getHeartbeatFieldsVersion(),new Double(11.1));
        assertEquals (heartbeatFields.getHeartbeatInterval(),new Long(1L));
        assert (heartbeatFields.toString() != null);
        assert (heartbeatFields.hashCode() != 0);
        
        
        
        
    }

}
