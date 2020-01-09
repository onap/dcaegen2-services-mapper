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

package org.onap.universalvesadapter.kafka.configs;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.onap.universalvesadapter.utils.Configuration;
import org.onap.universalvesadapter.utils.FileUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class KafkaConfiguration {

    public static Configuration get(String configFileName) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
		String content = FileUtils.readFile(configFileName);
		return mapper.readValue(content, Configuration.class);
    }
}
