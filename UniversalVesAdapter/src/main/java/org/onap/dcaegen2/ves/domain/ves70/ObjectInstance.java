/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2019 TechMahindra
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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * meta-information about an instance of a jsonObject along with the actual object instance
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jsonObject",
    "objectInstance",
    "objectInstanceEpochMicrosec",
    "objectKeys"
})
public class ObjectInstance {

    /**
     * json object schema, name and other meta-information along with one or more object instances
     * 
     */
    @JsonProperty("jsonObject")
    @JsonPropertyDescription("json object schema, name and other meta-information along with one or more object instances")
    private AdditionalObject jsonObject;
    /**
     * an instance conforming to the jsonObject objectSchema
     * 
     */
    @JsonProperty("objectInstance")
    @JsonPropertyDescription("an instance conforming to the jsonObject objectSchema")
    private ObjectInstance objectInstance;
    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    @JsonPropertyDescription("the unix time aka epoch time associated with this objectInstance--as microseconds elapsed since 1 Jan 1970 not including leap seconds")
    private Double objectInstanceEpochMicrosec;
    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    @JsonPropertyDescription("an ordered set of keys that identifies this particular instance of jsonObject")
    private List<ObjectKey> objectKeys = new ArrayList<ObjectKey>();

    /**
     * json object schema, name and other meta-information along with one or more object instances
     * 
     */
    @JsonProperty("jsonObject")
    public AdditionalObject getJsonObject() {
        return jsonObject;
    }

    /**
     * json object schema, name and other meta-information along with one or more object instances
     * 
     */
    @JsonProperty("jsonObject")
    public void setJsonObject(AdditionalObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    /**
     * an instance conforming to the jsonObject objectSchema
     * 
     */
    @JsonProperty("objectInstance")
    public ObjectInstance getObjectInstance() {
        return objectInstance;
    }

    /**
     * an instance conforming to the jsonObject objectSchema
     * 
     */
    @JsonProperty("objectInstance")
    public void setObjectInstance(ObjectInstance objectInstance) {
        this.objectInstance = objectInstance;
    }

    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    public Double getObjectInstanceEpochMicrosec() {
        return objectInstanceEpochMicrosec;
    }

    /**
     * the unix time aka epoch time associated with this objectInstance--as microseconds elapsed since 1 Jan 1970 not including leap seconds
     * 
     */
    @JsonProperty("objectInstanceEpochMicrosec")
    public void setObjectInstanceEpochMicrosec(Double objectInstanceEpochMicrosec) {
        this.objectInstanceEpochMicrosec = objectInstanceEpochMicrosec;
    }

    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    public List<ObjectKey> getObjectKeys() {
        return objectKeys;
    }

    /**
     * an ordered set of keys that identifies this particular instance of jsonObject
     * 
     */
    @JsonProperty("objectKeys")
    public void setObjectKeys(List<ObjectKey> objectKeys) {
        this.objectKeys = objectKeys;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jsonObject).append(objectInstance).append(objectInstanceEpochMicrosec).append(objectKeys).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectInstance) == false) {
            return false;
        }
        ObjectInstance rhs = ((ObjectInstance) other);
        return new EqualsBuilder().append(jsonObject, rhs.jsonObject).append(objectInstance, rhs.objectInstance).append(objectInstanceEpochMicrosec, rhs.objectInstanceEpochMicrosec).append(objectKeys, rhs.objectKeys).isEquals();
    }

}
