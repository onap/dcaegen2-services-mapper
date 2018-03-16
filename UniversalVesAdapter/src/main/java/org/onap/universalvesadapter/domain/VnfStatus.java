package org.onap.universalvesadapter.domain;

public enum VnfStatus {
	
	  VFSTATUS_ACTIVE("Active"),
	  VFSTATUS_IDLE("Idle"),
	  VFSTATUS_PREP_TERMINATE("Preparing to terminate"),
	  VFSTATUS_READY_TERMINATE("Ready to terminate"),
	  VFSTATUS_REQ_TERMINATE("Requesting Termination");
	
	  private final String value;

	    private VnfStatus(final String value) {
	        this.value = value;
	    }

	    public String getValue() { return value; }
}
