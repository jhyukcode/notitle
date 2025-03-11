package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collcection004_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		
		System.out.println(map);
		System.out.println(map.get("one"));
		System.out.println(map.size());
		System.out.println(map.remove("three"));
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Entry<String, String> a:map.entrySet()) {
			System.out.println(a.getKey()+"/"+a.getValue());
		}
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+"/"+map.get(key));
			}
		
		
	}
	
}
