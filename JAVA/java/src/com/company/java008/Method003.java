package com.company.java008;

public class Method003 {
	
	public static String sign() { return "junhyuk";}
	public static int num() { return (int)(Math.random()*55); }
	public static String hello(String name) { return "안녕 "+name; }

	public static void main(String[] args) {
//		public static 리턴값 메서드명(파라미터) {};

//		public static junhyuk sign() { return "junhyuk";}
//		public static String sign() { return "junhyuk";}
		System.out.println("당신의 이름은? "+ sign());
//							당신의 이름은?	   junhyuk
		
		int yournum = num();
		System.out.println("랜덤 숫자 : "+yournum);
		System.out.println("π : "+pi());

		System.out.println(hello("sally"));
		System.out.println(hello("alpha"));
		
		
		
	}

	public static double pi() { return 3.141592; }
}
