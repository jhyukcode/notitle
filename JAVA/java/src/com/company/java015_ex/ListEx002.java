package com.company.java015_ex;
import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
	
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("ONE");
		numbers.add("TWO");
		numbers.add("THREE");
		Scanner sc = new Scanner(System.in);
		System.out.println("1-3 중 숫자 입력");
		int num = sc.nextInt();
		System.out.println(numbers.get(num-1));
//		for(int i=1;i<=num;i++) {
//			if(i==num) {
//				System.out.println(numbers.get(i-1));
//			}
	}
}