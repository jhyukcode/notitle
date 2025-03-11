package com.company.java012_ex;
//	Object
//	  ↑
//	Parent7 { x=100 / method="Parent Method" }
//	  ↑
//	Child7 { x=200 / method="Child Method" }
class Parent7  extends Object{
	   int x = 100;
	   public Parent7() { super(); }
	   void method() { System.out.println("Parent Method"); }
}
class Child7 extends Parent7 {
	   int x = 200;
	   public Child7() { super(); }
	   @Override  void method() { System.out.println("Child Method"); }
}
public class PolyEx002 {
	public static void main(String[] args) {
		Parent7 p = new Child7();
//		1번지 { x=200 / method=Child } - { x=100 / -- }
//						 [		보장되는 범위		  ]
//		p[1번지] { x=200 / method=Child } - { x=100 / -- }
		Child7 c = new Child7();
//		2번지 { x=200 / method=Child } - { x=200 / -- }
//						[		보장되는 범위		 ]
//		c 2번지 { x=200 / method=Child } - { x=200 / -- }
		System.out.println("p.x = "+ p.x);	// 100
		p.method();	// Child Method
		System.out.println("c.x = "+ c.x);	// 200
		c.method();	// Child Method
		System.out.println(((Parent7)c).x);
	}
}