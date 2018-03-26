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

package  org.onap.universalvesadapter.service;

//import org.onap.universalvesadapter.adapter.GenericAdapter;
//import org.onap.universalvesadapter.adapter.UniversalEventAdapter;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This service is written to identify the different type of events 
 * 
 * @author kmalbari
 *
 */
@Component
public class AdapterService {

    /*@Autowired
    private UniversalEventAdapter snmpTrapEventAdapter;
    public GenericAdapter identifyIncomingJsonFormatAndReturnAdapter() {
        return snmpTrapEventAdapter;
    }*/


    /**
     * Identifies eventype by parsing the incoming json file.
     * 
     * @param incomingJsonString
     * 
     * @return the event type
     */
    public String identifyEventTypeFromIncomingJson(String incomingJsonString) {
        
        //TODO A proper logic to identify diffeent events is needed here
        return "snmp";
    }

}
