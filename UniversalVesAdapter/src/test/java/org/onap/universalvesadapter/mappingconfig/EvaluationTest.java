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

package org.onap.universalvesadapter.mappingconfig;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvaluationTest {
    
    @Autowired
    Evaluation evaluation = new Evaluation();
    Evaluation lhs = new Evaluation();
    Evaluation rhs = new Evaluation();
    Object value = new Object();
    Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Test
    public void test() {
        evaluation.setAdditionalProperty("name", value);
        evaluation.setDatatype("datatype");
        evaluation.setField("field");
        evaluation.setLhs(lhs);
        evaluation.setOperand("operand");
        evaluation.setRhs(rhs);
        evaluation.setValue("value");
        additionalProperties.put("name", value);
        
        assertEquals(evaluation.getAdditionalProperties(), additionalProperties);
        assertEquals(evaluation.getDatatype(),"datatype");
        assertEquals(evaluation.getField(),"field");
        assertEquals(evaluation.getLhs(),lhs);
        assertEquals(evaluation.getOperand(),"operand");
        assertEquals(evaluation.getRhs(),rhs);
        assertEquals(evaluation.getValue(),"value");
        
        assert (evaluation.toString() != null);
        assert (evaluation.hashCode() != 0);
        
        assert (evaluation.equals(evaluation));
        assertEquals(evaluation.equals(value),false);
        assertEquals(evaluation.equals(null),false);
        
        
        
        
    }

}
