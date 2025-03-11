package com.company.java013;

abstract class Shape{
	abstract void showArea(int a, int b);
	abstract void showArea(int a);
}
class Rectangle extends Shape{
	@Override void showArea(int a, int b) { System.out.println("사각형의 넓이 : "+(a*b)); }
	@Override void showArea(int a) {  }
}
class Circle extends Shape{
	@Override void showArea(int a, int b) {  }
	@Override void showArea(int a) { System.out.println("원의 넓이 : "+((a*a)*Math.PI));  }
}
class Triangle extends Shape{
	@Override void showArea(int a, int b) { System.out.println("삼각형의 넓이 : "+((a*b)/2)); }
	@Override void showArea(int a) {  }
}
public class Abstract002 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.showArea(10, 10);
		Triangle tri = new Triangle();
		tri.showArea(10, 10);
		Circle cir = new Circle();
		cir.showArea(10);
	}
}
