package com.oracle.oops.part3;

public class CreditCardAccount extends Account {

	public CreditCardAccount(long accNo, String accHolderName, float balance) {
		super(accNo, accHolderName, balance);
	}

	@Override
	public void credit(float amt) {
		setBalance(getBalance()-amt);
		System.out.println("Amount of "+amt +" credited in ur credit card");
		System.out.println("your balance due is "+getBalance());
	}

}
