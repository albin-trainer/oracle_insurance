package com.oracle.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
public static void main(String[] args) throws InterruptedException {
	Compute2 c=new Compute2();
	Thread t1=new Thread(c);
	Thread t2=new Thread(c);
	Thread t3=new Thread(c);
	t1.start();
	t2.start();
	t3.start();
	t1.join(); t2.join(); t3.join();
	System.out.println("--- Resullt : "+c.getResult());
}
}


class Compute2 implements Runnable
{
	AtomicInteger ai=new AtomicInteger(0);
	
	public void run() {
	for(int i=1;i<=10000;i++) {
			ai.incrementAndGet();
		}
	}
	public int getResult() {
		return ai.get();
	}
	
}