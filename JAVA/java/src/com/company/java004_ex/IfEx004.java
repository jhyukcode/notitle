package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {

	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);

		System.out.println("영문자 입력");
		ch = sc.next().charAt(0);

		if ('A' <= ch && ch <= 'Z') {
			System.out.println("대문자입니다.");
		} else if ('a' <= ch && ch <= 'z') {
			System.out.println("소문자입니다.");
		}

		sc.close();
	}

}
