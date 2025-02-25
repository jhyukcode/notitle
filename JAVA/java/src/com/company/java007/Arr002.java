package com.company.java007;

import java.util.Arrays;

public class Arr002 {

	public static void main(String[] args) {
		
//		1. new 연산자를 이용하여 처리
		int[] arr = {1,2,3};	// 배열 생성 및 초기화
//		1번지{1,2,3} <- arr:1번지	갯수/indext0-2
		
		int[] arr2 = new int[3];	//배열 생성 new(공간빌리기) int[3] 3개 연속하여
//		2번지{ , , ] >- arr2:2번지
		
		System.out.println(arr2);	//[I@19dc67c2
		System.out.println( Arrays.toString(arr2) );	//[0,0,0]
		
//		arr2[0] = 10;//┐
//		arr2[1] = 20;//┤ for문으로 줄이기
//		arr2[2] = 30;//┘
		
		for (int i=0;i<=2;i++) {
			arr2[i] = (i+1)*10;  
		}
		
		System.out.println( Arrays.toString(arr2) );
		
		
		
		
	}

}
