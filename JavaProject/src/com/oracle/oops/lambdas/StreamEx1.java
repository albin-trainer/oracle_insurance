package com.oracle.oops.lambdas;

import java.util.ArrayList;

import com.oracle.collections.Product;

public class StreamEx1 {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	
	ArrayList<Product> list=new ArrayList<Product>();
	list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
	list.stream().filter(p->p.getRatings()>=4).
	filter(p->p.getPrice()<=1000).
	forEach(p->System.out.println(p));
	
	System.out.println("----------------------");
	list.stream().filter(p->p.getPrice()>=500).map(p->p.getProductName()).forEach(str->dataLayer(str));
	
	System.out.println("---------------------------------------------------");
	list.stream().sorted().forEach(p->System.out.println(p));
	//by streams sort based on ratings ...
	System.out.println("----------sorting based on ratings-----------------------");
	list.stream().sorted((pr1,pr2)->pr1.getRatings()>pr2.getRatings()?-1:1).forEach(p->System.out.println(p));
	
	System.out.println("----------sorting based on ratings-----------------------");
	list.stream().sorted((pr1,pr2)->Float.compare(pr1.getRatings(), pr2.getRatings())).forEach(p->System.out.println(p));
	
	System.out.println("----------sorting based on product code-----------------------");
	list.stream().sorted((pr1,pr2)->pr1.getProductCode()-pr2.getProductCode()).forEach(p->System.out.println(p));
	
	//Find the costliest product from the list
	Product costliestProduct=list.stream().max((pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1).get();
	System.out.println("Costliest product :"+costliestProduct);
	
	//Find the total price of all products ....
	
	double totalPrice=list.stream().mapToDouble(p->p.getPrice()).sum();
	System.out.println("Total price is "+totalPrice);
	
	double averageRatings=list.stream().mapToDouble(p->p.getRatings()).average().getAsDouble();
	System.out.println("Average ratings : "+averageRatings);
	System.out.println("------------------Method Reference -------------------------");
	
	list.stream().filter(p->p.getPrice()>=500).map(p->p.getProductName()).forEach(StreamEx1::dataLayer);
	System.out.println("------------Method Reference sorted -----------");
	//should the compare method of Comparator ..
	list.stream().sorted(StreamEx1::compareByNames).forEach(System.out::println);
}


static void dataLayer(String s) {
	System.out.println("in data layer :"+s);
}
//must match with the compare methd signature of comparator ...
static int compareByNames(Product p1,Product p2) {
	return p1.getProductName().compareTo(p2.getProductName());
}
}
