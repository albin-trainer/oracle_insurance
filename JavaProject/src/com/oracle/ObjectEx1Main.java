package com.oracle;

public class ObjectEx1Main {
	public static void main(String[] args) {
		//new to allocate memory
	Product p1=	new Product();
	p1.setProductCode(101);
	p1.setProductName("T Shirt");
	p1.setPrice(999.99f);
	
	
	
	p1.print();
	System.out.println("-------------");
	System.out.println("Product name is "+p1.getProductName());
	
	Product p2=	new Product();
	p2.setProductCode(102);
	p2.setProductName("Jeans");
	p2.setPrice(1999.99f);
	
	Product p3=	new Product();
	p3.setProductCode(103);
	p3.setProductName("Shoes");
	p3.setPrice(2999.99f);
	
	//Syntax 1
	int nums[]=new int[5];
	Product myProducts[]=new Product[5];
	
	//Syntax 2
	int nums2[]= {1,2,3,4,5};
	Product myCartProducts[]= {p1,p2,p3};
	System.out.println("My Cart ...");
	System.out.println("---------------");
	for(int i=0;i<myCartProducts.length;i++) {
		System.out.println("Product code "+myCartProducts[i].getProductCode());
		System.out.println("Product Name : "+myCartProducts[i].getProductName());
		System.out.println("PRice : "+myCartProducts[i].getPrice());
		System.out.println("---------------------------");
	}
	}
}
