package com.oracle.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapEx1Main {
public static void main(String[] args) {
	HashMap<String, String> map1= new HashMap<>();
	map1.put("SBC","Bangalore");
	map1.put("MYS","Mysore");
	map1.put("CST", "Mumbai");
	map1.put(null,"somecity");
	map1.put(null,"somecity 2");
	System.out.println(map1);
	map1.put("SBC","Bengaluru"); //it overwrites ..
	System.out.println(map1);
	
	String city=map1.get("MYS");
	System.out.println(city);
	
	System.out.println("----TreeMap --- in sorted order by keys");
	TreeMap<String, String> map2=new TreeMap<String, String>();
	map2.put("SBC","Bangalore");
	map2.put("MYS","Mysore");
	map2.put("CST", "Mumbai");
	System.out.println(map2);
	map2.put("SBC","Bengaluru"); //it overwrites ..
	System.out.println(map2);
	System.out.println("----LinkedHashMap --- in insertion order");
	LinkedHashMap<String, String> map3=new LinkedHashMap<String, String>();
	map3.put("SBC","Bangalore");
	map3.put("MYS","Mysore");
	map3.put("CST", "Mumbai");
	System.out.println(map3);
	map3.put("SBC","Bengaluru"); //it overwrites ..
	System.out.println(map3);
	
	
	
}
}
