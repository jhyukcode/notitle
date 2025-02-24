package com.company.java006;

import java.util.Scanner;

public class Repeat004 {

	public static void main(String[] args) {
		
		int x =0;
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.println("무한 반복");
			x=sc.nextInt();
			if(x==1) {
				break;
			}
			
		}
		
	}

}
