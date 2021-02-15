package com.oracle.exceptions;

public class AssertEx {
public static void main(String[] args) {
	int a=100;
	int b=50;
	//in default the assert is disabled ..
	//assert(a<b); //NOT for DEVELPOMENT PURPOSE (ONLY FOR TESTING PURPOSE)
	assert(a<b) :"Test failed";
	System.out.println("Main Ends ...");
}
}
