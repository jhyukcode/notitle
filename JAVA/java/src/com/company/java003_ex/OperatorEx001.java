package com.company.java003_ex;

public class OperatorEx001 {
	public static void main (String[] args) {
		int a=3,b=10;
		System.out.println(b+=10 - a--);
//		result : 17 (b=20,a=3) / recent b=20,a=2
		
		System.out.println(a+=5);		
//		result : 7 (a=7) / recent b=20,a=7
		
		System.out.println(a>=10||a<0&&a>3);
//		result : false / recent : F||F&&T -> F||F -> F, &&가 ||보다 우선순위가 높음
	}
}
