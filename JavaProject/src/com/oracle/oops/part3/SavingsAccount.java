package com.oracle.oops.part3;

public class SavingsAccount extends Account{
	public SavingsAccount(long accNo, String accHolderName, float balance) {
		super(accNo, accHolderName, balance);
	}
	@Override
	public void credit(float amt) {
	setBalance(getBalance()+amt);
	System.out.println("updated balance in ur savings acc is "+getBalance());
	}

}
