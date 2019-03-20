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
 * usage of an identified disk
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diskBusResets",
    "diskCommandsAborted",
    "diskCommandsAvg",
    "diskFlushRequests",
    "diskFlushTime",
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
    "diskReadCommandsAvg",
    "diskTime",
    "diskTimeReadAvg",
    "diskTimeReadLast",
    "diskTimeReadMax",
    "diskTimeReadMin",
    "diskTimeWriteAvg",
    "diskTimeWriteLast",
    "diskTimeWriteMax",
    "diskTimeWriteMin",
    "diskTotalReadLatencyAvg",
    "diskTotalWriteLatencyAvg",
    "diskWeightedIoTimeAvg",
    "diskWeightedIoTimeLast",
    "diskWeightedIoTimeMax",
    "diskWeightedIoTimeMin",
    "diskWriteCommandsAvg"
})
public class DiskUsageArray {

    /**
     * number of bus resets over the measurementInterval
     * 
     */
    @JsonProperty("diskBusResets")
    @JsonPropertyDescription("number of bus resets over the measurementInterval")
    private Double diskBusResets;
    /**
     * number of disk commands aborted over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAborted")
    @JsonPropertyDescription("number of disk commands aborted over the measurementInterval")
    private Double diskCommandsAborted;
    /**
     * average number of commands per second over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAvg")
    @JsonPropertyDescription("average number of commands per second over the measurementInterval")
    private Double diskCommandsAvg;
    /**
     * total flush requests of the disk cache over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushRequests")
    @JsonPropertyDescription("total flush requests of the disk cache over the measurementInterval")
    private Double diskFlushRequests;
    /**
     * milliseconds spent on disk cache flushing over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushTime")
    @JsonPropertyDescription("milliseconds spent on disk cache flushing over the measurementInterval")
    private Double diskFlushTime;
    /**
     * disk identifier
     * (Required)
     * 
     */
    @JsonProperty("diskIdentifier")
    @JsonPropertyDescription("disk identifier")
    private String diskIdentifier;
    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the average over the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeAvg")
    @JsonPropertyDescription("milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the average over the measurement interval")
    private Double diskIoTimeAvg;
    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeLast")
    @JsonPropertyDescription("milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the last value measurement within the measurement interval")
    private Double diskIoTimeLast;
    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMax")
    @JsonPropertyDescription("milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the maximum value measurement within the measurement interval")
    private Double diskIoTimeMax;
    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMin")
    @JsonPropertyDescription("milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the minimum value measurement within the measurement interval")
    private Double diskIoTimeMin;
    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadAvg")
    @JsonPropertyDescription("number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the average measurement within the measurement interval")
    private Double diskMergedReadAvg;
    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadLast")
    @JsonPropertyDescription("number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the last value measurement within the measurement interval")
    private Double diskMergedReadLast;
    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMax")
    @JsonPropertyDescription("number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the maximum value measurement within the measurement interval")
    private Double diskMergedReadMax;
    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMin")
    @JsonPropertyDescription("number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the minimum value measurement within the measurement interval")
    private Double diskMergedReadMin;
    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteAvg")
    @JsonPropertyDescription("number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the average measurement within the measurement interval")
    private Double diskMergedWriteAvg;
    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteLast")
    @JsonPropertyDescription("number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the last value measurement within the measurement interval")
    private Double diskMergedWriteLast;
    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMax")
    @JsonPropertyDescription("number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the maximum value measurement within the measurement interval")
    private Double diskMergedWriteMax;
    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMin")
    @JsonPropertyDescription("number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the minimum value measurement within the measurement interval")
    private Double diskMergedWriteMin;
    /**
     * number of octets per second read from a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadAvg")
    @JsonPropertyDescription("number of octets per second read from a disk or partition; provide the average measurement within the measurement interval")
    private Double diskOctetsReadAvg;
    /**
     * number of octets per second read from a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadLast")
    @JsonPropertyDescription("number of octets per second read from a disk or partition; provide the last measurement within the measurement interval")
    private Double diskOctetsReadLast;
    /**
     * number of octets per second read from a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMax")
    @JsonPropertyDescription("number of octets per second read from a disk or partition; provide the maximum measurement within the measurement interval")
    private Double diskOctetsReadMax;
    /**
     * number of octets per second read from a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMin")
    @JsonPropertyDescription("number of octets per second read from a disk or partition; provide the minimum measurement within the measurement interval")
    private Double diskOctetsReadMin;
    /**
     * number of octets per second written to a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteAvg")
    @JsonPropertyDescription("number of octets per second written to a disk or partition; provide the average measurement within the measurement interval")
    private Double diskOctetsWriteAvg;
    /**
     * number of octets per second written to a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteLast")
    @JsonPropertyDescription("number of octets per second written to a disk or partition; provide the last measurement within the measurement interval")
    private Double diskOctetsWriteLast;
    /**
     * number of octets per second written to a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMax")
    @JsonPropertyDescription("number of octets per second written to a disk or partition; provide the maximum measurement within the measurement interval")
    private Double diskOctetsWriteMax;
    /**
     * number of octets per second written to a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMin")
    @JsonPropertyDescription("number of octets per second written to a disk or partition; provide the minimum measurement within the measurement interval")
    private Double diskOctetsWriteMin;
    /**
     * number of read operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadAvg")
    @JsonPropertyDescription("number of read operations per second issued to the disk; provide the average measurement within the measurement interval")
    private Double diskOpsReadAvg;
    /**
     * number of read operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadLast")
    @JsonPropertyDescription("number of read operations per second issued to the disk; provide the last measurement within the measurement interval")
    private Double diskOpsReadLast;
    /**
     * number of read operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMax")
    @JsonPropertyDescription("number of read operations per second issued to the disk; provide the maximum measurement within the measurement interval")
    private Double diskOpsReadMax;
    /**
     * number of read operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMin")
    @JsonPropertyDescription("number of read operations per second issued to the disk; provide the minimum measurement within the measurement interval")
    private Double diskOpsReadMin;
    /**
     * number of write operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteAvg")
    @JsonPropertyDescription("number of write operations per second issued to the disk; provide the average measurement within the measurement interval")
    private Double diskOpsWriteAvg;
    /**
     * number of write operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteLast")
    @JsonPropertyDescription("number of write operations per second issued to the disk; provide the last measurement within the measurement interval")
    private Double diskOpsWriteLast;
    /**
     * number of write operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMax")
    @JsonPropertyDescription("number of write operations per second issued to the disk; provide the maximum measurement within the measurement interval")
    private Double diskOpsWriteMax;
    /**
     * number of write operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMin")
    @JsonPropertyDescription("number of write operations per second issued to the disk; provide the minimum measurement within the measurement interval")
    private Double diskOpsWriteMin;
    /**
     * queue size of pending I/O operations per second; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsAvg")
    @JsonPropertyDescription("queue size of pending I/O operations per second; provide the average measurement within the measurement interval")
    private Double diskPendingOperationsAvg;
    /**
     * queue size of pending I/O operations per second; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsLast")
    @JsonPropertyDescription("queue size of pending I/O operations per second; provide the last measurement within the measurement interval")
    private Double diskPendingOperationsLast;
    /**
     * queue size of pending I/O operations per second; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMax")
    @JsonPropertyDescription("queue size of pending I/O operations per second; provide the maximum measurement within the measurement interval")
    private Double diskPendingOperationsMax;
    /**
     * queue size of pending I/O operations per second; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMin")
    @JsonPropertyDescription("queue size of pending I/O operations per second; provide the minimum measurement within the measurement interval")
    private Double diskPendingOperationsMin;
    /**
     * average number of read commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskReadCommandsAvg")
    @JsonPropertyDescription("average number of read commands issued per second to the disk over the measurementInterval")
    private Double diskReadCommandsAvg;
    /**
     * nanoseconds spent on disk cache reads/writes within the measurement interval
     * 
     */
    @JsonProperty("diskTime")
    @JsonPropertyDescription("nanoseconds spent on disk cache reads/writes within the measurement interval")
    private Double diskTime;
    /**
     * milliseconds a read operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadAvg")
    @JsonPropertyDescription("milliseconds a read operation took to complete; provide the average measurement within the measurement interval")
    private Double diskTimeReadAvg;
    /**
     * milliseconds a read operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadLast")
    @JsonPropertyDescription("milliseconds a read operation took to complete; provide the last measurement within the measurement interval")
    private Double diskTimeReadLast;
    /**
     * milliseconds a read operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMax")
    @JsonPropertyDescription("milliseconds a read operation took to complete; provide the maximum measurement within the measurement interval")
    private Double diskTimeReadMax;
    /**
     * milliseconds a read operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMin")
    @JsonPropertyDescription("milliseconds a read operation took to complete; provide the minimum measurement within the measurement interval")
    private Double diskTimeReadMin;
    /**
     * milliseconds a write operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteAvg")
    @JsonPropertyDescription("milliseconds a write operation took to complete; provide the average measurement within the measurement interval")
    private Double diskTimeWriteAvg;
    /**
     * milliseconds a write operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteLast")
    @JsonPropertyDescription("milliseconds a write operation took to complete; provide the last measurement within the measurement interval")
    private Double diskTimeWriteLast;
    /**
     * milliseconds a write operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMax")
    @JsonPropertyDescription("milliseconds a write operation took to complete; provide the maximum measurement within the measurement interval")
    private Double diskTimeWriteMax;
    /**
     * milliseconds a write operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMin")
    @JsonPropertyDescription("milliseconds a write operation took to complete; provide the minimum measurement within the measurement interval")
    private Double diskTimeWriteMin;
    /**
     * average read time from the perspective of a Guest OS: sum of the Kernel Read Latency and Physical Device Read Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalReadLatencyAvg")
    @JsonPropertyDescription("average read time from the perspective of a Guest OS: sum of the Kernel Read Latency and Physical Device Read Latency in milliseconds over the measurement interval")
    private Double diskTotalReadLatencyAvg;
    /**
     * average write time from the perspective of a Guest OS: sum of the Kernel Write Latency and Physical Device Write Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalWriteLatencyAvg")
    @JsonPropertyDescription("average write time from the perspective of a Guest OS: sum of the Kernel Write Latency and Physical Device Write Latency in milliseconds over the measurement interval")
    private Double diskTotalWriteLatencyAvg;
    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the average within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeAvg")
    @JsonPropertyDescription("measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the average within the collection interval")
    private Double diskWeightedIoTimeAvg;
    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the last within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeLast")
    @JsonPropertyDescription("measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the last within the collection interval")
    private Double diskWeightedIoTimeLast;
    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the maximum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMax")
    @JsonPropertyDescription("measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the maximum within the collection interval")
    private Double diskWeightedIoTimeMax;
    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the minimum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMin")
    @JsonPropertyDescription("measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the minimum within the collection interval")
    private Double diskWeightedIoTimeMin;
    /**
     * average number of write commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskWriteCommandsAvg")
    @JsonPropertyDescription("average number of write commands issued per second to the disk over the measurementInterval")
    private Double diskWriteCommandsAvg;

    /**
     * number of bus resets over the measurementInterval
     * 
     */
    @JsonProperty("diskBusResets")
    public Double getDiskBusResets() {
        return diskBusResets;
    }

