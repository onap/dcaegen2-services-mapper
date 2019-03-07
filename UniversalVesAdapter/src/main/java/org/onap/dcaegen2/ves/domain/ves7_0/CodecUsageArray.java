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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * number of times an identified codec was used over the measurementInterval
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codecIdentifier",
    "numberInUse"
})
public class CodecUsageArray {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("codecIdentifier")
    private String codecIdentifier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberInUse")
    private Integer numberInUse;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("codecIdentifier")
    public String getCodecIdentifier() {
        return codecIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("codecIdentifier")
    public void setCodecIdentifier(String codecIdentifier) {
        this.codecIdentifier = codecIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberInUse")
    public Integer getNumberInUse() {
        return numberInUse;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("numberInUse")
    public void setNumberInUse(Integer numberInUse) {
        this.numberInUse = numberInUse;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codecIdentifier).append(numberInUse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodecUsageArray) == false) {
            return false;
        }
        CodecUsageArray rhs = ((CodecUsageArray) other);
        return new EqualsBuilder().append(codecIdentifier, rhs.codecIdentifier).append(numberInUse, rhs.numberInUse).isEquals();
    }

}
