package com.company.java013;

class A11{
	  int a; // (1) : 인스턴스 변수
	  A11() {}
	  A11(int a) { this.a=a;} // (2) int a : 지역변수
	  //(3) void show() : 인스턴스 메서드 : heap area - new - this 각각
	  void show() { this.a=11; System.out.println(this.a);}
	  //(4) static void classMethod() : 클래스 메서드
	  void classMethod() { this.a=12; } 
	  //(5) int show2() : 인스턴스 메서드
	  int show2() { int a=0; return a; }
	  // 			 └ stack(임시공간) - 변수초기화가 안됨
	}
public class Repeat001_OOP {
	public static void main(String[] args) {
		A11 a1 = new A11(); // 지역변수 - stack
	}
}
/*
Q1. (1) (2) (3) (4) (5)를 
[클래스변수, 인스턴스변수, 지역변수, 클래스메서드, 인스턴스메서드] 로 분류하세요

Q2. 클래스 A11에서 오류가 발생한 곳을 수정하고 그 이유를 작성
(4) : 클래스 메서드 내에서 인스턴스 변수에 접근할 수 없다
(5) : a는 지역변수인데 초기화되지 않고 return 되었기 떄문에 값을 초기화

Q3. (b)번 위치에서 
메모리를 빌려오고, 객체를 생성하는 역할 : new
String은 null, int는 0으로 초기화하는 역할 : A11()
A11()한 주소를 갖고 있는 것은 : a1

Q4. 기본 생성자를 반드시 선언해야 하는 경우를 작성
> 생성자 오버로딩, 상속 시

Q5. 오버로딩이 성립하기 위한 조건이 아닌 것은
c. 리턴 타입이 달라야 한다
d. 매개변수의 이름이 달라야 한다
*/