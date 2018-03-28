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

import org.antlr.grammar.v3.ANTLRParser.action_return;
//import org.apache.bcel.generic.NEW;
import org.junit.Test;

public class FaultFieldsTest {

    FaultFields ff=new FaultFields();
    Object o=new Object();
    Object o2=new Object();
    List<AlarmAdditionalInformation> alarmAdditionalInformation;
    Map<String, Object> a = new HashMap<String, Object>();
    @Test
    public void test() {
       
       ff.setAdditionalProperty("name",o);
       ff.setAlarmAdditionalInformation(alarmAdditionalInformation);
       ff.setAlarmCondition("alarmCondition");
       ff.setAlarmInterfaceA("alarmInterfaceA");
       ff.setEventCategory("eventCategory");
       ff.setEventSeverity("eventSeverity");
       ff.setEventSourceType("eventSourceType");
       ff.setFaultFieldsVersion(11.25);
       ff.setSpecificProblem("specificProblem");
       ff.setVfStatus("vfStatus");
       a.put("name",o);
       assertEquals(ff.getAdditionalProperties(),a);
       assertEquals(ff.getAlarmAdditionalInformation(),alarmAdditionalInformation);
       assertEquals(ff.getAlarmCondition(), "alarmCondition");
       assertEquals(ff.getAlarmInterfaceA(), "alarmInterfaceA");
       assertEquals(ff.getEventCategory(), "eventCategory");
       assertEquals(ff.getEventSeverity(), "eventSeverity");
       assertEquals(ff.getEventSourceType(), "eventSourceType");
       assertEquals(ff.getSpecificProblem(), "specificProblem");
       assert(ff.getFaultFieldsVersion().equals(11.25));
       assertEquals(ff.getVfStatus(), "vfStatus");
       assert(ff.toString()!=null);
       assert(ff.hashCode()!=0);
      // assert(equals(ff));
       //assert(ff.equals(o)!=false);
       //ff.equals(o);
     // assert(ff.equals(o));
      //assert(ff.equals(o2));
   
    }

}
