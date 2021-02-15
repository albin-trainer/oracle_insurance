package com.oracle.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEx2Main {
public static void main(String[] args) {
Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
Scanner scanner=new Scanner(System.in);
System.out.println("Enter (1) for sort by price Enter (2) for sort by ratings  (3) sort by product name ");
int choice=scanner.nextInt();
ArrayList<Product> productList=new ArrayList<Product>();
productList.add(p1);
productList.add(p2);
productList.add(p3);
productList.add(p4);
productList.add(p5);
System.out.println("No of products "+productList.size());
System.out.println("Before sorting");
System.out.println(productList);
switch(choice) {
case 1:
	Collections.sort(productList);
	break;
case 2:
	Collections.sort(productList,new CompareByRatings());
	break;
case 3:
	/*
	 * Comparator<Product> compareByName=new Comparator<Product>() { public int
	 * compare(Product p1, Product p2) { return
	 * p1.getProductName().compareTo(p2.getProductName()); } };
	 */
	Collections.sort(productList,new Comparator<Product>()  { 
		public int compare(Product p1, Product p2) {
			return p1.getProductName().compareTo(p2.getProductName());
		}
	});
}

System.out.println("__After sorting____");
System.out.println(productList);

}
}

