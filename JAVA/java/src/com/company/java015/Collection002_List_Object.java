package com.company.java015;
import java.util.ArrayList;
import java.util.List;

//	1. Dto ( 데이터 전달 : 생성자, toString, get/set )
class Milk{
	private int mno;
	private String name;
	private int mprice;
	
	public Milk() { super(); }

	public Milk(int mno, String name, int mprice) {
		super(); this.mno = mno; this.name = name; this.mprice = mprice; }

	@Override
	public String toString() { return "Milk [mno=" + mno + ", name=" + name + ", mprice=" + mprice + "]"; }

	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) { this.mprice = mprice; }
}

public class Collection002_List_Object {
	public static void main(String[] args) {
//		2. Milk 자료형으로 ArrayList 동적 배열 만들기 milks
		List<Milk> milks = new ArrayList<>();
		
		milks.add(new Milk(1, "white", 1200));
		milks.add(new Milk(2, "choco", 1400));
		milks.add(new Milk(3, "banana", 1500));
		
		for(int i=0;i<3;i++) {
			Milk temp = milks.get(i);
			System.out.println(temp.getMno()+"/"+temp.getName()+"/"+temp.getMprice());
		}
		
		for(Milk temp:milks) {System.out.println(temp.getMno()+"/"+temp.getName()+"/"+temp.getMprice());
		}
		
//		System.out.println(milks.get(0));
//		System.out.println(milks.get(1));
//		System.out.println(milks.get(2));
	}
}
