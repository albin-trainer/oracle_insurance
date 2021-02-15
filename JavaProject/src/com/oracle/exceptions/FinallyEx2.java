package com.oracle.exceptions;
public class FinallyEx2 {
public static void main(String[] args) {
	try {
		System.out.println("In try ..");
		int a=10;
		int b=0;
		System.out.println(a/b);
		System.out.println("End try");
	}
	finally {
		System.out.println("in finally block ...");
	}
	System.out.println("Main ends ...");
}
}
