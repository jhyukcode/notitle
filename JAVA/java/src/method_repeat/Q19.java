package method_repeat;

public class Q19 {
	public static String avg (int a) {
		return String.format("%.2f", a/4f);
	}
	public static void main(String[] args) {
		String myavg = avg(299);
		System.out.println(myavg);
	}
}
