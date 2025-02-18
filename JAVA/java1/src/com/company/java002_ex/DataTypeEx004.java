package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {

	public static void main(String[] args) {
//		변수
		int pt1, pt2, pt3, sum = 0;
		float avg = 0;
		Scanner sc = new Scanner(System.in);
		
//		입력
		System.out.print("국어 점수를 입력하세요 : "); pt1 = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : "); pt2 = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : "); pt3 = sc.nextInt();
		
//		처리
		sum = pt1+pt2+pt3;
		avg = (float)sum/3;	//정수/정수=실수 > 정수/실수
		
//		출력
		System.out.printf("총점 : %d\n평균 : %.2f", sum, avg);
	}

}
