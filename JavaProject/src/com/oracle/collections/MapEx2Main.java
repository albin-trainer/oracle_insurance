package com.oracle.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2Main {
public static void main(String[] args) {
	HashMap<String, String> map1= new HashMap<>();
	map1.put("SBC","Bangalore");
	map1.put("MYS","Mysore");
	map1.put("CST", "Mumbai");
	map1.put("MAS", "Chennai");
	map1.put("DLI", "Delhi");
	System.out.println(map1);
	
	Collection<String> values=map1.values();
	System.out.println("Station names ..");
	for(String city:values) {
		System.out.println(city);
	}
	Set<String> set=map1.keySet();
	System.out.println("---------------------");
	System.out.println("Station codes ..");
	for(String stationCode:set) {
		System.out.println(stationCode+" "+map1.get(stationCode));
		
	}
	
	Set<Entry<String,String>> keyValues= map1.entrySet();
	System.out.println("--------------------------");
	System.out.println("Station code \t Station name");
	for(Entry<String, String> entry:keyValues) {
		String k=entry.getKey();
		String v=entry.getValue();
		System.out.println(k+"     \t"+v);
	}
}
}
