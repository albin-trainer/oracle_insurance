package com.oracle.concurrentcollections;

import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEx {
public static void main(String[] args) throws InterruptedException {
	//sorted ....
	PriorityBlockingQueue<String> queue=new PriorityBlockingQueue<String>();
	//queue.element();
	queue.add("Delhi");
	queue.add("Hyd");
	queue.add("Chennai");
	queue.add("Bangalore");
	System.out.println(queue);
	System.out.println(queue.take()+" Taken out");
	System.out.println(queue);
	System.out.println(queue.take()+" Taken out");
	System.out.println(queue);

	

	
}
}
