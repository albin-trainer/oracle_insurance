package com.oracle.collections;

import java.util.TreeSet;

public class TreeSetEx2Main {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	TreeSet<Product> set=new TreeSet<Product>(); ///Natural order(Comparable)
	//TreeSet<Product> set=new TreeSet<Product>(new CompareByRatings());//By Comparator
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	System.out.println(set);
 }
}
