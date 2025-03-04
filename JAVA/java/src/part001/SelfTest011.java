package part001;
import java.util.Scanner;

public class SelfTest011 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		for(;;)
		if ((num>100)||(num<1)) { 
			System.out.println("1-100 사이의 숫자를 입력해주세요");
			num=sc.nextInt();
			}
	}
}
