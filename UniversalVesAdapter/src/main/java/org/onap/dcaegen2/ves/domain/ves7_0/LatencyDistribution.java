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
package org.onap.dcaegen2.ves.domain.ves7_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * number of counts falling within a defined latency bucket
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countsInTheBucket",
    "highEndOfLatencyBucket",
    "lowEndOfLatencyBucket"
})
public class LatencyDistribution {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countsInTheBucket")
    private Double countsInTheBucket;
    @JsonProperty("highEndOfLatencyBucket")
    private Double highEndOfLatencyBucket;
    @JsonProperty("lowEndOfLatencyBucket")
    private Double lowEndOfLatencyBucket;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countsInTheBucket")
    public Double getCountsInTheBucket() {
        return countsInTheBucket;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("countsInTheBucket")
    public void setCountsInTheBucket(Double countsInTheBucket) {
        this.countsInTheBucket = countsInTheBucket;
    }

    @JsonProperty("highEndOfLatencyBucket")
    public Double getHighEndOfLatencyBucket() {
        return highEndOfLatencyBucket;
    }

    @JsonProperty("highEndOfLatencyBucket")
    public void setHighEndOfLatencyBucket(Double highEndOfLatencyBucket) {
        this.highEndOfLatencyBucket = highEndOfLatencyBucket;
    }

    @JsonProperty("lowEndOfLatencyBucket")
    public Double getLowEndOfLatencyBucket() {
        return lowEndOfLatencyBucket;
    }

    @JsonProperty("lowEndOfLatencyBucket")
    public void setLowEndOfLatencyBucket(Double lowEndOfLatencyBucket) {
        this.lowEndOfLatencyBucket = lowEndOfLatencyBucket;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(countsInTheBucket).append(highEndOfLatencyBucket).append(lowEndOfLatencyBucket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LatencyDistribution) == false) {
            return false;
        }
        LatencyDistribution rhs = ((LatencyDistribution) other);
        return new EqualsBuilder().append(countsInTheBucket, rhs.countsInTheBucket).append(highEndOfLatencyBucket, rhs.highEndOfLatencyBucket).append(lowEndOfLatencyBucket, rhs.lowEndOfLatencyBucket).isEquals();
    }

}
