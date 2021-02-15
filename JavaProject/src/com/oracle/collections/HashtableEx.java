package com.oracle.collections;

import java.util.Hashtable;

public class HashtableEx {
public static void main(String[] args) {
	Hashtable<String, String> table=new Hashtable<String, String>();
	table.put("SBC", "Bangalore");
	table.put("MYS", "Mysore");
	
	System.out.println(table);
	table.put(null,"somecity");
	System.out.println(table);
	
}
}
