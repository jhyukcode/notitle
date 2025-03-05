package com.company.java012;

class Grand {
	public void one() { System.out.println("grand : one"); }
	public void two() { System.out.println("grand : two"); }
}
class Father extends Grand {
	public void three() { System.out.println("father : three"); }
}
class Uncle extends Grand {
	public void four() { System.out.println("Uncle : four"); }
	@Override public void one() { super.one(); System.out.println("Uncle : one"); }
	@Override public void two() { super.two(); System.out.println("Uncle : two"); }
}
class Aunt {
	String name = "MiMi";
	@Override public String toString() { return name + "옆집이모클래스"; }
}

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three(); father.two(); father.one();
		Uncle uncle = new Uncle(); uncle.four(); uncle.two(); uncle.one();
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);
	}
}
