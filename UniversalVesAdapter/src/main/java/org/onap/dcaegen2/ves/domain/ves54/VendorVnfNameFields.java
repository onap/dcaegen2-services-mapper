/*-
 * ============LICENSE_START=======================================================
 * ONAP : DCAE
 * ================================================================================
 * Copyright 2019 TechMahindra
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.dcaegen2.ves.domain.ves54;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * provides vendor, vnf and vfModule identifying information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"vendorName", "vfModuleName", "vnfName"})
public class VendorVnfNameFields {
    
    /**
     * VNF vendor name (Required)
     * 
     */
    @JsonProperty("vendorName")
    @JsonPropertyDescription("VNF vendor name")
    private String vendorName;
    /**
     * ASDC vfModuleName for the vfModule generating the event
     * 
     */
    @JsonProperty("vfModuleName")
    @JsonPropertyDescription("ASDC vfModuleName for the vfModule generating the event")
    private String vfModuleName;
    /**
     * ASDC modelName for the VNF generating the event
     * 
     */
    @JsonProperty("vnfName")
    @JsonPropertyDescription("ASDC modelName for the VNF generating the event")
    private String vnfName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * VNF vendor name (Required)
     * 
     */
    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }
    
    /**
     * VNF vendor name (Required)
     * 
     */
    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    /**
     * ASDC vfModuleName for the vfModule generating the event
     * 
     */
    @JsonProperty("vfModuleName")
    public String getVfModuleName() {
        return vfModuleName;
    }
    
    /**
     * ASDC vfModuleName for the vfModule generating the event
     * 
     */
    @JsonProperty("vfModuleName")
    public void setVfModuleName(String vfModuleName) {
        this.vfModuleName = vfModuleName;
    }
    
    /**
     * ASDC modelName for the VNF generating the event
     * 
     */
    @JsonProperty("vnfName")
    public String getVnfName() {
        return vnfName;
    }
    
    /**
     * ASDC modelName for the VNF generating the event
     * 
     */
    @JsonProperty("vnfName")
    public void setVnfName(String vnfName) {
        this.vnfName = vnfName;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
    public int hashCode() {
        return new HashCodeBuilder().append(vendorName).append(vfModuleName).append(vnfName)
                .append(additionalProperties).toHashCode();
    }
    
    
}
