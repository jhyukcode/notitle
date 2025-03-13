package com.company.java017_ex;

import java.util.ArrayList;
import java.util.Iterator;

class profile{
	private String name;
	private int age, num;
	public profile() { super(); }
	public profile(String name, int age) {
		super(); this.name = name; this.age = age; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class Repeat001 {
	public static void main(String[] args) {        
		ArrayList list = new ArrayList<>();
		int total=0; double avg=0.0; int i=1;
		list.add(new profile("iron", 45));
		list.add(new profile("hulk", 38));
		list.add(new profile("captain", 120));
		System.out.println("───────────────────────────────────────");
		System.out.println("NO\tNAME\t\tAGE");
		System.out.println("───────────────────────────────────────");
		Iterator<profile> iter = list.iterator();
		while(iter.hasNext()) {
			profile a = iter.next();
			total += a.getAge();
			avg = total/3f;
			System.out.println(i+"\t"+a.getName()+"\t\t"+a.getAge()); i++;
		}
		System.out.println("나이총합 : "+total+"\n나이평균 : "+String.format("%.2f",avg));
	}
 }