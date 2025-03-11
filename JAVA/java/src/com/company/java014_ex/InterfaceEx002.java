package com.company.java014_ex;

interface Board { 
	public void exec( ); 
	}
class BoardInsert implements Board{
	@Override public void exec() { System.out.println("게시판 삽입");}
}
class BoardDelete implements Board{
	@Override public void exec() { System.out.println("게시판 삭제");}
}
class BoardSelect implements Board{
	@Override public void exec() { System.out.println("게시판 선택");}
}
class BoardUpdate implements Board{
	@Override public void exec() { System.out.println("게시판 수정");}
}

public class InterfaceEx002{
	public static void main(String[] args) {
		Board board = null;
		board = new BoardInsert();board.exec();
		board = new BoardDelete();board.exec();
		board = new BoardSelect();board.exec();
		board = new BoardUpdate();board.exec();
	}
}
