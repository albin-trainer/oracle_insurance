package com.oracle.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueEx2 {
public static void main(String[] args) {
	BlockingQueue<String> queue=new ArrayBlockingQueue<String>(2);
	//queue.add(null);
	queue.add("Delhi");
	queue.add("Hyd");
	System.out.println(queue);
	//queue.add("Mumbai");
	boolean b=queue.offer("Mumbai");//it wont block, if not added it jsut returns boolean
	System.out.println(b);
	System.out.println(queue);
}
}