    /**
     * number of bus resets over the measurementInterval
     * 
     */
    @JsonProperty("diskBusResets")
    public void setDiskBusResets(Double diskBusResets) {
        this.diskBusResets = diskBusResets;
    }

    /**
     * number of disk commands aborted over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAborted")
    public Double getDiskCommandsAborted() {
        return diskCommandsAborted;
    }

    /**
     * number of disk commands aborted over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAborted")
    public void setDiskCommandsAborted(Double diskCommandsAborted) {
        this.diskCommandsAborted = diskCommandsAborted;
    }

    /**
     * average number of commands per second over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAvg")
    public Double getDiskCommandsAvg() {
        return diskCommandsAvg;
    }

    /**
     * average number of commands per second over the measurementInterval
     * 
     */
    @JsonProperty("diskCommandsAvg")
    public void setDiskCommandsAvg(Double diskCommandsAvg) {
        this.diskCommandsAvg = diskCommandsAvg;
    }

    /**
     * total flush requests of the disk cache over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushRequests")
    public Double getDiskFlushRequests() {
        return diskFlushRequests;
    }

    /**
     * total flush requests of the disk cache over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushRequests")
    public void setDiskFlushRequests(Double diskFlushRequests) {
        this.diskFlushRequests = diskFlushRequests;
    }

    /**
     * milliseconds spent on disk cache flushing over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushTime")
    public Double getDiskFlushTime() {
        return diskFlushTime;
    }

    /**
     * milliseconds spent on disk cache flushing over the measurementInterval
     * 
     */
    @JsonProperty("diskFlushTime")
    public void setDiskFlushTime(Double diskFlushTime) {
        this.diskFlushTime = diskFlushTime;
    }

