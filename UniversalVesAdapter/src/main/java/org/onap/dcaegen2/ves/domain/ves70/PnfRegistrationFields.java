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

import java.util.HashMap;
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
 * hardware device registration fields
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalFields",
    "lastServiceDate",
    "macAddress",
    "manufactureDate",
    "modelNumber",
    "oamV4IpAddress",
    "oamV6IpAddress",
    "pnfRegistrationFieldsVersion",
    "serialNumber",
    "softwareVersion",
    "unitFamily",
    "unitType",
    "vendorName"
})
public class PnfRegistrationFields {

    /**
     * an associative array which is an array of key:value pairs
     * 
     */
    @JsonProperty("additionalFields")
    @JsonPropertyDescription("an associative array which is an array of key:value pairs")
    private AlarmAdditionalInformation additionalFields;
    /**
     * TS 32.692 dateOfLastService = date of last service; e.g. 15022017
     * 
     */
    @JsonProperty("lastServiceDate")
    @JsonPropertyDescription("TS 32.692 dateOfLastService = date of last service; e.g. 15022017")
    private String lastServiceDate;
    /**
     * MAC address of OAM interface of the unit
     * 
     */
    @JsonProperty("macAddress")
    @JsonPropertyDescription("MAC address of OAM interface of the unit")
    private String macAddress;
    /**
     * TS 32.692 dateOfManufacture = manufacture date of the unit; 24032016
     * 
     */
    @JsonProperty("manufactureDate")
    @JsonPropertyDescription("TS 32.692 dateOfManufacture = manufacture date of the unit; 24032016")
    private String manufactureDate;
    /**
     * TS 32.692 versionNumber = version of the unit from vendor; e.g. AJ02.  Maps to AAI equip-model
     * 
     */
    @JsonProperty("modelNumber")
    @JsonPropertyDescription("TS 32.692 versionNumber = version of the unit from vendor; e.g. AJ02.  Maps to AAI equip-model")
    private String modelNumber;
    /**
     * IPv4 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV4IpAddress")
    @JsonPropertyDescription("IPv4 m-plane IP address to be used by the manager to contact the PNF")
    private String oamV4IpAddress;
    /**
     * IPv6 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV6IpAddress")
    @JsonPropertyDescription("IPv6 m-plane IP address to be used by the manager to contact the PNF")
    private String oamV6IpAddress;
    /**
     * version of the pnfRegistrationFields block
     * (Required)
     * 
     */
    @JsonProperty("pnfRegistrationFieldsVersion")
    @JsonPropertyDescription("version of the pnfRegistrationFields block")
    private PnfRegistrationFields.PnfRegistrationFieldsVersion pnfRegistrationFieldsVersion;
    /**
     * TS 32.692 serialNumber = serial number of the unit; e.g. 6061ZW3
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("TS 32.692 serialNumber = serial number of the unit; e.g. 6061ZW3")
    private String serialNumber;
    /**
     * TS 32.692 swName = active SW running on the unit; e.g. 5gDUv18.05.201
     * 
     */
    @JsonProperty("softwareVersion")
    @JsonPropertyDescription("TS 32.692 swName = active SW running on the unit; e.g. 5gDUv18.05.201")
    private String softwareVersion;
    /**
     * TS 32.692 vendorUnitFamilyType = general type of HW unit; e.g. BBU
     * 
     */
    @JsonProperty("unitFamily")
    @JsonPropertyDescription("TS 32.692 vendorUnitFamilyType = general type of HW unit; e.g. BBU")
    private String unitFamily;
    /**
     * TS 32.692 vendorUnitTypeNumber = vendor name for the unit; e.g. Airscale
     * 
     */
    @JsonProperty("unitType")
    @JsonPropertyDescription("TS 32.692 vendorUnitTypeNumber = vendor name for the unit; e.g. Airscale")
    private String unitType;
    /**
     * TS 32.692 vendorName = name of manufacturer; e.g. Nokia. Maps to AAI equip-vendor
     * 
     */
    @JsonProperty("vendorName")
    @JsonPropertyDescription("TS 32.692 vendorName = name of manufacturer; e.g. Nokia. Maps to AAI equip-vendor")
    private String vendorName;

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
     * TS 32.692 dateOfLastService = date of last service; e.g. 15022017
     * 
     */
    @JsonProperty("lastServiceDate")
    public String getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * TS 32.692 dateOfLastService = date of last service; e.g. 15022017
     * 
     */
    @JsonProperty("lastServiceDate")
    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    /**
     * MAC address of OAM interface of the unit
     * 
     */
    @JsonProperty("macAddress")
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * MAC address of OAM interface of the unit
     * 
     */
    @JsonProperty("macAddress")
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * TS 32.692 dateOfManufacture = manufacture date of the unit; 24032016
     * 
     */
    @JsonProperty("manufactureDate")
    public String getManufactureDate() {
        return manufactureDate;
    }

