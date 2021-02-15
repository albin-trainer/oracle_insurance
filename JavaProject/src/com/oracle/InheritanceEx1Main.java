package com.oracle;

public class InheritanceEx1Main {
	public static void main(String[] args) {
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
		
		System.out.println(apparal.getProductName()+" price is "+apparal.getPrice()+" and Fabric is "+apparal.getFabric());
		System.out.println(book.getProductName()+" Price is "+book.getPrice()+" and genre is "+book.getGenre()+" Authour is "+book.getAuthourName());
		
	}

}
