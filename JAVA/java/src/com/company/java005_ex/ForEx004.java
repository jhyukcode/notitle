package com.company.java005_ex;

public class ForEx004 {

	public static void main(String[] args) {

		int count_3x = 0;

		System.out.print("3의 배수 : ");
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ((i == 9) ? "" : ", "));
				count_3x++;
			}
		}
		System.out.print(" ");
		System.out.println("\n1-10까지 3의 배수의 개수 : " + count_3x + "개");
	}
}
