package com.company.java014;

interface Animal{
	String NAME="홍길동";
	void eat();
}
class Human implements Animal{
	@Override public void eat() { 
//	NAME="아이유";
//	The final field Animal.NAME cannot be assigned 상수임
	System.out.println(NAME+" 밥을 먹어요");
	}
}
public class Repeat004 {
	public static void main(String[] args) {
		Animal ani = new Human();
//			> Cannot instantiate the type Animal : 인터페이스 혹은 추상 클래스로 객체 생성하여 생긴 오류
//			new Animal() -> new Human()
//		Animal ani = null;
//			> Duplicate local variable ani : 중복선언으로 인한 오류
		ani = new Human(); ani.eat();
	}
}
