package org.onap.universalvesadapter.domain;

public enum Domains {

	DOMAIN_FAULT("fault"),
	/** A Fault event. */
	DOMAIN_HEARTBEAT("heartbeat"),
	/** A Heartbeat event (event header only). */
	DOMAIN_MEASUREMENT_FOR_VFSCALLING("measurementsForVfScaling"),
	/** A Measurement for VF Scaling event. */
	DOMAIN_MOBILE_FLOW("mobileFlow"),
	/** A Mobile Flow event. */
	DOMAIN_OTHER("other"),
	/** Another event. */
	DOMAIN_SIPSIGNALING("sipSignaling"),
	/** A Signaling event. */
	DOMAIN_STATE_CHANGE("stateChange"),
	/** A State Change event. */
	DOMAIN_SYSLOG("syslog"),
	/** A Syslog event. */
	DOMAIN_THRESHOLD_CROSSING_ALERT("thresholdCrossingAlert"),
	/** A Threshold crossing alert Event */
	DOMAIN_VOICE_QUALITY("voiceQuality");
	/** A Voice Quality Event                     */
    
	private final String value;

	private Domains(final String value) {
      this.value = value;
	}

	public String getValue() {
		return value;
	}

}
