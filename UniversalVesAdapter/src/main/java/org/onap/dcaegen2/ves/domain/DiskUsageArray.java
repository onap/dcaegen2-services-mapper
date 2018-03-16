
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
    "diskIdentifier",
    "diskIoTimeAvg",
    "diskIoTimeLast",
    "diskIoTimeMax",
    "diskIoTimeMin",
    "diskMergedReadAvg",
    "diskMergedReadLast",
    "diskMergedReadMax",
    "diskMergedReadMin",
    "diskMergedWriteAvg",
    "diskMergedWriteLast",
    "diskMergedWriteMax",
    "diskMergedWriteMin",
    "diskOctetsReadAvg",
    "diskOctetsReadLast",
    "diskOctetsReadMax",
    "diskOctetsReadMin",
    "diskOctetsWriteAvg",
    "diskOctetsWriteLast",
    "diskOctetsWriteMax",
    "diskOctetsWriteMin",
    "diskOpsReadAvg",
    "diskOpsReadLast",
    "diskOpsReadMax",
    "diskOpsReadMin",
    "diskOpsWriteAvg",
    "diskOpsWriteLast",
    "diskOpsWriteMax",
    "diskOpsWriteMin",
    "diskPendingOperationsAvg",
    "diskPendingOperationsLast",
    "diskPendingOperationsMax",
    "diskPendingOperationsMin",
    "diskTimeReadAvg",
    "diskTimeReadLast",
    "diskTimeReadMax",
    "diskTimeReadMin",
    "diskTimeWriteAvg",
    "diskTimeWriteLast",
    "diskTimeWriteMax",
    "diskTimeWriteMin"
})
public class DiskUsageArray {

    @JsonProperty("diskIdentifier")
    private String diskIdentifier;
    @JsonProperty("diskIoTimeAvg")
    private Double diskIoTimeAvg;
    @JsonProperty("diskIoTimeLast")
    private Double diskIoTimeLast;
    @JsonProperty("diskIoTimeMax")
    private Double diskIoTimeMax;
    @JsonProperty("diskIoTimeMin")
    private Double diskIoTimeMin;
    @JsonProperty("diskMergedReadAvg")
    private Double diskMergedReadAvg;
    @JsonProperty("diskMergedReadLast")
    private Double diskMergedReadLast;
    @JsonProperty("diskMergedReadMax")
    private Double diskMergedReadMax;
    @JsonProperty("diskMergedReadMin")
    private Double diskMergedReadMin;
    @JsonProperty("diskMergedWriteAvg")
    private Double diskMergedWriteAvg;
    @JsonProperty("diskMergedWriteLast")
    private Double diskMergedWriteLast;
    @JsonProperty("diskMergedWriteMax")
    private Double diskMergedWriteMax;
    @JsonProperty("diskMergedWriteMin")
    private Double diskMergedWriteMin;
    @JsonProperty("diskOctetsReadAvg")
    private Double diskOctetsReadAvg;
    @JsonProperty("diskOctetsReadLast")
    private Double diskOctetsReadLast;
    @JsonProperty("diskOctetsReadMax")
    private Double diskOctetsReadMax;
    @JsonProperty("diskOctetsReadMin")
    private Double diskOctetsReadMin;
    @JsonProperty("diskOctetsWriteAvg")
    private Double diskOctetsWriteAvg;
    @JsonProperty("diskOctetsWriteLast")
    private Double diskOctetsWriteLast;
    @JsonProperty("diskOctetsWriteMax")
    private Double diskOctetsWriteMax;
    @JsonProperty("diskOctetsWriteMin")
    private Double diskOctetsWriteMin;
    @JsonProperty("diskOpsReadAvg")
    private Double diskOpsReadAvg;
    @JsonProperty("diskOpsReadLast")
    private Double diskOpsReadLast;
    @JsonProperty("diskOpsReadMax")
    private Double diskOpsReadMax;
    @JsonProperty("diskOpsReadMin")
    private Double diskOpsReadMin;
    @JsonProperty("diskOpsWriteAvg")
    private Double diskOpsWriteAvg;
    @JsonProperty("diskOpsWriteLast")
    private Double diskOpsWriteLast;
    @JsonProperty("diskOpsWriteMax")
    private Double diskOpsWriteMax;
    @JsonProperty("diskOpsWriteMin")
    private Double diskOpsWriteMin;
    @JsonProperty("diskPendingOperationsAvg")
    private Double diskPendingOperationsAvg;
    @JsonProperty("diskPendingOperationsLast")
    private Double diskPendingOperationsLast;
    @JsonProperty("diskPendingOperationsMax")
    private Double diskPendingOperationsMax;
    @JsonProperty("diskPendingOperationsMin")
    private Double diskPendingOperationsMin;
    @JsonProperty("diskTimeReadAvg")
    private Double diskTimeReadAvg;
    @JsonProperty("diskTimeReadLast")
    private Double diskTimeReadLast;
    @JsonProperty("diskTimeReadMax")
    private Double diskTimeReadMax;
    @JsonProperty("diskTimeReadMin")
    private Double diskTimeReadMin;
    @JsonProperty("diskTimeWriteAvg")
    private Double diskTimeWriteAvg;
    @JsonProperty("diskTimeWriteLast")
    private Double diskTimeWriteLast;
    @JsonProperty("diskTimeWriteMax")
    private Double diskTimeWriteMax;
    @JsonProperty("diskTimeWriteMin")
    private Double diskTimeWriteMin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("diskIdentifier")
    public String getDiskIdentifier() {
        return diskIdentifier;
    }

