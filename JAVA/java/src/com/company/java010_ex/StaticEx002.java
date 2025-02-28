package com.company.java010_ex;

class Mobile2{
	String serialNo;
	static int count=0;
	
	Mobile2() {
		Mobile2.count++;
		this.serialNo="2020-"+Mobile2.count;
	}
}

public class StaticEx002 {
	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2(); //m1.serialNo="2030-"+(++Mobile2.count);
		Mobile2 m2 = new Mobile2(); //m2.serialNo="2030-"+(++Mobile2.count);
		Mobile2 m3 = new Mobile2(); //m3.serialNo="2030-"+(++Mobile2.count);
		Mobile2 m4 = new Mobile2(); //m4.serialNo="2030-"+(++Mobile2.count);
		
		System.out.println("모바일 갯수는 모두 "+Mobile2.count+"개 입니다.");
		System.out.println("m1의 제품번호 "+m1.serialNo);
		System.out.println("m2의 제품번호 "+m2.serialNo);
		System.out.println("m3의 제품번호 "+m3.serialNo);
		System.out.println("m4의 제품번호 "+m4.serialNo);
	}
}