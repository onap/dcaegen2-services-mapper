package org.onap.universalvesadapter.domain;

public enum TcaCounterCriticality {
	CRITICAL("CRIT"), MAJOR("MAJ");
	private final String value;

	private TcaCounterCriticality(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
