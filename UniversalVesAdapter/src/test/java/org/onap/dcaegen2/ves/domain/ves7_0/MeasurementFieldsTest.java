/*
 * ============LICENSE_START======================================================= ONAP : DCAE
 * ================================================================================ Copyright 2018
 * TechMahindra =================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. ============LICENSE_END=========================================================
 */

package org.onap.dcaegen2.ves.domain.ves7_0;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.onap.dcaegen2.ves.domain.ves7_0.MeasurementFields.MeasurementFieldsVersion;


public class MeasurementFieldsTest {

  private MeasurementFields createTestSubject() {
    return new MeasurementFields();
  }

  @Test
  public void testGetAdditionalFields() throws Exception {
    MeasurementFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalFields();
  }

  @Test
  public void testSetAdditionalFields() throws Exception {
    MeasurementFields testSubject;
    AlarmAdditionalInformation additionalFields = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalFields(additionalFields);
  }

  @Test
  public void testGetAdditionalMeasurements() throws Exception {
    MeasurementFields testSubject;
    List<AdditionalMeasurement> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalMeasurements();
  }

  @Test
  public void testSetAdditionalMeasurements() throws Exception {
    MeasurementFields testSubject;
    List<AdditionalMeasurement> additionalMeasurements = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalMeasurements(additionalMeasurements);
  }

  @Test
  public void testGetAdditionalObjects() throws Exception {
    MeasurementFields testSubject;
    List<AdditionalObject> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getAdditionalObjects();
  }

  @Test
  public void testSetAdditionalObjects() throws Exception {
    MeasurementFields testSubject;
    List<AdditionalObject> additionalObjects = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setAdditionalObjects(additionalObjects);
  }

