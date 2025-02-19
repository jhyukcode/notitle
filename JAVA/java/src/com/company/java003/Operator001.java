package com.company.java003;

import java.util.Scanner;

public class Operator001 {

	public static void main(String[] args) {
//		먼저() 값(+,-,*,/,%,++,--) 비교(>,<,>=,<=) 조건(&&,||,?;) 대입(=)
//		1. 값(+,-,*,/,%,++,--)
		int a=10,b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
//		Q1. 나머지 연산자 짝수/홀수
//		Num%2==0 
		System.out.println(0%2+" "+1%2+" "+2%2+" "+3%2);
//		Q2. 3의 배수
//		Num%3==0
		System.out.println(1%3+" "+2%3+" "+3%3);
		
//		2. 비교(>,<,>=,<=,==,!=)
		System.out.println(10>3);	// T
		System.out.println(10<3);	// F
		System.out.println(a%2==0);	// 짝수
		System.out.println(a%2==1);	// 홀수
		System.out.println(b%3==0);	// T
		
//		3. 조건(&&,||,?;)
		System.out.println(true&true);	//true
		System.out.println(true&&true);	//true 모든 조건 만족 시
		System.out.println(false&true);	//& 처음 false 뒤에 조건까지 읽음
		System.out.println(false&&true);//dead code
		
		System.out.println(true|true);	//하나라도 조건 만족 시 true
		System.out.println(true||true);	//dead code
		System.out.println(false|true);	//
		System.out.println(false||true);//
		
//		4. 조건2 :?
		System.out.println((a>b)?"a>b":"a<b");
		System.out.println((3%2==0)?"짝수":"홀수");
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
//		num=sc.nextInt();
//		Q. 2의 배수이면서 5의 배수면 t/f
		System.out.println((num!=0)?num%2==0&&num%5==0:false);
//		Q. 2의 배수거나 3의 배수면 t/f
		System.out.println((num!=0)?num%2==0||num%3==0:false);
//		Q. 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수 아니면 0
		System.out.println((num>0)?"양수":(num<0)?"음수":"양수, 음수 둘 다 아님");
		
//		5. 대입
		a=10;
		System.out.println(a+=b);	// a+b 결과를 a에 즉시 대입
		System.out.println(a-=b);	// a-b 결과를 a에 즉시 대입
		System.out.println(a*=b);	// a*b 결과를 a에 즉시 대입
		System.out.println(a/=b);	// a/b 결과를 a에 즉시 대입
		System.out.println(a%=b);	// a%b 결과를 a에 즉시 대입
		
		/// () 값 비교조건 대입
		
//		6. ++, -- (단항)
		int a1=1, b1=1, c1=1, d1=1;
		System.out.println(++a1);	//2
		System.out.println(a1);		//2
		
		System.out.println(b1++);	//1
		System.out.println(b1);		//2
		
		System.out.println(--c1);	//0
		System.out.println(c1);		//0
		
		System.out.println(d1--);	//1
		System.out.println(d1);		//0
	}

}
