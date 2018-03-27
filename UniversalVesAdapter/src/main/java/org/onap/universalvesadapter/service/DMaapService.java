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
package org.onap.universalvesadapter.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import org.onap.universalvesadapter.configs.DMaapMrUrlConfiguration;
import org.onap.universalvesadapter.exception.DMaapException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.att.nsa.mr.client.MRBatchingPublisher;
import com.att.nsa.mr.client.MRClientFactory;
import com.att.nsa.mr.client.MRConsumer;
import com.att.nsa.mr.client.MRPublisher.message;

/**
 * 
 * This service will handle all the communication with the DMaap MR API
 * 
 * 
 * @author kmalbari
 *
 */
@Component
public class DMaapService {

    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());  
    
    @Autowired
    private DMaapMrUrlConfiguration dmaapMrUrlObject;
    
    private MRConsumer consumer; 

    private MRBatchingPublisher publisher;
    
    private List<String> outgoingMessageQueue = new CopyOnWriteArrayList<>();
    
    /**
     * Adds message to outgoing queue that will be sent to DMaaP topic.
     * 
     * @param message outbound message in VES format
     */
    public void addMessageInOutgoingQueue(String message) {
        if (null != message && !"".equals(message)) {
            outgoingMessageQueue.add(message);
            eLOGGER.debug("Added message to outgoing queue " + message);
        }
    }
    
    
    
    /**
     * reads the messages on DMaap MR Topic
     * 
     * @return iterable of messages that will be received on DMaap MR Topic
     * 
     * @throws DMaapException 
     */
    public Iterable<String> consumeFromDMaap() throws DMaapException{
        if(null == consumer){
            try {
                consumer = MRClientFactory.createConsumer (dmaapMrUrlObject.getConsumerProperties());
                eLOGGER.debug("Created consumer");
            } catch (IOException exception) {
                throw new DMaapException("Problem creating consumer \nReason : " + exception.getMessage(), exception);
            }
        }
            
        try {
            eLOGGER.debug("Returning result fetched by consumer");
            return consumer.fetch();
        } catch (Exception exception) {
            throw new DMaapException("Problem while fetching messaged from consumer \nReason : " + exception.getMessage(), exception);
        }
//        return () -> Collections.emptyIterator();
        
    }
    
    
    /**
     * sends the messages to DMaap MR Topic
     * 
     * 
     * @throws DMaapException 
     */
    public void publishToDMaap() throws DMaapException{
        if(null == publisher){
            try {
                 publisher = MRClientFactory.createBatchingPublisher (dmaapMrUrlObject.getPublisherProperties());
                 eLOGGER.debug("Create a publisher now.");
            } catch (IOException exception) {
                throw new DMaapException("Problem creating publisher \nReason : " + exception.getMessage(), exception);
            }
        }
        for(String message : outgoingMessageQueue){
            try {
                publisher.send(message);
                eLOGGER.debug("Sending message to DMaaP :-> " + message );
            } catch (IOException exception) {
                throw new DMaapException("Problem sending message to DMaaP topic \nReason : " + exception.getMessage(), exception);
            }
        }
        List<message> stuck = null;
        try {
            stuck = publisher.close ( 20, TimeUnit.SECONDS );
        } catch (IOException | InterruptedException exception) {
            throw new DMaapException("Problem while closing publisher \nReason : " + exception.getMessage(), exception);
        }
        if (null != stuck) {
            if (stuck.size() > 0) {
                eLOGGER.debug(stuck.size() + " messages unsent");
            } else {
                eLOGGER.debug("Clean exit; all messages sent.");
            } 
        }
        else
            throw new DMaapException("Problem while closing publisher, no messages were returned. ");
        
    }
    
    /**
     * sends the messages to DMaap MR Topic
     * 
     * 
     * @throws DMaapException 
     */
    public void publishToDMaap(String outgoingMessage) throws DMaapException{
        if(null == publisher){
            synchronized(publisher){
                if(null == publisher){
                    try {
                        publisher = MRClientFactory.createBatchingPublisher (dmaapMrUrlObject.getPublisherProperties());
                        eLOGGER.debug("Publisher created now.");
                    } catch (IOException exception) {
                        throw new DMaapException("Problem creating publisher \nReason : " + exception.getMessage(), exception);
                    }
                }
            }
        }
        try {
            publisher.send(outgoingMessage);
            eLOGGER.debug("Sent outgoing message " + outgoingMessage);
        } catch (IOException exception) {
            throw new DMaapException("Problem sending message to DMaaP topic \nReason : " + exception.getMessage(), exception);
        }
        List<message> stuck = null;
        try {
            stuck = publisher.close ( 20, TimeUnit.SECONDS );
        } catch (IOException | InterruptedException exception) {
            throw new DMaapException("Problem while closing publisher \nReason : " + exception.getMessage(), exception);
        }
        if (null != stuck) {
            if (stuck.size() > 0) {
                eLOGGER.debug(stuck.size() + " messages unsent");
            } else {
                eLOGGER.debug("Clean exit; all messages sent.");
            } 
        } else{
            throw new DMaapException("Problem while closing publisher, no messages were returned. ");
        }
        
    }    
    
    
    /**
     * for local testing only
     * @return
     * @throws DMaapException 
     */
    /*public String consume() throws DMaapException {
        
        URL url;
        StringBuffer incomingJson = null;
        incomingJson = new StringBuffer(); 
        try {
            url = new URL(dmaapMrUrlObject.getUrl());
        
            //open the connection to the above URL.
            URLConnection urlcon = url.openConnection();
            
            Map<String, List<String>> header = urlcon.getHeaderFields();
            
            //print all the fields along with their value.
            for (Map.Entry<String, List<String>> mp : header.entrySet()) {
                eLOGGER.debug(mp.getKey() + " : ");
                eLOGGER.debug(mp.getValue().toString());
            }
            eLOGGER.debug("Complete source code of the URL is-");
            eLOGGER.debug("---------------------------------");
             
            //get the inputstream of the open connection.
            BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String tempString;
            //print the source code line by line.
            while ((tempString = br.readLine()) != null) {
                eLOGGER.debug(tempString);
                incomingJson.append(tempString);
            }
        
        } catch (MalformedURLException exception) {
            throw new DMaapException("Problem consuming from url \nReason : " + exception.getMessage(), exception);
        } catch (IOException exception) {
            throw new DMaapException("Problem consuming \nReason : " + exception.getMessage(), exception);
        }
        return incomingJson.toString();
    }*/
    
    
    
    
    
    
    
}
