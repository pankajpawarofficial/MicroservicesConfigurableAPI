package com.cisco.b2b.beans;

import org.springframework.data.mongodb.core.mapping.Field;

public class TransactionPayload {


	@Field("tranStatID")
	private int transactionStatusId;
	
	@Field("PayloadVerType")
	private String payloadVersionType;
	
	@Field("PayloadSize")
	private int payloadSize ;
	
	@Field("CompressionFormat")
	private String compressionFormat; 
	
	@Field("PayloadID")
	private double payloadId ;
	
	@Field("PayLoadHashValue")
	private String payLoadHashValue;

	@Field("PayLoad")
	private String payLoad;
	
	public int getTransactionStatusId() {
		return transactionStatusId;
	}
	public void setTransactionStatusId(int transactionStatusId) {
		this.transactionStatusId = transactionStatusId;
	}
	public String getPayloadVersionType() {
		return payloadVersionType;
	}
	public void setPayloadVersionType(String payloadVersionType) {
		this.payloadVersionType = payloadVersionType;
	}
	public int getPayloadSize() {
		return payloadSize;
	}
	public void setPayloadSize(int payloadSize) {
		this.payloadSize = payloadSize;
	}
	public String getCompressionFormat() {
		return compressionFormat;
	}
	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}
	public double getPayloadId() {
		return payloadId;
	}
	public void setPayloadId(double payloadId) {
		this.payloadId = payloadId;
	}
	public String getPayLoadHashValue() {
		return payLoadHashValue;
	}
	public void setPayLoadHashValue(String payLoadHashValue) {
		this.payLoadHashValue = payLoadHashValue;
	}
	public String getPayLoad() {
		return payLoad;
	}
	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}
	@Override
	public String toString() {
		return "TransactionPayload [transactionStatusId=" + transactionStatusId + ", payloadVersionType="
				+ payloadVersionType + ", payloadSize=" + payloadSize + ", compressionFormat=" + compressionFormat
				+ ", payloadId=" + payloadId + ", payLoadHashValue=" + payLoadHashValue + ", payLoad=" + payLoad + "]";
	}

	
	
}
