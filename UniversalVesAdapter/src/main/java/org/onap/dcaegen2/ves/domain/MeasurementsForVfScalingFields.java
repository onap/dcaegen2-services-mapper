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
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
import java.util.List;
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
    "measurementInterval",
    "measurementsForVfScalingVersion",
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
    "latencyDistribution",
    "meanRequestLatency",
    "memoryUsageArray",
    "numberOfMediaPortsInUse",
    "requestRate",
    "vnfcScalingMetric",
    "vNicPerformanceArray"
})
public class MeasurementsForVfScalingFields {

    @JsonProperty("measurementInterval")
    private Double measurementInterval;
    @JsonProperty("measurementsForVfScalingVersion")
    private Double measurementsForVfScalingVersion;
    @JsonProperty("additionalFields")
    private List<AdditionalField> additionalFields = null;
    @JsonProperty("additionalMeasurements")
    private List<AdditionalMeasurement> additionalMeasurements = null;
    @JsonProperty("additionalObjects")
    private List<AdditionalObject> additionalObjects = null;
    @JsonProperty("codecUsageArray")
    private List<CodecUsageArray> codecUsageArray = null;
    @JsonProperty("concurrentSessions")
    private Long concurrentSessions;
    @JsonProperty("configuredEntities")
    private Long configuredEntities;
    @JsonProperty("cpuUsageArray")
    private List<CpuUsageArray> cpuUsageArray = null;
    @JsonProperty("diskUsageArray")
    private List<DiskUsageArray> diskUsageArray = null;
    @JsonProperty("featureUsageArray")
    private List<FeatureUsageArray> featureUsageArray = null;
    @JsonProperty("filesystemUsageArray")
    private List<FilesystemUsageArray> filesystemUsageArray = null;
    @JsonProperty("latencyDistribution")
    private List<LatencyDistribution> latencyDistribution = null;
    @JsonProperty("meanRequestLatency")
    private Double meanRequestLatency;
    @JsonProperty("memoryUsageArray")
    private List<MemoryUsageArray> memoryUsageArray = null;
    @JsonProperty("numberOfMediaPortsInUse")
    private Long numberOfMediaPortsInUse;
    @JsonProperty("requestRate")
    private Double requestRate;
    @JsonProperty("vnfcScalingMetric")
    private Long vnfcScalingMetric;
    @JsonProperty("vNicPerformanceArray")
    private List<VNicPerformanceArray> vNicPerformanceArray = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("measurementInterval")
    public Double getMeasurementInterval() {
        return measurementInterval;
    }

    @JsonProperty("measurementInterval")
    public void setMeasurementInterval(Double measurementInterval) {
        this.measurementInterval = measurementInterval;
    }

    @JsonProperty("measurementsForVfScalingVersion")
    public Double getMeasurementsForVfScalingVersion() {
        return measurementsForVfScalingVersion;
    }

    @JsonProperty("measurementsForVfScalingVersion")
    public void setMeasurementsForVfScalingVersion(Double measurementsForVfScalingVersion) {
        this.measurementsForVfScalingVersion = measurementsForVfScalingVersion;
    }

