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
package org.onap.dcaegen2.ves.domain.ves70;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * usage of an identified CPU
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpuCapacityContention",
    "cpuDemandAvg",
    "cpuDemandMhz",
    "cpuDemandPct",
    "cpuIdentifier",
    "cpuIdle",
    "cpuLatencyAvg",
    "cpuOverheadAvg",
    "cpuSwapWaitTime",
    "cpuUsageInterrupt",
    "cpuUsageNice",
    "cpuUsageSoftIrq",
    "cpuUsageSteal",
    "cpuUsageSystem",
    "cpuUsageUser",
    "cpuWait",
    "percentUsage"
})
public class CpuUsageArray {

    /**
     * the amount of time the CPU cannot run due to contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuCapacityContention")
    @JsonPropertyDescription("the amount of time the CPU cannot run due to contention, in milliseconds over the measurementInterval")
    private Double cpuCapacityContention;
    /**
     * the total CPU time that the NF/NFC/VM could use if there was no contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuDemandAvg")
    @JsonPropertyDescription("the total CPU time that the NF/NFC/VM could use if there was no contention, in milliseconds over the measurementInterval")
    private Double cpuDemandAvg;
    /**
     * CPU demand in megahertz
     * 
     */
    @JsonProperty("cpuDemandMhz")
    @JsonPropertyDescription("CPU demand in megahertz")
    private Double cpuDemandMhz;
    /**
     * CPU demand as a percentage of the provisioned capacity
     * 
     */
    @JsonProperty("cpuDemandPct")
    @JsonPropertyDescription("CPU demand as a percentage of the provisioned capacity")
    private Double cpuDemandPct;
    /**
     * cpu identifer
     * (Required)
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
     * percentage of time the VM is unable to run because it is contending for access to the physical CPUs
     * 
     */
    @JsonProperty("cpuLatencyAvg")
    @JsonPropertyDescription("percentage of time the VM is unable to run because it is contending for access to the physical CPUs")
    private Double cpuLatencyAvg;
    /**
     * the overhead demand above available allocations and reservations, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuOverheadAvg")
    @JsonPropertyDescription("the overhead demand above available allocations and reservations, in milliseconds over the measurementInterval")
    private Double cpuOverheadAvg;
    /**
     * swap wait time. in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuSwapWaitTime")
    @JsonPropertyDescription("swap wait time. in milliseconds over the measurementInterval")
    private Double cpuSwapWaitTime;
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
     * percentage of time spent in involuntary wait which is neither user, system or idle time and is effectively time that went missing
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
     * aggregate cpu usage of the virtual machine on which the xNFC reporting the event is running
     * (Required)
     * 
     */
    @JsonProperty("percentUsage")
    @JsonPropertyDescription("aggregate cpu usage of the virtual machine on which the xNFC reporting the event is running")
    private Double percentUsage;

    /**
     * the amount of time the CPU cannot run due to contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuCapacityContention")
    public Double getCpuCapacityContention() {
        return cpuCapacityContention;
    }

    /**
     * the amount of time the CPU cannot run due to contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuCapacityContention")
    public void setCpuCapacityContention(Double cpuCapacityContention) {
        this.cpuCapacityContention = cpuCapacityContention;
    }

    /**
     * the total CPU time that the NF/NFC/VM could use if there was no contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuDemandAvg")
    public Double getCpuDemandAvg() {
        return cpuDemandAvg;
    }

    /**
     * the total CPU time that the NF/NFC/VM could use if there was no contention, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuDemandAvg")
    public void setCpuDemandAvg(Double cpuDemandAvg) {
        this.cpuDemandAvg = cpuDemandAvg;
    }

    /**
     * CPU demand in megahertz
     * 
     */
    @JsonProperty("cpuDemandMhz")
    public Double getCpuDemandMhz() {
        return cpuDemandMhz;
    }

    /**
     * CPU demand in megahertz
     * 
     */
    @JsonProperty("cpuDemandMhz")
    public void setCpuDemandMhz(Double cpuDemandMhz) {
        this.cpuDemandMhz = cpuDemandMhz;
    }

    /**
     * CPU demand as a percentage of the provisioned capacity
     * 
     */
    @JsonProperty("cpuDemandPct")
    public Double getCpuDemandPct() {
        return cpuDemandPct;
    }

