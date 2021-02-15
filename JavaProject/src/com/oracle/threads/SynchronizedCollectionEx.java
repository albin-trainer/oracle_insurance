package com.oracle.threads;

import java.util.ArrayList;

public class SynchronizedCollectionEx {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("Mumbai");
	list1.add("Delhi");
	list1.add("Chandighar");
	list1.add("Pune");
	list1.add("Mangalore");
	list1.add("Mysore");
	list1.add("Chennai");
	
	for(String s:list1) {
		System.out.println(s);
		if(s.equals("Pune"))
			list1.remove(s); //FastFail
	}
	System.out.println(list1);
}
}
