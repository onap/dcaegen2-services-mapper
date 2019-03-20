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
 * notification fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalFields",
    "arrayOfNamedHashMap",
    "changeContact",
    "changeIdentifier",
    "changeType",
    "newState",
    "oldState",
    "notificationFieldsVersion",
    "stateInterface"
})
public class NotificationFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalFields;
    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("arrayOfNamedHashMap")
    @JsonPropertyDescription("array of named hashMaps")
    private List<AdditionalMeasurement> arrayOfNamedHashMap = new ArrayList<AdditionalMeasurement>();
    /**
     * identifier for a contact related to the change
     * 
     */
    @JsonProperty("changeContact")
    @JsonPropertyDescription("identifier for a contact related to the change")
    private String changeContact;
    /**
     * system or session identifier associated with the change
     * (Required)
     * 
     */
    @JsonProperty("changeIdentifier")
    @JsonPropertyDescription("system or session identifier associated with the change")
    private String changeIdentifier;
    /**
     * describes what has changed for the entity
     * (Required)
     * 
     */
    @JsonProperty("changeType")
    @JsonPropertyDescription("describes what has changed for the entity")
    private String changeType;
    /**
     * new state of the entity
     * 
     */
    @JsonProperty("newState")
    @JsonPropertyDescription("new state of the entity")
    private String newState;
    /**
     * previous state of the entity
     * 
     */
    @JsonProperty("oldState")
    @JsonPropertyDescription("previous state of the entity")
    private String oldState;
    /**
     * version of the notificationFields block
     * (Required)
     * 
     */
    @JsonProperty("notificationFieldsVersion")
    @JsonPropertyDescription("version of the notificationFields block")
    private NotificationFields.NotificationFieldsVersion notificationFieldsVersion;
    /**
     * card or port name of the entity that changed state
     * 
     */
    @JsonProperty("stateInterface")
    @JsonPropertyDescription("card or port name of the entity that changed state")
    private String stateInterface;

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
     * identifier for a contact related to the change
     * 
     */
    @JsonProperty("changeContact")
    public String getChangeContact() {
        return changeContact;
    }

    /**
     * identifier for a contact related to the change
     * 
     */
    @JsonProperty("changeContact")
    public void setChangeContact(String changeContact) {
        this.changeContact = changeContact;
    }

    /**
     * system or session identifier associated with the change
     * (Required)
     * 
     */
    @JsonProperty("changeIdentifier")
    public String getChangeIdentifier() {
        return changeIdentifier;
    }

    /**
     * system or session identifier associated with the change
     * (Required)
     * 
     */
    @JsonProperty("changeIdentifier")
    public void setChangeIdentifier(String changeIdentifier) {
        this.changeIdentifier = changeIdentifier;
    }

    /**
     * describes what has changed for the entity
     * (Required)
     * 
     */
    @JsonProperty("changeType")
    public String getChangeType() {
        return changeType;
    }

    /**
     * describes what has changed for the entity
     * (Required)
     * 
     */
    @JsonProperty("changeType")
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * new state of the entity
     * 
     */
    @JsonProperty("newState")
    public String getNewState() {
        return newState;
    }

    /**
     * new state of the entity
     * 
     */
    @JsonProperty("newState")
    public void setNewState(String newState) {
        this.newState = newState;
    }

    /**
     * previous state of the entity
     * 
     */
    @JsonProperty("oldState")
    public String getOldState() {
        return oldState;
    }

    /**
     * previous state of the entity
     * 
     */
    @JsonProperty("oldState")
    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    /**
     * version of the notificationFields block
     * (Required)
     * 
     */
    @JsonProperty("notificationFieldsVersion")
    public NotificationFields.NotificationFieldsVersion getNotificationFieldsVersion() {
        return notificationFieldsVersion;
    }

    /**
     * version of the notificationFields block
     * (Required)
     * 
     */
    @JsonProperty("notificationFieldsVersion")
    public void setNotificationFieldsVersion(NotificationFields.NotificationFieldsVersion notificationFieldsVersion) {
        this.notificationFieldsVersion = notificationFieldsVersion;
    }

    /**
     * card or port name of the entity that changed state
     * 
     */
    @JsonProperty("stateInterface")
    public String getStateInterface() {
        return stateInterface;
    }

    /**
     * card or port name of the entity that changed state
     * 
     */
    @JsonProperty("stateInterface")
    public void setStateInterface(String stateInterface) {
        this.stateInterface = stateInterface;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(arrayOfNamedHashMap).append(changeContact).append(changeIdentifier).append(changeType).append(newState).append(oldState).append(notificationFieldsVersion).append(stateInterface).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationFields) == false) {
            return false;
        }
        NotificationFields rhs = ((NotificationFields) other);
        return new EqualsBuilder().append(additionalFields, rhs.additionalFields).append(arrayOfNamedHashMap, rhs.arrayOfNamedHashMap).append(changeContact, rhs.changeContact).append(changeIdentifier, rhs.changeIdentifier).append(changeType, rhs.changeType).append(newState, rhs.newState).append(oldState, rhs.oldState).append(notificationFieldsVersion, rhs.notificationFieldsVersion).append(stateInterface, rhs.stateInterface).isEquals();
    }

    public enum NotificationFieldsVersion {

        _2_0("2.0");
        private final String value;
        private final static Map<String, NotificationFields.NotificationFieldsVersion> CONSTANTS = new HashMap<String, NotificationFields.NotificationFieldsVersion>();

        static {
            for (NotificationFields.NotificationFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NotificationFieldsVersion(String value) {
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
        public static NotificationFields.NotificationFieldsVersion fromValue(String value) {
            NotificationFields.NotificationFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
