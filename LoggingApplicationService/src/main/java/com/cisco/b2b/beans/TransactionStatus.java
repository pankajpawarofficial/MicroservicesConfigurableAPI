package com.cisco.b2b.beans;

public class TransactionStatus {
	

       
	private int transactionStatusId;

     
	private String transactionStatusDescription;
	
     
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
