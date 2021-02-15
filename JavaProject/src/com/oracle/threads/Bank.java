package com.oracle.threads;
public class Bank implements Runnable{
	private float balance=5000;
	public void run() {
		//synchronized(this){
			debit(3000);
		//}
		System.out.println(Thread.currentThread().getName()+" Balance amt is "+balance);
	}
	private /*synchronized*/  void debit(int amt) {
		
		System.out.println(Thread.currentThread().getName()+"in debit method ...");
		if(amt<balance && balance>0) {
			System.out.println(Thread.currentThread().getName()+" trying to debit ");
			try {
				Thread.sleep(1000);
				//wait(1000); //release the lock & it makes the thread to block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance=balance-amt;
			System.out.println(Thread.currentThread().getName()+" Transaction Success");
		}
		else {
			System.out.println(Thread.currentThread().getName()+ "Transaction Failed ");
		}
		
	}
	public float getBalance() {
		return balance;
	}

}
