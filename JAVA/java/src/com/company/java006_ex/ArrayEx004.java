package com.company.java006_ex;

public class ArrayEx004 {

	public static void main(String[] args) {

//	    1. 배열명 : ch
//	    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
//	    3. ch 배열에서 a의 갯수 세기
		
//		변수
		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int count = 0;
		
//		입력
//		처리
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				count++;
			}
		}
		
//		출력
		System.out.println("ch배열에 있는 'a'의 개수 : "+count);
		
	}

}