    @JsonProperty("diskIdentifier")
    public void setDiskIdentifier(String diskIdentifier) {
        this.diskIdentifier = diskIdentifier;
    }

    @JsonProperty("diskIoTimeAvg")
    public Double getDiskIoTimeAvg() {
        return diskIoTimeAvg;
    }

    @JsonProperty("diskIoTimeAvg")
    public void setDiskIoTimeAvg(Double diskIoTimeAvg) {
        this.diskIoTimeAvg = diskIoTimeAvg;
    }

    @JsonProperty("diskIoTimeLast")
    public Double getDiskIoTimeLast() {
        return diskIoTimeLast;
    }

    @JsonProperty("diskIoTimeLast")
    public void setDiskIoTimeLast(Double diskIoTimeLast) {
        this.diskIoTimeLast = diskIoTimeLast;
    }

    @JsonProperty("diskIoTimeMax")
    public Double getDiskIoTimeMax() {
        return diskIoTimeMax;
    }

    @JsonProperty("diskIoTimeMax")
    public void setDiskIoTimeMax(Double diskIoTimeMax) {
        this.diskIoTimeMax = diskIoTimeMax;
    }

    @JsonProperty("diskIoTimeMin")
    public Double getDiskIoTimeMin() {
        return diskIoTimeMin;
    }

    @JsonProperty("diskIoTimeMin")
    public void setDiskIoTimeMin(Double diskIoTimeMin) {
        this.diskIoTimeMin = diskIoTimeMin;
    }

    @JsonProperty("diskMergedReadAvg")
    public Double getDiskMergedReadAvg() {
        return diskMergedReadAvg;
    }

    @JsonProperty("diskMergedReadAvg")
    public void setDiskMergedReadAvg(Double diskMergedReadAvg) {
        this.diskMergedReadAvg = diskMergedReadAvg;
    }

    @JsonProperty("diskMergedReadLast")
    public Double getDiskMergedReadLast() {
        return diskMergedReadLast;
    }

    @JsonProperty("diskMergedReadLast")
    public void setDiskMergedReadLast(Double diskMergedReadLast) {
        this.diskMergedReadLast = diskMergedReadLast;
    }

    @JsonProperty("diskMergedReadMax")
    public Double getDiskMergedReadMax() {
        return diskMergedReadMax;
    }

    @JsonProperty("diskMergedReadMax")
    public void setDiskMergedReadMax(Double diskMergedReadMax) {
        this.diskMergedReadMax = diskMergedReadMax;
    }

    @JsonProperty("diskMergedReadMin")
    public Double getDiskMergedReadMin() {
        return diskMergedReadMin;
    }

    @JsonProperty("diskMergedReadMin")
    public void setDiskMergedReadMin(Double diskMergedReadMin) {
        this.diskMergedReadMin = diskMergedReadMin;
    }

    @JsonProperty("diskMergedWriteAvg")
    public Double getDiskMergedWriteAvg() {
        return diskMergedWriteAvg;
    }

    @JsonProperty("diskMergedWriteAvg")
    public void setDiskMergedWriteAvg(Double diskMergedWriteAvg) {
        this.diskMergedWriteAvg = diskMergedWriteAvg;
    }

    @JsonProperty("diskMergedWriteLast")
    public Double getDiskMergedWriteLast() {
        return diskMergedWriteLast;
    }

