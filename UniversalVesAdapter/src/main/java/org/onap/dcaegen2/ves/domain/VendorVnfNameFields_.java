
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendorName",
    "vfModuleName",
    "vnfName"
})
public class VendorVnfNameFields_ {

    @JsonProperty("vendorName")
    private String vendorName;
    @JsonProperty("vfModuleName")
    private String vfModuleName;
    @JsonProperty("vnfName")
    private String vnfName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @JsonProperty("vfModuleName")
    public String getVfModuleName() {
        return vfModuleName;
    }

    @JsonProperty("vfModuleName")
    public void setVfModuleName(String vfModuleName) {
        this.vfModuleName = vfModuleName;
    }

    @JsonProperty("vnfName")
    public String getVnfName() {
        return vnfName;
    }

    @JsonProperty("vnfName")
    public void setVnfName(String vnfName) {
        this.vnfName = vnfName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    

}
