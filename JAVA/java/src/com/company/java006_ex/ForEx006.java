package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {

	public static void main(String[] args) {

//		변수
		int num1 = -1, num2 = -1;
		double result = ' ';
		char op = ' ';
		Scanner sc = new Scanner(System.in);

		/*
		 * for(;;) { // 정수 1 입력 받기/ 'x'가 0-100이 맞는 지 확인하고 / 아래로 진행할 것인지 체크 continue // 정수
		 * 2 입력 받기/ 맞는 지 확인하고 아래로 진행할 것인지 체크 // 연산자 입력 받기/ 맞는 지 확인하고 아래로 진행할 것인지 체크 }
		 */
		
//		입력
		for (;;) {
			if (!(100 >= num1 && num1 >= 0)) {
				System.out.print("정수(1)를 하나 입력해주세요 (0-100) > ");
				num1 = sc.nextInt();
				continue;
			}

			if (!(100 >= num2 && num2 >= 0)) {
				System.out.print("정수(2)를 하나 입력해주세요 (0-100) > ");
				num2 = sc.nextInt();
				continue;
			}

			if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.print("연산자를 입력해주세요 (+, -, *, /) > ");
				op = sc.next().charAt(0);
				continue;
			}
			break;
		}

//		처리
//		(switch)문
		switch (op) {
		case '+':result = num1 + num2; break;
		case '-':result = num1 - num2; break;
		case '*':result = num1 * num2; op = '×'; break;
		case '/':result = num1 / (double)num2; op = '÷';
		}
		
//		(if)문
//		if (op == '+') {result = num1 + num2;} 
//		else if (op == '-') {result = num1 - num2;} 
//		else if (op == '*') {result = num1 * num2; op = '×';} 
//		else if (op == '/') {result = num1 / num2; op = '÷';}

//		출력
		if (!(op == '÷')) {
			System.out.println(""+ num1 + op + num2 + "=" + (int)result);
		} else {
			System.out.printf(""+ num1 + op + num2 + " = %.2f", result);
		}

	}	// end main
}	// end class

//		System.out.println(x+z+y+"=");

//		100>=x&& x>=0
//		100>=y && y>=0
//		z=='+','-','*',','

//	1)  각 연산자에 맞게 계산처리
//	2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
//	3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
//	     
//
//	1. 정수를 하나 입력해주세요 > 10
//	2. 정수를 하나 입력해주세요 > 3
//	3. 연산자를 입력해주세요(+,-,*,/) > +
//	10+3=13		
