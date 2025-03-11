package method_repeat;

public class Q15 {
	public static char trans (char a) {
		return (char)(((int)a>=97)?(int)a-32:(int)a+32);
	}
	public static void main(String[] args) {
		System.out.println(trans('a'));
		System.out.println(trans('A'));
	}
}
