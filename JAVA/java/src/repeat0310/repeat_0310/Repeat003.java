package repeat_0310;

class Sawon005{
	int pay=10000;
	static int su=10;
//	static int basicpay=pay;
	static int basicpay2;
	static { basicpay2=20000; }
	public static void showSu() {
		System.out.println(su);
	}
	public static void showPay() {
//		System.out.println(this.pay);
	}
}
//	heap area에 생성되는 인스턴스 변수는 method area에 생성되는
//	클래스 변수에 값을 할당하거나 클래스 메서드에서 호출할 수 없다
public class Repeat003 {
	public static void main(String[] args) {

	}
}
