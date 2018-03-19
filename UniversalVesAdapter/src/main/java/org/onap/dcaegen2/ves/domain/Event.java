
package org.onap.dcaegen2.ves.domain;

import java.util.HashMap;
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
    "commonEventHeader",
    "faultFields",
    "heartbeatFields",
    "otherFields",
    
})
public class Event {

    @JsonProperty("commonEventHeader")
    private CommonEventHeader commonEventHeader;
    @JsonProperty("faultFields")
    private FaultFields faultFields;
    @JsonProperty("heartbeatFields")
    private HeartbeatFields heartbeatFields;
    @JsonProperty("otherFields")
    private OtherFields otherFields;
  
   
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commonEventHeader")
    public CommonEventHeader getCommonEventHeader() {
        return commonEventHeader;
    }

    @JsonProperty("commonEventHeader")
    public void setCommonEventHeader(CommonEventHeader commonEventHeader) {
        this.commonEventHeader = commonEventHeader;
    }

    @JsonProperty("faultFields")
    public FaultFields getFaultFields() {
        return faultFields;
    }

    @JsonProperty("faultFields")
    public void setFaultFields(FaultFields faultFields) {
        this.faultFields = faultFields;
    }

    @JsonProperty("heartbeatFields")
    public HeartbeatFields getHeartbeatFields() {
        return heartbeatFields;
    }

    @JsonProperty("heartbeatFields")
    public void setHeartbeatFields(HeartbeatFields heartbeatFields) {
        this.heartbeatFields = heartbeatFields;
    }

    

    @JsonProperty("otherFields")
    public OtherFields getOtherFields() {
        return otherFields;
    }

    @JsonProperty("otherFields")
    public void setOtherFields(OtherFields otherFields) {
        this.otherFields = otherFields;
    }
   
    
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("commonEventHeader", commonEventHeader).append("faultFields", faultFields).append("heartbeatFields", heartbeatFields).append("otherFields", otherFields).toString();
    }

    @Override
    public int hashCode() {
    	 return new HashCodeBuilder().append(heartbeatFields).append(otherFields).append(commonEventHeader).append(additionalProperties).append(faultFields).toHashCode();    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(heartbeatFields, rhs.heartbeatFields).append(otherFields, rhs.otherFields).append(commonEventHeader, rhs.commonEventHeader).append(additionalProperties, rhs.additionalProperties).append(faultFields, rhs.faultFields).isEquals();
    }

}
