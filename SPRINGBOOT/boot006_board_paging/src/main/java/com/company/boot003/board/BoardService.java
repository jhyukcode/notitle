package com.company.boot003.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.company.boot003.member.Member;

@Service
public class BoardService {

	@Autowired  BoardRepository  boardRepository; //##
	
	public Page<Board> getPaging(int page) {
		List<Sort.Order> sorts = new ArrayList<>();
		sorts.add(Sort.Order.desc("id"));
		
		PageRequest pageable = PageRequest.of(page, 10, Sort.by(sorts));
		return boardRepository.findAll(pageable);
	}
	
	 
	public List<Board> findAll() {//##전체리스트뽑고
		//return boardRepository.findAll();
		return   boardRepository.findAllByOrderByDesc();
	}
 
	@Transactional  // commit (반영) / rollback (되돌리기)
	public Board find(Long id) {//##조회수올리고 / 상세보기기능 
		Board board = boardRepository.findById(id).get();
		
		board.setBhit(board.getBhit()+1);   // 기존조회수 + 1
		boardRepository.save(board);
		return board;
	}

	public void insert(Board board , Long member_id) {
		Member member = new Member();  member.setId(member_id);  // 
		board.setMember(member);  
		
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}

	public int update(Board board) {
		return boardRepository.updateByIdAndBpass( 
					board.getId(), board.getBpass(), 
					board.getBtitle(), board.getBcontent()
			   );
	}

	public int delete(Board board) {
		//boardRepository.delete(board);   기본 : delete from board  where id=?
		return boardRepository.deleteByIdAndBpass(board.getId(), board.getBpass());
	}

}
