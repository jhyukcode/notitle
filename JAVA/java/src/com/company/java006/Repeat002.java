package com.company.java006;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		System.out.println("정수 입력");
		x = sc.nextInt();
		
		switch (x) {
		case 10 :
			System.out.println("10이다");
			break;
		case 20:
			System.out.println("20이다");
			break;
		case 30:
			System.out.println("30이다");
//			break;
		}
		sc.close();
	}

}
