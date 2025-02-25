package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx007 {

	public static void main(String[] args) {

//	    1. 배열명 : arr     
//	    2. 값 넣기 : A   B   C   D   E    for+length 이용해보기
//	    3. for + length 로 출력
		
		char[] arr = new char[5];
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=(char)('A'+i);
		}
		
		System.out.println( Arrays.toString(arr) );
	}

}
