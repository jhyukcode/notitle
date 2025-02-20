package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평균 점수를 입력하세요");
		avg=sc.nextDouble();

		if (avg > 60.0) {
			System.out.print("합격");
		} else {
			System.out.print("불합격");
		}

		sc.close();
	}
}
