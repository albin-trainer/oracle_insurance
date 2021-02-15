package com.oracle.oops.part1;


public class PolymorphismEx1Main {
public static void main(String[] args) {
	//new Product();
	Apparal apparal=new Apparal();
	apparal.setProductCode(881);
	apparal.setProductName("T Shirt");
	apparal.setPrice(500);
	apparal.setFabric("Cotton");
	apparal.setSize("XL");
	apparal.setColor("Blue");
	
	
	Book book=new Book();
	book.setProductCode(401);
	book.setProductName("Alchemist");
	book.setPrice(400);
	book.setAuthourName("paul");
	book.setGenre("fiction");
	
	Product p=new Apparal(); //Correcct ...
	
	Product products[]= {apparal,book};
	for(int i=0;i<products.length;i++) {
		
		displayProducts(products[i]);
		System.out.println("***************************");
	}
}
static void displayProducts(Product p) {
	p.display();//called twice ...
}
}
