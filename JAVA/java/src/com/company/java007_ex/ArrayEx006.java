package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx006 {

	public static void main(String[] args) {
		
//	    1. 배열명 : arr     
//	    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5    for+length 이용해보기
//	    3. for + length 로 출력
		
		double[] arr = new double[5];

		System.out.println( Arrays.toString(arr) );
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = i/10.0+1.1;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.printf( String.format("%.1f", arr[i])+"\t"  );
		}
	}

}
