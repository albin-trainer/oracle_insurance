package com.oracle.threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Task4 implements Runnable{
	int count=0;
	public void run() {
		System.out.println(Thread.currentThread().getName() +"  "+ ++count +" @ "+new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ScheduledExecutorServiceEx2 {
	public static void main(String[] args) throws InterruptedException {
		Task4 task=new Task4();
		ScheduledExecutorService service=Executors.newScheduledThreadPool(5);
		//scheduled at start of every previous exection
		//service.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);
		
		//scheduled at End of  the every previous exection
		service.scheduleWithFixedDelay(task, 1, 3, TimeUnit.SECONDS);
		service.awaitTermination(20, TimeUnit.SECONDS);
		service.shutdown();
		System.out.println("End ..");
	}
}
