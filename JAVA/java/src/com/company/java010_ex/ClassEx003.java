package com.company.java010_ex;

class Coffee { String name; int price, num;
//	↑속성(멤버변수) ↓{행위(멤버함수)}
public Coffee(String name, int price, int num) { super(); this.name = name; this.price = price; this.num = num; }
//	생성자(Constructor)
public void show() { System.out.println("──────────커피\n커피명 : "+name+"\n잔 수 : "+price+"\n가격 : "+num*price); } }
//	메서드(행위)

public class ClassEx003 {
	public static void main(String[] args) {

		Coffee a1 = new Coffee("카페라떼", 2, 4000);
		a1.show();
//		1. new(공간,객체생성) 2. a1() 초기화 3. a1 주소 = 1번지
		Coffee a2 = new Coffee("아메리카노", 1, 2000);
		a2.show();
//		1. new(공간,객체생성) 2. a2() 초기화 3. a2 주소 = 2번지
	}

}
