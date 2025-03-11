package com.company.java011;

public class Score2Process {
	public void process_avg(Score2[] std) {	// 주소 따라가서 데이터 수정하겠습니다
//		System.out.println("process_avg 주소 확인 "+System.identityHashCode(std));
		for(int i=0; i<std.length;i++) {
		 std[i].setAvg( ( std[i].getKor() + std[i].getEng() + std[i].getMath() ) / 3f ) ; 
		 }
	}
	public void process_pass(Score2[] std) {
		for(int i=0; i<std.length;i++) {
			std[i].setPass(std[i].getAvg()>=60?"합격":"불합격");
		}
	}
}