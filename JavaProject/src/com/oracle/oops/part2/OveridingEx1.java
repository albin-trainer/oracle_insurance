package com.oracle.oops.part2;

public class OveridingEx1 {
public static void main(String[] args) {
	Vehicle v=new Car();
	v.start();//@ decides statically ..
	v.move(); //@ runtime decides which method to invoke
	
	Car.start(); //for static members no need of object, can access directly thrugh the class name
}
}


class Vehicle{
	static void start() { //static methods ..
		System.out.println("Vehicle started ..");
	}
	
	   void move() { //instance methods
		System.out.println("Vehicle is moving ...");
	}
}

class Car extends Vehicle{
	static void start() { //NOT OVERRIDING ..
		System.out.println("Car Started ....");
	}
	
	 public void move() {
		System.out.println("Car is moving ...");
	}
}