    @JsonProperty("diskMergedWriteLast")
    public void setDiskMergedWriteLast(Double diskMergedWriteLast) {
        this.diskMergedWriteLast = diskMergedWriteLast;
    }

    @JsonProperty("diskMergedWriteMax")
    public Double getDiskMergedWriteMax() {
        return diskMergedWriteMax;
    }

    @JsonProperty("diskMergedWriteMax")
    public void setDiskMergedWriteMax(Double diskMergedWriteMax) {
        this.diskMergedWriteMax = diskMergedWriteMax;
    }

    @JsonProperty("diskMergedWriteMin")
    public Double getDiskMergedWriteMin() {
        return diskMergedWriteMin;
    }

    @JsonProperty("diskMergedWriteMin")
    public void setDiskMergedWriteMin(Double diskMergedWriteMin) {
        this.diskMergedWriteMin = diskMergedWriteMin;
    }

    @JsonProperty("diskOctetsReadAvg")
    public Double getDiskOctetsReadAvg() {
        return diskOctetsReadAvg;
    }

    @JsonProperty("diskOctetsReadAvg")
    public void setDiskOctetsReadAvg(Double diskOctetsReadAvg) {
        this.diskOctetsReadAvg = diskOctetsReadAvg;
    }

    @JsonProperty("diskOctetsReadLast")
    public Double getDiskOctetsReadLast() {
        return diskOctetsReadLast;
    }

    @JsonProperty("diskOctetsReadLast")
    public void setDiskOctetsReadLast(Double diskOctetsReadLast) {
        this.diskOctetsReadLast = diskOctetsReadLast;
    }

    @JsonProperty("diskOctetsReadMax")
    public Double getDiskOctetsReadMax() {
        return diskOctetsReadMax;
    }

    @JsonProperty("diskOctetsReadMax")
    public void setDiskOctetsReadMax(Double diskOctetsReadMax) {
        this.diskOctetsReadMax = diskOctetsReadMax;
    }

    @JsonProperty("diskOctetsReadMin")
    public Double getDiskOctetsReadMin() {
        return diskOctetsReadMin;
    }

    @JsonProperty("diskOctetsReadMin")
    public void setDiskOctetsReadMin(Double diskOctetsReadMin) {
        this.diskOctetsReadMin = diskOctetsReadMin;
    }

    @JsonProperty("diskOctetsWriteAvg")
    public Double getDiskOctetsWriteAvg() {
        return diskOctetsWriteAvg;
    }

    @JsonProperty("diskOctetsWriteAvg")
    public void setDiskOctetsWriteAvg(Double diskOctetsWriteAvg) {
        this.diskOctetsWriteAvg = diskOctetsWriteAvg;
    }

    @JsonProperty("diskOctetsWriteLast")
    public Double getDiskOctetsWriteLast() {
        return diskOctetsWriteLast;
    }

    @JsonProperty("diskOctetsWriteLast")
    public void setDiskOctetsWriteLast(Double diskOctetsWriteLast) {
        this.diskOctetsWriteLast = diskOctetsWriteLast;
    }

    @JsonProperty("diskOctetsWriteMax")
    public Double getDiskOctetsWriteMax() {
        return diskOctetsWriteMax;
    }

    @JsonProperty("diskOctetsWriteMax")
    public void setDiskOctetsWriteMax(Double diskOctetsWriteMax) {
        this.diskOctetsWriteMax = diskOctetsWriteMax;
    }

    @JsonProperty("diskOctetsWriteMin")
    public Double getDiskOctetsWriteMin() {
        return diskOctetsWriteMin;
    }

    @JsonProperty("diskOctetsWriteMin")
    public void setDiskOctetsWriteMin(Double diskOctetsWriteMin) {
        this.diskOctetsWriteMin = diskOctetsWriteMin;
    }

    @JsonProperty("diskOpsReadAvg")
    public Double getDiskOpsReadAvg() {
        return diskOpsReadAvg;
    }

    @JsonProperty("diskOpsReadAvg")
    public void setDiskOpsReadAvg(Double diskOpsReadAvg) {
        this.diskOpsReadAvg = diskOpsReadAvg;
    }

    @JsonProperty("diskOpsReadLast")
    public Double getDiskOpsReadLast() {
        return diskOpsReadLast;
    }

    @JsonProperty("diskOpsReadLast")
    public void setDiskOpsReadLast(Double diskOpsReadLast) {
        this.diskOpsReadLast = diskOpsReadLast;
    }

