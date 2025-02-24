package com.company.java007;

public class Repeat003 {

	public static void main(String[] args) {

		for (int i=10;i<=30;i+=10) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int i=10;
		while (i<=30) {
			System.out.print(i+" ");
			i+=10;
		}
		System.out.println();
		
		int j=10;
		do {
			System.out.print(j+" ");
			j+=10;
		} while (j<=30);
	}

}
