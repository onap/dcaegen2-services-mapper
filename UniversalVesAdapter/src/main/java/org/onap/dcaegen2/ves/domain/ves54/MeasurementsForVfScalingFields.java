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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * measurementsForVfScaling fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"additionalFields", "additionalMeasurements", "additionalObjects",
        "codecUsageArray", "concurrentSessions", "configuredEntities", "cpuUsageArray",
        "diskUsageArray", "featureUsageArray", "filesystemUsageArray", "latencyDistribution",
        "meanRequestLatency", "measurementInterval", "measurementsForVfScalingVersion",
        "memoryUsageArray", "numberOfMediaPortsInUse", "requestRate", "vnfcScalingMetric",
        "vNicPerformanceArray"})
public class MeasurementsForVfScalingFields {
    
    /**
     * additional name-value-pair fields
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("additional name-value-pair fields")
    private List<AlarmAdditionalInformation> additionalFields =
            new ArrayList<AlarmAdditionalInformation>();
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("additionalMeasurements")
    @JsonPropertyDescription("array of named name-value-pair arrays")
    private List<AdditionalMeasurement> additionalMeasurements =
            new ArrayList<AdditionalMeasurement>();
    /**
     * array of JSON objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("additionalObjects")
    @JsonPropertyDescription("array of JSON objects described by name, schema and other meta-information")
    private List<AdditionalObject> additionalObjects = new ArrayList<AdditionalObject>();
    /**
     * array of codecs in use
     * 
     */
    @JsonProperty("codecUsageArray")
    @JsonPropertyDescription("array of codecs in use")
    private List<CodecUsageArray> codecUsageArray = new ArrayList<CodecUsageArray>();
    /**
     * peak concurrent sessions for the VM or VNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    @JsonPropertyDescription("peak concurrent sessions for the VM or VNF over the measurementInterval")
    private Integer concurrentSessions;
    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies,
     * etc., for the VM, or subscribers, devices, etc., for the VNF
     * 
     */
    @JsonProperty("configuredEntities")
    @JsonPropertyDescription("over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies, etc., for the VM, or subscribers, devices, etc., for the VNF")
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
     * array of features in use
     * 
     */
    @JsonProperty("featureUsageArray")
    @JsonPropertyDescription("array of features in use")
    private List<FeatureUsageArray> featureUsageArray = new ArrayList<FeatureUsageArray>();
    /**
     * filesystem usage of the VM on which the VNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    @JsonPropertyDescription("filesystem usage of the VM on which the VNFC reporting the event is running")
    private List<FilesystemUsageArray> filesystemUsageArray = new ArrayList<FilesystemUsageArray>();
    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within
     * per-VNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    @JsonPropertyDescription("array of integers representing counts of requests whose latency in milliseconds falls within per-VNF configured ranges")
    private List<LatencyDistribution> latencyDistribution = new ArrayList<LatencyDistribution>();
    /**
     * mean seconds required to respond to each request for the VM on which the VNFC reporting the
     * event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    @JsonPropertyDescription("mean seconds required to respond to each request for the VM on which the VNFC reporting the event is running")
    private Double meanRequestLatency;
    /**
     * interval over which measurements are being reported in seconds (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    @JsonPropertyDescription("interval over which measurements are being reported in seconds")
    private Double measurementInterval;
    /**
     * version of the measurementsForVfScaling block (Required)
     * 
     */
    @JsonProperty("measurementsForVfScalingVersion")
    @JsonPropertyDescription("version of the measurementsForVfScaling block")
    private Double measurementsForVfScalingVersion;
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
     * peak rate of service requests per second to the VNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    @JsonPropertyDescription("peak rate of service requests per second to the VNF over the measurementInterval")
    private Double requestRate;
    /**
     * represents busy-ness of the VNF from 0 to 100 as reported by the VNFC
     * 
     */
    @JsonProperty("vnfcScalingMetric")
    @JsonPropertyDescription("represents busy-ness of the VNF from 0 to 100 as reported by the VNFC")
    private Integer vnfcScalingMetric;
    /**
     * usage of an array of virtual network interface cards
     * 
     */
    @JsonProperty("vNicPerformanceArray")
    @JsonPropertyDescription("usage of an array of virtual network interface cards")
    private List<VNicPerformanceArray> vNicPerformanceArray = new ArrayList<VNicPerformanceArray>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    /**
     * additional name-value-pair fields
     * 
     */
    @JsonProperty("additionalFields")
    public List<AlarmAdditionalInformation> getAdditionalFields() {
        return additionalFields;
    }
    