    @JsonProperty("diskOpsReadMax")
    public Double getDiskOpsReadMax() {
        return diskOpsReadMax;
    }

    @JsonProperty("diskOpsReadMax")
    public void setDiskOpsReadMax(Double diskOpsReadMax) {
        this.diskOpsReadMax = diskOpsReadMax;
    }

    @JsonProperty("diskOpsReadMin")
    public Double getDiskOpsReadMin() {
        return diskOpsReadMin;
    }

    @JsonProperty("diskOpsReadMin")
    public void setDiskOpsReadMin(Double diskOpsReadMin) {
        this.diskOpsReadMin = diskOpsReadMin;
    }

    @JsonProperty("diskOpsWriteAvg")
    public Double getDiskOpsWriteAvg() {
        return diskOpsWriteAvg;
    }

    @JsonProperty("diskOpsWriteAvg")
    public void setDiskOpsWriteAvg(Double diskOpsWriteAvg) {
        this.diskOpsWriteAvg = diskOpsWriteAvg;
    }

    @JsonProperty("diskOpsWriteLast")
    public Double getDiskOpsWriteLast() {
        return diskOpsWriteLast;
    }

    @JsonProperty("diskOpsWriteLast")
    public void setDiskOpsWriteLast(Double diskOpsWriteLast) {
        this.diskOpsWriteLast = diskOpsWriteLast;
    }

    @JsonProperty("diskOpsWriteMax")
    public Double getDiskOpsWriteMax() {
        return diskOpsWriteMax;
    }

    @JsonProperty("diskOpsWriteMax")
    public void setDiskOpsWriteMax(Double diskOpsWriteMax) {
        this.diskOpsWriteMax = diskOpsWriteMax;
    }

    @JsonProperty("diskOpsWriteMin")
    public Double getDiskOpsWriteMin() {
        return diskOpsWriteMin;
    }

    @JsonProperty("diskOpsWriteMin")
    public void setDiskOpsWriteMin(Double diskOpsWriteMin) {
        this.diskOpsWriteMin = diskOpsWriteMin;
    }

    @JsonProperty("diskPendingOperationsAvg")
    public Double getDiskPendingOperationsAvg() {
        return diskPendingOperationsAvg;
    }

    @JsonProperty("diskPendingOperationsAvg")
    public void setDiskPendingOperationsAvg(Double diskPendingOperationsAvg) {
        this.diskPendingOperationsAvg = diskPendingOperationsAvg;
    }

    @JsonProperty("diskPendingOperationsLast")
    public Double getDiskPendingOperationsLast() {
        return diskPendingOperationsLast;
    }

    @JsonProperty("diskPendingOperationsLast")
    public void setDiskPendingOperationsLast(Double diskPendingOperationsLast) {
        this.diskPendingOperationsLast = diskPendingOperationsLast;
    }

    @JsonProperty("diskPendingOperationsMax")
    public Double getDiskPendingOperationsMax() {
        return diskPendingOperationsMax;
    }

    @JsonProperty("diskPendingOperationsMax")
    public void setDiskPendingOperationsMax(Double diskPendingOperationsMax) {
        this.diskPendingOperationsMax = diskPendingOperationsMax;
    }

    @JsonProperty("diskPendingOperationsMin")
    public Double getDiskPendingOperationsMin() {
        return diskPendingOperationsMin;
    }

    @JsonProperty("diskPendingOperationsMin")
    public void setDiskPendingOperationsMin(Double diskPendingOperationsMin) {
        this.diskPendingOperationsMin = diskPendingOperationsMin;
    }

    @JsonProperty("diskTimeReadAvg")
    public Double getDiskTimeReadAvg() {
        return diskTimeReadAvg;
    }

    @JsonProperty("diskTimeReadAvg")
    public void setDiskTimeReadAvg(Double diskTimeReadAvg) {
        this.diskTimeReadAvg = diskTimeReadAvg;
    }

    @JsonProperty("diskTimeReadLast")
    public Double getDiskTimeReadLast() {
        return diskTimeReadLast;
    }

    @JsonProperty("diskTimeReadLast")
    public void setDiskTimeReadLast(Double diskTimeReadLast) {
        this.diskTimeReadLast = diskTimeReadLast;
    }

    @JsonProperty("diskTimeReadMax")
    public Double getDiskTimeReadMax() {
        return diskTimeReadMax;
    }

