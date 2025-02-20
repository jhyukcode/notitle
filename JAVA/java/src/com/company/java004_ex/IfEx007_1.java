package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_1 {

	public static void main(String[] args) {

		int x = 0, y = 0;
		char c = ' ';
		String result = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("1. 정수 하나를 입력하세요 > ");
		x = sc.nextInt();

		System.out.print("2. 정수 하나를 입력하세요 > ");
		y = sc.nextInt();

		System.out.print("3. 연산자를 입력하세요 (+,-,*,/) > ");
		c = sc.next().charAt(0);

		if (c == '+') {
			result = "" + (x + y);
		} else if (c == '-') {
			result = "" + (x - y);
		} else if (c == '*') {
			result = "" + (x * y);
		} else if (c == '/') {
			result = "" + (x / (float)y);
		}

		System.out.println(x + "" + c + y + "=" + result);

		sc.close();
	}

}
