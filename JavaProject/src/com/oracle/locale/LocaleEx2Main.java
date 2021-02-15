package com.oracle.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleEx2Main {
public static void main(String[] args) {
	
	String x="ಶುಭೋದಯ"
			;
	System.out.println("Choose ur language");
	System.out.println("1. English   \n2. Hindi   \n3. Kannada\n 4. Tamil");
	Scanner scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
	switch(choice) {
	case 1: 
		print("en");
		break;
	case 2:
		print("hi");
		break;
	case 3:
		print("ka");
		break;
	case 4:
		print("ta");
	}
}
static void print(String code) {
	ResourceBundle messages =null;
	String wish,message;
	 messages=ResourceBundle.getBundle("message",new Locale(code));
	 wish=messages.getString("wish");
	 message=messages.getString("message");
	System.out.println(wish);
	System.out.println(message);
}
}