    /**
     * disk identifier
     * (Required)
     * 
     */
    @JsonProperty("diskIdentifier")
    public String getDiskIdentifier() {
        return diskIdentifier;
    }

    /**
     * disk identifier
     * (Required)
     * 
     */
    @JsonProperty("diskIdentifier")
    public void setDiskIdentifier(String diskIdentifier) {
        this.diskIdentifier = diskIdentifier;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the average over the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeAvg")
    public Double getDiskIoTimeAvg() {
        return diskIoTimeAvg;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the average over the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeAvg")
    public void setDiskIoTimeAvg(Double diskIoTimeAvg) {
        this.diskIoTimeAvg = diskIoTimeAvg;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeLast")
    public Double getDiskIoTimeLast() {
        return diskIoTimeLast;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeLast")
    public void setDiskIoTimeLast(Double diskIoTimeLast) {
        this.diskIoTimeLast = diskIoTimeLast;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMax")
    public Double getDiskIoTimeMax() {
        return diskIoTimeMax;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMax")
    public void setDiskIoTimeMax(Double diskIoTimeMax) {
        this.diskIoTimeMax = diskIoTimeMax;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMin")
    public Double getDiskIoTimeMin() {
        return diskIoTimeMin;
    }

    /**
     * milliseconds spent doing input/output operations over 1 sec; treat this metric as a device load percentage where 1000ms  matches 100% load; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskIoTimeMin")
    public void setDiskIoTimeMin(Double diskIoTimeMin) {
        this.diskIoTimeMin = diskIoTimeMin;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadAvg")
    public Double getDiskMergedReadAvg() {
        return diskMergedReadAvg;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadAvg")
    public void setDiskMergedReadAvg(Double diskMergedReadAvg) {
        this.diskMergedReadAvg = diskMergedReadAvg;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadLast")
    public Double getDiskMergedReadLast() {
        return diskMergedReadLast;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadLast")
    public void setDiskMergedReadLast(Double diskMergedReadLast) {
        this.diskMergedReadLast = diskMergedReadLast;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMax")
    public Double getDiskMergedReadMax() {
        return diskMergedReadMax;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMax")
    public void setDiskMergedReadMax(Double diskMergedReadMax) {
        this.diskMergedReadMax = diskMergedReadMax;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMin")
    public Double getDiskMergedReadMin() {
        return diskMergedReadMin;
    }

    /**
     * number of logical read operations that were merged into physical read operations, e.g., two logical reads were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedReadMin")
    public void setDiskMergedReadMin(Double diskMergedReadMin) {
        this.diskMergedReadMin = diskMergedReadMin;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteAvg")
    public Double getDiskMergedWriteAvg() {
        return diskMergedWriteAvg;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteAvg")
    public void setDiskMergedWriteAvg(Double diskMergedWriteAvg) {
        this.diskMergedWriteAvg = diskMergedWriteAvg;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteLast")
    public Double getDiskMergedWriteLast() {
        return diskMergedWriteLast;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the last value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteLast")
    public void setDiskMergedWriteLast(Double diskMergedWriteLast) {
        this.diskMergedWriteLast = diskMergedWriteLast;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMax")
    public Double getDiskMergedWriteMax() {
        return diskMergedWriteMax;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the maximum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMax")
    public void setDiskMergedWriteMax(Double diskMergedWriteMax) {
        this.diskMergedWriteMax = diskMergedWriteMax;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMin")
    public Double getDiskMergedWriteMin() {
        return diskMergedWriteMin;
    }

    /**
     * number of logical write operations that were merged into physical write operations, e.g., two logical writes were served by one physical disk access; provide the minimum value measurement within the measurement interval
     * 
     */
    @JsonProperty("diskMergedWriteMin")
    public void setDiskMergedWriteMin(Double diskMergedWriteMin) {
        this.diskMergedWriteMin = diskMergedWriteMin;
    }

    /**
     * number of octets per second read from a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadAvg")
    public Double getDiskOctetsReadAvg() {
        return diskOctetsReadAvg;
    }

    /**
     * number of octets per second read from a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadAvg")
    public void setDiskOctetsReadAvg(Double diskOctetsReadAvg) {
        this.diskOctetsReadAvg = diskOctetsReadAvg;
    }

    /**
     * number of octets per second read from a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadLast")
    public Double getDiskOctetsReadLast() {
        return diskOctetsReadLast;
    }

    /**
     * number of octets per second read from a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadLast")
    public void setDiskOctetsReadLast(Double diskOctetsReadLast) {
        this.diskOctetsReadLast = diskOctetsReadLast;
    }

    /**
     * number of octets per second read from a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMax")
    public Double getDiskOctetsReadMax() {
        return diskOctetsReadMax;
    }

    /**
     * number of octets per second read from a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMax")
    public void setDiskOctetsReadMax(Double diskOctetsReadMax) {
        this.diskOctetsReadMax = diskOctetsReadMax;
    }

    /**
     * number of octets per second read from a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMin")
    public Double getDiskOctetsReadMin() {
        return diskOctetsReadMin;
    }

    /**
     * number of octets per second read from a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsReadMin")
    public void setDiskOctetsReadMin(Double diskOctetsReadMin) {
        this.diskOctetsReadMin = diskOctetsReadMin;
    }

    /**
     * number of octets per second written to a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteAvg")
    public Double getDiskOctetsWriteAvg() {
        return diskOctetsWriteAvg;
    }

    /**
     * number of octets per second written to a disk or partition; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteAvg")
    public void setDiskOctetsWriteAvg(Double diskOctetsWriteAvg) {
        this.diskOctetsWriteAvg = diskOctetsWriteAvg;
    }

    /**
     * number of octets per second written to a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteLast")
    public Double getDiskOctetsWriteLast() {
        return diskOctetsWriteLast;
    }

    /**
     * number of octets per second written to a disk or partition; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteLast")
    public void setDiskOctetsWriteLast(Double diskOctetsWriteLast) {
        this.diskOctetsWriteLast = diskOctetsWriteLast;
    }

    /**
     * number of octets per second written to a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMax")
    public Double getDiskOctetsWriteMax() {
        return diskOctetsWriteMax;
    }

    /**
     * number of octets per second written to a disk or partition; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMax")
    public void setDiskOctetsWriteMax(Double diskOctetsWriteMax) {
        this.diskOctetsWriteMax = diskOctetsWriteMax;
    }

    /**
     * number of octets per second written to a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMin")
    public Double getDiskOctetsWriteMin() {
        return diskOctetsWriteMin;
    }

    /**
     * number of octets per second written to a disk or partition; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOctetsWriteMin")
    public void setDiskOctetsWriteMin(Double diskOctetsWriteMin) {
        this.diskOctetsWriteMin = diskOctetsWriteMin;
    }

    /**
     * number of read operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadAvg")
    public Double getDiskOpsReadAvg() {
        return diskOpsReadAvg;
    }

    /**
     * number of read operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadAvg")
    public void setDiskOpsReadAvg(Double diskOpsReadAvg) {
        this.diskOpsReadAvg = diskOpsReadAvg;
    }

    /**
     * number of read operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadLast")
    public Double getDiskOpsReadLast() {
        return diskOpsReadLast;
    }

    /**
     * number of read operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadLast")
    public void setDiskOpsReadLast(Double diskOpsReadLast) {
        this.diskOpsReadLast = diskOpsReadLast;
    }

    /**
     * number of read operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMax")
    public Double getDiskOpsReadMax() {
        return diskOpsReadMax;
    }

    /**
     * number of read operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMax")
    public void setDiskOpsReadMax(Double diskOpsReadMax) {
        this.diskOpsReadMax = diskOpsReadMax;
    }

    /**
     * number of read operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMin")
    public Double getDiskOpsReadMin() {
        return diskOpsReadMin;
    }

    /**
     * number of read operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsReadMin")
    public void setDiskOpsReadMin(Double diskOpsReadMin) {
        this.diskOpsReadMin = diskOpsReadMin;
    }

    /**
     * number of write operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteAvg")
    public Double getDiskOpsWriteAvg() {
        return diskOpsWriteAvg;
    }

    /**
     * number of write operations per second issued to the disk; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteAvg")
    public void setDiskOpsWriteAvg(Double diskOpsWriteAvg) {
        this.diskOpsWriteAvg = diskOpsWriteAvg;
    }

    /**
     * number of write operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteLast")
    public Double getDiskOpsWriteLast() {
        return diskOpsWriteLast;
    }

    /**
     * number of write operations per second issued to the disk; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteLast")
    public void setDiskOpsWriteLast(Double diskOpsWriteLast) {
        this.diskOpsWriteLast = diskOpsWriteLast;
    }

    /**
     * number of write operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMax")
    public Double getDiskOpsWriteMax() {
        return diskOpsWriteMax;
    }

    /**
     * number of write operations per second issued to the disk; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMax")
    public void setDiskOpsWriteMax(Double diskOpsWriteMax) {
        this.diskOpsWriteMax = diskOpsWriteMax;
    }

    /**
     * number of write operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMin")
    public Double getDiskOpsWriteMin() {
        return diskOpsWriteMin;
    }

    /**
     * number of write operations per second issued to the disk; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskOpsWriteMin")
    public void setDiskOpsWriteMin(Double diskOpsWriteMin) {
        this.diskOpsWriteMin = diskOpsWriteMin;
    }

    /**
     * queue size of pending I/O operations per second; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsAvg")
    public Double getDiskPendingOperationsAvg() {
        return diskPendingOperationsAvg;
    }

    /**
     * queue size of pending I/O operations per second; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsAvg")
    public void setDiskPendingOperationsAvg(Double diskPendingOperationsAvg) {
        this.diskPendingOperationsAvg = diskPendingOperationsAvg;
    }

    /**
     * queue size of pending I/O operations per second; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsLast")
    public Double getDiskPendingOperationsLast() {
        return diskPendingOperationsLast;
    }

    /**
     * queue size of pending I/O operations per second; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsLast")
    public void setDiskPendingOperationsLast(Double diskPendingOperationsLast) {
        this.diskPendingOperationsLast = diskPendingOperationsLast;
    }

    /**
     * queue size of pending I/O operations per second; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMax")
    public Double getDiskPendingOperationsMax() {
        return diskPendingOperationsMax;
    }

    /**
     * queue size of pending I/O operations per second; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMax")
    public void setDiskPendingOperationsMax(Double diskPendingOperationsMax) {
        this.diskPendingOperationsMax = diskPendingOperationsMax;
    }

    /**
     * queue size of pending I/O operations per second; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMin")
    public Double getDiskPendingOperationsMin() {
        return diskPendingOperationsMin;
    }

    /**
     * queue size of pending I/O operations per second; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskPendingOperationsMin")
    public void setDiskPendingOperationsMin(Double diskPendingOperationsMin) {
        this.diskPendingOperationsMin = diskPendingOperationsMin;
    }

    /**
     * average number of read commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskReadCommandsAvg")
    public Double getDiskReadCommandsAvg() {
        return diskReadCommandsAvg;
    }

    /**
     * average number of read commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskReadCommandsAvg")
    public void setDiskReadCommandsAvg(Double diskReadCommandsAvg) {
        this.diskReadCommandsAvg = diskReadCommandsAvg;
    }

    /**
     * nanoseconds spent on disk cache reads/writes within the measurement interval
     * 
     */
    @JsonProperty("diskTime")
    public Double getDiskTime() {
        return diskTime;
    }

    /**
     * nanoseconds spent on disk cache reads/writes within the measurement interval
     * 
     */
    @JsonProperty("diskTime")
    public void setDiskTime(Double diskTime) {
        this.diskTime = diskTime;
    }

    /**
     * milliseconds a read operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadAvg")
    public Double getDiskTimeReadAvg() {
        return diskTimeReadAvg;
    }

    /**
     * milliseconds a read operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadAvg")
    public void setDiskTimeReadAvg(Double diskTimeReadAvg) {
        this.diskTimeReadAvg = diskTimeReadAvg;
    }

    /**
     * milliseconds a read operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadLast")
    public Double getDiskTimeReadLast() {
        return diskTimeReadLast;
    }

    /**
     * milliseconds a read operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadLast")
    public void setDiskTimeReadLast(Double diskTimeReadLast) {
        this.diskTimeReadLast = diskTimeReadLast;
    }

    /**
     * milliseconds a read operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMax")
    public Double getDiskTimeReadMax() {
        return diskTimeReadMax;
    }

    /**
     * milliseconds a read operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMax")
    public void setDiskTimeReadMax(Double diskTimeReadMax) {
        this.diskTimeReadMax = diskTimeReadMax;
    }

    /**
     * milliseconds a read operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMin")
    public Double getDiskTimeReadMin() {
        return diskTimeReadMin;
    }

    /**
     * milliseconds a read operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeReadMin")
    public void setDiskTimeReadMin(Double diskTimeReadMin) {
        this.diskTimeReadMin = diskTimeReadMin;
    }

    /**
     * milliseconds a write operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteAvg")
    public Double getDiskTimeWriteAvg() {
        return diskTimeWriteAvg;
    }

    /**
     * milliseconds a write operation took to complete; provide the average measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteAvg")
    public void setDiskTimeWriteAvg(Double diskTimeWriteAvg) {
        this.diskTimeWriteAvg = diskTimeWriteAvg;
    }

    /**
     * milliseconds a write operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteLast")
    public Double getDiskTimeWriteLast() {
        return diskTimeWriteLast;
    }

    /**
     * milliseconds a write operation took to complete; provide the last measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteLast")
    public void setDiskTimeWriteLast(Double diskTimeWriteLast) {
        this.diskTimeWriteLast = diskTimeWriteLast;
    }

    /**
     * milliseconds a write operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMax")
    public Double getDiskTimeWriteMax() {
        return diskTimeWriteMax;
    }

    /**
     * milliseconds a write operation took to complete; provide the maximum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMax")
    public void setDiskTimeWriteMax(Double diskTimeWriteMax) {
        this.diskTimeWriteMax = diskTimeWriteMax;
    }

    /**
     * milliseconds a write operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMin")
    public Double getDiskTimeWriteMin() {
        return diskTimeWriteMin;
    }

    /**
     * milliseconds a write operation took to complete; provide the minimum measurement within the measurement interval
     * 
     */
    @JsonProperty("diskTimeWriteMin")
    public void setDiskTimeWriteMin(Double diskTimeWriteMin) {
        this.diskTimeWriteMin = diskTimeWriteMin;
    }

    /**
     * average read time from the perspective of a Guest OS: sum of the Kernel Read Latency and Physical Device Read Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalReadLatencyAvg")
    public Double getDiskTotalReadLatencyAvg() {
        return diskTotalReadLatencyAvg;
    }

    /**
     * average read time from the perspective of a Guest OS: sum of the Kernel Read Latency and Physical Device Read Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalReadLatencyAvg")
    public void setDiskTotalReadLatencyAvg(Double diskTotalReadLatencyAvg) {
        this.diskTotalReadLatencyAvg = diskTotalReadLatencyAvg;
    }

    /**
     * average write time from the perspective of a Guest OS: sum of the Kernel Write Latency and Physical Device Write Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalWriteLatencyAvg")
    public Double getDiskTotalWriteLatencyAvg() {
        return diskTotalWriteLatencyAvg;
    }

    /**
     * average write time from the perspective of a Guest OS: sum of the Kernel Write Latency and Physical Device Write Latency in milliseconds over the measurement interval
     * 
     */
    @JsonProperty("diskTotalWriteLatencyAvg")
    public void setDiskTotalWriteLatencyAvg(Double diskTotalWriteLatencyAvg) {
        this.diskTotalWriteLatencyAvg = diskTotalWriteLatencyAvg;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the average within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeAvg")
    public Double getDiskWeightedIoTimeAvg() {
        return diskWeightedIoTimeAvg;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the average within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeAvg")
    public void setDiskWeightedIoTimeAvg(Double diskWeightedIoTimeAvg) {
        this.diskWeightedIoTimeAvg = diskWeightedIoTimeAvg;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the last within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeLast")
    public Double getDiskWeightedIoTimeLast() {
        return diskWeightedIoTimeLast;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the last within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeLast")
    public void setDiskWeightedIoTimeLast(Double diskWeightedIoTimeLast) {
        this.diskWeightedIoTimeLast = diskWeightedIoTimeLast;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the maximum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMax")
    public Double getDiskWeightedIoTimeMax() {
        return diskWeightedIoTimeMax;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the maximum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMax")
    public void setDiskWeightedIoTimeMax(Double diskWeightedIoTimeMax) {
        this.diskWeightedIoTimeMax = diskWeightedIoTimeMax;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the minimum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMin")
    public Double getDiskWeightedIoTimeMin() {
        return diskWeightedIoTimeMin;
    }

    /**
     * measure in ms over 1 sec of both I/O completion time and the backlog that may be accumulating; value is the minimum within the collection interval
     * 
     */
    @JsonProperty("diskWeightedIoTimeMin")
    public void setDiskWeightedIoTimeMin(Double diskWeightedIoTimeMin) {
        this.diskWeightedIoTimeMin = diskWeightedIoTimeMin;
    }

    /**
     * average number of write commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskWriteCommandsAvg")
    public Double getDiskWriteCommandsAvg() {
        return diskWriteCommandsAvg;
    }

    /**
     * average number of write commands issued per second to the disk over the measurementInterval
     * 
     */
    @JsonProperty("diskWriteCommandsAvg")
    public void setDiskWriteCommandsAvg(Double diskWriteCommandsAvg) {
        this.diskWriteCommandsAvg = diskWriteCommandsAvg;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(diskBusResets).append(diskCommandsAborted).append(diskCommandsAvg).append(diskFlushRequests).append(diskFlushTime).append(diskIdentifier).append(diskIoTimeAvg).append(diskIoTimeLast).append(diskIoTimeMax).append(diskIoTimeMin).append(diskMergedReadAvg).append(diskMergedReadLast).append(diskMergedReadMax).append(diskMergedReadMin).append(diskMergedWriteAvg).append(diskMergedWriteLast).append(diskMergedWriteMax).append(diskMergedWriteMin).append(diskOctetsReadAvg).append(diskOctetsReadLast).append(diskOctetsReadMax).append(diskOctetsReadMin).append(diskOctetsWriteAvg).append(diskOctetsWriteLast).append(diskOctetsWriteMax).append(diskOctetsWriteMin).append(diskOpsReadAvg).append(diskOpsReadLast).append(diskOpsReadMax).append(diskOpsReadMin).append(diskOpsWriteAvg).append(diskOpsWriteLast).append(diskOpsWriteMax).append(diskOpsWriteMin).append(diskPendingOperationsAvg).append(diskPendingOperationsLast).append(diskPendingOperationsMax).append(diskPendingOperationsMin).append(diskReadCommandsAvg).append(diskTime).append(diskTimeReadAvg).append(diskTimeReadLast).append(diskTimeReadMax).append(diskTimeReadMin).append(diskTimeWriteAvg).append(diskTimeWriteLast).append(diskTimeWriteMax).append(diskTimeWriteMin).append(diskTotalReadLatencyAvg).append(diskTotalWriteLatencyAvg).append(diskWeightedIoTimeAvg).append(diskWeightedIoTimeLast).append(diskWeightedIoTimeMax).append(diskWeightedIoTimeMin).append(diskWriteCommandsAvg).toHashCode();
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
        return new EqualsBuilder().append(diskBusResets, rhs.diskBusResets).append(diskCommandsAborted, rhs.diskCommandsAborted).append(diskCommandsAvg, rhs.diskCommandsAvg).append(diskFlushRequests, rhs.diskFlushRequests).append(diskFlushTime, rhs.diskFlushTime).append(diskIdentifier, rhs.diskIdentifier).append(diskIoTimeAvg, rhs.diskIoTimeAvg).append(diskIoTimeLast, rhs.diskIoTimeLast).append(diskIoTimeMax, rhs.diskIoTimeMax).append(diskIoTimeMin, rhs.diskIoTimeMin).append(diskMergedReadAvg, rhs.diskMergedReadAvg).append(diskMergedReadLast, rhs.diskMergedReadLast).append(diskMergedReadMax, rhs.diskMergedReadMax).append(diskMergedReadMin, rhs.diskMergedReadMin).append(diskMergedWriteAvg, rhs.diskMergedWriteAvg).append(diskMergedWriteLast, rhs.diskMergedWriteLast).append(diskMergedWriteMax, rhs.diskMergedWriteMax).append(diskMergedWriteMin, rhs.diskMergedWriteMin).append(diskOctetsReadAvg, rhs.diskOctetsReadAvg).append(diskOctetsReadLast, rhs.diskOctetsReadLast).append(diskOctetsReadMax, rhs.diskOctetsReadMax).append(diskOctetsReadMin, rhs.diskOctetsReadMin).append(diskOctetsWriteAvg, rhs.diskOctetsWriteAvg).append(diskOctetsWriteLast, rhs.diskOctetsWriteLast).append(diskOctetsWriteMax, rhs.diskOctetsWriteMax).append(diskOctetsWriteMin, rhs.diskOctetsWriteMin).append(diskOpsReadAvg, rhs.diskOpsReadAvg).append(diskOpsReadLast, rhs.diskOpsReadLast).append(diskOpsReadMax, rhs.diskOpsReadMax).append(diskOpsReadMin, rhs.diskOpsReadMin).append(diskOpsWriteAvg, rhs.diskOpsWriteAvg).append(diskOpsWriteLast, rhs.diskOpsWriteLast).append(diskOpsWriteMax, rhs.diskOpsWriteMax).append(diskOpsWriteMin, rhs.diskOpsWriteMin).append(diskPendingOperationsAvg, rhs.diskPendingOperationsAvg).append(diskPendingOperationsLast, rhs.diskPendingOperationsLast).append(diskPendingOperationsMax, rhs.diskPendingOperationsMax).append(diskPendingOperationsMin, rhs.diskPendingOperationsMin).append(diskReadCommandsAvg, rhs.diskReadCommandsAvg).append(diskTime, rhs.diskTime).append(diskTimeReadAvg, rhs.diskTimeReadAvg).append(diskTimeReadLast, rhs.diskTimeReadLast).append(diskTimeReadMax, rhs.diskTimeReadMax).append(diskTimeReadMin, rhs.diskTimeReadMin).append(diskTimeWriteAvg, rhs.diskTimeWriteAvg).append(diskTimeWriteLast, rhs.diskTimeWriteLast).append(diskTimeWriteMax, rhs.diskTimeWriteMax).append(diskTimeWriteMin, rhs.diskTimeWriteMin).append(diskTotalReadLatencyAvg, rhs.diskTotalReadLatencyAvg).append(diskTotalWriteLatencyAvg, rhs.diskTotalWriteLatencyAvg).append(diskWeightedIoTimeAvg, rhs.diskWeightedIoTimeAvg).append(diskWeightedIoTimeLast, rhs.diskWeightedIoTimeLast).append(diskWeightedIoTimeMax, rhs.diskWeightedIoTimeMax).append(diskWeightedIoTimeMin, rhs.diskWeightedIoTimeMin).append(diskWriteCommandsAvg, rhs.diskWriteCommandsAvg).isEquals();
    }

}
