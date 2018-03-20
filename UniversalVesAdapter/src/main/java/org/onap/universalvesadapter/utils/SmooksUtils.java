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
package org.onap.universalvesadapter.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.xml.transform.stream.StreamSource;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.StringResult;
import org.onap.dcaegen2.ves.domain.VesEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Utility methods for smooks module
 * 
 * @author kmalbari
 *
 */
public class SmooksUtils {

	
	private final static Logger LOGGER = LoggerFactory.getLogger(SmooksUtils.class);	
	
	/**
	 * converts the incoming json using passed smooks instance and return the pojo representation of VES event
	 * 
	 * @param smooks smooks object for the event type
	 * @param incomingJsonString 
	 * @return VES json's pojo representation
	 * @throws IOException
	 */
	public static VesEvent getTransformedObjectForInput(Smooks smooks, String incomingJsonString) {
		
		LOGGER.debug("Transforming json " + incomingJsonString);
		ExecutionContext executionContext = smooks.createExecutionContext();
		LOGGER.debug("Context created");
		Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(new Locale("en", "IE"));

        StringResult result = new StringResult();

        // Configure the execution context to generate a report...
//        executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

        // Filter the input message to the outputWriter, using the execution context...
        smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(incomingJsonString.getBytes(StandardCharsets.UTF_8))), result);
        LOGGER.debug("Transformed incoming json now");
        Locale.setDefault(defaultLocale);
        VesEvent vesEvent = (VesEvent) executionContext.getBeanContext().getBean("vesEvent");
        LOGGER.debug("Converted vesEvent from incoming json"); 
		return vesEvent;
	}

}
