package com.oracle.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx1 {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	long t1=System.currentTimeMillis();
	for(int i=1;i<=1000000;i++) {
		list.add(0,"Bangalore");
	}
	long t2=System.currentTimeMillis();
	
	System.out.println("Time took for linked list "+(t2-t1));
	
	ArrayList<String> list2=new ArrayList<String>();
	t1=System.currentTimeMillis();
	for(int i=1;i<=1000000;i++) {
		list2.add(0,"Bangalore");
	}
	t2=System.currentTimeMillis();
	
	System.out.println("Time took for Array list "+(t2-t1));
}
}
