package com.company.java017_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class profile3{
	private String name;
	private int age, num;
	public profile3() { super(); }
	public profile3(String name, int age) {
		super(); this.name = name; this.age = age; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class Repeat003 {
	public static void main(String[] args) {        
		Map<String, Integer> list = new HashMap<>();
		int total=0; double avg=0.0; int i=1;
		list.put("iron", 45);
		list.put("hulk", 38);
		list.put("captian", 120);
		System.out.println("───────────────────────────────────────");
		System.out.println("NO\tNAME\t\tAGE");
		System.out.println("───────────────────────────────────────");
		Iterator<String> iter = list.keySet().iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			total += list.get(a);
			avg = total/3f;
			System.out.println(i+"\t"+a+"\t\t"+list.get(a)); i++;
		}
		System.out.println("나이총합 : "+total+"\n나이평균 : "+String.format("%.2f",avg));
	}
}