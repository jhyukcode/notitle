package com.company.java007;

import java.util.Arrays;

public class Arr2_001 {

	public static void main(String[] args) {
		
		int [][] arr = {{ 1,2,3 },{4,5,6}};	// 00 01 02 10 11 12
		
//		눈에 보이는 대로
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));	//[[I@221af3c0, [I@62bd765]
		System.out.println(Arrays.deepToString(arr));	//[[1, 2, 3], [4, 5, 6]]
		
//		칸 정리
		for (int i=0;i<3;i++) {
			System.out.print(arr[0][i]+"\t");
			System.out.println();
		}
		for (int i=0;i<3;i++) {
			System.out.print(arr[1][i]+"\t");
			System.out.println();
		}
		
//		층 정리
//		 for (int i=0;i<2;i++) {
//			 	(int j=0;j<2;j++) {
//			 		System.out.print(arr[1][i]+"\t");
//			 		System.out.println();
	}
}
