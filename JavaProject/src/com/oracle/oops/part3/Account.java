package com.oracle.oops.part3;

public abstract class Account {
private long accNo;
private String accHolderName;
private float balance;
public Account(long accNo, String accHolderName, float balance) {
	super();
	this.accNo = accNo;
	this.accHolderName = accHolderName;
	this.balance = balance;
}

public long getAccNo() {
	return accNo;
}

public void setAccNo(long accNo) {
	this.accNo = accNo;
}

public String getAccHolderName() {
	return accHolderName;
}

public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}

public float getBalance() {
	return balance;
}

public void setBalance(float balance) {
	this.balance = balance;
}

public  abstract void credit(float amt);//No { }
}
