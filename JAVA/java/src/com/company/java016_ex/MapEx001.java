package com.company.java016_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapEx001 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("────────────");
		System.out.println("KING\tNAME");
		System.out.println("────────────");
		for(Entry<String, String>  a:map.entrySet()) { 
			System.out.println(a.getKey()+"\t"+a.getValue());
			System.out.println("────────────");
			}
		Scanner sc = new Scanner(System.in);
		System.out.println("KING의 정보를 제공 중입니다.\n이름을 입력하세요.");
		String temp=sc.next();
		if(map.containsKey(temp)) {System.out.println(temp+"/"+map.get(temp));}
	}
}