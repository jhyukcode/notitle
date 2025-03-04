package part001;

public class SelfTest021 {
	public static void print(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void print(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		print(3,5);
		print(1.2,3.4);
	}
}
