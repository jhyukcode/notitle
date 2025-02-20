package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {

	public static void main(String[] args) {

		int pt1 = 0, pt2 = 0, pt3 = 0, sum = 0;
		double avg = 0.0;
		char lv = '가';
		String stdID = "", pass = "불합격", scholar = "해당 안됨";
		Scanner sc = new Scanner(System.in);

		System.out.print("학번 입력 > ");
		stdID = sc.nextLine();
		System.out.print("국어 점수 입력 > ");
		pt1 = sc.nextInt();
		System.out.print("영어 점수 입력 > ");
		pt2 = sc.nextInt();
		System.out.print("수학 점수 입력 > ");
		pt3 = sc.nextInt();

		sum = pt1 + pt2 + pt3;
		avg = sum / 3.0;

		if (avg >= 60.0 && pt1 >= 40 && pt2 >= 40 && pt3 >= 40) {
			pass = "합격";
		}

		if (avg >= 95) {
			scholar = "장학생";
		}
		
		
		if (avg >= 90) {
			lv = '수';
		} else if (avg >= 80) {
			lv = '우';
		} else if (avg >= 70) {
			lv = '미';
		} else if (avg >= 60) {
			lv = '양';
		}

		System.out.println("=====================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("=====================================================================");
		System.out.printf(stdID + "\t" + pt1 + "\t" + pt2 + "\t" + pt3 + "\t" + sum + "\t" + ("%.2f") + "\t" + pass
				+ "\t" + lv + "\t" + scholar, avg);

		sc.close();
	}

}
