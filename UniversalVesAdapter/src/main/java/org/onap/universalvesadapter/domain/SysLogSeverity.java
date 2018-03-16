package org.onap.universalvesadapter.domain;

public enum SysLogSeverity {

	SEVERITY_EMERGENCY("Emergency"),
	/** system is unusable */
	SEVERITY_ALERT("Alert"),
	/** action must be taken immediately */
	SEVERITY_CRITICAL("Critical"),
	/** critical conditions */
	SEVERITY_ERROR("Error"),
	/** error conditions */
	SEVERITY_WARNING("Warning"),
	/** warning conditions */
	SEVERITY_NOTICE("Notice"),
	/** normal but significant condition */
	SEVERITY_INFO("Info"),
	/** Informational: informational messages */
	SEVERITY_DEBUG("Debug");
	/** debug-level messages */
	
	private final String value;

	private SysLogSeverity(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
