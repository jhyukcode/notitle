package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	
	public static int process_total(int x,int y,int z) { return x+y+z;  }
	public static float process_avg(int x) { return x/3f; }
	public static String process_pass(float x, int a,int b,int c) { return (x<60)?"불합격":(a<40)||(b<40)||(c<40)?"재시험":"합격";  }
	public static String process_scholar(float x) { return  (x>=95)?"해당":"미해당"; }
	public static String process_star(float x) {
		int a = (int)(x/10); String b =""; for(int i=0;i<a;i++) { b += "★"; } return b; }
	
	public static void process_show(String name,int kor,int eng,int math,int total,float avg,String pass,String scholar,String star) {
		System.out.println("───────────────────────────────────────────────────────────────────────────────────");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f", avg)+"\t"+pass+"\t"+scholar+"\t"+star);
		System.out.println("─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─");
		;}
	
//	name, kor, eng, math, total, avg, pass, scholar, star

	public static void main(String[] args) {
//		변수
		int kor, eng, math, total;
		float avg = 0.0f; 
		String name ="", pass = "", scholar = "", star = "";
		Scanner sc = new Scanner(System.in);
//		입력
		System.out.println("이름을 입력해주세요");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
//		총점 처리
		total = process_total(kor, eng, math);
//		평균 처리
		avg = process_avg(total);
//		합/불 처리
		pass = process_pass(avg, kor, eng ,math);
//		장학생 선정
		scholar = process_scholar(avg);
//		별점 처리
		star = process_star(avg);
//		출력
		process_show(name, kor, eng, math, total, avg, pass, scholar, star);
      


//      (1)  변수
//      String name  = ""; 
//      int kor, eng, math, total ;
//      float avg = 0.0f; 
//      String pass = "";
//      String jang = "";
//      String star= ""; 
//      String level_kor="" , level_eng="" , level_math="";
//      String re = "";
//      Scanner scanner = new Scanner(System.in);
    
//      (2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
   
//      (3) 처리 : 
//      total = process_total(kor , eng, math);    // 1. 총점처리
   
//      avg = process_avg(total);    //2.  평균처리
  
//      3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
//      pass = process_pass(avg , kor, eng, math);  
   
//      4. 평균이 95점이상이면 장학생
//      jang = process_scholar(  avg  ); 
      
//      5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
//      star = process_star(avg);  
      
//      (4) 출력
//      process_show(name, kor, eng, math, total, avg, pass, jang, star);

//      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//      이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
//      --------------------------------------------------------------------------------------------
//      아이언맨   100   100   100   300    100.0    합격      장학생   **********
//      --------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
	}

}
