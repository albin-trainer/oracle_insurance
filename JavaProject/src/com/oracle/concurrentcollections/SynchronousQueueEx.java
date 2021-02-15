package com.oracle.concurrentcollections;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueEx {
public static void main(String[] args) throws InterruptedException {
	//Size is 0 it act as bridge for producer and consumer threads ...
	SynchronousQueue<String> q=new SynchronousQueue<String>();
	//q.put("dd");
	Producer1 p=new Producer1(q);
	Consumer1 c=new Consumer1(q);
	new Thread(p).start(); new Thread(c).start();
}
}
class Producer1 implements Runnable{
	SynchronousQueue<String> q;
	Producer1(SynchronousQueue<String> q) {
		this.q=q;
	}
	public void run() {
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter any data");
			String str=scan.next();
			try {
				//q.add(e)
				q.put(str);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer1 implements Runnable{
	SynchronousQueue<String> q;
	Consumer1(SynchronousQueue<String> q) {
		this.q=q;
	}
	public void run() {
		while(true){
			try {
				System.out.println("Consuming :"+q.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