  @Test
  public void testGetCodecUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<CodecUsageArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCodecUsageArray();
  }

  @Test
  public void testSetCodecUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<CodecUsageArray> codecUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCodecUsageArray(codecUsageArray);
  }

  @Test
  public void testGetConcurrentSessions() throws Exception {
    MeasurementFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getConcurrentSessions();
  }

  @Test
  public void testSetConcurrentSessions() throws Exception {
    MeasurementFields testSubject;
    Integer concurrentSessions = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setConcurrentSessions(concurrentSessions);
  }

  @Test
  public void testGetConfiguredEntities() throws Exception {
    MeasurementFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getConfiguredEntities();
  }

  @Test
  public void testSetConfiguredEntities() throws Exception {
    MeasurementFields testSubject;
    Integer configuredEntities = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setConfiguredEntities(configuredEntities);
  }

  @Test
  public void testGetCpuUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<CpuUsageArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getCpuUsageArray();
  }

  @Test
  public void testSetCpuUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<CpuUsageArray> cpuUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setCpuUsageArray(cpuUsageArray);
  }

  @Test
  public void testGetDiskUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<DiskUsageArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getDiskUsageArray();
  }

  @Test
  public void testSetDiskUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<DiskUsageArray> diskUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setDiskUsageArray(diskUsageArray);
  }

  @Test
  public void testGetFeatureUsageArray() throws Exception {
    MeasurementFields testSubject;
    AlarmAdditionalInformation result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFeatureUsageArray();
  }

  @Test
  public void testSetFeatureUsageArray() throws Exception {
    MeasurementFields testSubject;
    AlarmAdditionalInformation featureUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setFeatureUsageArray(featureUsageArray);
  }

  @Test
  public void testGetFilesystemUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<FilesystemUsageArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getFilesystemUsageArray();
  }

  @Test
  public void testSetFilesystemUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<FilesystemUsageArray> filesystemUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setFilesystemUsageArray(filesystemUsageArray);
  }

  @Test
  public void testGetHugePagesArray() throws Exception {
    MeasurementFields testSubject;
    List<HugePagesArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getHugePagesArray();
  }

  @Test
  public void testSetHugePagesArray() throws Exception {
    MeasurementFields testSubject;
    List<HugePagesArray> hugePagesArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setHugePagesArray(hugePagesArray);
  }

  @Test
  public void testGetIpmi() throws Exception {
    MeasurementFields testSubject;
    Ipmi result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getIpmi();
  }

  @Test
  public void testSetIpmi() throws Exception {
    MeasurementFields testSubject;
    Ipmi ipmi = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setIpmi(ipmi);
  }

  @Test
  public void testGetLatencyDistribution() throws Exception {
    MeasurementFields testSubject;
    List<LatencyDistribution> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getLatencyDistribution();
  }

  @Test
  public void testSetLatencyDistribution() throws Exception {
    MeasurementFields testSubject;
    List<LatencyDistribution> latencyDistribution = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setLatencyDistribution(latencyDistribution);
  }

  @Test
  public void testGetLoadArray() throws Exception {
    MeasurementFields testSubject;
    List<LoadArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getLoadArray();
  }

  @Test
  public void testSetLoadArray() throws Exception {
    MeasurementFields testSubject;
    List<LoadArray> loadArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setLoadArray(loadArray);
  }

  @Test
  public void testGetMachineCheckExceptionArray() throws Exception {
    MeasurementFields testSubject;
    List<MachineCheckExceptionArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMachineCheckExceptionArray();
  }

  @Test
  public void testSetMachineCheckExceptionArray() throws Exception {
    MeasurementFields testSubject;
    List<MachineCheckExceptionArray> machineCheckExceptionArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setMachineCheckExceptionArray(machineCheckExceptionArray);
  }

  @Test
  public void testGetMeanRequestLatency() throws Exception {
    MeasurementFields testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMeanRequestLatency();
  }

  @Test
  public void testSetMeanRequestLatency() throws Exception {
    MeasurementFields testSubject;
    Double meanRequestLatency = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setMeanRequestLatency(meanRequestLatency);
  }

  @Test
  public void testGetMeasurementInterval() throws Exception {
    MeasurementFields testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMeasurementInterval();
  }

  @Test
  public void testSetMeasurementInterval() throws Exception {
    MeasurementFields testSubject;
    Double measurementInterval = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setMeasurementInterval(measurementInterval);
  }

  @Test
  public void testGetMeasurementFieldsVersion() throws Exception {
    MeasurementFields testSubject;
    MeasurementFieldsVersion result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMeasurementFieldsVersion();
  }

  @Test
  public void testSetMeasurementFieldsVersion() throws Exception {
    MeasurementFields testSubject;
    MeasurementFieldsVersion measurementFieldsVersion = MeasurementFieldsVersion._4_0;

    // default test
    testSubject = createTestSubject();
    testSubject.setMeasurementFieldsVersion(measurementFieldsVersion);
  }

  @Test
  public void testGetMemoryUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<MemoryUsageArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getMemoryUsageArray();
  }

  @Test
  public void testSetMemoryUsageArray() throws Exception {
    MeasurementFields testSubject;
    List<MemoryUsageArray> memoryUsageArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setMemoryUsageArray(memoryUsageArray);
  }

  @Test
  public void testGetNumberOfMediaPortsInUse() throws Exception {
    MeasurementFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getNumberOfMediaPortsInUse();
  }

  @Test
  public void testSetNumberOfMediaPortsInUse() throws Exception {
    MeasurementFields testSubject;
    Integer numberOfMediaPortsInUse = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setNumberOfMediaPortsInUse(numberOfMediaPortsInUse);
  }

  @Test
  public void testGetRequestRate() throws Exception {
    MeasurementFields testSubject;
    Double result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getRequestRate();
  }

  @Test
  public void testSetRequestRate() throws Exception {
    MeasurementFields testSubject;
    Double requestRate = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setRequestRate(requestRate);
  }

  @Test
  public void testGetNfcScalingMetric() throws Exception {
    MeasurementFields testSubject;
    Integer result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getNfcScalingMetric();
  }

  @Test
  public void testSetNfcScalingMetric() throws Exception {
    MeasurementFields testSubject;
    Integer nfcScalingMetric = 0;

    // default test
    testSubject = createTestSubject();
    testSubject.setNfcScalingMetric(nfcScalingMetric);
  }

  @Test
  public void testGetNicPerformanceArray() throws Exception {
    MeasurementFields testSubject;
    List<NicPerformanceArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getNicPerformanceArray();
  }

  @Test
  public void testSetNicPerformanceArray() throws Exception {
    MeasurementFields testSubject;
    List<NicPerformanceArray> nicPerformanceArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setNicPerformanceArray(nicPerformanceArray);
  }

  @Test
  public void testGetProcessStatsArray() throws Exception {
    MeasurementFields testSubject;
    List<ProcessStatsArray> result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.getProcessStatsArray();
  }

  @Test
  public void testSetProcessStatsArray() throws Exception {
    MeasurementFields testSubject;
    List<ProcessStatsArray> processStatsArray = null;

    // default test
    testSubject = createTestSubject();
    testSubject.setProcessStatsArray(processStatsArray);
  }

  @Test
  public void testToString() throws Exception {
    MeasurementFields testSubject;
    String result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.toString();
  }

  @Test
  public void testHashCode() throws Exception {
    MeasurementFields testSubject;
    int result;

    // default test
    testSubject = createTestSubject();
    result = testSubject.hashCode();
  }

  @Test
  public void testEquals() throws Exception {
    MeasurementFields testSubject;
    MeasurementFields testSubject2;
    Object other = null;
    boolean result;

    // default test
    testSubject = createTestSubject();
    testSubject2 = createTestSubject();
    result = testSubject.equals(other);
    result = testSubject.equals(testSubject);
    result = testSubject.equals(testSubject2);
    assertNotNull(result);
  }
}
