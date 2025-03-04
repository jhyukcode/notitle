package part001;

import java.util.Scanner;

public class SelfTest006 {
	public static void main(String[] args) {
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		c=sc.nextInt();
		if (c>=90) { System.out.println("수"); }
		else if (c>=80) { System.out.println("우"); }
		else if (c>=70) { System.out.println("미"); }
		else if (c>=60) { System.out.println("양"); }
		else { System.out.println("가"); }

	}
}
