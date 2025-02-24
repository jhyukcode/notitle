package com.company.java006_ex;

public class ArrayEx005 {

	public static void main(String[] args) {

//	    1. 배열명 : ch
//	    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
//	    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
		
//		변수
		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int uppAbt = 0, lowAbt = 0;
		
//		입력
//		처리
		for (int i=0;i<ch.length;i++) {
			if (ch[i]>='A'&&ch[i]<='Z') {
				uppAbt++;
			} else if (ch[i]>='a'&&ch[i]<='z') {
				lowAbt++;
			}
		}
		
//		출력
		System.out.println("ch배열에 있는 대문자의 개수 : "+uppAbt);
		System.out.println("ch배열에 있는 소문자의 개수 : "+lowAbt);
		
	}
	

}
