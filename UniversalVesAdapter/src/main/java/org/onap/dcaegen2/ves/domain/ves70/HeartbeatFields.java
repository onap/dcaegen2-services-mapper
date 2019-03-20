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
package org.onap.dcaegen2.ves.domain.ves70;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * optional field block for fields specific to heartbeat events
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalFields",
    "heartbeatFieldsVersion",
    "heartbeatInterval"
})
public class HeartbeatFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalFields;
    /**
     * version of the heartbeatFields block
     * (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    @JsonPropertyDescription("version of the heartbeatFields block")
    private HeartbeatFields.HeartbeatFieldsVersion heartbeatFieldsVersion;
    /**
     * current heartbeat interval in seconds
     * (Required)
     * 
     */
    @JsonProperty("heartbeatInterval")
    @JsonPropertyDescription("current heartbeat interval in seconds")
    private Integer heartbeatInterval;

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public AlarmAdditionalInformation getAdditionalFields() {
        return additionalFields;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(AlarmAdditionalInformation additionalFields) {
        this.additionalFields = additionalFields;
    }

    /**
     * version of the heartbeatFields block
     * (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    public HeartbeatFields.HeartbeatFieldsVersion getHeartbeatFieldsVersion() {
        return heartbeatFieldsVersion;
    }

    /**
     * version of the heartbeatFields block
     * (Required)
     * 
     */
    @JsonProperty("heartbeatFieldsVersion")
    public void setHeartbeatFieldsVersion(HeartbeatFields.HeartbeatFieldsVersion heartbeatFieldsVersion) {
        this.heartbeatFieldsVersion = heartbeatFieldsVersion;
    }

    /**
     * current heartbeat interval in seconds
     * (Required)
     * 
     */
    @JsonProperty("heartbeatInterval")
    public Integer getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * current heartbeat interval in seconds
     * (Required)
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(heartbeatFieldsVersion).append(heartbeatInterval).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartbeatFields) == false) {
            return false;
        }
        HeartbeatFields rhs = ((HeartbeatFields) other);
        return new EqualsBuilder().append(additionalFields, rhs.additionalFields).append(heartbeatFieldsVersion, rhs.heartbeatFieldsVersion).append(heartbeatInterval, rhs.heartbeatInterval).isEquals();
    }

    public enum HeartbeatFieldsVersion {

        _3_0("3.0");
        private final String value;
        private final static Map<String, HeartbeatFields.HeartbeatFieldsVersion> CONSTANTS = new HashMap<String, HeartbeatFields.HeartbeatFieldsVersion>();

        static {
            for (HeartbeatFields.HeartbeatFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private HeartbeatFieldsVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static HeartbeatFields.HeartbeatFieldsVersion fromValue(String value) {
            HeartbeatFields.HeartbeatFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
