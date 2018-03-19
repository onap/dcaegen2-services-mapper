package org.onap.universalvesadapter.domain;

public enum Priorities {
	HIGH("High"), MEDIUM("Medium"), NORMAL("Normal"), LOW("Low");
	
	private final String value;

	private Priorities(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
