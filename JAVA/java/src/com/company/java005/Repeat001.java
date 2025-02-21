package com.company.java005;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
//		변수
		Scanner sc = new Scanner(System.in);
		int a = 0;
//		입력
		System.out.println("정수 입력");
		a=sc.nextInt();
//		처리
//		출력
		if (a==1) {
			System.out.println("1이다");
		} else if (a==2) {
			System.out.println("2다");
		} else if (a==3) {
			System.out.println("3이다");
		} else {
			System.out.println("1,2,3이 아니다");
		}
		
		sc.close();
	}

}
