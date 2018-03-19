
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.List;
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
    "name",
    "arrayOfFields"
})
public class HashOfNameValuePairArray {

    @JsonProperty("name")
    private String name;
    @JsonProperty("arrayOfFields")
    private List<ArrayOfField_> arrayOfFields = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("arrayOfFields")
    public List<ArrayOfField_> getArrayOfFields() {
        return arrayOfFields;
    }

    @JsonProperty("arrayOfFields")
    public void setArrayOfFields(List<ArrayOfField_> arrayOfFields) {
        this.arrayOfFields = arrayOfFields;
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
        return new ToStringBuilder(this).append("name", name).append("arrayOfFields", arrayOfFields).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arrayOfFields).append(additionalProperties).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HashOfNameValuePairArray) == false) {
            return false;
        }
        HashOfNameValuePairArray rhs = ((HashOfNameValuePairArray) other);
        return new EqualsBuilder().append(arrayOfFields, rhs.arrayOfFields).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).isEquals();
    }

}
