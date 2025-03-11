package com.company.java011_ex;
import com.company.java011.Score;

public class ModifierEx002 {
	public static void main(String[] args) {	
		
		Score iron = new Score();
		iron.setName("iron");
		iron.setKor(100);
		iron.setEng(100);
		iron.setMath(100);
		
		
		Score hulk = new Score("hulk" , 20,50,30);
		
		Score.info();
		iron.show();
		hulk.show();
		
		
	}

}
