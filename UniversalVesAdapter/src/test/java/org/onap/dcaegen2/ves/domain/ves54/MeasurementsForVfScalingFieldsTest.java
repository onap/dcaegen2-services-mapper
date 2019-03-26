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


import java.util.List;
import java.util.Map;

import org.junit.Test;


public class MeasurementsForVfScalingFieldsTest {
    
    private MeasurementsForVfScalingFields createTestSubject() {
        return new MeasurementsForVfScalingFields();
    }
    
    @Test
    public void testGetAdditionalFields() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AlarmAdditionalInformation> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalFields();
    }
    
    @Test
    public void testSetAdditionalFields() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AlarmAdditionalInformation> additionalFields = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalFields(additionalFields);
    }
    
    @Test
    public void testGetAdditionalMeasurements() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AdditionalMeasurement> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalMeasurements();
    }
    
    @Test
    public void testSetAdditionalMeasurements() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AdditionalMeasurement> additionalMeasurements = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalMeasurements(additionalMeasurements);
    }
    
    @Test
    public void testGetAdditionalObjects() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AdditionalObject> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalObjects();
    }
    
    @Test
    public void testSetAdditionalObjects() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<AdditionalObject> additionalObjects = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalObjects(additionalObjects);
    }
    
    @Test
    public void testGetCodecUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<CodecUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCodecUsageArray();
    }
    
    @Test
    public void testSetCodecUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<CodecUsageArray> codecUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCodecUsageArray(codecUsageArray);
    }
    
    @Test
    public void testGetConcurrentSessions() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getConcurrentSessions();
    }
    
    @Test
    public void testSetConcurrentSessions() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer concurrentSessions = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setConcurrentSessions(concurrentSessions);
    }
    
    @Test
    public void testGetConfiguredEntities() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getConfiguredEntities();
    }
    
    @Test
    public void testSetConfiguredEntities() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer configuredEntities = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setConfiguredEntities(configuredEntities);
    }
    
    @Test
    public void testGetCpuUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<CpuUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getCpuUsageArray();
    }
    
    @Test
    public void testSetCpuUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<CpuUsageArray> cpuUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setCpuUsageArray(cpuUsageArray);
    }
    
    @Test
    public void testGetDiskUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<DiskUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getDiskUsageArray();
    }
    
    @Test
    public void testSetDiskUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<DiskUsageArray> diskUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setDiskUsageArray(diskUsageArray);
    }
    
    @Test
    public void testGetFeatureUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<FeatureUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFeatureUsageArray();
    }
    
    @Test
    public void testSetFeatureUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<FeatureUsageArray> featureUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFeatureUsageArray(featureUsageArray);
    }
    
    @Test
    public void testGetFilesystemUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<FilesystemUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getFilesystemUsageArray();
    }
    
    @Test
    public void testSetFilesystemUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<FilesystemUsageArray> filesystemUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setFilesystemUsageArray(filesystemUsageArray);
    }
    
    @Test
    public void testGetLatencyDistribution() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<LatencyDistribution> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getLatencyDistribution();
    }
    
    @Test
    public void testSetLatencyDistribution() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<LatencyDistribution> latencyDistribution = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setLatencyDistribution(latencyDistribution);
    }
    
    @Test
    public void testGetMeanRequestLatency() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMeanRequestLatency();
    }
    
    @Test
    public void testSetMeanRequestLatency() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double meanRequestLatency = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMeanRequestLatency(meanRequestLatency);
    }
    
    @Test
    public void testGetMeasurementInterval() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMeasurementInterval();
    }
    
    @Test
    public void testSetMeasurementInterval() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double measurementInterval = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMeasurementInterval(measurementInterval);
    }
    
    @Test
    public void testGetMeasurementsForVfScalingVersion() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMeasurementsForVfScalingVersion();
    }
    
    @Test
    public void testSetMeasurementsForVfScalingVersion() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double measurementsForVfScalingVersion = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMeasurementsForVfScalingVersion(measurementsForVfScalingVersion);
    }
    
    @Test
    public void testGetMemoryUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<MemoryUsageArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getMemoryUsageArray();
    }
    
    @Test
    public void testSetMemoryUsageArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<MemoryUsageArray> memoryUsageArray = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setMemoryUsageArray(memoryUsageArray);
    }
    
    @Test
    public void testGetNumberOfMediaPortsInUse() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getNumberOfMediaPortsInUse();
    }
    
    @Test
    public void testSetNumberOfMediaPortsInUse() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer numberOfMediaPortsInUse = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setNumberOfMediaPortsInUse(numberOfMediaPortsInUse);
    }
    
    @Test
    public void testGetRequestRate() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getRequestRate();
    }
    
    @Test
    public void testSetRequestRate() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Double requestRate = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setRequestRate(requestRate);
    }
    
    @Test
    public void testGetVnfcScalingMetric() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVnfcScalingMetric();
    }
    
    @Test
    public void testSetVnfcScalingMetric() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Integer vnfcScalingMetric = 0;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVnfcScalingMetric(vnfcScalingMetric);
    }
    
    @Test
    public void testGetVNicPerformanceArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<VNicPerformanceArray> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getVNicPerformanceArray();
    }
    
    @Test
    public void testSetVNicPerformanceArray() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        List<VNicPerformanceArray> array = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setVNicPerformanceArray(array);
    }
    
    @Test
    public void testToString() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        String result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.toString();
    }
    
    @Test
    public void testGetAdditionalProperties() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        Map<String, Object> result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.getAdditionalProperties();
    }
    
    @Test
    public void testSetAdditionalProperty() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        String name = "";
        Object value = null;
        
        
        // default test
        testSubject = createTestSubject();
        testSubject.setAdditionalProperty(name, value);
    }
    
    @Test
    public void testHashCode() throws Exception {
        MeasurementsForVfScalingFields testSubject;
        int result;
        
        // default test
        testSubject = createTestSubject();
        result = testSubject.hashCode();
    }
    
    
}
