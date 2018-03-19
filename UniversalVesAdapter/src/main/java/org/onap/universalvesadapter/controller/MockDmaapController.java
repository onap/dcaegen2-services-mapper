package org.onap.universalvesadapter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MockDmaapController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    	return "{     \"protocol version\": \"v2c\",     \"notify OID\": \".1.3.6.1.4.1.74.2.46.12.1.1\",     \"cambria.partition\": \"dcae-snmp.client.research.att.com\" ,     \"trap category\": \"UCSNMP-HEARTBEAT\",      \"epoch_serno\": 15161177410000,     \"community\" : \"public\",     \"time received\": 1516117741,     \"agent name\": \"localhost\",     \"agent address\": \"127.0.0.1\",      \"community len\": 6,         \"notify OID len\": 12,             \"varbinds\": [             {                 \"varbind_type\": \"octet\",                 \"varbind_oid\": \".1.3.6.1.4.1.74.2.46.12.1.1.1\",                 \"varbind_value\": \"ucsnmp heartbeat - ignore\"             },             {                 \"varbind_type\": \"octet\",                 \"varbind_oid\": \".1.3.6.1.4.1.74.2.46.12.1.1.2\",                 \"varbind_value\": \"Tue Jan 16 10:49:01 EST 2018\"             }         ]       }";
    }
    
}
