package com.oracle.oops.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.oracle.collections.Product;

public class BuiltinFunctionalInterfaceEx1Main {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	
	ArrayList<Product> list=new ArrayList<Product>();
	list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
	Predicate<Product> filter=p->p.getPrice()<=4000;
	//searchService(list, filter);
	//After filtering the records, v hv to send to the filtered products to UI layer or DB Layer (Store in the DB)
	Consumer<Product> uilayer=p->uiLayer(p);
	searchService(list, filter, uilayer);
	System.out.println("--------to send to DB layer");
	searchService(list, filter, p->dbLayer(p));
	
	System.out.println("....iterating by java 8 for each method ...............");
	
	list.forEach(p-> System.out.println(p.getProductName()));
	
}
static void searchService(List<Product> list,Predicate<Product> filter,Consumer<Product> consumer) {
	for(Product p:list) {
		if(filter.test(p)) {
			//System.out.println(p.getProductName());
			consumer.accept(p);
		}
	}
}
static void uiLayer(Product p) {
	System.out.println("In UI LAYER .. "+p.getProductName());
}
static void dbLayer(Product p ) {
	System.out.println("In Database layer "+p.getProductName());
}
}

