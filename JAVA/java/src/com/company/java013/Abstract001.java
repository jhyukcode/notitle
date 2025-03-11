package com.company.java013;

abstract class Animal{	// 일반클래스+설계
	String name; int age;
	abstract void eat();	// 추상메서드 존재 시 반드시 추상 클래스로 변경
	abstract void sleep();	// 추상메서드는 구현부{}가 없음 : 공통의 속성, 구체적 내용이 없음
	abstract void poo();	// 추상화, 일반화, 설계 : 공통적인 속성, 행동
 }
class Cat extends Animal{
	@Override void eat() { System.out.println(super.name+" cat eat"); }
	@Override void sleep() { System.out.println(super.name+" cat sleep"); }
	@Override void poo() { System.out.println(super.name+" cat poop"); }
}
class Dog extends Animal{
	@Override void eat() { System.out.println(super.name+" dog eat"); }
	@Override void sleep() { System.out.println(super.name+" dog sleep"); }
	@Override void poo() { System.out.println(super.name+" dog poop"); }
}
public class Abstract001 {
	public static void main(String[] args) {
//		1. abstract class : 일반클래스 + 설계
//		 [!] new를 사용할 수 없다 : 구현부X
		Animal ani=null;
		ani = new Cat(); // 부모=자식, 업캐스팅, 타입캐스팅X
		ani.name="sally"; ani.eat();
		
		ani = new Dog();
		ani.name="alpha"; ani.eat();
		
//		2. 사용 목적 : 부모 타입으로 자식 객체 관리
		Animal[] arr = { new Cat(), new Cat(), new Dog(), new Dog()};
		int cnt = 0;
		for(Animal i:arr) { i.name="ani"+ ++cnt; i.eat(); }
	}
}
