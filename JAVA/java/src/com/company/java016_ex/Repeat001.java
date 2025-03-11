package com.company.java016_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//	컬렉션 프레임워크
//	배열의 단점을 개선한 클래스, 클래스 객체만 저장 가능, 저장 고안의 크기를 동적으로 관리함

//	핵심 인터페이스 List, Set, Map
//	인터페이스를 텅해서 틀이 잡혀있는 방법으로 다양한 컬렉션 클래스를 이용함

//	List : 순서O, 중복O > add, get, size, remove, contains
//	Set : 순서X, 중복X > add, 향상된 for/iterator, size, remove, contains
//	Map : key-value 쌍 > put, get(key), 향상된 for/iterator, size, remove, contains

class  UserInfo{
	private String name;
	private int age;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Repeat001 {
	public static void main(String[] args) {
//		ArrayList
		ArrayList<UserInfo> users = new ArrayList();
		
		users.add(new UserInfo("아이언맨", 50));
		users.add(new UserInfo("헐크", 40));
		users.add(new UserInfo("캡틴", 120));
		
		for(int i=0;i<users.size();i++) {
			System.out.println(users.get(i).getName()+"/"+users.get(i).getAge());
		}
		
		for(UserInfo a:users) { System.out.println(a.getName()+"/"+a.getAge()); }
	
		System.out.println();
//		HashSet
		Set<UserInfo> users2 = new HashSet<>();
		
		users2.add(new UserInfo("아이언맨", 50));
		users2.add(new UserInfo("헐크", 40));
		users2.add(new UserInfo("캡틴", 120));
		
		for(UserInfo a:users2) { System.out.println(a.getName()+"/"+a.getAge()); }
		
		Iterator<UserInfo> iter = users2.iterator();
		while(iter.hasNext()) {
			UserInfo a = iter.next();
			System.out.println(a.getName()+"/"+a.getAge());
		}
		
	}
}
