package com.company.java008_ex;

public class Repeat002 {

	public static void main(String[] args) {
		
		for (int i=100;i<=300;i+=100) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i = 100;
		while (i<=300) {
			System.out.print(i+" ");
			i += 100;
		}
		
		System.out.println();
		
		int j = 100;
		do {
			System.out.print(j+" ");
			j +=100;
		} while (j<=300);
			
		
	}

}
