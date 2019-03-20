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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * intelligent platform management interface metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exitAirTemperature",
    "frontPanelTemperature",
    "ioModuleTemperature",
    "ipmiBaseboardTemperatureArray",
    "ipmiBaseboardVoltageRegulatorArray",
    "ipmiBatteryArray",
    "ipmiFanArray",
    "ipmiHsbpArray",
    "ipmiGlobalAggregateTemperatureMarginArray",
    "ipmiNicArray",
    "ipmiPowerSupplyArray",
    "ipmiProcessorArray",
    "systemAirflow"
})
public class Ipmi {

    /**
     * system fan exit air flow temperature in celsius
     * 
     */
    @JsonProperty("exitAirTemperature")
    @JsonPropertyDescription("system fan exit air flow temperature in celsius")
    private Double exitAirTemperature;
    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("frontPanelTemperature")
    @JsonPropertyDescription("front panel temperature in celsius")
    private Double frontPanelTemperature;
    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("ioModuleTemperature")
    @JsonPropertyDescription("io module temperature in celsius")
    private Double ioModuleTemperature;
    /**
     * array of ipmiBaseboardTemperature objects
     * 
     */
    @JsonProperty("ipmiBaseboardTemperatureArray")
    @JsonPropertyDescription("array of ipmiBaseboardTemperature objects")
    private List<IpmiBaseboardTemperatureArray> ipmiBaseboardTemperatureArray = new ArrayList<IpmiBaseboardTemperatureArray>();
    /**
     * array of ipmiBaseboardVoltageRegulator objects
     * 
     */
    @JsonProperty("ipmiBaseboardVoltageRegulatorArray")
    @JsonPropertyDescription("array of ipmiBaseboardVoltageRegulator objects")
    private List<IpmiBaseboardVoltageRegulatorArray> ipmiBaseboardVoltageRegulatorArray = new ArrayList<IpmiBaseboardVoltageRegulatorArray>();
    /**
     * array of ipmiBattery objects
     * 
     */
    @JsonProperty("ipmiBatteryArray")
    @JsonPropertyDescription("array of ipmiBattery objects")
    private List<IpmiBatteryArray> ipmiBatteryArray = new ArrayList<IpmiBatteryArray>();
    /**
     * array of ipmiFan objects
     * 
     */
    @JsonProperty("ipmiFanArray")
    @JsonPropertyDescription("array of ipmiFan objects")
    private List<IpmiFanArray> ipmiFanArray = new ArrayList<IpmiFanArray>();
    /**
     * array of ipmiHsbp objects
     * 
     */
    @JsonProperty("ipmiHsbpArray")
    @JsonPropertyDescription("array of ipmiHsbp objects")
    private List<IpmiHsbpArray> ipmiHsbpArray = new ArrayList<IpmiHsbpArray>();
    /**
     * array of ipmiGlobalAggregateTemperatureMargin objects
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginArray")
    @JsonPropertyDescription("array of ipmiGlobalAggregateTemperatureMargin objects")
    private List<IpmiGlobalAggregateTemperatureMarginArray> ipmiGlobalAggregateTemperatureMarginArray = new ArrayList<IpmiGlobalAggregateTemperatureMarginArray>();
    /**
     * array of ipmiNic objects
     * 
     */
    @JsonProperty("ipmiNicArray")
    @JsonPropertyDescription("array of ipmiNic objects")
    private List<IpmiNicArray> ipmiNicArray = new ArrayList<IpmiNicArray>();
    /**
     * array of ipmiPowerSupply objects
     * 
     */
    @JsonProperty("ipmiPowerSupplyArray")
    @JsonPropertyDescription("array of ipmiPowerSupply objects")
    private List<IpmiPowerSupplyArray> ipmiPowerSupplyArray = new ArrayList<IpmiPowerSupplyArray>();
    /**
     * array of ipmiProcessor objects
     * 
     */
    @JsonProperty("ipmiProcessorArray")
    @JsonPropertyDescription("array of ipmiProcessor objects")
    private List<IpmiProcessorArray> ipmiProcessorArray = new ArrayList<IpmiProcessorArray>();
    /**
     * airfflow in cubic feet per minute (cfm)
     * 
     */
    @JsonProperty("systemAirflow")
    @JsonPropertyDescription("airfflow in cubic feet per minute (cfm)")
    private Double systemAirflow;

