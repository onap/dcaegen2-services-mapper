package org.onap.universalvesadapter.domain;

public enum TcaAlertType {
	CARD_ANOMALY("CARD-ANOMALY"), INTERFACE_ANOMALY("INTERFACE_ANOMALY"), ELEMENT_ANOMALY(
			"ELEMENT-ANOMALY"), SERVICE_ANOMALY("SERVICE-ANOMALY");
	private final String value;

	private TcaAlertType(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
