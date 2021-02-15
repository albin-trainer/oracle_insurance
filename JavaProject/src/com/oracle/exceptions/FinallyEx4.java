package com.oracle.exceptions;

public class FinallyEx4 {
public static void main(String[] args) {
	int r=f1();
	System.out.println(r);
}

static int f1() {
	try {
		System.out.println("try block");
		System.out.println(5/0);
		return 1;
	}
	catch(Exception e) {
		System.out.println("in catch");
		return 2;
	}
	finally {
		System.out.println("in finally");
		return 3;
	}
}
}