    /**
     * system fan exit air flow temperature in celsius
     * 
     */
    @JsonProperty("exitAirTemperature")
    public Double getExitAirTemperature() {
        return exitAirTemperature;
    }

    /**
     * system fan exit air flow temperature in celsius
     * 
     */
    @JsonProperty("exitAirTemperature")
    public void setExitAirTemperature(Double exitAirTemperature) {
        this.exitAirTemperature = exitAirTemperature;
    }

    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("frontPanelTemperature")
    public Double getFrontPanelTemperature() {
        return frontPanelTemperature;
    }

    /**
     * front panel temperature in celsius
     * 
     */
    @JsonProperty("frontPanelTemperature")
    public void setFrontPanelTemperature(Double frontPanelTemperature) {
        this.frontPanelTemperature = frontPanelTemperature;
    }

    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("ioModuleTemperature")
    public Double getIoModuleTemperature() {
        return ioModuleTemperature;
    }

    /**
     * io module temperature in celsius
     * 
     */
    @JsonProperty("ioModuleTemperature")
    public void setIoModuleTemperature(Double ioModuleTemperature) {
        this.ioModuleTemperature = ioModuleTemperature;
    }

    /**
     * array of ipmiBaseboardTemperature objects
     * 
     */
    @JsonProperty("ipmiBaseboardTemperatureArray")
    public List<IpmiBaseboardTemperatureArray> getIpmiBaseboardTemperatureArray() {
        return ipmiBaseboardTemperatureArray;
    }

    /**
     * array of ipmiBaseboardTemperature objects
     * 
     */
    @JsonProperty("ipmiBaseboardTemperatureArray")
    public void setIpmiBaseboardTemperatureArray(List<IpmiBaseboardTemperatureArray> ipmiBaseboardTemperatureArray) {
        this.ipmiBaseboardTemperatureArray = ipmiBaseboardTemperatureArray;
    }

    /**
     * array of ipmiBaseboardVoltageRegulator objects
     * 
     */
    @JsonProperty("ipmiBaseboardVoltageRegulatorArray")
    public List<IpmiBaseboardVoltageRegulatorArray> getIpmiBaseboardVoltageRegulatorArray() {
        return ipmiBaseboardVoltageRegulatorArray;
    }

    /**
     * array of ipmiBaseboardVoltageRegulator objects
     * 
     */
    @JsonProperty("ipmiBaseboardVoltageRegulatorArray")
    public void setIpmiBaseboardVoltageRegulatorArray(List<IpmiBaseboardVoltageRegulatorArray> ipmiBaseboardVoltageRegulatorArray) {
        this.ipmiBaseboardVoltageRegulatorArray = ipmiBaseboardVoltageRegulatorArray;
    }

    /**
     * array of ipmiBattery objects
     * 
     */
    @JsonProperty("ipmiBatteryArray")
    public List<IpmiBatteryArray> getIpmiBatteryArray() {
        return ipmiBatteryArray;
    }

    /**
     * array of ipmiBattery objects
     * 
     */
    @JsonProperty("ipmiBatteryArray")
    public void setIpmiBatteryArray(List<IpmiBatteryArray> ipmiBatteryArray) {
        this.ipmiBatteryArray = ipmiBatteryArray;
    }

    /**
     * array of ipmiFan objects
     * 
     */
    @JsonProperty("ipmiFanArray")
    public List<IpmiFanArray> getIpmiFanArray() {
        return ipmiFanArray;
    }

    /**
     * array of ipmiFan objects
     * 
     */
    @JsonProperty("ipmiFanArray")
    public void setIpmiFanArray(List<IpmiFanArray> ipmiFanArray) {
        this.ipmiFanArray = ipmiFanArray;
    }

    /**
     * array of ipmiHsbp objects
     * 
     */
    @JsonProperty("ipmiHsbpArray")
    public List<IpmiHsbpArray> getIpmiHsbpArray() {
        return ipmiHsbpArray;
    }

    /**
     * array of ipmiHsbp objects
     * 
     */
    @JsonProperty("ipmiHsbpArray")
    public void setIpmiHsbpArray(List<IpmiHsbpArray> ipmiHsbpArray) {
        this.ipmiHsbpArray = ipmiHsbpArray;
    }

