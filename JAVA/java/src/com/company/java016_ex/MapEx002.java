package com.company.java016_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class UserInfo1{
	private String name;
	private int age;
	public UserInfo1() {
		super();
	}
	public UserInfo1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "UserInfo1 [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class MapEx002 {
	public static void main(String[] args) {
		
		Map<Integer, UserInfo1> map = new HashMap<>();
		
		map.put(1, new UserInfo1("아이언맨", 50));
		map.put(2, new UserInfo1("헐크", 40));
		map.put(3, new UserInfo1("캡틴", 120));
		map.put(1, new UserInfo1("아이언맨-new", 50));
		
		for(Integer key:map.keySet()) {
			System.out.println(key+"/"+map.get(key));
		}
		
		for(Entry<Integer, UserInfo1> m:map.entrySet()) {
			System.out.println(m.getKey()+"/"+m.getValue());
		}
		
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			Integer it = iter.next();
			System.out.println(it + ": " + map.get(it) );
			
		Iterator<Entry <Integer,UserInfo1>> iter2 = map.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<Integer,UserInfo1> temp = iter2.next();
			System.out.println(temp.getKey()+"/"+temp.getValue());
		}
		}
	}
}