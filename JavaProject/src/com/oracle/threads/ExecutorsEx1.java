package com.oracle.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsEx1 {
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(100);
		Worker work=new Worker();
		for(int i=1;i<=10;i++)
				service.execute(work);
		
	}
}

class Worker implements Runnable
{
	 int count=0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+
				" running");
		System.out.println("Count: "+ ++count);
	}
	
}
