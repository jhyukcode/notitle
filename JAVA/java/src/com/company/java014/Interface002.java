package com.company.java014;

class Class1{}
class Class2{}

interface Inter21{ void method1(); } 
interface Inter22{ void method2(); }
interface Inter23 extends Inter21, Inter22{}

class Using1 extends Class1 implements Inter21, Inter22{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface002 {
	public static void main(String[] args) {
		Using1 my = new Using1();
//		instance of 클래스 확인 상속 확인
		if(my instanceof Object) { System.out.println("Object"); }
		if(my instanceof Class1) { System.out.println("Class1"); }
		if(my instanceof Inter21) { System.out.println("Inter21"); }
		if(my instanceof Inter22) { System.out.println("Inter22"); }
	}

}
