package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex007 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int num = 1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
