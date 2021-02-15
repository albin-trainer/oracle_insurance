package com.oracle.concurrentcollections;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeuEx {
public static void main(String[] args) {
	LinkedBlockingDeque<String> queue=new LinkedBlockingDeque<String>(10);
	try {
		queue.put("Burger");
		queue.putFirst("Pizza");
		System.out.println(queue);
		queue.put("Pasta");
		System.out.println(queue);
		queue.takeLast();
		System.out.println(queue);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
	
	
}
}
