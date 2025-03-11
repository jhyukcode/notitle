package com.company.java014;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception004 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("숫자 1 입력 ");
			a = sc.nextInt();	// 1. nextInt() 숫자 입력 받기를 기다림
								// 2. 'a' 
			if(a==1)  {break;}
			}
			catch(InputMismatchException e) { 
				sc.next(); 	// 3. 'a' 처리
//				System.out.println("숫자 1 입력.");
			}
		}
		System.out.println("결과 :"+a);
	}
}