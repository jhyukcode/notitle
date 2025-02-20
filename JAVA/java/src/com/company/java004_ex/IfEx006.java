package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("여자");
		} else if (x % 2 == 1) {
			System.out.println("남자");
		}

		sc.close();
	}

}