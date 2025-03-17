package com.company.java019;

import java.awt.Toolkit;

public class Thread001 {

	public static void main(String[] args) {
		System.out.println("001. Thread");
		// 1. 코어(일꾼 수)
		int core=Runtime.getRuntime().availableProcessors();
		System.out.println("1. core : "+core);
		
		// 2. 현재 스레드(실행 프로그램) 확인 : Thread 작업 수행 클래스
		Thread current = Thread.currentThread();
		System.out.println("2. 현재 스레드 이름 : "+current.getName());
		System.out.println("3. 활성화 스레드 수 : "+Thread.activeCount());
		
		// #1. ˙Ꙫ˙
		for(int i=0;i<5;i++) {
			System.out.println("˙Ꙫ˙");
			try {Thread.sleep(1000); } 
			catch(InterruptedException e) {e.printStackTrace();}
		}
		// #2. 비프음
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(1000); } 
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}
