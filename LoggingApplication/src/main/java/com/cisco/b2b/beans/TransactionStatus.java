package com.cisco.b2b.beans;

import org.springframework.data.mongodb.core.mapping.Field;

public class TransactionStatus {
	

     @Field("tranStatusID")  
	private int transactionStatusId;

     @Field("Application")
	private String transactionStatusDescription;
	
     @Field("tranStatDT")
    private String transactionStatusDate;
    
	public int getTransactionStatusId() {
		return transactionStatusId;
	}
	public void setTransactionStatusId(int transactionStatusId) {
		this.transactionStatusId = transactionStatusId;
	}
	public String getTransactionStatusDescription() {
		return transactionStatusDescription;
	}
	public void setTransactionStatusDescription(String transactionStatusDescription) {
		this.transactionStatusDescription = transactionStatusDescription;
	}
	public String getTransactionStatusDate() {
		return transactionStatusDate;
	}
	public void setTransactionStatusDate(String transactionStatusDate) {
		this.transactionStatusDate = transactionStatusDate;
	}
	@Override
	public String toString() {
		return "TransactionStatus [transactionStatusId=" + transactionStatusId + ", transactionStatusDescription="
				+ transactionStatusDescription + ", transactionStatusDate=" + transactionStatusDate + "]";
	}
	
	
	
}