    /**
     * additional name-value-pair fields
     * 
     */
    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AlarmAdditionalInformation> additionalFields) {
        this.additionalFields = additionalFields;
    }
    
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("additionalMeasurements")
    public List<AdditionalMeasurement> getAdditionalMeasurements() {
        return additionalMeasurements;
    }
    
    /**
     * array of named name-value-pair arrays
     * 
     */
    @JsonProperty("additionalMeasurements")
    public void setAdditionalMeasurements(List<AdditionalMeasurement> additionalMeasurements) {
        this.additionalMeasurements = additionalMeasurements;
    }
    
    /**
     * array of JSON objects described by name, schema and other meta-information
     * 
     */
    @JsonProperty("additionalObjects")
    public List<AdditionalObject> getAdditionalObjects() {
        return additionalObjects;
    }
    
    /**
     * array of JSON objects described by name, schema and other meta-information
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
     * peak concurrent sessions for the VM or VNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    public Integer getConcurrentSessions() {
        return concurrentSessions;
    }
    
    /**
     * peak concurrent sessions for the VM or VNF over the measurementInterval
     * 
     */
    @JsonProperty("concurrentSessions")
    public void setConcurrentSessions(Integer concurrentSessions) {
        this.concurrentSessions = concurrentSessions;
    }
    
    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies,
     * etc., for the VM, or subscribers, devices, etc., for the VNF
     * 
     */
    @JsonProperty("configuredEntities")
    public Integer getConfiguredEntities() {
        return configuredEntities;
    }
    
    /**
     * over the measurementInterval, peak total number of: users, subscribers, devices, adjacencies,
     * etc., for the VM, or subscribers, devices, etc., for the VNF
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
     * array of features in use
     * 
     */
    @JsonProperty("featureUsageArray")
    public List<FeatureUsageArray> getFeatureUsageArray() {
        return featureUsageArray;
    }
    
    /**
     * array of features in use
     * 
     */
    @JsonProperty("featureUsageArray")
    public void setFeatureUsageArray(List<FeatureUsageArray> featureUsageArray) {
        this.featureUsageArray = featureUsageArray;
    }
    
    /**
     * filesystem usage of the VM on which the VNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    public List<FilesystemUsageArray> getFilesystemUsageArray() {
        return filesystemUsageArray;
    }
    
    /**
     * filesystem usage of the VM on which the VNFC reporting the event is running
     * 
     */
    @JsonProperty("filesystemUsageArray")
    public void setFilesystemUsageArray(List<FilesystemUsageArray> filesystemUsageArray) {
        this.filesystemUsageArray = filesystemUsageArray;
    }
    
    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within
     * per-VNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    public List<LatencyDistribution> getLatencyDistribution() {
        return latencyDistribution;
    }
    
    /**
     * array of integers representing counts of requests whose latency in milliseconds falls within
     * per-VNF configured ranges
     * 
     */
    @JsonProperty("latencyDistribution")
    public void setLatencyDistribution(List<LatencyDistribution> latencyDistribution) {
        this.latencyDistribution = latencyDistribution;
    }
    
    /**
     * mean seconds required to respond to each request for the VM on which the VNFC reporting the
     * event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    public Double getMeanRequestLatency() {
        return meanRequestLatency;
    }
    
    /**
     * mean seconds required to respond to each request for the VM on which the VNFC reporting the
     * event is running
     * 
     */
    @JsonProperty("meanRequestLatency")
    public void setMeanRequestLatency(Double meanRequestLatency) {
        this.meanRequestLatency = meanRequestLatency;
    }
    
    /**
     * interval over which measurements are being reported in seconds (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    public Double getMeasurementInterval() {
        return measurementInterval;
    }
    
    /**
     * interval over which measurements are being reported in seconds (Required)
     * 
     */
    @JsonProperty("measurementInterval")
    public void setMeasurementInterval(Double measurementInterval) {
        this.measurementInterval = measurementInterval;
    }
    
    /**
     * version of the measurementsForVfScaling block (Required)
     * 
     */
    @JsonProperty("measurementsForVfScalingVersion")
    public Double getMeasurementsForVfScalingVersion() {
        return measurementsForVfScalingVersion;
    }
    
    /**
     * version of the measurementsForVfScaling block (Required)
     * 
     */
    @JsonProperty("measurementsForVfScalingVersion")
    public void setMeasurementsForVfScalingVersion(Double measurementsForVfScalingVersion) {
        this.measurementsForVfScalingVersion = measurementsForVfScalingVersion;
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
     * peak rate of service requests per second to the VNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    public Double getRequestRate() {
        return requestRate;
    }
    
    /**
     * peak rate of service requests per second to the VNF over the measurementInterval
     * 
     */
    @JsonProperty("requestRate")
    public void setRequestRate(Double requestRate) {
        this.requestRate = requestRate;
    }
    
    /**
     * represents busy-ness of the VNF from 0 to 100 as reported by the VNFC
     * 
     */
    @JsonProperty("vnfcScalingMetric")
    public Integer getVnfcScalingMetric() {
        return vnfcScalingMetric;
    }
    
    /**
     * represents busy-ness of the VNF from 0 to 100 as reported by the VNFC
     * 
     */
    @JsonProperty("vnfcScalingMetric")
    public void setVnfcScalingMetric(Integer vnfcScalingMetric) {
        this.vnfcScalingMetric = vnfcScalingMetric;
    }
    
    /**
     * usage of an array of virtual network interface cards
     * 
     */
    @JsonProperty("vNicPerformanceArray")
    public List<VNicPerformanceArray> getVNicPerformanceArray() {
        return vNicPerformanceArray;
    }
    
    /**
     * usage of an array of virtual network interface cards
     * 
     */
    @JsonProperty("vNicPerformanceArray")
    public void setVNicPerformanceArray(List<VNicPerformanceArray> vNicPerformanceArray) {
        this.vNicPerformanceArray = vNicPerformanceArray;
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
        return new HashCodeBuilder().append(additionalFields).append(additionalMeasurements)
                .append(additionalObjects).append(codecUsageArray).append(concurrentSessions)
                .append(configuredEntities).append(cpuUsageArray).append(diskUsageArray)
                .append(featureUsageArray).append(filesystemUsageArray).append(latencyDistribution)
                .append(meanRequestLatency).append(measurementInterval)
                .append(measurementsForVfScalingVersion).append(memoryUsageArray)
                .append(numberOfMediaPortsInUse).append(requestRate).append(vnfcScalingMetric)
                .append(vNicPerformanceArray).append(additionalProperties).toHashCode();
    }
    
    
    
}
