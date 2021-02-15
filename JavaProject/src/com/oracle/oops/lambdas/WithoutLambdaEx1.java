package com.oracle.oops.lambdas;

import java.util.ArrayList;
import java.util.List;
import com.oracle.collections.Product;
public class WithoutLambdaEx1 {
public static void main(String[] args) {
	Product p1=new Product(101, "T Shirt", 799.99f, 4.2f);
	Product p2=new Product(102, "Jeans", 1799.99f, 3.9f);
	Product p3=new Product(91, "Head phones", 4799.99f, 4.6f);
	Product p4=new Product(67, "Shoes", 399.99f, 3.2f);
	Product p5=new Product(78, "Mouse", 499.99f, 4.1f);
	
	ArrayList<Product> list=new ArrayList<Product>();
	list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
	searchAndDisplay(list,new FilterByRatings());
	System.out.println("----------------------");
	searchAndDisplay(list, new FilterByPrice());
	System.out.println("-----------------------");
	
	FilterProduct lessThanthousand=new FilterProduct() {
		public boolean test(Product p) {
				return p.getPrice()<1000?true:false;
		}
	};
	System.out.println("------------------------");
	searchAndDisplay(list, lessThanthousand);
	System.out.println("------Lambda Expression -------");
	searchAndDisplay(list, p->p.getProductName().equals("Head phones") );
}
static void searchAndDisplay(List<Product> list,FilterProduct filter) {
	for(Product p:list) {
	//	if(p.getPrice()<=4000) {
		//if(p.getRatings()>=4) {
		if(filter.test(p)) { //polymprphism ...
			System.out.println(p.getProductName());
		}
	}
}
}
class FilterByRatings implements FilterProduct{
	public boolean test(Product p) {
		if(p.getRatings()>=4)
		return true;
		else
			return false;
	}
}
class FilterByPrice implements FilterProduct{
	public boolean test(Product p) {
			if(p.getPrice()<=4000)
				return true;
			else
				return false;
	}
}