package com.company.java014;

class Parent{
	int x=100;
	void method() { System.out.println("Parent Method"); }
}
class Child extends Parent{
	int x=200;
	void method() { System.out.println("Child Method"); }
}

public class Repeat001 {
	public static void main(String[] args) {
		Parent p = new Child();
//		p = {x=200,child} - {x=100,--}
		Child c = new Child();
//		c = {x=200,child} - {x=200,--}
		System.out.println("p.x = "+p.x);	// 100
		p.method();	// child
		System.out.println("c.x = "+c.x);	// 200
		c.method();	// child
	}
}