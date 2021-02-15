package com.oracle.oops.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.oracle.collections.Product;

public class CollectorsEx1Main {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	
	ArrayList<Product> list=new ArrayList<Product>();
	list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
	
	List<Product> filteredList=list.stream().filter(p->p.getPrice()<4000).collect(Collectors.toList());
	System.out.println(filteredList);
}
}
