package com.cisco.b2b.beans;

import org.springframework.data.mongodb.core.mapping.Field;

public class TransactionProperty {

	@Field("PropertyID")	
	private int PropertId;

	@Field("PropertyValue")	
	private String propertValue;


	public int getPropertId() {
		return PropertId;
	}
	public void setPropertId(int propertId) {
		PropertId = propertId;
	}
	public String getPropertValue() {
		return propertValue;
	}
	public void setPropertValue(String propertValue) {
		this.propertValue = propertValue;
	}
	@Override
	public String toString() {
		return "TransactionProperty [PropertId=" + PropertId + ", propertValue=" + propertValue + "]";
	}
	
	

}
