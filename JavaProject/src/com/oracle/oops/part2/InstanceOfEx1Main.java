package com.oracle.oops.part2;

public class InstanceOfEx1Main {

	public static void main(String[] args) {
		
		setAnimal(new Cat());
		System.out.println("-----------------");
		setAnimal(new Dog());
	}
	
	
	static void setAnimal(Animal animal) {
		
		if(animal instanceof Cat) {
			Cat cat=(Cat) animal;
			System.out.println("Success :) :)");
		}
		else {
			System.out.println("We didnt receive Cat :( :( ");
		}
	}
}


class Animal{
	
}
class Cat extends Animal{
	
}

class Dog extends Animal{
	
}