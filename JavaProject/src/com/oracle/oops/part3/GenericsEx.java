package com.oracle.oops.part3;


/*
 * Generics-  Parameterized type
 * 			- no need of type casting while from the obj
 */
public class GenericsEx {
public static void main(String[] args) {
	Info<String> info1=new Info<String>();
	
	info1.setVal("Hello"); //Accepts onlly string ...
	
	Info<Integer> info2=new Info<Integer>();
	info2.setVal(99); //Accepts only integer..
	
	String s=info1.getVal();// no need to typecast
	System.out.println(s);
	int val=info2.getVal();//no need or type cast
	System.out.println(val);
	
}
}


class Info <E>{
	private E val;

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}
	
	
}