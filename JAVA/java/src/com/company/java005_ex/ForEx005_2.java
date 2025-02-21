package com.company.java005_ex;

public class ForEx005_2 {

	public static void main(String[] args) {

		int count_3x = 0;
		int cnt = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				count_3x++;
			}
		}
		
		//ver1 'a'가 모음이라면 cnt++
		//ver2 if('a'=='a'||'a'=='e'||'a'=='i'||'a'=='o'||'a'=='u' ){cnt++}
		//ver2 if('b'=='a'||'b'=='e'||'b'=='i'||'b'=='o'||'b'=='u' ){cnt++}
//		if('b'=='a'||'b'=='e'||'b'=='i'||'b'=='o'||'b'=='u' ){cnt++}
		
		for (char ch='a';ch<='z';ch++) {   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u' ){cnt++;}  }
		
		System.out.println("1-10까지 3의 배수의 개수 : " + count_3x + "개");
		System.out.println("소문자 a-z까지 모음의 개수 : " + cnt + "개");
	}
}
