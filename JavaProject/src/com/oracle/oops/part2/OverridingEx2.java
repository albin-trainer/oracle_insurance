package com.oracle.oops.part2;

/*
Take a break for 10 minutes ..
back by 3.30*/
public class OverridingEx2 {
public static void main(String[] args) {
	Person p1=new Customer();
	p1.call();
	
	Person p2=new Person();
	p2.call();
	
	//p1.info();
}
}


class Person{
	int data =100; //part of customer 
	void call() {
		info();
	}
	 private void info() {
		System.out.println("I m a person ..");
	}
	final void f1() {
		
	}
}

class Customer extends Person{
	void info() {
		System.out.println("I m a customer ..");
	}
	
}