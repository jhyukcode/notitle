package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex004 {

	public static void main(String[] args) {

//		1. new 연산자 이용하여 다차원배열만들기
//		2. for + length 이용해서 대입   
//		3. for + length 이용해서 출력 
//		   A   B   C
//		   B   C   D
		
		char [][] arr = new char [2][3];
		char abt = 'A';
		
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = abt++;
			}
			abt -= 2; 
		}
		System.out.println(Arrays.deepToString(arr));
		
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
