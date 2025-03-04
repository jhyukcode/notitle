package com.company.java011;

public class Score2 {
	private String name;
	private int kor, eng, math;
	private double avg;
	private String pass;
	
	public Score2() {}
	public Score2(String a, int z, int x, int c) {
		super(); this.name=a; this.kor=z; this.eng=x; this.math=c; }
	
	public Score2(String a, int z, int x, int c, double i, String j) {
		super(); this.name=a; this.kor=z; this.eng=x; this.math=c; this.avg=i; this.pass=j;}
	
	@Override
	public String toString() {
		return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
}