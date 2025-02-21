package com.company.java005;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {
//		변수
		Scanner sc = new Scanner(System.in);
		int a = 0;
//		입력
		System.out.println("정수 입력");
		a=sc.nextInt();
//		처리
//		출력
		switch (a) {
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		default :
			System.out.println("1,2,3이 아니다");
		} 
		
		sc.close();
	}

}
