package com.oracle.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Task5 implements Callable<String>{
	
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" running ..");
		Thread.sleep(5000);
		return "v hv done it :) :)";
	}
}
public class CallableEx {
public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
	Task5 task=new Task5();
	ExecutorService service=Executors.newFixedThreadPool(1);
	
	Future<String> future=service.submit(task); //thread may start running depends on scheduler ....
	System.out.println("Main waiting .....");
	//here the main is waiting for the client 
	String result=future.get(); //act as join
	//if the thread cud not complete with in 3 secs TimeOutException occurs
	//String result=future.get(3,TimeUnit.SECONDS); //act as join
	System.out.println("Result :"+result);
	//service.awaitTermination(5, TimeUnit.SECONDS);
	service.shutdown();
	System.out.println("shut down ..");
}
}
