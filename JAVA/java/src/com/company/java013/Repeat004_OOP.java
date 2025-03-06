package com.company.java013;

class A{
	private String name;
	public A() { super(); }
	@Override public String toString() { return "A [name=" + name + "]"; }
}
public class Repeat004_OOP {
	public static void main(String[] args) {
		A[] arr = new A[3];
		arr[0] = new A(); arr[1] = new A(); arr[2] = new A();
//		[!] 생성자를 호출하여 인스턴스 변수를 사용 가능하게 만들어야 함
//		for(int i=0; i<arr.length;i++) { System.out.println(arr[i]); }
		for(A a:arr) {System.out.println(a);}
	}
}
/*
Q12-13. 다음의 결과가 나오도록 코드 작성

Q14. 오버라이딩
*/