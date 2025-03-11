package part001;
import java.util.Scanner;

public class SelfTest013 {
	public static void main(String[] args) {
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단(n*n)을 입력하세요");
		a=sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(a+"×"+i+"="+(a*i));
		}
		
	}
}
