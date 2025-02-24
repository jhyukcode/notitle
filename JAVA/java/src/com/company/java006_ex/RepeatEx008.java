package com.company.java006_ex;

public class RepeatEx008 {

	public static void main(String[] args) {
//		1-10 까지 3의 배수의 합 
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
//		1-1. for
		for (int i=1; i<=10; i++) {
			if (i%3==0) {
				sum1+=i;
			}
		}
		System.out.println("for : "+sum1);
		System.out.println();
		
//		1-2. while
		int i=1;
		while (i<=10) {
			if (i%3==0) {
				sum2+=i;
			}
			i++;
		}
		System.out.println("while : "+sum2);
		System.out.println();
		
//		1-3. do-while
		i=1;
		do {
			if (i%3==0) {
				sum3+=i;
			}
			i++;
		} while (i<=10);
		System.out.println("do-while : "+sum3);
	}

}
