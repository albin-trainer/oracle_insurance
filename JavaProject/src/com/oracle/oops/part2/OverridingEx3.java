package com.oracle.oops.part2;

public class OverridingEx3 {
public static void main(String[] args) {
	Super s=new Sub();
	
	System.out.println(s.x);
}
}


class Super{
	
	int x=getX();
	int y=100;
	
	int getX() {
		return y+2;
	}
}



class Sub extends Super{
	int getX() {
		return y+10; //return 0 +10
	}
}