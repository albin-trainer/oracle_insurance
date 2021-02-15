package com.oracle.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList<String>();
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
			list1.remove(s); //here it will work fine ....
	}
	System.out.println(list1);
}
}
