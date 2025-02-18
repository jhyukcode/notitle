package com.company.java002;

public class Print001 {

	public static void main(String[] args) {
		//1. System.out.println();
		System.out.println("1. 자동 줄바꿈");
		
		//2. System.out.print();
		System.out.print("2. 자동 줄바꿈 안함 print");
		System.out.print("- 자동 줄바꿈은 println 사용해야함.");
		
		//3. System.out.printf(); %d 1,2 %f .123, %s "abc"
		System.out.printf("\n3. 정수 %d, 실수 %f, 문자열 %s", 1, 3.14, "string\n");
		
		//4. +의 의미
		System.out.println(10+3);
		System.out.println(10+3+"+"+1+2); // 수+수+문+수+수
		System.out.println("1+2="+3);
		
	}	// end main

}	//end class

/* end.company.java002
 * 
 * 
*/
