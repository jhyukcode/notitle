package repeat_0310;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Repeat009 {
	public static int nextInt() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return sc.nextInt();
	}
	public static void main(String[] args){
		int one = 0;
		while(true) { 
			try {
			one=nextInt(); 
			if(one==1) {break;} 
			} catch (Exception e) {
				System.out.println("오류발생");
			}
		}
		System.out.println("결과 : "+one);
	}
}