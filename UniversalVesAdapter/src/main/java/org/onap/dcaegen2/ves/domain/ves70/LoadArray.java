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
 * /proc/loadavg cpu utilization and io utilization metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "longTerm",
    "midTerm",
    "shortTerm"
})
public class LoadArray {

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 15 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("longTerm")
    @JsonPropertyDescription("number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 15 minutes using /proc/loadavg")
    private Double longTerm;
    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 5 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("midTerm")
    @JsonPropertyDescription("number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 5 minutes using /proc/loadavg")
    private Double midTerm;
    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 1 minute using /proc/loadavg
     * 
     */
    @JsonProperty("shortTerm")
    @JsonPropertyDescription("number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 1 minute using /proc/loadavg")
    private Double shortTerm;

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 15 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("longTerm")
    public Double getLongTerm() {
        return longTerm;
    }

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 15 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("longTerm")
    public void setLongTerm(Double longTerm) {
        this.longTerm = longTerm;
    }

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 5 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("midTerm")
    public Double getMidTerm() {
        return midTerm;
    }

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 5 minutes using /proc/loadavg
     * 
     */
    @JsonProperty("midTerm")
    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
    }

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 1 minute using /proc/loadavg
     * 
     */
    @JsonProperty("shortTerm")
    public Double getShortTerm() {
        return shortTerm;
    }

    /**
     * number of jobs in the run queue (state R, cpu utilization) or waiting for disk I/O (state D, io utilization) averaged over 1 minute using /proc/loadavg
     * 
     */
    @JsonProperty("shortTerm")
    public void setShortTerm(Double shortTerm) {
        this.shortTerm = shortTerm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longTerm).append(midTerm).append(shortTerm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadArray) == false) {
            return false;
        }
        LoadArray rhs = ((LoadArray) other);
        return new EqualsBuilder().append(longTerm, rhs.longTerm).append(midTerm, rhs.midTerm).append(shortTerm, rhs.shortTerm).isEquals();
    }

}
