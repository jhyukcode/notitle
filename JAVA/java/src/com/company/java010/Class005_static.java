package com.company.java010;

class Farm{
	String name;	// 인스턴스 변수 - heap area = new O > this.name
	int age;	// 인스턴스 변수 = heap area = new O > this.age
	static String FarmName="(주)동물농장";	// 클래스 변수 - method area = new X
	static int num = 10;	// 클래스 변수 - method area = new X
	
	static void num_plus() {num++;}
	void show() {
		System.out.println("\n\n──────────────────────────");
		System.out.println("회사명 : "+Farm.FarmName);
		System.out.println("식구수 : "+Farm.num);
		System.out.println("이 름 : "+this.name);
		System.out.println("나 이 : "+this.age);
	}
}
public class Class005_static {
	public static void main(String[] args) {
		System.out.println("Step1. 클래스 변수-static");
		System.out.println("회사명 > "+Farm.FarmName);
		System.out.println("식구수 > "+Farm.num);
//		System.out.println("이 름 > "+Farm.name);
		
		System.out.println("\n\nStep2. 인스턴스 변수-this(heap<=>new)");
		Farm cat = new Farm(); cat.name="sally"; cat.age=10; cat.show();
		Farm dog = new Farm(); dog.name="alpha"; dog.age=3; dog.show();
	}
}
/*
------------------------------- runtime 
[method : 정보,static,final/공유]		
Farm.class/Class005.class/Farm.FarmName,Farm.num,Farm.num_plus
---------------------------------------------
[heap]               	| [stack]
26줄 {name=sally,age10}	<-cat:1번지
27줄 {name=alpha,age3}	<-dpg:2번지						
						| #2 main
---------------------------------------------
*/
