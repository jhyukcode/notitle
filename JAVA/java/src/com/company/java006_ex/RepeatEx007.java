package com.company.java006_ex;

public class RepeatEx007 {
	public static void main (String[] args) {

//		for , while, do-while 1->5
		
//		1-1. for
		for (int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
//		1-2. while
		int i=1;
		while (i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
//		1-3. do-while
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		} while (i<=5);
		
		System.out.println();
		System.out.println();
		
//		2-1. for
		for(int j=5;j>=1;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
//		2-2. while
		int j=5;
		while (j>=1) {
			System.out.print(j+" ");
			j--;
		}
		System.out.println();
//		2-3. do-while
		j=5;
		do {
			System.out.print(j+" ");
			j--;
		} while (j>=1);
		
		System.out.println();
		System.out.println();
		
//		3-1. for
		for(int k=1;k<=3;k++) {
			System.out.print("JAVA"+k+" ");
		}
		System.out.println();
//		3-2. while 
		int k=1;
		while (k<=3) {
			System.out.print("JAVA"+k+" ");
			k++;
		}
		System.out.println();
//		3-3. do-while
		k=1;
		do {
			System.out.print("JAVA"+k+" ");
			k++;
		} while (k<=3);
	}
}