    /**
     * TS 32.692 dateOfManufacture = manufacture date of the unit; 24032016
     * 
     */
    @JsonProperty("manufactureDate")
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * TS 32.692 versionNumber = version of the unit from vendor; e.g. AJ02.  Maps to AAI equip-model
     * 
     */
    @JsonProperty("modelNumber")
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * TS 32.692 versionNumber = version of the unit from vendor; e.g. AJ02.  Maps to AAI equip-model
     * 
     */
    @JsonProperty("modelNumber")
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * IPv4 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV4IpAddress")
    public String getOamV4IpAddress() {
        return oamV4IpAddress;
    }

    /**
     * IPv4 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV4IpAddress")
    public void setOamV4IpAddress(String oamV4IpAddress) {
        this.oamV4IpAddress = oamV4IpAddress;
    }

    /**
     * IPv6 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV6IpAddress")
    public String getOamV6IpAddress() {
        return oamV6IpAddress;
    }

    /**
     * IPv6 m-plane IP address to be used by the manager to contact the PNF
     * 
     */
    @JsonProperty("oamV6IpAddress")
    public void setOamV6IpAddress(String oamV6IpAddress) {
        this.oamV6IpAddress = oamV6IpAddress;
    }

    /**
     * version of the pnfRegistrationFields block
     * (Required)
     * 
     */
    @JsonProperty("pnfRegistrationFieldsVersion")
    public PnfRegistrationFields.PnfRegistrationFieldsVersion getPnfRegistrationFieldsVersion() {
        return pnfRegistrationFieldsVersion;
    }

    /**
     * version of the pnfRegistrationFields block
     * (Required)
     * 
     */
    @JsonProperty("pnfRegistrationFieldsVersion")
    public void setPnfRegistrationFieldsVersion(PnfRegistrationFields.PnfRegistrationFieldsVersion pnfRegistrationFieldsVersion) {
        this.pnfRegistrationFieldsVersion = pnfRegistrationFieldsVersion;
    }

    /**
     * TS 32.692 serialNumber = serial number of the unit; e.g. 6061ZW3
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * TS 32.692 serialNumber = serial number of the unit; e.g. 6061ZW3
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * TS 32.692 swName = active SW running on the unit; e.g. 5gDUv18.05.201
     * 
     */
    @JsonProperty("softwareVersion")
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * TS 32.692 swName = active SW running on the unit; e.g. 5gDUv18.05.201
     * 
     */
    @JsonProperty("softwareVersion")
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * TS 32.692 vendorUnitFamilyType = general type of HW unit; e.g. BBU
     * 
     */
    @JsonProperty("unitFamily")
    public String getUnitFamily() {
        return unitFamily;
    }

    /**
     * TS 32.692 vendorUnitFamilyType = general type of HW unit; e.g. BBU
     * 
     */
    @JsonProperty("unitFamily")
    public void setUnitFamily(String unitFamily) {
        this.unitFamily = unitFamily;
    }

    /**
     * TS 32.692 vendorUnitTypeNumber = vendor name for the unit; e.g. Airscale
     * 
     */
    @JsonProperty("unitType")
    public String getUnitType() {
        return unitType;
    }

    /**
     * TS 32.692 vendorUnitTypeNumber = vendor name for the unit; e.g. Airscale
     * 
     */
    @JsonProperty("unitType")
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * TS 32.692 vendorName = name of manufacturer; e.g. Nokia. Maps to AAI equip-vendor
     * 
     */
    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * TS 32.692 vendorName = name of manufacturer; e.g. Nokia. Maps to AAI equip-vendor
     * 
     */
    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalFields).append(lastServiceDate).append(macAddress).append(manufactureDate).append(modelNumber).append(oamV4IpAddress).append(oamV6IpAddress).append(pnfRegistrationFieldsVersion).append(serialNumber).append(softwareVersion).append(unitFamily).append(unitType).append(vendorName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PnfRegistrationFields) == false) {
            return false;
        }
        PnfRegistrationFields rhs = ((PnfRegistrationFields) other);
        return new EqualsBuilder().append(additionalFields, rhs.additionalFields).append(lastServiceDate, rhs.lastServiceDate).append(macAddress, rhs.macAddress).append(manufactureDate, rhs.manufactureDate).append(modelNumber, rhs.modelNumber).append(oamV4IpAddress, rhs.oamV4IpAddress).append(oamV6IpAddress, rhs.oamV6IpAddress).append(pnfRegistrationFieldsVersion, rhs.pnfRegistrationFieldsVersion).append(serialNumber, rhs.serialNumber).append(softwareVersion, rhs.softwareVersion).append(unitFamily, rhs.unitFamily).append(unitType, rhs.unitType).append(vendorName, rhs.vendorName).isEquals();
    }

    public enum PnfRegistrationFieldsVersion {

        _2_0("2.0");
        private final String value;
        private final static Map<String, PnfRegistrationFields.PnfRegistrationFieldsVersion> CONSTANTS = new HashMap<String, PnfRegistrationFields.PnfRegistrationFieldsVersion>();

        static {
            for (PnfRegistrationFields.PnfRegistrationFieldsVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PnfRegistrationFieldsVersion(String value) {
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
        public static PnfRegistrationFields.PnfRegistrationFieldsVersion fromValue(String value) {
            PnfRegistrationFields.PnfRegistrationFieldsVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
