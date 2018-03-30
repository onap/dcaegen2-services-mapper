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
    "blockConfigured",
    "blockIops",
    "blockUsed",
    "ephemeralConfigured",
    "ephemeralIops",
    "ephemeralUsed",
    "filesystemName"
})
public class FilesystemUsageArray {

    @JsonProperty("blockConfigured")
    private Double blockConfigured;
    @JsonProperty("blockIops")
    private Double blockIops;
    @JsonProperty("blockUsed")
    private Double blockUsed;
    @JsonProperty("ephemeralConfigured")
    private Double ephemeralConfigured;
    @JsonProperty("ephemeralIops")
    private Double ephemeralIops;
    @JsonProperty("ephemeralUsed")
    private Double ephemeralUsed;
    @JsonProperty("filesystemName")
    private String filesystemName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("blockConfigured")
    public Double getBlockConfigured() {
        return blockConfigured;
    }

    @JsonProperty("blockConfigured")
    public void setBlockConfigured(Double blockConfigured) {
        this.blockConfigured = blockConfigured;
    }

    @JsonProperty("blockIops")
    public Double getBlockIops() {
        return blockIops;
    }

    @JsonProperty("blockIops")
    public void setBlockIops(Double blockIops) {
        this.blockIops = blockIops;
    }

    @JsonProperty("blockUsed")
    public Double getBlockUsed() {
        return blockUsed;
    }

    @JsonProperty("blockUsed")
    public void setBlockUsed(Double blockUsed) {
        this.blockUsed = blockUsed;
    }

    @JsonProperty("ephemeralConfigured")
    public Double getEphemeralConfigured() {
        return ephemeralConfigured;
    }

    @JsonProperty("ephemeralConfigured")
    public void setEphemeralConfigured(Double ephemeralConfigured) {
        this.ephemeralConfigured = ephemeralConfigured;
    }

    @JsonProperty("ephemeralIops")
    public Double getEphemeralIops() {
        return ephemeralIops;
    }

    @JsonProperty("ephemeralIops")
    public void setEphemeralIops(Double ephemeralIops) {
        this.ephemeralIops = ephemeralIops;
    }

    @JsonProperty("ephemeralUsed")
    public Double getEphemeralUsed() {
        return ephemeralUsed;
    }

    @JsonProperty("ephemeralUsed")
    public void setEphemeralUsed(Double ephemeralUsed) {
        this.ephemeralUsed = ephemeralUsed;
    }

    @JsonProperty("filesystemName")
    public String getFilesystemName() {
        return filesystemName;
    }

    @JsonProperty("filesystemName")
    public void setFilesystemName(String filesystemName) {
        this.filesystemName = filesystemName;
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
        return new ToStringBuilder(this).append("blockConfigured", blockConfigured).append("blockIops", blockIops).append("blockUsed", blockUsed).append("ephemeralConfigured", ephemeralConfigured).append("ephemeralIops", ephemeralIops).append("ephemeralUsed", ephemeralUsed).append("filesystemName", filesystemName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ephemeralUsed).append(blockConfigured).append(filesystemName).append(additionalProperties).append(ephemeralConfigured).append(ephemeralIops).append(blockIops).append(blockUsed).toHashCode();
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
        return new EqualsBuilder().append(ephemeralUsed, rhs.ephemeralUsed).append(blockConfigured, rhs.blockConfigured).append(filesystemName, rhs.filesystemName).append(additionalProperties, rhs.additionalProperties).append(ephemeralConfigured, rhs.ephemeralConfigured).append(ephemeralIops, rhs.ephemeralIops).append(blockIops, rhs.blockIops).append(blockUsed, rhs.blockUsed).isEquals();
    }

}
