package part001;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
		int a=0, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		a=sc.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		b=sc.nextInt();
		if (a<40) { System.out.println("국어 과락입니다"); }
		if (b<40) { System.out.println("영어 과락입니다"); }

	}
}
