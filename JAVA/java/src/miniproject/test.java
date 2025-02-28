package miniproject;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = ""; 
		
		for(int i=0;i<a.length();i++) {
		char temp = a.charAt(i);
		if ((temp>='a')&&(temp<='z')) {
			temp-=32;
		} else { temp +=32; }
		b += ""+temp; 
		}
		System.out.println(b);
	}
}
