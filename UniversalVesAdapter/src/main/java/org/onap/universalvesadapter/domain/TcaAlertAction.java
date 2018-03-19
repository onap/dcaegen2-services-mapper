package org.onap.universalvesadapter.domain;

public enum TcaAlertAction {
	SET("SET"), CONTINUE("CONT"), CLEAR("CLEAR");
	private final String value;

	private TcaAlertAction(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
