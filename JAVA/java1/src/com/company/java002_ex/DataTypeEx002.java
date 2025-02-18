package com.company.java002_ex;
import java.util.Scanner;

public class DataTypeEx002 {

	public static void main(String[] args) {
		//gigo
		//변수
		int fNum = 0;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("당신이 좋아하는 숫자를 입력하세요 : ");
		fNum = scanner.nextInt();
		//처리X
		//출력
		System.out.print("당신이 좋아하는 숫자는 "+fNum+"입니다.");
		System.out.printf("\n당신이 좋아하는 숫자는 %d입니다.", fNum);
	}

}
