
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
    "otherFieldsVersion",
    "hashOfNameValuePairArrays",
    "jsonObjects",
    "nameValuePairs"
})
public class OtherFields {

    @JsonProperty("otherFieldsVersion")
    private Double otherFieldsVersion;
    @JsonProperty("hashOfNameValuePairArrays")
    private List<HashOfNameValuePairArray> hashOfNameValuePairArrays = null;
    @JsonProperty("jsonObjects")
    private List<JsonObject> jsonObjects = null;
    @JsonProperty("nameValuePairs")
    private List<NameValuePair> nameValuePairs = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("otherFieldsVersion")
    public Double getOtherFieldsVersion() {
        return otherFieldsVersion;
    }

    @JsonProperty("otherFieldsVersion")
    public void setOtherFieldsVersion(Double otherFieldsVersion) {
        this.otherFieldsVersion = otherFieldsVersion;
    }

    @JsonProperty("hashOfNameValuePairArrays")
    public List<HashOfNameValuePairArray> getHashOfNameValuePairArrays() {
        return hashOfNameValuePairArrays;
    }

    @JsonProperty("hashOfNameValuePairArrays")
    public void setHashOfNameValuePairArrays(List<HashOfNameValuePairArray> hashOfNameValuePairArrays) {
        this.hashOfNameValuePairArrays = hashOfNameValuePairArrays;
    }

    @JsonProperty("jsonObjects")
    public List<JsonObject> getJsonObjects() {
        return jsonObjects;
    }

    @JsonProperty("jsonObjects")
    public void setJsonObjects(List<JsonObject> jsonObjects) {
        this.jsonObjects = jsonObjects;
    }

    @JsonProperty("nameValuePairs")
    public List<NameValuePair> getNameValuePairs() {
        return nameValuePairs;
    }

    @JsonProperty("nameValuePairs")
    public void setNameValuePairs(List<NameValuePair> nameValuePairs) {
        this.nameValuePairs = nameValuePairs;
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
        return new ToStringBuilder(this).append("otherFieldsVersion", otherFieldsVersion).append("hashOfNameValuePairArrays", hashOfNameValuePairArrays).append("jsonObjects", jsonObjects).append("nameValuePairs", nameValuePairs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nameValuePairs).append(hashOfNameValuePairArrays).append(additionalProperties).append(jsonObjects).append(otherFieldsVersion).toHashCode();
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
        return new EqualsBuilder().append(nameValuePairs, rhs.nameValuePairs).append(hashOfNameValuePairArrays, rhs.hashOfNameValuePairArrays).append(additionalProperties, rhs.additionalProperties).append(jsonObjects, rhs.jsonObjects).append(otherFieldsVersion, rhs.otherFieldsVersion).isEquals();
    }

}
