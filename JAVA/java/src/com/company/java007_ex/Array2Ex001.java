package com.company.java007_ex;

public class Array2Ex001 {

	public static void main(String[] args) {

//		   int[][] arr2={{100,200,300},{400,500,600}};
//
//		   이중for 이용해서 출력하기
		
		int [][] arr2 = { {100,200,300},{400,500,600} };	//00 01 02 10 11 12
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
