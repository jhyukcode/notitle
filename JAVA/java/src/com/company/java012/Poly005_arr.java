package com.company.java012;

//	Object
//	 ↑
//	Calc (exec)
//	 ├─────┬──────┬───────┐
//	Plus Minus Multiply Divide
class Calc 					{void exec(double a, double b) {System.out.println();}}
class Plus extends Calc 	{void exec(double a, double b) {System.out.println(a+b);}}
class Minus extends Calc 	{void exec(double a, double b) {System.out.println(a-b);}}
class Multiply extends Calc {void exec(double a, double b) {System.out.println(a*b);}}
class Divide extends Calc 	{void exec(double a, double b) {System.out.println(String.format("%.2f",a/b));}}


public class Poly005_arr {
	public static void main(String[] args) {
		Calc[] mycalc = { new Plus(), new Minus(), new Multiply(), new Divide() };
//		부모 = 자식 / 업캐스팅 / 타입캐스팅 불필요
		mycalc[0].exec(10, 3);	// 더하기
//		mycalc[0] : { 10, 3, [(a+b) } - { 10, 3], () } 
		mycalc[1].exec(10, 3);	// 빼기
		mycalc[2].exec(10, 3);	// 곱하기
		mycalc[3].exec(10, 3);	// 나누기
	}
}
