package com.company.boot003.board;

import java.net.InetAddress;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired BoardRepository boardRepository;
	
	@Override
	public List<Board> findAll() { return boardRepository.findAll(); }

	@Transactional	// commit 반영 / rollback 되돌리기
	@Override
	public Board find(Long id) {
		Board board = boardRepository.findById(id).get();	// Optional
		board.setBhit(board.getBhit()+1);					// 조회수 +1
		boardRepository.save(board);
		return board;
	}

	@Override
	public void insert(Board board) {
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (Exception e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	@Override
	public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}

	@Override
	public void update(Board board) {
		boardRepository.save(board);
	}

	@Override
	public void delete(Board board) {
		boardRepository.delete(board);
	}

}
