package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex006 {
	public static void main (String[] args) {
			
///		int[][] datas = {  {  10, 10, 10 ,10}, 
//		            	{  20, 20, 20 ,20}, 
//		            	{  30, 30, 30 ,30},  
//		};  // 3층 4칸 
//		int[][] result = new int[datas.length+1][datas[0].length+1];
//
//
//		출력내용:
//		10   10   10   10   40   
//		20   20   20   20   80   
//		30   30   30   30   120   
//		60   60   60   60   240   

			int [][] datas = { {10, 10, 10 ,10},	// 00 01 02 03
							  {20, 20, 20 ,20}, 	// 10 11 12 13
							  {30, 30, 30 ,30},};	// 20 21 22 23
			
			int [][] result = new int[datas.length+1][datas[0].length+1];	// 00 01 02 03 04
																			// 10 11 12 13 14
																			// 20 21 22 23 24
																			// 30 31 32 33 34

//			1. result[i][4]는 data[i][0]-data[i][3] 을 모두 더한 값
//			2. result[3][i]는 data[1,2,3][0]을 모두 더한 값 0,1,2,3 0 / 0,1,2,3 1
			
			for (int i=0;i<datas.length;i++) {
				for (int j=0;j<datas[i].length;j++) {
					result[i][j] = datas[i][j];		// datas 배열의 값을 result 배열로 옮김
					result[i][4] += datas[i][j];	// datas[i][0,1,2,3] 의 합을 result[i][4]에 입력
					result[3][j] += datas[i][j];	// datas[0,1,2][j]의 합을 result[3][j]에 입력
					result[3][4] += datas[i][j];	// datas 배열에 있는 모든 수의 합을 result[3][4]에 입력
				}
			}

			System.out.println();
			System.out.println(Arrays.deepToString(result));
			
			for (int i=0;i<result.length;i++) {
				for (int j=0;j<result[i].length;j++) {
					System.out.print(result[i][j]+" ");
				}
			System.out.println();
				}			
			}
}