    @JsonProperty("diskTimeReadMax")
    public void setDiskTimeReadMax(Double diskTimeReadMax) {
        this.diskTimeReadMax = diskTimeReadMax;
    }

    @JsonProperty("diskTimeReadMin")
    public Double getDiskTimeReadMin() {
        return diskTimeReadMin;
    }

    @JsonProperty("diskTimeReadMin")
    public void setDiskTimeReadMin(Double diskTimeReadMin) {
        this.diskTimeReadMin = diskTimeReadMin;
    }

    @JsonProperty("diskTimeWriteAvg")
    public Double getDiskTimeWriteAvg() {
        return diskTimeWriteAvg;
    }

    @JsonProperty("diskTimeWriteAvg")
    public void setDiskTimeWriteAvg(Double diskTimeWriteAvg) {
        this.diskTimeWriteAvg = diskTimeWriteAvg;
    }

    @JsonProperty("diskTimeWriteLast")
    public Double getDiskTimeWriteLast() {
        return diskTimeWriteLast;
    }

    @JsonProperty("diskTimeWriteLast")
    public void setDiskTimeWriteLast(Double diskTimeWriteLast) {
        this.diskTimeWriteLast = diskTimeWriteLast;
    }

    @JsonProperty("diskTimeWriteMax")
    public Double getDiskTimeWriteMax() {
        return diskTimeWriteMax;
    }

    @JsonProperty("diskTimeWriteMax")
    public void setDiskTimeWriteMax(Double diskTimeWriteMax) {
        this.diskTimeWriteMax = diskTimeWriteMax;
    }

    @JsonProperty("diskTimeWriteMin")
    public Double getDiskTimeWriteMin() {
        return diskTimeWriteMin;
    }

