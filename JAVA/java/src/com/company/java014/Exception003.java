package com.company.java014;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception003 {
	public static int nextInt() throws InputMismatchException{		// 발생지점
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 입력 ");
		a = sc.nextInt();	// 1. nextInt() 숫자 입력 받기를 기다림
		return a;
	}
	public static void main(String[] args) /*throws Exception*/ {
		int a=-1;
		while(true)
		try {
		a=nextInt();	// 호출자
		if(a==1) break;
		} catch(Exception e) { System.out.println("[오류]"); }
		System.out.println("결과 "+a);
	}
}

// main
//Exception in thread "main" java.util.InputMismatchException			#1
//at java.base/java.util.Scanner.throwFor(Scanner.java:964)
//at java.base/java.util.Scanner.next(Scanner.java:1619)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
//at java/com.company.java014.Exception003.main(Exception003.java:18)	#2

// method 
//Exception in thread "main" java.util.InputMismatchException				#1
//at java.base/java.util.Scanner.throwFor(Scanner.java:964)
//at java.base/java.util.Scanner.next(Scanner.java:1619)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
//at java/com.company.java014.Exception003.nextInt(Exception003.java:10)	#2-2 발생지점
//at java/com.company.java014.Exception003.main(Exception003.java:14)		#2-1 호출자