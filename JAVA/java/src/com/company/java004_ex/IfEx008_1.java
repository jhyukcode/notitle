package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008_1 {

	public static void main(String[] args) {

//		변수
		int pt1 = 0, pt2 = 0, pt3 = 0, sum = 0;
		double avg = 0.0;
		char lv = ' ';
		String stdID = "", pass = "", scholar = "";
		Scanner sc = new Scanner(System.in);

//		입력
		System.out.print("학번 입력 > ");
		stdID = sc.nextLine();
		System.out.print("국어 점수 입력 > ");
		pt1 = sc.nextInt();
		System.out.print("영어 점수 입력 > ");
		pt2 = sc.nextInt();
		System.out.print("수학 점수 입력 > ");
		pt3 = sc.nextInt();

//		처리
		sum = pt1 + pt2 + pt3;
		avg = sum / 3.0;

		pass = (avg >= 60.0 && pt1 >= 40 && pt2 >= 40 && pt3 >= 40)? "합격":"불합격";
		
		scholar = (avg>=95)? "장학생":"미해당";
		
		lv = (avg>=90)? '수':(avg>=80)? '우':(avg>=70)?'미':(avg>=60)?'양':'가';

//		출력
		System.out.println("=====================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("=====================================================================");
		System.out.printf(stdID + "\t" + pt1 + "\t" + pt2 + "\t" + pt3 + "\t" + sum + "\t" + ("%.2f") + "\t" + pass
				+ "\t" + lv + "\t" + scholar, avg);

		sc.close();
	}

}
