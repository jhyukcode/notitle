package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {

	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);

		System.out.println("영문자 입력");
		ch = sc.next().charAt(0);

		if ('a' <= ch && ch <= 'z') {
			System.out.print((char) (ch - 32));
		} else if ('A' <= ch && ch <= 'Z') {
			System.out.print((char) (ch + 32));
		}
		sc.close();
	}

}
