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
 * usage of an identified CPU
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"cpuIdentifier", "cpuIdle", "cpuUsageInterrupt", "cpuUsageNice",
        "cpuUsageSoftIrq", "cpuUsageSteal", "cpuUsageSystem", "cpuUsageUser", "cpuWait",
        "percentUsage"})
public class CpuUsageArray {
    
    /**
     * cpu identifer (Required)
     * 
     */
    @JsonProperty("cpuIdentifier")
    @JsonPropertyDescription("cpu identifer")
    private String cpuIdentifier;
    /**
     * percentage of CPU time spent in the idle task
     * 
     */
    @JsonProperty("cpuIdle")
    @JsonPropertyDescription("percentage of CPU time spent in the idle task")
    private Double cpuIdle;
    /**
     * percentage of time spent servicing interrupts
     * 
     */
    @JsonProperty("cpuUsageInterrupt")
    @JsonPropertyDescription("percentage of time spent servicing interrupts")
    private Double cpuUsageInterrupt;
    /**
     * percentage of time spent running user space processes that have been niced
     * 
     */
    @JsonProperty("cpuUsageNice")
    @JsonPropertyDescription("percentage of time spent running user space processes that have been niced")
    private Double cpuUsageNice;
    /**
     * percentage of time spent handling soft irq interrupts
     * 
     */
    @JsonProperty("cpuUsageSoftIrq")
    @JsonPropertyDescription("percentage of time spent handling soft irq interrupts")
    private Double cpuUsageSoftIrq;
    /**
     * percentage of time spent in involuntary wait which is neither user, system or idle time and
     * is effectively time that went missing
     * 
     */
    @JsonProperty("cpuUsageSteal")
    @JsonPropertyDescription("percentage of time spent in involuntary wait which is neither user, system or idle time and is effectively time that went missing")
    private Double cpuUsageSteal;
    /**
     * percentage of time spent on system tasks running the kernel
     * 
     */
    @JsonProperty("cpuUsageSystem")
    @JsonPropertyDescription("percentage of time spent on system tasks running the kernel")
    private Double cpuUsageSystem;
    /**
     * percentage of time spent running un-niced user space processes
     * 
     */
    @JsonProperty("cpuUsageUser")
    @JsonPropertyDescription("percentage of time spent running un-niced user space processes")
    private Double cpuUsageUser;
    /**
     * percentage of CPU time spent waiting for I/O operations to complete
     * 
     */
    @JsonProperty("cpuWait")
    @JsonPropertyDescription("percentage of CPU time spent waiting for I/O operations to complete")
    private Double cpuWait;
    /**
     * aggregate cpu usage of the virtual machine on which the VNFC reporting the event is running
     * (Required)
     * 
     */
    @JsonProperty("percentUsage")
    @JsonPropertyDescription("aggregate cpu usage of the virtual machine on which the VNFC reporting the event is running")
    private Double percentUsage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * cpu identifer (Required)
     * 
     */
    @JsonProperty("cpuIdentifier")
    public String getCpuIdentifier() {
        return cpuIdentifier;
    }
    
    /**
     * cpu identifer (Required)
     * 
     */
    @JsonProperty("cpuIdentifier")
    public void setCpuIdentifier(String cpuIdentifier) {
        this.cpuIdentifier = cpuIdentifier;
    }
    
    /**
     * percentage of CPU time spent in the idle task
     * 
     */
    @JsonProperty("cpuIdle")
    public Double getCpuIdle() {
        return cpuIdle;
    }
    
    /**
     * percentage of CPU time spent in the idle task
     * 
     */
    @JsonProperty("cpuIdle")
    public void setCpuIdle(Double cpuIdle) {
        this.cpuIdle = cpuIdle;
    }
    
    /**
     * percentage of time spent servicing interrupts
     * 
     */
    @JsonProperty("cpuUsageInterrupt")
    public Double getCpuUsageInterrupt() {
        return cpuUsageInterrupt;
    }
    
