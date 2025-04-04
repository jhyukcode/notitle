package com.company.service;
import java.util.List;

import com.company.dto.BoardDto;
 
public interface BoardService {
	public int   insert(BoardDto dto);  // 글쓰기 기능
	
	public int   update(BoardDto dto);  // 수정기능
	public BoardDto   updateForm(int bno);   // 해방번호 글 수정 폼
	
	public int       delete(BoardDto dto);  // 글 삭제
	
	public BoardDto  detail(int bno); // 상세보기 (조회수 올리기 + 해당 글 번호 가져오기)
	public List<BoardDto>  selectAll();  // 리스트
}
