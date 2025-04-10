package com.company.boot003;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.board.Board;
import com.company.boot003.board.BoardRepository;
import com.company.boot003.member.Member;

@SpringBootTest
public class Test_Board {

	@Autowired BoardRepository boardRepository;
	
	@Disabled void insert() throws UnknownHostException {
		Board board = new Board();
		board.setBtitle("[README] NOTICE");
		board.setBcontent("GUIDE");
		board.setBfile(null);
		board.setBpass("admin");
		board.setBip(InetAddress.getLocalHost().getHostAddress());
		Member member = new Member(); member.setId(1L);
		board.setMember(member);
		boardRepository.save(board);
		
	}
	@Disabled void selectAll() {
		List<Board> list = boardRepository.findAll();
		for(Board b:list) {
			System.out.println(b);
		}
	}
	
	@Disabled void selectOne()  {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board);
		} else { System.out.println("Not found"); }
	}
	
	@Test void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("OLD NOTICE");
			board.setBcontent("OLD GUIDE");
			board.setBfile("NEW FILE");
			board.setBhit(board.getBhit()+1);
			boardRepository.save(board);
			System.out.println("Updated");
		} else { System.out.println("Not found"); }
	}
	
	@Disabled void delete() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
			System.out.println("Deleted");
		} else { System.out.println("Not found"); }
	} 
		
}
// insert into board (bcontent, bfile, bip, bpass, btitle, member_id, bip, create_date) values (?, ?, ?, ?, ?, ?, ?, ?)