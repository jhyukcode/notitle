package com.company.java008_ex;

public class Repeat004 {

	public static void main(String[] args) {
		
		int[][] arr2 =	{ {10, 20, 30},
						  {50, 60, 70},
		};
		
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		
		
	}

}
