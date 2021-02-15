package com.oracle.collections;

import java.util.TreeSet;

public class TreeSetDemo1 {
public static void main(String[] args) {
	 TreeSet<Test> ts=new TreeSet<>(); //1
	 ts.add(new Test(100)); //2
	 ts.add(new Test(100.0)); //3
	 ts.add(new Test(100.1));//4 
	 ts.add(new Test((byte)100));//5
	 System.out.println(ts);  //6
}
}


class Test{
	private Number number;

	public Test(Number number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return ""+number;
	}
}