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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valuesAreSuspect",
    "vNicIdentifier",
    "receivedBroadcastPacketsAccumulated",
    "receivedBroadcastPacketsDelta",
    "receivedDiscardedPacketsAccumulated",
    "receivedDiscardedPacketsDelta",
    "receivedErrorPacketsAccumulated",
    "receivedErrorPacketsDelta",
    "receivedMulticastPacketsAccumulated",
    "receivedMulticastPacketsDelta",
    "receivedOctetsAccumulated",
    "receivedOctetsDelta",
    "receivedTotalPacketsAccumulated",
    "receivedTotalPacketsDelta",
    "receivedUnicastPacketsAccumulated",
    "receivedUnicastPacketsDelta",
    "transmittedBroadcastPacketsAccumulated",
    "transmittedBroadcastPacketsDelta",
    "transmittedDiscardedPacketsAccumulated",
    "transmittedDiscardedPacketsDelta",
    "transmittedErrorPacketsAccumulated",
    "transmittedErrorPacketsDelta",
    "transmittedMulticastPacketsAccumulated",
    "transmittedMulticastPacketsDelta",
    "transmittedOctetsAccumulated",
    "transmittedOctetsDelta",
    "transmittedTotalPacketsAccumulated",
    "transmittedTotalPacketsDelta",
    "transmittedUnicastPacketsAccumulated",
    "transmittedUnicastPacketsDelta"
})
public class VNicPerformanceArray {

    @JsonProperty("valuesAreSuspect")
    private String valuesAreSuspect;
    @JsonProperty("vNicIdentifier")
    private String vNicIdentifier;
    @JsonProperty("receivedBroadcastPacketsAccumulated")
    private Double receivedBroadcastPacketsAccumulated;
    @JsonProperty("receivedBroadcastPacketsDelta")
    private Double receivedBroadcastPacketsDelta;
    @JsonProperty("receivedDiscardedPacketsAccumulated")
    private Double receivedDiscardedPacketsAccumulated;
    @JsonProperty("receivedDiscardedPacketsDelta")
    private Double receivedDiscardedPacketsDelta;
    @JsonProperty("receivedErrorPacketsAccumulated")
    private Double receivedErrorPacketsAccumulated;
    @JsonProperty("receivedErrorPacketsDelta")
    private Double receivedErrorPacketsDelta;
    @JsonProperty("receivedMulticastPacketsAccumulated")
    private Double receivedMulticastPacketsAccumulated;
    @JsonProperty("receivedMulticastPacketsDelta")
    private Double receivedMulticastPacketsDelta;
    @JsonProperty("receivedOctetsAccumulated")
    private Double receivedOctetsAccumulated;
    @JsonProperty("receivedOctetsDelta")
    private Double receivedOctetsDelta;
    @JsonProperty("receivedTotalPacketsAccumulated")
    private Double receivedTotalPacketsAccumulated;
    @JsonProperty("receivedTotalPacketsDelta")
    private Double receivedTotalPacketsDelta;
    @JsonProperty("receivedUnicastPacketsAccumulated")
    private Double receivedUnicastPacketsAccumulated;
    @JsonProperty("receivedUnicastPacketsDelta")
    private Double receivedUnicastPacketsDelta;
    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    private Double transmittedBroadcastPacketsAccumulated;
    @JsonProperty("transmittedBroadcastPacketsDelta")
    private Double transmittedBroadcastPacketsDelta;
    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    private Double transmittedDiscardedPacketsAccumulated;
    @JsonProperty("transmittedDiscardedPacketsDelta")
    private Double transmittedDiscardedPacketsDelta;
    @JsonProperty("transmittedErrorPacketsAccumulated")
    private Double transmittedErrorPacketsAccumulated;
    @JsonProperty("transmittedErrorPacketsDelta")
    private Double transmittedErrorPacketsDelta;
    @JsonProperty("transmittedMulticastPacketsAccumulated")
    private Double transmittedMulticastPacketsAccumulated;
    @JsonProperty("transmittedMulticastPacketsDelta")
    private Double transmittedMulticastPacketsDelta;
    @JsonProperty("transmittedOctetsAccumulated")
    private Double transmittedOctetsAccumulated;
    @JsonProperty("transmittedOctetsDelta")
    private Double transmittedOctetsDelta;
    @JsonProperty("transmittedTotalPacketsAccumulated")
    private Double transmittedTotalPacketsAccumulated;
    @JsonProperty("transmittedTotalPacketsDelta")
    private Double transmittedTotalPacketsDelta;
    @JsonProperty("transmittedUnicastPacketsAccumulated")
    private Double transmittedUnicastPacketsAccumulated;
    @JsonProperty("transmittedUnicastPacketsDelta")
    private Double transmittedUnicastPacketsDelta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("valuesAreSuspect")
    public String getValuesAreSuspect() {
        return valuesAreSuspect;
    }

