package com.company.java009;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = ' ';
		
		System.out.println("알파벳 입력");
		a = sc.next().charAt(0);
		
		if (a=='j') {
			System.out.println("java");
		} else if (a=='h') {
			System.out.println("html");
		} else if (a=='c') {
			System.out.println("css");
		}
		
		
	}

}
