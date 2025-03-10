package com.company.java015_ex;

import java.util.HashSet;
import java.util.Set;

public class SetEx003 {
	public static void main(String[] args) {
		Set<Integer> lottery = new HashSet<>();
		
			for(;;) {
				if(lottery.size()==6) { break; }
				lottery.add((int) (Math.random()*45)+1);
			}
			System.out.println(lottery);
		}
	}