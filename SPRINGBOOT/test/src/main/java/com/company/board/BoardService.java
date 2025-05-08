package com.company.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired  BoardRepository bR;
	
	public List<Board> selectAsc() {
		return bR.selectAsc(); }
	
	public List<Board> selectDesc() {
		return bR.selectDesc(); }
	
	public void insert(Board board) {
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		bR.save(board);
	}
	
	public Board select(Long id) {
		Board board = bR.findById(id).get();
		board.setBhit(board.getBhit()+1);
		bR.save(board);
		return board;
	}
	
	public void update(Long id, String bpass, String btitle, String bcontent) {
		if (!bR.findOne(id, bpass).isEmpty()) {
			bR.updateTitleContent(btitle, bcontent, id); }
	}

	public void delete(Long id, String bpass) {
		if (!bR.findOne(id, bpass).isEmpty()) {
			bR.deleteById(id); }
	}
}
