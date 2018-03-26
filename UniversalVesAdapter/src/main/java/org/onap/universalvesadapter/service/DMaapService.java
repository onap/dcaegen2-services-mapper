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
import java.util.List;
import java.util.Map;
import org.onap.universalvesadapter.configs.DMaapMrUrlConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.att.nsa.mr.client.MRBatchingPublisher;
//import com.att.nsa.mr.client.MRClientFactory;
//import com.att.nsa.mr.client.MRConsumer;

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

    @Autowired
    private DMaapMrUrlConfiguration dmaapMrUrlObject;
	
//    private MRConsumer cc; 
//
//    private MRBatchingPublisher pub;
    
    /**
     * reads the messages on DMaap MR Topic
     * 
     * @return iterable of messages that will be received on DMaap MR Topic
     * 
     * @throws DMaapException 
     */
    /*public Iterable<String> consumeFromDMaap() throws DMaapException{
    	if(null == cc){
    		try {
    			cc = MRClientFactory.createConsumer (dmaapMrUrlObject.getConsumerProperties());
    		} catch (IOException exception) {
    			throw new DMaapException("Problem creating consumer \nReason : " + exception.getMessage());
    		}
    		
    		try {
				return cc.fetch();
			} catch (Exception exception) {
				throw new DMaapException("Problem while fetching messaged from consumer \nReason : " + exception.getMessage());
			}
    	}
		return () -> Collections.emptyIterator();
    	
    }*/
    
    
    /**
     * sends the messages to DMaap MR Topic
     * 
     * 
     * @throws DMaapException 
     */
    /*public void publishToDMaap() throws DMaapException{
    	if(null == cc){
    		try {
    			 pub = MRClientFactory.createBatchingPublisher (dmaapMrUrlObject.getPublisherProperties());
    		} catch (IOException exception) {
    			throw new DMaapException("Problem creating consumer \nReason : " + exception.getMessage());
    		}
    		
    	}
    	
    }*/
    
    
    
    
	/**
	 * @return
	 */
	public String consume(){
		URL url;
		StringBuffer incomingJson = null;
		incomingJson = new StringBuffer(); 
		try {
			url = new URL(dmaapMrUrlObject.getUrl());
        
	        //open the connection to the above URL.
	        URLConnection urlcon = url.openConnection();
	        
	        Map<String, List<String>> header = urlcon.getHeaderFields();
	        
	        //print all the fields along with their value.
	        for (Map.Entry<String, List<String>> mp : header.entrySet()) 
	        {
	            System.out.print(mp.getKey() + " : ");
	            System.out.println(mp.getValue().toString());
	        }
	        System.out.println();
	        System.out.println("Complete source code of the URL is-");
	        System.out.println("---------------------------------");
	         
	        //get the inputstream of the open connection.
	        BufferedReader br = new BufferedReader(new InputStreamReader
	                                            (urlcon.getInputStream()));
	        String tempString;
	        //print the source code line by line.
	        while ((tempString = br.readLine()) != null) 
	        {
	            System.out.println(tempString);
	            incomingJson.append(tempString);
	        }
    	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return incomingJson.toString();
	}
	
	
	
	
	
	
	
}