    /**
     * CPU demand as a percentage of the provisioned capacity
     * 
     */
    @JsonProperty("cpuDemandPct")
    public void setCpuDemandPct(Double cpuDemandPct) {
        this.cpuDemandPct = cpuDemandPct;
    }

    /**
     * cpu identifer
     * (Required)
     * 
     */
    @JsonProperty("cpuIdentifier")
    public String getCpuIdentifier() {
        return cpuIdentifier;
    }

    /**
     * cpu identifer
     * (Required)
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
     * percentage of time the VM is unable to run because it is contending for access to the physical CPUs
     * 
     */
    @JsonProperty("cpuLatencyAvg")
    public Double getCpuLatencyAvg() {
        return cpuLatencyAvg;
    }

    /**
     * percentage of time the VM is unable to run because it is contending for access to the physical CPUs
     * 
     */
    @JsonProperty("cpuLatencyAvg")
    public void setCpuLatencyAvg(Double cpuLatencyAvg) {
        this.cpuLatencyAvg = cpuLatencyAvg;
    }

    /**
     * the overhead demand above available allocations and reservations, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuOverheadAvg")
    public Double getCpuOverheadAvg() {
        return cpuOverheadAvg;
    }

    /**
     * the overhead demand above available allocations and reservations, in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuOverheadAvg")
    public void setCpuOverheadAvg(Double cpuOverheadAvg) {
        this.cpuOverheadAvg = cpuOverheadAvg;
    }

    /**
     * swap wait time. in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuSwapWaitTime")
    public Double getCpuSwapWaitTime() {
        return cpuSwapWaitTime;
    }

    /**
     * swap wait time. in milliseconds over the measurementInterval
     * 
     */
    @JsonProperty("cpuSwapWaitTime")
    public void setCpuSwapWaitTime(Double cpuSwapWaitTime) {
        this.cpuSwapWaitTime = cpuSwapWaitTime;
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
     * percentage of time spent in involuntary wait which is neither user, system or idle time and is effectively time that went missing
     * 
     */
    @JsonProperty("cpuUsageSteal")
    public Double getCpuUsageSteal() {
        return cpuUsageSteal;
    }

    /**
     * percentage of time spent in involuntary wait which is neither user, system or idle time and is effectively time that went missing
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
     * aggregate cpu usage of the virtual machine on which the xNFC reporting the event is running
     * (Required)
     * 
     */
    @JsonProperty("percentUsage")
    public Double getPercentUsage() {
        return percentUsage;
    }

    /**
     * aggregate cpu usage of the virtual machine on which the xNFC reporting the event is running
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cpuCapacityContention).append(cpuDemandAvg).append(cpuDemandMhz).append(cpuDemandPct).append(cpuIdentifier).append(cpuIdle).append(cpuLatencyAvg).append(cpuOverheadAvg).append(cpuSwapWaitTime).append(cpuUsageInterrupt).append(cpuUsageNice).append(cpuUsageSoftIrq).append(cpuUsageSteal).append(cpuUsageSystem).append(cpuUsageUser).append(cpuWait).append(percentUsage).toHashCode();
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
        return new EqualsBuilder().append(cpuCapacityContention, rhs.cpuCapacityContention).append(cpuDemandAvg, rhs.cpuDemandAvg).append(cpuDemandMhz, rhs.cpuDemandMhz).append(cpuDemandPct, rhs.cpuDemandPct).append(cpuIdentifier, rhs.cpuIdentifier).append(cpuIdle, rhs.cpuIdle).append(cpuLatencyAvg, rhs.cpuLatencyAvg).append(cpuOverheadAvg, rhs.cpuOverheadAvg).append(cpuSwapWaitTime, rhs.cpuSwapWaitTime).append(cpuUsageInterrupt, rhs.cpuUsageInterrupt).append(cpuUsageNice, rhs.cpuUsageNice).append(cpuUsageSoftIrq, rhs.cpuUsageSoftIrq).append(cpuUsageSteal, rhs.cpuUsageSteal).append(cpuUsageSystem, rhs.cpuUsageSystem).append(cpuUsageUser, rhs.cpuUsageUser).append(cpuWait, rhs.cpuWait).append(percentUsage, rhs.percentUsage).isEquals();
    }

}
