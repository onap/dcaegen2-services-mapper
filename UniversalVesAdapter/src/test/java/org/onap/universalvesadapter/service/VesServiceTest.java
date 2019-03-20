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
 *
 * 
 * package org.onap.universalvesadapter.service;
 * 
 * import static org.junit.Assert.*; import static org.mockito.Mockito.doNothing; import static
 * org.mockito.Mockito.doReturn;
 * 
 * import java.io.IOException; import java.util.Arrays; import java.util.Collections;
 * 
 * import org.junit.Before; import org.junit.Ignore; import org.junit.Test; import
 * org.junit.runner.RunWith; import org.mockito.ArgumentCaptor; import org.mockito.InjectMocks;
 * import org.mockito.Mock; import org.mockito.Mockito; import org.mockito.MockitoAnnotations;
 * import org.onap.universalvesadapter.Application; import
 * org.onap.universalvesadapter.exception.DMaapException; import
 * org.onap.universalvesadapter.service.DMaapService; import
 * org.onap.universalvesadapter.service.VesService; import
 * org.onap.universalvesadapter.utils.ParallelTasks; import org.slf4j.Logger; import
 * org.slf4j.LoggerFactory; import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.att.nsa.mr.client.MRConsumer;
 * 
 * @Ignore
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest(classes = Application.class) public class VesServiceTest {
 * 
 * @InjectMocks
 * 
 * @Autowired private VesService vesService;
 * 
 * @Mock private DMaapService dmaapService;
 * 
 * private final Logger eLOGGER = LoggerFactory.getLogger(this.getClass());
 * 
 * @Before public void init() { MockitoAnnotations.initMocks(this); }
 * 
 * 
 * @Test public void testStart() throws IOException {
 * 
 * String[] incomingMessages = {"{ " + " \"protocol version \": \"v2c \", " +
 * " \"notify OID \": \".1.3.6.1.4.1.74.2.46.12.1.1AAA \", " +
 * " \"cambria.partition \": \"dcae-snmp.client.research.att.com \", " +
 * " \"trap category \": \"UCSNMP-HEARTBEAT \", " + " \"epoch_serno \": 15161177410000, " +
 * " \"community \": \"public \", " + " \"time received \": 1516117741, " +
 * " \"agent name \": \"localhost \", " + " \"agent address \": \"127.0.0.1 \", " +
 * " \"community len \": 6, " + " \"notify OID len \": 12, " + " \"varbinds \": [{ " +
 * "     \"varbind_type \": \"octet \", " +
 * "     \"varbind_oid \": \".1.3.6.1.4.1.74.2.46.12.1.1.1 \", " +
 * "     \"varbind_value \": \"ucsnmp heartbeat - ignore \" " + " }, { " +
 * "     \"varbind_type \": \"octet \", " +
 * "     \"varbind_oid \": \".1.3.6.1.4.1.74.2.46.12.1.1.2 \", " +
 * "     \"varbind_value \": \"Tue Jan 16 10:49:01 EST 2018 \" " + " }] " + "}"}; try { //
 * Mockito.when(dmaapService.fetchAndPublishInDMaaP(null,null)).
 * thenReturn(Arrays.asList(incomingMessages)).thenReturn(() -> Collections.emptyIterator());
 * 
 * } catch (Exception e) { eLOGGER.error("Error occurred : " + e.getMessage()); }
 * 
 * ArgumentCaptor<?> valueCapture = ArgumentCaptor.forClass(String.class); try {
 * //doNothing().when(dmaapService).fetchAndPublishInDMaaP((String) valueCapture.capture()); } catch
 * (DMaapException e) { eLOGGER.error("Error occurred : " + e.getMessage()); }
 * 
 * 
 * new Thread(new Runnable() {
 * 
 * @Override public void run() { // TODO Auto-generated method stub vesService.start();
 * 
 * } }).start(); try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } new Thread(new Runnable() {
 * 
 * @Override public void run() { // TODO Auto-generated method stub vesService.stop();
 * 
 * } }).start(); String result = "{\"event\":{\"commonEventHeader\":{},\"faultFields\":{},
 * \"measurementsForVfScalingFields\":{\"additionalMeasurements\":[]}}}"; assertEquals(result,
 * valueCapture.getValue()); }
 * 
 * @Test public void testStop() { fail("Not yet implemented"); }
 * 
 * }
 */
