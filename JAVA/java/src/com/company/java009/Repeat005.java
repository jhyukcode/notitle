package com.company.java009;

public class Repeat005 {

	public static void main(String[] args) {

		char[][] arr2 = new char[2][3];	// 00 01 02
										// 10 11 12
		
		char data = 'a';
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=data++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
