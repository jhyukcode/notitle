package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2 = 0;
		
		System.out.print("정수를 입력하세요 : ");
		num1=sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		num2=sc.nextInt();
		
		System.out.printf("%d / %d = %.2f", num1,num2,num1/(float)num2);
//		System.out.printf(String.format("%.2f", num1/(float)num2);
//							String format("출력서식", 처리할 값)
	}

}
