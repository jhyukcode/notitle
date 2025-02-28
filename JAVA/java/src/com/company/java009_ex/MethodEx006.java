package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx006 {
	
	public static void upper(char[] x) {
		for(int i=0;i<x.length;i++) {
				x[i]-=32;
			};}

	public static void main(String[] args) {

		char[] ch = {'a','b','c'};
		upper(ch);
		System.out.println("main. 배열값 : "+ Arrays.toString(ch));
		
//		public class MethodEx006{ 
//		    char[] ch = {'a','b','c'};
//		    upper(ch);     
//		    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
//		}

	}

}
