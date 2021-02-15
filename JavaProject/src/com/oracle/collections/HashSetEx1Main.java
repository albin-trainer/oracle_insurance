package com.oracle.collections;

import java.util.HashSet;

public class HashSetEx1Main {
public static void main(String[] args) {
	//Assume these data retrieved Excel / DB ...
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	HashSet<Product> set=new HashSet<>();
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4); //if hashcode is same, it cross chks by equals method ..
	set.add(p5);
	System.out.println("No of Elements is "+set.size());
	System.out.println(set);
//	System.out.println(p1.hashCode());
	//System.out.println(p4.hashCode());
	//System.out.println(p1.equals(p4));
}
}
