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
package org.onap.dcaegen2.ves.domain.ves7_0;

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
 * performance counter
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "criticality",
    "hashMap",
    "thresholdCrossed"
})
public class AdditionalParameter {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    private AdditionalParameter.Criticality criticality;
    /**
     * an associative array which is an array of key:value pairs
     * (Required)
     * 
     */
    @JsonProperty("hashMap")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation hashMap;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    private String thresholdCrossed;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    public AdditionalParameter.Criticality getCriticality() {
        return criticality;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("criticality")
    public void setCriticality(AdditionalParameter.Criticality criticality) {
        this.criticality = criticality;
    }

    /**
     * an associative array which is an array of key:value pairs
     * (Required)
     * 
     */
    @JsonProperty("hashMap")
    public AlarmAdditionalInformation getHashMap() {
        return hashMap;
    }

    /**
     * an associative array which is an array of key:value pairs
     * (Required)
     * 
     */
    @JsonProperty("hashMap")
    public void setHashMap(AlarmAdditionalInformation hashMap) {
        this.hashMap = hashMap;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    public String getThresholdCrossed() {
        return thresholdCrossed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("thresholdCrossed")
    public void setThresholdCrossed(String thresholdCrossed) {
        this.thresholdCrossed = thresholdCrossed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(criticality).append(hashMap).append(thresholdCrossed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalParameter) == false) {
            return false;
        }
        AdditionalParameter rhs = ((AdditionalParameter) other);
        return new EqualsBuilder().append(criticality, rhs.criticality).append(hashMap, rhs.hashMap).append(thresholdCrossed, rhs.thresholdCrossed).isEquals();
    }

    public enum Criticality {

        CRIT("CRIT"),
        MAJ("MAJ");
        private final String value;
        private final static Map<String, AdditionalParameter.Criticality> CONSTANTS = new HashMap<String, AdditionalParameter.Criticality>();

        static {
            for (AdditionalParameter.Criticality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Criticality(String value) {
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
        public static AdditionalParameter.Criticality fromValue(String value) {
            AdditionalParameter.Criticality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
