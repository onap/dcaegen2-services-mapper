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

package org.onap.dcaegen2.ves.domain.ves54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * optional field block for fields specific to heartbeat events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalFields", "heartbeatFieldsVersion", "heartbeatInterval"})
public class HeartbeatFields {
    
    /**
     * additional heartbeat fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("additional heartbeat fields if needed")
    private List<AlarmAdditionalInformation> additionalFields =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * version of the heartbeatFields block (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    @JsonPropertyDescription("version of the heartbeatFields block")
    private Double heartbeatFieldsVersion;
    /**
     * current heartbeat interval in seconds (Required)
     * 
     */
    @JsonProperty("heartbeatInterval")
    @JsonPropertyDescription("current heartbeat interval in seconds")
    private Integer heartbeatInterval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional heartbeat fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public List<AlarmAdditionalInformation> getAdditionalFields() {
        return additionalFields;
    }
    
    /**
     * additional heartbeat fields if needed
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AlarmAdditionalInformation> additionalFields) {
        this.additionalFields = additionalFields;
    }
    
    /**
     * version of the heartbeatFields block (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    public Double getHeartbeatFieldsVersion() {
        return heartbeatFieldsVersion;
    }
    
    /**
     * version of the heartbeatFields block (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    public void setHeartbeatFieldsVersion(Double heartbeatFieldsVersion) {
        this.heartbeatFieldsVersion = heartbeatFieldsVersion;
    }
    
    /**
     * current heartbeat interval in seconds (Required)
     * 
     */
    @JsonProperty("heartbeatInterval")
    public Integer getHeartbeatInterval() {
        return heartbeatInterval;
    }
    
    /**
     * current heartbeat interval in seconds (Required)
     * 
     */
    @JsonProperty("heartbeatInterval")
    public void setHeartbeatInterval(Integer heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(heartbeatFieldsVersion)
                .append(heartbeatInterval).append(additionalProperties).toHashCode();
    }
    
    
    
}
