package com.company.java010_ex;

//	상태(멤버변수)
class Score{
	String stdId;
	int kor, eng, math, total;
	double avg;
//	행위(멤버함수)
//	생성자
	public Score(String stdId, int kor, int eng, int math) {
		super(); this.stdId = stdId; this.kor = kor; this.eng = eng; this.math = math; }
//	메서드
	void total() {this.total=this.kor+this.eng+this.math;}
	void avg() {this.avg=this.total/3f;}
	void info() {
		total();
		avg();
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(this.stdId+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.total+"\t"+String.format("%.2f", this.avg));;}
}
public class ClassEx006 {
	public static void main(String[] args) {
		Score score = new Score("AA", 90, 60, 70);
		score.info();
	}
}
