package com.oracle.concurrentcollections;

import java.util.concurrent.PriorityBlockingQueue;
public class PriorityBlockingQueueEx2 {
public static void main(String[] args) throws InterruptedException {
	Product p1=new Product(998, "Bag");
	Product p2=new Product(783, "Jeans");
	Product p3=new Product(866, "Pen Drive");
	PriorityBlockingQueue<Product> queue=new PriorityBlockingQueue<Product>();
	queue.put(p1);
	queue.put(p2); //internally it invokes compareTo
	queue.put(p3);
	System.out.println(queue.take());
	System.out.println(queue.take());
	System.out.println(queue.take());
	//System.out.println(queue);
}
}
class Product implements Comparable<Product>{
	private int id;
	private String name;
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
public String toString(){
	return "Id :"+id+" Product Name : "+name;
}
@Override
public int compareTo(Product p) {
	if(this.id<p.id)
			return 1;
	else
		return -1;
}
}