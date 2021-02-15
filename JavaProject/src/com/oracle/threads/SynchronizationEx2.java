package com.oracle.threads;

public class SynchronizationEx2 {
public static void main(String[] args) throws InterruptedException {
	Compute c=new Compute();
	Thread t1=new Thread(c);
	Thread t2=new Thread(c);
	Thread t3=new Thread(c);
	t1.start();
	t2.start();
	t3.start();
	t1.join(); t2.join(); t3.join();
	System.out.println("Counter is "+c.getCounter());
}
}

class Compute implements Runnable{
	private  int counter;
	
	public void run() {
		
		for(int i=1;i<=10000;i++) {
			synchronized(this) {
				counter++;
			}
		}
	}
	
	public int getCounter() {
		return counter;
	}
}
