package com.company.java011;

class A{
	// 멤버변수
	int a=10;	// 인스턴스 변수 - heap - new - this 각각
	{a=100;}
	static String company="컴퍼니";	// 클래스 변수, 명시적 초기화
	//	클래스 변수 - method - !new - 공유
	//	static {company="컴패니";}	// 초기화 블록
	// 멤버함수
	void method() { int a=5; System.out.println(a); }	// 지역변수 - stack - 초기화
	void show() { System.out.println(this.a); }	// 인스턴스 변수
	
	A(){ }	// 기본 생성자
	A(int a){ this.a=a; }
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}
public class Class006_var {
	public static void main(String[] args) {
		// 클래스 변수
		System.out.println(A.company);
		// 인스턴스 변수
		A a1 = new A(3); System.out.println(a1);
		A a2 = new A(7); System.out.println(a2); a2.method();
	}
}
/******	(1)
──────────────────────────────────
[method:정보, 공유] A.class / Class006.class / company[], main	##1.
──────────────────────────────────
[heap:동적]				| [stack:임시]
						  a2.method(){ int a=5; System.out.println(a); }
1번지{a=7}				← a2 2번지
1번지{a=3}				← a1 1번지
						| main ##2.
──────────────────────────────────
(2) 초기화
						기본값		명시적초기화		초기화블록			생성자
클래스 변수 company		1.null		2.컴퍼니			3.컴패니			X
인스턴스 변수 a			4.'0'		5.'10'			6.'100'			7.'3','7'
******/