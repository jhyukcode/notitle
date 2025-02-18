package com.company.java002;
import java.util.Scanner;

public class DataType002 {

	public static void main(String[] args) {
		//자료형의 분류 : 기본형(값) / 참조형(주소)
		//기본형 : 논리형, 정수형 (by-sh-in-lo), 실수형 (fl-do)
		
		//OOP : 클래스(부품객체)를 조립해 완성해가는 프로그램
		int a=1;	//기본형
		Scanner scanner=new Scanner(System.in);	//참조형 : Ctrl+Shift+O
		//1. new 공간빌리기		heap[ ]
		//2. Scanner(System.in) 사용할 수 있게 초기화(키보드로 입력)
		//3. heap 1000번지 [ [키보드로 입려 받는 기능] ] <-scanner[1000번지]
		//## oop
		
		System.out.print("좋아하는 숫자 입력 : ");
		a = scanner.nextInt();
		System.out.print("좋아하는 숫자는 : "+a);
	}

}
