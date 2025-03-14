package com.company.java019;

import java.awt.Toolkit;

class Animals{
	
}

class DogSound extends Animals implements Runnable{  
	@Override
	public void run() {	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			System.out.println("왈");
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class Thread003_Runnable {
	public static void main(String[] args) {
		
			Thread sound = new Thread(new DogSound()); sound.start();
			
			Thread count = new Thread(new Runnable() {
				@Override 
				public void run() {
					for(int i=1;i<=5;i++) {
						System.out.println(i+"마리 ");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
					} 
				} 
			} ); count.start();
			for(int i=0;i<5;i++) {
				System.out.println("dog");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
}