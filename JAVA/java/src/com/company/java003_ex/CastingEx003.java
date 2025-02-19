package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대문자 영어 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch+" + 32 => "+(char)(ch+32));
		
//		Q 실수에 정수 대입 시 실수로
		float fl = 1+1.0f;
		System.out.println(fl);
	}

}