    @JsonProperty("valuesAreSuspect")
    public void setValuesAreSuspect(String valuesAreSuspect) {
        this.valuesAreSuspect = valuesAreSuspect;
    }

    @JsonProperty("vNicIdentifier")
    public String getVNicIdentifier() {
        return vNicIdentifier;
    }

    @JsonProperty("vNicIdentifier")
    public void setVNicIdentifier(String vNicIdentifier) {
        this.vNicIdentifier = vNicIdentifier;
    }

    @JsonProperty("receivedBroadcastPacketsAccumulated")
    public Double getReceivedBroadcastPacketsAccumulated() {
        return receivedBroadcastPacketsAccumulated;
    }

    @JsonProperty("receivedBroadcastPacketsAccumulated")
    public void setReceivedBroadcastPacketsAccumulated(Double receivedBroadcastPacketsAccumulated) {
        this.receivedBroadcastPacketsAccumulated = receivedBroadcastPacketsAccumulated;
    }

    @JsonProperty("receivedBroadcastPacketsDelta")
    public Double getReceivedBroadcastPacketsDelta() {
        return receivedBroadcastPacketsDelta;
    }

    @JsonProperty("receivedBroadcastPacketsDelta")
    public void setReceivedBroadcastPacketsDelta(Double receivedBroadcastPacketsDelta) {
        this.receivedBroadcastPacketsDelta = receivedBroadcastPacketsDelta;
    }

    @JsonProperty("receivedDiscardedPacketsAccumulated")
    public Double getReceivedDiscardedPacketsAccumulated() {
        return receivedDiscardedPacketsAccumulated;
    }

    @JsonProperty("receivedDiscardedPacketsAccumulated")
    public void setReceivedDiscardedPacketsAccumulated(Double receivedDiscardedPacketsAccumulated) {
        this.receivedDiscardedPacketsAccumulated = receivedDiscardedPacketsAccumulated;
    }

    @JsonProperty("receivedDiscardedPacketsDelta")
    public Double getReceivedDiscardedPacketsDelta() {
        return receivedDiscardedPacketsDelta;
    }

    @JsonProperty("receivedDiscardedPacketsDelta")
    public void setReceivedDiscardedPacketsDelta(Double receivedDiscardedPacketsDelta) {
        this.receivedDiscardedPacketsDelta = receivedDiscardedPacketsDelta;
    }

    @JsonProperty("receivedErrorPacketsAccumulated")
    public Double getReceivedErrorPacketsAccumulated() {
        return receivedErrorPacketsAccumulated;
    }

    @JsonProperty("receivedErrorPacketsAccumulated")
    public void setReceivedErrorPacketsAccumulated(Double receivedErrorPacketsAccumulated) {
        this.receivedErrorPacketsAccumulated = receivedErrorPacketsAccumulated;
    }

    @JsonProperty("receivedErrorPacketsDelta")
    public Double getReceivedErrorPacketsDelta() {
        return receivedErrorPacketsDelta;
    }

    @JsonProperty("receivedErrorPacketsDelta")
    public void setReceivedErrorPacketsDelta(Double receivedErrorPacketsDelta) {
        this.receivedErrorPacketsDelta = receivedErrorPacketsDelta;
    }

    @JsonProperty("receivedMulticastPacketsAccumulated")
    public Double getReceivedMulticastPacketsAccumulated() {
        return receivedMulticastPacketsAccumulated;
    }

    @JsonProperty("receivedMulticastPacketsAccumulated")
    public void setReceivedMulticastPacketsAccumulated(Double receivedMulticastPacketsAccumulated) {
        this.receivedMulticastPacketsAccumulated = receivedMulticastPacketsAccumulated;
    }

    @JsonProperty("receivedMulticastPacketsDelta")
    public Double getReceivedMulticastPacketsDelta() {
        return receivedMulticastPacketsDelta;
    }

