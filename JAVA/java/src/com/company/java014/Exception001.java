package com.company.java014;
import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a=-1;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 1 입력 ");
			a = sc.nextInt();
			if(a==1)  {break;}
		}
			System.out.println("결과 :"+a);
	}
}
