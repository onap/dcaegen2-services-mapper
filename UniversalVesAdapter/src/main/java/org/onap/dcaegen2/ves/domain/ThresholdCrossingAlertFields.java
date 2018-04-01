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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalParameters",
    "alertAction",
    "alertDescription",
    "alertType",
    "collectionTimestamp",
    "eventSeverity",
    "eventStartTimestamp",
    "thresholdCrossingFieldsVersion",
    "additionalFields",
    "alertValue",
    "associatedAlertIdList",
    "dataCollector",
    "elementType",
    "interfaceName",
    "networkService",
    "possibleRootCause"
})
public class ThresholdCrossingAlertFields {

    @JsonProperty("additionalParameters")
    private List<AdditionalParameter> additionalParameters = null;
    @JsonProperty("alertAction")
    private String alertAction;
    @JsonProperty("alertDescription")
    private String alertDescription;
    @JsonProperty("alertType")
    private String alertType;
    @JsonProperty("collectionTimestamp")
    private String collectionTimestamp;
    @JsonProperty("eventSeverity")
    private String eventSeverity;
    @JsonProperty("eventStartTimestamp")
    private String eventStartTimestamp;
    @JsonProperty("thresholdCrossingFieldsVersion")
    private Double thresholdCrossingFieldsVersion;
    @JsonProperty("additionalFields")
    private List<AdditionalField> additionalFields = null;
    @JsonProperty("alertValue")
    private String alertValue;
    @JsonProperty("associatedAlertIdList")
    private List<String> associatedAlertIdList = null;
    @JsonProperty("dataCollector")
    private String dataCollector;
    @JsonProperty("elementType")
    private String elementType;
    @JsonProperty("interfaceName")
    private String interfaceName;
    @JsonProperty("networkService")
    private String networkService;
    @JsonProperty("possibleRootCause")
    private String possibleRootCause;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("additionalParameters")
    public List<AdditionalParameter> getAdditionalParameters() {
        return additionalParameters;
    }

    @JsonProperty("additionalParameters")
    public void setAdditionalParameters(List<AdditionalParameter> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    @JsonProperty("alertAction")
    public String getAlertAction() {
        return alertAction;
    }

    @JsonProperty("alertAction")
    public void setAlertAction(String alertAction) {
        this.alertAction = alertAction;
    }

    @JsonProperty("alertDescription")
    public String getAlertDescription() {
        return alertDescription;
    }

    @JsonProperty("alertDescription")
    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }

    @JsonProperty("alertType")
    public String getAlertType() {
        return alertType;
    }

    @JsonProperty("alertType")
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    @JsonProperty("collectionTimestamp")
    public String getCollectionTimestamp() {
        return collectionTimestamp;
    }

    @JsonProperty("collectionTimestamp")
    public void setCollectionTimestamp(String collectionTimestamp) {
        this.collectionTimestamp = collectionTimestamp;
    }

    @JsonProperty("eventSeverity")
    public String getEventSeverity() {
        return eventSeverity;
    }

    @JsonProperty("eventSeverity")
    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    @JsonProperty("eventStartTimestamp")
    public String getEventStartTimestamp() {
        return eventStartTimestamp;
    }

    @JsonProperty("eventStartTimestamp")
    public void setEventStartTimestamp(String eventStartTimestamp) {
        this.eventStartTimestamp = eventStartTimestamp;
    }

    @JsonProperty("thresholdCrossingFieldsVersion")
    public Double getThresholdCrossingFieldsVersion() {
        return thresholdCrossingFieldsVersion;
    }

    @JsonProperty("thresholdCrossingFieldsVersion")
    public void setThresholdCrossingFieldsVersion(Double thresholdCrossingFieldsVersion) {
        this.thresholdCrossingFieldsVersion = thresholdCrossingFieldsVersion;
    }

    @JsonProperty("additionalFields")
    public List<AdditionalField> getAdditionalFields() {
        return additionalFields;
    }

    @JsonProperty("additionalFields")
    public void setAdditionalFields(List<AdditionalField> additionalFields) {
        this.additionalFields = additionalFields;
    }

    @JsonProperty("alertValue")
    public String getAlertValue() {
        return alertValue;
    }

    @JsonProperty("alertValue")
    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }

    @JsonProperty("associatedAlertIdList")
    public List<String> getAssociatedAlertIdList() {
        return associatedAlertIdList;
    }

    @JsonProperty("associatedAlertIdList")
    public void setAssociatedAlertIdList(List<String> associatedAlertIdList) {
        this.associatedAlertIdList = associatedAlertIdList;
    }

    @JsonProperty("dataCollector")
    public String getDataCollector() {
        return dataCollector;
    }

    @JsonProperty("dataCollector")
    public void setDataCollector(String dataCollector) {
        this.dataCollector = dataCollector;
    }

    @JsonProperty("elementType")
    public String getElementType() {
        return elementType;
    }

    @JsonProperty("elementType")
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    @JsonProperty("interfaceName")
    public String getInterfaceName() {
        return interfaceName;
    }

    @JsonProperty("interfaceName")
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    @JsonProperty("networkService")
    public String getNetworkService() {
        return networkService;
    }

    @JsonProperty("networkService")
    public void setNetworkService(String networkService) {
        this.networkService = networkService;
    }

    @JsonProperty("possibleRootCause")
    public String getPossibleRootCause() {
        return possibleRootCause;
    }

    @JsonProperty("possibleRootCause")
    public void setPossibleRootCause(String possibleRootCause) {
        this.possibleRootCause = possibleRootCause;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    

}
