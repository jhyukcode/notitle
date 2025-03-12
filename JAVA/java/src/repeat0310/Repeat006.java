package repeat0310;
	
//	Q1. 클래스를 상속하는 이유
//	A1. 코드의 재사용성을 높이기 위함

//	Q2. 상속의 형식 작성
//	A2. class 'sub' extends 'super'

//	Q3. 다음 코드의 공백을 채우고 결과 작성

class A1 extends Object {
	int a;
	public A1() { super(); }
	public A1(int a) { super(); this.a=a; }
}
class B1 extends A1 {
	int b;
	public B1 () { super(); }
	public B1 (int b) { this.b=b; }
	public B1 (int a, int b) { super(a); this.b=b; }
}
class C1 extends B1 {
	int c;
	public void showC() {
		System.out.println("상속받은 A클래스의 a : "+a);
		System.out.println("상속받은 B클래스의 a : "+b);
		System.out.println("자신의 멤버 C클래스의 a : "+c);
	}
}
public class Repeat006 {
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a=10;myc.b=20;myc.c=30;myc.showC();
	}
}
