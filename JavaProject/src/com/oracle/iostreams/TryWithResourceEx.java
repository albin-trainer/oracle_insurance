package com.oracle.iostreams;

public class TryWithResourceEx {
 public static void main(String[] args) {
	 try (MyOwnStream stream=new MyOwnStream(); ) {
		 System.out.println("in try");
		throw new NullPointerException();
	 }
	 catch(ArithmeticException e) {
		 System.out.println("in catch");
	 }
	 System.out.println("Try ends ..");
	
}
}


class MyOwnStream implements AutoCloseable{
	public void close() {
		System.out.println("closed");
	}
}
