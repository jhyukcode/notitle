package com.company.java011_ex;
import com.company.java011.Milk;

public class ModifierEx001 extends Milk {
	public static void main(String[] args) {
		Milk m1 = new Milk();
		System.out.println(m1);
		m1.setPrice(2000);
		System.out.println(m1);
	}
	
}

