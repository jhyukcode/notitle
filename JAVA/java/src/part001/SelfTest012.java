package part001;
import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1-100 사이 숫자를 입력하세요");
			num=sc.nextInt();
			if((num<=100)&&(num>=1)) {
				break;
			}
		}
	}
}
