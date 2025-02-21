package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		무한 반복
		for(;;) {	// #1. 조건이 없으면 무한반복
			System.out.println("숫자 1을 입력");
			int a = sc.nextInt();
			if(a==1) {break;}
//			a가 1이면 나가기, #2. 나갈조건
			
			sc.close();
		}
	}

}
