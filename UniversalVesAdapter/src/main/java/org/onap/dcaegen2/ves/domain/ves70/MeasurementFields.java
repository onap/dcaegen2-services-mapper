/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2019 TechMahindra
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * measurement fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalFields",
    "additionalMeasurements",
    "additionalObjects",
    "codecUsageArray",
    "concurrentSessions",
    "configuredEntities",
    "cpuUsageArray",
    "diskUsageArray",
    "featureUsageArray",
    "filesystemUsageArray",
    "hugePagesArray",
    "ipmi",
    "latencyDistribution",
    "loadArray",
    "machineCheckExceptionArray",
    "meanRequestLatency",
    "measurementInterval",
    "measurementFieldsVersion",
    "memoryUsageArray",
    "numberOfMediaPortsInUse",
    "requestRate",
    "nfcScalingMetric",
    "nicPerformanceArray",
    "processStatsArray"
})
public class MeasurementFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalFields;
    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("additionalMeasurements")
    @JsonPropertyDescription("array of named hashMaps")
    private List<AdditionalMeasurement> additionalMeasurements = new ArrayList<AdditionalMeasurement>();
    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("additionalObjects")
    @JsonPropertyDescription("array of json objects described by name, schema and other meta-information")
    private List<AdditionalObject> additionalObjects = new ArrayList<AdditionalObject>();
    /**
     * array of codecs in use
     * 
     */
    @JsonProperty("codecUsageArray")
    @JsonPropertyDescription("array of codecs in use")
    private List<CodecUsageArray> codecUsageArray = new ArrayList<CodecUsageArray>();
    /**
     * peak concurrent sessions for the VM or xNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    @JsonPropertyDescription("peak concurrent sessions for the VM or xNF over the measurementInterval")
    private Integer concurrentSessions;
    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies, etc., for the VM, or subscribers, devices, etc., for the xNF
     * 
     */
    @JsonProperty("configuredEntities")
    @JsonPropertyDescription("over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies, etc., for the VM, or subscribers, devices, etc., for the xNF")
    private Integer configuredEntities;
    /**
     * usage of an array of CPUs
     * 
     */
    @JsonProperty("cpuUsageArray")
    @JsonPropertyDescription("usage of an array of CPUs")
    private List<CpuUsageArray> cpuUsageArray = new ArrayList<CpuUsageArray>();
    /**
     * usage of an array of disks
     * 
     */
    @JsonProperty("diskUsageArray")
    @JsonPropertyDescription("usage of an array of disks")
    private List<DiskUsageArray> diskUsageArray = new ArrayList<DiskUsageArray>();
    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("featureUsageArray")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation featureUsageArray;
    /**
     * filesystem usage of the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    @JsonPropertyDescription("filesystem usage of the VM on which the xNFC reporting the event is running")
    private List<FilesystemUsageArray> filesystemUsageArray = new ArrayList<FilesystemUsageArray>();
    /**
     * array of metrics on hugepPages
     * 
     */
    @JsonProperty("hugePagesArray")
    @JsonPropertyDescription("array of metrics on hugepPages")
    private List<HugePagesArray> hugePagesArray = new ArrayList<HugePagesArray>();
    /**
     * intelligent platform management interface metrics
     * 
     */
    @JsonProperty("ipmi")
    @JsonPropertyDescription("intelligent platform management interface metrics")
    private Ipmi ipmi;
    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within per-xNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    @JsonPropertyDescription("array of integers representing counts of requests whose latency in milliseconds falls within per-xNF configured ranges")
    private List<LatencyDistribution> latencyDistribution = new ArrayList<LatencyDistribution>();
    /**
     * array of system load metrics
     * 
     */
    @JsonProperty("loadArray")
    @JsonPropertyDescription("array of system load metrics")
    private List<LoadArray> loadArray = new ArrayList<LoadArray>();
    /**
     * array of machine check exceptions
     * 
     */
    @JsonProperty("machineCheckExceptionArray")
    @JsonPropertyDescription("array of machine check exceptions")
    private List<MachineCheckExceptionArray> machineCheckExceptionArray = new ArrayList<MachineCheckExceptionArray>();
    /**
     * mean seconds required to respond to each request for the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    @JsonPropertyDescription("mean seconds required to respond to each request for the VM on which the xNFC reporting the event is running")
    private Double meanRequestLatency;
    /**
     * interval over which measurements are being reported in seconds
     * (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    @JsonPropertyDescription("interval over which measurements are being reported in seconds")
    private Double measurementInterval;
    /**
     * version of the measurementFields block
     * (Required)
     * 
     */
    @JsonProperty("measurementFieldsVersion")
    @JsonPropertyDescription("version of the measurementFields block")
    private MeasurementFields.MeasurementFieldsVersion measurementFieldsVersion;
    /**
     * memory usage of an array of VMs
     * 
     */
    @JsonProperty("memoryUsageArray")
    @JsonPropertyDescription("memory usage of an array of VMs")
    private List<MemoryUsageArray> memoryUsageArray = new ArrayList<MemoryUsageArray>();
    /**
     * number of media ports in use
     * 
     */
    @JsonProperty("numberOfMediaPortsInUse")
    @JsonPropertyDescription("number of media ports in use")
    private Integer numberOfMediaPortsInUse;
    /**
     * peak rate of service requests per second to the xNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    @JsonPropertyDescription("peak rate of service requests per second to the xNF over the measurementInterval")
    private Double requestRate;
    /**
     * represents busy-ness of the network function from 0 to 100 as reported by the xNFC
     * 
     */
    @JsonProperty("nfcScalingMetric")
    @JsonPropertyDescription("represents busy-ness of the network function from 0 to 100 as reported by the xNFC")
    private Integer nfcScalingMetric;
    /**
     * usage of an array of network interface cards
     * 
     */
    @JsonProperty("nicPerformanceArray")
    @JsonPropertyDescription("usage of an array of network interface cards")
    private List<NicPerformanceArray> nicPerformanceArray = new ArrayList<NicPerformanceArray>();
    /**
     * array of metrics on system processes
     * 
     */
    @JsonProperty("processStatsArray")
    @JsonPropertyDescription("array of metrics on system processes")
    private List<ProcessStatsArray> processStatsArray = new ArrayList<ProcessStatsArray>();

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public AlarmAdditionalInformation getAdditionalFields() {
        return additionalFields;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(AlarmAdditionalInformation additionalFields) {
        this.additionalFields = additionalFields;
    }

    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("additionalMeasurements")
    public List<AdditionalMeasurement> getAdditionalMeasurements() {
        return additionalMeasurements;
    }

    /**
     * array of named hashMaps
     * 
     */
    @JsonProperty("additionalMeasurements")
    public void setAdditionalMeasurements(List<AdditionalMeasurement> additionalMeasurements) {
        this.additionalMeasurements = additionalMeasurements;
    }

    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("additionalObjects")
    public List<AdditionalObject> getAdditionalObjects() {
        return additionalObjects;
    }

    /**
     * array of json objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("additionalObjects")
    public void setAdditionalObjects(List<AdditionalObject> additionalObjects) {
        this.additionalObjects = additionalObjects;
    }

    /**
     * array of codecs in use
     * 
     */
    @JsonProperty("codecUsageArray")
    public List<CodecUsageArray> getCodecUsageArray() {
        return codecUsageArray;
    }

    /**
     * array of codecs in use
     * 
     */
    @JsonProperty("codecUsageArray")
    public void setCodecUsageArray(List<CodecUsageArray> codecUsageArray) {
        this.codecUsageArray = codecUsageArray;
    }

    /**
     * peak concurrent sessions for the VM or xNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    public Integer getConcurrentSessions() {
        return concurrentSessions;
    }

    /**
     * peak concurrent sessions for the VM or xNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    public void setConcurrentSessions(Integer concurrentSessions) {
        this.concurrentSessions = concurrentSessions;
    }

    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies, etc., for the VM, or subscribers, devices, etc., for the xNF
     * 
     */
    @JsonProperty("configuredEntities")
    public Integer getConfiguredEntities() {
        return configuredEntities;
    }

    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies, etc., for the VM, or subscribers, devices, etc., for the xNF
     * 
     */
    @JsonProperty("configuredEntities")
    public void setConfiguredEntities(Integer configuredEntities) {
        this.configuredEntities = configuredEntities;
    }

    /**
     * usage of an array of CPUs
     * 
     */
    @JsonProperty("cpuUsageArray")
    public List<CpuUsageArray> getCpuUsageArray() {
        return cpuUsageArray;
    }

    /**
     * usage of an array of CPUs
     * 
     */
    @JsonProperty("cpuUsageArray")
    public void setCpuUsageArray(List<CpuUsageArray> cpuUsageArray) {
        this.cpuUsageArray = cpuUsageArray;
    }

    /**
     * usage of an array of disks
     * 
     */
    @JsonProperty("diskUsageArray")
    public List<DiskUsageArray> getDiskUsageArray() {
        return diskUsageArray;
    }

    /**
     * usage of an array of disks
     * 
     */
    @JsonProperty("diskUsageArray")
    public void setDiskUsageArray(List<DiskUsageArray> diskUsageArray) {
        this.diskUsageArray = diskUsageArray;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("featureUsageArray")
    public AlarmAdditionalInformation getFeatureUsageArray() {
        return featureUsageArray;
    }

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("featureUsageArray")
    public void setFeatureUsageArray(AlarmAdditionalInformation featureUsageArray) {
        this.featureUsageArray = featureUsageArray;
    }

    /**
     * filesystem usage of the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    public List<FilesystemUsageArray> getFilesystemUsageArray() {
        return filesystemUsageArray;
    }

    /**
     * filesystem usage of the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    public void setFilesystemUsageArray(List<FilesystemUsageArray> filesystemUsageArray) {
        this.filesystemUsageArray = filesystemUsageArray;
    }

    /**
     * array of metrics on hugepPages
     * 
     */
    @JsonProperty("hugePagesArray")
    public List<HugePagesArray> getHugePagesArray() {
        return hugePagesArray;
    }

    /**
     * array of metrics on hugepPages
     * 
     */
    @JsonProperty("hugePagesArray")
    public void setHugePagesArray(List<HugePagesArray> hugePagesArray) {
        this.hugePagesArray = hugePagesArray;
    }

    /**
     * intelligent platform management interface metrics
     * 
     */
    @JsonProperty("ipmi")
    public Ipmi getIpmi() {
        return ipmi;
    }

    /**
     * intelligent platform management interface metrics
     * 
     */
    @JsonProperty("ipmi")
    public void setIpmi(Ipmi ipmi) {
        this.ipmi = ipmi;
    }

    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within per-xNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    public List<LatencyDistribution> getLatencyDistribution() {
        return latencyDistribution;
    }

    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within per-xNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    public void setLatencyDistribution(List<LatencyDistribution> latencyDistribution) {
        this.latencyDistribution = latencyDistribution;
    }

    /**
     * array of system load metrics
     * 
     */
    @JsonProperty("loadArray")
    public List<LoadArray> getLoadArray() {
        return loadArray;
    }

    /**
     * array of system load metrics
     * 
     */
    @JsonProperty("loadArray")
    public void setLoadArray(List<LoadArray> loadArray) {
        this.loadArray = loadArray;
    }

    /**
     * array of machine check exceptions
     * 
     */
    @JsonProperty("machineCheckExceptionArray")
    public List<MachineCheckExceptionArray> getMachineCheckExceptionArray() {
        return machineCheckExceptionArray;
    }

    /**
     * array of machine check exceptions
     * 
     */
    @JsonProperty("machineCheckExceptionArray")
    public void setMachineCheckExceptionArray(List<MachineCheckExceptionArray> machineCheckExceptionArray) {
        this.machineCheckExceptionArray = machineCheckExceptionArray;
    }

    /**
     * mean seconds required to respond to each request for the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    public Double getMeanRequestLatency() {
        return meanRequestLatency;
    }

    /**
     * mean seconds required to respond to each request for the VM on which the xNFC reporting the event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    public void setMeanRequestLatency(Double meanRequestLatency) {
        this.meanRequestLatency = meanRequestLatency;
    }

    /**
     * interval over which measurements are being reported in seconds
     * (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    public Double getMeasurementInterval() {
        return measurementInterval;
    }

    /**
     * interval over which measurements are being reported in seconds
     * (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    public void setMeasurementInterval(Double measurementInterval) {
        this.measurementInterval = measurementInterval;
    }

    /**
     * version of the measurementFields block
     * (Required)
     * 
     */
    @JsonProperty("measurementFieldsVersion")
    public MeasurementFields.MeasurementFieldsVersion getMeasurementFieldsVersion() {
        return measurementFieldsVersion;
    }

    /**
     * version of the measurementFields block
     * (Required)
     * 
     */
    @JsonProperty("measurementFieldsVersion")
    public void setMeasurementFieldsVersion(MeasurementFields.MeasurementFieldsVersion measurementFieldsVersion) {
        this.measurementFieldsVersion = measurementFieldsVersion;
    }

    /**
     * memory usage of an array of VMs
     * 
     */
    @JsonProperty("memoryUsageArray")
    public List<MemoryUsageArray> getMemoryUsageArray() {
        return memoryUsageArray;
    }

    /**
     * memory usage of an array of VMs
     * 
     */
    @JsonProperty("memoryUsageArray")
    public void setMemoryUsageArray(List<MemoryUsageArray> memoryUsageArray) {
        this.memoryUsageArray = memoryUsageArray;
    }

    /**
     * number of media ports in use
     * 
     */
    @JsonProperty("numberOfMediaPortsInUse")
    public Integer getNumberOfMediaPortsInUse() {
        return numberOfMediaPortsInUse;
    }

    /**
     * number of media ports in use
     * 
     */
    @JsonProperty("numberOfMediaPortsInUse")
    public void setNumberOfMediaPortsInUse(Integer numberOfMediaPortsInUse) {
        this.numberOfMediaPortsInUse = numberOfMediaPortsInUse;
    }

    /**
     * peak rate of service requests per second to the xNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    public Double getRequestRate() {
        return requestRate;
    }

    /**
     * peak rate of service requests per second to the xNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    public void setRequestRate(Double requestRate) {
        this.requestRate = requestRate;
    }

    /**
     * represents busy-ness of the network function from 0 to 100 as reported by the xNFC
     * 
     */
    @JsonProperty("nfcScalingMetric")
    public Integer getNfcScalingMetric() {
        return nfcScalingMetric;
    }

    /**
     * represents busy-ness of the network function from 0 to 100 as reported by the xNFC
     * 
     */
    @JsonProperty("nfcScalingMetric")
    public void setNfcScalingMetric(Integer nfcScalingMetric) {
        this.nfcScalingMetric = nfcScalingMetric;
    }

    /**
     * usage of an array of network interface cards
     * 
     */
    @JsonProperty("nicPerformanceArray")
    public List<NicPerformanceArray> getNicPerformanceArray() {
        return nicPerformanceArray;
    }

    /**
     * usage of an array of network interface cards
     * 
     */
    @JsonProperty("nicPerformanceArray")
    public void setNicPerformanceArray(List<NicPerformanceArray> nicPerformanceArray) {
        this.nicPerformanceArray = nicPerformanceArray;
    }

    /**
     * array of metrics on system processes
     * 
     */
    @JsonProperty("processStatsArray")
    public List<ProcessStatsArray> getProcessStatsArray() {
        return processStatsArray;
    }

    /**
     * array of metrics on system processes
     * 
     */
    @JsonProperty("processStatsArray")
    public void setProcessStatsArray(List<ProcessStatsArray> processStatsArray) {
        this.processStatsArray = processStatsArray;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(additionalMeasurements).append(additionalObjects).append(codecUsageArray).append(concurrentSessions).append(configuredEntities).append(cpuUsageArray).append(diskUsageArray).append(featureUsageArray).append(filesystemUsageArray).append(hugePagesArray).append(ipmi).append(latencyDistribution).append(loadArray).append(machineCheckExceptionArray).append(meanRequestLatency).append(measurementInterval).append(measurementFieldsVersion).append(memoryUsageArray).append(numberOfMediaPortsInUse).append(requestRate).append(nfcScalingMetric).append(nicPerformanceArray).append(processStatsArray).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeasurementFields) == false) {
            return false;
        }
        MeasurementFields rhs = ((MeasurementFields) other);
        return new EqualsBuilder().append(additionalFields, rhs.additionalFields).append(additionalMeasurements, rhs.additionalMeasurements).append(additionalObjects, rhs.additionalObjects).append(codecUsageArray, rhs.codecUsageArray).append(concurrentSessions, rhs.concurrentSessions).append(configuredEntities, rhs.configuredEntities).append(cpuUsageArray, rhs.cpuUsageArray).append(diskUsageArray, rhs.diskUsageArray).append(featureUsageArray, rhs.featureUsageArray).append(filesystemUsageArray, rhs.filesystemUsageArray).append(hugePagesArray, rhs.hugePagesArray).append(ipmi, rhs.ipmi).append(latencyDistribution, rhs.latencyDistribution).append(loadArray, rhs.loadArray).append(machineCheckExceptionArray, rhs.machineCheckExceptionArray).append(meanRequestLatency, rhs.meanRequestLatency).append(measurementInterval, rhs.measurementInterval).append(measurementFieldsVersion, rhs.measurementFieldsVersion).append(memoryUsageArray, rhs.memoryUsageArray).append(numberOfMediaPortsInUse, rhs.numberOfMediaPortsInUse).append(requestRate, rhs.requestRate).append(nfcScalingMetric, rhs.nfcScalingMetric).append(nicPerformanceArray, rhs.nicPerformanceArray).append(processStatsArray, rhs.processStatsArray).isEquals();
    }

    public enum MeasurementFieldsVersion {

        _4_0("4.0");
        private final String value;
        private final static Map<String, MeasurementFields.MeasurementFieldsVersion> CONSTANTS = new HashMap<String, MeasurementFields.MeasurementFieldsVersion>();

        static {
            for (MeasurementFields.MeasurementFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MeasurementFieldsVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MeasurementFields.MeasurementFieldsVersion fromValue(String value) {
            MeasurementFields.MeasurementFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
