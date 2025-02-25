package com.company.java007;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		
///		1. 자바의 자료형은 기본형 / 참조형 으로 구분된다.
///		2. 자바의 기본형은 byte, short, int, long, float, double, boolean, char 이 있다.
///		3. 자바의 형변환은 boolean을 제외하고 기본형에서 가능하다
///		4. ch 가 대문자일 경우의 조건식 : if (ch>='A' && ch<='Z')
///		5. ch 가 소문자일 경우의 조건식 : if (ch>='a' && ch<='z')
///		6. a 가 0~100 사이일 경우의 조건식 : if (a>=0 %% a<=100>)
		
		Scanner sc = new Scanner(System.in);
		char x = ' ';
		
		System.out.print("알파벳 단어 하나 입력 : ");
		x=sc.next().charAt(0);
		
		if (x=='a') {
			System.out.print("apple");
		} else if (x=='b') {
			System.out.print("banana");
		} else if (x=='c') {
			System.out.print("coconut");
		}
		
	}

}
