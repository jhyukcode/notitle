package com.company.java011;	// 1. java001 폴더

import com.company.java011_ex.Cat;

public class Modifier1_public {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.public_=10;
//		cat.protectd_	: The field Cat.protectd_ is not visible
//		cat.package_	: The field Cat.package_ is not visible
//		cat.private_	: The field Cat.private_ is not visible
		cat.setPrivate_(10);
		System.out.println(cat.public_+"/"+cat.getPrivate_());
		// private 는 getter + setter 이용
	}
}
