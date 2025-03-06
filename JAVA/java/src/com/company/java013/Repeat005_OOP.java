package com.company.java013;

class Parent{
	int i,j;
	public Parent() { super(); } // Object 호출
	public Parent(int i,int j) {
		super(); // Object 호출
		this.i=i;
		this.j=j;
	}
}
class Child extends Parent{
	int k;
	public Child() { super(); } // Parent 호출
	public Child(int i, int j,int k ) {
		super(i,j); // Parent 호출
		this.k=k;
	}
}
public class Repeat005_OOP {
	public static void main(String[] args) {
		Child child=new Child(10,20,30);
		System.out.println(child.i); // 10
		System.out.println(child.j); // 20
		System.out.println(child.k); // 30
	}
}
/*

*/