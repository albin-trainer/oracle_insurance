package com.oracle.threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task3 implements Runnable{
	public void run() {
		System.out.println("Thread executed @ "+new Date());
	}
}

public class ScheduledExecutorServiceEx {
public static void main(String[] args) {
	Task3 task =new Task3();
	
	ScheduledExecutorService service=Executors.newScheduledThreadPool(2);
	
	service.schedule(task, 5, TimeUnit.SECONDS); //only once ..
	service.schedule(task, 5, TimeUnit.SECONDS);
	System.out.println("Scheduled @ "+new Date());
	service.shutdown();
	
}
}
