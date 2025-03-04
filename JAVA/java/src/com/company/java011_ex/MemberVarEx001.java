package com.company.java011_ex;

class Sawon3{
//	상태(멤버변수)
	int pay=10000;			// 인스턴스 변수 heap - new - this, 생성자
    static int su=10;		// 클래스 변수 method - !new - 공유
//  static int basicpay=pay;// 클래스 변수 < 클래스 변수, 클래스 메서드 - this, 인스턴스 사용 불가
    static int basicpay2;	// 클래스 변수 
//  행위(멤버함수)
    public static void showSu() {   System.out.println(su);  }			// 클래스 함수
//  public static void showPay() {   System.out.println(this.pay);  }	// 클래스 함수
  
    public void showAll001() {				// 인스턴스 함수 - heap - new - this, 생성자
       System.out.println(su);  
       System.out.println(this.pay);  
    } 
//    public static void showAll002() {   	// 클래스 함수 - method - !new - 공유
//    	showAll001();    					// 인스턴스 사용 불가 - heap - new - this,  생성자
//    	System.out.println(this.pay);		// 
    } 
public class MemberVarEx001{
  public static void main(String[] args) {	// 지역변수 args
   Sawon3   sola = new Sawon3();  			// 지역변수 sola
   sola.showAll001();
  }
}


/**
1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
2. 인스턴스메서드, 클래스메서드 구분하시오.
3. 오류나는 이유는?
**/