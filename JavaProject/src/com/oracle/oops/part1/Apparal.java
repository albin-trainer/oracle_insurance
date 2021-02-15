package com.oracle.oops.part1;

public class Apparal extends Product {
private String fabric;
private String color;
private String size;
public String getFabric() {
	return fabric;
}
public void setFabric(String fabric) {
	this.fabric = fabric;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
//Overriding ...
void display() {
	//display(); //Become recursion ...invokes same class display..
	super.display();
	System.out.println("Fabric : "+fabric);
	System.out.println("Color : "+color);
	System.out.println("Size : "+size);
}

}
