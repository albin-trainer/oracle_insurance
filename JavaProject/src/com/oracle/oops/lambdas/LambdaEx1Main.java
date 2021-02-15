package com.oracle.oops.lambdas;

public class LambdaEx1Main {
	public static void main(String[] args) {
		Greet birthdayWishes= new Greet() {
			public String wish(String name) {
				return "Hi "+ name+" Happy Birthday ....";
			}
		};
		
		greetingService(birthdayWishes, "Kaushik");
		Greet bdayWishes=name->"Hi "+name+" Many many happy returns of the day !!!!";
		greetingService(bdayWishes, "Aiana");
		greetingService(n->"Hi "+n+" Happy Wedding Anniversary !!!", "Albin");
		
		greetingService( (String n)->"Hi "+n+" Have a Wonderful Day !!!", "All");
		System.out.println("------------------------------------");
		greetingService( (n)->"Hi "+n+" Have a Wonderful Day !!!", "All");
	}
	
	//Do the wishes ...
	static void greetingService(Greet greet,String name) {
		System.out.println(greet.wish(name));
	}
	
}

@FunctionalInterface //the interface which having only one method ...
interface Greet{
	String wish(String name);
	//void f1();
}