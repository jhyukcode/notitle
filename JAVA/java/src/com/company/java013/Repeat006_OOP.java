package com.company.java013;
/* Q1. 상속도 / Q2. 멤버변수 멤버메서드 표시
 * 	Object
 * 	 ↑		 멤버변수		  멤버메서드
 * 	Papa { money=10000 / sing"GOD" }
 *   ↑
 * 	Son2 { money=1500 / sing"빅뱅" }
 */
class Papa extends Object{  
	int money = 10000;
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}
class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); }
}
public class Repeat006_OOP {
	public static void main(String[] args) {
		// Q8.  부모 =  자식 관계   /  업,다운캐스팅 선택 /  타입캐스팅 필요여부
//			> 부모는 자식을 담을 수 있다 / 업캐스팅 / 타입캐스팅X
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미?
//			> {money=10000/sing()}을 사용가능한 상태로 만듦 (객체생성)
		// Q4. 인스턴스화한 실제 메모리 빌려온그림 
//			> 1번지{money=1500/sing"빅뱅"} - {money=15000/--}
		System.out.println(mypapa.money); // Q5. 출력 : 10000   
		mypapa.sing(); // Q6. 출력 : 빅뱅-거짓말  
		// Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.
		System.out.println(((Son2)mypapa).money);
		}
	}
/*

*/