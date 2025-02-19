package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {

	public static void main(String[] args) {
//		변수
		float pi = 0.0f;
		Scanner sc = new Scanner(System.in);
//		입력
		System.out.print("파이(π) 값을 입력하세요 : ");
		pi=sc.nextFloat();
//		처리
//		X
//		출력
		System.out.printf("파이(π)의 값 : %.6f", pi);
//		System.out.print("파이(π)의 값 : "+pi);
	}

}
