package com.company.java010_ex;

class Card {
	int cardNum;
	boolean isMemership;
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMemership=" + isMemership + "]"; }
	public Card() { super(); }	// 1. 생성자 오버 로딩 시 컴파일러가 기본 생성자 자동 생성 취소 
	public Card(int cardNum, boolean isMemership) {
		super(); this.cardNum = cardNum; this.isMemership = isMemership; }
	
}
public class ClassEX005 {

	public static void main(String[] args) {
		   Card  c1 = new Card(); 
		   System.out.println(c1);	// Card [cardNum=0, isMemership=false]
		   
		   Card c2 = new Card(3, false);
		   System.out.println(c2);	// Card [cardNum=3, isMemership=false]
		   
		   Card c3 = new Card(1, true);
		   System.out.println(c3);
	}

}
