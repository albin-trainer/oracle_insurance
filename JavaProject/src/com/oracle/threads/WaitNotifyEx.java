package com.oracle.threads;

public class WaitNotifyEx {
public static void main(String[] args) throws InterruptedException {
Task task=new Task();
Thread t=new Thread(task);
t.start();
Thread.sleep(1000);
//By main thread ....
synchronized (task) { //Acquring the monitor(key) ..
	task.notify(); //signal to other threads 
	System.out.println("notified ...");
	Thread.sleep(5000);
	System.out.println("over ..");
}
System.out.println("Main Ends ....");
}
}



class Task implements Runnable{

	@Override
	public void run() {
		f1();
	}

	private synchronized void f1() {
		try {
			System.out.println("I m sleeping ....");
			wait();
			System.out.println("I m back  ....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
