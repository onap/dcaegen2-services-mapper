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
package org.onap.universalvesadapter.mappingconfig;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operand",
    "field",
    "value",
    "datatype",
    "lhs",
    "rhs"
})
public class Lhs {

    @JsonProperty("operand")
    private String operand;
    @JsonProperty("field")
    private Object field;
    @JsonProperty("value")
    private Object value;
    @JsonProperty("datatype")
    private Object datatype;
    @JsonProperty("lhs")
    private Lhs_ lhs;
    @JsonProperty("rhs")
    private Rhs rhs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("operand")
    public String getOperand() {
        return operand;
    }

    @JsonProperty("operand")
    public void setOperand(String operand) {
        this.operand = operand;
    }

    @JsonProperty("field")
    public Object getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(Object field) {
        this.field = field;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("datatype")
    public Object getDatatype() {
        return datatype;
    }

    @JsonProperty("datatype")
    public void setDatatype(Object datatype) {
        this.datatype = datatype;
    }

    @JsonProperty("lhs")
    public Lhs_ getLhs() {
        return lhs;
    }

    @JsonProperty("lhs")
    public void setLhs(Lhs_ lhs) {
        this.lhs = lhs;
    }

    @JsonProperty("rhs")
    public Rhs getRhs() {
        return rhs;
    }

    @JsonProperty("rhs")
    public void setRhs(Rhs rhs) {
        this.rhs = rhs;
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
    public String toString() {
        return new ToStringBuilder(this).append("operand", operand).append("field", field).append("value", value).append("datatype", datatype).append("lhs", lhs).append("rhs", rhs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(field).append(additionalProperties).append(value).append(rhs).append(datatype).append(operand).append(lhs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lhs) == false) {
            return false;
        }
        Lhs rhs = ((Lhs) other);
        return new EqualsBuilder().append(field, rhs.field).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(rhs, rhs.rhs).append(datatype, rhs.datatype).append(operand, rhs.operand).append(lhs, rhs.lhs).isEquals();
    }

}
