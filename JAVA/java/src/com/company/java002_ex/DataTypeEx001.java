package com.company.java002_ex;
import java.util.Scanner;

public class DataTypeEx001 {

	public static void main(String[] args) {
		//GIGO
		//변수-입력-처리-출력
		//변수
		int age;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("당신의 나이를 입력하세요 : ");
		age = scanner.nextInt();
		//처리 X
		//출력
		System.out.print("당신의 나이는 "+age+"살 입니다.\n");
		System.out.printf("당신의 나이는 %d살 입니다.", age);
	}

}
