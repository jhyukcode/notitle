package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {

	public static void main(String[] args) {

		int x = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		x = sc.nextInt();

		if (x == 1) {
			System.out.println("one");
		} else if (x == 2) {
			System.out.println("two");
		} else if (x == 3) {
			System.out.println("three");
		} else {
			System.out.println("1, 2, 3이 아님");
		}

		sc.close();
	}
}
