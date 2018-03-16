package org.onap.universalvesadapter.domain;

public enum State {
	STATE_IN_SERVICE("inService"), STATE_MAINTENANCE("maintenance"), STATE_OUT_OF_SERVICE("outOfService");
	private final String value;

	private State(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
