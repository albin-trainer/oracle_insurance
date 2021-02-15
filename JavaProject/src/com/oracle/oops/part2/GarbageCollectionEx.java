package com.oracle.oops.part2;

public class GarbageCollectionEx {
public static void main(String[] args) {
	Ex e1=new Ex();
	Ex e2=new Ex();
	
	e1=e2;
	System.gc();//NOT forcing.. giving suggestion or request to GC
	System.out.println("Main Ends ..");
}
}


class Ex{
	int a=10;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called ...");
	}
}