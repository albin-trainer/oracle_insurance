package com.oracle.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorEx1Main {
public static void main(String[] args) {
	/*
	 * Vector is a dynamic Array
	 */
	Vector<String> v1=new Vector<String>();
	System.out.println("Default capacity : "+v1.capacity());
	
	//Vector<String> v2=new Vector<>(3); //Creates a array of size 3
	Vector<String> v2=new Vector<>(3,10); //Creates a array of size 3
	System.out.println("Intial capacity "+v2.capacity());
	v2.add("Bangalore");
	v2.add("Mysore");
	System.out.println(v2);
	System.out.println("No of elements "+v2.size());
	v2.add("Chennai");
	v2.add("Mumbai");// internally created one more array & copied the contents from old to new
	System.out.println(v2);
	System.out.println(v2.capacity());
	v2.add("Delhi");
	v2.add("Kolkatta");
	v2.add("Pune");
	System.out.println(v2);
	System.out.println(v2.capacity());
	
	String city=v2.get(0);
	System.out.println("City : "+city);
	
	v2.add(1, "Tirupati");
	System.out.println(v2);
	v2.remove("Mysore");
	System.out.println(v2);
	
	for(String s:v2) { //for each loop | each iteration it gets next element
		System.out.println("****"+s+"****");
	}
	System.out.println(v2.contains("Mumbai"));
	System.out.println(v2.contains("Hyd"));
	List<String> list=Arrays.asList("Apple","Mango","Grapes");
	System.out.println(list);
	list.add("Orange");
	
}
}
