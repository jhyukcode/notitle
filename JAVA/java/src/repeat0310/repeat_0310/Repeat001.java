package repeat_0310;
class Coffee012 {
	String name; int price, num;
	public Coffee012 () {}
	public Coffee012 (String name, int num, int price) {
		this.name = name; this.num = num; this.price = price; }
	public void show() {
		System.out.println("< 주문 >");
		System.out.println("음료 : "+this.name);
		System.out.println("금액 : "+(this.num*this.price));
	}
}
public class Repeat001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("카페라떼", 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
	}
}