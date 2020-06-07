package com.cisco.b2b.beans;


import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="LoggingDetails")
public class LoggingBean {
	
	@Id
	@Field("_id")
	private String id;
	
	@Field("LogId")
	private long logId;
	
	@Field("UniqID")
	private String uniqueId;
	
	@Field("TranTypeID")
	private int transactionTypeId;
	
	@Field("PldStdID")
	private int payloadStandardId;

	@Field("PartID")
	private int partnerId;
	
	@Field("GenID")
	private int genericId;
	
	@Field("Visibility")
	private boolean visibility;
	
	@Field("DocumentID")
	private String documentId;
	
	@Field("TranStatID")
	private int transactionStatusId;
	
	@Field("Sender")
	private int sender;
	
	@Field("Receiver")
	private int receiver;
	
	@Field("StatusCode")
	private String statusCode;
	
	@Field("OrderStatus")
	private String orderStatus;
	
	@Field("CreateDT")
	private Date createDate ;
	
	@Field("LstUpdDT")
	private Date lastUpdateDate ;
	
	@Field("transactionStatus")
	private ArrayList<TransactionStatus> transactionStatusList;
	
	@Field("transactionPropertyValue")
	private ArrayList<TransactionProperty> transactionPropertyList;
	
	@Field("transactionPayloadValue")
	private ArrayList<TransactionPayload> transactionPayloadList;
	
	

	public ArrayList<TransactionStatus> getTransactionStatusList() {
		return transactionStatusList;
	}
	public void setTransactionStatusList(ArrayList<TransactionStatus> transactionStatusList) {
		this.transactionStatusList = transactionStatusList;
	}
	public ArrayList<TransactionProperty> getTransactionPropertyList() {
		return transactionPropertyList;
	}
	public void setTransactionPropertyList(ArrayList<TransactionProperty> transactionPropertyList) {
		this.transactionPropertyList = transactionPropertyList;
	}
	public ArrayList<TransactionPayload> getTransactionPayloadList() {
		return transactionPayloadList;
	}
	public void setTransactionPayloadList(ArrayList<TransactionPayload> transactionPayloadList) {
		this.transactionPayloadList = transactionPayloadList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getLogId() {
		return logId;
	}
	public void setLogId(long logId) {
		this.logId = logId;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public int getTransactionTypeId() {
		return transactionTypeId;
	}
	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}
	public int getPayloadStandardId() {
		return payloadStandardId;
	}
	public void setPayloadStandardId(int payloadStandardId) {
		this.payloadStandardId = payloadStandardId;
	}
	public int getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}
	public int getGenericId() {
		return genericId;
	}
	public void setGenericId(int genericId) {
		this.genericId = genericId;
	}
	public boolean isVisibility() {
		return visibility;
	}
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public int getTransactionStatusId() {
		return transactionStatusId;
	}
	public void setTransactionStatusId(int transactionStatusId) {
		this.transactionStatusId = transactionStatusId;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	@Override
	public String toString() {
		return "LoggingBean [id=" + id + ", logId=" + logId + ", uniqueId=" + uniqueId + ", transactionTypeId="
				+ transactionTypeId + ", payloadStandardId=" + payloadStandardId + ", partnerId=" + partnerId
				+ ", genericId=" + genericId + ", visibility=" + visibility + ", documentId=" + documentId
				+ ", transactionStatusId=" + transactionStatusId + ", sender=" + sender + ", receiver=" + receiver
				+ ", statusCode=" + statusCode + ", orderStatus=" + orderStatus + ", createDate=" + createDate
				+ ", lastUpdateDate=" + lastUpdateDate + ", transactionStatusList=" + transactionStatusList
				+ ", transactionPropertyList=" + transactionPropertyList + ", transactionPayloadList="
				+ transactionPayloadList + "]";
	}
	
	
}
