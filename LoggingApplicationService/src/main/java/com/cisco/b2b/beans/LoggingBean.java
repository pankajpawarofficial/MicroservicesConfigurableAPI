package com.cisco.b2b.beans;


import java.util.ArrayList;
import java.util.Date;

public class LoggingBean {


	private String id;
	private long logId;
	private String uniqueId;
	private int transactionTypeId;
	private int payloadStandardId;
	private int partnerId;


	private int genericId;


	private boolean visibility;


	private String documentId;


	private int transactionStatusId;


	private int sender;


	private int receiver;


	private String statusCode;


	private String orderStatus;


	private Date createDate ;


	private Date lastUpdateDate ;


	private ArrayList<TransactionStatus> transactionStatusList;


	private ArrayList<TransactionProperty> transactionPropertyList;


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
}