    @JsonProperty("receivedMulticastPacketsDelta")
    public void setReceivedMulticastPacketsDelta(Double receivedMulticastPacketsDelta) {
        this.receivedMulticastPacketsDelta = receivedMulticastPacketsDelta;
    }

    @JsonProperty("receivedOctetsAccumulated")
    public Double getReceivedOctetsAccumulated() {
        return receivedOctetsAccumulated;
    }

    @JsonProperty("receivedOctetsAccumulated")
    public void setReceivedOctetsAccumulated(Double receivedOctetsAccumulated) {
        this.receivedOctetsAccumulated = receivedOctetsAccumulated;
    }

    @JsonProperty("receivedOctetsDelta")
    public Double getReceivedOctetsDelta() {
        return receivedOctetsDelta;
    }

    @JsonProperty("receivedOctetsDelta")
    public void setReceivedOctetsDelta(Double receivedOctetsDelta) {
        this.receivedOctetsDelta = receivedOctetsDelta;
    }

    @JsonProperty("receivedTotalPacketsAccumulated")
    public Double getReceivedTotalPacketsAccumulated() {
        return receivedTotalPacketsAccumulated;
    }

    @JsonProperty("receivedTotalPacketsAccumulated")
    public void setReceivedTotalPacketsAccumulated(Double receivedTotalPacketsAccumulated) {
        this.receivedTotalPacketsAccumulated = receivedTotalPacketsAccumulated;
    }

    @JsonProperty("receivedTotalPacketsDelta")
    public Double getReceivedTotalPacketsDelta() {
        return receivedTotalPacketsDelta;
    }

    @JsonProperty("receivedTotalPacketsDelta")
    public void setReceivedTotalPacketsDelta(Double receivedTotalPacketsDelta) {
        this.receivedTotalPacketsDelta = receivedTotalPacketsDelta;
    }

    @JsonProperty("receivedUnicastPacketsAccumulated")
    public Double getReceivedUnicastPacketsAccumulated() {
        return receivedUnicastPacketsAccumulated;
    }

    @JsonProperty("receivedUnicastPacketsAccumulated")
    public void setReceivedUnicastPacketsAccumulated(Double receivedUnicastPacketsAccumulated) {
        this.receivedUnicastPacketsAccumulated = receivedUnicastPacketsAccumulated;
    }

    @JsonProperty("receivedUnicastPacketsDelta")
    public Double getReceivedUnicastPacketsDelta() {
        return receivedUnicastPacketsDelta;
    }

    @JsonProperty("receivedUnicastPacketsDelta")
    public void setReceivedUnicastPacketsDelta(Double receivedUnicastPacketsDelta) {
        this.receivedUnicastPacketsDelta = receivedUnicastPacketsDelta;
    }

    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public Double getTransmittedBroadcastPacketsAccumulated() {
        return transmittedBroadcastPacketsAccumulated;
    }

    @JsonProperty("transmittedBroadcastPacketsAccumulated")
    public void setTransmittedBroadcastPacketsAccumulated(Double transmittedBroadcastPacketsAccumulated) {
        this.transmittedBroadcastPacketsAccumulated = transmittedBroadcastPacketsAccumulated;
    }

    @JsonProperty("transmittedBroadcastPacketsDelta")
    public Double getTransmittedBroadcastPacketsDelta() {
        return transmittedBroadcastPacketsDelta;
    }

    @JsonProperty("transmittedBroadcastPacketsDelta")
    public void setTransmittedBroadcastPacketsDelta(Double transmittedBroadcastPacketsDelta) {
        this.transmittedBroadcastPacketsDelta = transmittedBroadcastPacketsDelta;
    }

    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public Double getTransmittedDiscardedPacketsAccumulated() {
        return transmittedDiscardedPacketsAccumulated;
    }

    @JsonProperty("transmittedDiscardedPacketsAccumulated")
    public void setTransmittedDiscardedPacketsAccumulated(Double transmittedDiscardedPacketsAccumulated) {
        this.transmittedDiscardedPacketsAccumulated = transmittedDiscardedPacketsAccumulated;
    }

    @JsonProperty("transmittedDiscardedPacketsDelta")
    public Double getTransmittedDiscardedPacketsDelta() {
        return transmittedDiscardedPacketsDelta;
    }

    @JsonProperty("transmittedDiscardedPacketsDelta")
    public void setTransmittedDiscardedPacketsDelta(Double transmittedDiscardedPacketsDelta) {
        this.transmittedDiscardedPacketsDelta = transmittedDiscardedPacketsDelta;
    }

