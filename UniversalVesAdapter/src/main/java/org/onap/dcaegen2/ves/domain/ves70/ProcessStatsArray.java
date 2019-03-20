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
 * metrics on system processes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "forkRate",
    "processIdentifier",
    "psStateBlocked",
    "psStatePaging",
    "psStateRunning",
    "psStateSleeping",
    "psStateStopped",
    "psStateZombie"
})
public class ProcessStatsArray {

    /**
     * the number of threads created since the last reboot
     * 
     */
    @JsonProperty("forkRate")
    @JsonPropertyDescription("the number of threads created since the last reboot")
    private Double forkRate;
    /**
     * processIdentifier
     * (Required)
     * 
     */
    @JsonProperty("processIdentifier")
    @JsonPropertyDescription("processIdentifier")
    private String processIdentifier;
    /**
     * the number of processes in a blocked state
     * 
     */
    @JsonProperty("psStateBlocked")
    @JsonPropertyDescription("the number of processes in a blocked state")
    private Double psStateBlocked;
    /**
     * the number of processes in a paging state
     * 
     */
    @JsonProperty("psStatePaging")
    @JsonPropertyDescription("the number of processes in a paging state")
    private Double psStatePaging;
    /**
     * the number of processes in a running state
     * 
     */
    @JsonProperty("psStateRunning")
    @JsonPropertyDescription("the number of processes in a running state")
    private Double psStateRunning;
    /**
     * the number of processes in a sleeping state
     * 
     */
    @JsonProperty("psStateSleeping")
    @JsonPropertyDescription("the number of processes in a sleeping state")
    private Double psStateSleeping;
    /**
     * the number of processes in a stopped state
     * 
     */
    @JsonProperty("psStateStopped")
    @JsonPropertyDescription("the number of processes in a stopped state")
    private Double psStateStopped;
    /**
     * the number of processes in a zombie state
     * 
     */
    @JsonProperty("psStateZombie")
    @JsonPropertyDescription("the number of processes in a zombie state")
    private Double psStateZombie;

    /**
     * the number of threads created since the last reboot
     * 
     */
    @JsonProperty("forkRate")
    public Double getForkRate() {
        return forkRate;
    }

    /**
     * the number of threads created since the last reboot
     * 
     */
    @JsonProperty("forkRate")
    public void setForkRate(Double forkRate) {
        this.forkRate = forkRate;
    }

    /**
     * processIdentifier
     * (Required)
     * 
     */
    @JsonProperty("processIdentifier")
    public String getProcessIdentifier() {
        return processIdentifier;
    }

    /**
     * processIdentifier
     * (Required)
     * 
     */
    @JsonProperty("processIdentifier")
    public void setProcessIdentifier(String processIdentifier) {
        this.processIdentifier = processIdentifier;
    }

    /**
     * the number of processes in a blocked state
     * 
     */
    @JsonProperty("psStateBlocked")
    public Double getPsStateBlocked() {
        return psStateBlocked;
    }

    /**
     * the number of processes in a blocked state
     * 
     */
    @JsonProperty("psStateBlocked")
    public void setPsStateBlocked(Double psStateBlocked) {
        this.psStateBlocked = psStateBlocked;
    }

    /**
     * the number of processes in a paging state
     * 
     */
    @JsonProperty("psStatePaging")
    public Double getPsStatePaging() {
        return psStatePaging;
    }

    /**
     * the number of processes in a paging state
     * 
     */
    @JsonProperty("psStatePaging")
    public void setPsStatePaging(Double psStatePaging) {
        this.psStatePaging = psStatePaging;
    }

    /**
     * the number of processes in a running state
     * 
     */
    @JsonProperty("psStateRunning")
    public Double getPsStateRunning() {
        return psStateRunning;
    }

    /**
     * the number of processes in a running state
     * 
     */
    @JsonProperty("psStateRunning")
    public void setPsStateRunning(Double psStateRunning) {
        this.psStateRunning = psStateRunning;
    }

    /**
     * the number of processes in a sleeping state
     * 
     */
    @JsonProperty("psStateSleeping")
    public Double getPsStateSleeping() {
        return psStateSleeping;
    }

    /**
     * the number of processes in a sleeping state
     * 
     */
    @JsonProperty("psStateSleeping")
    public void setPsStateSleeping(Double psStateSleeping) {
        this.psStateSleeping = psStateSleeping;
    }

    /**
     * the number of processes in a stopped state
     * 
     */
    @JsonProperty("psStateStopped")
    public Double getPsStateStopped() {
        return psStateStopped;
    }

    /**
     * the number of processes in a stopped state
     * 
     */
    @JsonProperty("psStateStopped")
    public void setPsStateStopped(Double psStateStopped) {
        this.psStateStopped = psStateStopped;
    }

    /**
     * the number of processes in a zombie state
     * 
     */
    @JsonProperty("psStateZombie")
    public Double getPsStateZombie() {
        return psStateZombie;
    }

    /**
     * the number of processes in a zombie state
     * 
     */
    @JsonProperty("psStateZombie")
    public void setPsStateZombie(Double psStateZombie) {
        this.psStateZombie = psStateZombie;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(forkRate).append(processIdentifier).append(psStateBlocked).append(psStatePaging).append(psStateRunning).append(psStateSleeping).append(psStateStopped).append(psStateZombie).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessStatsArray) == false) {
            return false;
        }
        ProcessStatsArray rhs = ((ProcessStatsArray) other);
        return new EqualsBuilder().append(forkRate, rhs.forkRate).append(processIdentifier, rhs.processIdentifier).append(psStateBlocked, rhs.psStateBlocked).append(psStatePaging, rhs.psStatePaging).append(psStateRunning, rhs.psStateRunning).append(psStateSleeping, rhs.psStateSleeping).append(psStateStopped, rhs.psStateStopped).append(psStateZombie, rhs.psStateZombie).isEquals();
    }

}
