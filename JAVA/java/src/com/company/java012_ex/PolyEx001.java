package com.company.java012_ex;
//	Q1. 
//	Object	
//	↑
//	Papa	{ money=10000 / sing="GOD-거짓말" }	< 멤버변수/멤버메서드
//	↑
//	Son		{ money=1500 / sing="빅뱅-거짓말" }	< 멤버변수/멤버메서드

class Papa extends Object{  
	   int money = 10000;
	   public Papa() { super(); }
	   public void sing() {  System.out.println("GOD-거짓말");  }
}
class Son extends Papa{ 
	   int money = 1500;
	   public Son() { super(); }
	   @Override public void sing() {  System.out.println("빅뱅-거짓말"); }
}
public class PolyEx001 {
	public static void main(String[] args) {
		Papa mypapa = new Son();	// 부모=자식 / 다운캐스팅
//		Q3. Papa mypapa의 의미 : {money=10000 / sing() }
//		1번지 { money=1500 / sing 빅뱅 } - Son { money=10000 / -- }
//								  [			 보장되는 범위	 	 	 ]
//		mypapa 1번지 { money=1500 / sing 빅뱅 } - Son { money=10000 / -- }
		System.out.println(mypapa.money);	// Q5. 10000
		System.out.println(((Son)mypapa).money);	// Q7. 10000->1500
		mypapa.sing();	// Q6. 빅뱅-거짓말
	}
}
