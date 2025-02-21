package com.company.java005_ex;

public class ForEx003 {

	public static void main(String[] args) {
		
		int sum = 0;

		for (int i=1;i<=10;i++) {
			sum += i; 
		}
		System.out.println("1-10 까지의 합 : "+sum);
		
		for (int i=1;i<=10;i++) {
			System.out.print(i+(i==10? "":"+"));
		}
		System.out.print(" = "+sum);
	}

}
