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
    "cpuIdentifier",
    "percentUsage",
    "cpuIdle",
    "cpuUsageInterrupt",
    "cpuUsageNice",
    "cpuUsageSoftIrq",
    "cpuUsageSteal",
    "cpuUsageSystem",
    "cpuUsageUser",
    "cpuWait"
})
public class CpuUsageArray {

    @JsonProperty("cpuIdentifier")
    private String cpuIdentifier;
    @JsonProperty("percentUsage")
    private Double percentUsage;
    @JsonProperty("cpuIdle")
    private Double cpuIdle;
    @JsonProperty("cpuUsageInterrupt")
    private Double cpuUsageInterrupt;
    @JsonProperty("cpuUsageNice")
    private Double cpuUsageNice;
    @JsonProperty("cpuUsageSoftIrq")
    private Double cpuUsageSoftIrq;
    @JsonProperty("cpuUsageSteal")
    private Double cpuUsageSteal;
    @JsonProperty("cpuUsageSystem")
    private Double cpuUsageSystem;
    @JsonProperty("cpuUsageUser")
    private Double cpuUsageUser;
    @JsonProperty("cpuWait")
    private Double cpuWait;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cpuIdentifier")
    public String getCpuIdentifier() {
        return cpuIdentifier;
    }

    @JsonProperty("cpuIdentifier")
    public void setCpuIdentifier(String cpuIdentifier) {
        this.cpuIdentifier = cpuIdentifier;
    }

    @JsonProperty("percentUsage")
    public Double getPercentUsage() {
        return percentUsage;
    }

    @JsonProperty("percentUsage")
    public void setPercentUsage(Double percentUsage) {
        this.percentUsage = percentUsage;
    }

    @JsonProperty("cpuIdle")
    public Double getCpuIdle() {
        return cpuIdle;
    }

    @JsonProperty("cpuIdle")
    public void setCpuIdle(Double cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

    @JsonProperty("cpuUsageInterrupt")
    public Double getCpuUsageInterrupt() {
        return cpuUsageInterrupt;
    }

    @JsonProperty("cpuUsageInterrupt")
    public void setCpuUsageInterrupt(Double cpuUsageInterrupt) {
        this.cpuUsageInterrupt = cpuUsageInterrupt;
    }

    @JsonProperty("cpuUsageNice")
    public Double getCpuUsageNice() {
        return cpuUsageNice;
    }

    @JsonProperty("cpuUsageNice")
    public void setCpuUsageNice(Double cpuUsageNice) {
        this.cpuUsageNice = cpuUsageNice;
    }

    @JsonProperty("cpuUsageSoftIrq")
    public Double getCpuUsageSoftIrq() {
        return cpuUsageSoftIrq;
    }

    @JsonProperty("cpuUsageSoftIrq")
    public void setCpuUsageSoftIrq(Double cpuUsageSoftIrq) {
        this.cpuUsageSoftIrq = cpuUsageSoftIrq;
    }

    @JsonProperty("cpuUsageSteal")
    public Double getCpuUsageSteal() {
        return cpuUsageSteal;
    }

    @JsonProperty("cpuUsageSteal")
    public void setCpuUsageSteal(Double cpuUsageSteal) {
        this.cpuUsageSteal = cpuUsageSteal;
    }

    @JsonProperty("cpuUsageSystem")
    public Double getCpuUsageSystem() {
        return cpuUsageSystem;
    }

    @JsonProperty("cpuUsageSystem")
    public void setCpuUsageSystem(Double cpuUsageSystem) {
        this.cpuUsageSystem = cpuUsageSystem;
    }

    @JsonProperty("cpuUsageUser")
    public Double getCpuUsageUser() {
        return cpuUsageUser;
    }

    @JsonProperty("cpuUsageUser")
    public void setCpuUsageUser(Double cpuUsageUser) {
        this.cpuUsageUser = cpuUsageUser;
    }

    @JsonProperty("cpuWait")
    public Double getCpuWait() {
        return cpuWait;
    }

    @JsonProperty("cpuWait")
    public void setCpuWait(Double cpuWait) {
        this.cpuWait = cpuWait;
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
        return new ToStringBuilder(this).append("cpuIdentifier", cpuIdentifier).append("percentUsage", percentUsage).append("cpuIdle", cpuIdle).append("cpuUsageInterrupt", cpuUsageInterrupt).append("cpuUsageNice", cpuUsageNice).append("cpuUsageSoftIrq", cpuUsageSoftIrq).append("cpuUsageSteal", cpuUsageSteal).append("cpuUsageSystem", cpuUsageSystem).append("cpuUsageUser", cpuUsageUser).append("cpuWait", cpuWait).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cpuUsageNice).append(cpuUsageSteal).append(cpuUsageInterrupt).append(cpuUsageSoftIrq).append(cpuIdentifier).append(additionalProperties).append(cpuWait).append(cpuUsageSystem).append(cpuUsageUser).append(cpuIdle).append(percentUsage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CpuUsageArray) == false) {
            return false;
        }
        CpuUsageArray rhs = ((CpuUsageArray) other);
        return new EqualsBuilder().append(cpuUsageNice, rhs.cpuUsageNice).append(cpuUsageSteal, rhs.cpuUsageSteal).append(cpuUsageInterrupt, rhs.cpuUsageInterrupt).append(cpuUsageSoftIrq, rhs.cpuUsageSoftIrq).append(cpuIdentifier, rhs.cpuIdentifier).append(additionalProperties, rhs.additionalProperties).append(cpuWait, rhs.cpuWait).append(cpuUsageSystem, rhs.cpuUsageSystem).append(cpuUsageUser, rhs.cpuUsageUser).append(cpuIdle, rhs.cpuIdle).append(percentUsage, rhs.percentUsage).isEquals();
    }

}
