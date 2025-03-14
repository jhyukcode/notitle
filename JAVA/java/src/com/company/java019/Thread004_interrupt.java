package com.company.java019;

import java.util.Scanner;

class Count extends Thread{
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {break;}
		}
	}
}

public class Thread004_interrupt {
	public static void main(String[] args) {
	Thread count = new Count(); count.start();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Count STOP (Y/N)");
	if(sc.next().equals("Y")) {
		System.out.println("STOP");
		count.interrupt();
		}
	System.out.println("> main end");
	}
}
