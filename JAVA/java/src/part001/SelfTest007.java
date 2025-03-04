package part001;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		char char_=' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("a, b, c 중에 입력해주세요");
		char_=sc.next().charAt(0);
		switch (char_) {
		case 'a','A': { System.out.println("apple"); } break;
		case 'b','B': { System.out.println("banana"); } break;
		case 'c','C': { System.out.println("coconut"); } break;
		default : { System.out.println("대소문자 관계없이 a, b, c만 입력 가능합니다"); }
		}
	}
}
