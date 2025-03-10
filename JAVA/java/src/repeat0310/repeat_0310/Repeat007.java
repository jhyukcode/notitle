package repeat_0310;

class Papa extends Object{
	int money = 10000;
	public Papa() {super();}
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son2 extends Papa{
	int money=1500;
	public Son2() {super();}
	@Override public void sing() { System.out.println("빅뱅-거짓말");}
}

public class Repeat007 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		System.out.println(mypapa.money);	// 예상 결과값 : 10000
		mypapa.sing();	// 예상 결과값 : 빅뱅-거짓말
//		1500이 출력되는 코드 작성
		System.out.println(((Son2)mypapa).money);
	}
}
