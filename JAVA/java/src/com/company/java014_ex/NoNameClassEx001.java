package com.company.java014_ex;

interface Calc{
	public double exec(double a, double b);
}

public class NoNameClassEx001 {
	public static void main(String[] args) {
		Calc calc = new Calc() {
			@Override public double exec(double a, double b) { return a+b; }};
				
		System.out.println(calc.exec(10,3));
	}

}
