package com.company.java010;

//	1. 클래스는 부품객체
//	2. 클래스 속성(멤버변수)과 행위(멤버함수)

class Car31{}	// 생성자 Car31() 컴파일러가 생성자를 기본 생성
class Car32{
	String color;
//	alt shift s * 밑에서 3번쨰 (2,3,4, getters/setters)
//	오버로딩 시 - [수동]으로 생성자를 만들면 컴파일러가 기본 생성자를 자동 생성 취소
	public Car32(String color) { super(); this.color=color; }
	public Car32() { };
	}
//	class Car33 extends Car32 { public Car33(String color) } { super(color); }
//	기본생성자는 오버로딩, 상속
	
public class Class003_Constructor {
	public static void main(String[] args) {
		
		Car31 car1 = new Car31();	// 3-1. new(메모리빌리고, 객체생성) 3-2. Car31() 초기화 3-3. car1 번지
		System.out.println(car1);	// com.company.java010.Car31@78a2da20
		
//		Car32 car2 = new Car32();
//		System.out.println(car2+"\t"+car2.color);	//com.company.java010.Car32@7bc1a03d	null
		
		Car32 car3 = new Car32("red");
		System.out.println(car3+"\t"+car3.color);	//com.company.java010.Car32@58134517	red
//		Car33 son = new CAr33();
		
//─────────────────────────────────────────────runtime
//[method: 정보, static, final] Car31.class / Car32.class / Class003.class
//─────────────────────────────────────────────
//[heap:동적]					| [stack:지역]
//								| main
//─────────────────────────────────────────────
		
	}
}
