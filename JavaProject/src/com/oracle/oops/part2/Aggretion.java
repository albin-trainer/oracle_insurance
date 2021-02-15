package com.oracle.oops.part2;

public class Aggretion {
public static void main(String[] args) {
	Bottle b=new Bottle();
	Water w=new Water();
	
	b.pore(w);
	b=null;
	Runtime.getRuntime().gc();
	System.out.println("Main Ends..");
}
}

class Bottle{
	private Water water;

	public Water getWater() {
		return water;
	}

	public void pore(Water water) {
		this.water = water;
	}
@Override
protected void finalize() throws Throwable {
	System.out.println("Bottle getting garbage collected. ..");
}	
	
}
class Water{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Water getting garbage collected. ..");
	}
	
}