    /**
     * percentage of time spent servicing interrupts
     * 
     */
    @JsonProperty("cpuUsageInterrupt")
    public void setCpuUsageInterrupt(Double cpuUsageInterrupt) {
        this.cpuUsageInterrupt = cpuUsageInterrupt;
    }
    
    /**
     * percentage of time spent running user space processes that have been niced
     * 
     */
    @JsonProperty("cpuUsageNice")
    public Double getCpuUsageNice() {
        return cpuUsageNice;
    }
    
    /**
     * percentage of time spent running user space processes that have been niced
     * 
     */
    @JsonProperty("cpuUsageNice")
    public void setCpuUsageNice(Double cpuUsageNice) {
        this.cpuUsageNice = cpuUsageNice;
    }
    
    /**
     * percentage of time spent handling soft irq interrupts
     * 
     */
    @JsonProperty("cpuUsageSoftIrq")
    public Double getCpuUsageSoftIrq() {
        return cpuUsageSoftIrq;
    }
    
    /**
     * percentage of time spent handling soft irq interrupts
     * 
     */
    @JsonProperty("cpuUsageSoftIrq")
    public void setCpuUsageSoftIrq(Double cpuUsageSoftIrq) {
        this.cpuUsageSoftIrq = cpuUsageSoftIrq;
    }
    
    /**
     * percentage of time spent in involuntary wait which is neither user, system or idle time and
     * is effectively time that went missing
     * 
     */
    @JsonProperty("cpuUsageSteal")
    public Double getCpuUsageSteal() {
        return cpuUsageSteal;
    }
    
    /**
     * percentage of time spent in involuntary wait which is neither user, system or idle time and
     * is effectively time that went missing
     * 
     */
    @JsonProperty("cpuUsageSteal")
    public void setCpuUsageSteal(Double cpuUsageSteal) {
        this.cpuUsageSteal = cpuUsageSteal;
    }
    
    /**
     * percentage of time spent on system tasks running the kernel
     * 
     */
    @JsonProperty("cpuUsageSystem")
    public Double getCpuUsageSystem() {
        return cpuUsageSystem;
    }
    
    /**
     * percentage of time spent on system tasks running the kernel
     * 
     */
    @JsonProperty("cpuUsageSystem")
    public void setCpuUsageSystem(Double cpuUsageSystem) {
        this.cpuUsageSystem = cpuUsageSystem;
    }
    
    /**
     * percentage of time spent running un-niced user space processes
     * 
     */
    @JsonProperty("cpuUsageUser")
    public Double getCpuUsageUser() {
        return cpuUsageUser;
    }
    
    /**
     * percentage of time spent running un-niced user space processes
     * 
     */
    @JsonProperty("cpuUsageUser")
    public void setCpuUsageUser(Double cpuUsageUser) {
        this.cpuUsageUser = cpuUsageUser;
    }
    
    /**
     * percentage of CPU time spent waiting for I/O operations to complete
     * 
     */
    @JsonProperty("cpuWait")
    public Double getCpuWait() {
        return cpuWait;
    }
    
    /**
     * percentage of CPU time spent waiting for I/O operations to complete
     * 
     */
    @JsonProperty("cpuWait")
    public void setCpuWait(Double cpuWait) {
        this.cpuWait = cpuWait;
    }
    
    /**
     * aggregate cpu usage of the virtual machine on which the VNFC reporting the event is running
     * (Required)
     * 
     */
    @JsonProperty("percentUsage")
    public Double getPercentUsage() {
        return percentUsage;
    }
    
    /**
     * aggregate cpu usage of the virtual machine on which the VNFC reporting the event is running
     * (Required)
     * 
     */
    @JsonProperty("percentUsage")
    public void setPercentUsage(Double percentUsage) {
        this.percentUsage = percentUsage;
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
        return new HashCodeBuilder().append(cpuIdentifier).append(cpuIdle).append(cpuUsageInterrupt)
                .append(cpuUsageNice).append(cpuUsageSoftIrq).append(cpuUsageSteal)
                .append(cpuUsageSystem).append(cpuUsageUser).append(cpuWait).append(percentUsage)
                .append(additionalProperties).toHashCode();
    }
    
    
    
}
