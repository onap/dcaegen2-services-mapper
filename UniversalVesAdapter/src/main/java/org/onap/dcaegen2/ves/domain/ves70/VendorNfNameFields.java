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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * provides vendor, nf and nfModule identifying information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendorName",
    "nfModuleName",
    "nfName"
})
public class VendorNfNameFields {

    /**
     * network function vendor name
     * (Required)
     * 
     */
    @JsonProperty("vendorName")
    @JsonPropertyDescription("network function vendor name")
    private String vendorName;
    /**
     * name of the nfModule generating the event
     * 
     */
    @JsonProperty("nfModuleName")
    @JsonPropertyDescription("name of the nfModule generating the event")
    private String nfModuleName;
    /**
     * name of the network function generating the event
     * 
     */
    @JsonProperty("nfName")
    @JsonPropertyDescription("name of the network function generating the event")
    private String nfName;

    /**
     * network function vendor name
     * (Required)
     * 
     */
    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * network function vendor name
     * (Required)
     * 
     */
    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * name of the nfModule generating the event
     * 
     */
    @JsonProperty("nfModuleName")
    public String getNfModuleName() {
        return nfModuleName;
    }

    /**
     * name of the nfModule generating the event
     * 
     */
    @JsonProperty("nfModuleName")
    public void setNfModuleName(String nfModuleName) {
        this.nfModuleName = nfModuleName;
    }

    /**
     * name of the network function generating the event
     * 
     */
    @JsonProperty("nfName")
    public String getNfName() {
        return nfName;
    }

    /**
     * name of the network function generating the event
     * 
     */
    @JsonProperty("nfName")
    public void setNfName(String nfName) {
        this.nfName = nfName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vendorName).append(nfModuleName).append(nfName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorNfNameFields) == false) {
            return false;
        }
        VendorNfNameFields rhs = ((VendorNfNameFields) other);
        return new EqualsBuilder().append(vendorName, rhs.vendorName).append(nfModuleName, rhs.nfModuleName).append(nfName, rhs.nfName).isEquals();
    }

}
