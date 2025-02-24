package com.company.java007;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char x = ' ';
		
		System.out.print("알파벳 단어 하나 입력 : ");
		x=sc.next().charAt(0);
		
		switch (x) {
		case 'a':
			System.out.print("apple");
		case 'b':
			System.out.print("banana");
		case 'c':
			System.out.print("coconut");
		}
	}

}
