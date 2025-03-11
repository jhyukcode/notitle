package com.company.java015_ex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score{
	private String name;
	private int kor, eng, math;
	public Score() { super(); }
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eng, kor, math, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return eng == other.eng && kor == other.kor && math == other.math && Objects.equals(name, other.name);
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
}
public class SetEx004 {
	public static void main(String[] args) {
		Set<Score> scores = new HashSet<>();
		
		scores.add(new Score("아이언맨",30,40,50));
		scores.add(new Score("아이언맨",30,40,50));
		scores.add(new Score("아이언맨",30,40,50));
		scores.add(new Score("헐크",40,60,70));
		scores.add(new Score("캡틴",80,90,100));
		
		System.out.println(scores.size());
		
		Iterator<Score> iter = scores.iterator();
		while(iter.hasNext()) {
			Score u = iter.next();
			int total = u.getKor()+u.getEng()+u.getMath();
			double avg = total/3f;
			System.out.println(u.getName()+" "+u.getKor()+" "+u.getEng()+" "+u.getMath()+" "+total+" "+String.format("%.2f",avg));
			
		}
	}
}
