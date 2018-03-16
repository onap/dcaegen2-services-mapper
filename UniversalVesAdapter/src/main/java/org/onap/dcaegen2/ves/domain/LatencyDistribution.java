
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
    "countsInTheBucket",
    "highEndOfLatencyBucket",
    "lowEndOfLatencyBucket"
})
public class LatencyDistribution {

    @JsonProperty("countsInTheBucket")
    private Double countsInTheBucket;
    @JsonProperty("highEndOfLatencyBucket")
    private Double highEndOfLatencyBucket;
    @JsonProperty("lowEndOfLatencyBucket")
    private Double lowEndOfLatencyBucket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("countsInTheBucket")
    public Double getCountsInTheBucket() {
        return countsInTheBucket;
    }

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
        return new ToStringBuilder(this).append("countsInTheBucket", countsInTheBucket).append("highEndOfLatencyBucket", highEndOfLatencyBucket).append("lowEndOfLatencyBucket", lowEndOfLatencyBucket).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(countsInTheBucket).append(additionalProperties).append(highEndOfLatencyBucket).append(lowEndOfLatencyBucket).toHashCode();
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
        return new EqualsBuilder().append(countsInTheBucket, rhs.countsInTheBucket).append(additionalProperties, rhs.additionalProperties).append(highEndOfLatencyBucket, rhs.highEndOfLatencyBucket).append(lowEndOfLatencyBucket, rhs.lowEndOfLatencyBucket).isEquals();
    }

}
