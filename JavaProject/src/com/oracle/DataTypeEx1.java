package com.oracle;

public class DataTypeEx1 {
 static   public void main(String[] args) {
	
	byte b1=-127; //range --> -128 to  127 (1 byte)
	//syso + ctrl +space
	System.out.println(b1);
	
	byte a=10,b=20,c;
	
	c=(byte)  (a+b); //type casting /type conversion
	
	System.out.println("C : "+c);
	
	float f=100;
	System.out.println(f); //100.0
	
	float f2=100.0f; //f or F
	System.out.println(f2);
	
	char ch='A';
	System.out.println(ch);
	
	boolean status=true;
	System.out.println(status);
	
	status=  a<=b; //logical operators returns boolean data type
	System.out.println(status);
	
	//String is java class not a data type, it is used to store seq of characters ...	
	String msg="Hello Good morning";
	System.out.println(msg);
}

 static public  void main(int a) {
	System.out.println("hello ...");
}
}

