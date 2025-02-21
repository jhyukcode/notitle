package com.company.java005_ex;

public class ForEx005 {

	public static void main(String[] args) {

		int count_3x = 0;
		int count_Lower_Alpbt = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				count_3x++;
			}
		}
		
		
		for (char j = 'a'; j <= 'z'; j++) {
			for (int k = 1; k <= 5; k++) {
				count_Lower_Alpbt++;
			}
		}
		System.out.println("1-10까지 3의 배수의 개수 : " + count_3x + "개");
		System.out.println("소문자 a-z까지 모음의 개수 : " + count_Lower_Alpbt + "개");
	}
}