    @JsonProperty("diskTimeWriteMin")
    public void setDiskTimeWriteMin(Double diskTimeWriteMin) {
        this.diskTimeWriteMin = diskTimeWriteMin;
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
        return new ToStringBuilder(this).append("diskIdentifier", diskIdentifier).append("diskIoTimeAvg", diskIoTimeAvg).append("diskIoTimeLast", diskIoTimeLast).append("diskIoTimeMax", diskIoTimeMax).append("diskIoTimeMin", diskIoTimeMin).append("diskMergedReadAvg", diskMergedReadAvg).append("diskMergedReadLast", diskMergedReadLast).append("diskMergedReadMax", diskMergedReadMax).append("diskMergedReadMin", diskMergedReadMin).append("diskMergedWriteAvg", diskMergedWriteAvg).append("diskMergedWriteLast", diskMergedWriteLast).append("diskMergedWriteMax", diskMergedWriteMax).append("diskMergedWriteMin", diskMergedWriteMin).append("diskOctetsReadAvg", diskOctetsReadAvg).append("diskOctetsReadLast", diskOctetsReadLast).append("diskOctetsReadMax", diskOctetsReadMax).append("diskOctetsReadMin", diskOctetsReadMin).append("diskOctetsWriteAvg", diskOctetsWriteAvg).append("diskOctetsWriteLast", diskOctetsWriteLast).append("diskOctetsWriteMax", diskOctetsWriteMax).append("diskOctetsWriteMin", diskOctetsWriteMin).append("diskOpsReadAvg", diskOpsReadAvg).append("diskOpsReadLast", diskOpsReadLast).append("diskOpsReadMax", diskOpsReadMax).append("diskOpsReadMin", diskOpsReadMin).append("diskOpsWriteAvg", diskOpsWriteAvg).append("diskOpsWriteLast", diskOpsWriteLast).append("diskOpsWriteMax", diskOpsWriteMax).append("diskOpsWriteMin", diskOpsWriteMin).append("diskPendingOperationsAvg", diskPendingOperationsAvg).append("diskPendingOperationsLast", diskPendingOperationsLast).append("diskPendingOperationsMax", diskPendingOperationsMax).append("diskPendingOperationsMin", diskPendingOperationsMin).append("diskTimeReadAvg", diskTimeReadAvg).append("diskTimeReadLast", diskTimeReadLast).append("diskTimeReadMax", diskTimeReadMax).append("diskTimeReadMin", diskTimeReadMin).append("diskTimeWriteAvg", diskTimeWriteAvg).append("diskTimeWriteLast", diskTimeWriteLast).append("diskTimeWriteMax", diskTimeWriteMax).append("diskTimeWriteMin", diskTimeWriteMin).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(diskIoTimeLast).append(diskMergedReadMin).append(diskMergedReadLast).append(diskTimeWriteAvg).append(diskIoTimeAvg).append(diskOpsReadLast).append(diskOctetsWriteAvg).append(diskOctetsReadMin).append(diskTimeWriteLast).append(diskOpsWriteMin).append(diskOpsWriteAvg).append(diskTimeWriteMax).append(diskTimeReadMax).append(diskOctetsWriteMin).append(diskMergedWriteAvg).append(diskTimeWriteMin).append(diskTimeReadAvg).append(diskMergedWriteMax).append(diskMergedReadAvg).append(diskPendingOperationsMax).append(diskIdentifier).append(diskPendingOperationsMin).append(diskTimeReadLast).append(diskOpsReadAvg).append(diskMergedWriteMin).append(diskIoTimeMax).append(diskPendingOperationsAvg).append(diskMergedWriteLast).append(diskMergedReadMax).append(diskIoTimeMin).append(diskTimeReadMin).append(diskPendingOperationsLast).append(diskOpsReadMin).append(diskOctetsReadLast).append(diskOctetsReadAvg).append(diskOpsWriteMax).append(additionalProperties).append(diskOctetsReadMax).append(diskOctetsWriteMax).append(diskOctetsWriteLast).append(diskOpsWriteLast).append(diskOpsReadMax).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiskUsageArray) == false) {
            return false;
        }
        DiskUsageArray rhs = ((DiskUsageArray) other);
        return new EqualsBuilder().append(diskIoTimeLast, rhs.diskIoTimeLast).append(diskMergedReadMin, rhs.diskMergedReadMin).append(diskMergedReadLast, rhs.diskMergedReadLast).append(diskTimeWriteAvg, rhs.diskTimeWriteAvg).append(diskIoTimeAvg, rhs.diskIoTimeAvg).append(diskOpsReadLast, rhs.diskOpsReadLast).append(diskOctetsWriteAvg, rhs.diskOctetsWriteAvg).append(diskOctetsReadMin, rhs.diskOctetsReadMin).append(diskTimeWriteLast, rhs.diskTimeWriteLast).append(diskOpsWriteMin, rhs.diskOpsWriteMin).append(diskOpsWriteAvg, rhs.diskOpsWriteAvg).append(diskTimeWriteMax, rhs.diskTimeWriteMax).append(diskTimeReadMax, rhs.diskTimeReadMax).append(diskOctetsWriteMin, rhs.diskOctetsWriteMin).append(diskMergedWriteAvg, rhs.diskMergedWriteAvg).append(diskTimeWriteMin, rhs.diskTimeWriteMin).append(diskTimeReadAvg, rhs.diskTimeReadAvg).append(diskMergedWriteMax, rhs.diskMergedWriteMax).append(diskMergedReadAvg, rhs.diskMergedReadAvg).append(diskPendingOperationsMax, rhs.diskPendingOperationsMax).append(diskIdentifier, rhs.diskIdentifier).append(diskPendingOperationsMin, rhs.diskPendingOperationsMin).append(diskTimeReadLast, rhs.diskTimeReadLast).append(diskOpsReadAvg, rhs.diskOpsReadAvg).append(diskMergedWriteMin, rhs.diskMergedWriteMin).append(diskIoTimeMax, rhs.diskIoTimeMax).append(diskPendingOperationsAvg, rhs.diskPendingOperationsAvg).append(diskMergedWriteLast, rhs.diskMergedWriteLast).append(diskMergedReadMax, rhs.diskMergedReadMax).append(diskIoTimeMin, rhs.diskIoTimeMin).append(diskTimeReadMin, rhs.diskTimeReadMin).append(diskPendingOperationsLast, rhs.diskPendingOperationsLast).append(diskOpsReadMin, rhs.diskOpsReadMin).append(diskOctetsReadLast, rhs.diskOctetsReadLast).append(diskOctetsReadAvg, rhs.diskOctetsReadAvg).append(diskOpsWriteMax, rhs.diskOpsWriteMax).append(additionalProperties, rhs.additionalProperties).append(diskOctetsReadMax, rhs.diskOctetsReadMax).append(diskOctetsWriteMax, rhs.diskOctetsWriteMax).append(diskOctetsWriteLast, rhs.diskOctetsWriteLast).append(diskOpsWriteLast, rhs.diskOpsWriteLast).append(diskOpsReadMax, rhs.diskOpsReadMax).isEquals();
    }

}
