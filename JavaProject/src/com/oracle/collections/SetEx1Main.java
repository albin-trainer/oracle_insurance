package com.oracle.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx1Main {
public static void main(String[] args) {
	/*
	 * HashSet - Elements are unordered
	 * 			-Cannot guaranty the order of elements
	 * 			- no duplicates..
	 */
	HashSet<String> set1=new HashSet<String>();
	set1.add("MI");
	set1.add("RCB");
	set1.add("CSK");
	set1.add("KX1");
	boolean b1=set1.add("Delhi");
	set1.add("Sun risers");
	boolean b2=set1.add("Delhi");
	System.out.println(set1);
	System.out.println(b1+"   "+b2);
	/*
	 * TreeSet  - Elements arranged in Sorted order
	 * 			-uses Binary Search Tree
	 * 			-no duplicates
	 */
	TreeSet<String> set2=new TreeSet<String>();
	set2.add("MI");
	set2.add("RCB");
	set2.add("CSK");
	set2.add("KX1");
	set2.add("Delhi");
	set2.add("Sun risers");
	set2.add("Delhi");
	System.out.println(set2);
	/*
	 * LinkedHashSet - No duplicates
	 * 				 -elements arranged in the inserted order
	 */
	LinkedHashSet<String> set3=new LinkedHashSet<String>();
	set3.add("MI");
	set3.add("RCB");
	set3.add("CSK");
	set3.add("KX1");
	set3.add("Delhi");
	set3.add("Sun risers");
	set3.add("Delhi");
	set3.add("KKR");
	System.out.println(set3);
	
}
}
