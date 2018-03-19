package org.onap.universalvesadapter.service;

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
	 * Identifies eventype by parsing the incoming json file
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
