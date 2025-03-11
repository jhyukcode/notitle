package com.company.java014;

class Papa{
	int money=10;
	public Papa() {}
	public Papa(int money) { this.money=money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa{
	int money=150;
	int car=2;
	public Son() { super(); }
	public Son(int money) { this.money=money; }
	public Son(int money, int car) { this.money=money; this.car=car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}
public class Repeat002 {
	public static void main(String[] args) {
//		Q3.
		Papa p1 = new Papa();
//		p1 = {money=10} - {money=10}
		System.out.println(p1);
//			> toString
//		Q4.
		Son s2 = new Son();
//		s2 = {money=150, car=2} - {money=150, --}
		System.out.println(s2);
//			> toString
//		Q5.
//		Son s3 = new Papa();
//		System.out.println(s3);
//			> Type mismatch: cannot convert from Papa to Son
//		Q6.
		Papa p4 = new Son();
//		p4 = {money=150, car=2} - {money=10,--}
		System.out.println(p4);
//			> toString Son > 150 2
		System.out.println(p4.money);	// 10
//		Q7.
		Papa p5 = new Son();
		Son s5 = (Son) p5;
		System.out.println(s5);
		System.out.println(s5.money);
	}
}
/*
Q2. 상속도 
  	┌>Object 
  	├─Papa	{int money}
  	└──Son	{int money, int car}

Q8. 오버로딩과 오버라이딩
 	오버라이딩 : 변수의 개수나 타입이 다를 떄 
 	오버로딩 : 변수의 개수와 타입이 같을 떄
 
Q9. abstract : 실체화된 객체들 간에 공통되는 특성을 추출한 것
 
Q10. interface : 개발 코드와 객체 사이를 연결

Q11. abstract와 interface의 차이점
	abstract : {}구현부가 존재하고, 단일 상속만 가능하며, 접근 제어자 사용 범위가 넓다
	interface : {}구현부가 존재하지 않고, 다중 상속이 가능하며, 상수만 사용 가능하다

 */
