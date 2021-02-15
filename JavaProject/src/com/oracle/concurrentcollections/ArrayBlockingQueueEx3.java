package com.oracle.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayBlockingQueueEx3 {
public static void main(String[] args) {
	
		BlockingQueue<String>queue=new LinkedBlockingQueue<String>(1);
		Producer p=new Producer(queue);
		Consumer c=new Consumer(queue);
		Thread t=new Thread(p);
		t.start();
		new Thread(c).start();
}
}

class Producer implements Runnable{
	private BlockingQueue<String> queue;
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				queue.put(""+i);
				System.out.println("Inserted : "+i);
				System.out.println("Size : "+queue.size()+
						" Remaining capacity : "+queue.remainingCapacity());
				//Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	private BlockingQueue<String> queue;
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {
			while(true){
				try {
					System.out.println("Consuming : "+queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
}
