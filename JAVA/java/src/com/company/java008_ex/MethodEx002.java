package com.company.java008_ex;

public class MethodEx002 {
	
	public static void test1(int x) {System.out.println(x);};
	public static void test2(double x) {System.out.println(x);};
	public static void hap(int x, int y) {
			int sum = 0;
			for (int i=x;i<=y;i++) { sum += i; };
			System.out.println(sum); };
	public static void disp(int x, char y) {
		for (int i=0;i<x;i++) {
			System.out.print(y); } };

	public static void main(String[] args) {

		test1(10);
		test2(1.2);
		hap(3, 5);
		disp(7, '*');
		
	}

}
