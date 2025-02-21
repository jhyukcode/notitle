package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.println("입력하는 정수의 구구단 출력");
		x=sc.nextInt();
		
		for (int i=1;i<=9;i++) {
			System.out.println(x+"×"+i+"="+x*i);
		}
		sc.close();
	}

}
