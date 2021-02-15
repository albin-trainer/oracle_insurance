package com.oracle.collections;

public class Product implements Comparable<Product> {
private int productCode;
private String productName;
private float price;
private float ratings;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productCode, String productName, float price, float ratings) {
	super();
	this.productCode = productCode;
	this.productName = productName;
	this.price = price;
	this.ratings = ratings;
}
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
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}

@Override
public String toString() {
	return "Product [productCode=" + productCode + ", productName=" + productName + ", price=" + price + ", ratings="
			+ ratings + "]\n";
}
//Assume its old legacy class
@Override
public int compareTo(Product p) {
	System.out.println("CompareTo ****");
	  if(this.price<p.price) 
		  return -1;
	  else return 1;
	 
	//return this.productName.compareTo(p.productName);
}

public int hashCode() {
	System.out.println("***hashCode called ****");
	return productCode;
}
public boolean equals(Object obj) {
	System.out.println("***Equals called ****");
	Product p=(Product) obj;
	if(p.productCode==this.productCode && p.productName.equals(this.productName)&& p.price==this.price && p.ratings==this.ratings)
		return true;
	else
		return false;
}
}
