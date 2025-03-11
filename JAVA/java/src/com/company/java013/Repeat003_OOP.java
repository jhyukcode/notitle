package com.company.java013;

class Car4 extends Object{
	private String color;
	public void setColor(String color) { this.color = color; }
	public Car4() { super(); }
	@Override public String toString() { return "Car4 [color=" + color + "]"; }
}
public class Repeat003_OOP {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");
		System.out.println(c1); // Car4[color=red]
	}
}
/*
Q8. 다음 Car4는 DT0 목적
8-1. color 접근제어자가 private 이므로 (getters/setters)를 작성해 데이터를 세팅하고 가져오기
8-2. syso(컬러객체명) 시 Car4[color=red] 출력되게 만드려면 (toString) 메서드 필요

Q9. 다음 오류 코드 해결
	> setter 설정 후 c1.color="red" -> c1.setColor("red")
	
Q10. 클래스를 상속 하는 이유 작성
	> 클래스의 재사용
	
Q11. 상속의 형식 작성
	class 'sub' extends 'super'
*/