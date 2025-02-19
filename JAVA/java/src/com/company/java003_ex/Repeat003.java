package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {

	public static void main(String[] args) {
		int pt1, pt2, pt3, sum = 0;
		float avg = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		pt1=sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		pt2=sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		pt3=sc.nextInt();
		
		sum=pt1+pt2+pt3;
		avg=(float)sum/3;
		
		System.out.printf("총점 : %d\n평균 : %.2f", sum,avg);
	}

}
