package com.company.java009_ex;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char a = ' ';
		
		System.out.println("알파벳 입력");
		a = sc.next().charAt(0);
		
		switch (a) {
		case 'j':
			System.out.println("java");
			break;
		case 'h':
			System.out.println("html");
			break;
		case 'c':
			System.out.println("css");
			break;
		}
	
	}

}
