package com.company.java003;

public class Casting001 {

	public static void main(String[] args) {
//		1. 형 변환 : 자동 타입 변환
//		byte < short < int < long < float < double
		byte by =1;
		short sh = 2;
		int in = 4;
		long l = 8L;
		float f = 3.14f;
		double d = 3.14;
		
		sh = by;	// 정수[2byte] - 정수[1byte]
		in = by;	// 정수[4byte] - 정수[2byte]
		l  = by;	// 정수[8byte] - 정수[4byte]
		
//		l = f;		// 정수[8byte] - 실수[4byte] 성립안됨
		
		f = l;		// 실수[4byte] - 정수[8byte]
		
//		boolean 1byte
//		boolean bl = true;
//		in =bl; boolean은 형 변환 불가
		
//		2. 형 변환 : 강제 타입 변환
		by = (byte)in;	// 정수[1] - 정수[4]
		int in2 = (int)1.2;	// 정수[4] - 실수[8]
		float fl2 = (float)3.1411111111;	// 실수[4] - 실수[8]
//		float : 소수점 아래 7자리 | double : 소수점 아래 15자리
		
		System.out.println(in2);	// 1
		System.out.println(fl2);	// 3.1411111
		
//		Q1. result : 3
		System.out.println((int)1.5+(int)2.7);	
	}

}
