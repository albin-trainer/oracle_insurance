package com.oracle.exceptions;

public class ExceptionEx1 {
public static void main(String[] args) {
	int a=10; //Assume these data i got frm the user
	int b=5;//Assume these data i got frm the user
	int result;
	System.out.println("Welcome ..");
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[6]);
		result=a/(b*2-a); 
		System.out.println("Result "+result);
	}
	catch(ArithmeticException | NullPointerException e) {
		System.out.println("Exception occured "+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array out of range "+e);
	}
	System.out.println("END ...");
}
}
