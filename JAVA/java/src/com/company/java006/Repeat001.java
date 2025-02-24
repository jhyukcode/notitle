package com.company.java006;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.println("정수 입력");
		x = sc.nextInt();

		if (x == 10) {
			System.out.println("10이다.");
		} else if (x == 20) {
			System.out.println("20이다");
		} else if (x == 30) {
			System.out.println("30이다");
		}
		sc.close();
	}

}