    /**
     * array of ipmiGlobalAggregateTemperatureMargin objects
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginArray")
    public List<IpmiGlobalAggregateTemperatureMarginArray> getIpmiGlobalAggregateTemperatureMarginArray() {
        return ipmiGlobalAggregateTemperatureMarginArray;
    }

    /**
     * array of ipmiGlobalAggregateTemperatureMargin objects
     * 
     */
    @JsonProperty("ipmiGlobalAggregateTemperatureMarginArray")
    public void setIpmiGlobalAggregateTemperatureMarginArray(List<IpmiGlobalAggregateTemperatureMarginArray> ipmiGlobalAggregateTemperatureMarginArray) {
        this.ipmiGlobalAggregateTemperatureMarginArray = ipmiGlobalAggregateTemperatureMarginArray;
    }

    /**
     * array of ipmiNic objects
     * 
     */
    @JsonProperty("ipmiNicArray")
    public List<IpmiNicArray> getIpmiNicArray() {
        return ipmiNicArray;
    }

    /**
     * array of ipmiNic objects
     * 
     */
    @JsonProperty("ipmiNicArray")
    public void setIpmiNicArray(List<IpmiNicArray> ipmiNicArray) {
        this.ipmiNicArray = ipmiNicArray;
    }

    /**
     * array of ipmiPowerSupply objects
     * 
     */
    @JsonProperty("ipmiPowerSupplyArray")
    public List<IpmiPowerSupplyArray> getIpmiPowerSupplyArray() {
        return ipmiPowerSupplyArray;
    }

    /**
     * array of ipmiPowerSupply objects
     * 
     */
    @JsonProperty("ipmiPowerSupplyArray")
    public void setIpmiPowerSupplyArray(List<IpmiPowerSupplyArray> ipmiPowerSupplyArray) {
        this.ipmiPowerSupplyArray = ipmiPowerSupplyArray;
    }

    /**
     * array of ipmiProcessor objects
     * 
     */
    @JsonProperty("ipmiProcessorArray")
    public List<IpmiProcessorArray> getIpmiProcessorArray() {
        return ipmiProcessorArray;
    }

    /**
     * array of ipmiProcessor objects
     * 
     */
    @JsonProperty("ipmiProcessorArray")
    public void setIpmiProcessorArray(List<IpmiProcessorArray> ipmiProcessorArray) {
        this.ipmiProcessorArray = ipmiProcessorArray;
    }

    /**
     * airfflow in cubic feet per minute (cfm)
     * 
     */
    @JsonProperty("systemAirflow")
    public Double getSystemAirflow() {
        return systemAirflow;
    }

    /**
     * airfflow in cubic feet per minute (cfm)
     * 
     */
    @JsonProperty("systemAirflow")
    public void setSystemAirflow(Double systemAirflow) {
        this.systemAirflow = systemAirflow;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exitAirTemperature).append(frontPanelTemperature).append(ioModuleTemperature).append(ipmiBaseboardTemperatureArray).append(ipmiBaseboardVoltageRegulatorArray).append(ipmiBatteryArray).append(ipmiFanArray).append(ipmiHsbpArray).append(ipmiGlobalAggregateTemperatureMarginArray).append(ipmiNicArray).append(ipmiPowerSupplyArray).append(ipmiProcessorArray).append(systemAirflow).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ipmi) == false) {
            return false;
        }
        Ipmi rhs = ((Ipmi) other);
        return new EqualsBuilder().append(exitAirTemperature, rhs.exitAirTemperature).append(frontPanelTemperature, rhs.frontPanelTemperature).append(ioModuleTemperature, rhs.ioModuleTemperature).append(ipmiBaseboardTemperatureArray, rhs.ipmiBaseboardTemperatureArray).append(ipmiBaseboardVoltageRegulatorArray, rhs.ipmiBaseboardVoltageRegulatorArray).append(ipmiBatteryArray, rhs.ipmiBatteryArray).append(ipmiFanArray, rhs.ipmiFanArray).append(ipmiHsbpArray, rhs.ipmiHsbpArray).append(ipmiGlobalAggregateTemperatureMarginArray, rhs.ipmiGlobalAggregateTemperatureMarginArray).append(ipmiNicArray, rhs.ipmiNicArray).append(ipmiPowerSupplyArray, rhs.ipmiPowerSupplyArray).append(ipmiProcessorArray, rhs.ipmiProcessorArray).append(systemAirflow, rhs.systemAirflow).isEquals();
    }

}
