package com.company.boot003.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller @RequiredArgsConstructor
public class BoardController {
	
	// v1. @Autowired BoardService service;
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model) { 
		model.addAttribute("list", service.findAll());
		// 전체리스트 뽑기
		return "board/list";// board 폴더안에 / list 파일
	}
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model) {
		model.addAttribute("dto", service.find(id));
		// 조회수 올리고 상세보기 기능
		return "board/detail";// board 폴더안에 / list 파일
	}
	
	@GetMapping("board/insert")
	public String insert_get() { 
		return "board/write";// board 폴더안에
		// 글쓰기폼
	}	// http://localhost:8383/board/insert
	
	@PostMapping("board/insert")
	public String insert_post(Board board, @RequestParam Long member_id) { 
		
		service.insert(board); 
		return "redirect:/board/list";
		// 글쓰기 기능 - 갱신된 리스트
	}
	
	@GetMapping("board/update/{id}")
	public String update_get (@PathVariable Long id, Model model) { 
		model.addAttribute("dto", service.find(id));
		return "board/update";
		// 수정폼
	}
	
	@PostMapping("board/update/{id}")
	public String update_post (Board board) {
		// 수정기능
		return "redirect:/board/list";
		// 수정 기능 - 갱신된 리스트
	}
	
	@GetMapping("board/delete")
	public String delete_get() {
		return "board/delete";
	}	// 삭제폼
	
	@PostMapping("board/delete/{id}")
	public String delete_post(Board board) {
		return "redirect:/board/list";
	}	// 삭제기능
}

/*
	 Restful Api
	 	기존게시판 : localhost:8080/board/detail?bno=10
	 	Restful	: localhost:8080/board/detail/bno/10
	 	1) resultful - http url을 기반으로 접근해서 서비스를 제공하는 애플리케이션
	 	2) api
	 	3) method ( GET 검색 / POST 생성 / PAETCH(PUT) 부분(전체) 업데이트 / DELETE 삭제 )
	 	4) DATA  - json, xml
 */