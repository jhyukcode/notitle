package com.company.java002;

public class DataType001 {

	public static void main(String[] args) {
		//1. 자바의 자료형 분류 ( 기본형 / 참조형 )
		//2. 기본형 : 갑 지정
		// 논리, 정수, 실수
		boolean bi = true; // true or false
		System.out.println("1. 논리 : "+bi);
		
		//정수 ( 1,2,4,8 byte-short-int-long )
		byte by=1; short sh=2; int in=4; long l=8L;
		System.out.println("2. 정수 byte-short-int-long");
		
		//연산시 +, int ( 기본자료형보다 작음 : byte, short ) 연산 시 주의
//		short result = by+sh;	//1+2
//		System.out.println(result);
		
		//실수 ( float, double )
		float fl=3.14f; double d=3.14;
		System.out.println("3. 실수 float-double : "+fl+"-"+d);
		
		System.out.println("4. 실수 > 정수");	
		fl = l;	// fl( 실수 : 4byte ) = long ( 정수 : 8byte )
		System.out.println(fl); //8.0
		
		System.out.println("5. 정밀도");
		float fper = 1.0000001f;	// float 소수점 아래 8번쨰 반올림
		float fper1 = 1.00000001f;	// float 소수점 아래 8번쨰 반올림
		double dper = 1.000000000000001;	// dobule 소수점 아래 17번째 반올림
		double dper1 = 1.0000000000000001;	// dobule 소수점 아래 17번째 반올림
		System.out.println(fper+" "+fper1);
		System.out.println(dper+" "+dper1);
		
		int a =2>>32;	// int : 4byte, 8*4byte : 32
		int b =2>>33;	// 1
		System.out.println(a+"\t"+b);
		
		System.out.println("6. 문자는 저장시 숫자, 출력시 문자");
		char ch = 'A';	//문자 ' '
		System.out.println(ch);	//출력
		System.out.println((int)ch);	// (int) 정수표현시 65
		
		}

}
