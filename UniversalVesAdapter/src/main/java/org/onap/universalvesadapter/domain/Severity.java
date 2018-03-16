package org.onap.universalvesadapter.domain;

public enum Severity {
	  SEVERITY_CRITICAL("CRITICAL"),
	  SEVERITY_MAJOR("MAJOR"),
	  SEVERITY_MINOR("MINOR"),
	  SEVERITY_WARNING("WARNING"),
	  SEVERITY_NORMAL("NORMAL");
	  
	  private final String value;

	    private Severity(final String value) {
	        this.value = value;
	    }

	    public String getValue() { return value; }
}
