package com.oracle.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingEx4 {
public static void main(String[] args) throws InterruptedException {
	BlockingQueue<String> queue=new ArrayBlockingQueue<String>(1);
	queue.put("Bangalore");
	queue.put("Chennai");
	System.out.println(queue.remainingCapacity());
	queue.put("Hyd");
	System.out.println(queue.remainingCapacity());
	System.out.println(queue);
	System.out.println(queue.take());
	queue.put("Mysore");
	System.out.println(queue);
	System.out.println("Main Ends");
	
}
}
