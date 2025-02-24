package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006_menu {

	public static void main(String[] args) {
		
		int num=1;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("메뉴판입니다 9. 종료>");
			num=sc.nextInt();
			if(num==9) {break;}
			
///			Step1. 메뉴판 무한 반복
///			for(){ //1-1 무한반복
///				//1-2 빠져나올조건=9일떄 }
///
///			Step2. 
///			for () {
///			if or switch
///			1을 입력하면 추가 기능
///			2를 입력하면 조회 기능
///			3을 입력하면 추가 기능
///			4를 입력하면 조회 기능
///			5를 입력하면 삭제 기능
///			}
///
///			Step3.추가
///			Step4.조회
///			Step5.입금
			sc.close();
		}
		
	}

}
