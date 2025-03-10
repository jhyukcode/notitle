package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2{
	private int no;
	private String name;
	private int age;
	public UserInfo2() { super(); }
	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
public class SetEx002 {
	public static void main(String[] args) {
		
		Set<UserInfo2> users = new HashSet<>();
		
		users.add(new UserInfo2(1, "아이언맨", 50));
		users.add(new UserInfo2(2, "헐크", 40));
		users.add(new UserInfo2(3, "캡틴", 120));
		
		for(UserInfo2 a:users) {
			System.out.println(a.getNo()+"/"+a.getName()+"/"+a.getAge());}
		
		Iterator <UserInfo2> info = users.iterator();	// 1. 모으기
		while(info.hasNext()) {							// 2. 처리 대상 확인
			UserInfo2 u = info.next();
			System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());			// 3. 꺼내오기
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		// set 에서 데이터 가져오기 > 해당 데이터와 입력받은 값이 같다면 해당 데이터의 전체 출력
		info=users.iterator();
		while(info.hasNext()) {
			UserInfo2 u = info.next();
			if(u.getName().equals(name)) {
				System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());
			}
		}
		
		
	}
}
