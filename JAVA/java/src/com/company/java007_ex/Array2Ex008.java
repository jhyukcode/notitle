package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex008 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = i+1;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		System.out.print(Arrays.deepToString(arr));
		
	}

}
