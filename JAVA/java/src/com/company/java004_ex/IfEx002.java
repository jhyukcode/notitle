package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		x = sc.nextInt();

		if (x > 0) {
			System.out.println("양수");
		} else if (x < 0) {
			System.out.println("음수");
		} else if (x == 0) {
			System.out.println("zero");
		}
		sc.close();
	}
}
