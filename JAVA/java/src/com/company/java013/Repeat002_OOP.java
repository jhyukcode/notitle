package com.company.java013;

class MemberCall001{
	int instanceValue=10; // 인스턴스 : heap - new - this
	static int classValue=20; // 클래스변수 : method - !new - 공유 - 클래스명.변수명
	int instanceValue2=classValue; // 라인A 인스턴스변수 = 클래스변수(#우선생성)
	
	static void staticMethod1() {
		System.out.println(classValue);
//		System.out.println(instanceValue); // 라인B
	}
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue); // 라인C
	}
	static void staticMethod2() {
		System.out.println(classValue); 
//		instanceMethod1(); // 라인D
	}
	void instanceMethod2() { // 인스턴스 메서드 : heap area - new - this
		staticMethod1(); // 라인E
	}
}

public class Repeat002_OOP {
	public static void main(String[] args) {
	}
}
/*
1. 클래스는 부품객체 ( 상태:멤버변수 행위:멤버함수 )
	클래스변수,인스턴스변수,지역변수/클래스메서드,인스턴스메서드
변수 초기화 단계		기본값	명시적초기화	초기화블록	생성자
classValue			0		20			20		X
instanceValue		0		10			10		10

Q6. 컴파일 에러가 발생하는 라인과 그 이유 설명
2) static 내에서 인스턴스 변수 호출
4) static 내에서 인스턴스 메서드 호출
	> instance는 new를 사용하여 메모리 할당, 객체 생성 후 사용

Q7. 접근제어자 사용 범위를 작은 순서->큰 순서로 작성
private -> package -> protected -> public

Q8. 다음 Car4는 DT0 목적
8-1. color 접근제어자가 private 이므로 ( getter/setter ) 를 작성해 데이터를 세팅하고 가져오기
8-2. syso(컬러객체명) 시 Car4[color=red] 출력되게 만드려면 # 메서드 필요

Q9. 다음 오류 코드 해결

Q10. 클래스를 상속 하는 이유 작성
	하나의 타입으로 여러 타입을 관리
	코드의 재사용성
Q11. 상속의 형식 작성

Q12-13. 코드 작성


*/