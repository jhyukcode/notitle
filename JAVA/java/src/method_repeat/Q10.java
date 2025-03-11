package method_repeat;

public class Q10 {
	public static String divide (int a, int b) {
		double z;
		z = a/(double)b;
		return String.format("%.2f", z);
		
	}
	public static void main(String[] args) {
		System.out.println(divide(10,3));
	}
}
