package com.company.java006_ex;

import java.util.Arrays;

public class ArrayEx5_1 {

	public static void main(String[] args) {

//	    1. 배열명 : ch
//	    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
//	    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

//		변수
		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int uppAbt = 0, lowAbt = 0;

//		입력
//		처리
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				uppAbt++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				lowAbt++;
			}
		}

//		출력
		System.out.println("ch배열에 있는 대문자의 개수 : " + uppAbt);
		System.out.println("ch배열에 있는 소문자의 개수 : " + lowAbt);

//		위 배열을 대소문자 교체하여 출력

		System.out.print("ch배열의 대/소문자를 교체하여 출력 : ");
		for (int i = 0; i < ch.length; i++) {

//			삼항 연산자로 처리
//			ch[i] = (ch[i]>='A'&&ch[i]<='Z') ? (ch[i]+=32) : (ch[i]-=32);

//			else if 문으로 처리
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] += 32;
			} else {
				ch[i] -= 32;
			}

			System.out.print(ch[i]);

		}
		System.out.println();
		System.out.println(Arrays.toString(ch));
	}
}
