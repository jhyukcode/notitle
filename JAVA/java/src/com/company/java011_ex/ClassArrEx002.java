package com.company.java011_ex;
import com.company.java011.Score2;
import com.company.java011.Score2Print;
import com.company.java011.Score2Process;

public class ClassArrEx002 extends Score2 {
	public static void main(String[] args) {
		////// MODEL
		Score2[] std = new Score2[3];
		for(int i=0;i<std.length;i++) { std[i] = new Score2(); }
		std[0] = new Score2("아이언맨",100,100,100);
		std[1] = new Score2("헐크",90,60,80);
		std[2] = new Score2("블랙팬서",20,60,90);
		
		////// CONTROLLER - 처리 해결사 Controller)
		///리턴값 메서드명(파라미터){}
		Score2Process process = new Score2Process();
		process.process_avg(std);	// void process_avg(Score2[] std) {평균구하기}
		process.process_pass(std);	// void process_pass(Score2[] std) {합불여부구하기}
		
		////// VIEW       - CONSOLE , WEB
		Score2Print print = new Score2Print();
		print.show(std);	// void show(Score2[] std){출력}
	}
}