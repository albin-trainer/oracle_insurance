package com.oracle.oops.part2;

public class ConstructorEx1 {
public static void main(String[] args) {
	new Derive();
}
}


class Base{
	/*
	 * Base(){ System.out.println("I m base class constructor"); }
	 */
	Base(String s){
		System.out.println("I m Parameeterizied constructor "+s);
	}
}


class Derive extends Base{
	public Derive() {
		//super();
		super("Hello");
		System.out.println("I m derive class constructor ..");
		
	}
	
}