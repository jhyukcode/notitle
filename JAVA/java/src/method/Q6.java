package method;

public class Q6 {
	public static int abs (int a) {
		if(a<0) {
			a*=-1;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(abs(-3));
	}
}
