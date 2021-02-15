package com.oracle.oops.part3;

public class AbstractClassEx {

	public static void main(String[] args) {
		SavingsAccount savings=new SavingsAccount(9991, "Abc", 50000);
		CreditCardAccount creditCard=new CreditCardAccount(88321, "XYZ", 10000);
		System.out.println("Balance before credit in savings acc "+savings.getBalance());
		creditAccount(savings, 10000);
		System.out.println("--------------");
		System.out.println("Balance before credit in credit card acc "+creditCard.getBalance());
		creditAccount(creditCard, 7000);
	}
	static void creditAccount(Account account,float amt) {
		account.credit(amt); //No idea for which account the money going to credit ...
	}
}
