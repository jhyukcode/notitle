package com.company.java019;

import java.awt.Toolkit;

//	1. 프로세스 : 실행 중인 프로그램
//	2. 자원 + 스레드 (작업수행)
// 	3. 작업수행클래스 : (1) 상속, Runnable, (2) run() 해야할 일, (3) start() 실행  
class PigSound extends Thread{  // #1. 상속 스레드(작업수행클래스)
	@Override
	public void run() {	// #2. run 해야할 일
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
class PigCount extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(i+"마리");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class Thread002 {
	public static void main(String[] args) { // 1개의 스레드
		// 여러가지 일을 동시에
		// ˙Ꙫ˙ 5번
//		#3. 작업스레드 
		Thread sound = new PigSound(); sound.start();
		Thread count = new PigCount(); count.start();
		for(int i=0;i<5;i++) {
			System.out.println("˙Ꙫ˙");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
