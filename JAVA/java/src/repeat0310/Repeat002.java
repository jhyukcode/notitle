package repeat0310;

class A{
	int a;					// int < 인스턴스 변수 : heap - new 
	static String company;	// static String < 클래스 변수 : method - !new
	void method() {int a;}	// int << 지역변수 : stack 
//	오류가 발생하는 코드
//	static void Error(int z) {
//		this.a=z;
	}
public class Repeat002 {
	public static void main(String[] args) {

	}
}