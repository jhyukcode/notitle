package method;

public class Q4 {
	public static void sum (int a, int b) {
		int sum = 0;
		for(;a<=b;a++) {
			System.out.print(a+"+");
			sum += a;
		}
		System.out.println("\b="+(sum));
	}
	public static void main(String[] args) {
		sum(1,3);
		sum(1,4);
	}
}
