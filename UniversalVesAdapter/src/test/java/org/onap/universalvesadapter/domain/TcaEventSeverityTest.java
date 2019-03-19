/*
 * ============LICENSE_START=======================================================
 *  Copyright (C) 2019 Samsung. All rights reserved.
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
 *
 * ============LICENSE_END=========================================================
 */
package org.onap.universalvesadapter.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class TcaEventSeverityTest {

    @Test
    public void testGetValue() {
        assertEquals("CRITICAL", TcaEventSeverity.SEVERITY_CRITICAL.getValue());
        assertEquals("MAJOR", TcaEventSeverity.SEVERITY_MAJOR.getValue());
        assertEquals("MINOR", TcaEventSeverity.SEVERITY_MINOR.getValue());
        assertEquals("WARNING", TcaEventSeverity.SEVERITY_WARNING.getValue());
        assertEquals("NORMAL", TcaEventSeverity.SEVERITY_NORMAL.getValue());
    }
}
