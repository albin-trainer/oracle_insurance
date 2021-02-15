package com.oracle.exceptions;
public class FinallyEx3 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		System.out.println(a/b);
		System.out.println("End try");
		return;
	}
	catch(ArithmeticException e) {
		System.out.println("in catch");
	}
	finally {
		System.out.println("in finally block ...");
	}
	System.out.println("Main ends ...");
}
}
