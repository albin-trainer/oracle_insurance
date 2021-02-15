package com.oracle.exceptions;

import java.util.Scanner;

public class ThrowEx1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Plz enter any number which is divisible by 2");
	int num=scanner.nextInt();
	if(num%2!=0) {
		//ArithmeticException e=new ArithmeticException();
		//throw e; //Exception occured ...
		InvalidEntryException e=new InvalidEntryException("Wrong Entry");
		try {
		throw e;
		}
		catch(Exception ex) {
			
		}
	}
	else {
		System.out.println("Congrats !!!!");
	}
}
}
class InvalidEntryException extends Exception{
	public InvalidEntryException() {
	}
	public InvalidEntryException(String s) {
		super(s);
	}
}