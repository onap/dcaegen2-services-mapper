/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
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
 */

package org.onap.universalvesadapter.service;

import org.onap.universalvesadapter.adapter.GenericAdapter;
import org.onap.universalvesadapter.exception.DMaapException;
import org.onap.universalvesadapter.exception.VesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class VESGenericMessageProcessor {

	protected static final Logger metricsLogger = LoggerFactory.getLogger("metricsLogger");
	protected static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");
	protected static final Logger errorLogger = LoggerFactory.getLogger("errorLogger");

	protected GenericAdapter adapter;

	public VESGenericMessageProcessor(GenericAdapter adapter) {
		this.adapter = adapter;
	}

	public String processReceivedJson(String incomingJsonString) {
		String outgoingJsonString = null;
		if (!"".equals(incomingJsonString)) {

			try {

				outgoingJsonString = this.adapter.transform(incomingJsonString);

			} catch (VesException exception) {
				errorLogger.error("Received exception : {},{}" + exception.getMessage(), exception);
				debugLogger.warn("APPLICATION WILL BE SHUTDOWN UNTIL ABOVE ISSUE IS RESOLVED.");
			} catch (DMaapException e) {
				errorLogger.error("Received exception : {}", e.getMessage());
			}
		}
		return outgoingJsonString;
	}
}
