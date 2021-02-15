package com.oracle.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueEx {
public static void main(String[] args) {
	//put and take methods block the thread ...
	BlockingQueue<String> queue=new ArrayBlockingQueue<String>(3);
	try {
	//	System.out.println(queue.take());
		System.out.println("Space remaining  : "+queue.remainingCapacity());
		queue.put("Bangalore");
		System.out.println("Space remaining  : "+queue.remainingCapacity());
		System.out.println("No of Elements : "+queue.size());
		System.out.println("Space remaining  : "+queue.remainingCapacity());
		
		queue.put("Chennai");
		queue.put("Delhi");
		System.out.println(queue);
		System.out.println(queue.take()+" taken out ....");
		queue.put("Delhi"); //Blocked ...
		System.out.println("No of Elements : "+queue.size());
		System.out.println(queue);
		/*System.out.println("Space remaining  : "+queue.remainingCapacity());
		
		queue.put("Kolkatta");*/
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
