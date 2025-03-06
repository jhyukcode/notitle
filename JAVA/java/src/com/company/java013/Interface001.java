package com.company.java013;

//	1. 클래스는 부품객체
//	2. 상태와 행위

interface Animal1{
	String COMPANY="(주) 동물농장";	// static fianl : method area - !new
	void eat();	// abstract : {}구현이 없어 new 사용 불가
}
class Human implements Animal1{
	@Override public void eat() { System.out.println("밥 식사"); }
}
class Pig implements Animal1{
	@Override public void eat() { System.out.println("꿀꿀");  }
}

public class Interface001 {
	public static void main(String[] args) {
//		Animal1 ani = new Aniaml1();	인스턴스화 불가, 설계목적
		System.out.println(Animal1.COMPANY);
//		하나의 자료형으로 여러개의 타입을 관리하려고 사용
		Animal1[] anis = {new Human(), new Human(), new Pig(), new Pig()};
		for(Animal1 a:anis) {a.eat();}	// @Override : 자식 eat()
	}
}
