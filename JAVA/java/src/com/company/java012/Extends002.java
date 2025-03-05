package com.company.java012;

class Color {
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
class Green extends Color{
	private int num;
	public void setNum(int num) { this.num = num; }
	void show() {
		System.out.println("───── GREEN");
		System.out.println("─ NAME : "+getName());
		System.out.println("─ NUM  : "+num);
	}
}
public class Extends002 {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.setNum(5);
		mygreen.show();
	}
}
/*
-------------------------------------
[method:정보] COlor.class, Green.class, public Extends001.class #1
-------------------------------------
[heap]							| [stack]
	Object() { #3-3 } #3-4 Object 틀 사용 가능
Color() { #3-2 } #3-5 name 인스턴스 변수 사용 가능
Green() { #3-1 } #3-6 num 인스턴스 변수 사용 가능
 								|  main  #2
-------------------------------------
 */