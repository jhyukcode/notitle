package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {

	public static void main(String[] args) {

		int season = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("계절의  시작 월(月) 입력");
		season = sc.nextInt();

		switch (season) {
		case 3:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		}
		sc.close();
	}
	

}