package com.company.java019_ex;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

class QuestionCount extends Thread{
	@Override
	public void run() {	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=10;i>0;i--) {
			System.out.println(i);
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class ThreadEx001 {
	public static void main(String[] args) {
		Thread count = new Thread(new QuestionCount()); count.start();
		
		String answer = JOptionPane.showInputDialog("사과 알파벳 입력");
//		System.out.println(answer);
		if(answer.equals("apple")) {System.out.println("정답"); }
		else { System.out.println("오답"); }
	}
}
