package com.company.java004;

import java.util.Scanner;

public class Switch001 {

	public static void main(String[] args) {
//		변수
		int a = 0;
		Scanner sc = new Scanner(System.in);

//		입력
		System.out.print("숫자 한 개 입력 : ");
		a = sc.nextInt();

//		처리 ( if switch for while do-while )
		if (a == 1) {
			System.out.print("1이다");
		} else if (a == 2) {
			System.out.print("2다");
		} else if (a == 3) {
			System.out.print("3이다");
		}

		switch (a) {
		case 1:
			System.out.print("1이다");
			break;
		case 2:
			System.out.print("2다");
			break;
		case 3:
			System.out.print("3이다");
			break;
		}

//		출력
		
		
		sc.close();
	}

}
