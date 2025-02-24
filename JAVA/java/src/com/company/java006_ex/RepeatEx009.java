package com.company.java006_ex;

public class RepeatEx009 {

	public static void main(String[] args) {

//		A-Z 출력 / 5번 출력할 때 마다 줄바꿈
		
//		1-1. for
		for (char apb='A';apb<='Z';apb++) {
			System.out.print(apb);
			if (apb%5==4) {
				System.out.println();
			}
		}
		
		System.out.println("\n");
		
//		2-2. while
		char apb1 = 'A';
		while (apb1<='Z') {
			System.out.print(apb1);
			if (apb1%5==4) {
				System.out.println();
			}
			apb1++;
		}
		System.out.println("\n");
		
//		1-3. do-while
		char apb2 = 'A';
		do {
			System.out.print(apb2);
			if (apb2%5==4) {
				System.out.println();
			}
			apb2++;
		} while (apb2<='Z');
	}

}
