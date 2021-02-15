package com.oracle.oops.part3;

public class WrapperClasses {
public static void main(String[] args) {
	f1("Hello");
	f1(new Honda());
	int a=10; //int data type
	
	Integer obj1=new Integer(20); //integer obj
	
	Integer obj2=100; //Auto Boxing ...  from JDK5.0
	
	f1(10);//Auto boxing.. Automatically convert into  a integer obj
	Boolean b=true;
	f1(true);
}


static void f1(Object obj) {
	System.out.println(obj);
}
}
