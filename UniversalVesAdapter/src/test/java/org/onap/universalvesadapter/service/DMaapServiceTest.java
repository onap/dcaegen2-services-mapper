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

package org.onap.universalvesadapter.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;
import org.onap.universalvesadapter.Application;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.service.DMaapService;
import org.onap.universalvesadapter.service.DiskRepoConfigFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.att.nsa.mr.client.MRBatchingPublisher;
import com.att.nsa.mr.client.MRConsumer;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DMaapServiceTest {

    @Autowired
    @InjectMocks
    DMaapService dmaapService;
    
    @Mock
    private MRConsumer consumer; 
    
    @Mock    
    private MRBatchingPublisher publisher;
    
    private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());    
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }    
    
    
    
    @Test
    public void testConsumeFromDMaap() {
        String[] iter = {"this ", "is ", "just ", "a ", "test"};
        try {
            Mockito.when(consumer.fetch()).thenReturn(Arrays.asList(iter));
        } catch (IOException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        } catch (Exception e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }

        StringBuffer sb = new StringBuffer("");
        try {
            for (String string : dmaapService.consumeFromDMaap()) {
                sb.append(string);
            }
        } catch (DMaapException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        
        assertEquals("this is just a test", sb.toString());
        
    }

    @Test
    public void testPublishToDMaap() {
        
        dmaapService.addMessageInOutgoingQueue("test");
        
        ArgumentCaptor<?> valueCapture = ArgumentCaptor.forClass(String.class);
        try {
            int toBeReturned = 1;
            doReturn(toBeReturned).when(publisher).send((String) valueCapture.capture());
        } catch (IOException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        try {
            dmaapService.publishToDMaap();
        } catch (DMaapException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        assertEquals("test", valueCapture.getValue());
        
    }

    @Test
    public void testPublishToDMaapString() {
        ArgumentCaptor<?> valueCapture = ArgumentCaptor.forClass(String.class);
        try {
            int toBeReturned = 1;
            doReturn(toBeReturned).when(publisher).send((String) valueCapture.capture());
        } catch (IOException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        try {
            dmaapService.publishToDMaap("test");
        } catch (DMaapException e) {
            eLOGGER.error("Error occurred : " + e.getMessage());
        }
        assertEquals("test", valueCapture.getValue());        
        
    }

}

*/