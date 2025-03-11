package com.company.java011;	// 1. java011 폴더
import com.company.java011_ex.Cat;

class Cat2 extends Cat{	// 2. extends Cat의 기능 사용(상속)
	public void show() {
		public_=10;
		protected_=20;	// extends 로 사용 가능 : 상속받은 자식만
//		package_=30;	같은 폴더에서 사용 가능 : The field Cat.package_ is not visible
//		private_=40;	Cat 클래스에서만 사용 가능 - getter/setter : The field Cat.package_ is not visible
		System.out.println(public_+"/"+protected_);
	}
}
public class Modifier2_protected {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.show();
		
		cat2.public_=100;	// 아무데서나 접근 가능
//		cat2.protected_=200;	// extends 키워드를 받은 적이 없음
	}
}