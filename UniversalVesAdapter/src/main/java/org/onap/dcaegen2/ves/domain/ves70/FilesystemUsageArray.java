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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * disk usage of an identified virtual machine in gigabytes and/or gigabytes per second
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "blockConfigured",
    "blockIops",
    "blockUsed",
    "ephemeralConfigured",
    "ephemeralIops",
    "ephemeralUsed",
    "filesystemName"
})
public class FilesystemUsageArray {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockConfigured")
    private Double blockConfigured;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockIops")
    private Double blockIops;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockUsed")
    private Double blockUsed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralConfigured")
    private Double ephemeralConfigured;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralIops")
    private Double ephemeralIops;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralUsed")
    private Double ephemeralUsed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filesystemName")
    private String filesystemName;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockConfigured")
    public Double getBlockConfigured() {
        return blockConfigured;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockConfigured")
    public void setBlockConfigured(Double blockConfigured) {
        this.blockConfigured = blockConfigured;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockIops")
    public Double getBlockIops() {
        return blockIops;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockIops")
    public void setBlockIops(Double blockIops) {
        this.blockIops = blockIops;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockUsed")
    public Double getBlockUsed() {
        return blockUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blockUsed")
    public void setBlockUsed(Double blockUsed) {
        this.blockUsed = blockUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralConfigured")
    public Double getEphemeralConfigured() {
        return ephemeralConfigured;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralConfigured")
    public void setEphemeralConfigured(Double ephemeralConfigured) {
        this.ephemeralConfigured = ephemeralConfigured;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralIops")
    public Double getEphemeralIops() {
        return ephemeralIops;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralIops")
    public void setEphemeralIops(Double ephemeralIops) {
        this.ephemeralIops = ephemeralIops;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralUsed")
    public Double getEphemeralUsed() {
        return ephemeralUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ephemeralUsed")
    public void setEphemeralUsed(Double ephemeralUsed) {
        this.ephemeralUsed = ephemeralUsed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filesystemName")
    public String getFilesystemName() {
        return filesystemName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filesystemName")
    public void setFilesystemName(String filesystemName) {
        this.filesystemName = filesystemName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blockConfigured).append(blockIops).append(blockUsed).append(ephemeralConfigured).append(ephemeralIops).append(ephemeralUsed).append(filesystemName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilesystemUsageArray) == false) {
            return false;
        }
        FilesystemUsageArray rhs = ((FilesystemUsageArray) other);
        return new EqualsBuilder().append(blockConfigured, rhs.blockConfigured).append(blockIops, rhs.blockIops).append(blockUsed, rhs.blockUsed).append(ephemeralConfigured, rhs.ephemeralConfigured).append(ephemeralIops, rhs.ephemeralIops).append(ephemeralUsed, rhs.ephemeralUsed).append(filesystemName, rhs.filesystemName).isEquals();
    }

}
