package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex005 {

	public static void main(String[] args) {

//		1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.
//
//		 int[][] arr = {
//		   { 1, 1, 1,},
//		   { 2, 2, 2,},
//		   { 3, 3, 3,},
//		   { 4, 4, 4,},
//		 };
//		 int total=0;  double avg=0.0;
//
//		출력내용:
//		총점 : 30
//		평균 : 2.5

		int[][] arr = {
				   { 1, 1, 1,},
				   { 2, 2, 2,},
				   { 3, 3, 3,},
				   { 4, 4, 4,},};
		int total = 0; double avg = 0.0;
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total += arr[i][j];
			}
		}
		avg = (double)total/(arr.length*arr[0].length);
//							arr[n]의 길이 x arr[0][n]의 길이
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
	

	}
}
