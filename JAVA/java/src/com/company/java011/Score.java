package com.company.java011;

public class Score {
	private String name;
	private int kor, eng, math, total;
	private double avg;
	private String  p, s, rank;
	
	public Score(){}
	
	public Score (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setName(String name) { this.name = name; }
	public void setKor(int kor) { this.kor = kor; }
	public void setEng(int eng) { this.eng = eng; }
	public void setMath(int math) { this.math = math; }
	
	void c() {
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3f;
		this.p=(avg<60)?"불합":"합격";
		this.s=(avg<95)?"--":"해당";
		this.rank="★".repeat((int)avg/10);
	}
	
	public static void info() {
		System.out.println("────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합불\t장학\t랭킹");
		System.out.println("────────────────────────────────────────────────────────────────────────────────────────");
	}
	public void show() {
		c();
		System.out.println(this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.total+"\t"+String.format("%.2f", this.avg)+"\t"+this.p+"\t"+this.s+"\t"+this.rank);
	}
}
