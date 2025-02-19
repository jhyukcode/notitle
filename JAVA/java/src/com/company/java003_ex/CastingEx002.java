package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pt1, pt2, pt3, sum, lv = 0;
		float avg= 0.0f;
		
		System.out.print("국어 점수를 입력하세요 : ");
		pt1=sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		pt2=sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		pt3=sc.nextInt();
		
		sum=pt1+pt2+pt3;
		avg=sum/3.0f;
		lv=(int)avg/10;
		
		System.out.println(":::::::::::::::::::::");
		System.out.println("::GOOD IT SCORE::");
		System.out.println(":::::::::::::::::::::");
		System.out.println("국어\t수학\t영어\t총점\t평균\t레벨");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d",pt1,pt2,pt3,sum,avg,lv);
	}

}