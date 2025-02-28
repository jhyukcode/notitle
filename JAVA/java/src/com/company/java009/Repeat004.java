package com.company.java009;

public class Repeat004 {
	public static void main (String[] args) {
		
		char[] arr = new char[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= (char) ('a'+i);
			System.out.print(arr[i]+" ");
		}
		
	}
}
