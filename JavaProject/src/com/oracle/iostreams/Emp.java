package com.oracle.iostreams;

import java.io.Serializable;
public class Emp implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
private  String name;
private String designation;
private  Address address;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
class Address implements Serializable {
	private String city;
	private long pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	
}