package com.company.boot003.board;

import java.util.List;

public interface BoardService {
	public List<Board> findAll(); 			// 전체리스트 뽑기
	
	public Board find(Long id);				// 조회수올리고 상세보기
	
	public void insert(Board board);		// 글쓰기 기능
	
	public Board update_view(Long id);		// 수정폼
	public void update(Board board);		// 수정기능
	
	public void delete(Board board);			// 삭제기능
}
