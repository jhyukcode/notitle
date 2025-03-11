package com.company.java010_ex;

import java.util.Scanner;

class Calc {
	static String name ="**Caculator**";
	int num1, num2; char op; double result;
//		기본 생성자
	public Calc() {}
//		생성자
	public Calc(int num1, int num2, char op) {
		super(); this.num1 = num1; this.num2 = num2; this.op = op;
		opcalc();
	}
	void opcalc() {
		switch (op) {
		case'+': this.result=num1+num2; break;
		case'-': this.result=num1-num2; break;
		case'/': this.result=num1/(float)num2; break;
		case'*': this.result=num1*num2;
		} ;}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 >"); num1=sc.nextInt();
		System.out.print("숫자2 >"); num2=sc.nextInt();
		System.out.print("연산자 >"); op=sc.next().charAt(0);
		opcalc();
		;}
	void show() {
		System.out.print(num1+""+op+""+num2+"="+ 
		( op=='/' ? String.format("%.2f", result) : (""+(int)result))+"\n");
//		if (this.op=='/') { System.out.print(String.format("%.2f", result)+"\n");}
//		else {System.out.print(String.format("%.0f", result)+"\n");}
		}
	}
public class ClassEx007 {
	public static void main(String[] args) {
		System.out.println(Calc.name);
		Calc c1 = new Calc(10,3,'+');
		c1.show();
		
		Calc c2 = new Calc();
		c2.input();
		c2.show();
	}
}
