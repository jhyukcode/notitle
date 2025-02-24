package com.company.java007;

import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char x = ' ';
		
		System.out.print("알파벳 단어 하나 입력 : ");
		x=sc.next().charAt(0);
		
		if (x=='a') {
			System.out.print("apple");
		} else if (x=='b') {
			System.out.print("banana");
		} else if (x=='c' ) {
			System.out.print("coconut");
		}
		
	}

}
