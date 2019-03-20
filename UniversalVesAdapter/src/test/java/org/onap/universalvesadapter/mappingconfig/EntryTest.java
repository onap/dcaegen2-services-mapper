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

package org.onap.universalvesadapter.mappingconfig;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class EntryTest {
    
    @Autowired
    Entry entry = new Entry();
    @Mock
    Evaluation evaluation = new Evaluation();
    Object value = new Object();
    Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    @Test
    public void test() {
        entry.setPriority(1);
        entry.setEvaluation(evaluation);
        entry.setResult("result");
        entry.setAdditionalProperty("name", value);
        
        additionalProperties.put("name", value);
        assertEquals(entry.getEvaluation(), evaluation);
        assertEquals(entry.getPriority(), new Integer(1));
        assertEquals(entry.getResult(), "result");
        assertEquals(entry.getAdditionalProperties(), additionalProperties);
        assert (entry.toString() != null);
        assert (entry.hashCode() != 0);
        
        assert (entry.equals(entry));
        
    }
    
}
