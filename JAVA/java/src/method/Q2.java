package method;

public class Q2 {
	public static String hello(String a) { return a+"~ hello!"; }
	public static String hi(String a) { return a+"~ hi!"; }
	public static void main(String[] args) {
		System.out.println(hello("sally"));
		System.out.println(hi("alpha"));
		System.out.println(hello("abc"));
	}
}
