package com.oracle.threads;

public class SynchronizationEx {
public static void main(String[] args) throws InterruptedException {
	Bank bank=new Bank();
	Thread t1=new Thread(bank);
	t1.setName("ATM");
	Thread t2=new Thread(bank);
	t2.setName("Netbanking");
	t1.start();
	t2.start();
	t1.join(); //makes the current running to blocked until the child finishes the job...
	t2.join();
	System.out.println("----Final Bank balance : "+bank.getBalance());
}
}
