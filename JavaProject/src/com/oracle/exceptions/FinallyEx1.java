package com.oracle.exceptions;

public class FinallyEx1 {
public static void main(String[] args) {
	try {
		int a=10;
		int b=50;
		if(a<b) {
			System.out.println("bye bye");
			return; //the role to stop executing the current mthod and go bck the caller
		}
		System.out.println("End try");
	}
	finally {
		System.out.println("in finally block ...");
	}
	System.out.println("Main ends ...");
}
}
