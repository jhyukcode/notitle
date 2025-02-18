package com.company.java002;

import java.util.Scanner;

public class DataType003 {

	public static void main(String[] args) {
		//1. 자료형 : 기본형 / 참조형
		//2. 기본형 : 논리형, 정수형(1-2-4-8), 실수형(4-8)
		
		//gigo > 변수 - 입력 -처리 - 출력
//		변수
		float f = 3.14f;
		double d = 3.14;
		Scanner sc = new Scanner(System.in);
//		입력
		System.out.print("실수를 입력하세요 : ");
		f=sc.nextFloat();
		System.out.print("실수를 입력하세요 : ");		
		d=sc.nextDouble();
//		처리
//		출력
		System.out.print("당신이 입력한 값 : "+f+" "+d);
		System.out.printf("\n당신이 입력한 값 : %f %f", f, d);
	}

}
