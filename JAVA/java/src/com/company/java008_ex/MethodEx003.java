package com.company.java008_ex;

public class MethodEx003 {
	
	public static int return_num() { return 1; }
	public static float return_float(double x, double y) { return (float)(x/y); }
	public static String my_color() { return "PURPLE"; }
	public static String jangsu() { return "★★★★★"; }
	public static int myadd(int x, int y) { return x+y; }
	public static String myban(char x) { 
		if (x=='A') { return "나는 노랑조"; } 
		else if (x=='B') { return "나는 주황조"; }
		return null;
	}
	public static String stdId(int x) { return "G"+x; }
	public static char stdAvg(int x) { 
		if (x>=90) { return 'A'; }
		else if (x>=80) { return 'B'; }
		else if (x>=70) { return 'C'; }
		else { return 'D'; }
		}

	public static void main(String[] args) {

//	System.out.println("1. 내가 좋아하는 숫자    :" + return_num());    // 1을 결과값으로 줌
//	System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  // 3.3333을 결과값으로 줌
//	System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
//	System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
//	System.out.println("5. 10+20= " + myadd(10,20));       // 두숫자를 더한값을 결과값으로 줌  
//	System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
//	System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
//	System.out.println("8.당신의 평균은?" + stdAvg(88));    90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D
		
		System.out.println("1. 내가 좋아하는 숫자 : "+return_num());
		System.out.println("2. 10/3.0을 실수로 표현 : "+return_float(10, 3.0));
		System.out.println("3. Best color : "+my_color());
		System.out.println("4. 장수돌침대 별이 : "+jangsu());
		System.out.println("5. 10 + 20 = "+myadd(10, 20));
		System.out.println("6. 반(노랑조/주황조) = "+myban('B'));
		System.out.println("7. 당신의 학번은 : "+stdId(1111));
		System.out.println("8. 당신의 평균은 : "+stdAvg(88));
		
//	출력결과 :
//	1. 내가 좋아하는 숫자    : 1
//	2. 10/3.0을 실수로 표현 : 3.3333
//	3. BEST COLOR        : PURPLE
//	4. 장수돌침대 별이       : ★★★★★
//	5. 10+20= 30
//	6. 반(노랑조/주황조)= 나는 노랑조
//	7. 당신의 학번은? G1111
//	8. 당신의 평균은? B

		
		
	}

}
