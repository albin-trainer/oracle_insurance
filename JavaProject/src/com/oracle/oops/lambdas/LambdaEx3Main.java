package com.oracle.oops.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.oracle.collections.Product;

public class LambdaEx3Main {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	ArrayList<Product> productList=new ArrayList<Product>();
	productList.add(p1);
	productList.add(p2);
	productList.add(p3);
	productList.add(p4);
	productList.add(p5);
	Collections.sort(productList, (product1,product2)->product1.getProductName().compareTo(product2.getProductName()));
	System.out.println("After sorted  by product names...");
	System.out.println(productList);
	
	Comparator<Product> compareByPrice= (product1,product2)->{
		if(product1.getPrice()>product2.getPrice())
			return -1;
		else
			return 1;
	};
	
	Collections.sort(productList, compareByPrice);
	System.out.println("After sorted by price by descending...");
	System.out.println(productList);
	
	Collections.sort(productList,(pr1,pr2)->  pr1.getPrice()<pr2.getPrice() ? -1 :1 );
	System.out.println("After sorted by price by ascending...");
	System.out.println(productList);
}
}
