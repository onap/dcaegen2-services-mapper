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

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AdditionalFieldTest {
    
    @Autowired
    AdditionalField additionalField = new AdditionalField();
//    Object value1 = new Object();
//    Map<String, Object> map = new HashMap<String, Object>();
//
//    @Test
//    public void test() {
//        additionalField.setAdditionalProperty("name", value1);
//        additionalField.setName("name2");
//        additionalField.setValue("value2");
//        
//        map.put("name", value1);
//        assertEquals(additionalField.getName(),"name2");
//        assertEquals(additionalField.getValue(),"value2");
//        assertEquals(additionalField.getAdditionalProperties(),map);
//        assert (additionalField.toString() != null);
//        assert (additionalField.hashCode() != 0);
//    }
    
    @Test
    public void testgetName() {
    	additionalField.getName();
    }
    
    @Test
    public void testsetName() {
    	additionalField.setName("Test");
    }

    @Test
    public void testgetValue() {
    	additionalField.getValue();
    }
    
    @Test
    public void testsetValue() {
    	additionalField.setValue("Test");
    }
}
