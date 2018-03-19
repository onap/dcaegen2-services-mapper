package org.onap.universalvesadapter.domain;

import org.springframework.data.annotation.Id;

/**
 * A domain wrapper class for saving the config file in Mongo DB 
 * 
 * @author kmalbari
 *
 */
public class ConfigFileData {
	
	
	@Id private String id;

	private String xmlFileName;
	
	private String xmlContent;

	public String getXmlFileName() {
		return xmlFileName;
	}

	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

	public String getXmlContent() {
		return xmlContent;
	}

	public void setXmlContent(String xmlContent) {
		this.xmlContent = xmlContent;
	}
	
	
	
}
