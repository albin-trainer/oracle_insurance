package com.oracle.oops.lambdas;

import java.util.stream.IntStream;

public class IntStreamEx {
public static void main(String[] args) {
	//usually to print 1 to 10 nos ..
	System.out.println("------its old style-----------");
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
	System.out.println("----its new style--------");
	
	IntStream.rangeClosed(1, 10).forEach(System.out::println);
	
	int arr[]= {11,33,454,66,11,33,44,55,22,11};
	
	System.out.println("-------only even nos---------------------");
	IntStream.of(arr).filter(n->n%2==0).forEach(System.out::println);
}
}
