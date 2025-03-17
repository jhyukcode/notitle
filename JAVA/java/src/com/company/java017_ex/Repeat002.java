package com.company.java017_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class profile2{
	private String name;
	private int age, num;
	public profile2() { super(); }
	public profile2(String name, int age) {
		super(); this.name = name; this.age = age; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class Repeat002 {
	public static void main(String[] args) {        
		Set<profile2> list = new HashSet();
		int total=0; double avg=0.0; int i=1;
		list.add(new profile2("iron", 45));
		list.add(new profile2("hulk", 38));
		list.add(new profile2("captian", 120));
		System.out.println("───────────────────────────────────────");
		System.out.println("NO\tNAME\t\tAGE");
		System.out.println("───────────────────────────────────────");
		Iterator<profile2> iter = list.iterator();
		while(iter.hasNext()) {
			profile2 a = iter.next();
			total += a.getAge();
			avg = total/3f;
			System.out.println(i+"\t"+a.getName()+"\t\t"+a.getAge()); i++;
		}
		System.out.println("나이총합 : "+total+"\n나이평균 : "+String.format("%.2f",avg));
	}
 }