package com.oracle.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1Main {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("Mumbai");
	list1.add("Delhi");
	list1.add("Chandighar");
	list1.add("Pune");
	System.out.println(list1);
	
	list1.add(1,"Mangalore");
	System.out.println(list1);
	
	Collections.sort(list1);
	System.out.println(list1);
	
	Collections.reverse(list1);
	System.out.println(list1);
}
}
