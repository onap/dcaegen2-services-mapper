
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
public class Lhs_ {

    @JsonProperty("operand")
    private String operand;
    @JsonProperty("field")
    private String field;
    @JsonProperty("value")
    private String value;
    @JsonProperty("datatype")
    private String datatype;
    @JsonProperty("lhs")
    private Object lhs;
    @JsonProperty("rhs")
    private Object rhs;
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
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("datatype")
    public String getDatatype() {
        return datatype;
    }

    @JsonProperty("datatype")
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    @JsonProperty("lhs")
    public Object getLhs() {
        return lhs;
    }

    @JsonProperty("lhs")
    public void setLhs(Object lhs) {
        this.lhs = lhs;
    }

    @JsonProperty("rhs")
    public Object getRhs() {
        return rhs;
    }

    @JsonProperty("rhs")
    public void setRhs(Object rhs) {
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
        if ((other instanceof Lhs_) == false) {
            return false;
        }
        Lhs_ rhs = ((Lhs_) other);
        return new EqualsBuilder().append(field, rhs.field).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(rhs, rhs.rhs).append(datatype, rhs.datatype).append(operand, rhs.operand).append(lhs, rhs.lhs).isEquals();
    }

}
