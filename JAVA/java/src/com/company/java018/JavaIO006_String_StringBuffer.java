package com.company.java018;

public class JavaIO006_String_StringBuffer {
	public static void main(String[] args) {
		
		// 1. String 문자열 누적
		String str = "ABC";
		System.out.println("str > "+System.identityHashCode(str));
		str +="D";
		System.out.println("str > "+System.identityHashCode(str));
		
		// 2. StringBuffer 문자열 누적
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");
		System.out.println("sb > "+System.identityHashCode(sb));
		sb.append("D");
		System.out.println("sb > "+System.identityHashCode(sb));
		
		
	}
}
