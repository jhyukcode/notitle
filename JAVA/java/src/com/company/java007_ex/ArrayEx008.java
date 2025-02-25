package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {

	public static void main(String[] args) {

//	    String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
//	    int[] kor={100,20,90,70,35};   
//	    int[] eng={100,50,95,80,100};
//	    int[] mat={100,30,90,60,100};
//	    int[] aver=new int[5];
//
//	     1. 평균구하시오.
//	     2. 합격,불합격   -  평균이 60점이상이면 합격, 아니면 불합격으로 처리하시오.
//	     3. 장학생   - 평균 95점이상이면 장학생으로 처리하시오. 
		
		String[] name = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		String[] section = { "이름","국어","영어","수학","평균","합격여부","장학생","순위"};
		int[] kor = { 100, 20, 90, 70, 35 };
		int[] eng = { 100, 50, 95, 80, 100 };
		int[] mat = { 100, 30, 90, 60, 100 };
		int[] avg = new int[5];
		int[] rank = {1,2,3,4,5};
		char star = '★';
		String[] pass = new String[5];
		String[] scholar = new String[5];
		
		System.out.println("────────────────────────────────────────────────────────────");
		
		for (int i=0;i<section.length;i++) {
			System.out.print(section[i]+"\t");
		}
		
		System.out.println("\n────────────────────────────────────────────────────────────");
		
		for (int i=0; i<avg.length; i++) {
			avg[i] = (kor[i]+eng[i]+mat[i])/3;
			pass[i] = (avg[i]>=60)?"합격":"불합격";
			scholar[i] = (avg[i]>=95)?"해당":"-";
					
		}
		for (int i=0;i<rank.length;i++) {
			for(int j=1;j<rank.length;j++) {
				if (avg[i]<avg[j]) {
					int num = rank[j];
					rank[j] = rank[i];
					rank[i] = num;
				}
			}
		}
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+avg[i]+"\t"+pass[i]+"\t"+scholar[i]+"\t"+rank[i]+"\t");
			for (int j=avg[i]/10;j<=0;j--) {
				System.out.print(star);
			}
			System.out.println();
		}

		
		System.out.println("─────────────────────────────────────────────────────────────");
	}
}
