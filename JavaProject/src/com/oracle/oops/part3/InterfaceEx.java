package com.oracle.oops.part3;

public class InterfaceEx {
	public static void main(String[] args) {
		Drive driver=getCar("Honda");
		driver.accelerator();
		driver.clutch();
		Diagonistics diagon=repair("Honda");
		diagon.repair();
	}
	
	//Factory Design pattern
	static Drive getCar(String carName) {
		if(carName.equals("Honda"))
				return new Honda();
		else if(carName.equals("Tata"))
			return new Tata();
		else
			return new Kia();
	}
	static Diagonistics repair(String carName) {
		return new Honda();
	}
}

interface Drive{
	void accelerator();
	void clutch();
}
interface Diagonistics{
	void repair();
}
class Honda implements Drive,Diagonistics{
	public void accelerator() {
		System.out.println("Honda car acceleator started working ..");
	}

	public void clutch() {
		System.out.println("Honda car Clutch clutch working ..");
	}
	public void repair() {
		System.out.println("Honda car getting repaired ...");
	}
}

class Tata implements Drive{
	public void accelerator() {
		System.out.println("Tata car acceleator started working ..");
	}
	public void clutch() {
		System.out.println("Tata car clutch started working ..");
	}
}

class Kia implements Drive{
	public void accelerator() {
		System.out.println("Kia car acceleator started working ..");
	}
	public void clutch() {
		System.out.println("Kia car clutch started working ..");
	}
}