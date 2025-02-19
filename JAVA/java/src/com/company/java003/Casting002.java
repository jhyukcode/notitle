package com.company.java003;

import java.util.Scanner;

public class Casting002 {

	public static void main(String[] args) {
//		#1. 문자 초기화
		char ch1 =' ';	// 공백 한 칸
		char ch2 ='\u0000';
		
		System.out.println("1. "+ch1+"\t"+ch2);
		System.out.println("2. "+(int)ch1+"\t"+(int)ch2);
		
//		#2. 문자의 연산
		char c = 'A';
		System.out.println("3. "+c+"\t"+(int)c);
		System.out.println("4. "+(c+1));	// 66
//		1) + 더하기 연산
//		2) 숫자 + 숫자 더하기
//		3) 'A'+1 = 'A' (char|2byte) + 1(int|4byte)
//		4) 결과물 int
		System.out.println("5. "+(char)(c+1));
//		byte - short[2byte] / char[2byte] - int
//		byte ex1 = 1;
//		ERR) byte result = ex1+10;	// byte[1]+int[4]
//		SOL) int result = ex1+10;
		
//		Q. 대문자 'A'를 소문자 'a'로 변환
//		System.out.println('a'+"\t"+(int)'a');	a 97
		System.out.println("6. "+'A'+"+32 => "+(char)(c+32));
		
		
		
//		#3. 문자열
//		자료형의 분류는 기본형(값)과 참조형(주소)
		String str1="abc";	// 객체 사용시	str1 주소
		Scanner sc = new Scanner(System.in);	// Scanner 주소
		
		System.out.println(str1);
		System.out.println(sc);
		
		System.out.println(str1.charAt(0));	// a
		System.out.println(str1.charAt(1));	// b
		System.out.println(str1.charAt(2));	// c
//		Q. 대문자을 입력 받아서 소문자로 변경 -> CastingEx003.java
		String str = sc.next();
		System.out.println("입력한 문자열 : "+str);
		
	}

}
