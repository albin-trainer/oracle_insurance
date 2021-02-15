package com.oracle.oops.part2;

public class StaticEx2Main {
	int data=100; //instance variable
	static int x=99;
public static void main(String[] args) {
	StaticEx2Main obj= new StaticEx2Main();
	System.out.println("Data : "+obj.data);// ERROR ...
	System.out.println("X : "+x);

	obj.f1();
	f2();
}

void f1() {
	System.out.println("X: " +x);
	f2(); //Can access ..
}

static void f2() {
	System.out.println("i m static f2 method ..");
	//f1(); //
}
}
