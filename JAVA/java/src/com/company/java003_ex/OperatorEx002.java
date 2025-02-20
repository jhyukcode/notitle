package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx002 {

	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		x = sc.nextInt();
		System.out.println("영문자 1개 혹은 정수 한 자리 입력");
		ch = sc.next().charAt(0);

//		Q1
		System.out.println(x > 3 && x < 10);
//		Q2
		System.out.println(ch == 'a' || ch == 'A');
//		Q3
		System.out.println(ch >= '0' && ch <= '9');
//		Q4
		System.out.println(((int)ch>=65?(int)ch<=90:false)||((int)ch>=97?(int)ch<=122:false));
		System.out.println('A'<=ch&&ch<='Z'||'a'<=ch&&ch<='z');
		
		sc.close();

	}

}
