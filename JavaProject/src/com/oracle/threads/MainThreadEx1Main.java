package com.oracle.threads;

public class MainThreadEx1Main {
	public static void main(String[] args) {
		//System.out.println(5/0);
		//currentThread() ==> returns the current running thread reference ....
		Thread t=Thread.currentThread();
		System.out.println("Current running thread is "+t.getName());
		t.setName("Oracle");
		System.out.println("Updated thread name is "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		//Min Priority : 1 Normal Priority : 5 , MAX priority : 10
	//	t.setPriority(1);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("new priority : "+t.getPriority());
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
