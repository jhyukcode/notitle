package com.company.java011_ex;

class User002 {
	   final String nation = "Korea";   
	   final String jumin;   
	   String name;

	public User002() { jumin="00000"; }
	   public User002(String jumin, String name) {
	      this.jumin = jumin;
	      this.name = name;
	   }
	   @Override public String toString() { return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]"; }
	}
public class FinalEx001 {
	public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
//	      user1.nation = "USA";      			─┬─ cannot be assigned
//	      user1.jumin  = "123123-1234321";		─┘
	      user1.name = "IU"; 
	      System.out.println(user1);   
	      }
	}
// 다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
//초기화 순서 :		기본값		명시적초기화		초기화블록		생성자 
//fianl nation		null		Korea			X			X
//fianl jumin		null		X				X			00000
//name				null		X				X			.연산자이용, 수정가능

/******	(1)
──────────────────────────────────
[method:정보, 공유] User002.class, FinalEx.class{nation, jumin} ##1
──────────────────────────────────
[heap:동적]						| [stack:임시]
1번지 : {nation, jumin, name}
								| main ##2
──────────────────────────────────
******/