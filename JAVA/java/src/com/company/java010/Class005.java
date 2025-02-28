package com.company.java010;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)	
//3. 생성자 호출 초기화
class TV { String channel; int volume;
//행위(멤버함수)
	TV() {}
//	기본 생성자
//채널, 볼륨 입력 : input() / 출력 : show()
	public TV(String channel, int volume) { super(); this.channel = channel; this.volume = volume; }
	void input() {
//	(String channel, int volume) {this.channel=channel; this.volume=volume;}
	Scanner sc = new Scanner(System.in);
	System.out.println("* channel : "); this.channel=sc.next();
	System.out.println("* volume : "); this.volume=sc.nextInt();
	}
	void show() {System.out.println(this.channel+"\t"+this.volume);}
}

public class Class005 {
	public static void main(String[] args) {
		
		TV a1 = new TV("JTBC", 55);
		a1.show();
		
		TV a2 = new TV();
		a2.input();
		a2.show();
	}
}

//─────────────────────────────────────────────runtime
//[method]		Product.class / Class004.class	#1
//─────────────────────────────────────────────
//[heap:동적]					| [stack:지역]
//24번줄 : 1번지{channel="JDBC",volume=55} ← a1 : 1번지
//25번줄 : a1.show > { 1번지의 channel, volume 출력 }

//29번줄 : 2번지{channel=null,volume=0} ← a2 : 2번지
//30번줄 : a2.input{2번지의 channel,volume 입력}
//31번줄 : a2.a1{2번지의 channel,volume 출력}
//								| main
//─────────────────────────────────────────────
