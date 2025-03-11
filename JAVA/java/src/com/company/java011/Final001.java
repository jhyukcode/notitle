package com.company.java011;
// final : 변경할 수 없는 값
// 부품객체 ( 멤버변수 + 멤버함수 )
// 상속:X 상수 Override:X
class FinalEx /**extends Object**/{		// 1. Object - 자바팀이 객체틀을 만들어놓음 > 2. extends 상속(앞에 객체 그대로 사용)
	final static String tree = "4-5";	// 식목일 - 나무심는날 기념일
										// static, final 주로 같이 사용됨
	String name;
	
	final void show() { System.out.println(FinalEx.tree+"/"+name); }
}
class anniversay extends FinalEx {		// final 클래스를 상속받을 수 없음
//	@Override void show() { super.show(); }		// 오버라이드
}

public class Final001 {
	public static void main(String[] args) {
//		FinalEx.tree="4-6";	// static 공용 > 아래에서 변경 가능
							// final 기입 시 오류 발생 ( cannot be assigned )
		System.out.println("식목일 - 나무 심는 날, 기념일 > "+FinalEx.tree);
	}
}