    @JsonProperty("additionalFields")
    public List<AdditionalField> getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AdditionalField> additionalFields) {
        this.additionalFields = additionalFields;
    }

    @JsonProperty("additionalMeasurements")
    public List<AdditionalMeasurement> getAdditionalMeasurements() {
        return additionalMeasurements;
    }

    @JsonProperty("additionalMeasurements")
    public void setAdditionalMeasurements(List<AdditionalMeasurement> additionalMeasurements) {
        this.additionalMeasurements = additionalMeasurements;
    }

    @JsonProperty("additionalObjects")
    public List<AdditionalObject> getAdditionalObjects() {
        return additionalObjects;
    }

    @JsonProperty("additionalObjects")
    public void setAdditionalObjects(List<AdditionalObject> additionalObjects) {
        this.additionalObjects = additionalObjects;
    }

    @JsonProperty("codecUsageArray")
    public List<CodecUsageArray> getCodecUsageArray() {
        return codecUsageArray;
    }

    @JsonProperty("codecUsageArray")
    public void setCodecUsageArray(List<CodecUsageArray> codecUsageArray) {
        this.codecUsageArray = codecUsageArray;
    }

    @JsonProperty("concurrentSessions")
    public Long getConcurrentSessions() {
        return concurrentSessions;
    }

    @JsonProperty("concurrentSessions")
    public void setConcurrentSessions(Long concurrentSessions) {
        this.concurrentSessions = concurrentSessions;
    }

    @JsonProperty("configuredEntities")
    public Long getConfiguredEntities() {
        return configuredEntities;
    }

    @JsonProperty("configuredEntities")
    public void setConfiguredEntities(Long configuredEntities) {
        this.configuredEntities = configuredEntities;
    }

    @JsonProperty("cpuUsageArray")
    public List<CpuUsageArray> getCpuUsageArray() {
        return cpuUsageArray;
    }

    @JsonProperty("cpuUsageArray")
    public void setCpuUsageArray(List<CpuUsageArray> cpuUsageArray) {
        this.cpuUsageArray = cpuUsageArray;
    }

    @JsonProperty("diskUsageArray")
    public List<DiskUsageArray> getDiskUsageArray() {
        return diskUsageArray;
    }

    @JsonProperty("diskUsageArray")
    public void setDiskUsageArray(List<DiskUsageArray> diskUsageArray) {
        this.diskUsageArray = diskUsageArray;
    }

    @JsonProperty("featureUsageArray")
    public List<FeatureUsageArray> getFeatureUsageArray() {
        return featureUsageArray;
    }

    @JsonProperty("featureUsageArray")
    public void setFeatureUsageArray(List<FeatureUsageArray> featureUsageArray) {
        this.featureUsageArray = featureUsageArray;
    }

    @JsonProperty("filesystemUsageArray")
    public List<FilesystemUsageArray> getFilesystemUsageArray() {
        return filesystemUsageArray;
    }

    @JsonProperty("filesystemUsageArray")
    public void setFilesystemUsageArray(List<FilesystemUsageArray> filesystemUsageArray) {
        this.filesystemUsageArray = filesystemUsageArray;
    }

    @JsonProperty("latencyDistribution")
    public List<LatencyDistribution> getLatencyDistribution() {
        return latencyDistribution;
    }

    @JsonProperty("latencyDistribution")
    public void setLatencyDistribution(List<LatencyDistribution> latencyDistribution) {
        this.latencyDistribution = latencyDistribution;
    }

    @JsonProperty("meanRequestLatency")
    public Double getMeanRequestLatency() {
        return meanRequestLatency;
    }

    @JsonProperty("meanRequestLatency")
    public void setMeanRequestLatency(Double meanRequestLatency) {
        this.meanRequestLatency = meanRequestLatency;
    }

    @JsonProperty("memoryUsageArray")
    public List<MemoryUsageArray> getMemoryUsageArray() {
        return memoryUsageArray;
    }

    @JsonProperty("memoryUsageArray")
    public void setMemoryUsageArray(List<MemoryUsageArray> memoryUsageArray) {
        this.memoryUsageArray = memoryUsageArray;
    }

    @JsonProperty("numberOfMediaPortsInUse")
    public Long getNumberOfMediaPortsInUse() {
        return numberOfMediaPortsInUse;
    }

    @JsonProperty("numberOfMediaPortsInUse")
    public void setNumberOfMediaPortsInUse(Long numberOfMediaPortsInUse) {
        this.numberOfMediaPortsInUse = numberOfMediaPortsInUse;
    }

    @JsonProperty("requestRate")
    public Double getRequestRate() {
        return requestRate;
    }

    @JsonProperty("requestRate")
    public void setRequestRate(Double requestRate) {
        this.requestRate = requestRate;
    }

    @JsonProperty("vnfcScalingMetric")
    public Long getVnfcScalingMetric() {
        return vnfcScalingMetric;
    }

    @JsonProperty("vnfcScalingMetric")
    public void setVnfcScalingMetric(Long vnfcScalingMetric) {
        this.vnfcScalingMetric = vnfcScalingMetric;
    }

    @JsonProperty("vNicPerformanceArray")
    public List<VNicPerformanceArray> getVNicPerformanceArray() {
        return vNicPerformanceArray;
    }

    @JsonProperty("vNicPerformanceArray")
    public void setVNicPerformanceArray(List<VNicPerformanceArray> vNicPerformanceArray) {
        this.vNicPerformanceArray = vNicPerformanceArray;
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
        return new ToStringBuilder(this).append("measurementInterval", measurementInterval).append("measurementsForVfScalingVersion", measurementsForVfScalingVersion).append("additionalFields", additionalFields).append("additionalMeasurements", additionalMeasurements).append("additionalObjects", additionalObjects).append("codecUsageArray", codecUsageArray).append("concurrentSessions", concurrentSessions).append("configuredEntities", configuredEntities).append("cpuUsageArray", cpuUsageArray).append("diskUsageArray", diskUsageArray).append("featureUsageArray", featureUsageArray).append("filesystemUsageArray", filesystemUsageArray).append("latencyDistribution", latencyDistribution).append("meanRequestLatency", meanRequestLatency).append("memoryUsageArray", memoryUsageArray).append("numberOfMediaPortsInUse", numberOfMediaPortsInUse).append("requestRate", requestRate).append("vnfcScalingMetric", vnfcScalingMetric).append("vNicPerformanceArray", vNicPerformanceArray).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestRate).append(numberOfMediaPortsInUse).append(measurementInterval).append(diskUsageArray).append(additionalObjects).append(measurementsForVfScalingVersion).append(filesystemUsageArray).append(featureUsageArray).append(vNicPerformanceArray).append(vnfcScalingMetric).append(cpuUsageArray).append(additionalProperties).append(meanRequestLatency).append(additionalMeasurements).append(latencyDistribution).append(concurrentSessions).append(codecUsageArray).append(additionalFields).append(memoryUsageArray).append(configuredEntities).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeasurementsForVfScalingFields) == false) {
            return false;
        }
        MeasurementsForVfScalingFields rhs = ((MeasurementsForVfScalingFields) other);
        return new EqualsBuilder().append(requestRate, rhs.requestRate).append(numberOfMediaPortsInUse, rhs.numberOfMediaPortsInUse).append(measurementInterval, rhs.measurementInterval).append(diskUsageArray, rhs.diskUsageArray).append(additionalObjects, rhs.additionalObjects).append(measurementsForVfScalingVersion, rhs.measurementsForVfScalingVersion).append(filesystemUsageArray, rhs.filesystemUsageArray).append(featureUsageArray, rhs.featureUsageArray).append(vNicPerformanceArray, rhs.vNicPerformanceArray).append(vnfcScalingMetric, rhs.vnfcScalingMetric).append(cpuUsageArray, rhs.cpuUsageArray).append(additionalProperties, rhs.additionalProperties).append(meanRequestLatency, rhs.meanRequestLatency).append(additionalMeasurements, rhs.additionalMeasurements).append(latencyDistribution, rhs.latencyDistribution).append(concurrentSessions, rhs.concurrentSessions).append(codecUsageArray, rhs.codecUsageArray).append(additionalFields, rhs.additionalFields).append(memoryUsageArray, rhs.memoryUsageArray).append(configuredEntities, rhs.configuredEntities).isEquals();
    }

}
