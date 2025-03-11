package com.company.java014;

abstract class Fruit{
	@Override public String toString() { return "Fruit "; }
	public abstract void myfruit();
}
class Apple extends Fruit{
	@Override public String toString() { return "사과는 빨갛다"; }
	@Override public void myfruit() { }
}
class Banana extends Fruit{
	@Override public String toString() { return "바나나는 노랗다"; }
	@Override public void myfruit() { }
}
class Coconut extends Fruit{
	@Override public String toString() { return "코코넛은 코코다"; }
	@Override public void myfruit() { }
}
public class Repeat003 {
	public static void main(String[] args) {
		Fruit[] fruits = {new Apple(), new Banana(), new Coconut()};
		for(Fruit a:fruits) {System.out.println(a);}
	}
}
