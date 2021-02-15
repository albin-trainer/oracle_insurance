package com.oracle.oops.part2;

public class ComposititionEx {
public static void main(String[] args) {
	
	Car1 c=new Car1(); //is eligible for Garbage Collection...
	c=null;
	
	System.gc();
	System.out.println("Main Ends ..");
}
}



class Car1{
	private Engine1 engine=new Engine1();
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Car object getting garbage collected...");
	}
	
}


class Engine1{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Engine object getting garbage collected...");
	}
}