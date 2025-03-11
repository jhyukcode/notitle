package com.company.java015_ex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInfo{
	private String name;
	private int age;
	public UserInfo() { super(); }
	public UserInfo(String name, int age) {
		super(); this.name = name; this.age = age; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class ListEx003 {
	public static void main(String[] args) {
		List<UserInfo> list = new ArrayList<>();
		
		list.add(new UserInfo("아이언맨", 50));
		list.add(new UserInfo("헐크", 40));
		list.add(new UserInfo("캡틴", 120));
		
		for(int i=0;i<list.size();i++) {
			UserInfo a = list.get(i);
			System.out.println(a.getName()+" "+a.getAge()+"살");
		}
		
		for(UserInfo a:list) {System.out.println(a.getName()+" "+a.getAge()+"살");}
		
		Scanner sc = new Scanner(System.in);
		String name = " ";
		System.out.println("이름 입력");
		name=sc.nextLine();
		if (name.equals("아이언맨")) {
			System.out.println(list.get(0).getName()+" "+list.get(0).getAge()+"살");
		}
		if (name.equals("헐크")) {
			System.out.println(list.get(1).getName()+" "+list.get(1).getAge()+"살");
		}
		if (name.equals("캡틴")) {
			System.out.println(list.get(2).getName()+" "+list.get(2).getAge()+"살");
		}
	}
}
