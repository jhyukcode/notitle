package com.company.java013_ex;

abstract class Score{
	private String name;
	private int kor, eng, math; 
	private int total; 
	private double avg;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
}
class ScoreDto extends Score{
	public ScoreDto(String name, int kor, int eng, int math) {
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
	}
	private String sch;
	private String str;
	private String pas;
	public String getSch() { return sch; }
	public void setSch(String sch) { this.sch = sch; }
	public String getStr() { return str; }
	public void setStr(String str) { this.str = str; }
	public String getPas() { return pas; }
	public void setPas(String pas) { this.pas = pas; }
}
abstract class Process{
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double Avg);
}
class Total extends Process{
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return total; }
	@Override String exec(double Avg) { return null; }
}
class Avg extends Process{
	@Override double exec(int kor, int eng, int math) { return kor+eng+math;}
	@Override double exec(int total) {  return total; }
	@Override String exec(double Avg) { return null; }
}
class Sch extends Process{
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return total; }
	@Override String exec(double Avg) { return null; }
}
class Str extends Process{
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return total; }
	@Override String exec(double Avg) { return null; }
}
class Pas extends Process{
	@Override double exec(int kor, int eng, int math) { return kor+eng+math; }
	@Override double exec(int total) { return total; }
	@Override String exec(double Avg) { return null; }
}
abstract class Print{
	abstract void show(ScoreDto std);
	abstract void show(ScoreDto[] std);
}
class StdPrint extends Print{
	@Override void show(ScoreDto std) { System.out.println(std.getName()+std.getKor()+std.getEng()+std.getMath()+std.getTotal()+std.getAvg()+std.getPas()+std.getSch()+std.getStr()); }
	@Override void show(ScoreDto[] std) {  } 
}

public class AbstractEx001 {
	public static void main(String[] args) {
		ScoreDto std = new ScoreDto("헐크",100,100,99);
		Process process = null;
		
		Print print = null;
		print = new StdPrint();
		print.show(std);

	}
}
