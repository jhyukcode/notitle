package com.company.java016;

interface Inter1 {void method(); }
class Inter1Im1 implements Inter1 {
	@Override public void method() { System.out.println("Hello");}

}

public class Lambda001 {

	public static void main(String[] args) {
		
		Inter1 a1 = new Inter1Im1(); a1.method();
		
//		Inter1 a2 = new Inter1() {
//			@Override public void method() { }; { a21.method();}
//		Inter1 a22 = new Inter1() {
//			@Override public void method() { }
		}
	}
//}