    @JsonProperty("transmittedErrorPacketsAccumulated")
    public Double getTransmittedErrorPacketsAccumulated() {
        return transmittedErrorPacketsAccumulated;
    }

    @JsonProperty("transmittedErrorPacketsAccumulated")
    public void setTransmittedErrorPacketsAccumulated(Double transmittedErrorPacketsAccumulated) {
        this.transmittedErrorPacketsAccumulated = transmittedErrorPacketsAccumulated;
    }

    @JsonProperty("transmittedErrorPacketsDelta")
    public Double getTransmittedErrorPacketsDelta() {
        return transmittedErrorPacketsDelta;
    }

    @JsonProperty("transmittedErrorPacketsDelta")
    public void setTransmittedErrorPacketsDelta(Double transmittedErrorPacketsDelta) {
        this.transmittedErrorPacketsDelta = transmittedErrorPacketsDelta;
    }

    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public Double getTransmittedMulticastPacketsAccumulated() {
        return transmittedMulticastPacketsAccumulated;
    }

    @JsonProperty("transmittedMulticastPacketsAccumulated")
    public void setTransmittedMulticastPacketsAccumulated(Double transmittedMulticastPacketsAccumulated) {
        this.transmittedMulticastPacketsAccumulated = transmittedMulticastPacketsAccumulated;
    }

    @JsonProperty("transmittedMulticastPacketsDelta")
    public Double getTransmittedMulticastPacketsDelta() {
        return transmittedMulticastPacketsDelta;
    }

    @JsonProperty("transmittedMulticastPacketsDelta")
    public void setTransmittedMulticastPacketsDelta(Double transmittedMulticastPacketsDelta) {
        this.transmittedMulticastPacketsDelta = transmittedMulticastPacketsDelta;
    }

    @JsonProperty("transmittedOctetsAccumulated")
    public Double getTransmittedOctetsAccumulated() {
        return transmittedOctetsAccumulated;
    }

    @JsonProperty("transmittedOctetsAccumulated")
    public void setTransmittedOctetsAccumulated(Double transmittedOctetsAccumulated) {
        this.transmittedOctetsAccumulated = transmittedOctetsAccumulated;
    }

    @JsonProperty("transmittedOctetsDelta")
    public Double getTransmittedOctetsDelta() {
        return transmittedOctetsDelta;
    }

    @JsonProperty("transmittedOctetsDelta")
    public void setTransmittedOctetsDelta(Double transmittedOctetsDelta) {
        this.transmittedOctetsDelta = transmittedOctetsDelta;
    }

    @JsonProperty("transmittedTotalPacketsAccumulated")
    public Double getTransmittedTotalPacketsAccumulated() {
        return transmittedTotalPacketsAccumulated;
    }

    @JsonProperty("transmittedTotalPacketsAccumulated")
    public void setTransmittedTotalPacketsAccumulated(Double transmittedTotalPacketsAccumulated) {
        this.transmittedTotalPacketsAccumulated = transmittedTotalPacketsAccumulated;
    }

    @JsonProperty("transmittedTotalPacketsDelta")
    public Double getTransmittedTotalPacketsDelta() {
        return transmittedTotalPacketsDelta;
    }

    @JsonProperty("transmittedTotalPacketsDelta")
    public void setTransmittedTotalPacketsDelta(Double transmittedTotalPacketsDelta) {
        this.transmittedTotalPacketsDelta = transmittedTotalPacketsDelta;
    }

    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public Double getTransmittedUnicastPacketsAccumulated() {
        return transmittedUnicastPacketsAccumulated;
    }

    @JsonProperty("transmittedUnicastPacketsAccumulated")
    public void setTransmittedUnicastPacketsAccumulated(Double transmittedUnicastPacketsAccumulated) {
        this.transmittedUnicastPacketsAccumulated = transmittedUnicastPacketsAccumulated;
    }

    @JsonProperty("transmittedUnicastPacketsDelta")
    public Double getTransmittedUnicastPacketsDelta() {
        return transmittedUnicastPacketsDelta;
    }

    @JsonProperty("transmittedUnicastPacketsDelta")
    public void setTransmittedUnicastPacketsDelta(Double transmittedUnicastPacketsDelta) {
        this.transmittedUnicastPacketsDelta = transmittedUnicastPacketsDelta;
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
