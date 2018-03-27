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

public class ArrayOfField_Test {
    @Autowired
    ArrayOfField_  arrayOfField = new  ArrayOfField_();
    Object value1 = new Object();
    Map<String, Object> map = new HashMap<String, Object>();
    
        
     
     @Test
     public void test() {
         arrayOfField.setAdditionalProperty("name", value1);
         arrayOfField.setName("name2");
         arrayOfField.setValue("value2");
         
         map.put("name", value1);
         assertEquals (arrayOfField.getName(),"name2");
         assertEquals (arrayOfField.getValue(),"value2");
         assertEquals (arrayOfField.getAdditionalProperties(),map);
         assert (arrayOfField.toString() != null);
         assert (arrayOfField.hashCode() != 0);
         
}
}
