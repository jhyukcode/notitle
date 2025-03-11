package com.company.java012;

class TestA4 extends Object{
	int a=10;
	@Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4 extends TestA4{
	int b=20;
	@Override public String toString() { return "TestB4 [b=" + b + "]"; }
}

public class Poly004 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();
		TestB4 tb = new TestB4();
		ta= new TestB4();
		tb=(TestB4) ta;
		System.out.println(tb);
	}
}
