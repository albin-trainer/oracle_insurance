package com.oracle;

public class Product {
private int productCode;    //State, properties, instance variables
private String productName;
private float price;


public int getProductCode() {
	return productCode;
}

public void setProductCode(int productCode) {
	this.productCode = productCode;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}



void print() {
	System.out.println("Product Code "+productCode);
	System.out.println("Product name : "+productName);
	System.out.println("Price : "+price);
}

}
