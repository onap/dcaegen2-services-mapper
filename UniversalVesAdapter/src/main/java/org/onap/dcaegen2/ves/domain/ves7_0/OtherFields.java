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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * fields for events belonging to the 'other' domain of the commonEventHeader domain enumeration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "arrayOfNamedHashMap",
    "hashMap",
    "jsonObjects",
    "otherFieldsVersion"
})
public class OtherFields {

    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("arrayOfNamedHashMap")
    @JsonPropertyDescription("array of named hashMaps")
    private List<AdditionalMeasurement> arrayOfNamedHashMap = new ArrayList<AdditionalMeasurement>();
    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("hashMap")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation hashMap;
    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    @JsonPropertyDescription("array of json objects described by name, schema and other meta-information")
    private List<AdditionalObject> jsonObjects = new ArrayList<AdditionalObject>();
    /**
     * version of the otherFields block
     * (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    @JsonPropertyDescription("version of the otherFields block")
    private OtherFields.OtherFieldsVersion otherFieldsVersion;

    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("arrayOfNamedHashMap")
    public List<AdditionalMeasurement> getArrayOfNamedHashMap() {
        return arrayOfNamedHashMap;
    }

    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("arrayOfNamedHashMap")
    public void setArrayOfNamedHashMap(List<AdditionalMeasurement> arrayOfNamedHashMap) {
        this.arrayOfNamedHashMap = arrayOfNamedHashMap;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("hashMap")
    public AlarmAdditionalInformation getHashMap() {
        return hashMap;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("hashMap")
    public void setHashMap(AlarmAdditionalInformation hashMap) {
        this.hashMap = hashMap;
    }

    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    public List<AdditionalObject> getJsonObjects() {
        return jsonObjects;
    }

    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("jsonObjects")
    public void setJsonObjects(List<AdditionalObject> jsonObjects) {
        this.jsonObjects = jsonObjects;
    }

    /**
     * version of the otherFields block
     * (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    public OtherFields.OtherFieldsVersion getOtherFieldsVersion() {
        return otherFieldsVersion;
    }

    /**
     * version of the otherFields block
     * (Required)
     * 
     */
    @JsonProperty("otherFieldsVersion")
    public void setOtherFieldsVersion(OtherFields.OtherFieldsVersion otherFieldsVersion) {
        this.otherFieldsVersion = otherFieldsVersion;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arrayOfNamedHashMap).append(hashMap).append(jsonObjects).append(otherFieldsVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherFields) == false) {
            return false;
        }
        OtherFields rhs = ((OtherFields) other);
        return new EqualsBuilder().append(arrayOfNamedHashMap, rhs.arrayOfNamedHashMap).append(hashMap, rhs.hashMap).append(jsonObjects, rhs.jsonObjects).append(otherFieldsVersion, rhs.otherFieldsVersion).isEquals();
    }

    public enum OtherFieldsVersion {

        _3_0("3.0");
        private final String value;
        private final static Map<String, OtherFields.OtherFieldsVersion> CONSTANTS = new HashMap<String, OtherFields.OtherFieldsVersion>();

        static {
            for (OtherFields.OtherFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherFieldsVersion(String value) {
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
        public static OtherFields.OtherFieldsVersion fromValue(String value) {
            OtherFields.OtherFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
