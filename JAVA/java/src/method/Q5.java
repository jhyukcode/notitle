package method;

public class Q5 {
	public static void show (int a, char b) {
		for(int i=0;i<a;i++) {
			System.out.print(b);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(7,'*');
		show(3,'♥');
	}
}
