package com.company.java012;

// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)
// 3. 상속의 주 목적 > 재사용
//	Object 

class A1 extends Object {
	int a;
	public A1() { super(); }
}

class B1 extends A1 {
	int b;
	public B1() { super(); }
}

class C1 extends B1 {
	int c;
	public C1() { super(); }
	public void show() { System.out.println(a + "/" + b + "/" + c); }
}
public class Extends001 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.a=1; c1.b=2; c1.c=3; c1.show();
	}
}
/*
-------------------------------------
[method:정보] A1.class, B1.class, C1.class, public Extends001.class #1
-------------------------------------
[heap]							| [stack]
	Object() { #3-4 } #3-5 Object 틀 사용 가능
{a] A1() { #3-3 } #3-6 a=0으로 초기화
{b} B1() { #3-2 } #3-7 b=0으로 초기화
{c]	C1() { #3-1 } #3-8 c=0으로 초기화, 인스턴스 변수를 초기화 해 사용 가능
 								|  main  #2
-------------------------------------
 */