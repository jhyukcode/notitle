package com.company.java015_ex;

import java.util.HashSet;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		
		System.out.println(colors);
		System.out.println(colors.size());
		
		
	}
}
