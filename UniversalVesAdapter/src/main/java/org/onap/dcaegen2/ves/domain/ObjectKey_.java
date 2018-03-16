
package org.onap.dcaegen2.ves.domain;

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
    "keyName",
    "keyOrder",
    "keyValue"
})
public class ObjectKey_ {

    @JsonProperty("keyName")
    private String keyName;
    @JsonProperty("keyOrder")
    private Long keyOrder;
    @JsonProperty("keyValue")
    private String keyValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyName")
    public String getKeyName() {
        return keyName;
    }

    @JsonProperty("keyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    @JsonProperty("keyOrder")
    public Long getKeyOrder() {
        return keyOrder;
    }

    @JsonProperty("keyOrder")
    public void setKeyOrder(Long keyOrder) {
        this.keyOrder = keyOrder;
    }

    @JsonProperty("keyValue")
    public String getKeyValue() {
        return keyValue;
    }

    @JsonProperty("keyValue")
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
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
        return new ToStringBuilder(this).append("keyName", keyName).append("keyOrder", keyOrder).append("keyValue", keyValue).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyName).append(additionalProperties).append(keyOrder).append(keyValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObjectKey_) == false) {
            return false;
        }
        ObjectKey_ rhs = ((ObjectKey_) other);
        return new EqualsBuilder().append(keyName, rhs.keyName).append(additionalProperties, rhs.additionalProperties).append(keyOrder, rhs.keyOrder).append(keyValue, rhs.keyValue).isEquals();
    }

}
