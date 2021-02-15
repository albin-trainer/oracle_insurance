package com.oracle.oops.lambdas;

public class LambdaEx2Main {
public static void main(String[] args) {
	//Old style of code
	Calculator sum = new Calculator() {
		public float eval(float a, float b) {
			return a+b;
		}
	};
	
	calculate(sum, 10, 20);
	//Please try to make a lambda expression for the target of Calculator interface ...
	calculate((x, y)->x*y,10,5);
	
}

static void calculate(Calculator cal, float a,float b) {
	System.out.println(cal.eval(a, b));
}
}


@FunctionalInterface
interface Calculator{
	float eval(float a, float b);
}