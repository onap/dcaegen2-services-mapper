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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * tuple which provides the name of a key along with its value and relative order
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyName",
    "keyOrder",
    "keyValue"
})
public class ObjectKey {

    /**
     * name of the key
     * (Required)
     * 
     */
    @JsonProperty("keyName")
    @JsonPropertyDescription("name of the key")
    private String keyName;
    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    @JsonPropertyDescription("relative sequence or order of the key with respect to other keys")
    private Integer keyOrder;
    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    @JsonPropertyDescription("value of the key")
    private String keyValue;

    /**
     * name of the key
     * (Required)
     * 
     */
    @JsonProperty("keyName")
    public String getKeyName() {
        return keyName;
    }

    /**
     * name of the key
     * (Required)
     * 
     */
    @JsonProperty("keyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    public Integer getKeyOrder() {
        return keyOrder;
    }

    /**
     * relative sequence or order of the key with respect to other keys
     * 
     */
    @JsonProperty("keyOrder")
    public void setKeyOrder(Integer keyOrder) {
        this.keyOrder = keyOrder;
    }

    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * value of the key
     * 
     */
    @JsonProperty("keyValue")
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyName).append(keyOrder).append(keyValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectKey) == false) {
            return false;
        }
        ObjectKey rhs = ((ObjectKey) other);
        return new EqualsBuilder().append(keyName, rhs.keyName).append(keyOrder, rhs.keyOrder).append(keyValue, rhs.keyValue).isEquals();
    }

}
