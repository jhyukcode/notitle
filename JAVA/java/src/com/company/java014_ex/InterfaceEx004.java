package com.company.java014_ex;

import java.util.Arrays;
import java.util.Calendar;

interface Launch{
	int MONEY = 10000;
	void eat();
}
class Burger implements Launch{
	int price;
	public Burger() { this.price=3900; }
	@Override public void eat() { System.out.println("Burger 냠냠"); }
	@Override public String toString() { return "Burger"; }
}
class KimchiStew implements Launch{
	int price;
	public KimchiStew() { this.price = 4000; }
	@Override public void eat() { System.out.println("KimchiStew 냠냠 "); }
	@Override public String toString() { return "KimchiStew"; }
}
class User{
	int money; int cnt;
	Launch[] plate;
	User() {this.money=Launch.MONEY;plate=new Launch[3]; cnt=0;}
	void order(Launch a) {
		int temp=0;
		if(a instanceof Burger) { System.out.println("버거하나"); temp=((Burger)a).price;}
		else if(a instanceof KimchiStew) {System.out.println("김치찌개 하나"); temp=((KimchiStew)a).price;}
		if(money<temp) {System.out.println("잔액부족"); return;}
		money-=temp;
		plate[cnt++]=a;	}
	
	void show() {
		String order="주문 : ";
		for(int i=0;i<cnt;i++) { order+=((i!=0)?", ":" ")+plate[i]; }
		System.out.println("\n\n"+order);
		System.out.println("주문금액 : "+(Launch.MONEY-money));
		System.out.println("잔액 : "+money);
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(1)+"년 "+(today.get(2)+1)+"월 "+today.get(5)+"일 ");
//								년				월 0-11 (0:1월)				일
//		for(Launch a:plate) {a.eat();}
		for(int i=0;i<cnt;i++) {plate[i].eat();}
	}
}
public class InterfaceEx004 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger());
		launchorder.order(new KimchiStew());
		launchorder.order(new Burger());
		launchorder.show();
	}
}
